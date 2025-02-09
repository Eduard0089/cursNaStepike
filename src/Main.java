public static class UntrustworthyMailWorker implements MailService{

    private final MailService [] mailServices;
    private final RealMailService realMailService = new RealMailService();

    public UntrustworthyMailWorker(MailService[] mailServices) {
        this.mailServices = mailServices;
    }

    public RealMailService getRealMailService() {
        return realMailService;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        Sendable processedMail = mail;
        for (MailService service: mailServices) {
            processedMail = service.processMail(processedMail);
        }
        return realMailService.processMail(processedMail);
    }
}
public static class Spy implements MailService {
    private final Logger LOGGER;

    public Spy(Logger LOGGER) {
        this.LOGGER = LOGGER;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage){
            MailMessage message = (MailMessage) mail;
            if (message.getFrom().equals(AUSTIN_POWERS)||message.getTo().equals(AUSTIN_POWERS)){
                LOGGER.warning("Detected target mail correspondence: from " + message.getFrom() + " to " + message.getTo() + " \"" + message.getMessage() + "\"");
            } else {
                LOGGER.info("Usual correspondence: from " + message.getFrom() + " to " + message.getTo());
            }
        }

        return mail;
    }
}

public static class Thief implements MailService{

    private int minPrice;
    private int stolenValue = 0;

    public Thief(int minPrice){
        this.minPrice = minPrice;
    }

    public int getStolenValue() {
        return stolenValue;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage){
            MailPackage mailPackage = (MailPackage) mail;
            if (mailPackage.getContent().getPrice()>=minPrice){
                stolenValue += mailPackage.getContent().getPrice();
                return new MailPackage(mailPackage.getFrom(), mailPackage.getTo(), new Package("stones instead of " + mailPackage.getContent().getContent(), 0));
            }
        }
        return mail;
    }
}

public static class Inspector implements MailService {
    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            MailPackage mailPackage = (MailPackage) mail;
            String content = mailPackage.getContent().getContent();
            if (content.contains(WEAPONS) || content.contains(BANNED_SUBSTANCE)) {
                throw new IllegalPackageException();
            }
            if (content.contains("stones")) {
                throw new StolenPackageException();
            }
        }
        return mail;
    }
}

public static class IllegalPackageException extends RuntimeException {
    public IllegalPackageException() {
        super("Illegal package detected!");
    }
}

public static class StolenPackageException extends RuntimeException {
    public StolenPackageException() {
        super("Stolen package detected!");
    }
}
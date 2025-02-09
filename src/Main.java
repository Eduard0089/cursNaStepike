private static void configureLogging() {
    Logger LOGGER1 = Logger.getLogger("org.stepic.java.logging.ClassA");
    LOGGER1.setLevel(Level.ALL);
    Logger LOGGER2 = Logger.getLogger("org.stepic.java.logging.ClassB");
    LOGGER2.setLevel(Level.WARNING);
    Logger LOGGER3 = Logger.getLogger("org.stepic.java");
    LOGGER3.setUseParentHandlers(false);
    ConsoleHandler a = new ConsoleHandler();
    a.setLevel(Level.ALL);
    a.setFormatter(new XMLFormatter());
    LOGGER3.addHandler(a);
}
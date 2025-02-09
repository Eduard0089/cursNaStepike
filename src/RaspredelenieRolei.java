public class RaspredelenieRolei {
    public static void main (String [] args){
        String [] roles= {
                "Городничий","Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич",
                "Лука"};
        String [] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!",
                "Лука: Я пидорас"};
        StringBuilder raspredelenie = new StringBuilder();

        for (int i =0; i<  roles.length; i++){
            raspredelenie.append(roles[i]+":"+"\n");

            for (int j=0; j < textLines.length; j++) {
                if ((textLines[j]).startsWith((roles[i] + ":"))) {
                    raspredelenie.append((j + 1) + ")" + (textLines[j].replaceFirst(roles[i] + ":", "")) + "\n");
                }
            }
            raspredelenie.append("\n");
        }

        System.out.println(raspredelenie.toString());
    }
}
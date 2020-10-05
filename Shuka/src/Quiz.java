import static java.lang;


public class Quiz {

    public static void main(String[] args) throws Exception {
        String[] roles = {
                "Городничий", "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        System.out.println(printTextPerRole(roles, textLines));
    }

    private static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < roles.length; i++) {
            String rol = roles[i] + ":";
            res.append(rol + "\n");
            for (int j = 0; j < textLines.length; j++) {
                String text = textLines[j];
                if (text.startsWith(rol)) {
                    StringBuilder text1 = new StringBuilder(text);
                    text1.delete(0, roles[i].length() + 2);
                    text1.toString();
                    res.append((j + 1) + ") " + text1 + "\n");
                }
            }
            res.append("\n");
        }
        String res1 = res.toString();
        return res1;
    }


}
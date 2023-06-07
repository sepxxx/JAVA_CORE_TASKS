//Урок 23: StringBuilder
//Тип данных String - immutable
public class Main {
    public static void main(String[] args) {
//        String s1 = "I ";
//        String s2 = "love ";
//        String s3 = "JAVA";
//        String s4 = s1+s2+s3;//операция будет выполняться поэтапно, создатся 2 дополнительных строки
        //в цикле такие операции очень затратны, стоит использовать StringBuilder

        StringBuilder s1 = new StringBuilder("I ");
        s1.append("love ").append("JAVA");
        System.out.println(s1);
    }
}
//Урок 22: Ключевое слово final.
//1)для неизменяемых переменных
//такие переменные принято писать капсом
//2)в классах всегда использовать в паре со static, чтобы не тратить память
public class Main {
    public static void main(String[] args) {
        System.out.println(Test.CONST);
    }
}
class Test {
    public static final int CONST = 10;
}


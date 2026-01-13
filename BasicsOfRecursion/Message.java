package BasicsOfRecursion;

public class Message {
    static void message() {
        System.out.println("Hello World");
        message2();
    }
    static void message1() {
        System.out.println("This one second message");
        message3();
    }
    static void message2() {
        System.out.println("This second message");
        message1();
    }
    static void message3() {
        System.out.println("this is last message");
    }
    public static void main(String[] arr){
        message();
    }
    
}

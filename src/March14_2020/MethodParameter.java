package March14_2020;

public class MethodParameter {
    public static void main(String[] args) {
        printString();
        printString("Java");
        printString("Java", 20);
    }

    public static void printString() {
        for (int i = 0; i < 100; i++) {
            System.out.println("hello word");
        }
    }

    public static void printString(String java) {
        for (int i = 0; i < 100; i++) {
            System.out.println(java);
        }
    }

    public static void printString(String java, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(java);
        }
    }
}


package loop;

public class Taboda {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(x + "*" + j + " = " + (x * j));
            }
            System.out.println("===========================");
        }
    }
}

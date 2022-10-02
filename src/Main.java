
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello " + " Nursultan");
        String iAm;
        final int num = 18;
        String word = "hello";
        iAm = num + " " + word;
        System.out.println(iAm);

        if (num < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (num > 0) {
            System.out.println("Вы сохранили полажительное число");

        }else {
            System.out.println("Вы сохранили 0");
        }

    }
}
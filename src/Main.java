import java.util.Scanner;

public class Main {

    public static int cube(int number) {
        return number * number * number;
    } // Куб числа

    public static void printStars(int countStars) {
        for (int i = 0; i < countStars; i++) {
            System.out.print("*");    /////////////////////////////////////виводимо зірочки
        }
    }

    public static void printSymbols(char symbol, int countOfSymbols){
    for (int i = 0; i  < countOfSymbols; i++) {
        System.out.print(symbol);   //////////////////////////////////////виводимо символи
        }

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scanner.nextInt();
        int cubeResult = cube(number);
        System.out.println("the cube of your number is " + cubeResult);

///////////////////////////////////////////////////////////////////////////////////////////////////////////


        System.out.println("Enter the count of Stars");
        int countStars = scanner.nextInt();
        printStars(countStars);

        System.out.println("\n");

/////////////////////////////////////////////////////////////////////////////////////////////////////////


        System.out.println("Enter the symbol");
        char symbol = scanner.next().charAt(0);
        System.out.println("Enter the count of symbols");
        int countOfSymbols = scanner.nextInt();
        printSymbols(symbol, countOfSymbols);

}


    }







import java.util.Scanner;

public class MethodsExercises {

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }



    public static void main(String[] args) {
//        System.out.println(addition(12, 4));
//        System.out.println(subtraction(8, 4));
//        System.out.println(multiplication(4, 4));
//        System.out.println(division(16, 4));
//        System.out.println(modulus(100, 3));
    }
    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number between " + min + " and " + max);
        int userInput = sc.nextInt();
        if(userInput > min && userInput <max){
            System.out.println("Thank you");
            return userInput;
        } else {
            System.out.println("Sorry, that number is not within range.");
        }
        return userInput;
    }
}



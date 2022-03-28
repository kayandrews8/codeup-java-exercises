import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        String value = String.format("The value of pi is approximately %.2f", pi);
//        System.out.println(value);

        Scanner sc = new Scanner(System.in);

//        System.out.println("Please enter an integer: ");
//        int userInt = sc.nextInt();
//        System.out.println(userInt);

//        System.out.println("Enter the first 3 words that you think of: ");
//        String word1 = sc.nextLine();
//        String word2 = sc.nextLine();
//        String word3 = sc.nextLine();
//        System.out.println(word1);
//        System.out.println(word2);
//        System.out.println(word3);

//        System.out.println("Please enter a sentence: ");
//        String sent = sc.nextLine();
//        System.out.println(sent);

        System.out.println("Enter the length and width of the room: ");
        int length = Integer.parseInt(sc.nextLine());
        int width = Integer.parseInt(sc.nextLine());
        int area = width * length;
        int perimeter = (width *2) + (length *2);
        System.out.printf("The area of the room is %s. feet", area);
        System.out.printf("The perimeter of the room is %s. feet", perimeter);

    }
}

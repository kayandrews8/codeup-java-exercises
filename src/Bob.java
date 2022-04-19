import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like to say to bob?");
        String input = sc.nextLine();
        if(input.isEmpty()){
            System.out.println("Fine. Be that way!");
        }else if(input.endsWith("?")){
            System.out.println("Sure.");
        } else if(input.endsWith("!")){
            System.out.println("Whoa, chill out!");
        }else{
            System.out.println("Whatever.");
        }
    }
}

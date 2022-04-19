import java.util.Arrays;

public class ArraysExercise {

    public static Person[] addPerson(Person[] people, Person newPerson){
        Person[] morePeople = new Person[people.length+1];
        morePeople[morePeople.length - 1] = newPerson;
        return morePeople;
    }
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("JP");
        people[1] = new Person("James");
        people[2] = new Person("Tony");

    }
}

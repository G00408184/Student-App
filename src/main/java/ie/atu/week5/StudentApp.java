package ie.atu.week5;
import java.util.Scanner;



public class StudentApp {
    public static void main(String[] args) {
        System.out.println("Please enter Student Name");
        Scanner input = new Scanner(System.in);
        Student store = new Student();
        String name = input.nextLine();
        store.setName(name);
        System.out.println("you entered :" + store.getName());


        System.out.println("Please enter Student email");
        String email = input.nextLine();
        store.setEmail(email);
        System.out.println("you entered :" + store.getEmail());


        System.out.println("Please enter Name of course Studying");
        String course = input.nextLine();
        store.setCourse(course);
        System.out.println("you entered :" + store.getCourse());

        System.out.println("Please enter 2nd Students Name");
        String name2 = input.nextLine();
        store.setName(name2);
        System.out.println("you entered :" + store.getName());


        System.out.println("Please enter 2nd Students email");
        String email2 = input.nextLine();
        store.setEmail(email2);
        System.out.println("you entered :" + store.getEmail());


        System.out.println("Please enter Name of course Studying");
        String course2 = input.nextLine();
        store.setCourse(course2);
        System.out.println("you entered :" + store.getCourse());






    }
}

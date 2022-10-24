package ie.atu.week5;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        System.out.println("Please enter Student Name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("you entered :" + name);


        System.out.println("Please enter Student email");
        String email = input.nextLine();
        System.out.println("you entered :" + email);

        System.out.println("Please enter Name of course Studying");
        String course = input.nextLine();
        System.out.println("you entered :" + course);





    }
}

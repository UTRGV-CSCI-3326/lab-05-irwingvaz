import java.util.Scanner;

public class input {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    System.out.print("Enter your age: ");
    int age = scanner.nextInt();

    System.out.print("Enter your weight: ");
    double weight = scanner.nextDouble();

    System.out.print("Are you a smoker ? True or False: ");
    boolean isSmoker = scanner.nextBoolean();


    System.out.println("Medical Information");
    System.out.println(name + "");
    System.out.println(age + "");
    System.out.println(weight + "");
    System.out.println(isSmoker + "");

}

}
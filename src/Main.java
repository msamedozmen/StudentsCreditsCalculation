import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student s1 = new Student("Ali", 24);
        Student s2 = new Student("Ahmet");
        int option = 0;

        while (option != 3){
            System.out.println("Choose an option\n" +
                    "(1) Ali\n" +
                    "(2) Ahmet\n" +
                    "(3) Terminate");
            option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println("(1) Add Lecture\n(2) List Lectures");
                    int i = scanner.nextInt();
                    if(i==1){
                        System.out.println("Enter the name of the lecture:");
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        System.out.println("Enter the credit of the lecture:");
                        int credit = scanner.nextInt();
                        s1.addLecture(name,credit);
                    }else{
                        s1.listLectures();
                    }
                    break;
                case 2:
                    System.out.println("(1) Add Lecture\n(2) List Lectures");
                    i = scanner.nextInt();
                    if(i==1){
                        System.out.println("Enter the name of the lecture:");
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        System.out.println("Enter the credit of the lecture:");
                        int credit = scanner.nextInt();
                        s2.addLecture(name,credit);
                    }else{
                        s2.listLectures();
                    }
                    break;
                case 3:
                    System.out.println("Terminated");
            }

        }


    }
}

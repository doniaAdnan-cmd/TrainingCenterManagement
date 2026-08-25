package main;

import java.util.Scanner;

public class Main {

    public static int readValidAge(Scanner sc) {
        int age;
        while (true) {
            System.out.print("Enter Age: ");
            age = sc.nextInt();
            sc.nextLine();

            if (age > 0) {
                return age;
            } else {
                System.out.println(" Error: Age must be greater than 0. Try again.");
            }
        }
    }

    public static void main(String[] args) {
        TrainingCenter center = new TrainingCenter();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("====================TRAINING CENTER MANAGEMENT SYSTEM====================");
            System.out.println("1. Add Student");
            System.out.println("2. Add Trainer");
            System.out.println("3. Add Course");
            System.out.println("4. Display Students");
            System.out.println("5. Display Trainers");
            System.out.println("6. Display Courses");
            System.out.println("7. Search Student");
            System.out.println("8. Search Trainer");
            System.out.println("9. Compare Two Students");
            System.out.println("10. Display Trainer Salary");
            System.out.println("11. Exit");

            try {
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1: // Add Student
                        System.out.print("Enter ID: ");
                        String id = sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        int age = readValidAge(sc); 
                        System.out.print("Enter Course: ");
                        String course = sc.nextLine();
                        center.addStudent(id, name, age, course);
                        break;

                    case 2: // Add Trainer
                        System.out.print("Enter ID: ");
                        String tid = sc.nextLine();
                        System.out.print("Enter Name: ");
                        String tname = sc.nextLine();
                        int tage = readValidAge(sc); 
                        System.out.print("Enter Specialization: ");
                        String specialization = sc.nextLine();
                        System.out.print("Enter HourlyRate: ");
                        double hourlyRate = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Enter WorkingHours: ");
                        int workingHours = sc.nextInt();
                        sc.nextLine();
                        center.addTrainer(tid, tname, tage, specialization, hourlyRate, workingHours);
                        break;

                    case 3: // Add Course
                        System.out.print("Enter Course ID: ");
                        String cid = sc.nextLine();
                        System.out.print("Enter Name: ");
                        String cname = sc.nextLine();
                        System.out.print("Enter Duration: ");
                        int duration = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter TrainerID: ");
                        String trainerId = sc.nextLine();
                        center.addCourse(cid, cname, duration, trainerId);
                        break;

                    case 4: // Display Students
                        center.displayAllStudents();
                        break;

                    case 5: // Display Trainers
                        center.displayAllTrainers();
                        break;

                    case 6: // Display Courses
                        center.displayAllCourses();
                        break;

                    case 7: // Search Student
                        System.out.print("Enter Student ID: ");
                        String sid = sc.nextLine();
                        center.searchStudent(sid);
                        break;

                    case 8: // Search Trainer
                        System.out.print("Enter Trainer ID: ");
                        String trid = sc.nextLine();
                        center.searchTrainer(trid);
                        break;

                    case 9: // Compare Two Students
                        System.out.print("Enter first Student ID: ");
                        String s1 = sc.nextLine();
                        System.out.print("Enter second Student ID: ");
                        String s2 = sc.nextLine();
                        center.compareStudents(s1, s2);
                        break;

                    case 10: // Display Trainer Salary
                        System.out.print("Enter Trainer ID: ");
                        String trSalaryId = sc.nextLine();
                        center.displayTrainerSalary(trSalaryId);
                        break;

                    case 11: // Exit
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Option not implemented yet.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input, please try again.");
                sc.nextLine(); // clear buffer
            }
        }
    }
}

package main;

import java.util.ArrayList;

class TrainingCenter {

    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Trainer> trainers = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();

    // Add Student
    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully!");
    }

    public void addStudent(String id, String name, int age, String course) {
        students.add(new Student(id, name, age, course));
        System.out.println("Student added successfully!");
    }

    //Add Trainer
    public void addTrainer(String id, String name, int age, String specialization, double hourlyRate, int workingHours) {
        trainers.add(new Trainer(id, name, age, specialization, hourlyRate, workingHours));
        System.out.println("Trainer added successfully!");
    }

    //Add Course
    public void addCourse(String cid, String cname, int duration, String trainerId) {

        Trainer trainer = searchTrainer(trainerId);
        if (trainer != null) {
            courses.add(new Course(cid, cname, duration, trainer));
        } else {
            System.out.println(" Trainer not found with ID: " + trainerId);
        }
        System.out.println("Course added successfully!");
    }

    //Compare Two Students
    public void compareStudents(String id1, String id2) {
        Student s1 = searchStudent(id1);
        Student s2 = searchStudent(id2);
        if (s1 != null && s2 != null) {
            if (s1.equals(s2)) {
                System.out.println(" Students are equal (same ID).");
            } else {
                System.out.println(" Students are different.");
            }
        } else {
            System.out.println(" One or both students not found.");
        }
    }

    //Display Trainer Salary
    public void displayTrainerSalary(String id) {
        Trainer t = searchTrainer(id);
        if (t != null) {
            System.out.println("Trainer Salary = " + t.calculateSalary());
        } else {
            System.out.println(" Trainer not found.");
        }
    }

    // Display Students
    public void displayAllStudents() {
        for (Student s : students) {
            s.displayInfo();
        }
    }

    //Display Trainers
    public void displayAllTrainers() {
        for (Trainer t : trainers) {
            t.displayInfo();
        }
    }

    //Display Courses
    public void displayAllCourses() {
        for (Course c : courses) {
            System.out.println(c);
        }
    }

// Search Student
    public Student searchStudent(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                System.out.println(" Student with ID \" + id + \" is found.");
                return s;
            }
        }
        System.out.println(" Student with ID " + id + " not found.");
        return null;
    }

// Search Trainer
    public Trainer searchTrainer(String id) {
        for (Trainer t : trainers) {
            if (t.getId().equals(id)) {
                System.out.println(" Trainer with ID \" + id + \" is found");
                return t;
            }
        }
        System.out.println(" Trainer with ID " + id + " not found.");
        return null;
    }

}

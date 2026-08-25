package main;

class Student extends Person {
    private String courseName;              // خاصية إضافية
    private static int studentCount = 0;    // متغير static لتتبع عدد الطلاب

    // 1- Constructor افتراضي
    public Student() {
        super("", "", 0);   // استدعاء Constructor الأب
        this.courseName = "";
        studentCount++;
    }

    // 2- Constructor مُعاملات
    public Student(String id, String name, int age, String courseName) {
        super(id, name, age);
        this.courseName = courseName;
        studentCount++;
    }

    // 3- Copy Constructor
    public Student(Student s) {
        super(s.getId(), s.getName(), s.getAge());
        this.courseName = s.courseName;
        studentCount++;
    }

    // 4- Getters & Setters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    // 5- Override displayInfo()
    @Override
    public void displayInfo() {
        System.out.println("Student ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Course: " + courseName);
    }

    // 6- Override toString()
    @Override
    public String toString() {
        return "Student [ID=" + getId() + ", Name=" + getName() +
               ", Age=" + getAge() + ", Course=" + courseName + "]";
    }

    // 7- equals() لمقارنة الطلاب حسب الـ ID
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // نفس الكائن
        if (obj == null || getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        return this.getId().equals(other.getId());
    }
}


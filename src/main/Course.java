package main;

class Course {

    private String courseId;
    private String courseName;
    private int duration;
    private Trainer trainer; // Aggregation

    public Course() {
        this.courseId = "";
        this.courseName = "";
        this.duration = 0;
        this.trainer = null;
    }

    public Course(String courseId, String courseName, int duration, Trainer trainer) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.duration = duration;
        this.trainer = trainer;
    }

    // Getters and Setters
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    @Override
    public String toString() {
        return "Course [ID=" + courseId + ", Name=" + courseName
                + ", Duration=" + duration + " hours, Trainer="
                + (trainer != null ? trainer.getName() : "No Trainer Assigned") + "]";
    }
}

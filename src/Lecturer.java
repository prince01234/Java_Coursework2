
/**
 * Source code of child class Lecturer with 4 private attributes, constructor,
 * accessor, and methods
 *
 * @author (Prince Shrestha)
 */

// creating a class Lecturer ( a subclass of Teacher)
public class Lecturer extends Teacher {
    // writing 4 attributes of Tutor
    private String Department;
    private int YearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;

    // creating a constructor with parameters
    public Lecturer(int teacherId, String teacherName, String address, String workingType, String employmentStatus,
            String Department, int YearsOfExperience, int workingHours) {
        // call for a superclass constructor ie. Teacher constructor
        super(teacherId, teacherName, address, workingType, employmentStatus);
        super.setWorkingHours(workingHours);

        // initializing attributes with parameters values
        this.Department = Department;
        this.YearsOfExperience = YearsOfExperience;
        // Assigned gradedScore as 0
        this.gradedScore = 0;
        // assigned hasGraded to false
        this.hasGraded = false;
    }

    // accessor methods for Lecturer class
    public String getDepartment() {
        return Department;
    }

    public int getYearsOfExperience() {
        return YearsOfExperience;
    }

    public int getGradedScore() {
        return gradedScore;
    }

    public boolean getHasGraded() {
        return hasGraded;
    }

    // mutator method for gradedScore
    public void setGradedScore(int gradedScore) {
        this.gradedScore = gradedScore;
    }

    // creating a method named gradeAssignment
    public void gradeAssignment(int gradedScore, String Department, int YearsOfExperience) {
        // checking whether the lecturer is qualified to grade assignment or not.
        if (YearsOfExperience >= 5 && this.Department.equals(Department)) {
            // grading the assignments of the students according to condition
            if (gradedScore >= 70) {
                System.out.println("Asignment graded is: A");
            } else if (gradedScore >= 60) {
                System.out.println("Assignment graded is: B");
            } else if (gradedScore >= 50) {
                System.out.println("Assignment graded is: C");
            } else if (gradedScore >= 40) {
                System.out.println("Assignment graded is: D");
            } else {
                System.out.println("Assignment graded is: E");
            }
            this.setGradedScore(gradedScore);
            // updated hasGraded attribute
            this.hasGraded = true;
        } else {
            System.out.println("Lecturer is not qualified to grade assignments.");
        }
    }

    // Display method for Lecturer class
    public void display() {
        // calling method of Teacher to display Teacher class
        super.display();

        // displaying additional info like department, yearsOfExperience
        System.out.println("Department: " + Department);
        System.out.println("Years of Experience: " + YearsOfExperience);

        // displaying gradedScore if graded or messsage if not graded
        if (this.hasGraded == true) {
            System.out.println("Graded Score: " + getGradedScore());
        } else {
            System.out.println("Graded Score: Not graded yet");
        }
    }
}
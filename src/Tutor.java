
/**
 * Source code of child class Tutor with 5 private attributes, constructor,
 * accessor, and methods.
 *
 * @author (Prince Shrestha)
 */

// creating a class Tutor (sub class of Teacher)
public class Tutor extends Teacher {
    // writing 5 attributes of Tutor
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;

    // creating a constructor with 10 parameters
    public Tutor(int teacherId, String teacherName, String address, String workingType, String employmentStatus,
            int workingHours, double salary, String specialization, String academicQualifications,
            int performanceIndex) {
        // call for a superclass constructor ie. Teacher constructor
        super(teacherId, teacherName, address, workingType, employmentStatus);
        super.setWorkingHours(workingHours);

        // initializing attributes with parameters values
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false; // assigned isCertified to flase
    }

    // accessor methods for tutor class
    public double getSalary() {
        return salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getAcademicQualifications() {
        return academicQualifications;
    }

    public int getPerformanceIndex() {
        return performanceIndex;
    }

    public boolean getIsCertified() {
        return isCertified;
    }

    // setter method for salary and performanceIndex
    public void setSalaryPerformance(double newSalary, int newPerformanceIndex) {
        // checking the condition for salary
        if (newPerformanceIndex >= 5 && getWorkingHours() > 20) {
            double appraisal;
            if (newPerformanceIndex >= 5 && newPerformanceIndex <= 7)

            {
                appraisal = 0.05 * newSalary;
            } else if (newPerformanceIndex >= 8 && newPerformanceIndex <= 9) {
                appraisal = 0.10 * newSalary;
            } else {
                appraisal = 0.20 * newSalary;
            }

            this.salary = newSalary + appraisal;

            // setting isCertiifed to true
            this.isCertified = true;
            this.performanceIndex = newPerformanceIndex;

            // output when salary is aproved
            System.out.println("Salary has been approved with an appraisal of " + (appraisal)
                    + " amount and new salary is: " + salary);
        } else {
            // output when salary is not approved
            System.out.println("Salary cannot be approved. Check working hours and performance index");
        }
    }

    // creating a method to remove tutor
    public void removeTutor() {
        if (isCertified == false) {
            this.salary = 0;
            this.specialization = "";
            this.academicQualifications = "";
            this.performanceIndex = 0;
            this.isCertified = false;
            System.out.println("Tutor has been removed.");
        } else {
            System.out.println("Certified tutor cannot be removed.");
        }
    }

    // creating a method to display Tutor\
    public void display() {
        // calling method of Teacher to display Teacher class when isCertified = false
        if (!isCertified) {
            super.display();
        }
        // displaying when isCertified = true;
        else {
            super.display();
            System.out.println("Salary : " + salary);
            System.out.println("Specialization : " + specialization);
            System.out.println("Academic Qualification : " + academicQualifications);
            System.out.println("Performance Index : " + performanceIndex);
        }
    }
}

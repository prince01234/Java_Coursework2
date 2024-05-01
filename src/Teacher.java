
/**
 * Source code of parent classTeacher that has 6 private attributes, accessor,
 * constructor and display methods
 * 
 * @author (Prince Shrestha)
 */
// creating a class Teacher.
public class Teacher {
    // writing 6 Attributes of teacher
    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours;

    // creating a constructor of 5 parameters
    public Teacher(int teacherId, String teacherName, String address, String workingType, String employmentStatus) {
        // initializing attributes with the parameter values
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
    }

    // corresponding accessor methods for each attributes
    public int getTeacherId() {
        return teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getAddress() {
        return address;
    }

    public String getWorkingType() {
        return workingType;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    // method to set the working hours
    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    // display method to show output
    public void display() {
        System.out.println("Teacher Id : " + teacherId);
        System.out.println("Teacher Name: " + teacherName);
        System.out.println("Address: " + address);
        System.out.println("Working type: " + workingType);
        System.out.println("Employment status: " + employmentStatus);

        // checking whether working hours is assigned or not
        if (workingHours > 0) {
            System.out.println("Working hours: " + workingHours + " hours");
        } else {
            System.out.println("Working hours is not assigned.");
        }
    }
}

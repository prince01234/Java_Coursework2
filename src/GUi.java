import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class GUi {
    // instance variables for main frame and content
    private JFrame frame;
    private JPanel mainPanel, menuPanel, contentPanel;
    private JLabel menuLabel, menuLabel2, welcomeLabel, welcome2Label, welcome3Label;
    private JButton lecturerButton, tutorButton, displayButton;
    private Border menuBorder, contentBorder, buttonBorder;
    private Font titleFont, textfieldFont, buttonFont, menuFont, welcomeFont, welcome2Font;

    // Initialize instance variables for lecturer content
    private JPanel mainLecturerPanel, addLecturerPanel, gradeAssignmentPanel;
    private JPanel addLecturerTitlePanel, gradeAssignmentTitlePanel;
    private JLabel addLecturerLabel, gradeAssignmentLabel, lecturerIdLabel;
    private JLabel lecturerNameLabel, lecturerAddressLabel, lecturerWorkingTypeLabel, lecturerEmploymentStatusLabel;
    private JLabel lecturerDepartmentLabel, lecturerYearsOfExperienceLabel, lecturerWorkingHourLabel;
    private JLabel gradeAssignmentIdLabel, gradeScoreLabel, gradeDepartmentLabel, gradeYearsOfExperienceLabel;
    private JTextField lecturerIdTextField, lecturerNameTextField, lecturerAddressTextField;
    private JTextField lecturerWorkingTypeTextField, lecturerEmploymentStatusTextField;
    private JTextField lecturerDepartmentTextField, lecturerYearsOfExperienceTextField, lecturerWorkingHourTextField;
    private JTextField gradeAssignmentIdTextField, gradeScoreTextField, gradeDepartmentTextField;
    private JTextField gradeYearsOfExperienceTextField;
    private Border mainLecturerBorder, addLecturerBorder, gradeAssignmentBorder;
    private JButton addLecturerButton, gradeAssignmentButton, clearLecturerButton;

    // Initialize instances for tutor content
    private JPanel mainTutorPanel, addTutorPanel, setSalaryPanel, removeTutorPanel, addTutorTitlePanel;
    private JPanel setSalaryTitlePanel, removeTutorTitlePanel;
    private JLabel addTutorLabel, setSalaryLabel, removeTutorLabel, tutorIdLabel, tutorNameLabel, tutorAddressLabel;
    private JLabel tutorWorkingTypeLabel, tutorEmploymentStatusLabel, tutorWorkingHoursLabel, tutorSalaryLabel;
    private JLabel tutorSpecializationLabel, tutorAcademicQualificationLabel, tutorPerformanceIndexLabel;
    private JLabel setSalaryIdLabel, setSalaryNewSalaryLabel, setSalaryPerformanceIndexLabel;
    private JLabel removeTutorIdLabel;
    private JTextField tutorIdTextField, tutorNameTextField, tutorAddressTextField, tutorWorkingTypeTextField;
    private JTextField tutorEmploymentStatusTextField, tutorWorkingHoursTextField, tutorSalaryTextField;
    private JTextField tutorSpecializationTextField, tutorAcademicQualificationTextField,
            tutorPerformanceIndexTextField;
    private JTextField setSalaryIdTextField, setSalaryNewSalaryTextField, setSalaryPerformanceIndexTextField;
    private JTextField removeTutorIdTextField;
    private Border mainTutorBorder, addTutorBorder, setSalaryBorder, removeTutorBorder;
    private JButton addTutorButton, setSalaryButton, removeTutorButton, clearTutorButton;

    // Initialize instances for display content
    JLabel displayLabel, displayIdLabel, displayAllLabel;
    JPanel displayPanel;
    JTextField displayIdTextField;
    JButton displayIdButton, displayAllButton;
    Border displayBorder;

    // Initialize ArrayList
    private ArrayList<Teacher> teacherList = new ArrayList<Teacher>();

    public GUi() {
        // Creating JFrame with title "Teacher Management System"
        frame = new JFrame("Teacher Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50, 50, 1100, 625);

        // Setting up fonts
        titleFont = new Font("Arial Black", Font.PLAIN, 20);
        textfieldFont = new Font("Yu Gothic UI Semibold", Font.PLAIN, 15);
        buttonFont = new Font("Copperplate Gothic Bold", Font.PLAIN, 13);
        menuFont = new Font("MV Boli", Font.BOLD, 20);
        welcomeFont = new Font("Goudy Old Style", Font.ITALIC, 17);
        welcome2Font = new Font("MV Boli", Font.BOLD, 30);

        // Creating main panel
        mainPanel = new JPanel(null);
        mainPanel.setSize(1100, 600);

        // creating menu panel to nagivate management system
        menuPanel = new JPanel(null);
        menuPanel.setBounds(0, 0, 300, 600);

        // Creating TitledBorder for the menu border
        menuBorder = BorderFactory.createTitledBorder("Main Menu");
        menuPanel.setBorder(menuBorder);

        // Creating JLabel for "Teacher Management"
        menuLabel = new JLabel("Teacher Management");
        menuLabel.setBounds(25, 50, 220, 50);
        menuLabel.setFont(menuFont);
        menuPanel.add(menuLabel);

        // Creating JLabel for "System"
        menuLabel2 = new JLabel("System");
        menuLabel2.setBounds(120, 80, 100, 50);
        menuLabel2.setFont(menuFont);
        menuPanel.add(menuLabel2);

        // Creating JButton for "LECTURER SECTION"
        lecturerButton = new JButton("LECTURER SECTION");
        lecturerButton.setBounds(50, 150, 200, 50);
        lecturerButton.setFocusPainted(false);
        lecturerButton.setFont(buttonFont);
        lecturerButton.setBackground(Color.decode("#6AD4DD"));
        lecturerButton.setForeground(Color.WHITE);
        menuPanel.add(lecturerButton);

        // Creating JButton for "TUTOR SECTION"
        tutorButton = new JButton("TUTOR SECTION");
        tutorButton.setBounds(50, 250, 200, 50);
        tutorButton.setFocusPainted(false);
        tutorButton.setFont(buttonFont);
        tutorButton.setBackground(Color.decode("#6AD4DD"));
        tutorButton.setForeground(Color.WHITE);
        menuPanel.add(tutorButton);

        // Creating JButton for "DISPLAY INFO"
        displayButton = new JButton("DISPLAY INFO");
        displayButton.setBounds(50, 350, 200, 50);
        displayButton.setFocusPainted(false);
        displayButton.setFont(buttonFont);
        displayButton.setBackground(Color.decode("#6AD4DD"));
        displayButton.setForeground(Color.WHITE);
        menuPanel.add(displayButton);

        // adding content panel
        contentPanel = new JPanel(null); // setting layout to null
        contentPanel.setBounds(300, 0, 800, 600); // setting bounds for content panel

        // adding border to content panel
        contentBorder = BorderFactory.createTitledBorder("Teacher Management System");
        contentPanel.setBorder(contentBorder);

        displayBorder = BorderFactory.createTitledBorder("Display");

        // Adding initial content to content panel

        // Creating label for the main title
        welcomeLabel = new JLabel("Teacher Management System");
        welcomeLabel.setBounds(150, 50, 600, 70);
        welcomeLabel.setFont(welcome2Font);
        contentPanel.add(welcomeLabel);

        // Creating label for the system description
        welcome2Label = new JLabel("your all-in-one solution for efficient administration and seamless collaboration.");
        welcome2Label.setBounds(175, 100, 700, 30);
        welcome2Label.setFont(welcomeFont);
        contentPanel.add(welcome2Label);

        // Creating label for additional system description
        welcome3Label = new JLabel("Let's simplify tasks and unite efforts to elevate education together!");
        welcome3Label.setBounds(205, 115, 600, 30);
        welcome3Label.setFont(welcomeFont);
        contentPanel.add(welcome3Label);

        // Creating panel for display section
        displayPanel = new JPanel(null);
        displayPanel.setBounds(180, 220, 450, 250);
        displayPanel.setBorder(displayBorder);
        contentPanel.add(displayPanel);

        // Creating label for displaying search instruction
        displayLabel = new JLabel("Search our Teachers: ");
        displayLabel.setBounds(100, 20, 500, 40);
        displayLabel.setFont(menuFont);
        displayPanel.add(displayLabel);

        // Creating label for displaying ID
        displayIdLabel = new JLabel("ID");
        displayIdLabel.setBounds(20, 90, 70, 40);
        displayIdLabel.setFont(menuFont);
        displayPanel.add(displayIdLabel);

        // Creating text field for inputting ID
        displayIdTextField = new JTextField();
        displayIdTextField.setBounds(100, 90, 200, 40);
        displayPanel.add(displayIdTextField);

        // Creating button for displaying by ID
        displayIdButton = new JButton("DISPLAY");
        displayIdButton.setBounds(310, 90, 130, 40);
        displayIdButton.setBackground(Color.decode("#AD8B73"));
        displayIdButton.setForeground(Color.white);
        displayIdButton.setFont(buttonFont);
        displayIdButton.setFocusPainted(false);
        displayPanel.add(displayIdButton);
        displayIdButton.addActionListener(e -> {
            displayID();
        });

        // Creating label for displaying "OR"
        displayAllLabel = new JLabel("OR");
        displayAllLabel.setBounds(20, 180, 70, 40);
        displayAllLabel.setFont(menuFont);
        displayPanel.add(displayAllLabel);

        // Creating TitledBorder for the button border
        buttonBorder = BorderFactory.createLineBorder(Color.BLACK, 2);

        // Creating button for displaying all teachers
        displayAllButton = new JButton("DISPLAY   ALL   TEACHERS");
        displayAllButton.setBounds(100, 180, 220, 40);
        displayAllButton.setBackground(Color.decode("#EEEEEE"));
        displayAllButton.setForeground(Color.BLACK);
        displayAllButton.setFont(buttonFont);
        displayAllButton.setFocusPainted(false);
        displayAllButton.setBorder(buttonBorder);
        displayPanel.add(displayAllButton);
        displayAllButton.addActionListener(e -> {
            displayAllTeachers();
        });

        // Add the panels to the main panel
        mainPanel.add(menuPanel);
        mainPanel.add(contentPanel);

        // Add main panel to the frame
        frame.add(mainPanel);

        // ActionListener for lecturer section button to display lecturer content
        lecturerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lecturerContent();
            };
        });

        // ActionListener for tutor section button to display tutor content
        tutorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tutorContent();
            }
        });

        // ActionListener for display info button to display content
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayContent();
            }
        });

        // Set frame properties
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Creating a new instance of GUI
        new GUi();
    }

    // content for lecturer panel
    private void lecturerContent() {
        contentPanel.removeAll();

        // Creating main panel for lecturer section
        mainLecturerPanel = new JPanel(null);
        mainLecturerPanel.setBounds(0, 0, 800, 600);

        // Adding border to lecturer section
        mainLecturerBorder = BorderFactory.createTitledBorder("Lecturer Section");
        mainLecturerPanel.setBorder(mainLecturerBorder);

        // Creating panel for adding a new lecturer
        addLecturerPanel = new JPanel(null);
        addLecturerPanel.setBounds(50, 50, 390, 515);
        mainLecturerPanel.add(addLecturerPanel);

        // Adding border to add lecturer panel
        addLecturerBorder = BorderFactory.createLineBorder(Color.BLACK, 2);
        addLecturerPanel.setBorder(addLecturerBorder);

        // Creating title panel for add lecturer panel
        addLecturerTitlePanel = new JPanel(null);
        addLecturerTitlePanel.setBounds(2, 2, 386, 50);
        addLecturerTitlePanel.setBackground(Color.decode("#135D66")); // Custom background color
        addLecturerPanel.add(addLecturerTitlePanel);

        // Label for indicating adding a new lecturer
        addLecturerLabel = new JLabel("ADD A NEW LECTURER");
        addLecturerLabel.setBounds(70, 1, 362, 50);
        addLecturerLabel.setForeground(Color.decode("#FFFFFF"));
        addLecturerLabel.setFont(titleFont);
        addLecturerTitlePanel.add(addLecturerLabel);

        // Label for lecturer ID
        lecturerIdLabel = new JLabel("Teacher ID");
        lecturerIdLabel.setBounds(10, 70, 150, 30);
        lecturerIdLabel.setFont(textfieldFont);
        addLecturerPanel.add(lecturerIdLabel);

        // Text field for lecturer ID
        lecturerIdTextField = new JTextField();
        lecturerIdTextField.setBounds(175, 70, 200, 30);
        addLecturerPanel.add(lecturerIdTextField);

        // Label for lecturer name
        lecturerNameLabel = new JLabel("Teacher Name");
        lecturerNameLabel.setBounds(10, 120, 150, 30);
        lecturerNameLabel.setFont(textfieldFont);
        addLecturerPanel.add(lecturerNameLabel);

        // Creating JTextField for lecturer name
        lecturerNameTextField = new JTextField();
        lecturerNameTextField.setBounds(175, 120, 200, 30);
        addLecturerPanel.add(lecturerNameTextField);

        // Label for lecturer address
        lecturerAddressLabel = new JLabel("Address");
        lecturerAddressLabel.setBounds(10, 170, 150, 30);
        lecturerAddressLabel.setFont(textfieldFont);
        addLecturerPanel.add(lecturerAddressLabel);

        // Creating JTextField for lecturer address
        lecturerAddressTextField = new JTextField();
        lecturerAddressTextField.setBounds(175, 170, 200, 30);
        addLecturerPanel.add(lecturerAddressTextField);

        // Creating JLabel for lecturer working type
        lecturerWorkingTypeLabel = new JLabel("Working Type");
        lecturerWorkingTypeLabel.setBounds(10, 220, 150, 30);
        lecturerWorkingTypeLabel.setFont(textfieldFont);
        addLecturerPanel.add(lecturerWorkingTypeLabel);

        // Creating JTextField for lecturer working type
        lecturerWorkingTypeTextField = new JTextField();
        lecturerWorkingTypeTextField.setBounds(175, 220, 200, 30);
        addLecturerPanel.add(lecturerWorkingTypeTextField);

        // Creating JLabel for lecturer employment status
        lecturerEmploymentStatusLabel = new JLabel("Employment Status");
        lecturerEmploymentStatusLabel.setBounds(10, 270, 150, 30);
        lecturerEmploymentStatusLabel.setFont(textfieldFont);
        addLecturerPanel.add(lecturerEmploymentStatusLabel);

        // Creating Jtextfielf for lecturer employment status
        lecturerEmploymentStatusTextField = new JTextField();
        lecturerEmploymentStatusTextField.setBounds(175, 270, 200, 30);
        addLecturerPanel.add(lecturerEmploymentStatusTextField);

        // Creating JLabel for lecturer department
        lecturerDepartmentLabel = new JLabel("Department");
        lecturerDepartmentLabel.setBounds(10, 320, 150, 30);
        lecturerDepartmentLabel.setFont(textfieldFont);
        addLecturerPanel.add(lecturerDepartmentLabel);

        // Creating JTextField for lecturer department
        lecturerDepartmentTextField = new JTextField();
        lecturerDepartmentTextField.setBounds(175, 320, 200, 30);
        addLecturerPanel.add(lecturerDepartmentTextField);

        // Creating JLabel for lecturer years of experience
        lecturerYearsOfExperienceLabel = new JLabel("Years Of Experience");
        lecturerYearsOfExperienceLabel.setBounds(10, 370, 150, 30);
        lecturerYearsOfExperienceLabel.setFont(textfieldFont);
        addLecturerPanel.add(lecturerYearsOfExperienceLabel);

        // Creating JTextField for lecturer years of experience
        lecturerYearsOfExperienceTextField = new JTextField();
        lecturerYearsOfExperienceTextField.setBounds(175, 370, 200, 30);
        addLecturerPanel.add(lecturerYearsOfExperienceTextField);

        // Creating JLabel for lecturer working hour
        lecturerWorkingHourLabel = new JLabel("Working Hour");
        lecturerWorkingHourLabel.setBounds(10, 420, 100, 30);
        lecturerWorkingHourLabel.setFont(textfieldFont);
        addLecturerPanel.add(lecturerWorkingHourLabel);

        // Creating JTextField for lecturer working hour
        lecturerWorkingHourTextField = new JTextField();
        lecturerWorkingHourTextField.setBounds(175, 420, 200, 30);
        addLecturerPanel.add(lecturerWorkingHourTextField);

        // Creating JButton for adding lecturer
        addLecturerButton = new JButton("ADD  LECTURER");
        addLecturerButton.setBounds(120, 470, 200, 35);
        addLecturerButton.setBackground(Color.decode("#AD8B73"));
        addLecturerButton.setForeground(Color.white);
        addLecturerButton.setFont(buttonFont);
        addLecturerButton.setFocusPainted(false);
        addLecturerPanel.add(addLecturerButton);
        // Creating ActionListener for add lecturer button
        addLecturerButton.addActionListener(e -> {
            addLecturer();
        });

        // Creating panel for adding grade assignment content
        gradeAssignmentPanel = new JPanel(null);
        gradeAssignmentPanel.setBounds(450, 50, 300, 430);
        mainLecturerPanel.add(gradeAssignmentPanel);

        // Adding border to grade assignment panel
        gradeAssignmentBorder = BorderFactory.createLineBorder(Color.BLACK, 2);
        gradeAssignmentPanel.setBorder(gradeAssignmentBorder);

        // Creating title panel for grade assignment
        gradeAssignmentTitlePanel = new JPanel(null);
        gradeAssignmentTitlePanel.setBounds(2, 2, 296, 50);
        gradeAssignmentTitlePanel.setBackground(Color.decode("#135D66"));// putting a custom background color in this
        gradeAssignmentPanel.add(gradeAssignmentTitlePanel);

        // Creating label for grade assignment
        gradeAssignmentLabel = new JLabel("GRADE ASSIGNMENT");
        gradeAssignmentLabel.setBounds(35, 1, 290, 50);
        gradeAssignmentLabel.setForeground(Color.decode("#FFFFFF"));
        gradeAssignmentLabel.setFont(titleFont);
        gradeAssignmentTitlePanel.add(gradeAssignmentLabel);

        // Creating label for teacher ID
        gradeAssignmentIdLabel = new JLabel("Teacher ID");
        gradeAssignmentIdLabel.setBounds(20, 70, 200, 30);
        gradeAssignmentIdLabel.setFont(textfieldFont);
        gradeAssignmentPanel.add(gradeAssignmentIdLabel);

        // Creating text field for teacher ID
        gradeAssignmentIdTextField = new JTextField();
        gradeAssignmentIdTextField.setBounds(20, 95, 250, 30);
        gradeAssignmentPanel.add(gradeAssignmentIdTextField);

        // Creating label for graded score
        gradeScoreLabel = new JLabel("Graded Score");
        gradeScoreLabel.setBounds(20, 135, 200, 30);
        gradeScoreLabel.setFont(textfieldFont);
        gradeAssignmentPanel.add(gradeScoreLabel);

        // Creating text field for graded score
        gradeScoreTextField = new JTextField();
        gradeScoreTextField.setBounds(20, 160, 250, 30);
        gradeAssignmentPanel.add(gradeScoreTextField);

        // Creating label for department
        gradeDepartmentLabel = new JLabel("Department");
        gradeDepartmentLabel.setBounds(20, 200, 200, 30);
        gradeDepartmentLabel.setFont(textfieldFont);
        gradeAssignmentPanel.add(gradeDepartmentLabel);

        // Creating JTextField for department
        gradeDepartmentTextField = new JTextField();
        gradeDepartmentTextField.setBounds(20, 225, 250, 30);
        gradeAssignmentPanel.add(gradeDepartmentTextField);

        // Creating JLabel for years of experience
        gradeYearsOfExperienceLabel = new JLabel("Years Of Experience");
        gradeYearsOfExperienceLabel.setBounds(20, 265, 200, 30);
        gradeYearsOfExperienceLabel.setFont(textfieldFont);
        gradeAssignmentPanel.add(gradeYearsOfExperienceLabel);

        // Creating JTextField for years of experience
        gradeYearsOfExperienceTextField = new JTextField();
        gradeYearsOfExperienceTextField.setBounds(20, 290, 250, 30);
        gradeAssignmentPanel.add(gradeYearsOfExperienceTextField);

        // Creating JButton for grading assignment
        gradeAssignmentButton = new JButton("GRADE  ASSIGNMENT");
        gradeAssignmentButton.setBounds(50, 360, 200, 40);
        gradeAssignmentButton.setBackground(Color.decode("#AD8B73"));
        gradeAssignmentButton.setFont(buttonFont);
        gradeAssignmentButton.setForeground(Color.WHITE);
        gradeAssignmentButton.setFocusPainted(false);
        gradeAssignmentPanel.add(gradeAssignmentButton);
        // Creating ActionListener for grading assignment button
        gradeAssignmentButton.addActionListener(e -> {
            gradeScore();
        });

        // Creating JButton for clearing all fields
        clearLecturerButton = new JButton("CLEAR   ALL   FIELDS");
        clearLecturerButton.setBounds(450, 510, 296, 50);
        clearLecturerButton.setBackground(Color.decode("#EEEEEE"));
        clearLecturerButton.setFont(buttonFont);
        clearLecturerButton.setFocusPainted(false);
        clearLecturerButton.setForeground(Color.BLACK);
        clearLecturerButton.setBorder(addLecturerBorder);
        mainLecturerPanel.add(clearLecturerButton);
        // Creating ActionListener for clearing all fields button
        clearLecturerButton.addActionListener(e -> {
            clearLecturer();
        });

        // Adding main lecturer panel to content panel
        contentPanel.add(mainLecturerPanel);
        contentPanel.revalidate();
        contentPanel.repaint();

    }

    private void tutorContent() {
        contentPanel.removeAll();

        // Creating main tutor panel
        mainTutorPanel = new JPanel(null);
        mainTutorPanel.setBounds(0, 0, 800, 600);

        // adding border to content panel
        mainTutorBorder = BorderFactory.createTitledBorder("Tutor Section");
        mainTutorPanel.setBorder(mainTutorBorder);

        // Creating add tutor panel
        addTutorPanel = new JPanel(null);
        addTutorPanel.setBounds(50, 50, 390, 520);
        mainTutorPanel.add(addTutorPanel);

        // Adding border to addTutorPanel
        addTutorBorder = BorderFactory.createLineBorder(Color.BLACK, 2);
        addTutorPanel.setBorder(addTutorBorder);

        // Creating add tutor title panel
        addTutorTitlePanel = new JPanel(null);
        addTutorTitlePanel.setBounds(2, 2, 386, 50);
        addTutorTitlePanel.setBackground(Color.decode("#135D66"));// putting a custom background color in this panel
        addTutorPanel.add(addTutorTitlePanel);

        // Creating JLabel for adding a new tutor
        addTutorLabel = new JLabel("ADD A NEW TUTOR");
        addTutorLabel.setBounds(80, 1, 362, 50);
        addTutorLabel.setForeground(Color.decode("#FFFFFF"));
        addTutorLabel.setFont(titleFont);
        addTutorTitlePanel.add(addTutorLabel);

        // Creating JLabel for adding a teacher ID
        tutorIdLabel = new JLabel("Teacher ID");
        tutorIdLabel.setBounds(10, 65, 150, 30);
        tutorIdLabel.setFont(textfieldFont);
        addTutorPanel.add(tutorIdLabel);

        // Creating JTextField for tutor's Id
        tutorIdTextField = new JTextField();
        tutorIdTextField.setBounds(175, 65, 200, 30);
        addTutorPanel.add(tutorIdTextField);

        // Creating JLabel for adding a tutor name
        tutorNameLabel = new JLabel("Teacher Name");
        tutorNameLabel.setBounds(10, 105, 150, 30);
        tutorNameLabel.setFont(textfieldFont);
        addTutorPanel.add(tutorNameLabel);

        // Creating JTextField for tutor's name
        tutorNameTextField = new JTextField();
        tutorNameTextField.setBounds(175, 105, 200, 30);
        addTutorPanel.add(tutorNameTextField);

        // Creating JLabel for adding a tutor address
        tutorAddressLabel = new JLabel("Address");
        tutorAddressLabel.setBounds(10, 145, 150, 30);
        tutorAddressLabel.setFont(textfieldFont);
        addTutorPanel.add(tutorAddressLabel);

        // Creating JTextField for tutor's address
        tutorAddressTextField = new JTextField();
        tutorAddressTextField.setBounds(175, 145, 200, 30);
        addTutorPanel.add(tutorAddressTextField);

        // Creating JLabel for tutor's working type
        tutorWorkingTypeLabel = new JLabel("Working Type");
        tutorWorkingTypeLabel.setBounds(10, 185, 150, 30);
        tutorWorkingTypeLabel.setFont(textfieldFont);
        addTutorPanel.add(tutorWorkingTypeLabel);

        // Creating JTextField for tutor's working type
        tutorWorkingTypeTextField = new JTextField();
        tutorWorkingTypeTextField.setBounds(175, 185, 200, 30);
        addTutorPanel.add(tutorWorkingTypeTextField);

        // Creating JLabel for tutor's employment status
        tutorEmploymentStatusLabel = new JLabel("Employment Status");
        tutorEmploymentStatusLabel.setBounds(10, 225, 150, 30);
        tutorEmploymentStatusLabel.setFont(textfieldFont);
        addTutorPanel.add(tutorEmploymentStatusLabel);

        // Creating JTextField for tutor's employment status
        tutorEmploymentStatusTextField = new JTextField();
        tutorEmploymentStatusTextField.setBounds(175, 225, 200, 30);
        addTutorPanel.add(tutorEmploymentStatusTextField);

        // Creating JLabel for tutor's working hours
        tutorWorkingHoursLabel = new JLabel("Working Hours");
        tutorWorkingHoursLabel.setBounds(10, 265, 150, 30);
        tutorWorkingHoursLabel.setFont(textfieldFont);
        addTutorPanel.add(tutorWorkingHoursLabel);

        // Creating JTextField for tutor's working hours
        tutorWorkingHoursTextField = new JTextField();
        tutorWorkingHoursTextField.setBounds(175, 265, 200, 30);
        addTutorPanel.add(tutorWorkingHoursTextField);

        // Creating JLabel for tutor's salary
        tutorSalaryLabel = new JLabel("Salary");
        tutorSalaryLabel.setBounds(10, 305, 150, 30);
        tutorSalaryLabel.setFont(textfieldFont);
        addTutorPanel.add(tutorSalaryLabel);

        // Creating JTextField for tutor's salary
        tutorSalaryTextField = new JTextField();
        tutorSalaryTextField.setBounds(175, 305, 200, 30);
        addTutorPanel.add(tutorSalaryTextField);

        // Creating JLabel for tutor's specialization
        tutorSpecializationLabel = new JLabel("Specialization");
        tutorSpecializationLabel.setBounds(10, 345, 150, 30);
        tutorSpecializationLabel.setFont(textfieldFont);
        addTutorPanel.add(tutorSpecializationLabel);

        // Creating JTextField for tutor's specialization
        tutorSpecializationTextField = new JTextField();
        tutorSpecializationTextField.setBounds(175, 345, 200, 30);
        addTutorPanel.add(tutorSpecializationTextField);

        // Creating JLabel for tutor's academic qualification
        tutorAcademicQualificationLabel = new JLabel("Academic Qualification");
        tutorAcademicQualificationLabel.setBounds(10, 385, 200, 30);
        tutorAcademicQualificationLabel.setFont(textfieldFont);
        addTutorPanel.add(tutorAcademicQualificationLabel);

        // Creating JTextField for academic qualification
        tutorAcademicQualificationTextField = new JTextField();
        tutorAcademicQualificationTextField.setBounds(175, 385, 200, 30);
        addTutorPanel.add(tutorAcademicQualificationTextField);

        // Creating JLabel for performance index
        tutorPerformanceIndexLabel = new JLabel("Performance Index");
        tutorPerformanceIndexLabel.setBounds(10, 425, 150, 30);
        tutorPerformanceIndexLabel.setFont(textfieldFont);
        addTutorPanel.add(tutorPerformanceIndexLabel);

        // Creating JTextField for performance index
        tutorPerformanceIndexTextField = new JTextField();
        tutorPerformanceIndexTextField.setBounds(175, 425, 200, 30);
        addTutorPanel.add(tutorPerformanceIndexTextField);

        // Creating JButton to add tutor
        addTutorButton = new JButton("ADD TUTOR");
        addTutorButton.setBounds(120, 470, 200, 35);
        addTutorButton.setBackground(Color.decode("#AD8B73"));
        addTutorButton.setForeground(Color.white);
        addTutorButton.setFont(buttonFont);
        addTutorButton.setFocusPainted(false);
        addTutorPanel.add(addTutorButton);
        addTutorButton.addActionListener(e -> {
            addTutor();
        });

        // Creating panel for setting salary
        setSalaryPanel = new JPanel(null);
        setSalaryPanel.setBounds(450, 50, 300, 300);
        mainTutorPanel.add(setSalaryPanel);

        // Adding border to setSalaryPanel
        setSalaryBorder = BorderFactory.createLineBorder(Color.BLACK, 2);
        setSalaryPanel.setBorder(setSalaryBorder);

        // Creating panel for title in setSalaryPanel
        setSalaryTitlePanel = new JPanel(null);
        setSalaryTitlePanel.setBounds(2, 2, 296, 50);
        setSalaryTitlePanel.setBackground(Color.decode("#135D66"));// putting a custom background color in this panel
        setSalaryPanel.add(setSalaryTitlePanel);

        // Creating JLabel for "SET NEW SALARY" title
        setSalaryLabel = new JLabel("SET NEW SALARY");
        setSalaryLabel.setBounds(45, 1, 290, 50);
        setSalaryLabel.setForeground(Color.decode("#FFFFFF"));
        setSalaryLabel.setFont(titleFont);
        setSalaryTitlePanel.add(setSalaryLabel);

        // Creating JLabel for "Teacher ID" in setSalaryPanel
        setSalaryIdLabel = new JLabel("Teacher ID");
        setSalaryIdLabel.setBounds(20, 60, 200, 30);
        setSalaryIdLabel.setFont(textfieldFont);
        setSalaryPanel.add(setSalaryIdLabel);

        // Creating JTextField for entering teacher ID in setSalaryPanel
        setSalaryIdTextField = new JTextField();
        setSalaryIdTextField.setBounds(20, 85, 250, 30);
        setSalaryPanel.add(setSalaryIdTextField);

        // Creating JLabel for "New Salary" in setSalaryPanel
        setSalaryNewSalaryLabel = new JLabel("New Salary");
        setSalaryNewSalaryLabel.setBounds(20, 120, 200, 30);
        setSalaryNewSalaryLabel.setFont(textfieldFont);
        setSalaryPanel.add(setSalaryNewSalaryLabel);

        // Creating JTextField for entering new salary in setSalaryPanel
        setSalaryNewSalaryTextField = new JTextField();
        setSalaryNewSalaryTextField.setBounds(20, 145, 250, 30);
        setSalaryPanel.add(setSalaryNewSalaryTextField);

        // Creating JLabel for "New Performance Index" in setSalaryPanel
        setSalaryPerformanceIndexLabel = new JLabel("New Performance Index");
        setSalaryPerformanceIndexLabel.setBounds(20, 180, 200, 30);
        setSalaryPerformanceIndexLabel.setFont(textfieldFont);
        setSalaryPanel.add(setSalaryPerformanceIndexLabel);

        // Creating JTextField for entering new performance index in setSalaryPanel
        setSalaryPerformanceIndexTextField = new JTextField();
        setSalaryPerformanceIndexTextField.setBounds(20, 205, 250, 30);
        setSalaryPanel.add(setSalaryPerformanceIndexTextField);

        // Creating JButton for adding salary in setSalaryPanel
        setSalaryButton = new JButton("ADD SALARY");
        setSalaryButton.setBounds(70, 250, 180, 32);
        setSalaryButton.setBackground(Color.decode("#AD8B73"));
        setSalaryButton.setForeground(Color.white);
        setSalaryButton.setFont(buttonFont);
        setSalaryButton.setFocusPainted(false);
        setSalaryPanel.add(setSalaryButton);
        setSalaryButton.addActionListener(e -> {
            setSalary();
        });

        // Creating panel for removing tutor
        removeTutorPanel = new JPanel(null);
        removeTutorPanel.setBounds(450, 360, 300, 150);
        mainTutorPanel.add(removeTutorPanel);

        // Adding border to removeTutorPanel
        removeTutorBorder = BorderFactory.createLineBorder(Color.BLACK, 2);
        removeTutorPanel.setBorder(removeTutorBorder);

        // Creating panel for title in removeTutorPanel
        removeTutorTitlePanel = new JPanel(null);
        removeTutorTitlePanel.setBounds(2, 2, 296, 45);
        removeTutorTitlePanel.setBackground(Color.decode("#135D66"));// putting a custom background color in this panel
        removeTutorPanel.add(removeTutorTitlePanel);

        // Creating JLabel for "REMOVE TUTOR" in removeTutorTitlePanel
        removeTutorLabel = new JLabel("REMOVE TUTOR");
        removeTutorLabel.setBounds(50, 1, 290, 45);
        removeTutorLabel.setForeground(Color.decode("#FFFFFF"));
        removeTutorLabel.setFont(titleFont);
        removeTutorTitlePanel.add(removeTutorLabel);

        // Creating JLabel for "Teacher ID" in removeTutorPanel
        removeTutorIdLabel = new JLabel("Teacher ID");
        removeTutorIdLabel.setBounds(10, 60, 100, 30);
        removeTutorIdLabel.setFont(textfieldFont);
        removeTutorPanel.add(removeTutorIdLabel);

        // Creating JTextField for entering teacher ID in removeTutorPanel
        removeTutorIdTextField = new JTextField();
        removeTutorIdTextField.setBounds(100, 60, 180, 30);
        removeTutorPanel.add(removeTutorIdTextField);

        // Creating JButton for removing tutor in removeTutorPanel
        removeTutorButton = new JButton("REMOVE TUTOR");
        removeTutorButton.setBounds(70, 105, 180, 32);
        removeTutorButton.setBackground(Color.decode("#C62323"));
        removeTutorButton.setForeground(Color.white);
        removeTutorButton.setFont(buttonFont);
        removeTutorButton.setFocusPainted(false);
        removeTutorPanel.add(removeTutorButton);
        removeTutorButton.addActionListener(e -> {
            removeTutor();
        });

        // Creating JButton for clearing all fields in mainTutorPanel
        clearTutorButton = new JButton("CLEAR   ALL   FIELDS");
        clearTutorButton.setBounds(450, 520, 298, 50);
        clearTutorButton.setBackground(Color.decode("#EEEEEE"));
        clearTutorButton.setFont(buttonFont);
        clearTutorButton.setFocusPainted(false);
        clearTutorButton.setForeground(Color.black);
        clearTutorButton.setBorder(addTutorBorder);
        mainTutorPanel.add(clearTutorButton);
        clearTutorButton.addActionListener(e -> {
            clearTutor();
        });

        // Adding mainTutorPanel to contentPanel
        contentPanel.add(mainTutorPanel);
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    // content for display
    private void displayContent() {
        // Removing all components from content panel
        contentPanel.removeAll();

        // Creating a titled border for display panel
        displayBorder = BorderFactory.createTitledBorder("Display");

        // Creating JLabel for welcome message
        welcomeLabel = new JLabel("Teacher Management System");
        welcomeLabel.setBounds(150, 50, 600, 70);
        welcomeLabel.setFont(welcome2Font);
        contentPanel.add(welcomeLabel);

        // Creating JLabel for secondary welcome message
        welcome2Label = new JLabel(
                "your all-in-one solution for efficient administration and seamless collaboration.");
        welcome2Label.setBounds(175, 100, 700, 30);
        welcome2Label.setFont(welcomeFont);
        contentPanel.add(welcome2Label);

        // Creating JLabel for tertiary welcome message
        welcome3Label = new JLabel("Let's simplify tasks and unite efforts to elevate education together!");
        welcome3Label.setBounds(205, 115, 600, 30);
        welcome3Label.setFont(welcomeFont);
        contentPanel.add(welcome3Label);

        // Creating JPanel for display section
        displayPanel = new JPanel(null);
        displayPanel.setBounds(180, 220, 450, 250);
        displayPanel.setBorder(displayBorder);
        contentPanel.add(displayPanel);

        // Creating JLabel for search instruction
        displayLabel = new JLabel("Search our Teacher ");
        displayLabel.setBounds(100, 20, 500, 40);
        displayLabel.setFont(menuFont);
        displayPanel.add(displayLabel);

        // Creating JLabel for ID label
        displayIdLabel = new JLabel("ID");
        displayIdLabel.setBounds(20, 90, 70, 40);
        displayIdLabel.setFont(menuFont);
        displayPanel.add(displayIdLabel);

        // Creating JTextField for entering ID
        displayIdTextField = new JTextField();
        displayIdTextField.setBounds(100, 90, 200, 40);
        displayPanel.add(displayIdTextField);

        // Creating JButton for displaying information
        displayIdButton = new JButton("DISPLAY");
        displayIdButton.setBounds(310, 90, 130, 40);
        displayIdButton.setBackground(Color.decode("#AD8B73"));
        displayIdButton.setForeground(Color.white);
        displayIdButton.setFont(buttonFont);
        displayIdButton.setFocusPainted(false);
        displayPanel.add(displayIdButton);
        displayIdButton.addActionListener(e -> {

            displayID();
        });

        // Creating JLabel for "OR" label
        displayAllLabel = new JLabel("OR");
        displayAllLabel.setBounds(20, 180, 70, 40);
        displayAllLabel.setFont(menuFont);
        displayPanel.add(displayAllLabel);

        buttonBorder = BorderFactory.createLineBorder(Color.BLACK, 2);

        // Creating JButton for displaying all teachers
        displayAllButton = new JButton("DISPLAY   ALL   TEACHERS");
        displayAllButton.setBounds(100, 180, 220, 40);
        displayAllButton.setBackground(Color.decode("#EEEEEE"));
        displayAllButton.setForeground(Color.BLACK);
        displayAllButton.setFont(buttonFont);
        displayAllButton.setFocusPainted(false);
        displayAllButton.setBorder(buttonBorder);
        displayPanel.add(displayAllButton);
        displayAllButton.addActionListener(e -> {
            displayAllTeachers();
        });

        contentPanel.revalidate();
        contentPanel.repaint();

    }

    // method for adding lecturer to arraylist
    private void addLecturer() {
        try {
            // Getting all necessary data from text fields
            String teachId = getText(lecturerIdTextField);
            String teachName = getText(lecturerNameTextField);
            String teachAddress = getText(lecturerAddressTextField);
            String teachWorking = getText(lecturerWorkingTypeTextField);
            String teachStatus = getText(lecturerEmploymentStatusTextField);
            String teachDepartment = getText(lecturerDepartmentTextField);
            String teachExperience = getText(lecturerYearsOfExperienceTextField);
            String teachHours = getText(lecturerWorkingHourTextField);

            // Converting string to integer
            int id = toInt(teachId);
            int experience = toInt(teachExperience);
            int hour = toInt(teachHours);

            // checking if id is unique
            if (isIdUnique(id)) {
                JOptionPane.showMessageDialog(frame, "ID already exists!", "Invalid ID",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            // creating object of lecturer
            Lecturer lecturer = new Lecturer(id, teachName, teachAddress, teachWorking, teachStatus, teachDepartment,
                    experience, hour);
            teacherList.add(lecturer); // adding the object to an arraylist

            JOptionPane.showMessageDialog(frame, "Lecturer successfully added.", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        // catching exception when invalid data type is entered
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "Teacher ID, Years of Experience and Working Hours should be in number.", "Invalid input!",
                    JOptionPane.ERROR_MESSAGE);
        }
        // exception handling if textfield are empty
        catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(frame, "Fill all the Fields.", "Empty Field", JOptionPane.ERROR_MESSAGE);
        }
    }

    // method for calling grade Assignment
    private void gradeScore() {
        try {
            // fetching data from grade assignment
            String msg = "";
            String teachId = getText(gradeAssignmentIdTextField);
            String gradScore = getText(gradeScoreTextField);
            String teachDepartment = getText(gradeDepartmentTextField);
            String teachExperience = getText(gradeYearsOfExperienceTextField);

            // changing data type as required
            int id = toInt(teachId);
            int gradedScore = toInt(gradScore);
            int experience = toInt(teachExperience);

            // Checking if graded score is within valid range
            if (gradedScore > 100) {
                JOptionPane.showMessageDialog(frame, "Graded score should be between 0-100", "Invalid Score!",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Retrieving teacher by ID
            Teacher teacher = getId(id);

            // Handling case if teacher with given ID is not found
            if (teacher == null) {
                JOptionPane.showMessageDialog(frame, "No teacher found of this ID", "No ID found!",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Checking if the teacher is a Lecturer
            if (!(teacher instanceof Lecturer)) {
                JOptionPane.showMessageDialog(frame, "Tutor cannot assgin grade.\n Please! Enter a lecturer ID:",
                        "INVALID", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Casting teacher to Lecturer
            Lecturer lecturer = (Lecturer) teacher;

            // Checking if lecturer meets qualifications
            if (!(experience >= 5 && teachDepartment.equals(lecturer.getDepartment()))) {
                JOptionPane.showMessageDialog(frame,
                        "Lecturer's department not same or \n Working hour not qualified! ",
                        "Not Qualified", JOptionPane.ERROR_MESSAGE);
            } else {
                msg = "Do you want to grade the assignment? \n \n";
                msg += "Teacher ID:  " + id + "\n";
                msg += "Graded Score: " + gradedScore + "\n";
                msg += "Department: " + teachDepartment + "\n";
                msg += "Years of Experience: " + experience + "\n";
                int comfirm = JOptionPane.showConfirmDialog(frame, msg, "Comfirm", JOptionPane.OK_CANCEL_OPTION);
                if (comfirm == JOptionPane.OK_OPTION) {
                    lecturer.gradeAssignment(gradedScore, teachDepartment, experience);
                    JOptionPane.showMessageDialog(frame, "Assignment successfully graded.", "Successfull",
                            JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
        }
        // catching exception when invalid data type is entered
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "Teacher ID, Years of Experience and Working Hours should be in positive number.", "Invalid input!",
                    JOptionPane.ERROR_MESSAGE);
        }
        // exception handling if textfield are empty
        catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(frame, "Fill all the Fields.", "Empty Field", JOptionPane.ERROR_MESSAGE);
        }
    }

    // method for adding tutor to the arraylist
    private void addTutor() {
        try {
            // fetching data from tutor textfields'
            String teachId = getText(tutorIdTextField);
            String teachName = getText(tutorNameTextField);
            String teachAddress = getText(tutorAddressTextField);
            String teachWorking = getText(tutorWorkingTypeTextField);
            String teachStatus = getText(tutorEmploymentStatusTextField);
            String teachHours = getText(tutorWorkingHoursTextField);
            String teachSalary = getText(tutorSalaryTextField);
            String teachSpecialization = getText(tutorSpecializationTextField);
            String teachQualification = getText(tutorAcademicQualificationTextField);
            String teachPerformance = getText(tutorPerformanceIndexTextField);

            // changing data type of some as needed
            int id = toInt(teachId);
            int hours = toInt(teachHours);
            int performIndex = toInt(teachPerformance);
            double salary = Double.parseDouble(teachSalary);

            // checking if ID's are unique
            if (isIdUnique(id)) {
                JOptionPane.showMessageDialog(frame, "ID already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // creating a objective of tutor
            Tutor tutor = new Tutor(id, teachName, teachAddress, teachWorking, teachStatus, hours, salary,
                    teachSpecialization, teachQualification, performIndex);

            // Adding tutor to arraylist
            teacherList.add(tutor);

            JOptionPane.showMessageDialog(frame, "Tutor successfully added.", "Successfull",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        // catching exception when invalid data type is entered
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "Teacher ID, Working Hours, Salary and Performance Index should be in positive number.",
                    "Invalid input!",
                    JOptionPane.ERROR_MESSAGE);
        }
        // exception handling if textfield are empty
        catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(frame, "Fill all the Fields.", "Empty Field", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void setSalary() {
        try {
            // getting data from set salary text fields
            String teachId = getText(setSalaryIdTextField);
            String teachSalary = getText(setSalaryNewSalaryTextField);
            String teachIndex = getText(setSalaryPerformanceIndexTextField);

            // changing data type as needed
            int id = toInt(teachId);
            double salary = Double.parseDouble(teachSalary);
            int index = toInt(teachIndex);

            if (index > 10) {
                JOptionPane.showMessageDialog(frame, "Performance index should be between (0-10)", "Invalid index",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Getting the teacher by ID
            Teacher teacher = getId(id);
            if (teacher == null) {
                JOptionPane.showMessageDialog(frame, "No teacher found of this ID", "No ID found!",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Checking if the teacher is a Tutor
            if (!(teacher instanceof Tutor)) {
                JOptionPane.showMessageDialog(frame, "Lecturer's salary cannot be set. \n Enter a Tutor's ID:",
                        "INVALID", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Tutor tutor = (Tutor) teacher;
            if (!(index >= 5 && tutor.getWorkingHours() > 20)) {
                JOptionPane.showMessageDialog(frame, "Insufficient working hour or \n Performance index", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            int comfirm = JOptionPane.showConfirmDialog(frame, "Do you want to set salary?", "Comfirm?",
                    JOptionPane.OK_CANCEL_OPTION);
            if (comfirm == JOptionPane.OK_OPTION) {
                tutor.setSalaryPerformance(salary, index);
                JOptionPane.showMessageDialog(frame,
                        "Teacher's salary approval successfull. \n" + "New Salary: " + tutor.getSalary(),
                        "Sucessfull", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }

        // catching exception when invalid data type is entered
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "Teacher ID, Salary and Performance Index should be in positive number.", "Invalid input!",
                    JOptionPane.ERROR_MESSAGE);
        }
        // exception handling if textfield are empty
        catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(frame, "Fill all the Fields.", "Empty Field", JOptionPane.ERROR_MESSAGE);
        }
    }

    // method for calling remove tutor
    private void removeTutor() {
        try {
            // Getting data from remove tutor text field
            String teachId = getText(removeTutorIdTextField);
            int id = toInt(teachId);

            // Getting the teacher by ID
            Teacher teacher = getId(id);
            if (teacher == null) {
                // Checking if the teacher is a Tutor
                JOptionPane.showMessageDialog(frame, "No teacher found of this ID.", "Invalid ID",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!(teacher instanceof Tutor)) {
                JOptionPane.showMessageDialog(frame, "Given ID is of Lecturer \n Cannot remove!", "Invalid ID",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            Tutor tutor = (Tutor) teacher;
            if (tutor.getIsCertified()) {
                JOptionPane.showMessageDialog(frame, "Certified tutor cannot be removed", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            int comfirm = JOptionPane.showConfirmDialog(frame, "Do you want remove the Tutor?", "Comfirm?",
                    JOptionPane.OK_CANCEL_OPTION);
            if (comfirm == JOptionPane.OK_OPTION) {
                tutor.removeTutor();
                JOptionPane.showMessageDialog(frame, "Tutor successfully removed.", "Successful",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
        // catching exception when invalid data type is entered
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "Teacher ID be in positive number.", "Invalid input!", JOptionPane.ERROR_MESSAGE);
        }
        // exception handling if textfield are empty
        catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(frame, "Fill all the Fields.", "Empty Field", JOptionPane.ERROR_MESSAGE);
        }
    }

    // method for clearing all lecturer textfields'
    private void clearLecturer() {
        lecturerIdTextField.setText("");
        lecturerNameTextField.setText("");
        lecturerAddressTextField.setText("");
        lecturerWorkingTypeTextField.setText("");
        lecturerEmploymentStatusTextField.setText("");
        lecturerDepartmentTextField.setText("");
        lecturerYearsOfExperienceTextField.setText("");
        lecturerWorkingHourTextField.setText("");

        gradeAssignmentIdTextField.setText("");
        gradeScoreTextField.setText("");
        gradeDepartmentTextField.setText("");
        gradeYearsOfExperienceTextField.setText("");
    }

    // for clearing tutor text fields
    private void clearTutor() {
        tutorIdTextField.setText("");
        tutorNameTextField.setText("");
        tutorAddressTextField.setText("");
        tutorWorkingTypeTextField.setText("");
        tutorEmploymentStatusTextField.setText("");
        tutorWorkingHoursTextField.setText("");
        tutorSalaryTextField.setText("");
        tutorSpecializationTextField.setText("");
        tutorAcademicQualificationTextField.setText("");
        tutorPerformanceIndexTextField.setText("");

        setSalaryIdTextField.setText("");
        setSalaryNewSalaryTextField.setText("");
        setSalaryPerformanceIndexTextField.setText("");

        removeTutorIdTextField.setText("");
    }

    // method for calling display teacher
    private void displayID() {
        try {
            // Getting teacher ID from text field
            String teachID = getText(displayIdTextField);

            // Converting ID to integer
            int id = toInt(teachID);

            // Getting teacher by ID
            Teacher teacher = getId(id);

            // checking if teacher id is registered or not
            if (teacher == null) {
                JOptionPane.showMessageDialog(frame, "No teacher registered of this ID!", "Invalid ID",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Displaying teacher information
            displayPane(teacher);
        }
        // Catching exception thrown when changing the data type
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, " Teacher ID must be a positive number", "Invalid Input",
                    JOptionPane.ERROR_MESSAGE);
        }
        // Catching exception thrown if any of the field is empty
        catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(frame, "Fill the TeacherId Field.", "Empty Field",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void displayPane(Teacher teacher) {
        String msg = "";

        // Constructing teacher information message
        msg = "Teacher Id: " + teacher.getTeacherId() + "\n";
        msg += "Teacher Name: " + teacher.getTeacherName() + "\n";
        msg += "Address: " + teacher.getAddress() + "\n";
        msg += "Working Type: " + teacher.getWorkingType() + "\n";
        msg += "Employment Status: " + teacher.getEmploymentStatus() + "\n";
        // Checking if working hours are available
        if (teacher.getWorkingHours() > 0) {
            msg += "Working Hours: " + teacher.getWorkingHours() + "\n";
        }

        // Additional information for specific teacher types: Lecturer or Tutor
        if (teacher instanceof Lecturer) {
            Lecturer lecturer = (Lecturer) teacher;
            msg += "Department: " + lecturer.getDepartment() + "\n";
            msg += "Years Of Experience: " + lecturer.getYearsOfExperience() + "\n";
            // Checking if lecturer has graded assignments
            if (lecturer.getHasGraded()) {
                msg += "Graded Score: " + lecturer.getGradedScore() + "\n";
            } else {
                msg += "The lecturer has not graded the assignment yet!";
            }
        } else {
            Tutor tutor = (Tutor) teacher;
            // Checking if tutor is certified
            if (tutor.getIsCertified()) {
                msg += "Salary: " + tutor.getSalary() + "\n";
                msg += "Specialization: " + tutor.getSpecialization() + "\n";
                msg += "Academic Qualifications: " + tutor.getAcademicQualifications() + "\n";
                msg += "Performance Index: " + tutor.getPerformanceIndex() + "\n";
            }
        }
        // Displaying teacher information in message dialog
        teacher.display();
        String title = "";
        // Setting title based on teacher type
        if (teacher instanceof Lecturer) {
            title = "Lecturer Info";
        } else {
            title = "Tutor info";
        }

        // Showing message dialog with teacher information
        JOptionPane.showMessageDialog(frame, msg, title, JOptionPane.INFORMATION_MESSAGE);
    }

    // textfield trimmer
    private String getText(JTextField tf) {
        // Trimming and retrieving text content from the JTextField
        String content = tf.getText().trim();
        // Checking if the content is empty
        if (content.isEmpty()) {
            // Throwing an exception if the content is empty
            throw new IllegalArgumentException();
        }
        return content;
    }

    // methond for converting string into int
    private int toInt(String text) {
        // Parsing the string into an integer value
        int intValue = Integer.parseInt(text);
        // Checking if the integer value is negative
        if (intValue < 0) {
            // Throwing a NumberFormatException if the integer value is negative
            throw new NumberFormatException();
        }
        return intValue;
    }

    // to check if id are unique
    private boolean isIdUnique(int teachId) {
        // Iterating over the list of teachers
        for (Teacher teacher : teacherList) {
            // Checking if the teacher's ID matches the provided ID
            if (teacher.getTeacherId() == teachId) {
                // Returning true if the ID is found (not unique)
                return true;
            }
        }
        // Returning false if the ID is not found (unique)
        return false;
    }

    // for getting teacher by ID
    private Teacher getId(int id) {
        // Iterating over the list of teachers
        for (Teacher teacher : teacherList) {
            // Checking if the teacher's ID matches the provided ID
            if (teacher.getTeacherId() == id) {
                // Returning the teacher if the ID is found
                return teacher;
            }
        }
        return null;
    }

    private void displayAllTeachers() {
        // Check if there are any teachers registered
        if (teacherList.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "No teachers registered!", "Empty List",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String msg = "List of Teachers:\n\n";

        // Iterate through each teacher in the teacher list
        for (Teacher teacher : teacherList) {
            // Add the teacher's ID, name, address, working type, and employment status to
            // the message
            msg += "Teacher ID: " + teacher.getTeacherId() + "\n";
            msg += "Name: " + teacher.getTeacherName() + "\n";
            msg += "Address: " + teacher.getAddress() + "\n";
            msg += "Working Type: " + teacher.getWorkingType() + "\n";
            msg += "Employment Status: " + teacher.getEmploymentStatus() + "\n";
            // Checking if working hours are available
            if (teacher.getWorkingHours() > 0) {
                msg += "Working Hours: " + teacher.getWorkingHours() + "\n";
            }

            // Check if the teacher is a lecturer
            if (teacher instanceof Lecturer) {
                // Add additional information specific to lecturers
                Lecturer lecturer = (Lecturer) teacher;
                msg += "Type: Lecturer\n";
                msg += "Department: " + lecturer.getDepartment() + "\n";
                msg += "Years Of Experience: " + lecturer.getYearsOfExperience() + "\n";
                // Check if the lecturer has graded assignments
                if (lecturer.getHasGraded()) {
                    msg += "Graded Score: " + lecturer.getGradedScore() + "\n";
                } else {
                    msg += "The lecturer has not graded the assignment yet!\n";
                }
                // Check if the teacher is a tutor
            } else if (teacher instanceof Tutor) {
                // Add additional information specific to tutors
                Tutor tutor = (Tutor) teacher;
                msg += "Type: Tutor\n";
                // Check if the tutor is certified
                if (tutor.getIsCertified()) {
                    msg += "Salary: " + tutor.getSalary() + "\n";
                    msg += "Specialization: " + tutor.getSpecialization() + "\n";
                    msg += "Academic Qualifications: " + tutor.getAcademicQualifications() + "\n";
                    msg += "Performance Index: " + tutor.getPerformanceIndex() + "\n";
                }
            }
            // Add a newline to separate each teacher's information in the message
            msg += "\n";
        }

        // Display the message containing all teacher information in a dialog box
        JOptionPane.showMessageDialog(frame, msg, "List of Teachers",
                JOptionPane.PLAIN_MESSAGE);
    }

}
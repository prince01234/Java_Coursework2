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

    // instance variables for lecturer content
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

    // instances for tutor content
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

    // instances for display content
    JLabel displayLabel, displayIdLabel, displayAllLabel;
    JPanel displayPanel;
    JTextField displayIdTextField;
    JButton displayIdButton, displayAllButton;
    Border displayBorder;

    // creating arraylist
    private ArrayList<Teacher> teacherList = new ArrayList<Teacher>();

    public GUi() {
        // creating Java GUI frame
        frame = new JFrame("Teacher Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50, 50, 1100, 625);

        // setting up all fonts used in this gui
        titleFont = new Font("Arial Black", Font.PLAIN, 20);
        textfieldFont = new Font("Yu Gothic UI Semibold", Font.PLAIN, 15);
        buttonFont = new Font("Copperplate Gothic Bold", Font.PLAIN, 13);
        menuFont = new Font("MV Boli", Font.BOLD, 20);
        welcomeFont = new Font("Goudy Old Style", Font.ITALIC, 17);
        welcome2Font = new Font("MV Boli", Font.BOLD, 30);

        // creating main panel to put content together
        mainPanel = new JPanel(null); // Null layout
        mainPanel.setSize(1100, 600); // Seting preferred size

        // creating menu panel to nagivate management system
        menuPanel = new JPanel(null); // null layout for menu panel
        menuPanel.setBounds(0, 0, 300, 600); // setting bounds for menu panel

        // Adding border to the menu panel
        menuBorder = BorderFactory.createTitledBorder("Main Menu");
        menuPanel.setBorder(menuBorder);

        menuLabel = new JLabel("Teacher Management");
        menuLabel.setBounds(25, 50, 220, 50);
        menuLabel.setFont(menuFont);
        menuPanel.add(menuLabel);

        menuLabel2 = new JLabel("System");
        menuLabel2.setBounds(120, 80, 100, 50);
        menuLabel2.setFont(menuFont);
        menuPanel.add(menuLabel2);

        lecturerButton = new JButton("LECTURER SECTION");
        lecturerButton.setBounds(50, 150, 200, 50);
        lecturerButton.setFocusPainted(false);
        lecturerButton.setFont(buttonFont);
        lecturerButton.setBackground(Color.decode("#6AD4DD"));
        lecturerButton.setForeground(Color.WHITE);
        menuPanel.add(lecturerButton);

        tutorButton = new JButton("TUTOR SECTION");
        tutorButton.setBounds(50, 250, 200, 50);
        tutorButton.setFocusPainted(false);
        tutorButton.setFont(buttonFont);
        tutorButton.setBackground(Color.decode("#6AD4DD"));
        tutorButton.setForeground(Color.WHITE);
        menuPanel.add(tutorButton);

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
        welcomeLabel = new JLabel("Teacher Management System");
        welcomeLabel.setBounds(150, 50, 600, 70);
        welcomeLabel.setFont(welcome2Font);
        contentPanel.add(welcomeLabel);

        welcome2Label = new JLabel(
                "your all-in-one solution for efficient administration and seamless collaboration.");
        welcome2Label.setBounds(175, 100, 700, 30);
        welcome2Label.setFont(welcomeFont);
        contentPanel.add(welcome2Label);

        welcome3Label = new JLabel("Let's simplify tasks and unite efforts to elevate education together!");
        welcome3Label.setBounds(205, 115, 600, 30);
        welcome3Label.setFont(welcomeFont);
        contentPanel.add(welcome3Label);

        // panel for display section
        displayPanel = new JPanel(null);
        displayPanel.setBounds(180, 220, 450, 250);
        displayPanel.setBorder(displayBorder);
        contentPanel.add(displayPanel);

        displayLabel = new JLabel("Search our Teachers: ");
        displayLabel.setBounds(100, 20, 500, 40);
        displayLabel.setFont(menuFont);
        displayPanel.add(displayLabel);

        displayIdLabel = new JLabel("ID");
        displayIdLabel.setBounds(20, 90, 70, 40);
        displayIdLabel.setFont(menuFont);
        displayPanel.add(displayIdLabel);

        displayIdTextField = new JTextField();
        displayIdTextField.setBounds(100, 90, 200, 40);
        displayPanel.add(displayIdTextField);

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

        displayAllLabel = new JLabel("OR");
        displayAllLabel.setBounds(20, 180, 70, 40);
        displayAllLabel.setFont(menuFont);
        displayPanel.add(displayAllLabel);

        buttonBorder = BorderFactory.createLineBorder(Color.BLACK, 2);

        displayAllButton = new JButton("DISPLAY   ALL   TEACHERS");
        displayAllButton.setBounds(100, 180, 220, 40);
        displayAllButton.setBackground(Color.decode("#EEEEEE"));
        displayAllButton.setForeground(Color.BLACK);
        displayAllButton.setFont(buttonFont);
        displayAllButton.setFocusPainted(false);
        displayAllButton.setBorder(buttonBorder);
        displayPanel.add(displayAllButton);

        // Add the panels to the main panel
        mainPanel.add(menuPanel);
        mainPanel.add(contentPanel);

        // Add main panel to the frame
        frame.add(mainPanel);

        // content for lecturer section
        lecturerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lecturerContent();
            };
        });
        // content for tutor section
        tutorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tutorContent();
            }
        });

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayContent();
            }
        });

        frame.setResizable(false);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUi();
    }

    // content for lecturer panel
    private void lecturerContent() {
        contentPanel.removeAll();

        mainLecturerPanel = new JPanel(null);
        mainLecturerPanel.setBounds(0, 0, 800, 600);

        // adding border to content panel
        mainLecturerBorder = BorderFactory.createTitledBorder("Lecturer Section");
        mainLecturerPanel.setBorder(mainLecturerBorder);

        addLecturerPanel = new JPanel(null);
        addLecturerPanel.setBounds(50, 50, 390, 515);
        mainLecturerPanel.add(addLecturerPanel);

        addLecturerBorder = BorderFactory.createLineBorder(Color.BLACK, 2);
        addLecturerPanel.setBorder(addLecturerBorder);

        addLecturerTitlePanel = new JPanel(null);
        addLecturerTitlePanel.setBounds(2, 2, 386, 50);
        addLecturerTitlePanel.setBackground(Color.decode("#135D66"));// putting a custom background color in this panel
        addLecturerPanel.add(addLecturerTitlePanel);

        addLecturerLabel = new JLabel("ADD A NEW LECTURER");
        addLecturerLabel.setBounds(70, 1, 362, 50);
        addLecturerLabel.setForeground(Color.decode("#FFFFFF"));
        addLecturerLabel.setFont(titleFont);
        addLecturerTitlePanel.add(addLecturerLabel);

        lecturerIdLabel = new JLabel("Teacher ID");
        lecturerIdLabel.setBounds(10, 70, 150, 30);
        lecturerIdLabel.setFont(textfieldFont);
        addLecturerPanel.add(lecturerIdLabel);

        lecturerIdTextField = new JTextField();
        lecturerIdTextField.setBounds(175, 70, 200, 30);
        addLecturerPanel.add(lecturerIdTextField);

        lecturerNameLabel = new JLabel("Teacher Name");
        lecturerNameLabel.setBounds(10, 120, 150, 30);
        lecturerNameLabel.setFont(textfieldFont);
        addLecturerPanel.add(lecturerNameLabel);

        lecturerNameTextField = new JTextField();
        lecturerNameTextField.setBounds(175, 120, 200, 30);
        addLecturerPanel.add(lecturerNameTextField);

        lecturerAddressLabel = new JLabel("Address");
        lecturerAddressLabel.setBounds(10, 170, 150, 30);
        lecturerAddressLabel.setFont(textfieldFont);
        addLecturerPanel.add(lecturerAddressLabel);

        lecturerAddressTextField = new JTextField();
        lecturerAddressTextField.setBounds(175, 170, 200, 30);
        addLecturerPanel.add(lecturerAddressTextField);

        lecturerWorkingTypeLabel = new JLabel("Working Type");
        lecturerWorkingTypeLabel.setBounds(10, 220, 150, 30);
        lecturerWorkingTypeLabel.setFont(textfieldFont);
        addLecturerPanel.add(lecturerWorkingTypeLabel);

        lecturerWorkingTypeTextField = new JTextField();
        lecturerWorkingTypeTextField.setBounds(175, 220, 200, 30);
        addLecturerPanel.add(lecturerWorkingTypeTextField);

        lecturerEmploymentStatusLabel = new JLabel("Employment Status");
        lecturerEmploymentStatusLabel.setBounds(10, 270, 150, 30);
        lecturerEmploymentStatusLabel.setFont(textfieldFont);
        addLecturerPanel.add(lecturerEmploymentStatusLabel);

        lecturerEmploymentStatusTextField = new JTextField();
        lecturerEmploymentStatusTextField.setBounds(175, 270, 200, 30);
        addLecturerPanel.add(lecturerEmploymentStatusTextField);

        lecturerDepartmentLabel = new JLabel("Department");
        lecturerDepartmentLabel.setBounds(10, 320, 150, 30);
        lecturerDepartmentLabel.setFont(textfieldFont);
        addLecturerPanel.add(lecturerDepartmentLabel);

        lecturerDepartmentTextField = new JTextField();
        lecturerDepartmentTextField.setBounds(175, 320, 200, 30);
        addLecturerPanel.add(lecturerDepartmentTextField);

        lecturerYearsOfExperienceLabel = new JLabel("Years Of Experience");
        lecturerYearsOfExperienceLabel.setBounds(10, 370, 150, 30);
        lecturerYearsOfExperienceLabel.setFont(textfieldFont);
        addLecturerPanel.add(lecturerYearsOfExperienceLabel);

        lecturerYearsOfExperienceTextField = new JTextField();
        lecturerYearsOfExperienceTextField.setBounds(175, 370, 200, 30);
        addLecturerPanel.add(lecturerYearsOfExperienceTextField);

        lecturerWorkingHourLabel = new JLabel("Working Hour");
        lecturerWorkingHourLabel.setBounds(10, 420, 100, 30);
        lecturerWorkingHourLabel.setFont(textfieldFont);
        addLecturerPanel.add(lecturerWorkingHourLabel);

        lecturerWorkingHourTextField = new JTextField();
        lecturerWorkingHourTextField.setBounds(175, 420, 200, 30);
        addLecturerPanel.add(lecturerWorkingHourTextField);

        addLecturerButton = new JButton("ADD  LECTURER");
        addLecturerButton.setBounds(120, 470, 200, 35);
        addLecturerButton.setBackground(Color.decode("#AD8B73"));
        addLecturerButton.setForeground(Color.white);
        addLecturerButton.setFont(buttonFont);
        addLecturerButton.setFocusPainted(false);
        addLecturerPanel.add(addLecturerButton);
        addLecturerButton.addActionListener(e -> {
            addLecturer();
        });

        // creating panel for adding gradeassignment content
        gradeAssignmentPanel = new JPanel(null);
        gradeAssignmentPanel.setBounds(450, 50, 300, 430);
        mainLecturerPanel.add(gradeAssignmentPanel);

        gradeAssignmentBorder = BorderFactory.createLineBorder(Color.BLACK, 2);
        gradeAssignmentPanel.setBorder(gradeAssignmentBorder);

        gradeAssignmentTitlePanel = new JPanel(null);
        gradeAssignmentTitlePanel.setBounds(2, 2, 296, 50);
        gradeAssignmentTitlePanel.setBackground(Color.decode("#135D66"));// putting a custom background color in this
                                                                         // panel
        gradeAssignmentPanel.add(gradeAssignmentTitlePanel);

        gradeAssignmentLabel = new JLabel("GRADE ASSIGNMENT");
        gradeAssignmentLabel.setBounds(35, 1, 290, 50);
        gradeAssignmentLabel.setForeground(Color.decode("#FFFFFF"));
        gradeAssignmentLabel.setFont(titleFont);
        gradeAssignmentTitlePanel.add(gradeAssignmentLabel);

        gradeAssignmentIdLabel = new JLabel("Teacher ID");
        gradeAssignmentIdLabel.setBounds(20, 70, 200, 30);
        gradeAssignmentIdLabel.setFont(textfieldFont);
        gradeAssignmentPanel.add(gradeAssignmentIdLabel);

        gradeAssignmentIdTextField = new JTextField();
        gradeAssignmentIdTextField.setBounds(20, 95, 250, 30);
        gradeAssignmentPanel.add(gradeAssignmentIdTextField);

        gradeScoreLabel = new JLabel("Graded Score");
        gradeScoreLabel.setBounds(20, 135, 200, 30);
        gradeScoreLabel.setFont(textfieldFont);
        gradeAssignmentPanel.add(gradeScoreLabel);

        gradeScoreTextField = new JTextField();
        gradeScoreTextField.setBounds(20, 160, 250, 30);
        gradeAssignmentPanel.add(gradeScoreTextField);

        gradeDepartmentLabel = new JLabel("Department");
        gradeDepartmentLabel.setBounds(20, 200, 200, 30);
        gradeDepartmentLabel.setFont(textfieldFont);
        gradeAssignmentPanel.add(gradeDepartmentLabel);

        gradeDepartmentTextField = new JTextField();
        gradeDepartmentTextField.setBounds(20, 225, 250, 30);
        gradeAssignmentPanel.add(gradeDepartmentTextField);

        gradeYearsOfExperienceLabel = new JLabel("Years Of Experience");
        gradeYearsOfExperienceLabel.setBounds(20, 265, 200, 30);
        gradeYearsOfExperienceLabel.setFont(textfieldFont);
        gradeAssignmentPanel.add(gradeYearsOfExperienceLabel);

        gradeYearsOfExperienceTextField = new JTextField();
        gradeYearsOfExperienceTextField.setBounds(20, 290, 250, 30);
        gradeAssignmentPanel.add(gradeYearsOfExperienceTextField);

        gradeAssignmentButton = new JButton("GRADE  ASSIGNMENT");
        gradeAssignmentButton.setBounds(50, 360, 200, 40);
        gradeAssignmentButton.setBackground(Color.decode("#AD8B73"));
        gradeAssignmentButton.setFont(buttonFont);
        gradeAssignmentButton.setForeground(Color.WHITE);
        gradeAssignmentButton.setFocusPainted(false);
        gradeAssignmentPanel.add(gradeAssignmentButton);
        gradeAssignmentButton.addActionListener(e -> {
            gradeScore();
        });

        clearLecturerButton = new JButton("CLEAR   ALL   FIELDS");
        clearLecturerButton.setBounds(450, 510, 296, 50);
        clearLecturerButton.setBackground(Color.decode("#EEEEEE"));
        clearLecturerButton.setFont(buttonFont);
        clearLecturerButton.setFocusPainted(false);
        clearLecturerButton.setForeground(Color.BLACK);
        clearLecturerButton.setBorder(addLecturerBorder);
        mainLecturerPanel.add(clearLecturerButton);
        clearLecturerButton.addActionListener(e -> {
            clearLecturer();
        });

        contentPanel.add(mainLecturerPanel);
        contentPanel.revalidate();
        contentPanel.repaint();

    }

    private void tutorContent() {
        contentPanel.removeAll();

        mainTutorPanel = new JPanel(null);
        mainTutorPanel.setBounds(0, 0, 800, 600);

        // adding border to content panel
        mainTutorBorder = BorderFactory.createTitledBorder("Tutor Section");
        mainTutorPanel.setBorder(mainTutorBorder);

        addTutorPanel = new JPanel(null);
        addTutorPanel.setBounds(50, 50, 390, 520);
        mainTutorPanel.add(addTutorPanel);

        addTutorBorder = BorderFactory.createLineBorder(Color.BLACK, 2);
        addTutorPanel.setBorder(addTutorBorder);

        addTutorTitlePanel = new JPanel(null);
        addTutorTitlePanel.setBounds(2, 2, 386, 50);
        addTutorTitlePanel.setBackground(Color.decode("#135D66"));// putting a custom background color in this panel
        addTutorPanel.add(addTutorTitlePanel);

        addTutorLabel = new JLabel("ADD A NEW TUTOR");
        addTutorLabel.setBounds(80, 1, 362, 50);
        addTutorLabel.setForeground(Color.decode("#FFFFFF"));
        addTutorLabel.setFont(titleFont);
        addTutorTitlePanel.add(addTutorLabel);

        tutorIdLabel = new JLabel("Teacher ID");
        tutorIdLabel.setBounds(10, 65, 150, 30);
        tutorIdLabel.setFont(textfieldFont);
        addTutorPanel.add(tutorIdLabel);

        tutorIdTextField = new JTextField();
        tutorIdTextField.setBounds(175, 65, 200, 30);
        addTutorPanel.add(tutorIdTextField);

        tutorNameLabel = new JLabel("Teacher Name");
        tutorNameLabel.setBounds(10, 105, 150, 30);
        tutorNameLabel.setFont(textfieldFont);
        addTutorPanel.add(tutorNameLabel);

        tutorNameTextField = new JTextField();
        tutorNameTextField.setBounds(175, 105, 200, 30);
        addTutorPanel.add(tutorNameTextField);

        tutorAddressLabel = new JLabel("Address");
        tutorAddressLabel.setBounds(10, 145, 150, 30);
        tutorAddressLabel.setFont(textfieldFont);
        addTutorPanel.add(tutorAddressLabel);

        tutorAddressTextField = new JTextField();
        tutorAddressTextField.setBounds(175, 145, 200, 30);
        addTutorPanel.add(tutorAddressTextField);

        tutorWorkingTypeLabel = new JLabel("Working Type");
        tutorWorkingTypeLabel.setBounds(10, 185, 150, 30);
        tutorWorkingTypeLabel.setFont(textfieldFont);
        addTutorPanel.add(tutorWorkingTypeLabel);

        tutorWorkingTypeTextField = new JTextField();
        tutorWorkingTypeTextField.setBounds(175, 185, 200, 30);
        addTutorPanel.add(tutorWorkingTypeTextField);

        tutorEmploymentStatusLabel = new JLabel("Employment Status");
        tutorEmploymentStatusLabel.setBounds(10, 225, 150, 30);
        tutorEmploymentStatusLabel.setFont(textfieldFont);
        addTutorPanel.add(tutorEmploymentStatusLabel);

        tutorEmploymentStatusTextField = new JTextField();
        tutorEmploymentStatusTextField.setBounds(175, 225, 200, 30);
        addTutorPanel.add(tutorEmploymentStatusTextField);

        tutorWorkingHoursLabel = new JLabel("Working Hours");
        tutorWorkingHoursLabel.setBounds(10, 265, 150, 30);
        tutorWorkingHoursLabel.setFont(textfieldFont);
        addTutorPanel.add(tutorWorkingHoursLabel);

        tutorWorkingHoursTextField = new JTextField();
        tutorWorkingHoursTextField.setBounds(175, 265, 200, 30);
        addTutorPanel.add(tutorWorkingHoursTextField);

        tutorSalaryLabel = new JLabel("Salary");
        tutorSalaryLabel.setBounds(10, 305, 150, 30);
        tutorSalaryLabel.setFont(textfieldFont);
        addTutorPanel.add(tutorSalaryLabel);

        tutorSalaryTextField = new JTextField();
        tutorSalaryTextField.setBounds(175, 305, 200, 30);
        addTutorPanel.add(tutorSalaryTextField);

        tutorSpecializationLabel = new JLabel("Specialization");
        tutorSpecializationLabel.setBounds(10, 345, 150, 30);
        tutorSpecializationLabel.setFont(textfieldFont);
        addTutorPanel.add(tutorSpecializationLabel);

        tutorSpecializationTextField = new JTextField();
        tutorSpecializationTextField.setBounds(175, 345, 200, 30);
        addTutorPanel.add(tutorSpecializationTextField);

        tutorAcademicQualificationLabel = new JLabel("Academic Qualification");
        tutorAcademicQualificationLabel.setBounds(10, 385, 200, 30);
        tutorAcademicQualificationLabel.setFont(textfieldFont);
        addTutorPanel.add(tutorAcademicQualificationLabel);

        tutorAcademicQualificationTextField = new JTextField();
        tutorAcademicQualificationTextField.setBounds(175, 385, 200, 30);
        addTutorPanel.add(tutorAcademicQualificationTextField);

        tutorPerformanceIndexLabel = new JLabel("Performance Index");
        tutorPerformanceIndexLabel.setBounds(10, 425, 150, 30);
        tutorPerformanceIndexLabel.setFont(textfieldFont);
        addTutorPanel.add(tutorPerformanceIndexLabel);

        tutorPerformanceIndexTextField = new JTextField();
        tutorPerformanceIndexTextField.setBounds(175, 425, 200, 30);
        addTutorPanel.add(tutorPerformanceIndexTextField);

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

        // panel for set salary
        setSalaryPanel = new JPanel(null);
        setSalaryPanel.setBounds(450, 50, 300, 300);
        mainTutorPanel.add(setSalaryPanel);

        setSalaryBorder = BorderFactory.createLineBorder(Color.BLACK, 2);
        setSalaryPanel.setBorder(setSalaryBorder);

        setSalaryTitlePanel = new JPanel(null);
        setSalaryTitlePanel.setBounds(2, 2, 296, 50);
        setSalaryTitlePanel.setBackground(Color.decode("#135D66"));// putting a custom background color in this panel
        setSalaryPanel.add(setSalaryTitlePanel);

        setSalaryLabel = new JLabel("SET NEW SALARY");
        setSalaryLabel.setBounds(45, 1, 290, 50);
        setSalaryLabel.setForeground(Color.decode("#FFFFFF"));
        setSalaryLabel.setFont(titleFont);
        setSalaryTitlePanel.add(setSalaryLabel);

        setSalaryIdLabel = new JLabel("Teacher ID");
        setSalaryIdLabel.setBounds(20, 60, 200, 30);
        setSalaryIdLabel.setFont(textfieldFont);
        setSalaryPanel.add(setSalaryIdLabel);

        setSalaryIdTextField = new JTextField();
        setSalaryIdTextField.setBounds(20, 85, 250, 30);
        setSalaryPanel.add(setSalaryIdTextField);

        setSalaryNewSalaryLabel = new JLabel("New Salary");
        setSalaryNewSalaryLabel.setBounds(20, 120, 200, 30);
        setSalaryNewSalaryLabel.setFont(textfieldFont);
        setSalaryPanel.add(setSalaryNewSalaryLabel);

        setSalaryNewSalaryTextField = new JTextField();
        setSalaryNewSalaryTextField.setBounds(20, 145, 250, 30);
        setSalaryPanel.add(setSalaryNewSalaryTextField);

        setSalaryPerformanceIndexLabel = new JLabel("New Performance Index");
        setSalaryPerformanceIndexLabel.setBounds(20, 180, 200, 30);
        setSalaryPerformanceIndexLabel.setFont(textfieldFont);
        setSalaryPanel.add(setSalaryPerformanceIndexLabel);

        setSalaryPerformanceIndexTextField = new JTextField();
        setSalaryPerformanceIndexTextField.setBounds(20, 205, 250, 30);
        setSalaryPanel.add(setSalaryPerformanceIndexTextField);

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

        // panel for remove tutor
        removeTutorPanel = new JPanel(null);
        removeTutorPanel.setBounds(450, 360, 300, 150);
        mainTutorPanel.add(removeTutorPanel);

        // setting up border for remove tutor panel
        removeTutorBorder = BorderFactory.createLineBorder(Color.BLACK, 2);
        removeTutorPanel.setBorder(removeTutorBorder);

        removeTutorTitlePanel = new JPanel(null);
        removeTutorTitlePanel.setBounds(2, 2, 296, 45);
        removeTutorTitlePanel.setBackground(Color.decode("#135D66"));// putting a custom background color in this panel
        removeTutorPanel.add(removeTutorTitlePanel);

        removeTutorLabel = new JLabel("REMOVE TUTOR");
        removeTutorLabel.setBounds(50, 1, 290, 45);
        removeTutorLabel.setForeground(Color.decode("#FFFFFF"));
        removeTutorLabel.setFont(titleFont);
        removeTutorTitlePanel.add(removeTutorLabel);

        removeTutorIdLabel = new JLabel("Teacher ID");
        removeTutorIdLabel.setBounds(10, 60, 100, 30);
        removeTutorIdLabel.setFont(textfieldFont);
        removeTutorPanel.add(removeTutorIdLabel);

        removeTutorIdTextField = new JTextField();
        removeTutorIdTextField.setBounds(100, 60, 180, 30);
        removeTutorPanel.add(removeTutorIdTextField);

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

        // button for clearing all fields
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

        contentPanel.add(mainTutorPanel);
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    // content for display
    private void displayContent() {
        contentPanel.removeAll();
        // Adding initial content to content panel
        displayBorder = BorderFactory.createTitledBorder("Display");

        // Adding initial content to content panel
        welcomeLabel = new JLabel("Teacher Management System");
        welcomeLabel.setBounds(150, 50, 600, 70);
        welcomeLabel.setFont(welcome2Font);
        contentPanel.add(welcomeLabel);

        welcome2Label = new JLabel(
                "your all-in-one solution for efficient administration and seamless collaboration.");
        welcome2Label.setBounds(175, 100, 700, 30);
        welcome2Label.setFont(welcomeFont);
        contentPanel.add(welcome2Label);

        welcome3Label = new JLabel("Let's simplify tasks and unite efforts to elevate education together!");
        welcome3Label.setBounds(205, 115, 600, 30);
        welcome3Label.setFont(welcomeFont);
        contentPanel.add(welcome3Label);

        // panel for display section
        displayPanel = new JPanel(null);
        displayPanel.setBounds(180, 220, 450, 250);
        displayPanel.setBorder(displayBorder);
        contentPanel.add(displayPanel);

        displayLabel = new JLabel("Search our Teacher ");
        displayLabel.setBounds(100, 20, 500, 40);
        displayLabel.setFont(menuFont);
        displayPanel.add(displayLabel);

        displayIdLabel = new JLabel("ID");
        displayIdLabel.setBounds(20, 90, 70, 40);
        displayIdLabel.setFont(menuFont);
        displayPanel.add(displayIdLabel);

        displayIdTextField = new JTextField();
        displayIdTextField.setBounds(100, 90, 200, 40);
        displayPanel.add(displayIdTextField);

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

        displayAllLabel = new JLabel("OR");
        displayAllLabel.setBounds(20, 180, 70, 40);
        displayAllLabel.setFont(menuFont);
        displayPanel.add(displayAllLabel);

        buttonBorder = BorderFactory.createLineBorder(Color.BLACK, 2);

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
            // getting all necessary data from textfields
            String teachId = getText(lecturerIdTextField);
            String teachName = getText(lecturerNameTextField);
            String teachAddress = getText(lecturerAddressTextField);
            String teachWorking = getText(lecturerWorkingTypeTextField);
            String teachStatus = getText(lecturerEmploymentStatusTextField);
            String teachDepartment = getText(lecturerDepartmentTextField);
            String teachExperience = getText(lecturerYearsOfExperienceTextField);
            String teachHours = getText(lecturerWorkingHourTextField);

            // converting string to int
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

            if (gradedScore > 100) {
                JOptionPane.showMessageDialog(frame, "Graded score should be between 0-100", "Invalid Score!",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            Teacher teacher = getId(id);
            if (teacher == null) {
                JOptionPane.showMessageDialog(frame, "No teacher found of this ID", "No ID found!",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!(teacher instanceof Lecturer)) {
                JOptionPane.showMessageDialog(frame, "Tutor cannot assgin grade.\n Please! Enter a lecturer ID:",
                        "INVALID", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Lecturer lecturer = (Lecturer) teacher;

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

            // checking if ID"s are unique
            if (isIdUnique(id)) {
                JOptionPane.showMessageDialog(frame, "ID already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // creating a objective of tutor
            Tutor tutor = new Tutor(id, teachName, teachAddress, teachWorking, teachStatus, hours, salary,
                    teachSpecialization, teachQualification, performIndex);
            teacherList.add(tutor); // adding tutor to arraylist

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

    //
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

            Teacher teacher = getId(id);
            if (teacher == null) {
                JOptionPane.showMessageDialog(frame, "No teacher found of this ID", "No ID found!",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

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
            String teachId = getText(removeTutorIdTextField);
            int id = toInt(teachId);

            Teacher teacher = getId(id);
            if (teacher == null) {
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
            String teachID = getText(displayIdTextField);

            int id = toInt(teachID);

            Teacher teacher = getId(id);

            // checking if teacher id is registered or not
            if (teacher == null) {
                JOptionPane.showMessageDialog(frame, "No teacher registered of this ID!", "Invalid ID",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

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

    private void displayPane(Teacher teacher){
        String msg = "";

        msg = "Teacher Id: " + teacher.getTeacherId() + "\n";
        msg += "Teacher Name: " + teacher.getTeacherName() + "\n";
        msg += "Address: " + teacher.getAddress() + "\n";
        msg += "Working Type: " + teacher.getWorkingType() + "\n";
        msg += "Employment Status: " + teacher.getEmploymentStatus() + "\n";
        if (teacher.getWorkingHours() > 0) {
            msg += "Working Hours: " + teacher.getWorkingHours() + "\n";
        }

        // specific information based on a teacher type: Lecturer or tutor
        if (teacher instanceof Lecturer) {
            Lecturer lecturer = (Lecturer) teacher;
            msg += "Department: " + lecturer.getDepartment() + "\n";
            msg += "Years Of Experience: " + lecturer.getYearsOfExperience() + "\n";
            if (lecturer.getHasGraded()) {
                msg += "Graded Score: " + lecturer.getGradedScore() + "\n";
            } else {
                msg += "The lecturer has not graded the assignment yet!";
            }
        } else {
            Tutor tutor = (Tutor) teacher;
            if (tutor.getIsCertified()) {
                msg += "Salary: " + tutor.getSalary() + "\n";
                msg += "Specialization: " + tutor.getSpecialization() + "\n";
                msg += "Academic Qualifications: " + tutor.getAcademicQualifications() + "\n";
                msg += "Performance Index: " + tutor.getPerformanceIndex() + "\n";
            }
        }
        teacher.display();
        String title = "";
        if (teacher instanceof Lecturer) {
            title = "Lecturer Info";
        } else {
            title = "Tutor info";
        }

        JOptionPane.showMessageDialog(frame, msg, title, JOptionPane.INFORMATION_MESSAGE);
    }

    // textfield trimmer
    private String getText(JTextField tf) {
        String content = tf.getText().trim();
        if (content.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return content;
    }

    // methond for converting string into int
    private int toInt(String text) {
        int intValue = Integer.parseInt(text);
        if (intValue < 0) {
            throw new NumberFormatException();
        }
        return intValue;
    }

    // to check if id are unique
    private boolean isIdUnique(int teachId) {
        for (Teacher teacher : teacherList) {
            if (teacher.getTeacherId() == teachId) {
                return true;
            }
        }
        return false;
    }

    // for getting teacher by ID
    private Teacher getId(int id) {
        for (Teacher teacher : teacherList) {
            if (teacher.getTeacherId() == id) {
                return teacher;
            }
        }
        return null;
    }

    private void displayAllTeachers() {
        if (teacherList.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "No teachers registered!", "Empty List",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
    
        String msg = "List of Teachers:\n\n";
        

        for (Teacher teacher : teacherList) {
            msg += "Teacher ID: " + teacher.getTeacherId() + "\n";
            msg += "Name: " + teacher.getTeacherName() + "\n";
            msg += "Address: " + teacher.getAddress() + "\n";
            msg += "Working Type: " + teacher.getWorkingType() + "\n";
            msg += "Employment Status: " + teacher.getEmploymentStatus() + "\n";
            if (teacher.getWorkingHours() == 0) {
                msg += "Working Hours: " + teacher.getWorkingHours() + "\n";
            }
            
            if (teacher instanceof Lecturer) {
                Lecturer lecturer = (Lecturer) teacher;
                msg += "Type: Lecturer\n";
                msg += "Department: " + lecturer.getDepartment() + "\n";
                msg += "Years Of Experience: " + lecturer.getYearsOfExperience() + "\n";
                if (lecturer.getHasGraded()) {
                    msg += "Graded Score: " + lecturer.getGradedScore() + "\n";
                } else {
                    msg += "The lecturer has not graded the assignment yet!\n";
                }
            } else if (teacher instanceof Tutor) {
                Tutor tutor = (Tutor) teacher;
                msg += "Type: Tutor\n";
                if (tutor.getIsCertified()) {
                    msg += "Salary: " + tutor.getSalary() + "\n";
                    msg += "Specialization: " + tutor.getSpecialization() + "\n";
                    msg += "Academic Qualifications: " + tutor.getAcademicQualifications() + "\n";
                    msg += "Performance Index: " + tutor.getPerformanceIndex() + "\n";
                }
            }
            msg += "\n"; // Add a newline to separate each teacher's information
        }
    
        JOptionPane.showMessageDialog(frame, msg, "List of Teachers",
                JOptionPane.PLAIN_MESSAGE);
    }
    
}


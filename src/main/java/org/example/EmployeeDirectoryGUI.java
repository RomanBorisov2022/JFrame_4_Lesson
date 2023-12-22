package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class EmployeeDirectoryGUI {
    private JFrame frame;
    private JTextArea resultTextArea;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                EmployeeDirectoryGUI window = new EmployeeDirectoryGUI();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public EmployeeDirectoryGUI() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        resultTextArea = new JTextArea();
        resultTextArea.setEditable(false);

        JButton searchButton = new JButton("Search");
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Обработчик события кнопки "Search"
                EmployeeDirectory directory = new EmployeeDirectory();
                directory.addEmployee(new Employee(1, "123-456-7890", "John", 5));
                directory.addEmployee(new Employee(2, "987-654-3210", "Maria", 3));
                directory.addEmployee(new Employee(3, "111-222-3333", "Peter", 7));

                List<Employee> employeesWithExperience5 = directory.findByExperience(5);
                List<String> phoneNumbersOfMaria = directory.findPhoneNumbersByName("Maria");
                Employee employeeWithId2 = directory.findByEmployeeId(2);

                // Вывод результатов в JTextArea
                resultTextArea.setText("Employees with 5 years of experience: " + employeesWithExperience5 + "\n"
                        + "Phone numbers of Maria: " + phoneNumbersOfMaria + "\n"
                        + "Employee with employee ID 2: " + employeeWithId2);
            }
        });

        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.getContentPane().add(searchButton);
        frame.getContentPane().add(resultTextArea);
    }
}

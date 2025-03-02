import javax.swing.*;
import packages.informationPage;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Font labelFont = new Font("Arial", Font.BOLD, 18);
        UIManager.put("Label.font", labelFont);


        // Create and configure the main frame
        JFrame frame = new JFrame("SURVEY FORM");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create and configure the main panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBounds(0, 0, 600, 600);
        panel.setBackground(Color.YELLOW);

        // Create title label
        JLabel title = new JLabel("Survey Form");
        title.setBounds(10, 10, 100, 20);
        title.setHorizontalAlignment(JLabel.CENTER);

        Font buttonFont = new Font("Arial", Font.PLAIN, 15);
        UIManager.put("Button.font", buttonFont);

        // Create start button
        JButton startButton = new JButton("Start");
        startButton.setBounds(10, 40, 100, 20);
        startButton.setHorizontalAlignment(JButton.CENTER);

        // Add components to the panel
        panel.add(title, BorderLayout.NORTH);
        panel.add(startButton, BorderLayout.CENTER);

        // Add panel to the frame
        frame.add(panel);

        // Add action listener to the start button
        startButton.addActionListener(e -> {
            // Remove the current panel
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            // Load and display the first page
            informationPage informationPage = new informationPage();
            informationPage.create(frame);

            // Refresh the frame
            frame.revalidate();
            frame.repaint();
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}

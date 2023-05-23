import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Self-Portfolio");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new GridLayout(1, 1));
            frame.setSize(400, 500);

            JPanel contentPanel = new JPanel();
            contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

            Profile profile = new Profile("John Doe", "Software Developer", "I am a passionate software developer with experience in Java, Python, and web development.");
            Skill skill = new Skill("Java");
            Project project = new Project("Personal Website", "Developed a personal website using HTML, CSS, and JavaScript.");

            contentPanel.add(profile);
            contentPanel.add(skill);
            contentPanel.add(project);

            JScrollPane scrollPane = new JScrollPane(contentPanel);
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

            frame.add(scrollPane);

            frame.setVisible(true);
        });
    }
}

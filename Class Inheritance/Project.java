import javax.swing.*;
import java.awt.*;

public class Project extends JPanel {
    private String projectName;
    private String projectDescription;

    public Project(String projectName, String projectDescription) {
        this.projectName = projectName;
        this.projectDescription = projectDescription;

        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(400, 100));

        JLabel projectLabel = new JLabel(projectName);
        projectLabel.setFont(new Font("Arial", Font.BOLD, 16));

        JTextArea descriptionArea = new JTextArea(projectDescription);
        descriptionArea.setEditable(false);
        descriptionArea.setLineWrap(true);
        descriptionArea.setWrapStyleWord(true);

        add(projectLabel, BorderLayout.NORTH);
        add(descriptionArea, BorderLayout.CENTER);
    }
}

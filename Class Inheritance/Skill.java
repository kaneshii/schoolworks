import javax.swing.*;
import java.awt.*;

public class Skill extends JPanel {
    private String skillName;

    public Skill(String skillName) {
        this.skillName = skillName;

        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(400, 50));

        JLabel skillLabel = new JLabel(skillName);
        skillLabel.setFont(new Font("Arial", Font.PLAIN, 16));

        add(skillLabel, BorderLayout.CENTER);
    }
}

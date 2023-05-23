import javax.swing.*;
import java.awt.*;

public class Profile extends JPanel {
    private String name;
    private String title;
    private String description;

    public Profile(String name, String title, String description) {
        this.name = name;
        this.title = title;
        this.description = description;

        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(400, 150));
        setBackground(Color.WHITE);

        JLabel nameLabel = new JLabel(name);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 18));

        JLabel titleLabel = new JLabel(title);
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 14));

        JTextArea descriptionArea = new JTextArea(description);
        descriptionArea.setEditable(false);
        descriptionArea.setLineWrap(true);
        descriptionArea.setWrapStyleWord(true);

        add(nameLabel, BorderLayout.NORTH);
        add(titleLabel, BorderLayout.CENTER);
        add(descriptionArea, BorderLayout.SOUTH);
    }
}

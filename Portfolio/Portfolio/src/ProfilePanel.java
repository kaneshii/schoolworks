import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ProfilePanel extends JPanel {
    private JLabel nameLabel;
    private JLabel occupationLabel;
    private JLabel pictureLabel;

    public ProfilePanel(String name, String occupation, String picturePath) {
        setLayout(new BorderLayout());
        setBackground(new Color(133, 129, 143));

        nameLabel = new JLabel(name);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 24));
        nameLabel.setHorizontalAlignment(SwingConstants.CENTER);

        occupationLabel = new JLabel(occupation);
        occupationLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        occupationLabel.setHorizontalAlignment(SwingConstants.CENTER);

        ImageIcon pictureIcon = new ImageIcon(picturePath);
        pictureLabel = new JLabel(pictureIcon);
        pictureLabel.setHorizontalAlignment(SwingConstants.CENTER);
        pictureLabel.setBorder(new EmptyBorder(30, 30, 30, 30));

        add(nameLabel, BorderLayout.NORTH);
        add(pictureLabel, BorderLayout.CENTER);
        add(occupationLabel, BorderLayout.SOUTH);
    }
}

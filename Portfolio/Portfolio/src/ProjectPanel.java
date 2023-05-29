import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ProjectPanel extends JPanel {
    private JPanel contentPanel;
    private JScrollPane scrollPane;

    public ProjectPanel() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(800, 400));
        setBackground(new Color(41, 39, 46));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setOpaque(false);

        scrollPane = new JScrollPane(contentPanel);
        scrollPane.setBorder(null);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        add(scrollPane, BorderLayout.CENTER);
    }

    public void addProject(String projectDescription, List<String> imagePaths) {
        JPanel projectPanel = new JPanel();
        projectPanel.setLayout(new BorderLayout());
        projectPanel.setOpaque(false);
        projectPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 3));

        JPanel imagePanel = new JPanel();
        int rows = (int) Math.ceil((double) imagePaths.size() / 2);
        imagePanel.setLayout(new GridLayout(rows, 1, 0, 30));
        imagePanel.setOpaque(false);
        imagePanel.setBorder(BorderFactory.createEmptyBorder(30, 10, 10, 10));

        for (String imagePath : imagePaths) {
            ImageIcon image = new ImageIcon(imagePath);
            Image scaledImage = image.getImage().getScaledInstance(800, 520, Image.SCALE_SMOOTH);
            ImageIcon scaledImageIcon = new ImageIcon(scaledImage);

            JLabel imageLabel = new JLabel(scaledImageIcon);
            imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
            imagePanel.add(imageLabel);
        }

        JTextArea projectTextArea = new JTextArea();
        projectTextArea.setFont(new Font("Helvetica", Font.PLAIN, 24));
        projectTextArea.setForeground(Color.WHITE);
        projectTextArea.setEditable(false);
        projectTextArea.setLineWrap(true);
        projectTextArea.setWrapStyleWord(true);
        projectTextArea.setText(projectDescription);
        projectTextArea.setOpaque(false);
        projectTextArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        projectPanel.add(imagePanel, BorderLayout.NORTH);
        projectPanel.add(projectTextArea, BorderLayout.CENTER);

        contentPanel.add(Box.createVerticalStrut(15));
        contentPanel.add(projectPanel);
        contentPanel.revalidate();

        scrollPane.getVerticalScrollBar().setValue(0);
    }
}

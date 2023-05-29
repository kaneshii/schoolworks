import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class SkillPanel extends JPanel {
    private JScrollPane scrollPane;
    private JPanel contentPanel;

    public SkillPanel() {
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

        add(scrollPane, BorderLayout.CENTER);
    }

    public void addParagraph(String paragraph, String imagePath) {
        JPanel paragraphPanel = new JPanel();
        paragraphPanel.setLayout(new BorderLayout());
        paragraphPanel.setOpaque(false);
        paragraphPanel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3));

        ImageIcon image = new ImageIcon(imagePath);
        Image scaledImage = image.getImage().getScaledInstance(800, 520, Image.SCALE_SMOOTH);
        ImageIcon scaledImageIcon = new ImageIcon(scaledImage);

        JLabel imageLabel = new JLabel(scaledImageIcon);
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JTextArea paragraphTextArea = new JTextArea();
        paragraphTextArea.setFont(new Font("font", Font.PLAIN, 24));
        paragraphTextArea.setForeground(Color.WHITE);
        paragraphTextArea.setEditable(false);
        paragraphTextArea.setLineWrap(true);
        paragraphTextArea.setWrapStyleWord(true);
        paragraphTextArea.setText(paragraph);
        paragraphTextArea.setOpaque(false);
        paragraphTextArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        paragraphPanel.add(imageLabel, BorderLayout.NORTH);
        paragraphPanel.add(paragraphTextArea, BorderLayout.CENTER);

        contentPanel.add(Box.createVerticalStrut(15));
        contentPanel.add(paragraphPanel);
        contentPanel.revalidate();

        scrollPane.getVerticalScrollBar().setValue(0);
    }
}

package ToDoList;

import javax.swing.*;
import java.awt.*;

public class TitleBar extends JPanel {

    TitleBar() {

        this.setPreferredSize(new Dimension(400,80));
        this.setBackground(Color.GRAY);

        JLabel titleText = new JLabel("To Do List");
        titleText.setPreferredSize(new Dimension(200,60));
        titleText.setFont(new Font("Sans-serif", Font.BOLD, 20));
        titleText.setHorizontalAlignment(JLabel.CENTER);

        this.add(titleText);


    }
}

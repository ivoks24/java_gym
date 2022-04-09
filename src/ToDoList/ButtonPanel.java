package ToDoList;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ButtonPanel extends JPanel {

    private final JButton addTask;
    private final JButton clear;

    Border emptyBorder = BorderFactory.createEmptyBorder();

    ButtonPanel() {

        this.setPreferredSize(new Dimension(400, 60));
        this.setBackground(Color.DARK_GRAY);

        addTask = new JButton("Add Task");
        addTask.setBorder(emptyBorder);
        addTask.setFont(new Font("Sans-serif", Font.PLAIN, 20));
        this.add(addTask);

        this.add(Box.createHorizontalStrut(20));
        clear = new JButton("Clear");
        clear.setBorder(emptyBorder);
        clear.setFont(new Font("Sans-serif", Font.PLAIN, 20));
        this.add(clear);
    }

    public JButton getAddTask() {
        return addTask;
    }

    public JButton getClear() {
        return clear;
    }
}

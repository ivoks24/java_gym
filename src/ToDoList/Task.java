package ToDoList;

import javax.swing.*;
import java.awt.*;

public class Task extends JPanel {

    private final JLabel index;
    private final JTextField taskName;
    private final JButton done;

    private boolean checked;

    Task() {

        this.setPreferredSize(new Dimension(40, 20));
        this.setBackground(Color.BLACK);

        this.setLayout(new BorderLayout());

        checked = false;

        index = new JLabel("");
        index.setPreferredSize(new Dimension(20, 20));
        index.setHorizontalAlignment(JLabel.CENTER);
        this.add(index, BorderLayout.WEST);

        taskName = new JTextField("Task Name");
        taskName.setBorder(BorderFactory.createEmptyBorder());
        taskName.setBackground(Color.GRAY);
        this.add(taskName, BorderLayout.CENTER);

        done = new JButton("done");
        done.setPreferredSize(new Dimension(40, 20));
        done.setBorder(BorderFactory.createEmptyBorder());
        this.add(done, BorderLayout.EAST);
    }

    public JButton getDone() {
        return done;
    }

    public boolean getState() {
        return checked;
    }

    public void changeIndex(int num) {

        this.index.setText(num + "");
        this.revalidate();
    }

    public void changeState() {

//        this.setBackground(Color.BLACK);
        taskName.setBackground(Color.DARK_GRAY);
        checked = true;
    }
}

package ToDoList;

import javax.swing.*;
import java.awt.*;

public class List extends JPanel {

    List() {

        GridLayout layout = new GridLayout(10, 1);
        layout.setVgap(5);

        this.setLayout(layout);
        this.setBackground(Color.DARK_GRAY);
    }

    public void updateNumbers() {

        Component[] listItem = this.getComponents();

        for (int i = 0; i < listItem.length; i++) {
            if (listItem[i] instanceof Task) {
                ((Task)listItem[i]).changeIndex(i + 1);
            }
        }
    }

    public void removeCompletedTask() {

        for (Component c : getComponents()) {
            if (c instanceof Task) {
                if (((Task)c).getState()) {
                    remove(c);
                    updateNumbers();
                }
            }
        }
    }
}

package ToDoList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public  class AppFrame extends JFrame {

    private TitleBar title;
    private List list;
    private ButtonPanel btnPanel;

    private JButton addTask;
    private JButton clear;

    AppFrame() {

        this.setSize(400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        title = new TitleBar();
        list = new List();
        btnPanel = new ButtonPanel();

        this.add(title, BorderLayout.NORTH);
        this.add(list, BorderLayout.CENTER);
        this.add(btnPanel, BorderLayout.SOUTH);

        addTask = btnPanel.getAddTask();
        clear = btnPanel.getClear();

        addListeners();

        this.setBackground(Color.DARK_GRAY);
        this.setVisible(true);
    }

    public void addListeners() {

        addTask.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Task task = new Task();
                list.add(task);
                list.updateNumbers();

                task.getDone().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        task.changeState();
                        revalidate();
                    }
                });
                revalidate();
            }
        });

        clear.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                list.removeCompletedTask();
                repaint();
            }
        });
    }
}

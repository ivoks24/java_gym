package ToDoList;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class TitleBar extends JPanel {

    TitleBar() {

        this.setPreferredSize(new Dimension(400,80));

        JLabel titleText = new JLabel();
        titleText.setPreferredSize(new Dimension(200,60));
        titleText.setFont(new Font("Sans-serif", Font.ITALIC, 20));
        titleText.setHorizontalAlignment(JLabel.CENTER);

        this.add(titleText);

        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                SimpleDateFormat formatDate = new SimpleDateFormat("MMM yyyy", Locale.ENGLISH);
                SimpleDateFormat formatTime = new SimpleDateFormat("HH:mm", Locale.ENGLISH);
                titleText.setText(formatDate.format(new Date()) + '\n' + formatTime.format(new Date()));
            }
        }, 0, 1000);
    }
}

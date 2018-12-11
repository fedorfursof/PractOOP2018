import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.String;

class Form extends JFrame {
    int milan, madrid = 0;
    JButton button1 = new JButton("AC Milan");

    public JButton getButton1() {
        if (milan < 5)
            milan++;
        return button1;
    }

    JButton button2 = new JButton("Real Madrid");

    public JButton getButton2() {
        if (madrid < 5)
            madrid++;
        return button2;
    }

    JButton button3 = new JButton("Clear");

    public JButton getButton3() {

        return button3;
    }

    JLabel label1 = new JLabel("Result: " + milan + " X " + madrid);
    JLabel label2 = new JLabel("Last Scorer: N/A");
    JLabel label3 = new JLabel("Winner: DRAW");
    JPanel[] panel1 = new JPanel[6];


    Form() {
        super("Foodball");
        setLayout(new GridLayout(3, 3));
        setSize(400, 400);

        for (int i = 0; i < 6; i++) {
            panel1[i] = new JPanel();
            panel1[i].setSize(30, 30);
            add(panel1[i]);
            panel1[i].setLayout(new BorderLayout());
        }

        button1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                getButton1();
                if (milan == 5) // WIN
                {
                    label3.setText("Winner: AC Milan");
                    label2.setText("Last Scorer: AC Milan");
                } else if (madrid == 5) {
                    label3.setText("Winner: Real Madrid");
                    label2.setText("Last Scorer: Real Madrid");
                }
                label1.setText("Result: " + milan + " X " + madrid);
            }


            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        button2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                getButton2();
                if (milan == 5) // WIN
                {
                    label3.setText("Winner: AC Milan");
                    label2.setText("Last Scorer: AC Milan");
                } else if (madrid == 5) {
                    label3.setText("Winner: Real Madrid");
                    label2.setText("Last Scorer: Real Madrid");
                }
                label1.setText("Result: " + milan + " X " + madrid);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        button3.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                milan = 0;
                madrid = 0;
                label1.setText("Result: " + milan + " X " + madrid);
                label3.setText("Winner: DRAW");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        panel1[0].add(button1, BorderLayout.CENTER);
        panel1[1].add(button2, BorderLayout.CENTER);
        panel1[2].add(label1, BorderLayout.CENTER);
        panel1[3].add(label2, BorderLayout.CENTER);
        panel1[4].add(label3, BorderLayout.CENTER);
        panel1[5].add(button3, BorderLayout.CENTER);
        setSize(300, 300);
    }

}

public class Main {

    public static void main(String[] args) {
        new Form().setVisible(true);
    }
}

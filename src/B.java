
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author assadullah.buriro
 */
public class B extends JPanel implements ActionListener {

    JLabel jb;
    JButton box1, box2, box3, box4;
    String str;

    B() {
        jb = new JLabel("Welcome, please click on any button to unbox some interesting knowledge -");
        box1 = new JButton("Box1");
        box2 = new JButton("Box2");
        box3 = new JButton("Box3");
        box4 = new JButton("Box4");

        str = "";

        setLayout(new FlowLayout());

        add(jb);
        add(box1);
        add(box2);
        add(box3);
        add(box4);

        box1.addActionListener(this);
        box2.addActionListener(this);
        box3.addActionListener(this);
        box4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand().equals("Box1")) {
            str = "Amazon is the largest tropical rain forest, covering 40% of the South America Continent.";
            repaint();
        }

        if (ae.getActionCommand().equals("Box2")) {
            str = "The Mariana Trench is the deepest point in Earth's ocean, with depth of over 10,994 metres.";
            repaint();
        }

        if (ae.getActionCommand().equals("Box3")) {
            str = "The coldest temperature ever recorded was -128.6F in Antarctica, on July 21, 1983.";
            repaint();
        }

        if (ae.getActionCommand().equals("Box4")) {
            str = "The oldest person to climb Mt. Everent was Japanese Miura Yiuchiro, at the age of 80.";
            repaint();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(str, 2, 170);
    }

}

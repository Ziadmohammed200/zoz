import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntroFrame extends JFrame implements ActionListener {
    JButton button =new JButton("START");

    IntroFrame(){
        setVisible(true);
        setResizable(false);
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("XO BY ZIAD MO");
        JPanel panel1 =new JPanel(new BorderLayout());
        ImageIcon image = new ImageIcon("zooz.png");
        setIconImage(image.getImage());
        setLayout(new BorderLayout());
        panel1.setSize(600,400);
        button.setPreferredSize(new Dimension(25,25));
        button.addActionListener(this);
        button.setBackground(Color.LIGHT_GRAY);
        button.setPreferredSize(new Dimension(50,25));
        button.repaint();
        button.revalidate();
        ImageIcon imag = new ImageIcon("bom.jpg");
        JLabel label = new JLabel(imag);
        panel1.add(label,BorderLayout.NORTH);
        panel1.add(button,BorderLayout.SOUTH);
        add(panel1);
        setLocationRelativeTo(null);
        revalidate();
        repaint();



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(button==e.getSource())
        {

            setVisible(false);
            new Board();

        }

    }
}

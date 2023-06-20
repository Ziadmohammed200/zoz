import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JFrame implements ActionListener {

    X x =new X("X.jpg");
    O o = new O("O.jpg");
    JButton[][] button =new JButton[3][3];
    JPanel mainPanel = new JPanel();
    JPanel player1 =new JPanel();
    JPanel player2 =new JPanel();
    JSplitPane split1 =new JSplitPane();
    JSplitPane split2 =new JSplitPane();
    ImageIcon image = new ImageIcon("zooz.png");
    static int chance=0;
    ImageIcon [][] imag =new ImageIcon[3][3];
    ImageIcon [][] imag2 =new ImageIcon[3][3];
    static   int counter=1;


    public Board() {
         setVisible(true);
         setSize(300, 300);
         mainPanel.setLayout(new GridLayout(3,3));
         mainPanel.setPreferredSize(new Dimension(300,300));
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setTitle("XO GAME");
         setResizable(false);

        for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 button[i][j]=new JButton();
                 mainPanel.add(button[i][j]);
                 button[i][j].setBackground(Color.white);
                 button[i][j].addActionListener(this);

             }


         }
        setIconImage(image.getImage());
        add(mainPanel);
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (button[row][col] == e.getSource()) {
                    if (counter % 2 != 0) {
                        imag[row][col] = new ImageIcon("X.jpg");
                        button[row][col].setIcon(imag[row][col]);
                    } else {
                        imag2[row][col] = new ImageIcon("O.jpg");
                        button[row][col].setIcon(imag2[row][col]);
                    }
                    button[row][col].revalidate();
                    button[row][col].repaint();
                    counter++;
                    break;
                }
            }
        }
    }

}


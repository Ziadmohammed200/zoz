import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JFrame implements ActionListener {

    X x = new X("X.jpg");
    O o = new O("O.jpg");
    JButton[][] button = new JButton[3][3];
    JPanel mainPanel = new JPanel();
    JPanel player1 = new JPanel();
    JPanel player2 = new JPanel();
    JSplitPane split1 = new JSplitPane();
    JSplitPane split2 = new JSplitPane();
    ImageIcon image = new ImageIcon("zooz.png");
    JPanel panel1 = new JPanel();
    static int chance = 0;
    ImageIcon[][] imag = new ImageIcon[3][3];
    ImageIcon[][] imag2 = new ImageIcon[3][3];
    static int counter = 1;
    JButton restartButton =new JButton("Restart");
    JButton endButton =new JButton("exit");

    public Board() {
        setVisible(true);
        setSize(600, 400);
        mainPanel.setLayout(new GridLayout(3, 3));
        mainPanel.setPreferredSize(new Dimension(300, 300));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("XO BY ZIAD MO");
        setResizable(false);
        setLocationRelativeTo(null);

        endButton.addActionListener(this);
        restartButton.addActionListener(this);
        endButton.setSize(40,25);
        restartButton.setSize(40,25);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                button[i][j] = new JButton();
                mainPanel.add(button[i][j]);
                button[i][j].setBackground(Color.white);
                button[i][j].addActionListener(this);

            }
        }
        setIconImage(image.getImage());
        add(mainPanel);
        button[0][0].setText("1");
        button[0][1].setText("2");
        button[0][2].setText("3");
        button[1][0].setText("4");
        button[1][1].setText("5");
        button[1][2].setText("6");
        button[2][0].setText("7");
        button[2][1].setText("8");
        button[2][2].setText("9");



    }

    static int row;
    static int col;

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (button[row][col] == e.getSource()) {
                    if (counter % 2 != 0) {
                        imag[row][col] = new ImageIcon(x.pathofX);
                        button[row][col].setIcon(imag[row][col]);
                        winningX();

                    } else {
                        imag2[row][col] = new ImageIcon(o.getPathOfO());
                        button[row][col].setIcon(imag2[row][col]);
                        winingO();
                    }
                    button[row][col].revalidate();
                    button[row][col].repaint();
                    counter++;
                    break;
                }

            }

        }
    }

    public void winningX() {
        if (row == 0) {
            if (button[row][col].getIcon() != null && button[row + 1][col].getIcon() != null && button[row + 2][col].getIcon() != null) {
                if (button[row][col].getIcon().toString().equals(button[row + 1][col].getIcon().toString()) && button[row][col].getIcon().toString().equals(button[row + 2][col].getIcon().toString())) {
                    JOptionPane.showMessageDialog(null, "X Wins");
                    System.exit(0);
                }
            }


            if (button[row][col + 1].getIcon() != null && button[row + 1][col + 1].getIcon() != null && button[row + 2][col + 1].getIcon() != null) {
                if (button[row][col + 1].getIcon().toString().equals(button[row + 1][col + 1].getIcon().toString()) && button[row][col + 1].getIcon().toString().equals(button[row + 2][col + 1].getIcon().toString())) {
                    JOptionPane.showMessageDialog(null, "X Wins");
                    System.exit(0);
                }
            }

            if (button[row][col + 2].getIcon() != null && button[row + 1][col + 2].getIcon() != null && button[row + 2][col + 2].getIcon() != null) {
                if (button[row][col + 2].getIcon().toString().equals(button[row + 1][col + 2].getIcon().toString()) && button[row][col + 2].getIcon().toString().equals(button[row + 2][col + 2].getIcon().toString())) {
                    JOptionPane.showMessageDialog(null, "X Wins");
                    System.exit(0);
                }
            }
            if (button[row][col].getIcon() != null && button[row + 1][col + 1].getIcon() != null && button[row + 2][col + 2].getIcon() != null) {
                if (button[row][col].getIcon().toString().equals(button[row + 1][col + 1].getIcon().toString()) && button[row][col].getIcon().toString().equals(button[row + 2][col + 2].getIcon().toString())) {
                    JOptionPane.showMessageDialog(null, "X Wins");
                    System.exit(0);
                }
            }


        }
        if (col == 0) {

            if (button[0][col].getIcon() != null && button[0][col + 1].getIcon() != null && button[0][col + 2].getIcon() != null) {
                if (button[0][col].getIcon().toString().equals(button[0][col + 1].getIcon().toString()) && button[0][col].getIcon().toString().equals(button[0][col + 2].getIcon().toString())) {
                    JOptionPane.showMessageDialog(null, "X Wins");
                    System.exit(0);
                }
            }


            if (button[1][col].getIcon() != null && button[1][col + 1].getIcon() != null && button[1][col + 2].getIcon() != null) {
                if (button[1][col].getIcon().toString().equals(button[1][col + 1].getIcon().toString()) && button[1][col].getIcon().toString().equals(button[1][col + 2].getIcon().toString())) {
                    JOptionPane.showMessageDialog(null, "X Wins");
                    System.exit(0);
                }
            }






            if (button[2][col].getIcon() != null && button[2][col + 1].getIcon() != null && button[2][col + 2].getIcon() != null) {
                if (button[2][col].getIcon().toString().equals(button[2][col + 1].getIcon().toString()) && button[2][col].getIcon().toString().equals(button[2][col + 2].getIcon().toString())) {
                    JOptionPane.showMessageDialog(null, "X Wins");
                    System.exit(0);
                }


            }
            if (button[2][0].getIcon() != null && button[1][1].getIcon() != null && button[0][2].getIcon() != null) {
                if (button[2][0].getIcon().toString().equals(button[1][1].getIcon().toString()) && button[2][0].getIcon().toString().equals(button[0][2].getIcon().toString())) {
                    JOptionPane.showMessageDialog(null, "X Wins");
                    System.exit(0);
                }
            }




        }




    }

        public void winingO ()
        {

            if (row == 0) {
                if (button[row][col].getIcon() != null && button[row + 1][col].getIcon() != null && button[row + 2][col].getIcon() != null) {
                    if (button[row][col].getIcon().toString().equals(button[row + 1][col].getIcon().toString()) && button[row][col].getIcon().toString().equals(button[row + 2][col].getIcon().toString())) {
                        JOptionPane.showMessageDialog(null, "O Wins");
                        System.exit(0);
                    }
                }


                if (button[row][col + 1].getIcon() != null && button[row + 1][col + 1].getIcon() != null && button[row + 2][col + 1].getIcon() != null) {
                    if (button[row][col + 1].getIcon().toString().equals(button[row + 1][col + 1].getIcon().toString()) && button[row][col + 1].getIcon().toString().equals(button[row + 2][col + 1].getIcon().toString())) {
                        JOptionPane.showMessageDialog(null, "O Wins");
                        System.exit(0);
                    }
                }

                if (button[row][col + 2].getIcon() != null && button[row + 1][col + 2].getIcon() != null && button[row + 2][col + 2].getIcon() != null) {
                    if (button[row][col + 2].getIcon().toString().equals(button[row + 1][col + 2].getIcon().toString()) && button[row][col + 2].getIcon().toString().equals(button[row + 2][col + 2].getIcon().toString())) {
                        JOptionPane.showMessageDialog(null, "O Wins");
                        System.exit(0);
                    }
                }
                if (button[row][col].getIcon() != null && button[row + 1][col + 1].getIcon() != null && button[row + 2][col + 2].getIcon() != null) {
                    if (button[row][col].getIcon().toString().equals(button[row + 1][col + 1].getIcon().toString()) && button[row][col].getIcon().toString().equals(button[row + 2][col + 2].getIcon().toString())) {
                        JOptionPane.showMessageDialog(null, "O Wins");
                        System.exit(0);
                    }
                }


            }
            if (col == 0) {

                if (button[0][col].getIcon() != null && button[0][col + 1].getIcon() != null && button[0][col + 2].getIcon() != null) {
                    if (button[0][col].getIcon().toString().equals(button[0][col + 1].getIcon().toString()) && button[0][col].getIcon().toString().equals(button[0][col + 2].getIcon().toString())) {
                        JOptionPane.showMessageDialog(null, "O Wins");
                        System.exit(0);
                    }
                }


                if (button[1][col].getIcon() != null && button[1][col + 1].getIcon() != null && button[1][col + 2].getIcon() != null) {
                    if (button[1][col].getIcon().toString().equals(button[1][col + 1].getIcon().toString()) && button[1][col].getIcon().toString().equals(button[1][col + 2].getIcon().toString())) {
                        JOptionPane.showMessageDialog(null, "O Wins");
                        System.exit(0);
                    }
                }






                if (button[2][col].getIcon() != null && button[2][col + 1].getIcon() != null && button[2][col + 2].getIcon() != null) {
                    if (button[2][col].getIcon().toString().equals(button[2][col + 1].getIcon().toString()) && button[2][col].getIcon().toString().equals(button[2][col + 2].getIcon().toString())) {
                        JOptionPane.showMessageDialog(null, "O Wins");
                        System.exit(0);
                    }


                }
                if (button[2][0].getIcon() != null && button[1][1].getIcon() != null && button[0][2].getIcon() != null) {
                    if (button[2][0].getIcon().toString().equals(button[1][1].getIcon().toString()) && button[2][0].getIcon().toString().equals(button[0][2].getIcon().toString())) {
                        JOptionPane.showMessageDialog(null, "O Wins");
                        System.exit(0);
                    }
                }

            }

        }

    }



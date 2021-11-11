package hw8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyOwnCalculator extends JFrame {
    JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonO, buttonMut, buttonDiv, buttonSum, buttonDif, buttonEqu, buttonC;
    String j, h;
    int a, b;
    double z, x;
    double del = 0;
    int sum = 0, dif = 0, umn = 0;


    public MyOwnCalculator() {


        setTitle("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 500);
        setLayout(null);
        JTextField field = new JTextField();
        field.setBounds(20, 20, 350, 32);
        field.setEditable(false);
        add(field);

        ActionListener l = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();
                field.setText(field.getText() + b.getText());
            }
        };
        ActionListener c = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText(null);
            }
        };

        ActionListener r = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == buttonEqu) {
                    h = field.getText();
                    b = Integer.parseInt(h);
                    a = Integer.parseInt(j);
                    z = Float.parseFloat(h);
                    x = Float.parseFloat(j);
                    if (sum == 1) {
                        field.setText(a + b + "");
                        sum = 0;
                        a = 0;
                        b = 0;
                        h = "";
                        j = "";
                    }

                    if (dif == 1) {
                        field.setText(a - b + "");
                        dif = 0;
                        a = 0;
                        b = 0;
                        h = "";
                        j = "";
                    }

                    if (umn == 1) {
                        field.setText(a * b + "");
                        umn = 0;
                        a = 0;
                        b = 0;
                        h = "";
                        j = "";
                    }

                    if (del == 1) {
                        field.setText(z / x + "");
                        del = 0;
                        z = 0;
                        x = 0;
                        h = "";
                        j = "";
                    }

                }


                if (e.getSource() == buttonSum) {
                    j = field.getText();
                    field.setText(null);
                    sum++;
                }

                if (e.getSource() == buttonDif) {
                    j = field.getText();
                    field.setText(null);
                    dif++;
                }

                if (e.getSource() == buttonMut) {
                    j = field.getText();
                    field.setText(null);
                    umn++;
                }

                if (e.getSource() == buttonDiv) {
                    j = field.getText();
                    field.setText(null);
                    del++;
                }
            }
        };

        button1 = new JButton("1");
        button1.setBounds(20, 60, 100, 32);
        add(button1);

        button2 = new JButton("2");
        button2.setBounds(145, 60, 100, 32);
        add(button2);

        button3 = new JButton("3");
        button3.setBounds(270, 60, 100, 32);
        add(button3);

        button4 = new JButton("4");
        button4.setBounds(20, 120, 100, 32);
        add(button4);

        button5 = new JButton("5");
        button5.setBounds(145, 120, 100, 32);
        add(button5);

        button6 = new JButton("6");
        button6.setBounds(270, 120, 100, 32);
        add(button6);

        button7 = new JButton("7");
        button7.setBounds(20, 180, 100, 32);
        add(button7);

        button8 = new JButton("8");
        button8.setBounds(145, 180, 100, 32);
        add(button8);

        button9 = new JButton("9");
        button9.setBounds(270, 180, 100, 32);
        add(button9);

        buttonO = new JButton("0");
        buttonO.setBounds(20, 240, 100, 32);
        add(buttonO);

        buttonMut = new JButton("*");
        buttonMut.setBounds(145, 240, 100, 32);
        add(buttonMut);

        buttonDiv = new JButton("/");
        buttonDiv.setBounds(270, 240, 100, 32);
        add(buttonDiv);

        buttonSum = new JButton("+");
        buttonSum.setBounds(20, 300, 100, 32);
        add(buttonSum);

        buttonDif = new JButton("-");
        buttonDif.setBounds(145, 300, 100, 32);
        add(buttonDif);

        buttonEqu = new JButton("=");
        buttonEqu.setBounds(270, 300, 100, 32);
        add(buttonEqu);

        buttonC = new JButton("C");
        buttonC.setBounds(20, 360, 100, 32);
        add(buttonC);

        button1.addActionListener(l);
        button2.addActionListener(l);
        button3.addActionListener(l);
        button4.addActionListener(l);
        button5.addActionListener(l);
        button6.addActionListener(l);
        button7.addActionListener(l);
        button8.addActionListener(l);
        button9.addActionListener(l);
        buttonO.addActionListener(l);
        buttonMut.addActionListener(r);
        buttonDiv.addActionListener(r);
        buttonSum.addActionListener(r);
        buttonDif.addActionListener(r);
        buttonEqu.addActionListener(r);
        buttonC.addActionListener(c);

        setVisible(true);
    }
}

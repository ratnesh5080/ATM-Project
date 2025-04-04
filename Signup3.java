import java.awt.*;
import javax.swing.*;

public class Signup3 extends JFrame {
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton s, c;
    String formno;

    @SuppressWarnings("unused")
    Signup3(String formno) {
        this.formno = formno;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        JLabel l1 = new JLabel("Page 3:-");
        l1.setBounds(280, 40, 400, 40);
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setBounds(280, 70, 400, 40);
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l2);

        JLabel l3 = new JLabel("Account Type");
        l3.setBounds(100, 140, 200, 30);
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l3);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBounds(100, 180, 150, 30);
        r1.setBackground(new Color(215, 252, 252));
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBounds(350, 180, 300, 30);
        r2.setBackground(new Color(215, 252, 252));
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBounds(100, 220, 250, 30);
        r3.setBackground(new Color(215, 252, 252));
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBounds(350, 220, 300, 30);
        r4.setBackground(new Color(215, 252, 252));
        add(r4);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r1);
        buttonGroup1.add(r2);
        buttonGroup1.add(r3);
        buttonGroup1.add(r4);

        JLabel l4 = new JLabel("Card Number");
        l4.setBounds(100, 300, 200, 30);
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l4);

        JLabel l5 = new JLabel("(Your 16 digit Card Number)");
        l5.setBounds(100, 330, 200, 20);
        l5.setFont(new Font("Raleway", Font.BOLD, 12));
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setBounds(330, 300, 250, 30);
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l6);

        JLabel l7 = new JLabel("(It Would appear on aam card/cheque book and statement)");
        l7.setBounds(330, 330, 500, 20);
        l7.setFont(new Font("Raleway", Font.BOLD, 12));
        add(l7);

        JLabel l8 = new JLabel("PIN");
        l8.setBounds(100, 370, 200, 30);
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setBounds(330, 370, 200, 30);
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l9);

        JLabel l10 = new JLabel("(4-Digit Password)");
        l10.setBounds(100, 400, 200, 20);
        l10.setFont(new Font("Raleway", Font.BOLD, 12));
        add(l10);

        JLabel l11 = new JLabel("Services Required:");
        l11.setBounds(100, 450, 200, 30);
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l11);

        c1 = new JCheckBox("ATM Card");
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBackground(new Color(215, 252, 252));
        c1.setBounds(100, 500, 200, 30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBackground(new Color(215, 252, 252));
        c2.setBounds(350, 500, 200, 30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBackground(new Color(215, 252, 252));
        c3.setBounds(100, 550, 200, 30);
        add(c3);

        c4 = new JCheckBox("Email Alerts");
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBackground(new Color(215, 252, 252));
        c4.setBounds(350, 550, 200, 30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBackground(new Color(215, 252, 252));
        c5.setBounds(100, 600, 200, 30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBackground(new Color(215, 252, 252));
        c6.setBounds(350, 600, 200, 30);
        add(c6);

        c7 = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge.", true);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBackground(new Color(215, 252, 252));
        c7.setBounds(100, 680, 600, 20);
        add(c7);

        JLabel l12 = new JLabel("Form No");
        l12.setBounds(700, 10, 100, 30);
        l12.setFont(new Font("Raleway", Font.BOLD, 14));
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setBounds(760, 10, 100, 30);
        l13.setFont(new Font("Raleway", Font.BOLD, 14));
        add(l13);

        s = new JButton("Submit");
        s.setBackground(Color.BLACK);
        s.setBounds(250, 720, 100, 30);
        s.setFont(new Font("Raleway", Font.BOLD, 14));
        s.setForeground(Color.WHITE);
        s.addActionListener(e -> {
            // Implement Submit button action here
            // Example: JOptionPane.showMessageDialog(this, "Submit button clicked");
        });
        add(s);

        c = new JButton("Cancel");
        c.setBackground(Color.BLACK);
        c.setBounds(420, 720, 100, 30);
        c.setFont(new Font("Raleway", Font.BOLD, 14));
        c.setForeground(Color.WHITE);
        c.addActionListener(e -> {
            // Implement Cancel button action here
            // Example: JOptionPane.showMessageDialog(this, "Cancel button clicked");
        });
        add(c);

        getContentPane().setBackground(new Color(215, 252, 252));
        setSize(850, 800);
        setLocation(400, 20);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Signup3("");
    }
}

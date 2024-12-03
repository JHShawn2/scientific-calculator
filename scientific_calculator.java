import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class scientific_calculator {
public static void main(String[] args) {
        new CalculatorFrame(); // Create the main frame
    }
}

// Class for the main calculator frame
class CalculatorFrame extends JFrame {
    public CalculatorFrame() {
        setTitle("Under Construction");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(452, 715);
        setResizable(false);
        setLayout(null);

        // Create and add body panel
        BodyPanel body = new BodyPanel();
        add(body);

        setVisible(true);
    }
}

// Class for the body panel
class BodyPanel extends JPanel {
    public BodyPanel() {
        setBounds(15, 15, 410, 650);
        setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));
        setBackground(new Color(255, 246, 233));
        setLayout(null);

        // Create and add display panel
        DisplayPanel display = new DisplayPanel();
        add(display);

        // Create and add button panel
        ButtonsPanel buttonsPanel = new ButtonsPanel();
        add(buttonsPanel);
    }
}

// Class for the display panel
class DisplayPanel extends JPanel {
    public DisplayPanel() {
        setBounds(10, 10, 390, 70);
        setBackground(new Color(128, 196, 233));
        setLayout(null);

        // Create and add text field
        JTextField dText = new JTextField();
        dText.setBounds(5, 5, 380, 60);
        dText.setFont(dText.getFont().deriveFont(25f));
        dText.setBackground(Color.WHITE);
        add(dText);
    }
}

// Class for the buttons panel
class ButtonsPanel extends JPanel {
    public ButtonsPanel() {
        setBounds(2, 92, 406, 556);
        setBackground(new Color(128, 196, 233));
        setLayout(null);

        // Create and add top buttons panel
        TopButtons topButtons = new TopButtons();
        add(topButtons);

        // Create and add middle buttons panel
        MidButtons midButtons = new MidButtons();
        add(midButtons);

        // Create and add lower buttons panel
        LowerButtons lowerButtons = new LowerButtons();
        add(lowerButtons);
    }
}

// Class for the top buttons panel
class TopButtons extends JPanel {
    public TopButtons() {
        setBounds(0, 0, 406, 100);
        setBackground(Color.YELLOW);
        setLayout(null);
        // setLayout(new GridLayout(1, 4, 5, 5)); // 1 row, 4 columns


        innerTop1 innerTop1 = new innerTop1();
        add(innerTop1);

        innerTop2 innerTop2 = new innerTop2();
        add(innerTop2);

        innerTop3 innerTop3 = new innerTop3();
        add(innerTop3);



        // inerTopButtons innerTop2 = new inerTopButtons();
        // add(innerTop2);

        // inerTopButtons innerTop2 = new inerTopButtons();
        // add(innerTop2);

        // Add buttons to the panel
        // add(createButton("C"));
        // add(createButton("CE"));
        // add(createButton("%"));
        // add(createButton("/"));
    }

    // private JButton createButton(String label) {
    //     JButton button = new JButton(label);
    //     button.setBackground(Color.WHITE);
    //     button.setForeground(Color.BLACK);
    //     button.setFocusable(false);
    //     return button;
    // }
}

//inner top buttons (left side 4 buttons)
class innerTop1 extends JPanel{
    public innerTop1(){
        setBounds(0, 0,135 , 100);
        setBackground(Color.BLUE);
        setLayout(null);

        JButton shift = new JButton("shift");
        shift.setBounds(5,10, 57, 30);
        add(shift);

        JButton alpha = new JButton("alpha");
        alpha.setBounds(72,10, 57, 30);
        add(alpha);

        JButton calc = new JButton("CALC");
        calc.setBounds(5,60, 57, 30);
        add(calc);

        JButton f = new JButton("f");
        f.setBounds(72,60, 57, 30);
        add(f);



    }
}
//inner top buttons (middle 4 buttons)
class innerTop2 extends JPanel{
    public innerTop2(){
        setBounds(135, 0,135 , 100);
        setBackground(Color.black);
        setLayout(null);

        JButton shift = new JButton("a");
        shift.setBounds(5,10, 57, 30);
        add(shift);

        JButton alpha = new JButton("alpha");
        alpha.setBounds(72,10, 57, 30);
        add(alpha);

        JButton calc = new JButton("CALC");
        calc.setBounds(5,60, 57, 30);
        add(calc);

        JButton f = new JButton("f");
        f.setBounds(72,60, 57, 30);
        add(f);
    }

}
//inner top buttons (right side 4 buttons)
class innerTop3 extends JPanel{
    public innerTop3(){
        setBounds(270, 0,136 , 100);
        setBackground(Color.pink);
        setLayout(null);

        JButton shift = new JButton("shift");
        shift.setBounds(5,10, 57, 30);
        add(shift);

        JButton alpha = new JButton("alpha");
        alpha.setBounds(72,10, 57, 30);
        add(alpha);

        JButton calc = new JButton("CALC");
        calc.setBounds(5,60, 57, 30);
        add(calc);

        JButton f = new JButton("f");
        f.setBounds(72,60, 57, 30);
        add(f);

    }
}






// Class for the middle buttons panel
class MidButtons extends JPanel {
    public MidButtons() {
        setBounds(0, 110, 406, 150);
        setBackground(Color.GRAY);
        // setLayout(new GridLayout(2, 4, 5, 5)); // 2 rows, 4 columns

        // // Add buttons to the panel
        // for (int i = 7; i <= 9; i++) add(createButton(String.valueOf(i)));
        // add(createButton("*"));

        // for (int i = 4; i <= 6; i++) add(createButton(String.valueOf(i)));
        // add(createButton("-"));
    }

    // private JButton createButton(String label) {
    //     JButton button = new JButton(label);
    //     button.setBackground(Color.WHITE);
    //     button.setForeground(Color.BLACK);
    //     button.setFocusable(false);
    //     return button;
    // }
}

// Class for the lower buttons panel
class LowerButtons extends JPanel {
    public LowerButtons() {
        setBounds(0, 270, 406, 285);
        setBackground(Color.YELLOW);
        // setLayout(new GridLayout(3, 4, 5, 5)); // 3 rows, 4 columns

        // Add buttons to the panel
        // for (int i = 1; i <= 3; i++) add(createButton(String.valueOf(i)));
        // add(createButton("+"));

        // add(createButton("0"));
        // add(createButton("."));
        // add(createButton("="));
        // add(createButton("("));
        // add(createButton(")"));
        // add(createButton("^"));
        // add(createButton("√"));
    }

    // private JButton createButton(String label) {
    //     JButton button = new JButton(label);
    //     button.setBackground(Color.WHITE);
    //     button.setForeground(Color.BLACK);
    //     button.setFocusable(false);
    //     return button;
    // }
}

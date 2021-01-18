package src.calculadora;
 
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
 
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class Main extends JFrame implements ActionListener {
 
    private JTextField t;
    Stack<String> stack;
    char operator;
    boolean finished;
 
    public static void main(String[] args) {
        new Main();
    }
 
    /*
     Inicializamos variables varias e invocamos al configurador del formulario
     */
    public Main() {
        super("Calculadora Básica");
        finished = false;
        stack = new Stack<String>();
        this.initFrame();
    }
 
    /*
     * Configurador del formulario
     * Setea los controles en pantalla y enlaza a eventos
     * Muestra el frame
     */
    private void initFrame() {
        String labelButtons[] = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+", "C"};
        JPanel cp = (JPanel) this.getContentPane();
        cp.setLayout(new BorderLayout());
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(0, 4));
        for (int i = 0; i < labelButtons.length; ++i) {
            JButton button = new JButton(labelButtons[i]);
            button.addActionListener(this);
            p.add(button);
        }
        t = new JTextField();
        t.setHorizontalAlignment(JTextField.RIGHT);
        t.setEditable(false);
        cp.add(t, BorderLayout.PAGE_START);
        cp.add(p, BorderLayout.CENTER);
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(Main.EXIT_ON_CLOSE);
    }
 
    /*
     * Interpreta la pulsación de botones y aplica el algoritmo correspondiente
     */
    public void actionPerformed(ActionEvent e) {
        char c = ((JButton) e.getSource()).getText().charAt(0);
        if (finished) {
            t.setText("");
            finished = false;
        }
        if (c >= '0' && c <= '9') {
            t.setText(t.getText() + c);
        } else if (c == '.') {
            if (!t.getText().contains(".") && !t.getText().equals("")) {
                t.setText(t.getText() + ".");
            }
        } else if (c == 'C') {
            t.setText("");
            stack.removeAllElements();
        } else if (c == '=') {
            calc();
        } else {
            operator = c;
            if (!t.getText().equals("")) {
                stack.push(t.getText());
            }
            t.setText("");
        }
    }
 
    /*
     * Efectua la operación en si
     */
    private void calc() {
        if (!t.getText().equals("") && !stack.isEmpty()) {
            double a = Double.parseDouble(stack.pop());
            double b = Double.parseDouble(t.getText());
            double r = 0;
            if (operator == '+') {
                r = a + b;
            } else if (operator == '-') {
                r = a - b;
            } else if (operator == '*') {
                r = a * b;
            } else if (operator == '/') {
                r = a / (b != 0 ? b : 1);
            }
            t.setText(Double.toString(r));
        }
        finished = true;
    }
}
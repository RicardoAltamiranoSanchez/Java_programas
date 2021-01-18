package calculadora;
 
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
 
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class calculadora extends JFrame implements ActionListener {
 
    private JTextField t;
    Stack<String> apilar;
    char operador;
    boolean terminado;
 
    public static void main(String[] args) {
        new calculadora();
    }
 
    /*
     Inicializamos variables varias e invocamos al configurador del formulario
     */
    public calculadora() {
        super("Calculadora");
        terminado= false;
        apilar = new Stack<String>();
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
        this.setDefaultCloseOperation(calculadora.EXIT_ON_CLOSE);
    }
 
    /*
     * Interpreta la pulsaciÃ³n de botones y aplica el algoritmo correspondiente
     */
    public void actionPerformed(ActionEvent e) {
        char c = ((JButton) e.getSource()).getText().charAt(0);
        if (terminado) {
            t.setText("");
            terminado= false;
        }
        if (c >= '0' && c <= '9') {
            t.setText(t.getText() + c);
        } else if (c == '.') {
            if (!t.getText().contains(".") && !t.getText().equals("")) {
                t.setText(t.getText() + ".");
            }
        } else if (c == 'C') {
            t.setText("");
            apilar.removeAllElements();
        } else if (c == '=') {
            calc();
        } else {
            operador = c;
            if (!t.getText().equals("")) {
                apilar.push(t.getText());
            }
            t.setText("");
        }
    }
 
    /*
     * Efectua la operaciÃ³n en si
     */
    private void calc() {
        if (!t.getText().equals("") && !apilar.isEmpty()) {
            double a = Double.parseDouble(apilar.pop());
            double b = Double.parseDouble(t.getText());
            double r = 0;
            if (operador == '+') {
                r = a + b;
            } else if (operador == '-') {
                r = a - b;
            } else if (operador == '*') {
                r = a * b;
            } else if (operador == '/') {
                r = a / (b != 0 ? b : 1);
            }
            t.setText(Double.toString(r));
        }
        terminado= true;
    }
}
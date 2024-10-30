import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JTextField txtPrimeiroValor;
    private JTextField txtSegundoValor;
    private JButton btnSomar;
    private JTextField txtResultado;
    private JButton btnLimpar;
    private JPanel mainPanel;



    public Calculator(){
        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //peguei info da tela
                Integer primeiro = Integer.valueOf(txtPrimeiroValor.getText());
                Integer segundo = Integer.valueOf(txtSegundoValor.getText());

                //processei
                Integer soma = primeiro + segundo;

                txtResultado.setText(soma.toString());
            }
        });

        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPrimeiroValor.setText("");
                txtSegundoValor.setText("");
                txtResultado.setText("");
            }
        });
    }

    public static void main(String[] args) {

        //Cria minha tela
        JFrame frame = new JFrame("Minha Calculadora");

        //Mostra qual painel vai ser assistido
        frame.setContentPane( new Calculator().mainPanel);

        //seta a configuração padrão de saida
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //ajusta a tela no tamanho do painel
        frame.pack();

        frame.setVisible(true);

        frame.setSize(400,400);

    }

}

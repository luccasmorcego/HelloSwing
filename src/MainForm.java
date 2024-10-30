import javax.swing.*;

public class MainForm {

    private JTextField txtNome;

    private JLabel lblNome;

    private JButton btnValidar;

    private JPanel mainPanel;

    public static void main(String[] args) {

        //Cria minha tela
        JFrame frame = new JFrame("Minha primeira tela!");

        //Mostra qual painel vai ser assistido
        frame.setContentPane( new MainForm().mainPanel);

        //seta a configuração padrão de saida
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //ajusta a tela no tamanho do painel
        frame.pack();

        frame.setSize(500, 500);

        frame.setVisible(true);

    }

}

//Cassio Eduardo Gaspar Valezzi – RM551059
//Lucca Sabatini Tambellini - RM98169
//Gabriel Antony Cadima Ciziks - RM98215

package br.com.fiap.main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;


@SuppressWarnings("serial")
public class GuiInicial extends JFrame{
    private JButton buttonEntrar;
    private JPanel panelInicial;

    public GuiInicial() {
        createUIComponents();
        eventoEntrar();
    }

    private void createUIComponents(){
        setLayout(null);
        setBackground(Color.DARK_GRAY);
        setTitle("Entrar");
        setSize(700, 500);
        panelInicial = new JPanel();


        buttonEntrar = new JButton("Entrar");

        buttonEntrar.setSize(140,30);
        buttonEntrar.setLocation((getSize().width - buttonEntrar.getSize().width)/2,(getSize().height - buttonEntrar.getSize().height)/2);

        add(buttonEntrar);
    }
// Metodo entra na Janela de analíse de amostra de água
    private void eventoEntrar(){
        buttonEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);

                GuiPrincipal principal = new GuiPrincipal();
                Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
                principal.setLocation((tela.width - principal.getSize().width)/2,(tela.height - principal.getSize().height)/2);
                principal.setVisible(true);


            }
        });
    }

    public static void main(String[] args) {
        GuiInicial myapp = new GuiInicial();
        myapp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        myapp.setLocation((tela.width - myapp.getSize().width)/2,(tela.height - myapp.getSize().height)/2);
        myapp.setVisible(true);

    }


}

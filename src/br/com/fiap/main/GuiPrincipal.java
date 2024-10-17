//Cassio Eduardo Gaspar Valezzi – RM551059
//Lucca Sabatini Tambellini - RM98169
//Gabriel Antony Cadima Ciziks - RM98215

package br.com.fiap.main;

import br.com.fiap.bean.Agua;
import br.com.fiap.bean.Resultado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiPrincipal extends JFrame{
    private JTextField textCor;
    private JTextField textPh;
    private JTextField textOdor;
    private JLabel corDaÁguaLabel;
    private JLabel phDaÁguaLabel;
    private JLabel odorLabel;
    private JButton buttonEnviar;
    private JPanel panelPrincipal;
    private JTextArea resultadoTextArea;
    private JLabel labelAnalise;
    private JLabel saborLabel;
    private JTextField textSabor;
    private JLabel obrigLabel;

    public GuiPrincipal(){
        createUIComponents();
        eventoEnviar();
    }

    private void createUIComponents() {
        setTitle("Analise da Água");
        setContentPane(panelPrincipal);
        setBackground(Color.DARK_GRAY);
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

//    Metodo envia os dados escritos pelo usuario para serer precessados na classe Agua, dependendo de quais campos ele utilizou
    private void eventoEnviar(){
        buttonEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Resultado resultado = new Resultado();
                    Agua agua = new Agua();

                    if (textCor.getText().isBlank()&&textOdor.getText().isBlank()&&textPh.getText().isBlank()) {
                        throw new Exception("Preencha os campos com *");
                    }
                    else if (textSabor.getText().isBlank() || textSabor.getText().equals("sim ou não")){
                        resultadoTextArea.setText(resultado.respostas(textCor.getText(),Integer.parseInt(textPh.getText()),textOdor.getText()));
                        agua.setTurbidez(textCor.getText());
                        agua.setPh(Integer.parseInt(textPh.getText()));
                        agua.setOdor(textOdor.getText());
                        if (agua.getTurbidez().equals("transparente") && (agua.getPh()>=6 && agua.getPh()<=9) &&agua.getOdor().equals("inodoro")){
                            resultadoTextArea.append("\n    Sua água está apropriada para uso e não está contaminada, pois sua transparencia indica ausência de sólidos prejudiciais, seu ph Indica equilíbrio químico ideal para consumo e a ausência de odores sugere ausência de contaminantes.");
                        } else if ( agua.getOdor().equals("odorífero")) {
                            resultadoTextArea.append("\n    Sua água não está apropriada para uso e provavelmente está contaminada, mesmo que o ph e sua transparencia estejam boas a aguá para uso não pode apresentar nenhum odor porque odores podem indicar a presença de contaminantes orgânicos ou químicos");
                        } else if (agua.getTurbidez().equals("turva") ) {
                            resultadoTextArea.append("\n    Sua água não está apropriada para uso e provavelmente está contaminada, mesmo que não apresente odor e o ph esteja bom a aguá para uso não pode estar turva, pois podem apresentar a presença de contaminantes, como partículas em suspensão ou organismos");
                        }else if (agua.getPh()>9 || agua.getPh()<6){
                            resultadoTextArea.append("\n    Sua água não está apropriada para uso e provavelmente está contaminada, mesmo que esteja transparente e inodora a agua fora fora desse intervalo de 6 e 9 de ph podem indicar a presença de substâncias químicas prejudiciais.");
                        } else{
                            resultadoTextArea.append("\n    Sua água não está apropriada para uso e está contaminada, a água analisada não confere com os critérios estabelecidos para garantir que a água não só esteja livre de contaminantes perigosos, mas também seja agradável e segura para uso diário");
                        }
                    } else {
                        resultadoTextArea.setText(resultado.respostas(textCor.getText(),Integer.parseInt(textPh.getText()),textOdor.getText(),textSabor.getText()));
                        agua.setTurbidez(textCor.getText());
                        agua.setPh(Integer.parseInt(textPh.getText()));
                        agua.setOdor(textOdor.getText());
                        agua.setSabor(textSabor.getText());
                        if (agua.getTurbidez().equals("transparente") && (agua.getPh()>=6 && agua.getPh()<=9) &&agua.getOdor().equals("inodoro")){
                            resultadoTextArea.append("\n    Sua água está apropriada para uso e não está contaminada, pois sua transparencia indica ausência de sólidos prejudiciais, seu ph Indica equilíbrio químico ideal para consumo e a ausência de odores sugere ausência de contaminantes.");
                        } else if ( agua.getOdor().equals("odorífero")) {
                            resultadoTextArea.append("\n    Sua água não está apropriada para uso e provavelmente está contaminada, mesmo que sejá insípida, e o ph e transparencia estejam boas a aguá para uso não pode apresentar nenhum odor porque odores podem indicar a presença de contaminantes orgânicos ou químicos");
                        } else if (agua.getTurbidez().equals("turva") ) {
                            resultadoTextArea.append("\n    Sua água não está apropriada para uso e provavelmente está contaminada, mesmo que não apresente odor, o ph esteja bom e insípida a aguá para uso não pode estar turva, pois podem apresentar a presença de contaminantes, como partículas em suspensão ou organismos");
                        }else if (agua.getPh()>9 || agua.getPh()<6){
                            resultadoTextArea.append("\n    Sua água não está apropriada para uso e provavelmente está contaminada, mesmo que esteja transparente, inodora e insípida a agua fora fora desse intervalo de 6 e 9 de ph podem indicar a presença de substâncias químicas prejudiciais.");
                        } else if (agua.getSabor().equals("sim")) {
                            resultadoTextArea.append("\n    Sua água não está apropriada para uso e provavelmente está contaminada, mesmo que sua esteja tranparente e inodora e o ph esteja bom Sabor na água pode indicar a presença de químicos como cloro, metais pesados (como ferro e cobre), ou produtos de desinfecção ");
                        } else{
                            resultadoTextArea.append("\n    Sua água não está apropriada para uso e está contaminada, a água analisada não confere com os critérios estabelecidos para garantir que a água não só esteja livre de contaminantes perigosos, mas também seja agradável e segura para uso diário");
                        }
                    }

                }catch (Exception e2){
                    JOptionPane.showMessageDialog(null, e2.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}

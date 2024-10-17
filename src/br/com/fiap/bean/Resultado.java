//Cassio Eduardo Gaspar Valezzi – RM551059
//Lucca Sabatini Tambellini - RM98169
//Gabriel Antony Cadima Ciziks - RM98215

package br.com.fiap.bean;

import javax.swing.*;

public class Resultado {
    //    Metodos mostra a o usuario os dados processados
    public String respostas(String turbidez, int ph, String odor){
        String resultados = "Resultados:";
        try {
            if (turbidez.equals("transparente")){
                resultados = resultados + "\nTurbidez: ok";
            }else if (turbidez.equals("turva")) {
                resultados = resultados + "\nTurbidez: ruim";
            } else{
                JOptionPane.showMessageDialog(null, "opção errada para TURBIDEZ, apenas: transparente ou turva");
                resultados = resultados + "\nTurbidez: dados invalidos";
            }

            if (ph>=6 && ph<=9){
                resultados = resultados +   "\nPh: ok";
            }else if (ph>=1&&ph<6) {
                resultados = resultados +   "\nPh: muito alcalino";
            } else if (ph>9&&ph<=14) {
                resultados = resultados +   "\nPh: muito acido";
            } else{
                JOptionPane.showMessageDialog(null, "opção errada para PH, use apenas numero inteiros de 1 á 14");
                resultados = resultados +   "\nPh: dados invalidos";

            }

            if (odor.equals("inodoro")){
                resultados = resultados + "\nOdor: ok";

            }else if (odor.equals("odorífero")) {
                resultados = resultados + "\nOdor: ruim";

            } else{
                JOptionPane.showMessageDialog(null, "opção errada para ODOR, apenas: inodoro ou odorífero");
                resultados = resultados + "\nOdor: dados invalidos";
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        return resultados;
    }
    public String respostas(String turbidez, int ph, String odor, String sabor){
        String resultados = "Resultados:";

        try {
            if (turbidez.equals("transparente")){
                resultados = resultados + "\nTurbidez: ok";
            }else if (turbidez.equals("turva")) {
                resultados = resultados + "\nTurbidez: ruim";
            } else{
                JOptionPane.showMessageDialog(null, "opção errada para TURBIDEZ, apenas: transparente ou turva");
                resultados = resultados + "\nTurbidez: dados invalidos";
            }

            if (ph>=6 && ph<=9){
                resultados = resultados +   "\nPh: ok";

            }else if (ph>=1&&ph<6) {
                resultados = resultados +   "\nPh: muito alcalino";
            } else if (ph>9&&ph<=14) {
                resultados = resultados +   "\nPh: muito acido";
            } else{
                JOptionPane.showMessageDialog(null, "opção errada para PH, use apenas numero inteiros de 1 á 14");
                resultados = resultados +   "\nPh: dados invalidos";
            }

            if (odor.equals("inodoro")){
                resultados = resultados + "\nOdor: ok";

            }else if (odor.equals("odorífero")) {
                resultados = resultados + "\nOdor: Inapropriado";

            } else{
                JOptionPane.showMessageDialog(null, "opção errada para ODOR, apenas: inodoro ou odorífero");
                resultados = resultados + "\nOdor: dados invalidos";

            }

            if (sabor.equals("sim")){
                resultados = resultados + "\nSabor: Inapropriado";
            }else if (sabor.equals("não")) {
                resultados = resultados + "\nSabor: ok";
            } else{
                JOptionPane.showMessageDialog(null, "opção errada para SABOR, apenas: sim ou não");
                resultados = resultados + "\nSabor: dados invalidos";
            }

        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }

        return resultados;


    }
}

//Cassio Eduardo Gaspar Valezzi – RM551059
//Lucca Sabatini Tambellini - RM98169
//Gabriel Antony Cadima Ciziks - RM98215

package br.com.fiap.bean;

import javax.swing.*;

public class Agua {
    private String turbidez;
    private int ph;
    private String odor;
    private String sabor;

    public Agua(){

    }
    public Agua(String turbidez, int ph, String odor, String sabor){
        this.turbidez = turbidez;
        this.ph = ph;
        this.odor = odor;
        this.sabor = sabor;
    }
    public String getTurbidez(){
        return turbidez;
    }

    public int getPh(){
        return ph;
    }

    public String getOdor(){
        return odor;
    }
    public String getSabor(){ return sabor;}

    public void setTurbidez(String turbidez){
        this.turbidez = turbidez;
    }
    public void setPh(int ph){
        this.ph = ph;
    }
    public void setOdor(String odor){
        this.odor = odor;
    }
    public void setSabor(String sabor){this.sabor = sabor;}






}


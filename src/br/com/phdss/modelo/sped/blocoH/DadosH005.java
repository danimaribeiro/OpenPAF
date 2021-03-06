package br.com.phdss.modelo.sped.blocoH;

import br.com.phdss.modelo.sped.Bean;
import java.util.Date;

public class DadosH005 extends Bean {

    private Date dt_inv;
    private double vl_inv;
    private String mot_inv;

    public DadosH005() {
        super("H005");
    }

    public Date getDt_inv() {
        return dt_inv;
    }

    public void setDt_inv(Date dt_inv) {
        this.dt_inv = dt_inv;
    }

    public double getVl_inv() {
        return vl_inv;
    }

    public void setVl_inv(double vl_inv) {
        this.vl_inv = vl_inv;
    }

    public String getMot_inv() {
        return mot_inv;
    }

    public void setMot_inv(String mot_inv) {
        this.mot_inv = mot_inv;
    }
}

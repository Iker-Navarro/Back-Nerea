/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author dw2
 */
public class Pregunta {
    private String pregunta;
    private String rptaOK;
    private String rptaUser;

    public Pregunta() {
    }

    public Pregunta(String pregunta, String rptaOK, String rptaUser) {
        this.pregunta = pregunta;
        this.rptaOK = rptaOK;
        this.rptaUser = rptaUser;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRptaOK() {
        return rptaOK;
    }

    public void setRptaOK(String rptaOK) {
        this.rptaOK = rptaOK;
    }

    public String getRptaUser() {
        return rptaUser;
    }

    public void setRptaUser(String rptaUser) {
        this.rptaUser = rptaUser;
    }
    
    
    
}

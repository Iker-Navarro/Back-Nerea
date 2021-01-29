/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbeans;

import beans.Pregunta;
import java.util.ArrayList;

/**
 *
 * @author dw2
 */
public class MBTest {

    
    private Pregunta[] preguntas;
    private int iactual;    
    private int naciertos;
    
    
    public MBTest() {
        
        preguntas=new Pregunta[]
            {new Pregunta("2+2","4",""),new Pregunta("2+3","5",""),new Pregunta("2+5","7","")};          
        iactual=0;
        naciertos=0;        
    }
    
    
     public String comprobar(){
        
        if (preguntas[iactual].getRptaOK().equals(preguntas[iactual].getRptaUser())){
            naciertos++;
            iactual++;
        }
        
        return null;       
    }

    public int getNaciertos() {
        return naciertos;
    }

    public Pregunta[] getPreguntas() {
        return preguntas;
    }

    public int getIactual() {
        return iactual;
    }

    
  
    

   
    public Pregunta pregActual(){
        return preguntas[iactual];
    }
    
    
}

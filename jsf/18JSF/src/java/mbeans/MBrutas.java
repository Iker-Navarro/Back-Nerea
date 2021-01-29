/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbeans;

import beans.Bus;
import beans.Ruta;
import dao.DaoBuses;
import java.util.ArrayList;

/**
 *
 * @author dw2
 */
public class MBrutas {

    private ArrayList<Bus> buses;
    private ArrayList<Ruta> rutas;
    private String busActual;
   
    public MBrutas() {        
        buses=(ArrayList<Bus>) DaoBuses.buses();
        
        busActual=buses.get(0).getId_placa();
        rutas=DaoBuses.rutasBus(busActual);
        
    }

    public ArrayList<Bus> getBuses() {
        return buses;
    }

    public void setBusActual(String busActual) {
        this.busActual = busActual;
    }

    public String getBusActual() {
        return busActual;
    }

    public ArrayList<Ruta> getRutas() {
        return rutas;
    }
    
    public String cambiarTarifa(Ruta ruta){
        DaoBuses.cambiarTarifa(ruta);        
        return null;
    }
    
    public void cargarRutasBus(){
        
        rutas=DaoBuses.rutasBus(busActual);
       
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaproyectores;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class GestorDePaquetesDeProyectores {
    private ArrayList <PaqueteProyectores> paquetes;
    private String nombreEmpresa;
    
    GestorDePaquetesDeProyectores(String nombre){
    nombreEmpresa=nombre;
    paquetes= new ArrayList<>();
    }
    
    String getNombreEmpresa(){
        return nombreEmpresa;
    }
    
    void setNombreEmpresa(String nombre){
        nombreEmpresa=nombre;
    }
    
    void agregarPaquete(PaqueteProyectores paqueteNuevo){
        paquetes.add(paqueteNuevo);
    }
}

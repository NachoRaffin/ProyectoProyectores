/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaproyectores;

/**
 *
 * @author Administrador
 */
public class PaqueteProyectores {
    private int codPaqueteDeProyectores;
    private String destinatario;
    private String destino;
    private float costoEnvio;
    private boolean enTransito;
    
    PaqueteProyectores(int codPaquete,String destinatario, String destino, float costoEnvio){
        codPaqueteDeProyectores=codPaquete;
        this.destinatario=destinatario;
        this.destino=destino;
        this.costoEnvio=costoEnvio;
    }
    
    void setCodPaquete (int cod){
        codPaqueteDeProyectores=cod;
    }
    
    int getCodPaquete (){
        return codPaqueteDeProyectores;
    }
    
    void setEnTransito(boolean enTransito){
        this.enTransito=enTransito;
    }
    
    boolean getEnTransito(){
        return enTransito;
    }
    
    void setDestinatario(String destinatario){
        this.destinatario=destinatario;
    }
}

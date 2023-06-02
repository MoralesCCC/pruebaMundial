/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomundial.model;

/**
 *
 * @author PC
 */
public class Resultados {

    String Grupo;
    String Local;
    String Visitante;
    String Continente_local;
    String Continente_visitane;
    int Goles_local;
    int Goles_visitante;
    
    public Resultados(){
        
    }
    
    public Resultados(String Grupo,String Local,String Visitante,String Continente_local,String Continente_visitane,int Goles_local, int Goles_visitante) {
        this.Grupo = Grupo;
        this.Local = Local;
        this.Visitante = Visitante;
        this.Continente_local = Continente_local;
        this.Continente_visitane = Continente_visitane;
        this.Goles_local = 0;
        this.Goles_visitante = 0;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String Grupo) {
        this.Grupo = Grupo;
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String Local) {
        this.Local = Local;
    }

    public String getVisitante() {
        return Visitante;
    }

    public void setVisitante(String Visitante) {
        this.Visitante = Visitante;
    }

    public String getContinente_local() {
        return Continente_local;
    }

    public void setContinente_local(String Continente_local) {
        this.Continente_local = Continente_local;
    }

    public String getContinente_visitane() {
        return Continente_visitane;
    }

    public void setContinente_visitane(String Continente_visitane) {
        this.Continente_visitane = Continente_visitane;
    }

    public int getGoles_local() {
        return Goles_local;
    }

    public void setGoles_local(int Goles_local) {
        this.Goles_local = Goles_local;
    }

    public int getGoles_visitante() {
        return Goles_visitante;
    }

    public void setGoles_visitante(int Goles_visitante) {
        this.Goles_visitante = Goles_visitante;
    }

}

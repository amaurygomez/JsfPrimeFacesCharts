/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.persistence.Entity;

import javax.persistence.Id;

/**
 *
 * @author Amaury
 */
@Entity
 
public class Pregunta {
    String pregunta;

    public Pregunta() {
    }

    public Pregunta(Pregunta pregunta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Pregunta(String pregunta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    } @Id
            int id;
    
     @Override
  public String toString() {
    return "Todo [pregunta=" + pregunta + "]";
  }
}

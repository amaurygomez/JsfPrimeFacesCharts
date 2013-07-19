/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import models.Pregunta;

/**
 *
 * @author Amaury
 */
@ManagedBean
@RequestScoped
public class PreguntasBean {

    /**
     * Creates a new instance of PreguntasBean
     */
    public PreguntasBean() {
        
        
        
        
     
    }
    
    
    

       public List<Pregunta> getPreguntas(){
           EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("JobPU");
        EntityManager em = emf.createEntityManager();
        Query createQuery = em.createNativeQuery("SELECT * FROM pregunta ORDER BY RAND()LIMIT 10");
      List<Pregunta> preguntas = createQuery.getResultList();
         
        return preguntas;
        }
       
      
       
       }
       




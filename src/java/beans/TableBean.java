package beans;


  
import controllers.EstudianteJsonDataServlet;
import java.io.Serializable;  
import java.util.ArrayList;  
import java.util.List;  
import java.util.UUID;  
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;  
import models.Estudiante;
import org.primefaces.event.RowEditEvent;  
  

  @ManagedBean
public class TableBean implements Serializable {  
  

  //  public List<Estudiante> estudiante;  
        EstudianteJsonDataServlet ejd = new EstudianteJsonDataServlet();
       Estudiante e = new Estudiante();
     

    public TableBean() {  
       
            ejd.estudiante = new ArrayList<>();
  
    }  
    
    public   List<Estudiante> getMatematica(){
        
        return ejd.estudiante;
        
        
    }
    public List<Estudiante> getFisica(){
   return ejd.estudiante;
    }
    
    public List<Estudiante> getNombre(){
     return ejd.estudiante;
    
    
    }
    
    public List<Estudiante> setMatematicax(){
        return ejd.estudiante;
    }
    
    public List<Estudiante> setFisicax(){
         return ejd.estudiante;
    
    }
    
    public List<Estudiante> setNombrex(){
        return ejd.estudiante;
    
    }
    
        public void onEdit(RowEditEvent event) {  
        FacesMessage msg = new FacesMessage("test", ((Estudiante) event.getObject()).getNombre());  
  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }  
      
    public void onCancel(RowEditEvent event) {  
        FacesMessage msg = new FacesMessage("test", ((Estudiante) event.getObject()).getNombre());  
  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }  
  
 
}  
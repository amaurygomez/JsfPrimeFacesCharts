package controllers;

import beans.TableBean;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import java.util.logging.Logger;
import models.Estudiante;

@WebServlet("/EstudianteJsonDataServlet")
public class EstudianteJsonDataServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public EstudianteJsonDataServlet() {
		super();
	}
        
     public static   List<Estudiante> estudiante ;

  

    public static void setEstudiante(List<Estudiante> estudiante) {
        EstudianteJsonDataServlet.estudiante = estudiante;
    }

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		 List<Estudiante> listOfStudent = getEstudiante();
                
                                

		Gson gson = new Gson();

		String jsonString = gson.toJson(listOfStudent);

		response.setContentType("application/json");

		response.getWriter().write(jsonString);
                

	}
  public static List<Estudiante> getEstudiante() {
      
      List<Estudiante> listOfStudent = new ArrayList<Estudiante>();
		Estudiante s1 = new Estudiante();
		s1.setNombre("Pedro");
		s1.setFisica(85);
		s1.setMatematica(80);
		listOfStudent.add(s1);

		Estudiante s2 = new Estudiante();
	s2.setNombre("Manuel");
		s2.setFisica(90);
		s2.setMatematica(95);
		listOfStudent.add(s2);

		Estudiante s3 = new Estudiante();
		s3.setNombre("Maria");
		s3.setFisica(75);
		s3.setMatematica(70);
		listOfStudent.add(s3);

		Estudiante s4 = new Estudiante();
		s4.setNombre("jose");
		s4.setFisica(75);
		s4.setMatematica(70);
		listOfStudent.add(s4);

		return listOfStudent;
       
    }
	
    private static final Logger LOG = Logger.getLogger(EstudianteJsonDataServlet.class.getName());
}

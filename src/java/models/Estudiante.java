package models;

import sun.security.jca.GetInstance;

public class Estudiante {
    private static Estudiante instancia;
    
    
 	public static synchronized Estudiante getInstancia()
			 {
		return instancia == null ? instancia = new Estudiante()
				: instancia;
	}
        
   

	private String nombre;
	
	private int matematica;
	
	private int fisica;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMatematica() {
        return matematica;
    }

    public void setMatematica(int matematica) {
        this.matematica = matematica;
    }

    public int getFisica() {
        return fisica;
    }

    public void setFisica(int fisica) {
        this.fisica = fisica;
    }

	
}

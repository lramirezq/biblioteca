/**
 * @author Guisela Alarcon / Luis Ram’rez Q.
 */

package lrq.model;

public class Estudiante {

	private String rut;
	private String nombres;
	private String apellidos;

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String toString(){
		return "RUT : " + this.getRut() + " Nombre : " + this.getNombres() + " " +this.getApellidos();
	}
}

/**
 * @author Guisela Alarcon / Luis Ram’rez 
 */
package lrq.model;

import java.util.Date;

public class Prestamo {
	private int id;
	private Libro libro;
	private Estudiante estudiante;
	private Date fecha;
	

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

}

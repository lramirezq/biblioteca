/**
 * 
 * @author Guisela Alarcon / Luis Ramírez Q.
 */
 
package lrq.model;

/*
 * 
 * EJERCICIO PRUEBA 2: BIBLIOTECA
 -------------------------------------

 SE NECESITA CREAR UN PROGRAMA QUE PERMITA
 LLEVAR EL CONTROL DE LOS LIBROS DE UNA BIBLIOTECA
 SOLO USANDO VECTORES. SE NECESITA TENER GUARDADOS
 LOS DATOS DE LOS LIBROS, LOS ESTUDIANTES Y LOS 
 PRESTAMOS.

 VECTOR LIBROS: 
 - CÓDIGO LIBRO
 - NOMBRE LIBRO
 - AUTOR
 - EDITORIAL
 - CANTIDAD DE COPIAS

 VECTOR ESTUDIANTES:
 - RUT ESTUDIANTE
 - NOMBRE COMPLETO

 VECTOR PRESTAMOS:
 - CÓDIGO LIBRO
 - RUT ESTUDIANTE

 CUANDO SE SOLICITE UN LIBRO SE DEBE DESCONTAR DE LA
 CANTIDAD DE COPIAS, Y SI LA CANTIDAD ES CERO (0) NO
 SE PUEDE PRESTAR ESE LIBRO.

 EL PROGRAMA DEBE TENER UN MENÚ QUE PERMITA:
 - INGRESAR LIBRO
 - MODIFICAR LIBRO
 - INGRESAR ESTUDIANTE
 - MODIFICAR ESTUDIANTE
 - GENERAR PRÉSTAMO
 - DEVOLUCIÓN DE LIBRO
 - MOSTRAR LIBRO SEGÚN ESTUDIANTE
 */
public class Libro {

	private int codigo;
	private String nombre;
	private String autor;
	private String editorial;
	private int cantidad;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
	public String toString(){
		return "Codigo : " + this.getCodigo() + " Nombre : " + this.getNombre()+ " Autor :" + this.getAutor() + " Editorial : "+ this.getEditorial() + " Cantidad : " + this.getCantidad(); 
	}
	
}

/**
 * @author Guisela Alarcon / Luis Ram’rez Q.
 * 
 */
package lrq.exec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import lrq.model.Devolucion;
import lrq.model.Estudiante;
import lrq.model.Libro;
import lrq.model.Prestamo;

public class Prueba02 {
	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

	List<Libro> libros = new ArrayList<Libro>();
	List<Estudiante> estudiantes = new ArrayList<Estudiante>();
	List<Prestamo> prestamos = new ArrayList<Prestamo>();
	List<Devolucion> devoluciones = new ArrayList<Devolucion>();

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		Prueba02 myObject = new Prueba02();
		// Menu
		Libro l = null;
		Estudiante e = null;
		Prestamo p = null;
		Devolucion d = null;

		int op = 0;

		while (op != 11) {
			
			op = myObject.menu();

			switch (op) {
			case 1:
				l = myObject.ingresoLibro();
				if (l != null) {
					myObject.libros.add(l);
				}
				break;
			case 2:
				myObject.modificarLibro();
				break;
			case 3:
				e = myObject.ingresoEstudiante();
				if (e != null) {
					myObject.estudiantes.add(e);
				}
				break;
			case 4:
				myObject.modificarEstudiante();
				break;
			case 5:
				p = myObject.newPrestamo();
				if (p != null) {
					myObject.prestamos.add(p);
				}
				break;
			case 6:
				d = myObject.devoluvionLibro();
				if (d != null) {
					myObject.devoluciones.add(d);
				}
				break;
			case 7:
				myObject.listadoLibros();
				break;
			case 8:
				myObject.listadoEstudiantes();
				break;
			case 9:
				myObject.listadoPrestamoEstudiantes();
				break;
			case 10:
				myObject.listadoSolicitudEstudiantes();
				break;
			case 11:
				System.out.println("Hasta Pronto.....");
				break;
			default:
				System.out.println("Opci—n no v‡lida");

			}
		}

	}

	/**
	 * Ingreso de un nuevo libro
	 * 
	 * @return
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	private Libro ingresoLibro() throws NumberFormatException, IOException {
		Libro libro = new Libro();
		System.out.println("********* Ingreso de Libros ******");
		int a = 0;
		while (a == 0) {
			try {
				System.out.println("Ingrese Codigo Libro: ");
				libro.setCodigo(Integer.parseInt(read.readLine()));
				a = 1;
			} catch (Exception e) {
				System.out.println("Codigo no valido ");
			}
		}

		for (Libro l : this.libros) {
			if (l.getCodigo() == libro.getCodigo()) {
				System.out.println("El Libro ya ha sido ingresado...");
				return null;
			}
		}

		System.out.print("Ingrese Nombre : ");
		libro.setNombre(read.readLine());
		System.out.print("Ingrese Autor : ");
		libro.setAutor(read.readLine());
		System.out.print("Ingrese Editorial : ");
		libro.setEditorial(read.readLine());
		a = 0;
		while (a == 0) {
			try {
				System.out.print("Ingrese Cantidad : ");
				libro.setCantidad(Integer.parseInt(read.readLine()));
				a = 1;
			} catch (Exception e) {
				System.out.println("Ingrese una cantidad Entera");
			}
		}
		
		System.out.println("Libro Ingresado......" + libro.toString());
		System.out.println("******************************************");
		return libro;
	}

	private void modificarLibro() throws IOException {
		System.out.println("********* Modificaci—n de Libros ******");
		int a = 0, codLibro = 0;

		while (a == 0) {
			try {
				System.out.println("Ingrese Codigo Libro: ");
				codLibro = Integer.parseInt(read.readLine());
				a = 1;
			} catch (Exception e) {
				System.out.println("Codigo no valido ");
			}
		}
		a = 0;
		// Buscar Libro
		for (Libro libro : this.libros) {
			if (libro.getCodigo() == codLibro) { // Modificamos
				System.out.println(libro.toString());
				System.out.println("Nombre : ");
				libro.setNombre(read.readLine());
				System.out.println("Autor: ");
				libro.setAutor(read.readLine());
				System.out.println("Editorial :");
				libro.setEditorial(read.readLine());

				while (a == 0) {
					try {
						System.out.println("Cantidad :");
						libro.setCantidad(Integer.parseInt(read.readLine()));
						a = 1;
					} catch (Exception e) {
						System.out.println("Ingrese una cantidad Entera");
					}
				}

			}
		}

		if (a == 0) {
			System.out.println("Libro no encontrado.....");
		}
		System.out.println("**********************************************");

	}

	/**
	 * Ingreso de Estudiante
	 * 
	 * @return
	 * @throws IOException
	 */
	private Estudiante ingresoEstudiante() throws IOException {
		
		Estudiante estudiante = new Estudiante();
		System.out.println("********* Ingreso de Estudiante ******");
		System.out.print("Ingrese RUT : ");
		estudiante.setRut(read.readLine());
		
		for(Estudiante es : this.estudiantes){
			if(es.getRut().equalsIgnoreCase(estudiante.getRut())){
				System.out.println("El Estudiante ya Existe....");
				return null;
			}
		}
		
		
		System.out.print("Ingrese Nombres : ");
		estudiante.setNombres(read.readLine());
		System.out.print("Ingrese Apellidos : ");
		estudiante.setApellidos(read.readLine());
		System.out.println("Estudiante Ingresado......" + estudiante.toString());
		System.out.println("******************************************");
		return estudiante;
	}

	private void modificarEstudiante() throws IOException {
		System.out.println("********* Modificaci—n de Estudiante ******");
		System.out.println("Ingrese RUT Estudiante : ");
		String codEstudiante = (read.readLine());
        int a = 0;
		for(Estudiante es : this.estudiantes){
			if(es.getRut().equalsIgnoreCase(codEstudiante)){
				System.out.println(es.toString());
				System.out.print("Ingrese Nombres : ");
				es.setNombres(read.readLine());
				System.out.print("Ingrese Apellidos : ");
				es.setApellidos(read.readLine());
				a =1;
			}
		}
		
		if(a==0){
			System.out.println("El Estudiante no existe...");
		}
		System.out.println("**********************************************");
	}

	/**
	 * Nuevo Prestamo de libro
	 * 
	 * @return
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	private Prestamo newPrestamo() throws NumberFormatException, IOException {
		System.out.println("********* Prestamo de Libro ******");
		// Vamos a pedir un libro
		Prestamo prestamo = new Prestamo();
		int codLibro = 0;
		String codEstudiante = "";
		int a = 0;
		while (a == 0) {
			try {
				System.out.println("Ingrese Codigo Libro: ");
				codLibro = Integer.parseInt(read.readLine());
				a = 1;
			} catch (Exception e) {
				System.out.println("Codigo no valido ");
			}
		}

		for (Libro libro : this.libros) {
			if (libro.getCodigo() == codLibro) {
				System.out.println("Nombre del Libro  : " + libro.getNombre());
				if (libro.getCantidad() > 0) {
					prestamo.setLibro(libro);
				} else {
					System.out.println("No existe stock del libro....");
					return null;
				}
			}
		}

		if (prestamo.getLibro() == null) {
			System.out.println("Libro no encontrado....");
			return null;
		}

		System.out.println("Ingrese RUT Estudiante : ");
		codEstudiante = read.readLine();

		for (Estudiante estudiante : this.estudiantes) {
			if (estudiante.getRut().equalsIgnoreCase(codEstudiante)) {
				System.out.println("Nombre del Estudiante  : "
						+ estudiante.getNombres() + " "
						+ estudiante.getApellidos());
				prestamo.setEstudiante(estudiante);
			}
		}

		if (prestamo.getEstudiante() == null) {
			System.out.println("Estudiante no encontrado....");
			return null;
		}

		prestamo.setFecha(new java.util.Date());
		// Descontar Stock
		prestamo.getLibro().setCantidad(prestamo.getLibro().getCantidad() - 1);
		System.out.println("Prestamo realizado exitosamente ");
		System.out.println("**********************************************");
		return prestamo;
	}

	/**
	 * Devoluci—n de un libro
	 * 
	 * @return
	 */
	private Devolucion devoluvionLibro() {
		System.out.println("********* Devoluci—n de Libro ******");
		// Vamos a devolver un libro
		Devolucion devolucion = new Devolucion();
		Prestamo p = null;
		int codLibro = 0;
		int a = 0;
		while (a == 0) {
			try {
				System.out.println("Ingrese Codigo Libro: ");
				codLibro = Integer.parseInt(read.readLine());
				a = 1;
			} catch (Exception e) {
				System.out.println("Codigo no valido ");
			}
		}

		// Buscar el libro en prestamos
		a = 0;

		for (Prestamo prestamo : this.prestamos) {
			if (prestamo.getLibro().getCodigo() == codLibro) { // Si existe
				System.out.println("*************************************");
				System.out.println(prestamo.getLibro().toString()); // Muestro
																	// Libro
				System.out.println(prestamo.getEstudiante().toString()); // Muestro
																			// Estudiante
																			// Asociado
				devolucion.setLibro(prestamo.getLibro());
				devolucion.setEstudiante(prestamo.getEstudiante());
				devolucion.setFecha(new java.util.Date());
				prestamo.getLibro().setCantidad(
						prestamo.getLibro().getCantidad() + 1);
				p = prestamo;
				a = 1;
			}

		}

		if (a == 0) {
			System.out.println("El libro no se encuentra prestado !!");
			return null;
		} else {
			
			this.prestamos.remove(p);
			System.out.println("Devoluci—n exitosa...");
			System.out.println("**********************************************");
			return devolucion;
		}
	}

	/**
	 * Listar los prestamos de un Estudiante
	 * 
	 * @throws IOException
	 */
	private void listadoPrestamoEstudiantes() throws IOException {
		System.out.println("********* Listado de Prestamos por Estudiante ******");
		String codEstudiante;
		int a = 0;
		System.out.println("Ingrese RUT Estudiante : ");
		codEstudiante = read.readLine();

		for (Prestamo prestamo : this.prestamos) {
			if (prestamo.getEstudiante().getRut()
					.equalsIgnoreCase(codEstudiante)) {
				System.out
						.println("********************************************");
				System.out.println(prestamo.getEstudiante().toString());
				System.out.println(prestamo.getLibro().toString());
				System.out.println("Fecha Solicitud : " + prestamo.getFecha());
				a = 1;
			}
		}

		if (a == 0) {
			System.out.println("El estudiante no tiene libros en prestamo...");
		}
		
		System.out.println("**********************************************");
	}

	/**
	 * Listar todos los Libros
	 */
	private void listadoLibros() {
		System.out.println("********* Listado de Libros ******");
		for (Libro li : this.libros) {
			System.out.println("*****************************");
			System.out.println(li.toString());
		}
		System.out.println("**********************************************");
	}

	/**
	 * Listar todos los Estudiantes
	 */
	private void listadoEstudiantes() {
		System.out.println("********* Listado de Estudiantes ******");

		for (Estudiante es : this.estudiantes) {
			System.out.println("*****************************");
			System.out.println(es.toString());
		}
		System.out.println("**********************************************");

	}

	/**
	 * Listar Solicitudes por Estudiante
	 * 
	 * @throws IOException
	 */
	private void listadoSolicitudEstudiantes() throws IOException {
		System.out.println("********* Listado de devoluciones por Estudiante ******");
		String codEstudiante;
		int a = 0;
		System.out.println("Ingrese RUT Estudiante : ");
		codEstudiante = read.readLine();

		for (Devolucion devolucion : this.devoluciones) {
			if (devolucion.getEstudiante().getRut()
					.equalsIgnoreCase(codEstudiante)) {
				System.out
						.println("********************************************");
				System.out.println(devolucion.getEstudiante().toString());
				System.out.println(devolucion.getLibro().toString());
				System.out.println("Fecha Devolucion : "
						+ devolucion.getFecha());
				a = 1;
			}
		}

		if (a == 0) {
			System.out.println("El estudiante no tiene libros devueltos...");
		}
		System.out.println("**********************************************");
	}

	/**
	 * Pintar Menœ Principal
	 * 
	 * @return
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	private int menu() throws NumberFormatException, IOException {
		int opt = 0;
		System.out.println("*********** MENU PRINCIPAL ************");
		Map<Integer, String> menu = new TreeMap<Integer, String>();
		menu.put(1, "Ingresar Libros");
		menu.put(2, "Modificar Libros");
		menu.put(3, "Ingresar Estudiantes");
		menu.put(4, "Modificar Estudiantes");
		menu.put(5, "Prestamo Libros");
		menu.put(6, "Devoluci—n de Libro");
		menu.put(7, "Listado de Libro");
		menu.put(8, "Listado de Estudiantes");
		menu.put(9, "Listado de Prestamos por Estudiante");
		menu.put(10, "Listado de Devoluciones por Estudiante");
		menu.put(11, "Salir");

		for (Map.Entry<Integer, String> entry : menu.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

		try {
			opt = Integer.parseInt(read.readLine());
			if (null == menu.get(opt)) {
				System.out.println("Opcion no v‡lida");
				this.menu();
			}
		} catch (Exception e) {
			System.out.println("Opcion no v‡lida");
			this.menu();
		}
		return opt;
	}

}

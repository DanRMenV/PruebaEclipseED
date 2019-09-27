import java.util.*;
public class Prototipo1 {

	public static void main(String[] args) {
		DoubleLinkedList<Estudiante> lista_estudiantes = new DoubleLinkedList<Estudiante>();

		Estudiante e1 = new Estudiante(1000274637,"Juan","Rodriguez",new GregorianCalendar(2001,07,26));
		lista_estudiantes.PushBack(e1);
		lista_estudiantes.PushBack(e1);
		lista_estudiantes.PushBack(e1);
		lista_estudiantes.PushBack(e1);
		lista_estudiantes.PushBack(e1);
		lista_estudiantes.PushBack(e1);
		//Hola
		lista_estudiantes.PushFront(new Estudiante(69,"Pepe","Pepin",new GregorianCalendar(2000,01,01)));
		lista_estudiantes.DisplayList();
	}


}

package MisApp;

import Api.PilaTDA;
import MisImplementaciones.Estaticas.ColaConPrioridad;
import MisImplementaciones.Estaticas.Pila;

public class App2 {

	public static void main(String[] args) {
		//ej1();
		ejColaPrioridad();
	}	
		public static void ej1() {
			PilaTDA A = new Pila();
			A.InicializarPila();
			A.Apilar(1);
			A.Apilar(2);
			A.Apilar(3);
			while (!A.PilaVacia()) {
				System.out.println(A.Tope());
				A.Desapilar();
			}
		}
		
		public static void ejColaPrioridad() {
			ColaConPrioridad A = new ColaConPrioridad();
			A.InicializarCola();
			A.AcolarPrioridad(1, 3);
			A.AcolarPrioridad(2, 8);
			A.AcolarPrioridad(3, 1);
			while (!A.ColaVacia()) {
				System.out.println(A.Primero());
				A.Desacolar();
			}
		}
	}


package Herramientas;

import Api.PilaTDA;
import MisImplementaciones.Estaticas.Pila;

public class Tp1 {
	//PILAS
	
	public void pasarPilaPila (PilaTDA origen, PilaTDA destino) {
		while(!origen.PilaVacia()) {
			destino.Apilar(origen.Tope());
			origen.Desapilar();
		}
	}
	
	public void copiarPilaPila (PilaTDA origen, PilaTDA destino) {
		PilaTDA aux = new Pila();
		pasarPilaPila(origen,aux);
		pasarPilaPila(origen,destino);
	}
	
	public void invertirContenidoPila (PilaTDA origen, PilaTDA destino) {
		pasarPilaPila(origen,destino);
	}
	
	public int contarElementosPila(PilaTDA pila){
		int contador = 0;
		while (!pila.PilaVacia()){
			contador = contador ++;
			pila.Desapilar();
		}
		return contador ;
	}
	
	public int sumarElementosPila( PilaTDA pila){
		int suma = 0;
		while (!pila.PilaVacia()){
			suma = suma + pila.Tope ();
			pila.Desapilar();
		}
		return suma ;
	}
	
	public float promedioElementosPila( PilaTDA pila){
		return (float) (sumarElementosPila(pila)/contarElementosPila(pila)) ;
	}
	
	/*
	 * //COLA
	 * 
	 * public void pasarColaCola (ColaTDA origen, ColaTDA destino) {
	 * while(!origen.ColaVacia()) { destino.Acolar(origen.Primero());
	 * origen.Desacolar(); } }
	 * 
	 * public void invertirCola (ColaTDA origen, ColaTDA destino) { ColaTDA aux =
	 * new ColaTDA(); pasarColaCola(origen,aux); pasarColaCola(origen,destino); }
	 * 
	 * public void invertirContenidoCola (ColaTDA origen, ColaTDA destino) {
	 * pasarColaCola(origen,destino); }
	 * 
	 * public int contarElementosCola(ColaTDA Cola){ int contador = 0; while
	 * (!Cola.ColaVacia()){ contador = contador ++; Cola.Desacolar(); } return
	 * contador ; }
	 * 
	 * public int sumarElementosCola( ColaTDA Cola){ int suma = 0; while
	 * (!Cola.ColaVacia()){ suma = suma + Cola.Primero(); Cola.Desacolar(); } return
	 * suma ; }
	 * 
	 * public float promedioElementosCola( ColaTDA Cola){ return (float)
	 * (sumarElementosCola(Cola)/contarElementosCola(Cola)) ; }
	 */
	
}

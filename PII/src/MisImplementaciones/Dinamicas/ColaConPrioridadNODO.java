package MisImplementaciones.Dinamicas;

import Api.ColaConPrioridadTDA;

public class ColaConPrioridadNODO implements ColaConPrioridadTDA {
	class Nodo {
		int prioridad;
		int dato;
		Nodo siguiente;
	}
	Nodo inicio;
	int tamaño;
	
	@Override
	public void InicializarCola() {
		inicio = null;
	}

	@Override
	public void AcolarPrioridad(int datoNuevo, int prioridadNueva) {
		if (!ColaVacia()) {
			for (int i = tamaño; i>=0; i--) {
					moverVectorDesde(i);
					insertarNodoNuevo(datoNuevo, prioridadNueva, i);
				}
			} else {
				insertarNodoNuevo(datoNuevo, prioridadNueva, tamaño);
			}
		tamaño++;
	}

	private void insertarNodoNuevo(int datoNuevo, int prioridadNueva, int i) {
		vectorCola[i] = new Nodo();
		vectorCola[i].prioridadOriginal = prioridadNueva;
		vectorCola[i].dato = datoNuevo;
	}

	private void moverVectorDesde(int posicion) {
		for (int i = posicion; i>=0; i--) {
			vectorCola[i+1] = vectorCola[i];
		}
	}

	@Override
	public void Desacolar() {
		tamaño--;
	}

	@Override
	public int Primero() {
		return inicio.dato;
	}

	@Override
	public boolean ColaVacia() {
		return tamaño == 0;
	}

	@Override
	public int Prioridad() {
		return inicio.prioridad;
	}

}

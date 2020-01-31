package MisImplementaciones.Estaticas;

import Api.ColaConPrioridadTDA;

public class ColaConPrioridad implements ColaConPrioridadTDA {
	class Elemento {
		int prioridadOriginal;
		int dato;
	}
	Elemento [] vectorCola;
	int tamaño;
	
	@Override
	public void InicializarCola() {
		vectorCola = new Elemento[100];
		tamaño = 0;
	}

	@Override
	public void AcolarPrioridad(int datoNuevo, int prioridadNueva) {
		if (!ColaVacia()) {
			for (int i = tamaño; i>=0; i--) {
					moverVectorDesde(i);
					insertarElementoNuevo(datoNuevo, prioridadNueva, i);
				}
			} else {
				insertarElementoNuevo(datoNuevo, prioridadNueva, tamaño);
			}
		tamaño++;
	}

	private void insertarElementoNuevo(int datoNuevo, int prioridadNueva, int i) {
		vectorCola[i] = new Elemento();
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
		return vectorCola[tamaño-1].dato;
	}

	@Override
	public boolean ColaVacia() {
		return tamaño == 0;
	}

	@Override
	public int Prioridad() {
		return vectorCola[tamaño].prioridadOriginal;
	}

}

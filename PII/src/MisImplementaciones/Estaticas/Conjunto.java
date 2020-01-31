package MisImplementaciones.Estaticas;

import Api.ConjuntoTDA;

public class Conjunto implements ConjuntoTDA {
	int[] vector;
	int tam;//Tamaño
	
	@Override
	public void InicializarConjunto() {
		vector = new int[100];
		tam = 0;
	}

	@Override
	public boolean ConjuntoVacio() {
		return tam == 0;
	}

	@Override
	public void Agregar(int x) {
		if (!Pertenece(x)) {
			vector[tam] = x;
			tam++;
		}
	}

	@Override
	public int Elegir() {
		return vector[tam];
	}

	@Override
	public void Sacar(int x) {
		while(!ConjuntoVacio()) {
			if (vector[tam] == x) {
				tam--;
			}
		}
	}

	@Override
	public boolean Pertenece(int x) {	
		for (int i=0; i<vector.length;i++) {
			if (vector[i] == x) {
				return true;
			}
		}
		return false;
	}

}

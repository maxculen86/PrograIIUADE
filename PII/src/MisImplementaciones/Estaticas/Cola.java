package MisImplementaciones.Estaticas;

import Api.ColaTDA;

public class Cola implements ColaTDA {
	int[] vector;
	int tam;//Tamaño
	
	public void Desacolar() {
		for(int i=0; i<tam-1;i++) {
			vector[i]=vector[i+1];
		}
	}

	@Override
	public void InicializarCola() {
		vector = new int[100];
		tam = 0;
	}

	@Override
	public void Acolar(int x) {
		vector [tam] = x;
		tam++;	
	}

	@Override
	public int Primero() {
		return vector[0];
	}

	@Override
	public boolean ColaVacia() {
		return vector.length == 0;
	}
}

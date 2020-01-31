package MisImplementaciones.Estaticas;

import Api.PilaTDA;

public class Pila implements PilaTDA {
	int[] vector;
	int tam;//Tamaño
	public void InicializarPila() {
		vector = new int[100];
		tam =0;
	}
	
	public void Apilar (int x) {
		vector [tam] = x;
		tam++;
	}
	
	public void Desapilar() {
		tam--;
	}
	
	public int Tope() {
		return vector[tam - 1];
	}
	
	public boolean PilaVacia () {
		return tam == 0;
	}
}

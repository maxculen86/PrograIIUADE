package Api;

public interface ConjuntoTDA {
	void InicializarConjunto ();// inicializado
	boolean ConjuntoVacio();//inicializado
	void Agregar( int x);//inicializado y no vacıo
	int Elegir();//inicializado
	void Sacar( int x);// inicializado
	boolean Pertenece( int x);
}

package Api;

public interface ColaConPrioridadTDA {
	void InicializarCola();// inicializada
	void AcolarPrioridad( int dato, int prioridad);// inicializada y no vacia
	void Desacolar();// inicializada y no vacia
	int Primero();// inicializada
	boolean ColaVacia();// inicializada y no vacia
	int Prioridad();
}

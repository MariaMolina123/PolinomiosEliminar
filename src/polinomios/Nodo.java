package polinomios;

public class Nodo {

    double coeficiente;
    int exponente;
    Nodo siguiente;
    Nodo anterior;

    public Nodo() {
        coeficiente = 0;
        exponente = 0;
        siguiente = null;
        anterior = null;
    }

    public Nodo(double coeficiente,
            int exponente) {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
        siguiente = null;
        anterior = null;
    }

    public void actualizar(double coeficiente,
            int exponente) {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
    }
}

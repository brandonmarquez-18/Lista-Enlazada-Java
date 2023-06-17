package listaenlazada;
public class ClsNodo<tope> {
    tope valor;
    ClsNodo<tope> siguiente;
    public ClsNodo(tope valor) {
		this.valor = valor;
	}
}
//ClsLE.java


package listaenlazada;
public class ClsLE<tope> {
    ClsNodo<tope> cabecera = null;
	int tamano;
	public ClsLE(){
		tamano=0;
	}
    public void agregarInicio(tope value) {
        ClsNodo<tope> temporal = new ClsNodo<tope>(value);
        temporal.siguiente = cabecera;
        cabecera = temporal;
        tamano++;
    }
    public void agregarFinal(tope value) {
        ClsNodo<tope> temporal = new ClsNodo<tope>(value);
        if (cabecera == null)
            cabecera = temporal;
        else {
            ClsNodo<tope> siguiente = cabecera;
            while(siguiente.siguiente != null)
                siguiente = siguiente.siguiente;
            siguiente.siguiente = temporal;
        }
		tamano++;
    }
    public void EliminarInicio() {
        cabecera = cabecera.siguiente;
        tamano--;
    }
    public int vacio(){
        tamano=0;
        System.out.println(tamano);
        return tamano;
    }
    public void vaciar(){
        ClsNodo<tope> siguiente = cabecera;
        siguiente.valor = null;
    }
    public boolean lleno(){
        return tamano==10;
    }
    public void eliminarValor(tope value){
        ClsNodo<tope> temporal = cabecera;
        ClsLE<tope> res = new ClsLE<tope>();
        while(temporal != null){
            if(temporal.valor == value){
                temporal = temporal.siguiente;
                continue;
            }
            res.agregarFinal(temporal.valor);
            temporal = temporal.siguiente;
        }
        cabecera = res.cabecera;
        res.tamano--;
    }   
    public void agregarDespuesDe(tope value, tope searchValue){
        ClsNodo<tope> temporal = cabecera;
        ClsLE<tope> res = new ClsLE<tope>();
        while(temporal != null){
            if(temporal.valor == searchValue){
                res.agregarFinal(temporal.valor);
                res.agregarFinal(value);
                temporal = temporal.siguiente;
                continue;
            }
            res.agregarFinal(temporal.valor);
            temporal = temporal.siguiente;
        }
        cabecera = res.cabecera;
        res.tamano--;
    }
    public void mostrarResultado(){
		ClsNodo<tope> siguiente = cabecera;
		while(siguiente != null) {
                        System.out.print(siguiente.valor+", ");
			siguiente = siguiente.siguiente;
		}
                System.out.print("\n");
	}
}
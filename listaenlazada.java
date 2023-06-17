//ListaEnlazada.java


package listaenlazada;
import javax.swing.JOptionPane;
public class ListaEnlazada{
    public static void main(String[] args) {
        ClsLE<Integer> miLista = new ClsLE<>();
        int RepetirMenu = 0;
        while(RepetirMenu <= 0 || RepetirMenu > 6){
             int opcPrincipal = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción:\n"
            + "1.- AGREGAR AL INICIO.\n"
            + "2.- AGREGAR AL FINAL.\n"
            + "3.- AGREGAR DESPUÉS DE UN VALOR EN ESPECÍFICO.\n"
            + "4.- ELIMINAR UN VALOR EN ESPECÍFICO.\n"
            + "5.- ELIMINAR EL PRIMER VALOR.\n"
            + "6.- VACIAR LISTA.\n"
            + "7.- SALIR."));
            switch(opcPrincipal){
                case 1:
                    if(miLista.lleno()){
                        JOptionPane.showMessageDialog(null,"EL LÍMITE DE ELEMENTOS DE LA LISTA ES DE 10, NO PUEDE INGRESAR MÁS!!!");
                    }else{
                        miLista.agregarInicio(Integer.parseInt(JOptionPane.showInputDialog("DIGITA EL ELEMENTO:")));
                        miLista.mostrarResultado();
                    }
                    break;
                case 2:
                    if(miLista.lleno()){
                        JOptionPane.showMessageDialog(null,"EL LÍMITE DE ELEMENTOS DE LA LISTA ES DE 10, NO PUEDE INGRESAR MÁS!!!");
                    }else{
                        miLista.agregarFinal(Integer.parseInt(JOptionPane.showInputDialog("DIGITA EL ELEMENTO:")));
                        miLista.mostrarResultado();
                    }
                    break;
                case 3:
                    if(miLista.lleno()){
                        JOptionPane.showMessageDialog(null,"EL LÍMITE DE ELEMENTOS DE LA LISTA ES DE 10, NO PUEDE INGRESAR MÁS!!!");
                    }else{
                        miLista.agregarDespuesDe(Integer.parseInt(JOptionPane.showInputDialog("DIGITA EL NÚMERO A IGRESAR:")), Integer.parseInt(JOptionPane.showInputDialog("AHORA DIGITA DESPÉS DE QUIEN LO QUIERES METER:")));
                        miLista.mostrarResultado();
                    }
                    break;
                case 4:
                    miLista.eliminarValor(Integer.parseInt(JOptionPane.showInputDialog("DIGITA EL ELEMENTO A ELIMINAR:")));
                    miLista.mostrarResultado();
                    break;
                case 5:
                    miLista.EliminarInicio();
                    miLista.mostrarResultado();
                    break;
                case 6:
                    miLista.vaciar();
                    miLista.mostrarResultado();
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null,"HASTA LA PRÓXIMA.......");
                    RepetirMenu = 1;
                    break;
                }
            }
    }
}

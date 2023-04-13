package ManejoBiblioteca;
import salida.JOPIS;
import jopi.JOPI;
import salida.Menu;
public class Administra {
    String opciones[] = {"Insertar","Consultar","Modificar","Elimina Ultimo","Eliminar","Regresar"};
public void crudLibros(VectorLibros obLibros){
int opcion =0;
    do {
        opcion = Menu.menuBotones(opciones, "Menu Libros");
        
        switch(opcion){
            case 0 : obLibros.alta();break;
            case 1 : obLibros.muestra();break;
            case 2 : int pos=JOPI.entero("Que posicion desea modificar?");
                        obLibros.modifica(pos);break;
            case 3 : obLibros.elimina();break;
            case 4 : int p=JOPI.entero("Que posicion desea modificar?");break;
            }
        }
     while (opcion!=5);
    }

    public void crudRevistas(VectorRevistas obRevistas){
    int opcion=0;
    
        do{
        opcion = Menu.menuBotones(opciones, "Mnu Revistas");
        
        switch(opcion){
            case 0 : obRevistas.alta();break;
            case 1 : obRevistas.muestra();break;
            case 2 : int pos = JOPI.entero("Que posicion desea modificar?");
            obRevistas.modifica(pos);break;
            case 3 : obRevistas.elimina();break;
            case 4 : int p=JOPI.entero("Que posicion desea modificar?");break;
        }
        
        }while(opcion!=5);
    }
    
    public void menuPrincipal(){
    String opPrincipal[] = {"Libros","Revistas","Terminar"};
    int opcion=0;
    VectorLibros vecLibros = new VectorLibros(4);
    VectorRevistas vecRevistas = new VectorRevistas(4);
    
        do {
            opcion = Menu.menuBotones(opPrincipal, "Menu principal");
            
            switch(opcion){
                case 0 : crudLibros(vecLibros);break;
                case 1 : crudRevistas(vecRevistas);break;
                //case 2 : ctrlPeticiones(vecLibros,vecRevistas); break;
            }
        } while (opcion!=2);
    }
    
}

package ManejoBiblioteca;
import jopi.JOPI;
import javax.swing.JOptionPane;
import Jerarquia.*;
public class VectorLibros {
protected Libro libros[];
    protected int i;
    
    public VectorLibros(int numLibros){
    libros = new Libro[numLibros];
    this.i = -1;
    }
    
    public VectorLibros(){}
    
    public Libro[] getLibros(){
    return libros;
    }
    
    private Libro creaLibro(){
    String codID, titulo, autor ;int numPags;
    codID=JOPI.cadena("CodID?");
    titulo = JOPI.cadena("Titulo?");
    autor = JOPI.cadena("autor?");
    numPags = JOPI.entero("Num Pag?");
    return new Libro(titulo, autor, codID, numPags );
    }
    
     public void alta(){
    //verifica que existan celdas vacias para almacenar un objeto
        if (i<this.libros.length-1) 
            libros[++i]= creaLibro();
            else 
        JOptionPane.showMessageDialog(null,"Vector lleno");
    }
    
    public void muestra(){
        for (int j = 0; j <= i; j++) {
            JOptionPane.showMessageDialog(null, this.libros[j].muestra());
        }
    }
    public void elimina(){//elimina el ultimo elemento del vector
    try{
            this.libros[i]=null;
            i--;
            }
        catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "La posicion no existe");
        }
    }
    
    public void elimina(int posicion){
        if (posicion<=i && posicion>=0) {
            while(posicion<i){
            this.libros[posicion]=this.libros[posicion+1];
            posicion++;
            }
            elimina();
        }
        else JOptionPane.showMessageDialog(null, "esa posicion no existe");
    }
    
    public void modifica(int p){
    String r;
        if (p<=i && p>=0) {
            r = JOPI.cadena("ESTO ES LO QUE DESEAS MODIFICAR si o no ?\n\n"+this.libros[p].muestra());
            
            if (r.equalsIgnoreCase("SI")) {
                String codID = JOPI.cadena("Nuevo ID?");
                String titulo = JOPI.cadena("Nuevo titulo?");
                String autor = JOPI.cadena("Nuevo autor?");
                int numPags = JOPI.entero("Num pags?");
                
                
                this.libros[p].setId(codID);
                this.libros[p].setTitulo(titulo);
                this.libros[p].setAutor(autor);
                this.libros[p].setNumPag(numPags);
            }
        }
        else JOptionPane.showConfirmDialog(null, "esa posicion no existe!!");
    }

    public Libro buscar(String cId){
    int k = 0;
    
    while(k<=1){
    if(this.libros[k].getId().equals(cId))
        return this.libros[k];
    k++;
    }
    return null;
    }    
}

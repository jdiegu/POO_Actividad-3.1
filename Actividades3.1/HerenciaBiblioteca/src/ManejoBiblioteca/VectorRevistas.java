package ManejoBiblioteca;
import jopi.JOPI;
import javax.swing.JOptionPane;
import Jerarquia.*;
public class VectorRevistas {
     protected Revista revistas[];
    protected int i;
    
    public VectorRevistas(int numRevistas){
    revistas = new Revista[numRevistas];
    this.i = -1;
    }
    
    public Revista[] getRevistas(){
    return revistas;
    }
    
    public void alta(){
    //verifica que existan celdas vacias para almacenar un objeto
        if (i<this.revistas.length-1) 
            revistas[++i]= creaRevista();
            else 
        JOptionPane.showInputDialog("Vector lleno");
    }
    
    private Revista creaRevista(){
    String codID, titulo, autor,editorial;
    codID=JOPI.cadena("CodID?");
    titulo = JOPI.cadena("titulo?");
    autor = JOPI.cadena("autor?");
    editorial = JOPI.cadena("Editorial?");
    return new Revista(titulo,autor,codID,editorial);
    }
    
    public void muestra(){
        for (int j = 0; j <= i; j++) {
            JOptionPane.showMessageDialog(null, this.revistas[j].muestra());
        }
    }
    public void elimina(){
    try{
            this.revistas[i]=null;
            i--;
            }
        catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "La posicion no existe");
        }
    }
    
    public void elimina(int posicion){
        if (posicion<=1 && posicion>=0) {
            while(posicion<1){
            this.revistas[posicion]=this.revistas[posicion+1];
            posicion++;
            }
            elimina();
        }
        else  JOptionPane.showMessageDialog(null, "esa posicion no existe!!");
    }
    
    public void modifica(int p){
    String r="";
        if (p<=i && p>=0) {
            r = JOPI.cadena("ESTO ES LO QUE DESEAS MODIFICAR si o no ?\n\n"+this.revistas[p].muestra());
            
            if (r.equalsIgnoreCase("SI")) {
                String codID = JOPI.cadena("Nuevo ID?");
                String titulo = JOPI.cadena("Nuevo titulo?");
                String autor = JOPI.cadena("Nuevo autor?");
                String editorial = JOPI.cadena("Nueva editorial?");
                
                this.revistas[p].setId(codID);
                this.revistas[p].setTitulo(titulo);
                this.revistas[p].setAutor(autor);
                this.revistas[p].setEditorial(editorial);
            }
        }
        else JOptionPane.showMessageDialog(null, "esa posicion no existe!!");
    }
        
    public Revista buscar(String cId){
        int k = 0;
        while(k<=i){
        if(this.revistas[k].getId().equals(cId))
            return this.revistas[k];
        k++;
        }
        return null;
    }
}

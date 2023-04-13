package Jerarquia;
public class Libro extends Referencia{
    
    private int numPag;
    
    public Libro(){
    
        super();
        
    }
    
    public Libro(String titulo, String autor, String id, int numPag){
    
        super(titulo,autor,id);
        this.numPag=numPag;
        
    }
    
    @Override
    public String muestra(){
    
        String msg=super.muestra()+"\n";
        msg+="Numero de paginas: "+this.numPag;
        return msg;
        
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }
    
}
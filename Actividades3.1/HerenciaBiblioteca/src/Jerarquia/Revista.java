package Jerarquia;
public class Revista extends Referencia{
    
    private String editorial;
    
    public Revista(){
    
        super();
        
    }
    
    public Revista(String titulo, String autor, String id, String editorial){
    
        super(titulo,autor,id);
        this.editorial=editorial;
        
    }
    
    @Override
    public String muestra(){
    
        String msg=super.muestra()+"\n";
        msg+="Editorial: "+this.editorial;
        return msg;
        
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
}
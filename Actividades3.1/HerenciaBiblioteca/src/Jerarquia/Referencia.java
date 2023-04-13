package Jerarquia;
public class Referencia {

    protected String titulo, autor, id;
    
    public Referencia(){}
    
    public Referencia(String titulo, String autor, String id){
    
        this.titulo=titulo;
        this.autor=autor;
        this.id=id;
        
    }
    
    public String muestra(){
    
        String msg="Nombre: "+this.titulo+"\n";
        msg+="Autor: "+this.autor+"\n";
        msg+="ID: "+this.id;
        return msg;
        
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
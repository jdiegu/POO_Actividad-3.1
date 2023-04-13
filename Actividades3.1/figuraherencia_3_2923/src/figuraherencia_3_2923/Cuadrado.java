package figuraherencia_3_2923;

public class Cuadrado extends Figura {
    //No tiene atributos pues hereda de la clase Figura
    
    /*Si tiene constructores pues para ser instanciado se requiere
    crear su clase base mediante super() */
    
    public Cuadrado(){
        super();
    }
    
    public Cuadrado (float lado){
        super(lado);
    }
    
    //Se implementan metodos propios para perimetro y area
    //A traves de super se invoca al getLado de la clase padra o clase base
        
    public float getPerimetro(){
        return super.getLado()*4;
        //Aunque tambien funciona con this pues ee considerado como atributo propio pues es un atributo heredado
        //return this.getLado()*4;
        //Sin embargo con super queda claro que se heredo
    }
    
    public float getArea(){
        return super.getLado()*super.getLado();
    }
    
}

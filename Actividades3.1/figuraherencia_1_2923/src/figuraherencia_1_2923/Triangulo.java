package figuraherencia_1_2923;

public class Triangulo extends Figura {
    //Se tomara el atributo lado de la clase Figura
    //Solo se define el atributo altura como propio
    private float altura;
    //Si tiene constructores pues para ser instanciado  se requiere crear
    //a su clase base mediante super()
    
    public Triangulo(){
        super();
    }
    
    public Triangulo (float lado, float altura){
        super(lado); //Se construye la clase base y se envia lado hacia ella    
        this.altura = altura; //Se inicializara altura en su propio atributo
    }
    
    //Se implementan set y get para su propio atributo
   
    public void setAltura(float altura){
        this.altura=altura;
    }
    
    public float getAltura(){
        return altura;
    }
    
    //Solo se implementa getArea() pues es comun a los otros tres triangulo a los que heredara
    //Los perimetros seran diferentes a sus clases derivadas (sus hijas)
    public float getArea(){
        return (super.getLado()*this.getAltura())/2;
    }
    
}

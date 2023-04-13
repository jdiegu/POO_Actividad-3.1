package figuraherencia_2_2923;

public class Rectangulo extends Figura{
    //Se tomara el atributo lado de la clase figura 
    //Solo se define el atributo altura como propio
    private float altura;
    
    public Rectangulo(){
        super();
    }
    
    public Rectangulo(float lado, float altura){
        super(lado); //Se construye la clase base y se envia lado hacia ella
        this.altura = altura; //Se inicializa altura que es propio atributo
    }
    
    //Se implementan set y get para su propio atributo
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    public float getAltura(){
        return altura;
    }
    
    //Se implementan metodos propios para perimetro y area
    //A traves de super se invoca al getLado() de la clase padre o clase base
    public float getPerimetro(){
        return super.getLado()*2+this.getAltura()*2; //Con super se recupera lado desde la clase base
    }                                                //Con this se accede a su propio atributo
    //Aunque tambien funciona con this pues se considera como atributo propio pues es un atributo heredado
    //return this.getLado()*2 + this.getAltura()*2;
    //Sin embargo con super queda claro que se heredo
    
    public float getArea(){
        return super.getLado()*this.getAltura();
    }
    
    
    
}

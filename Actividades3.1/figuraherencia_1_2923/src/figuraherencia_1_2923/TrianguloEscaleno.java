package figuraherencia_1_2923;

public class TrianguloEscaleno extends TrianguloIsosceles{
    private float lado2;
    
    public TrianguloEscaleno(){
        super();
    }
    
    public TrianguloEscaleno(float lado, float altura, float lado1, float lado2){
        super(lado, altura, lado1);
        this.lado2= lado2;
    }
    
    public void setLado2(float lado2){
        this.lado2=lado2;
    }
    
    public float getLado2(){
        return lado2;
    }
    //Se implementan metodos propios para area
    //A traves de super se invoca al getLado() de la clase padre o clase base y se toma como base del triangulo escaleno
    //Se invoca a super.getLado1() de la clase padre
    public float getPerimetro(){
    return super.getLado()+super.getLado1()+this.lado2; //Con super se recupera lado directamente desde la linea
                                                        //hereditaria pasando hasta figura
                                                        //Con this se accede a su propio atributo
    //Aunque tambien funciona con this pues es considerado como atributo propio pues es un atributo heredado
    //return this.getLado()+this.getLado1()+this.getLado2();
    }
//getArea ya se encuentra en su clase base
}

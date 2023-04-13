package figuraherencia_3_2923;

final class TrianguloEquilatero extends Rectangulo{
    //Se extiende de TRIANGULO pues solo se necesita base y altura para el triangulo equilatero
    /*Si tiene constructores pues para ser instanciado se requiere crear a su clase base 
    mediante super()*/
    
    public TrianguloEquilatero(){
        super();
    }
    
    public TrianguloEquilatero(float lado, float altura){
    super(lado, altura);
    }
    
    @Override
    public float getPerimetro(){
        return super.getLado()*3;
    }
    
    @Override
    public float getArea(){
        return super.getArea()/2;
    }
}

package figuraherencia_2_2923;

final class TrianguloEscaleno extends Rectangulo{
    private float lado1;
    private float lado2;
    
    public TrianguloEscaleno(){
        super();
    }
    
    public TrianguloEscaleno(float lado, float altura, float lado1, float lado2){
        super(lado, altura);
        this.lado1= lado1;
        this.lado2= lado2;
    }
    
    public void setLado1(float lado1){
        this.lado1=lado1;
    }
    
    public float getLado1(){
        return lado1;
    }
    
    public void setLado2(float lado2){
        this.lado2=lado2;
    }
    
    public float getLado2(){
        return lado2;
    }
    
    @Override
    public float getPerimetro(){
    return super.getLado()+this.getLado1()+this.lado2; 
    }

    @Override
    public float getArea(){
        return super.getArea()/2;
    }
    
}

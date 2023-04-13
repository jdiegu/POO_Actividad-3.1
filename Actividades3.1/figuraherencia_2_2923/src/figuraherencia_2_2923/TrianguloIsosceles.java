package figuraherencia_2_2923;

final class TrianguloIsosceles extends Rectangulo{
    private float lado1;

    public TrianguloIsosceles() {
        super();
    }

    public TrianguloIsosceles(float lado, float altura, float lado1) {
        super(lado, altura);
        this.lado1 = lado1;
    }
    
    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }
    
    @Override
    public float getPerimetro(){
        return super.getLado()+(this.getLado1()*2);
    }

    @Override
    public float getArea(){
        return super.getArea()/2;
    }
}

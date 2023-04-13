package figuraherencia_1_2923;

public class TrianguloIsosceles extends Triangulo{

    //Se extiende de la clase Triangulo pues solo
    //Se requiere al menos un lado como atributo, lado de la clase figura se tomara como base
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
    
    public float getPerimetro(){
        return super.getLado()+(this.getLado1()*2);
    }
//getArea ya se encuentra en su clase base
}

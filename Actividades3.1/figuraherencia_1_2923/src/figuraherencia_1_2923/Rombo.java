package figuraherencia_1_2923;

public class Rombo extends Figura{
    private float dm, dM;
    public Rombo() {
        super();
    }
    
    public Rombo(float lado, float dm, float dM) {
        super(lado);
        this.dm = dm;
        this.dM = dM;
    }

    public float getDm() {
        return dm;
    }

    public void setDm(float dm) {
        this.dm = dm;
    }

    public float getdM() {
        return dM;
    }

    public void setdM(float dM) {
        this.dM = dM;
    }

    public float getPerimetro(){
        return super.getLado()*4;
    }
    
    public float getArea(){
        return (this.dm*this.dM)/2;
    }
    
}

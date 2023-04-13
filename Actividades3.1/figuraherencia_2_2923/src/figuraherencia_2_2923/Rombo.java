package figuraherencia_2_2923;

final class Rombo extends Cuadrado{
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

    @Override
    public float getPerimetro(){
        return super.getLado()*4;
    }
    
    @Override
    public float getArea(){
        return (this.dm*this.dM)/2;
    }
    
}
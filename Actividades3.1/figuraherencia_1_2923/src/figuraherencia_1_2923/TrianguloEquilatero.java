package figuraherencia_1_2923;

public class TrianguloEquilatero extends Triangulo{
    //Se extiende de TRIANGULO pues solo se necesita base y altura para el triangulo equilatero
    /*Si tiene constructores pues para ser instanciado se requiere crear a su clase base 
    mediante super()*/
    
    public TrianguloEquilatero(){
        super();
    }
    
    public TrianguloEquilatero(float lado, float altura){
    super(lado, altura);//Se construye la clase base Rectangulo se envia lado y altura
                        //Lado se reenviara a la clase base Figura a traves de Rectangulo
                        //Y la clase Rectangulo se quedara con altura
    }
    
    //No se implementan set y get pues no tiene atributos propios
    //Se implementan metodos propios para Perimetro
    //A traves de super se invoca el getLado() de la clase padre o clase base y se toma como base del
    //triangulo equilatero
    public float getPerimetro(){
        return super.getLado()*3; //Con super se recupera lado directamente de la linea hereditarea pasando por Triangulo hasta figura
                                  //Con this se accede a su propio atributo
        //Aunque tambien funciona con this pues es considerado como atributo propio pues es un atributo heredado
        //return this.getLado()*3;
        //Sin embargo con super queda claro que se heredo
    }
    //getArea ya se encuentra en su clase base
}

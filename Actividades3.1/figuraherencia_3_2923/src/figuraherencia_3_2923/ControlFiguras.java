package figuraherencia_3_2923;
import java.util.Random;
public class ControlFiguras {
    //Atributos comunes a todos los metodos
    float base, altura;
    int min, max;
    Random r = new Random(); //Se usara para general valores aleatorios para 
                             // las medidas de las figuras
    public ControlFiguras(int min, int max){
        this.min = min;
        this.max = max;
    }
    
    public ControlFiguras(){
    }
    
    public float generaMedida(){
        //Se generan numeros aleatorios que esten formados por enteros y decimales
        //En base a los atributos min y max que fueron inicializados a traves del constructor
        float medida = (float)(min+(max-min)*r.nextDouble());
        return medida;
    }
    
    public Cuadrado creaCuadrado(){
        base=generaMedida();
        return new Cuadrado(base);
    }
    
    public Rectangulo creaRectangulo(){
        base=generaMedida();
        altura=generaMedida();
        return new Rectangulo(base, altura);
    }
    
    public Rombo creaRombo(){
        base=generaMedida();
        float dm=generaMedida();
        float dM=generaMedida();
        return new Rombo(base, dm, dM);
    }
    
    public TrianguloEquilatero creaTrianguloEquilatero(){
        base=generaMedida();
        altura=generaMedida();
        return new TrianguloEquilatero(base, altura);
    }
    
    public TrianguloIsosceles creaTrianguloIsosceles(){
        base=generaMedida();
        altura=generaMedida();
        float lado1=generaMedida();
        return new TrianguloIsosceles(base, altura, lado1);
    }
    
    public TrianguloEscaleno creaTrianguloEscaleno(){
        base=generaMedida();
        altura=generaMedida();
        float lado1=generaMedida();
        float lado2=generaMedida();
        return new TrianguloEscaleno(base, altura, lado1, lado2);
    }
    
    public void pruebaCuadrado(){
        Cuadrado objCuadrado = this.creaCuadrado();
        String msg="Cuadrado: \nLADO: "+objCuadrado.getLado()+"\n";
        msg+="Perimetro cuadrado: "+objCuadrado.getPerimetro()+"\n";
        msg+="Area cuadrado: "+objCuadrado.getArea()+"\n";
        System.out.println(msg);
    }
    
    public void pruebaRectangulo(){
        Rectangulo objRectangulo = this.creaRectangulo();
        String msg="Rectangulo: \nBASE: "+objRectangulo.getLado()+"\n";
        msg+="ALTURA: "+objRectangulo.getAltura()+"\n";
        msg+="Perimetro rectangulo: "+objRectangulo.getPerimetro()+"\n";
        msg+="Area rectangulo: "+objRectangulo.getArea()+"\n";
        System.out.println(msg);
    }
    
    public void pruebaRombo(){
        Rombo objRombo = this.creaRombo();
        String msg="Rombo: \nBASE: "+objRombo.getLado()+"\n";
        msg+="Diagonal menor: "+objRombo.getDm()+"\n";
        msg+="Diagonal mayor: "+objRombo.getdM()+"\n";
        msg+="Perimetro rombo: "+objRombo.getPerimetro()+"\n";
        msg+="Area rombo: "+objRombo.getArea()+"\n";
        System.out.println(msg);
    }
    
    public void pruebaTrianguloEquilatero(){
        TrianguloEquilatero objTrianguloEquilatero = this.creaTrianguloEquilatero();
        String msg="Triangulo Equilatero: \nBASE: "+objTrianguloEquilatero.getLado()+"\n";
        msg+="ALTURA: "+objTrianguloEquilatero.getAltura()+"\n";
        msg+="Perimetro Triangulo Equilatero: "+objTrianguloEquilatero.getPerimetro()+"\n";
        msg+="Area Triangulo Equilatero: "+objTrianguloEquilatero.getArea()+"\n";
        System.out.println(msg);
    }
    
    public void pruebaTrianguloIsosceles(){
        TrianguloIsosceles objTrianguloIsosceles = this.creaTrianguloIsosceles();
        String msg="Triangulo Isosceles: \nBASE: "+objTrianguloIsosceles.getLado()+"\n";
        msg+="LADO: "+objTrianguloIsosceles.getLado1()+"\n";
        msg+="ALTURA: "+objTrianguloIsosceles.getAltura()+"\n";
        msg+="Perimetro Triangulo Escaleno: "+objTrianguloIsosceles.getPerimetro()+"\n";
        msg+="Area Triangulo Escaleno: "+objTrianguloIsosceles.getArea()+"\n";
        System.out.println(msg);
    }
    
    public void pruebaTrianguloEscaleno(){
        TrianguloEscaleno objTrianguloEscaleno = this.creaTrianguloEscaleno();
        String msg="Triangulo Escaleno: \nBASE: "+objTrianguloEscaleno.getLado()+"\n";
        msg+="LADO 1: "+objTrianguloEscaleno.getLado1()+"\n";
        msg+="LADO 2: "+objTrianguloEscaleno.getLado2()+"\n";
        msg+="ALTURA: "+objTrianguloEscaleno.getAltura()+"\n";
        msg+="Perimetro Triangulo Escaleno: "+objTrianguloEscaleno.getPerimetro()+"\n";
        msg+="Area Triangulo Escaleno: "+objTrianguloEscaleno.getArea()+"\n";
        System.out.println(msg);
    }
    
}
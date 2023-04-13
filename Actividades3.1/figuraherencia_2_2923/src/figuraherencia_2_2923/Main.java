package figuraherencia_2_2923;

public class Main {
    public static void main(String[] args){
        ControlFiguras control= new ControlFiguras(15, 50);
        //15 y 50 seran el rango de valores de las medidas de las figuras
        //que se generaran aleatoriamente
        System.out.println("Pruebas");
        control.pruebaCuadrado();
        control.pruebaRectangulo();
        control.pruebaRombo();
        control.pruebaTrianguloEquilatero();
        control.pruebaTrianguloIsosceles();
        control.pruebaTrianguloEscaleno();
    }
}

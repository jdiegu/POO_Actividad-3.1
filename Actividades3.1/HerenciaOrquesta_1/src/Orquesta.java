import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Orquesta {
    public Percusion generaPercusion(String nombre){
        return new Percusion(nombre);
    }
    
    public Viento generaViento(String nombre){
        return new Viento(nombre);
    }
    
    public static void main(String[] a) throws Exception{
        Orquesta objOrquesta = new Orquesta();
        
        Percusion objPercusion1=objOrquesta.generaPercusion("TIMBAL");
        Viento objViento=objOrquesta.generaViento("TROMPETA");
        Percusion objPercusion2=objOrquesta.generaPercusion("PLATILLO");
        
        objPercusion1.queEs(); //Metodo de la clase base
        objPercusion1.tocar(); //Metodo abstracto de la clase base, implementado
        objPercusion1.sonido("./src/timbal.wav");
        
        objViento.queEs(); //Metodo de la clase base
        objViento.tocar(); //Metodo abstracto de la clase base, implementado
        objViento.sonido("./src/trompeta.wav");
        
        objPercusion2.queEs(); //Metodo de la clase base
        objPercusion2.tocar(); //Metodo abstracto de la clase base, implementado
        objPercusion2.sonido("./src/platillo.wav");
    }
    
    
}

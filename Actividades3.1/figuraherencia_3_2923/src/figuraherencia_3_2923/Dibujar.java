package figuraherencia_3_2923;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

class Draw extends JPanel {
    
        @Override
    public void paintComponent(Graphics g)
    {  Rectangle2D.Float cuadrado = new Rectangle2D.Float(40,20,50,50);
   ///*    CUADRADO
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.YELLOW);
        g2d.fill(cuadrado);
        g2d.setColor(Color.BLACK);
        g2d.draw(cuadrado); 
        
         ///*    TRIANGULO
        int x[] = {200,0,250,200};
        int y[] = {0, 250,250,0};
        g2d.fillPolygon(x,y,3);
        g2d.setColor(Color.RED);
        g2d.drawPolygon(x,y,3);
        
        Rectangle2D.Float rectangulo = new Rectangle2D.Float(300,100,400,50);
   ///*    RECTANGULO
        
        g2d.setColor(Color.BLUE);
        g2d.fill(rectangulo);
        g2d.setColor(Color.BLACK);
        g2d.draw(rectangulo);
    }
    
}

 class Dibujar extends JFrame {    
    private final Draw draw;
    private final int sizeX = 800;
    private final int sizeY = 600 ;
    
    public Dibujar() {
        this.setSize(sizeX,sizeY);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //quitar margen de ventana
        //this.setUndecorated(true);        
        draw = new Draw();
        draw.setBounds(0,0,sizeX,sizeY);
        this.add(draw);        
    }
    
    public  void pinta() {
        Dibujar dibujo= new Dibujar();
        dibujo.setVisible(true);
    }
}
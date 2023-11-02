package ventana;
import javax.swing.JFrame;

public class Ventana extends JFrame {
    public Ventana(){//Este es el constructor de la clase ventana
        this.setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Para que cuando cierre la ventana se cierre todo
        setTitle("MENU"); //Titulo de la ventana
    }

}

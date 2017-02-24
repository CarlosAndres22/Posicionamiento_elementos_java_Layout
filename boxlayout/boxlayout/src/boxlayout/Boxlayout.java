/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxlayout;

/**
 *
 * @author C.andres
 */
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JLabel;

 
public class Boxlayout {

 
    public static void main(String[] args) {

        // crea el FRAME y lo configura 

  

        JFrame frame = new JFrame("EJEMPLO DE ALINEAMIENTO CON BOXLAYOUT"); //nombre ventana

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // como cerrar la ventana

         

        // Crea nuevos botones con diferente ancho 

        JButton jb1 = new JButton("Boton 1 -");       

        JButton jb2 = new JButton("Boton 2 --------");

        JButton jb3 = new JButton("Boton 3 -");       

        JButton jb4 = new JButton("Boton 4 --------");

        JButton jb5 = new JButton("Boton 5 -");       

        JButton jb6 = new JButton("Button 6 --------");

        JLabel titulo = new JLabel ("titulo"); 
        
        JLabel lab_Login = new JLabel("ALINEACION ");
    lab_Login.setFont(new java.awt.Font("comic sans ms", 1, 50));  //nombre, estilo y tamano
    lab_Login.setForeground(Color.DARK_GRAY);

        JLabel hecho = new JLabel ("Realizado por Carlos Andres Martinez Poveda");
    hecho.setFont(new java.awt.Font("arial", 1, 14));
    hecho.setForeground(Color.red);
    
          JLabel texto = new JLabel("VERTICAL");
    texto.setFont(new java.awt.Font("comic sans ms", 1, 50));  //nombre, estilo y tamano
    texto.setForeground(Color.BLUE);
        // Define el panel para colocar los botones 

        JPanel pane = new JPanel();
        JPanel panel1 = new JPanel();

        JPanel panel2 = new JPanel();

        JPanel panel3 = new JPanel();
        

         

        // Coloca el titulo para los diferentes paneles
        panel1.setBorder(BorderFactory.createTitledBorder("IZQUIERDA"));

        panel2.setBorder(BorderFactory.createTitledBorder("CENTRADO"));

        panel3.setBorder(BorderFactory.createTitledBorder("DERECHO"));

         

        // CONFIGURA EL BOXLAYOUT

        BoxLayout layout = new BoxLayout(pane, BoxLayout.Y_AXIS);
        BoxLayout layout1 = new BoxLayout(panel1, BoxLayout.Y_AXIS);

        BoxLayout layout2 = new BoxLayout(panel2, BoxLayout.Y_AXIS);

        BoxLayout layout3 = new BoxLayout(panel3, BoxLayout.Y_AXIS);

        panel1.setLayout(layout1);

        panel2.setLayout(layout2);

        panel3.setLayout(layout3);
        pane.setLayout(layout);

         

        //Agrega los botones en el panel con tres diferentes formas de alinear 

        pane.add(lab_Login);
        pane.add(texto);
        pane.add(hecho);
         
        jb1.setAlignmentX(Component.LEFT_ALIGNMENT);

        jb2.setAlignmentX(Component.LEFT_ALIGNMENT);

        panel1.add(jb1);

        panel1.add(jb2);
        

        
         

        jb3.setAlignmentX(Component.CENTER_ALIGNMENT);

        jb4.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel2.add(jb3);

        panel2.add(jb4);

         

        jb5.setAlignmentX(Component.RIGHT_ALIGNMENT);

        jb6.setAlignmentX(Component.RIGHT_ALIGNMENT);

        panel3.add(jb5);

        panel3.add(jb6);
        panel3.add(jb6);
         

        // Agrega los tres paneles en el FRAME  

        frame.setLayout(new FlowLayout());
        frame.add(pane);
        frame.add(panel1);

        frame.add(panel2);

        frame.add(panel3);
        

         

        // Coloca la ventana 

        frame.pack();
    frame.setLocationRelativeTo(null); //Acomoda ventana en el centro de la pantalla

        frame.setVisible(true);

         

    }

 

}

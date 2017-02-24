
package flowlayoutdemo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
 
public class FlowLayoutDemo extends JFrame{
    JRadioButton RtoLbutton;
    JRadioButton LtoRbutton;
    FlowLayout experimentLayout = new FlowLayout();
    final String RtoL = "Derecha a izquierda";
    final String LtoR = "Izquierda a derecha";
    JButton applyButton = new JButton("Aceptar");
     
    public FlowLayoutDemo(String name) {
        super(name);
    }
     
    public void addComponentsToPane(final Container pane) {
        final JPanel compsToExperiment = new JPanel();
        compsToExperiment.setLayout(experimentLayout);
        experimentLayout.setAlignment(FlowLayout.TRAILING);
        JPanel controls = new JPanel();
        controls.setLayout(new FlowLayout());
         
        LtoRbutton = new JRadioButton(LtoR);
        RtoLbutton = new JRadioButton(RtoL);
         
        //Agregamos botones y elementos
        compsToExperiment.add(new JButton("Boton 1"));
        compsToExperiment.add(new JButton("Boton 2"));
        compsToExperiment.add(new JButton("Boton 3"));
        compsToExperiment.add(new JButton("Boton largo"));
        compsToExperiment.add(new JButton("5"));
        //Left to right component orientation is selected by default
        compsToExperiment.setComponentOrientation(
                ComponentOrientation.LEFT_TO_RIGHT);
         
        //Add controls to set up the component orientation in the experiment layout
        final ButtonGroup group = new ButtonGroup();
        group.add(LtoRbutton);
        group.add(RtoLbutton);
        controls.add(LtoRbutton);
        controls.add(RtoLbutton);
        controls.add(applyButton);
     
        pane.add(compsToExperiment, BorderLayout.CENTER);
        pane.add(controls, BorderLayout.SOUTH); ;
    }
     
  
    private static void Run() {
        //creamos el frame.
        FlowLayoutDemo frame = new FlowLayoutDemo("Ejemplo FlowLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //agregamos paneles
        frame.addComponentsToPane(frame.getContentPane());
        //Mostramos las ventas.
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null); //Acomoda ventana en el centro de la pantalla

    }
     
    public static void main(String[] args) {
      
       
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Run();
            }
        });
    }
}
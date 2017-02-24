/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package borderlayoutdemo;

/**
 *
 * @author C.andres
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Borderlayoutdemo {
    //variables y comtenedores
    private JLabel etiquetaSu;
    private JPanel panelIzquierdo, panelDerecho, panelInferior;
    private JButton botonIz1, botonIz2, botonIz3;
    private JButton botonDe1, botonDe2, botonDe3;
    private JButton    botonIn1, botonIn2;
    private JScrollPane scroll;

    public void contruyePanelIzquierdo(){
        panelIzquierdo = new JPanel();
        botonIz1=new JButton("IZQUIERDO 1");
        botonIz2=new JButton("IZQUIERDO 2");
        botonIz3=new JButton("IZQUIERDO 3");
        panelIzquierdo.setLayout(new BoxLayout(panelIzquierdo,BoxLayout.Y_AXIS));
        panelIzquierdo.setBackground(Color.LIGHT_GRAY);
        panelIzquierdo.add(botonIz1);
        panelIzquierdo.add(botonIz2);
        panelIzquierdo.add(botonIz3);
    }

    public void contruyePanelDerecho(){
        panelDerecho = new JPanel();
        botonDe1=new JButton("DERECHO 1");
        
        botonDe2=new JButton("DERECHO 2");
        botonDe3=new JButton("DERECHO 3");
        panelDerecho.setLayout(new BoxLayout(panelDerecho,BoxLayout.Y_AXIS));
        panelDerecho.setBackground(Color.LIGHT_GRAY);
        panelDerecho.add(botonDe1);
        panelDerecho.add(botonDe2);
        panelDerecho.add(botonDe3);
    }

    public void contruyePanelInferior(){
        panelInferior = new JPanel();
        botonIn1=new JButton("Aceptar");
       botonIn1.setBounds(100, 100, 100, 100);
        botonIn2=new JButton("Cancelar");
       
        panelInferior.setLayout(new FlowLayout());
        panelInferior.setBackground(Color.DARK_GRAY);
        panelInferior.add(botonIn1);
        panelInferior.add(botonIn2);
        
    }

    public void contruyeVentana(){
        JFrame frame = new JFrame();
        scroll = new JScrollPane(new JTextArea("Coloque su texto aqui xxx",15,5));
        etiquetaSu = new JLabel("Ejemplo de BorderLayout ");
        Font aux=etiquetaSu.getFont();
        etiquetaSu.setFont(new Font(aux.getFontName(), aux.getStyle(), 30));
        frame.setLayout(new BorderLayout());

        //agregamos los paneles al frame principal
        frame.add(etiquetaSu,BorderLayout.NORTH);
        frame.add(scroll, BorderLayout.CENTER);
        frame.add(panelIzquierdo,BorderLayout.WEST);
        frame.add(panelDerecho,BorderLayout.EAST);
        frame.add(panelInferior,BorderLayout.SOUTH);
        //Configuramos el frame
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); //Acomoda ventana en el centro de la pantalla

    }

    public Borderlayoutdemo(){
        contruyePanelInferior();
        contruyePanelIzquierdo();
        contruyePanelDerecho();
        contruyeVentana();
    }

    public static void main (String [] inforux){
        new Borderlayoutdemo();
    }
}
/*
 * Creando ventana D (ventana de CREDITOS)
 */
package cadillacs.racing;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class VentanaD extends JFrame{
    public Image imagenFondo;
    public URL fondoA;
    JLabel eti_Creditos;
    JButton Boton_Inicio;
    
    public VentanaD (){ //Constructor ventana D.
        //CREANDO ESPECIFICACIONES DE VENTANA D.
        this.setSize(500, 500);//Estableciendo tamaño de la venta D.
        this.setLocationRelativeTo(null);//Centrando ventana en la pantalla.
        this.setTitle("CREDITOS"); //Estableciendo titulo de la Venta D.
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Cuando cierre la ventana C automaticamente se terminara el programa.
        
        //COLOCANDO IMAGEN DE FONDO EN VENTA D.
        fondoA = this.getClass().getResource("ImagenA.jpg");
        imagenFondo = new ImageIcon(fondoA).getImage();
        Container contenedor = getContentPane();
        contenedor.add(panelD);
        panelD.setLayout(null);//Estamos desactivando el diseño del panel.
        
        //CREANDO ETIQUETA DE NOMBRE DE LA PANTALLA.
        eti_Creditos = new JLabel("Creditos");
        eti_Creditos.setBounds(185, 10, 300, 34);
        eti_Creditos.setForeground(Color.WHITE);
        eti_Creditos.setFont( new Font( "Bookman old style", Font.BOLD, 26 ) );
        panelD.add(eti_Creditos);
        
        //CREANDO BOTONES DE VENTANA D.
        Boton_Inicio = new JButton ("INICIO");
        Boton_Inicio.setBounds(370, 425, 100, 25);
        panelD.add(Boton_Inicio);
        
        //CREANDO EVENTOS DE BOTONES...........
        Boton_Inicio.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaA nextVA = new VentanaA();
                nextVA.setVisible(true);
                VentanaD.this.dispose();
            }
            
        });
        
    }
    
    public JPanel panelD = new JPanel(){
        
        public void paintComponent(Graphics g){
            g.drawImage(imagenFondo,0,0,getWidth(),getHeight(),this);
        }
    };
    
    
    
}

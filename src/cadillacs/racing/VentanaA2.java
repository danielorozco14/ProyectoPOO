/*
 * Creando ventana A2 (ventana de TIENDA)
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
public class VentanaA2 extends JFrame{
    public Image imagenFondo;
    public URL fondoA;
    JLabel eti_Tienda;
    JButton Boton_SeleccionarPista, Boton_Inicio;
    
    public VentanaA2 (){ //Constructor ventana A2.
        //CREANDO ESPECIFICACIONES DE VENTANA A2.
        this.setSize(700, 500);//Estableciendo tamaño de la venta A2.
        this.setLocationRelativeTo(null);//Centrando ventana en la pantalla.
        this.setTitle("TIENDA"); //Estableciendo titulo de la Venta A2.
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Cuando cierre la ventana A2 automaticamente se terminara el programa.
        
        //COLOCANDO IMAGEN DE FONDO EN VENTA A2.
        fondoA = this.getClass().getResource("ImagenA.jpg");
        imagenFondo = new ImageIcon(fondoA).getImage();
        Container contenedor = getContentPane();
        contenedor.add(panelA2);
        panelA2.setLayout(null);//Estamos desactivando el diseño del panel.
        
        //CREANDO ETIQUETA DE NOMBRE DE PANTALLA.
        eti_Tienda = new JLabel("TIENDA");
        eti_Tienda.setBounds(300, 10, 300, 34);
        eti_Tienda.setForeground(Color.WHITE);
        eti_Tienda.setFont( new Font( "Bookman old style", Font.BOLD, 26 ) );
        panelA2.add(eti_Tienda);
        
        //CREANDO BOTONES DE VENTANA A2.
        Boton_SeleccionarPista = new JButton ("SELECCIONAR PISTA");
        Boton_SeleccionarPista.setBounds(500, 60, 160, 50);//Colocando el boton en las cordenadas que yo deseo y el tamaño que lo deseo.
        panelA2.add(Boton_SeleccionarPista);
        
        Boton_Inicio = new JButton ("INICIO");
        Boton_Inicio.setBounds(500, 400, 150, 50);
        panelA2.add(Boton_Inicio);
        
        //CREANDO EVENTOS DE BOTONES...........
        Boton_SeleccionarPista.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaA3 nextVA3 = new VentanaA3();
                nextVA3.setVisible(true);
                VentanaA2.this.dispose();
            }
            
        });
        
        Boton_Inicio.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaA nextVA = new VentanaA();
                nextVA.setVisible(true);
                VentanaA2.this.dispose();
            }
            
        });
        
    }
    
    public JPanel panelA2 = new JPanel(){
        
        public void paintComponent(Graphics g){
            g.drawImage(imagenFondo,0,0,getWidth(),getHeight(),this);
        }
    };
    
    
}

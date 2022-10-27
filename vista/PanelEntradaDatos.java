package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //------------------------
    //Atributos
    //------------------------
    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JLabel lbNumero;
    private JLabel lbMinutos;
    private JLabel lbCosto;
    private JLabel lbOperador;
    private JTextField tfNumero;
    private JTextField tfMinutos;
    private JTextField tfCosto;
    private JTextField tfOperador;
    
    //------------------------
    //Metodos
    //------------------------
    
    //Constructor
    public PanelEntradaDatos()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        
        //Creación y adición de etiquetas Color, PosX y PosY
        lbNumero = new JLabel("-Numero = ");
        lbNumero.setBounds(20,20,80,20);
        add(lbNumero);
        
        lbMinutos = new JLabel("-Minutos deseados =");
        lbMinutos.setBounds(20,50,120,20);
        add(lbMinutos);
        
        lbCosto = new JLabel("-Costo por minuto =");
        lbCosto.setBounds(20,80,120,20);
        add(lbCosto);
        
        lbOperador = new JLabel("-Operador =");
        lbOperador.setBounds(20,110,100,20);
        add(lbOperador);
        
        //Creación y adición de campos de texto
        tfNumero = new JTextField("");
        tfNumero.setBounds(90, 20, 100, 20);
        add(tfNumero);
        
        tfMinutos = new JTextField("");
        tfMinutos.setBounds(140, 50, 100, 20);
        add(tfMinutos);
        
        tfCosto = new JTextField("");
        tfCosto.setBounds(140, 80, 100, 20);
        add(tfCosto);

        tfOperador = new JTextField("");
        tfOperador.setBounds(100, 110, 100, 20);
        add(tfOperador);
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos Cliente");
        borde.setTitleColor(Color.black);
        setBorder(borde);
    }
    
    //Metodos de acceso a la información de las cajas de texto
    public String getNumero()
    {
        return tfNumero.getText();
    }
    
    public String getMinutos()
    {
        return tfMinutos.getText();
    }
    
    public String getCosto()
    {
        return tfCosto.getText();
    }

    public String getOperador()
    {
        return tfOperador.getText();
    }
    
    //Metodo para borrar cajas de texto
    public void borrar()
    {
        tfNumero.setText("");
        tfMinutos.setText("");
        tfCosto.setText("");       
        tfOperador.setText("");
    }
}
package vista;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
    //----------------------
    //Atributos
    //----------------------
    public JButton bAñadir;
    public JButton bSaldo;
    public JButton bSalir;
    
    //----------------------
    //Metodos
    //----------------------
    
    //Constructor
    public PanelOperaciones()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
       
        //Creación y adicion de los botones
        bAñadir = new JButton("Añadir");
        bAñadir.setFont(new Font("Arial", BOLD, 12));
        bAñadir.setBounds(10,20,90,20);
        add(bAñadir);
        bAñadir.setActionCommand("añadir");
        
        
        bSaldo = new JButton("Calcular saldo");
        bSaldo.setFont(new Font("Arial", BOLD, 12));
        bSaldo.setBounds(180,20,120,20);
        add(bSaldo);
        bSaldo.setActionCommand("Saldo");
        bSaldo.setEnabled(false);

        bSalir = new JButton("Salir");
        bSalir.setFont(new Font("Arial", BOLD, 12));
        bSalir.setBounds(80,20,120,20);
        add(bSalir);
        bSalir.setActionCommand("Salir");
        bSalir.setEnabled(false);


        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.black);
        setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        bAñadir.addActionListener(pAL);
        bSaldo.addActionListener(pAL);
        bSalir.addActionListener(pAL);
    }
    
    public void desactivarBotonCrear()
    {
        bAñadir.setEnabled(false);
    }
    
    public void activarBotones()
    {
        bSalir.setEnabled(true);
        bSaldo.setEnabled(true);
    }
}
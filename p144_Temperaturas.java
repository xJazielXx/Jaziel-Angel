import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class p144_Temperaturas extends JFrame implements ActionListener, ChangeListener{
    JPanel p1;
    JLabel lblFarenheit, lblCentigrados;
    JTextField txtFarenheit, txtCentigrados;
    ButtonGroup grpOptions;
    JRadioButton rbtnCalCentigrados, rbtnCalFarenheit;
    JButton btnCalcular, btnSalir;

    public p144_Temperaturas(){
        super("Convertir temperaturas");
        setLayout(new FlowLayout());

        
        p1 = new JPanel();
        p1.setLayout(new GridLayout(5, 2));

        lblFarenheit = new JLabel("Farenheit: ", JLabel.RIGHT );
        p1.add(lblFarenheit);
        txtFarenheit = new JTextField();
        p1.add(txtFarenheit);

        lblCentigrados = new JLabel("Centigrados: ", JLabel.RIGHT);
        p1.add(lblCentigrados);
        txtCentigrados = new JTextField();
        p1.add(txtCentigrados);

        p1.add(new JLabel(""));
        p1.add(new JLabel(""));

        grpOptions = new ButtonGroup();
        rbtnCalCentigrados = new JRadioButton("Calcular Centigrados");
        rbtnCalFarenheit = new JRadioButton("Calcular Farenheit");

        grpOptions.add(rbtnCalCentigrados);
        grpOptions.add(rbtnCalFarenheit);

        p1.add(rbtnCalCentigrados);
        p1.add(rbtnCalFarenheit);

        add(p1);

        btnCalcular = new JButton("Aceptar");
        add(btnCalcular);
        btnSalir = new JButton("Salir");
        add(btnSalir);

        rbtnCalCentigrados.addChangeListener(this);
        rbtnCalFarenheit.addChangeListener(this);

        btnCalcular.addActionListener(this);
        btnSalir.addActionListener(this); 
    }

    public void stateChanged(ChangeEvent e ){
        txtCentigrados.setEnabled(true);
        txtFarenheit.setEnabled(true);

        if(rbtnCalCentigrados.isSelected()) {
            txtCentigrados.setEnabled(false);
        }else if(rbtnCalFarenheit.isSelected()){
            txtFarenheit.setEnabled(false);
        }
    }

    public void actionPerformed(ActionEvent e){
        float c, f;
        if(e.getSource() == btnCalcular){
            try{
                if (rbtnCalCentigrados.isSelected()) {
                    f = Float.parseFloat(txtFarenheit.getText());
                    c = (f - 32) * 5/9;  
                    txtCentigrados.setText(String.format("%.2f", c));

                }else if(rbtnCalFarenheit.isSelected()){
                    
                    c = Float.parseFloat(txtCentigrados.getText());
                    f = (c * 9/5) + 32;
                    txtFarenheit.setText(String.format("%.2f", f));
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, "Faltan valores o son invalidos",  "Error", 
                JOptionPane.ERROR_MESSAGE);
            }
        }else if(e.getSource() == btnSalir){
            dispose();
        }
    }

    public static void main(String[] args) {
        p144_Temperaturas app = new p144_Temperaturas();
        app.setBounds(10, 10, 300, 300);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
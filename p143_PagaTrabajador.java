import javax.swing.*;
import java.awt.event.*;

public class p143_PagaTrabajador extends JFrame implements ActionListener{
    JLabel lblHorasTrabajadas, lblPagaHora, lblTasaImpuestos, lblPagaBruta, lblImpuesto, lblPagaNeta;
    JTextField txtHorasTrabajadas, txtPagaHora, txtTasaImpuestos;
    JButton btnCalcular, btnSalir;
    
    JLabel lblResultadoPagaBruta, lblResultadoImpuesto, lblResultadoPagaNeta;

    public p143_PagaTrabajador(){
        super("Calcular Paga de Trabajador");
        setLayout(null);
    
        lblHorasTrabajadas = new JLabel("Horas trabajadas:");
        lblHorasTrabajadas.setBounds(30, 30, 120, 25);
        add(lblHorasTrabajadas);
        txtHorasTrabajadas = new JTextField();
        txtHorasTrabajadas.setBounds(160, 30, 100, 25);
        add(txtHorasTrabajadas);

        lblPagaHora = new JLabel("Paga por hora:");
        lblPagaHora.setBounds(30, 70, 120, 25);
        add(lblPagaHora);
        txtPagaHora = new JTextField();
        txtPagaHora.setBounds(160, 70, 100, 25);
        add(txtPagaHora);

        lblTasaImpuestos = new JLabel("Tasa de impuestos:");
        lblTasaImpuestos.setBounds(30, 110, 120, 25);
        add(lblTasaImpuestos);
        txtTasaImpuestos = new JTextField();
        txtTasaImpuestos.setBounds(160, 110, 100, 25);
        add(txtTasaImpuestos);

        // Paga bruta
        lblPagaBruta = new JLabel("Paga bruta:");
        lblPagaBruta.setBounds(30, 150, 120, 25);
        add(lblPagaBruta);
        
        // resultado
        lblResultadoPagaBruta = new JLabel("0.00 ");
        lblResultadoPagaBruta.setBounds(160, 150, 100, 25);
        add(lblResultadoPagaBruta);

        // Impuesto
        lblImpuesto = new JLabel("Impuesto:");
        lblImpuesto.setBounds(30, 190, 120, 25);
        add(lblImpuesto);
        
        // resultado
        lblResultadoImpuesto = new JLabel("0.00 ");
        lblResultadoImpuesto.setBounds(160, 190, 100, 25);
        add(lblResultadoImpuesto);

        // Paga neta
        lblPagaNeta = new JLabel("Paga neta:");
        lblPagaNeta.setBounds(30, 230, 120, 25);
        add(lblPagaNeta);
        
        // resultado
        lblResultadoPagaNeta = new JLabel("0.00 ");
        lblResultadoPagaNeta.setBounds(160, 230, 100, 25);
        add(lblResultadoPagaNeta);

        // Botones
        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(30, 270, 100, 30);
        add(btnCalcular);
        btnCalcular.addActionListener(this); 

        btnSalir = new JButton("Salir");
        btnSalir.setBounds(160, 270, 100, 30);
        add(btnSalir);
        btnSalir.addActionListener(this);
    }

    // Calcular la paga bruta
    public float getPagaBruta(float horasTrabajadas, float pagaHora){
        return horasTrabajadas * pagaHora;
    }

    // Calcular el impuesto
    public float getImpuesto(float horasTrabajadas, float pagaHora, float tasaImpuestos){
        return (horasTrabajadas * pagaHora) * (tasaImpuestos / 100);
    }

    // Calcular la paga neta
    public float getPagaNeta(float horasTrabajadas, float pagaHora, float tasaImpuestos){
        return (horasTrabajadas * pagaHora) * (1 - (tasaImpuestos / 100));
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnCalcular){
            try {
                float horasTrabajadas = Float.parseFloat(txtHorasTrabajadas.getText());
                float pagaHora = Float.parseFloat(txtPagaHora.getText());
                float tasaImpuestos = Float.parseFloat(txtTasaImpuestos.getText());

                float pagaBruta = getPagaBruta(horasTrabajadas, pagaHora);
                float impuesto = getImpuesto(horasTrabajadas, pagaHora, tasaImpuestos);
                float pagaNeta = getPagaNeta(horasTrabajadas, pagaHora, tasaImpuestos);

                lblResultadoPagaBruta.setText(String.format("%.2f €", pagaBruta));
                lblResultadoImpuesto.setText(String.format("%.2f €", impuesto));
                lblResultadoPagaNeta.setText(String.format("%.2f €", pagaNeta));
                
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, 
                    "Ingresa valores numéricos ", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(e.getSource() == btnSalir){
            JOptionPane.showMessageDialog(this, "Gracias por usar este programa", "Despedida",
                JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }
    
    public static void main(String[] args){
        p143_PagaTrabajador app = new p143_PagaTrabajador();
        app.setBounds(100, 100, 450, 400);  
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package autonoma.simulacionVehiculo.views;

import autonoma.simulacionVehiculo.exceptions.AcelerarFrenarVehiculoApagadoException;
import autonoma.simulacionVehiculo.exceptions.FrenarVehiculoDetenidoException;
import autonoma.simulacionVehiculo.exceptions.VehiculoAccidentadoException;
import autonoma.simulacionVehiculo.exceptions.VehiculoAceleradoAltamenteException;
import autonoma.simulacionVehiculo.exceptions.VehiculoApagadoException;
import autonoma.simulacionVehiculo.exceptions.VehiculoEncendidoException;
import autonoma.simulacionVehiculo.exceptions.VehiculoPatinandoFrenadoBruscamenteException;
import autonoma.simulacionVehiculo.exceptions.VehiculoPatinandoFrenadoException;
import autonoma.simulacionVehiculo.models.Simulador;
import autonoma.simulacionVehiculo.models.Sonido;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 * Modelo que permite representar la VentanaPrincipal
 * @author Mariana
 * @since 20250405
 * @version 1.0
*/
public class VentanaPrincipal extends javax.swing.JFrame {
    //Atributos
    /**
    * Instancia de Simulador
    */
    Simulador simulador;
    /**
    * Instancia de ventanaEncendido
    */
    Encender encender;
    /**
    * Instancia de Sonido
    */
    Sonido sonido;
    /**
    * Instancia de Accidente
    */
    Accidente accidente;
    
    /**
     * Inicializa los atributos de la VentanaPrincipal
     * @param simulador
    */
    public VentanaPrincipal(Simulador simulador) {
        this.simulador = simulador;
        this.sonido = new Sonido();
        initComponents();
        this.setLocationRelativeTo(null);
        try{
            this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/simulacionVehiculo/images/logoApp.png")).getImage());
        }catch (Exception e){
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        btnAcelerar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnFrenar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnFondoPantalla = new javax.swing.JPanel();
        pantalla = new javax.swing.JPanel();
        btnEncender = new javax.swing.JPanel();
        txtOn = new javax.swing.JLabel();
        btnApagar = new javax.swing.JPanel();
        txtOf = new javax.swing.JLabel();
        txtVelocidadActual = new javax.swing.JLabel();
        JPTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnMostrarConfiguracionesPosibles = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnVerConfiguracionActual = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnSalirVehiculo = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnCambiarConfiguracion = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        imagenVehiculo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAcelerar.setBackground(new java.awt.Color(228, 255, 228));
        btnAcelerar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAcelerarMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SimSun-ExtG", 1, 12)); // NOI18N
        jLabel2.setText("Acelerar");

        javax.swing.GroupLayout btnAcelerarLayout = new javax.swing.GroupLayout(btnAcelerar);
        btnAcelerar.setLayout(btnAcelerarLayout);
        btnAcelerarLayout.setHorizontalGroup(
            btnAcelerarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAcelerarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        btnAcelerarLayout.setVerticalGroup(
            btnAcelerarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        panelPrincipal.add(btnAcelerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 580, 80, 20));

        btnFrenar.setBackground(new java.awt.Color(204, 244, 255));
        btnFrenar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFrenarMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SimSun-ExtG", 1, 12)); // NOI18N
        jLabel3.setText("Frenar");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnFrenarLayout = new javax.swing.GroupLayout(btnFrenar);
        btnFrenar.setLayout(btnFrenarLayout);
        btnFrenarLayout.setHorizontalGroup(
            btnFrenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFrenarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        btnFrenarLayout.setVerticalGroup(
            btnFrenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFrenarLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        panelPrincipal.add(btnFrenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 610, 70, 20));

        btnFondoPantalla.setBackground(new java.awt.Color(0, 0, 0));

        btnEncender.setBackground(new java.awt.Color(102, 153, 255));
        btnEncender.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(), javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder())));
        btnEncender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEncenderMouseClicked(evt);
            }
        });

        txtOn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        txtOn.setText("ON");

        javax.swing.GroupLayout btnEncenderLayout = new javax.swing.GroupLayout(btnEncender);
        btnEncender.setLayout(btnEncenderLayout);
        btnEncenderLayout.setHorizontalGroup(
            btnEncenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEncenderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnEncenderLayout.setVerticalGroup(
            btnEncenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtOn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnApagar.setBackground(new java.awt.Color(255, 153, 153));
        btnApagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnApagarMouseClicked(evt);
            }
        });

        txtOf.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        txtOf.setText("OFF");
        txtOf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOfMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnApagarLayout = new javax.swing.GroupLayout(btnApagar);
        btnApagar.setLayout(btnApagarLayout);
        btnApagarLayout.setHorizontalGroup(
            btnApagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnApagarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOf)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        btnApagarLayout.setVerticalGroup(
            btnApagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtOf, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        txtVelocidadActual.setFont(new java.awt.Font("Yu Gothic UI", 3, 10)); // NOI18N
        txtVelocidadActual.setText("Velocidad actual");

        javax.swing.GroupLayout pantallaLayout = new javax.swing.GroupLayout(pantalla);
        pantalla.setLayout(pantallaLayout);
        pantallaLayout.setHorizontalGroup(
            pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pantallaLayout.createSequentialGroup()
                        .addGroup(pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnApagar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEncender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtVelocidadActual, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                .addContainerGap())
        );
        pantallaLayout.setVerticalGroup(
            pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtVelocidadActual)
                .addGap(12, 12, 12)
                .addComponent(btnEncender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout btnFondoPantallaLayout = new javax.swing.GroupLayout(btnFondoPantalla);
        btnFondoPantalla.setLayout(btnFondoPantallaLayout);
        btnFondoPantallaLayout.setHorizontalGroup(
            btnFondoPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnFondoPantallaLayout.setVerticalGroup(
            btnFondoPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFondoPantallaLayout.createSequentialGroup()
                .addComponent(pantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelPrincipal.add(btnFondoPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 100, 100));

        JPTitulo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SimSun", 1, 36)); // NOI18N
        jLabel1.setText("Simulador de un vehiculo");

        javax.swing.GroupLayout JPTituloLayout = new javax.swing.GroupLayout(JPTitulo);
        JPTitulo.setLayout(JPTituloLayout);
        JPTituloLayout.setHorizontalGroup(
            JPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPTituloLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        JPTituloLayout.setVerticalGroup(
            JPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPTituloLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panelPrincipal.add(JPTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 580, 70));

        btnMostrarConfiguracionesPosibles.setBackground(new java.awt.Color(152, 212, 252));
        btnMostrarConfiguracionesPosibles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarConfiguracionesPosiblesMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        jLabel6.setText("Mostrar configuraciones");

        javax.swing.GroupLayout btnMostrarConfiguracionesPosiblesLayout = new javax.swing.GroupLayout(btnMostrarConfiguracionesPosibles);
        btnMostrarConfiguracionesPosibles.setLayout(btnMostrarConfiguracionesPosiblesLayout);
        btnMostrarConfiguracionesPosiblesLayout.setHorizontalGroup(
            btnMostrarConfiguracionesPosiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMostrarConfiguracionesPosiblesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        btnMostrarConfiguracionesPosiblesLayout.setVerticalGroup(
            btnMostrarConfiguracionesPosiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMostrarConfiguracionesPosiblesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        panelPrincipal.add(btnMostrarConfiguracionesPosibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 180, 30));

        btnVerConfiguracionActual.setBackground(new java.awt.Color(204, 204, 204));
        btnVerConfiguracionActual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerConfiguracionActualMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        jLabel5.setText("Ver configuracion actual");

        javax.swing.GroupLayout btnVerConfiguracionActualLayout = new javax.swing.GroupLayout(btnVerConfiguracionActual);
        btnVerConfiguracionActual.setLayout(btnVerConfiguracionActualLayout);
        btnVerConfiguracionActualLayout.setHorizontalGroup(
            btnVerConfiguracionActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVerConfiguracionActualLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
        );
        btnVerConfiguracionActualLayout.setVerticalGroup(
            btnVerConfiguracionActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVerConfiguracionActualLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panelPrincipal.add(btnVerConfiguracionActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 180, 30));

        btnSalirVehiculo.setBackground(new java.awt.Color(152, 212, 252));
        btnSalirVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirVehiculoMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        jLabel7.setText("Salir del vehiculo");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnSalirVehiculoLayout = new javax.swing.GroupLayout(btnSalirVehiculo);
        btnSalirVehiculo.setLayout(btnSalirVehiculoLayout);
        btnSalirVehiculoLayout.setHorizontalGroup(
            btnSalirVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSalirVehiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnSalirVehiculoLayout.setVerticalGroup(
            btnSalirVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSalirVehiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        panelPrincipal.add(btnSalirVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 610, 130, -1));

        btnCambiarConfiguracion.setBackground(new java.awt.Color(204, 204, 204));
        btnCambiarConfiguracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCambiarConfiguracionMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        jLabel8.setText("Cambiar configuracion");

        javax.swing.GroupLayout btnCambiarConfiguracionLayout = new javax.swing.GroupLayout(btnCambiarConfiguracion);
        btnCambiarConfiguracion.setLayout(btnCambiarConfiguracionLayout);
        btnCambiarConfiguracionLayout.setHorizontalGroup(
            btnCambiarConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCambiarConfiguracionLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        btnCambiarConfiguracionLayout.setVerticalGroup(
            btnCambiarConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCambiarConfiguracionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        panelPrincipal.add(btnCambiarConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, 30));

        imagenVehiculo.setBackground(new java.awt.Color(255, 202, 202));
        imagenVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/simulacionVehiculo/images/interiorVehiculo.png"))); // NOI18N
        imagenVehiculo.setText("jLabel1");
        imagenVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenVehiculoMouseClicked(evt);
            }
        });
        panelPrincipal.add(imagenVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 581, 664));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Evento para encender el vehiculo
    */
    private void btnEncenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncenderMouseClicked
        try{
            String encender = this.simulador.encenderVehiculo();
            this.encender = new Encender(this, true);
            this.sonido.reproducir("encender.wav");
            this.encender.setVisible(true);
            JOptionPane.showMessageDialog(null, encender);
        }catch (VehiculoEncendidoException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnEncenderMouseClicked
    /**
     * Evento para acelerar el vehiculo
    */
    private void btnAcelerarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcelerarMouseClicked
        try{
            if (this.simulador.getVehiculo().getMotor().isEstado() == false){
                throw new AcelerarFrenarVehiculoApagadoException();
            }
            String aceleracionEntrada = JOptionPane.showInputDialog(null, "Ingrese cuanto desea acelera: ");
            float aceleracion = Float.parseFloat(aceleracionEntrada);
            this.sonido.reproducir("acelerar.wav");
            String mensaje = this.simulador.acelerarVehiculo(aceleracion);
            JOptionPane.showMessageDialog(null, mensaje);  
        }catch (AcelerarFrenarVehiculoApagadoException e){
            this.simulador.getVehiculo().setVelocidadActual(0);
            JOptionPane.showMessageDialog(null, e.getMessage());   
        }catch (VehiculoAceleradoAltamenteException e){
            this.accidente = new Accidente (this, true);
            this.accidente.setVisible(true);
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally {
            this.txtVelocidadActual.setText(String.valueOf(this.simulador.getVehiculo().getVelocidadActual()));
        }
    }//GEN-LAST:event_btnAcelerarMouseClicked

    private void txtOfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOfMouseClicked
  
    }//GEN-LAST:event_txtOfMouseClicked
    /**
     * Evento para frenar el vehiculo
    */
    private void btnFrenarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFrenarMouseClicked
        try{
            if (this.simulador.getVehiculo().getMotor().isEstado() == false){
                throw new AcelerarFrenarVehiculoApagadoException();
            }
            
            if(this.simulador.getVehiculo().getVelocidadActual() == 0){
                throw new FrenarVehiculoDetenidoException();
            }
            
            String frenadoEntrada = JOptionPane.showInputDialog(null, "Ingrese cuanto desea frenar: ");
            float frenado = Float.parseFloat(frenadoEntrada);
            this.sonido.reproducir("frenar.wav");
            String mensaje = this.simulador.frenarVehiculo(frenado);
            JOptionPane.showMessageDialog(null, mensaje); 
        }catch(AcelerarFrenarVehiculoApagadoException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }catch(FrenarVehiculoDetenidoException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }catch(VehiculoPatinandoFrenadoBruscamenteException e){
            this.sonido.reproducir("patinar.wav");
            JOptionPane.showMessageDialog(null, e.getMessage());
            JOptionPane.showMessageDialog(null, "El vehiculo se detuvo, ha recuperado el control"); 
        }catch(VehiculoPatinandoFrenadoException e){
            this.sonido.reproducir("patinar.wav");
            JOptionPane.showMessageDialog(null, e.getMessage()); 
            JOptionPane.showMessageDialog(null, "El vehiculo se detuvo, ha recuperado el control"); 
        }finally {
            this.txtVelocidadActual.setText(String.valueOf(this.simulador.getVehiculo().getVelocidadActual()));
        }
    }//GEN-LAST:event_btnFrenarMouseClicked
    /**
     * Evento para apagar el vehiculo
    */
    private void btnApagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApagarMouseClicked
        try{
            String apagar = this.simulador.apagarVehiculo();
            this.sonido.reproducir("apagar.wav");
            JOptionPane.showMessageDialog(null, apagar);
        }catch (VehiculoApagadoException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }catch (VehiculoAccidentadoException e){
            this.accidente = new Accidente (this, true);
            this.accidente.setVisible(true);
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            this.txtVelocidadActual.setText(String.valueOf(this.simulador.getVehiculo().getVelocidadActual()));
        }
    }//GEN-LAST:event_btnApagarMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void imagenVehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenVehiculoMouseClicked
        
    }//GEN-LAST:event_imagenVehiculoMouseClicked
    /**
     * Mostrar las posibles configuraciones del vehiculo
    */
    private void btnMostrarConfiguracionesPosiblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarConfiguracionesPosiblesMouseClicked
        JOptionPane.showMessageDialog(null, this.simulador.getTaller().mostrarPosiblesConfiguraciones() );
    }//GEN-LAST:event_btnMostrarConfiguracionesPosiblesMouseClicked
    /**
     * Mostrar la configuracion actual
    */
    private void btnVerConfiguracionActualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerConfiguracionActualMouseClicked
        try {
            JOptionPane.showMessageDialog(null, this.simulador.getTaller().mostrarConfiguracionActual());
        }catch(IOException ex){
            JOptionPane.showConfirmDialog(null, "Error al iniciar el programa, no se puede acceder al archivo configurarVehiculo.txt", "Error", JOptionPane.ERROR);
        }
    }//GEN-LAST:event_btnVerConfiguracionActualMouseClicked
    /**
     * Salir de la interfaz
    */
    private void btnSalirVehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirVehiculoMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnSalirVehiculoMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        
    }//GEN-LAST:event_jLabel7MouseClicked
    /**
     * Cambiar la configuracion actual por una nueva
    */
    private void btnCambiarConfiguracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarConfiguracionMouseClicked
      
        String configuracionLlanta = JOptionPane.showInputDialog(null, "Ingrese la nueva configuracion para sus llantas: ");
        String configuracionMotor = JOptionPane.showInputDialog(null, "Ingrese la nueva configuracion para su motor: ");
        
        try{
            this.simulador.getTaller().cambiarConfiguracionVehiculo(configuracionLlanta, configuracionMotor);
            JOptionPane.showMessageDialog(null, "Ha cambiado la configuracion del vehiculo", "ADVERTENCIA", HEIGHT);
            
        }catch(IOException e){
            JOptionPane.showConfirmDialog(null, "Error al iniciar el programa, no se puede acceder al archivo configurarVehiculo.txt", "Error", JOptionPane.ERROR);
        }
    }//GEN-LAST:event_btnCambiarConfiguracionMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPTitulo;
    private javax.swing.JPanel btnAcelerar;
    private javax.swing.JPanel btnApagar;
    private javax.swing.JPanel btnCambiarConfiguracion;
    private javax.swing.JPanel btnEncender;
    private javax.swing.JPanel btnFondoPantalla;
    private javax.swing.JPanel btnFrenar;
    private javax.swing.JPanel btnMostrarConfiguracionesPosibles;
    private javax.swing.JPanel btnSalirVehiculo;
    private javax.swing.JPanel btnVerConfiguracionActual;
    private javax.swing.JLabel imagenVehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel pantalla;
    private javax.swing.JLabel txtOf;
    private javax.swing.JLabel txtOn;
    private javax.swing.JLabel txtVelocidadActual;
    // End of variables declaration//GEN-END:variables
}

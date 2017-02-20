/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.practica1_201404218;

import ListaSimple.NodoSimple;
import static edd.practica1_201404218.EDDPractica1_201404218.listaJugadores;
import static edd.practica1_201404218.EDDPractica1_201404218.listaPalabras;
import static edd.practica1_201404218.EDDPractica1_201404218.listaPosiciones;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author David Tórtola
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Jugar");
        jButton1.setToolTipText("");

        jButton2.setText("Agregar jugador");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jMenu1.setText("Archivo");

        jMenuItem2.setText("Cargar diccionario");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Salir");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opciones");

        jMenuItem5.setText("Ver palabras");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Ver casillas dobles");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Ver casillas triples");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem4.setText("Ver jugadores");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(143, 143, 143))))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(82, 82, 82)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:

        //CÓDIGO PARA CARGAR EL ARCHIVO XML DEL DICCIONARIO
        //*************************************************
        LeerXML lector = new LeerXML();
        lector.leerXML();

        //*************************************************

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:

//                CÓDIGO PARA IMPRIMIR LAS PALABRAS
//        try{
//            for (int index = 0; index < listaPalabras.getTamaño(); index++) {
//                String aux = (String) listaPalabras.getValor(index);
//                System.out.println(aux);
//            }
//        }catch(Exception e){
//            
//        }
        //SE CONSTRUYE EL ENCABEZADO DEL CODIGO PARA GRAPHVIZ
        String comandos = "";
        comandos += "digraph G ";
        comandos += "{ ";
        comandos += "node [shape=circle]; ";
        comandos += "node [style=filled]; ";
        comandos += "node [fillcolor=\"#EEEEEE\"]; ";
        comandos += "node [color=\"#EEEEEE\"]; ";
        comandos += "edge [color=\"#31CEF0\"]; ";

        //SE ESCRIBEN LOS NODOS EN BASE A LA LISTA DE PALABRAS
        NodoSimple temp = listaPalabras.getInicio();
        while (temp.getSiguiente() != null) {

            comandos += temp.getValor() + " -> " + temp.getSiguiente().getValor() + " ";
            temp = temp.getSiguiente();
        }

        //SE TERMINA EL COMANDO DE GRAPHVIZ
        comandos += "rankdir=LR; \n";
        comandos += "}";

        try {

            //SE CREA EL ARCHIVO TXT CON LOS COMANDOS
            BufferedWriter bw = null;
            FileWriter fw = null;
            fw = new FileWriter("palabras.txt");
            bw = new BufferedWriter(fw);
            bw.write(comandos);
            bw.close();
            fw.close();

        } catch (Exception e) {

        }

        //SE EJECUTAN LOS COMANDOS DEL TXT Y SE CREA EL PNG
        String[] cmd = new String[5];
        cmd[0] = "dot";
        cmd[1] = "-Tpng";
        cmd[2] = "palabras.txt";
        cmd[3] = "-o";
        cmd[4] = "palabras.png";
        Runtime rt = Runtime.getRuntime();
        try {

            rt.exec(cmd);

        } catch (Exception e) {

        }

        //SE AGREGA EL PNG A UN LABEL, ESTE A UN FRAME Y SE MUESTRAN
        Palabras palabras = new Palabras();
        palabras.setVisible(true);
        palabras.setLayout(new FlowLayout());
        palabras.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        ImageIcon ii = new ImageIcon("palabras.png");

        JLabel label = new JLabel(ii);
        palabras.add(label, BorderLayout.CENTER);
        palabras.pack();

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:

        //CÓDIGO PARA IMPRIMIR LAS CASILLAS DOBLES
        try {
            System.out.println("Dobles:");
            for (int index = 0; index < listaPosiciones.getTamaño(); index++) {
                Posicion aux = (Posicion) listaPosiciones.getValor(index);
                if (aux.getTipo().equals("doble")) {

                    System.out.println("(" + aux.getX() + ", " + aux.getY() + ")");
                }

            }
        } catch (Exception e) {

        }


    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:

        //CÓDIGO PARA IMPRIMIR LAS CASILLAS TRIPLES
        try {
            System.out.println("Triples:");
            for (int index = 0; index < listaPosiciones.getTamaño(); index++) {
                Posicion aux = (Posicion) listaPosiciones.getValor(index);
                if (aux.getTipo().equals("triple")) {
                    System.out.println("(" + aux.getX() + ", " + aux.getY() + ")");
                }

            }
        } catch (Exception e) {

        }

    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        String nombre = jTextField1.getText();
        Jugador aux = new Jugador();
        aux.setNombre(nombre);
        listaJugadores.add(aux);

        jTextField1.setText("");

        try {
            for (int index = 0; index < listaJugadores.getTamaño(); index++) {
                Jugador temp = (Jugador) listaJugadores.getValor(index);
                System.out.println(temp.getNombre() + " le sigue ");
            }
        } catch (Exception e) {
            System.out.println("Error al imprimir la lista");
        }

        if (!listaJugadores.isEmpty()) {

            //SE CONSTRUYE EL ENCABEZADO DEL CODIGO PARA GRAPHVIZ
            String comandos = "";
            comandos += "digraph G ";
            comandos += "{ ";
            comandos += "node [shape=circle]; ";
            comandos += "node [style=filled]; ";
            comandos += "node [fillcolor=\"#EEEEEE\"]; ";
            comandos += "node [color=\"#EEEEEE\"]; ";
            comandos += "edge [color=\"#31CEF0\"]; ";

            //SE ESCRIBEN LOS NODOS EN BASE A LA LISTA DE PALABRAS
            ListaCircular.NodoSimple temp = listaJugadores.getInicio();

            while (temp.getSiguiente() != listaJugadores.getInicio()) {
                Jugador aux2 = (Jugador) temp.getValor();
                Jugador aux3 = (Jugador) temp.getSiguiente().getValor();
                comandos += aux2.getNombre() + " -> " + aux3.getNombre() + " ";
                temp = temp.getSiguiente();
            }

            Jugador aux2 = (Jugador) temp.getValor();
            Jugador aux3 = (Jugador) temp.getSiguiente().getValor();
            comandos += aux2.getNombre() + " -> " + aux3.getNombre() + " ";

            //SE TERMINA EL COMANDO DE GRAPHVIZ
            comandos += "rankdir=LR; \n";
            comandos += "}";

            try {

                //SE CREA EL ARCHIVO TXT CON LOS COMANDOS
                BufferedWriter bw = null;
                FileWriter fw = null;
                fw = new FileWriter("jugadores.txt");
                bw = new BufferedWriter(fw);
                bw.write(comandos);
                bw.close();
                fw.close();

            } catch (Exception e) {
                System.out.println("Error al crear el archivo txt");
            }

            //SE EJECUTAN LOS COMANDOS DEL TXT Y SE CREA EL PNG
            String[] cmd = new String[5];
            cmd[0] = "dot";
            cmd[1] = "-Tpng";
            cmd[2] = "jugadores.txt";
            cmd[3] = "-o";
            cmd[4] = "jugadores.png";
            Runtime rt = Runtime.getRuntime();
            try {

                rt.exec(cmd);

            } catch (Exception e) {
                System.out.println("Error al ejecutar el txt y crear el png");
            }
        
        }else{
            
        }
        

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:

            //SE AGREGA EL PNG A UN LABEL, ESTE A UN FRAME Y SE MUESTRAN
            Palabras palabras = new Palabras();
            palabras.setLayout(new FlowLayout());
            palabras.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            ImageIcon ii = new ImageIcon("jugadores.png");
            JLabel label = new JLabel(ii);

            palabras.add(label, BorderLayout.CENTER);
            palabras.pack();

            palabras.setVisible(true);
            
            Container panel = getContentPane();
            panel.setLayout(new FlowLayout()); 
            
            panel.add(label);
            panel.repaint();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

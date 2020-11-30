package Programa;

import Conversores.Area;
import Conversores.Comprimento;
import Conversores.Liquido;
import Conversores.Massa;
import Conversores.TipoMedida;

import java.util.logging.Level;
import java.util.logging.Logger;

public class programa extends javax.swing.JFrame {

    private void popularSeletor_categoria() {
        TipoMedida[] categorias = TipoMedida.values();
        for(TipoMedida categoria : categorias) {
            seletor_categoria.addItem(categoria.getTipo());
        }
    }
    
    private void popularSeletoresValor(int i) {        
        seletor_de.removeAllItems();
        seletor_para.removeAllItems();
        
        switch (i) {
            case 0:
                {
                    Comprimento[] lista = Comprimento.values();
                    for(Comprimento item : lista) {
                        seletor_de.addItem(item.getNome()+" ("+item.getSigla()+")");
                        seletor_para.addItem(item.getNome()+" ("+item.getSigla()+")");
                    }       break;
                }
            case 1:
                {
                    Area[] lista = Area.values();
                    for(Area item : lista) {
                        seletor_de.addItem(item.getNome()+" ("+item.getSigla()+")");
                        seletor_para.addItem(item.getNome()+" ("+item.getSigla()+")");
                    }       break;
                }
            case 2:
                {
                    Liquido[] lista = Liquido.values();
                    for(Liquido item : lista) {
                        seletor_de.addItem(item.getNome()+" ("+item.getSigla()+")");
                        seletor_para.addItem(item.getNome()+" ("+item.getSigla()+")");
                    }       break;
                }
            case 3:
                {
                    Massa[] lista = Massa.values();
                    for(Massa item : lista) {
                        seletor_de.addItem(item.getNome()+" ("+item.getSigla()+")");
                        seletor_para.addItem(item.getNome()+" ("+item.getSigla()+")");
                    }       break;
                }
            default:
                break;
        }
        seletor_de.setSelectedIndex(0);
        seletor_para.setSelectedIndex(1);
    }
    
    public void chamarClasse(String nome) {
        try {
            Class classe = Class.forName(nome);
            classe.newInstance();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(programa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(programa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(programa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Creates new form programa
     */
    public programa() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        popularSeletor_categoria();
        seletor_categoria.setSelectedIndex(0);
        popularSeletoresValor(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_de = new javax.swing.JLabel();
        label_para = new javax.swing.JLabel();
        valor_de = new javax.swing.JTextField();
        valor_para = new javax.swing.JTextField();
        seletor_de = new javax.swing.JComboBox<>();
        seletor_para = new javax.swing.JComboBox<>();
        seletor_categoria = new javax.swing.JComboBox<>();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuItemSair = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuItemAjuda = new javax.swing.JMenuItem();
        menuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de Medidas");
        setAlwaysOnTop(true);
        setResizable(false);

        label_de.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        label_de.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_de.setText("Converter de");
        label_de.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label_para.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        label_para.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_para.setText("Converter para");
        label_para.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        valor_de.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valor_de.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        valor_de.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        valor_de.setName(""); // NOI18N
        valor_de.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                valor_deFocusLost(evt);
            }
        });
        valor_de.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor_deActionPerformed(evt);
            }
        });

        valor_para.setEditable(false);
        valor_para.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valor_para.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        valor_para.setName("valor_para"); // NOI18N
        valor_para.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor_paraActionPerformed(evt);
            }
        });

        seletor_de.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seletor_deActionPerformed(evt);
            }
        });

        seletor_para.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seletor_paraActionPerformed(evt);
            }
        });

        seletor_categoria.setMaximumRowCount(10);
        seletor_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seletor_categoriaActionPerformed(evt);
            }
        });

        menuFile.setText("File");

        menuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        menuFile.add(menuItemSair);

        menuBar.add(menuFile);

        menuAjuda.setText("Ajuda");

        menuItemAjuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItemAjuda.setText("Ajuda");
        menuItemAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAjudaActionPerformed(evt);
            }
        });
        menuAjuda.add(menuItemAjuda);

        menuItemSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItemSobre.setText("Sobre");
        menuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(menuItemSobre);

        menuBar.add(menuAjuda);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_de, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_para, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valor_de, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valor_para, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seletor_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seletor_para, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seletor_de, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(seletor_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_de, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valor_de, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seletor_de, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_para, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valor_para, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seletor_para, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        seletor_para.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valor_deActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor_deActionPerformed
        int cat = seletor_categoria.getSelectedIndex();
        int de = seletor_de.getSelectedIndex();
        int para = seletor_para.getSelectedIndex();
        double v = Double.parseDouble(valor_de.getText());
        double valor=0;
        
        switch(cat) {
            case 0:
                valor = Comprimento.values()[para].deUnidadeBasica(Comprimento.values()[de].paraUnidadeBasica(v));
                break;
            case 1:
                valor = Area.values()[para].deUnidadeBasica(Area.values()[de].paraUnidadeBasica(v));
                break;
            case 2:
                valor = Liquido.values()[para].deUnidadeBasica(Liquido.values()[de].paraUnidadeBasica(v));
                break;
            case 3:
                valor = Massa.values()[para].deUnidadeBasica(Massa.values()[de].paraUnidadeBasica(v));
                break;
            default:
                break;
        }
        
        valor_para.setText(String.valueOf(valor));
        
    }//GEN-LAST:event_valor_deActionPerformed
    private void seletor_deActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seletor_deActionPerformed

    }//GEN-LAST:event_seletor_deActionPerformed
    private void seletor_paraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seletor_paraActionPerformed
            
    }//GEN-LAST:event_seletor_paraActionPerformed
    private void valor_paraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor_paraActionPerformed
        
    }//GEN-LAST:event_valor_paraActionPerformed
    private void seletor_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seletor_categoriaActionPerformed
        valor_de.setText("");
        valor_para.setText("");
        popularSeletoresValor(seletor_categoria.getSelectedIndex());
    }//GEN-LAST:event_seletor_categoriaActionPerformed

    private void menuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSobreActionPerformed
        Sobre sobre = new Sobre();
        sobre.setVisible(true);
        sobre.setAlwaysOnTop(true);
    }//GEN-LAST:event_menuItemSobreActionPerformed

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemSairActionPerformed

    private void menuItemAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAjudaActionPerformed
        Ajuda ajuda = new Ajuda();
        ajuda.setVisible(true);
        ajuda.setAlwaysOnTop(true);
    }//GEN-LAST:event_menuItemAjudaActionPerformed

    private void valor_deFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valor_deFocusLost

    }//GEN-LAST:event_valor_deFocusLost

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
            java.util.logging.Logger.getLogger(programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new programa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label_de;
    private javax.swing.JLabel label_para;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuItemAjuda;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JMenuItem menuItemSobre;
    private javax.swing.JComboBox<String> seletor_categoria;
    private javax.swing.JComboBox<String> seletor_de;
    private javax.swing.JComboBox<String> seletor_para;
    private javax.swing.JTextField valor_de;
    private javax.swing.JTextField valor_para;
    // End of variables declaration//GEN-END:variables
}

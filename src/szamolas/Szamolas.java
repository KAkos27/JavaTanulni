package szamolas;

import java.awt.HeadlessException;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class Szamolas extends javax.swing.JFrame {

    int osszeg;

    public Szamolas() {
        initComponents();

        osszeg = 0;

        //lblOsszesen.setText(osszeg + "Ft");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlOsszesen = new javax.swing.JPanel();
        lblOsszesen = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlOsszetevok = new javax.swing.JPanel();
        cbHagmya = new javax.swing.JCheckBox();
        cbSajt = new javax.swing.JCheckBox();
        cbAna = new javax.swing.JCheckBox();
        pnlStatisztika = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuProgram = new javax.swing.JMenu();
        mnuProgramMegnyitas = new javax.swing.JMenuItem();
        mnuProgramMentes = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuProgramKilepes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Szamolas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblOsszesen.setText("0 Ft");

        javax.swing.GroupLayout pnlOsszesenLayout = new javax.swing.GroupLayout(pnlOsszesen);
        pnlOsszesen.setLayout(pnlOsszesenLayout);
        pnlOsszesenLayout.setHorizontalGroup(
            pnlOsszesenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOsszesenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOsszesen, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        pnlOsszesenLayout.setVerticalGroup(
            pnlOsszesenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOsszesenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOsszesen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        cbHagmya.setText("hagyma");
        cbHagmya.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                OsszetevokItemStageChanged(evt);
            }
        });

        cbSajt.setText("sajt");
        cbSajt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                OsszetevokItemStageChanged(evt);
            }
        });

        cbAna.setText("ananász");
        cbAna.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                OsszetevokItemStageChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlOsszetevokLayout = new javax.swing.GroupLayout(pnlOsszetevok);
        pnlOsszetevok.setLayout(pnlOsszetevokLayout);
        pnlOsszetevokLayout.setHorizontalGroup(
            pnlOsszetevokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOsszetevokLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOsszetevokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbSajt)
                    .addComponent(cbHagmya)
                    .addComponent(cbAna))
                .addContainerGap())
        );
        pnlOsszetevokLayout.setVerticalGroup(
            pnlOsszetevokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOsszetevokLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbSajt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbHagmya)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbAna)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Beállítások", pnlOsszetevok);

        jLabel1.setText("Kiválasztva:");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(12);
        jTextArea1.setRows(3);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout pnlStatisztikaLayout = new javax.swing.GroupLayout(pnlStatisztika);
        pnlStatisztika.setLayout(pnlStatisztikaLayout);
        pnlStatisztikaLayout.setHorizontalGroup(
            pnlStatisztikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatisztikaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlStatisztikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlStatisztikaLayout.setVerticalGroup(
            pnlStatisztikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatisztikaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Statisztika", pnlStatisztika);

        mnuProgram.setText("Program");

        mnuProgramMegnyitas.setText("Megnyitás...");
        mnuProgram.add(mnuProgramMegnyitas);

        mnuProgramMentes.setText("Mentés...");
        mnuProgram.add(mnuProgramMentes);
        mnuProgram.add(jSeparator1);

        mnuProgramKilepes.setText("Kilépés...");
        mnuProgramKilepes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProgramKilepesActionPerformed(evt);
            }
        });
        mnuProgram.add(mnuProgramKilepes);

        jMenuBar1.add(mnuProgram);

        jMenu2.setText("Lehetőségek");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlOsszesen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(pnlOsszesen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        osszegetkiir();
    }//GEN-LAST:event_formWindowOpened
    private void OsszetevokItemStageChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_OsszetevokItemStageChanged
        int ar = 200;

        JCheckBox chb = (JCheckBox) evt.getSource();

        if (chb.isSelected()) {
            osszeg += ar;
        } else {
            osszeg -= ar;
        }

        osszegetkiir();
    }//GEN-LAST:event_OsszetevokItemStageChanged
    private void mnuProgramKilepesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProgramKilepesActionPerformed
        kilepes();
    }//GEN-LAST:event_mnuProgramKilepesActionPerformed
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        kilepes();
    }//GEN-LAST:event_formWindowClosing
    private void osszegetkiir() {
        lblOsszesen.setText("A fizetendő összeg: " + osszeg + "Ft");
    }

    private void kilepes() {
        String u = "Biztos kilép?";
        String c = "KILÉPÉS";
        int t = JOptionPane.OK_CANCEL_OPTION;

        int gomb = JOptionPane.showConfirmDialog(rootPane, u, c, t);

        if (gomb == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Szamolas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbAna;
    private javax.swing.JCheckBox cbHagmya;
    private javax.swing.JCheckBox cbSajt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblOsszesen;
    private javax.swing.JMenu mnuProgram;
    private javax.swing.JMenuItem mnuProgramKilepes;
    private javax.swing.JMenuItem mnuProgramMegnyitas;
    private javax.swing.JMenuItem mnuProgramMentes;
    private javax.swing.JPanel pnlOsszesen;
    private javax.swing.JPanel pnlOsszetevok;
    private javax.swing.JPanel pnlStatisztika;
    // End of variables declaration//GEN-END:variables
}

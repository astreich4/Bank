/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author adamstreich
 */
public class NewLoanGUI extends javax.swing.JFrame {

    /**
     * Creates new form NewLoanGUI
     */
    public NewLoanGUI(Account acc, Customer user, CustomerGUI gui) {
        initComponents();
        initActionListeners(acc,user,gui);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestAmtjLabel1 = new javax.swing.JLabel();
        nameOfLoanjLabel2 = new javax.swing.JLabel();
        currnecyjComboBox1 = new javax.swing.JComboBox<>();
        currencyjLabel3 = new javax.swing.JLabel();
        depositLocjLabel4 = new javax.swing.JLabel();
        depositLocjComboBox2 = new javax.swing.JComboBox<>();
        collatNamejLabel5 = new javax.swing.JLabel();
        collatWorthjLabel6 = new javax.swing.JLabel();
        nameOfLoanjTextField1 = new javax.swing.JTextField();
        requestAmtjTextField2 = new javax.swing.JTextField();
        CollatNamejTextField3 = new javax.swing.JTextField();
        collateWorthjTextField4 = new javax.swing.JTextField();
        requestLoanjButton1 = new javax.swing.JButton();
        loanAppjLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        requestAmtjLabel1.setText("Amount You Request:");

        nameOfLoanjLabel2.setText("Name Of Loan:");

        currnecyjComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        currencyjLabel3.setText("Curency:");

        depositLocjLabel4.setText("Account to place money:");

        collatNamejLabel5.setText("Collateral Name:");

        collatWorthjLabel6.setText("Collateral Worth:");

        requestLoanjButton1.setText("Request!");

        loanAppjLabel.setText("Loan Application");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameOfLoanjLabel2)
                            .addComponent(requestAmtjLabel1)
                            .addComponent(currencyjLabel3)
                            .addComponent(collatWorthjLabel6)
                            .addComponent(collatNamejLabel5)
                            .addComponent(depositLocjLabel4))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(depositLocjComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(collateWorthjTextField4)
                            .addComponent(CollatNamejTextField3)
                            .addComponent(nameOfLoanjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(requestAmtjTextField2)
                            .addComponent(currnecyjComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(requestLoanjButton1)))
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(loanAppjLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(loanAppjLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameOfLoanjLabel2)
                    .addComponent(nameOfLoanjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestAmtjLabel1)
                    .addComponent(requestAmtjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currnecyjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currencyjLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositLocjLabel4)
                    .addComponent(depositLocjComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collatNamejLabel5)
                    .addComponent(CollatNamejTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collatWorthjLabel6)
                    .addComponent(collateWorthjTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(requestLoanjButton1)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initActionListeners(Account acc, Customer user, CustomerGUI gui){
        
        requestLoanjButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                requestLoan(acc, user, gui);
            }
                
        });
        
        addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.out.println("Closed transfer window");
                e.getWindow().dispose();
                gui.updateAllDsipAndTH(user);
                gui.setVisible(true);
                
            }
        });
    }
    
    
    public void requestLoan(Account acc, Customer user, CustomerGUI gui){
        
    }
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
            java.util.logging.Logger.getLogger(NewLoanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewLoanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewLoanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewLoanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new NewLoanGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CollatNamejTextField3;
    private javax.swing.JLabel collatNamejLabel5;
    private javax.swing.JLabel collatWorthjLabel6;
    private javax.swing.JTextField collateWorthjTextField4;
    private javax.swing.JLabel currencyjLabel3;
    private javax.swing.JComboBox<String> currnecyjComboBox1;
    private javax.swing.JComboBox<String> depositLocjComboBox2;
    private javax.swing.JLabel depositLocjLabel4;
    private javax.swing.JLabel loanAppjLabel;
    private javax.swing.JLabel nameOfLoanjLabel2;
    private javax.swing.JTextField nameOfLoanjTextField1;
    private javax.swing.JLabel requestAmtjLabel1;
    private javax.swing.JTextField requestAmtjTextField2;
    private javax.swing.JButton requestLoanjButton1;
    // End of variables declaration//GEN-END:variables
}

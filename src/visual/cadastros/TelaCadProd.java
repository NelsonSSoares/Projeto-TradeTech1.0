/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual.cadastros;

import data.produto.Produto;
import data.produto.ProdutoDao;
import data.produto.ProdutoTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Nelson
 */
public class TelaCadProd extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadProd
     */
    
    ProdutoTableModel tableModel = new ProdutoTableModel();
    ProdutoDao produtoDao = new ProdutoDao();
    
    public TelaCadProd() {
        initComponents();
        
        tableProduto.setModel(tableModel);
        atualizaTabela();
        txtCodigo.setText(String.valueOf(produtoDao.consultaProximoCodigo()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProduto = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        planodefundolabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produtos - TradeTech 1.0");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel2.setForeground(java.awt.Color.lightGray);
        jLabel2.setText("Nome do Produto:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 20, 100, 30);

        jLabel3.setForeground(java.awt.Color.lightGray);
        jLabel3.setText("Quantidade:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(250, 20, 70, 30);

        jLabel4.setForeground(java.awt.Color.lightGray);
        jLabel4.setText("Valor:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(430, 20, 40, 30);

        txtProduto.setBackground(new java.awt.Color(18, 18, 20));
        txtProduto.setForeground(new java.awt.Color(204, 204, 204));
        txtProduto.setBorder(null);
        jPanel1.add(txtProduto);
        txtProduto.setBounds(110, 20, 120, 30);

        txtQuantidade.setBackground(new java.awt.Color(18, 18, 20));
        txtQuantidade.setForeground(new java.awt.Color(204, 204, 204));
        txtQuantidade.setBorder(null);
        jPanel1.add(txtQuantidade);
        txtQuantidade.setBounds(320, 20, 70, 30);

        txtValor.setBackground(new java.awt.Color(18, 18, 20));
        txtValor.setForeground(new java.awt.Color(204, 204, 204));
        txtValor.setBorder(null);
        txtValor.setCaretColor(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtValor);
        txtValor.setBounds(470, 20, 70, 30);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 120, 650, 10);

        btnCadastrar.setBackground(new java.awt.Color(3, 62, 11));
        btnCadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCadastrar.setForeground(java.awt.SystemColor.control);
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorderPainted(false);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar);
        btnCadastrar.setBounds(270, 70, 100, 30);

        tableProduto.setBackground(java.awt.Color.lightGray);
        tableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cod Produto", "Produto", "Quantidade", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Long.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableProduto);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(90, 180, 452, 140);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Produtos Cadastrado em Estoque ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(210, 150, 220, 20);

        jButton2.setBackground(new java.awt.Color(3, 62, 11));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(java.awt.SystemColor.control);
        jButton2.setText("OK");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(520, 350, 100, 30);

        jLabel6.setForeground(java.awt.Color.lightGray);
        jLabel6.setText("Cod Produto:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(390, 70, 80, 30);

        txtCodigo.setEditable(false);
        txtCodigo.setBackground(new java.awt.Color(18, 18, 20));
        txtCodigo.setForeground(new java.awt.Color(204, 204, 204));
        txtCodigo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCodigo.setCaretColor(new java.awt.Color(204, 204, 204));
        txtCodigo.setEnabled(false);
        jPanel1.add(txtCodigo);
        txtCodigo.setBounds(470, 70, 70, 30);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundocliente1.png"))); // NOI18N
        jLabel31.setText("jLabel30");
        jPanel1.add(jLabel31);
        jLabel31.setBounds(0, 0, 650, 400);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 80, 650, 400);

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/FotoJet (16).png"))); // NOI18N
        jLabel1.setText("Cadastro de Produtos:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 20, 350, 80);

        planodefundolabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/planodefundoapp.png"))); // NOI18N
        planodefundolabel.setText("Fundo");
        getContentPane().add(planodefundolabel);
        planodefundolabel.setBounds(0, 0, 700, 530);

        setSize(new java.awt.Dimension(707, 558));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if(validaCampos()){
            Produto produto = new Produto();
            
            produto.setNome(txtProduto.getText());
            produto.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
            produto.setValor(Double.parseDouble(txtValor.getText()));
            txtCodigo.setText(String.valueOf(produtoDao.consultaProximoCodigo()));
            switch(produtoDao.salvar(produto)){
                case 1:{
                    atualizaTabela();
                    JOptionPane.showMessageDialog(null, "Salvo com sucesso");
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    public void atualizaTabela(){
        tableModel.limpaTabela();
        tableModel.adicionaVariasLinhas(produtoDao.consultaTodos());
    }
    
    private boolean validaCampos(){
        if(txtProduto.getText().length()<=1){
            JOptionPane.showMessageDialog(null, "Erro: Nome invalido");
            txtProduto.requestFocus();
            return false;
        }else{
            try {
                Integer.parseInt(txtQuantidade.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro: Quantidade invalida");
                txtQuantidade.requestFocus();
                return false;
            }
            try {
                Double.parseDouble(txtValor.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro: Valor invalido");
                txtValor.requestFocus();
                return false;
            }
        }
        return true;
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
            java.util.logging.Logger.getLogger(TelaCadProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadProd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel planodefundolabel;
    private javax.swing.JTable tableProduto;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}

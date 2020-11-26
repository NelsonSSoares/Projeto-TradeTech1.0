/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual.entrega;

import data.cliente.Cliente;
import data.cliente.ClienteDao;
import data.entrega.Entrega;
import data.entrega.EntregaDao;
import data.pedido.Pedido;
import data.pedido.PedidoDao;
import data.pedidoTemProduto.PedidoTemProduto;
import data.pedidoTemProduto.PedidoTemProdutoDao;
import data.pedidoTemProduto.PedidoTemProdutoTableModel;
import data.produto.ProdutoDao;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Nelson
 */
public class TelaEnvEntrega extends javax.swing.JFrame {

    /**
     * Creates new form TelaEnvEntrega
     */
    
    private int codigoPedido;
    private int codigoEntrega;
    private double valorTotal=0;
    private String[] colunas = {"Codigo", "Produto", "Quantidade", "Valor"};
    private PedidoTemProdutoTableModel tableModel = new PedidoTemProdutoTableModel(colunas);
    
    public TelaEnvEntrega() {
        initComponents();
        
        tablePedido.setModel(tableModel);
        btnEnviar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtConsulta = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePedido = new javax.swing.JTable();
        btnEnviar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        planodefundolabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Envio de Entrega - TradeTech 1.0");
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/FotoJet (22).png"))); // NOI18N
        jLabel1.setText("Envio de Entregas:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 410, 100);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel2.setForeground(java.awt.Color.lightGray);
        jLabel2.setText("Cod Entrega:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 10, 70, 30);

        txtConsulta.setBackground(new java.awt.Color(18, 18, 20));
        txtConsulta.setForeground(new java.awt.Color(204, 204, 204));
        txtConsulta.setBorder(null);
        jPanel1.add(txtConsulta);
        txtConsulta.setBounds(90, 10, 110, 30);

        txtNome.setEditable(false);
        txtNome.setBackground(new java.awt.Color(18, 18, 20));
        txtNome.setForeground(new java.awt.Color(204, 204, 204));
        txtNome.setBorder(null);
        jPanel1.add(txtNome);
        txtNome.setBounds(20, 80, 170, 30);

        txtNumero.setEditable(false);
        txtNumero.setBackground(new java.awt.Color(18, 18, 20));
        txtNumero.setForeground(new java.awt.Color(204, 204, 204));
        txtNumero.setBorder(null);
        jPanel1.add(txtNumero);
        txtNumero.setBounds(20, 140, 50, 30);

        jLabel3.setForeground(java.awt.Color.lightGray);
        jLabel3.setText("Nome:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 60, 40, 20);

        jLabel6.setForeground(java.awt.Color.lightGray);
        jLabel6.setText("N:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 120, 20, 20);

        jLabel4.setForeground(java.awt.Color.lightGray);
        jLabel4.setText("Telefone:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(240, 60, 60, 20);

        txtTelefone.setEditable(false);
        txtTelefone.setBackground(new java.awt.Color(18, 18, 20));
        txtTelefone.setForeground(new java.awt.Color(204, 204, 204));
        txtTelefone.setBorder(null);
        jPanel1.add(txtTelefone);
        txtTelefone.setBounds(240, 80, 120, 30);

        jLabel7.setForeground(java.awt.Color.lightGray);
        jLabel7.setText("Bairro:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(240, 120, 40, 20);

        txtBairro.setEditable(false);
        txtBairro.setBackground(new java.awt.Color(18, 18, 20));
        txtBairro.setForeground(new java.awt.Color(204, 204, 204));
        txtBairro.setBorder(null);
        jPanel1.add(txtBairro);
        txtBairro.setBounds(240, 140, 120, 30);

        jLabel8.setForeground(java.awt.Color.lightGray);
        jLabel8.setText("Cidade:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(410, 120, 50, 20);

        txtCidade.setEditable(false);
        txtCidade.setBackground(new java.awt.Color(18, 18, 20));
        txtCidade.setForeground(new java.awt.Color(204, 204, 204));
        txtCidade.setBorder(null);
        jPanel1.add(txtCidade);
        txtCidade.setBounds(410, 140, 160, 30);

        jLabel5.setForeground(java.awt.Color.lightGray);
        jLabel5.setText("Endereço:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(410, 60, 60, 20);

        txtEndereco.setEditable(false);
        txtEndereco.setBackground(new java.awt.Color(18, 18, 20));
        txtEndereco.setForeground(new java.awt.Color(204, 204, 204));
        txtEndereco.setBorder(null);
        jPanel1.add(txtEndereco);
        txtEndereco.setBounds(410, 80, 160, 30);

        jButton1.setBackground(new java.awt.Color(3, 62, 11));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(java.awt.SystemColor.control);
        jButton1.setText("Procurar");
        jButton1.setToolTipText("procurar pedido");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(210, 10, 90, 30);

        tablePedido.setBackground(java.awt.Color.lightGray);
        tablePedido.setModel(new javax.swing.table.DefaultTableModel(
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
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePedido.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tablePedido);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 190, 550, 140);

        btnEnviar.setBackground(new java.awt.Color(3, 62, 11));
        btnEnviar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEnviar.setForeground(java.awt.SystemColor.control);
        btnEnviar.setText("Enviar");
        btnEnviar.setToolTipText("Confirmar Entrega");
        btnEnviar.setBorderPainted(false);
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnviar);
        btnEnviar.setBounds(370, 390, 90, 40);

        jButton3.setBackground(new java.awt.Color(3, 62, 11));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(java.awt.SystemColor.control);
        jButton3.setText("Sair");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(480, 390, 90, 40);

        jLabel10.setForeground(java.awt.Color.lightGray);
        jLabel10.setText("Total a Pagar:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 390, 80, 40);

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(18, 18, 20));
        txtTotal.setForeground(new java.awt.Color(204, 204, 204));
        txtTotal.setBorder(null);
        jPanel1.add(txtTotal);
        txtTotal.setBounds(100, 390, 90, 40);

        jLabel9.setForeground(java.awt.Color.lightGray);
        jLabel9.setText("CEP");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(100, 120, 30, 14);

        txtCep.setEditable(false);
        txtCep.setBackground(new java.awt.Color(18, 18, 20));
        txtCep.setForeground(new java.awt.Color(204, 204, 204));
        txtCep.setBorder(null);
        jPanel1.add(txtCep);
        txtCep.setBounds(100, 140, 90, 30);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundocliente1.png"))); // NOI18N
        jLabel31.setText("jLabel30");
        jPanel1.add(jLabel31);
        jLabel31.setBounds(0, 0, 590, 440);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 70, 590, 440);

        planodefundolabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/planodefundoapp.png"))); // NOI18N
        planodefundolabel.setText("Fundo");
        getContentPane().add(planodefundolabel);
        planodefundolabel.setBounds(0, 0, 630, 520);

        setSize(new java.awt.Dimension(647, 560));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (validaConsulta()) {
            EntregaDao entregaDao = new EntregaDao();
            String consulta = txtConsulta.getText();
            Entrega entrega = entregaDao.consulta(consulta);
            if (entrega != null) {
                codigoEntrega = entrega.getCodigo();
                codigoPedido = entrega.getCodigoPedido();
                PedidoTemProdutoDao pedidoTemProdutoDao = new PedidoTemProdutoDao();
                List<PedidoTemProduto> pedidoTemProdutos = pedidoTemProdutoDao.consultaPedido(codigoPedido);

                ProdutoDao produtoDao = new ProdutoDao();

                for (int i = 0; i < pedidoTemProdutos.size(); i++) {
                    String produto = produtoDao.consulta(String.valueOf(pedidoTemProdutos.get(i).getCodigoProduto())).getNome();
                    pedidoTemProdutos.get(i).setProduto(produto);
                }

                tableModel.limpaTabela();
                tableModel.adicionaVariasLinhas(pedidoTemProdutos);

                setTxtValorTotal(tableModel.getValorTotal());

                PedidoDao pedidoDao = new PedidoDao();
                
                ClienteDao clienteDao = new ClienteDao();
                Pedido pedido = pedidoDao.consulta(String.valueOf(codigoPedido));
                Cliente cliente = clienteDao.consultaCodigo(pedido.getCodigoCliente());

                txtNome.setText(cliente.getNome());
                txtTelefone.setText(pedido.getTelefone());
                txtEndereco.setText(pedido.getLogradouro());
                txtNumero.setText(String.valueOf(pedido.getNumero()));
                txtCep.setText(pedido.getTelefone());
                txtBairro.setText(pedido.getTelefone());
                txtCidade.setText(pedido.getTelefone());

                btnEnviar.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "Erro: Entrega não encontrado");
                txtConsulta.requestFocus();
            }
            entregaDao.desconectar();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        EntregaDao entregaDao = new EntregaDao();
        PedidoDao pedidoDao = new PedidoDao();
        System.out.println(codigoEntrega);
        if (entregaDao.updade(codigoEntrega,"Enviado") == 1) {
            if (pedidoDao.updade(codigoPedido, "Concluido") == 1) {
                JOptionPane.showMessageDialog(null, "Entrega enviada");
                
                TelaRelEntrega tela = new TelaRelEntrega();
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao enviar a entrega");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao enviar a entrega");
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private boolean validaConsulta() {
        if (txtConsulta.getText().length() > 0) {
            return true;
        }
        JOptionPane.showMessageDialog(null, "Erro: Codigo invalido");
        txtConsulta.requestFocus();
        return false;
    }
    
    private void setTxtValorTotal(double valor) {
        txtTotal.setText(String.valueOf(valor).replace(".", ","));
        valorTotal = valor;
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
            java.util.logging.Logger.getLogger(TelaEnvEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEnvEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEnvEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEnvEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEnvEntrega().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel planodefundolabel;
    private javax.swing.JTable tablePedido;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtConsulta;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
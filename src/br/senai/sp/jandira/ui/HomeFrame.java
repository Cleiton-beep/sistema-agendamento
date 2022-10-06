package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import javax.swing.JTable;

public class HomeFrame extends javax.swing.JFrame {

    public HomeFrame() {
        System.out.println("Criando a tela Home...");
        initComponents();
        PlanoDeSaudeDAO.criarPlanosDeSaudeTeste();
        criarTabelaPlanosDeSaude();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelPlanosDeSaude = new javax.swing.JPanel();
        scrollTablePlanosDeSaude = new javax.swing.JScrollPane();
        tablePlanosDeSaude = new javax.swing.JTable();
        buttonEditarPlanoDeSaude = new javax.swing.JButton();
        buttonAdicionarPlanoDeSaude = new javax.swing.JButton();
        buttonExcluirPlanoDeSaude = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        buttonAgenda = new javax.swing.JButton();
        buttonPacientes = new javax.swing.JButton();
        buttonMedicos = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        buttonPlanoSaude = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 204, 102));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("Sistema para Agendamento de Consultas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 30, 470, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/calendar.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 10, 70, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 810, 100);

        panelPlanosDeSaude.setBackground(new java.awt.Color(102, 102, 102));
        panelPlanosDeSaude.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Planos de saúde:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bauhaus 93", 1, 18), new java.awt.Color(255, 204, 0))); // NOI18N
        panelPlanosDeSaude.setLayout(null);

        tablePlanosDeSaude.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollTablePlanosDeSaude.setViewportView(tablePlanosDeSaude);

        panelPlanosDeSaude.add(scrollTablePlanosDeSaude);
        scrollTablePlanosDeSaude.setBounds(20, 30, 760, 280);

        buttonEditarPlanoDeSaude.setBackground(new java.awt.Color(255, 204, 0));
        buttonEditarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit.png"))); // NOI18N
        buttonEditarPlanoDeSaude.setToolTipText("Editar plano de saúde selecionado");
        buttonEditarPlanoDeSaude.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, new java.awt.Color(0, 0, 0), java.awt.Color.black, java.awt.Color.black));
        buttonEditarPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarPlanoDeSaudeActionPerformed(evt);
            }
        });
        panelPlanosDeSaude.add(buttonEditarPlanoDeSaude);
        buttonEditarPlanoDeSaude.setBounds(610, 340, 70, 50);

        buttonAdicionarPlanoDeSaude.setBackground(new java.awt.Color(255, 204, 0));
        buttonAdicionarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        buttonAdicionarPlanoDeSaude.setToolTipText("Adicionar");
        buttonAdicionarPlanoDeSaude.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, new java.awt.Color(0, 0, 0), java.awt.Color.black, java.awt.Color.black));
        buttonAdicionarPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarPlanoDeSaudeActionPerformed(evt);
            }
        });
        panelPlanosDeSaude.add(buttonAdicionarPlanoDeSaude);
        buttonAdicionarPlanoDeSaude.setBounds(700, 340, 70, 50);

        buttonExcluirPlanoDeSaude.setBackground(new java.awt.Color(255, 204, 0));
        buttonExcluirPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/trash-bin.png"))); // NOI18N
        buttonExcluirPlanoDeSaude.setToolTipText("Excluir plano de saúde selecionado");
        buttonExcluirPlanoDeSaude.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, new java.awt.Color(0, 0, 0), java.awt.Color.black, java.awt.Color.black));
        panelPlanosDeSaude.add(buttonExcluirPlanoDeSaude);
        buttonExcluirPlanoDeSaude.setBounds(520, 340, 70, 50);

        getContentPane().add(panelPlanosDeSaude);
        panelPlanosDeSaude.setBounds(0, 200, 810, 410);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(null);

        buttonAgenda.setBackground(new java.awt.Color(255, 204, 0));
        buttonAgenda.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 12)); // NOI18N
        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agenda.png"))); // NOI18N
        buttonAgenda.setToolTipText("Agenda");
        buttonAgenda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        buttonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgendaActionPerformed(evt);
            }
        });
        jPanel3.add(buttonAgenda);
        buttonAgenda.setBounds(6, 23, 80, 50);

        buttonPacientes.setBackground(new java.awt.Color(255, 204, 0));
        buttonPacientes.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 12)); // NOI18N
        buttonPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/sick.png"))); // NOI18N
        buttonPacientes.setToolTipText("Pacientes");
        buttonPacientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        buttonPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacientesActionPerformed(evt);
            }
        });
        jPanel3.add(buttonPacientes);
        buttonPacientes.setBounds(96, 23, 80, 50);

        buttonMedicos.setBackground(new java.awt.Color(255, 204, 0));
        buttonMedicos.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 12)); // NOI18N
        buttonMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/doctor.png"))); // NOI18N
        buttonMedicos.setToolTipText("Médicos");
        buttonMedicos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        buttonMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicosActionPerformed(evt);
            }
        });
        jPanel3.add(buttonMedicos);
        buttonMedicos.setBounds(186, 23, 80, 50);

        buttonEspecialidades.setBackground(new java.awt.Color(255, 204, 0));
        buttonEspecialidades.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 12)); // NOI18N
        buttonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/list.png"))); // NOI18N
        buttonEspecialidades.setToolTipText("Especialidades");
        buttonEspecialidades.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        buttonEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesActionPerformed(evt);
            }
        });
        jPanel3.add(buttonEspecialidades);
        buttonEspecialidades.setBounds(276, 23, 80, 50);

        buttonPlanoSaude.setBackground(new java.awt.Color(255, 102, 0));
        buttonPlanoSaude.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 12)); // NOI18N
        buttonPlanoSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/blood-donor-card.png"))); // NOI18N
        buttonPlanoSaude.setToolTipText("Planos de saúde");
        buttonPlanoSaude.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        buttonPlanoSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanoSaudeActionPerformed(evt);
            }
        });
        jPanel3.add(buttonPlanoSaude);
        buttonPlanoSaude.setBounds(366, 23, 80, 50);

        buttonSair.setBackground(new java.awt.Color(255, 204, 0));
        buttonSair.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 12)); // NOI18N
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/exit_1.png"))); // NOI18N
        buttonSair.setToolTipText("Sair");
        buttonSair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        jPanel3.add(buttonSair);
        buttonSair.setBounds(706, 23, 80, 50);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 100, 810, 100);

        setBounds(0, 0, 826, 648);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAgendaActionPerformed

    private void buttonPlanoSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanoSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPlanoSaudeActionPerformed

    private void buttonMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonMedicosActionPerformed

    private void buttonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEspecialidadesActionPerformed

    private void buttonPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPacientesActionPerformed

    private void buttonAdicionarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarPlanoDeSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAdicionarPlanoDeSaudeActionPerformed

    private void buttonEditarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarPlanoDeSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEditarPlanoDeSaudeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarPlanoDeSaude;
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonEditarPlanoDeSaude;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonExcluirPlanoDeSaude;
    private javax.swing.JButton buttonMedicos;
    private javax.swing.JButton buttonPacientes;
    private javax.swing.JButton buttonPlanoSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panelPlanosDeSaude;
    private javax.swing.JScrollPane scrollTablePlanosDeSaude;
    private javax.swing.JTable tablePlanosDeSaude;
    // End of variables declaration//GEN-END:variables

    private void criarTabelaPlanosDeSaude() {
        
        tablePlanosDeSaude.setModel(PlanoDeSaudeDAO.getTableModel());
        
        //Desaticar o dimensionamneto da JTable
        
        tablePlanosDeSaude.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        //Definir a largura de cada coluna
        
        tablePlanosDeSaude.getColumnModel().getColumn(0).setPreferredWidth(100);
        tablePlanosDeSaude.getColumnModel().getColumn(1).setPreferredWidth(300);
        tablePlanosDeSaude.getColumnModel().getColumn(2).setPreferredWidth(300);
        
        // Impedir a movimentação das colunas
        
        tablePlanosDeSaude.getTableHeader().setReorderingAllowed(false);
        
        //Impedir a edição das linhas/linhas
        
        tablePlanosDeSaude.setDefaultEditor(Object.class, null);
    }
}

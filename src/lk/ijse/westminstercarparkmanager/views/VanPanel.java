/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.westminstercarparkmanager.views;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.westminstercarparkmanager.controller.PaymentController;
import lk.ijse.westminstercarparkmanager.controller.VanController;
import lk.ijse.westminstercarparkmanager.dto.DateTimeDTO;
import lk.ijse.westminstercarparkmanager.dto.PaymentDTO;
import lk.ijse.westminstercarparkmanager.dto.VanDTO;

/**
 *
 * @author user
 */
public class VanPanel extends javax.swing.JPanel {
    private double cost;
    private long hour;
    private double price;
    private String date;
    private String entryTime;
    private String exitTime;
    private static int availableVehicle;
    /**
     * Creates new form VanPanel
     */
    public VanPanel() {
        initComponents();
    }

    VanPanel(String date, String entryTime) {
        initComponents();
        loadAllVan();
        this.date=date;
        System.out.println("van date : "+this.date);
        this.entryTime=entryTime;
        
    }

    VanPanel(String availableVehicle) {
        this.availableVehicle=Integer.parseInt(availableVehicle);
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
        txtPlateIdVan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtVehicleBrand = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCargoVolume = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtParkTime = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVan = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtVehicleType = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Plate Id :");

        txtPlateIdVan.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtPlateIdVan.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Vehicle Brand :");

        txtVehicleBrand.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtVehicleBrand.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cargo Volume :");

        txtCargoVolume.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtCargoVolume.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Park Time :");

        txtParkTime.setEditable(false);

        tableVan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plate Id", "Vehicle Brand", "Vehicle Type", "Cargo Volume", "Date", "Entry Time", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableVan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableVanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableVan);

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 0, 0));
        btnAdd.setText("Add ");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 0, 0));
        btnDelete.setText("Remove ");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Vehicle Type :");

        txtVehicleType.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtVehicleType.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("                                                 Van Form");

        jSeparator1.setForeground(new java.awt.Color(51, 0, 102));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/westminstercarparkmanager/assets/addBtn.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/westminstercarparkmanager/assets/Form.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/westminstercarparkmanager/assets/Remove.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPlateIdVan, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtVehicleBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCargoVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtVehicleType, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtParkTime, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelete)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPlateIdVan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdd)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtVehicleType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVehicleBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtParkTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCargoVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
            String plateId=txtPlateIdVan.getText();
            String Brand=txtVehicleBrand.getText();
            String Type=txtParkTime.getText();
            double cargvolume=Double.parseDouble(txtCargoVolume.getText());
            
            VanDTO vanDTO=new VanDTO();
            
            DateTimeDTO dateTimeDTO = new DateTimeDTO();
            dateTimeDTO.setDate(this.date);
            dateTimeDTO.setEntryTime(this.entryTime);
            vanDTO.setDateTime(dateTimeDTO);
            
            vanDTO.setIdPlate(plateId);
            vanDTO.setVehicleBrand(Brand);
            vanDTO.setVehicleType(Type);
            vanDTO.setCargoVolume(cargvolume);
            vanDTO.setStatus("AVAILABLE");
            
            if(this.availableVehicle<20){
            
                try {
                    boolean isAdded=VanController.saveVan(vanDTO);
                    if(isAdded){
                        MianForm.countAllVehicle();
                        loadAllVan();
                        JOptionPane.showMessageDialog(this, "van park successfully");
                    }   } catch (Exception ex) {
                    Logger.getLogger(VanPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
           }else{
                JOptionPane.showMessageDialog(this, "vehicle park full");
            }
        
        
            
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void tableVanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableVanMouseClicked
        DefaultTableModel dtm = (DefaultTableModel) tableVan.getModel();
        txtPlateIdVan.setText("" + dtm.getValueAt(tableVan.getSelectedRow(), 0));
        txtVehicleBrand.setText("" + dtm.getValueAt(tableVan.getSelectedRow(), 1));
        txtVehicleType.setText("" + dtm.getValueAt(tableVan.getSelectedRow(), 2));
        txtCargoVolume.setText("" + dtm.getValueAt(tableVan.getSelectedRow(), 3));
        txtParkTime.setText("" + dtm.getValueAt(tableVan.getSelectedRow(), 5));
        
    }//GEN-LAST:event_tableVanMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            String startTime=txtParkTime.getText();
            System.out.println("Time: "+startTime);
            String exitTime=this.entryTime;
            System.out.println("park Tilme : "+exitTime);
            
            SimpleDateFormat format = new SimpleDateFormat("HH:mm");
            
            Date d1 = null;
            Date d2 = null;
            
            d1 = format.parse(startTime);
            d2 = format.parse(exitTime);
            
            
            long diff = d2.getTime() - d1.getTime();
            
            long diffSeconds = diff / 1000 % 60;
            long diffMinutes = diff / (60 * 1000) % 60;
            long diffHours = diff / (60 * 60 * 1000) % 24;
            //long diffDays = diff / (24 * 60 * 60 * 1000);
            
            //System.out.print(diffDays + " days, ");
            //System.out.print(diffHours + " hours, ");
            System.out.print(diffMinutes + " minutes, ");
            System.out.print(diffSeconds + " seconds.");
            
            //if(diffMinutes>30){
            //diffHours+=1;
            this.hour=diffHours;
            
            //}
            if(hour<=3){
                cost=hour*3;
             }else if(hour>3&&hour<24){
                cost=(hour-3)*1;
                cost+=9;
             }else{
                cost=30;
             }
            
            setPayment();
        } catch (ParseException ex) {
            Logger.getLogger(VanPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tableVan;
    private javax.swing.JTextField txtCargoVolume;
    private javax.swing.JTextField txtParkTime;
    private javax.swing.JTextField txtPlateIdVan;
    private javax.swing.JTextField txtVehicleBrand;
    private javax.swing.JTextField txtVehicleType;
    // End of variables declaration//GEN-END:variables

    private void loadAllVan() {
        try {
            DefaultTableModel dtm=(DefaultTableModel) tableVan.getModel();
            dtm.setRowCount(0);
            List<VanDTO>getAllCArs=VanController.showAllVans();
            if(getAllCArs!=null){
                
                for (VanDTO allvan : getAllCArs) {
                    Object[] rowDate={
                        allvan.getIdPlate(),
                        allvan.getVehicleBrand(),
                        allvan.getVehicleType(),
                        allvan.getCargoVolume(),
                        allvan.getDateTime().getDate(),
                        allvan.getDateTime().getEntryTime(),
                        allvan.getStatus()
                    };
                    dtm.addRow(rowDate);
                    
                    
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(VanPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setPayment() {
        try {
            PaymentDTO paymentDTO=new PaymentDTO();
            paymentDTO.setIdPlate(txtPlateIdVan.getText());
            paymentDTO.setVehicleType(txtVehicleType.getText());
            paymentDTO.setVehicleBrand(txtVehicleBrand.getText());
            paymentDTO.setDuration_of_Time(this.hour);
            paymentDTO.setPrice(this.cost);
            
            DateTimeDTO dateTimeDTO=new DateTimeDTO();
            dateTimeDTO.setDate(this.date);
            
            paymentDTO.setDateTime(dateTimeDTO);
            
            boolean isRemove=PaymentController.saveVanPayment(paymentDTO);
            if(isRemove){
                loadAllVan();
                MianForm.countAllVehicle();
                JOptionPane.showMessageDialog(this, "vehicle Remove successfully");
            }
        } catch (Exception ex) {
            Logger.getLogger(VanPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
    }
}

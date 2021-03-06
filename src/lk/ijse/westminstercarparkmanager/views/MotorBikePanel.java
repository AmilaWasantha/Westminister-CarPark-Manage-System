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
import lk.ijse.westminstercarparkmanager.controller.MotorBikeController;
import lk.ijse.westminstercarparkmanager.controller.PaymentController;
import lk.ijse.westminstercarparkmanager.dto.DateTimeDTO;
import lk.ijse.westminstercarparkmanager.dto.MotorBikeDTO;
import lk.ijse.westminstercarparkmanager.dto.PaymentDTO;

/**
 *
 * @author user
 */
public class MotorBikePanel extends javax.swing.JPanel {
    private long hour;
    private double price;
    private String date;
    private String entryTime;
    private String exitTime;
    private double cost;
    private static int availableVehicles;

    /**
     * Creates new form MotorBikePanel
     */
    public MotorBikePanel() {
        initComponents();
    }

    MotorBikePanel(String date, String entryTime) {
        initComponents();
        loadAllBiks();
        this.date=date;
        System.out.println("car date : "+this.date);
        this.entryTime=entryTime;
        
   }

    MotorBikePanel(String availableVehicle) {
        this.availableVehicles=Integer.parseInt(availableVehicle);
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
        txtPlateId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtVehicleBrand = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEngineCapacity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtVehicleType = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMotorBike = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnRemoveVehicle = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtParkTime = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Plate Id :");

        txtPlateId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtPlateId.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Vehicle Brand :");

        txtVehicleBrand.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtVehicleBrand.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Engine Capacity :");

        txtEngineCapacity.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtEngineCapacity.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Park Time :");

        txtVehicleType.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtVehicleType.setForeground(new java.awt.Color(0, 0, 0));

        tableMotorBike.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plate Id", "Vehicle Brand", "Vehicle Type", "Engine Capacity", "Date", "EntryTime", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMotorBike.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMotorBikeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMotorBike);

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAdd.setText("Add ");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemoveVehicle.setBackground(new java.awt.Color(255, 255, 255));
        btnRemoveVehicle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRemoveVehicle.setText("Remove ");
        btnRemoveVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveVehicleActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Vehicle Type :");

        txtParkTime.setEditable(false);
        txtParkTime.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtParkTime.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setBackground(new java.awt.Color(153, 153, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("                                                             MotorBike Form");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 153));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/westminstercarparkmanager/assets/Form.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/westminstercarparkmanager/assets/Remove.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/westminstercarparkmanager/assets/addBtn.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRemoveVehicle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtVehicleBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEngineCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(txtPlateId, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtParkTime, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVehicleType, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPlateId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd)
                            .addComponent(txtVehicleType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVehicleBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtParkTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemoveVehicle))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEngineCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
            String plateId=txtPlateId.getText();
            String brand=txtVehicleBrand.getText();
            String type=txtVehicleType.getText();
            
            

            String enginCapacity=txtEngineCapacity.getText();
            
            
            MotorBikeDTO motorBikeDTO=new MotorBikeDTO();
            
            DateTimeDTO dateTimeDTO = new DateTimeDTO();
            dateTimeDTO.setDate(this.date);
            dateTimeDTO.setEntryTime(this.entryTime);
            motorBikeDTO.setDateTime(dateTimeDTO);
            
            motorBikeDTO.setIdPlate(plateId);
            motorBikeDTO.setVehicleBrand(brand);
            motorBikeDTO.setVehicleType(type);
            motorBikeDTO.setEngineCapacity(enginCapacity);
            motorBikeDTO.setStatus("AVILABLE");
            
            
            if(availableVehicles<20){
                try {
                    boolean isAdded=MotorBikeController.saveMotorBike(motorBikeDTO);
                    if(isAdded){
                        MianForm.countAllVehicle();
                        loadAllBiks();
                        JOptionPane.showMessageDialog(null, "MotorBike save successfully");   
                    }
                } catch (Exception ex) {
                    Logger.getLogger(MotorBikePanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(this, "vehicle Is Full");
            }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void tableMotorBikeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMotorBikeMouseClicked
        DefaultTableModel dtm = (DefaultTableModel) tableMotorBike.getModel();
        txtPlateId.setText("" + dtm.getValueAt(tableMotorBike.getSelectedRow(), 0));
        txtVehicleBrand.setText("" + dtm.getValueAt(tableMotorBike.getSelectedRow(), 1));
        txtVehicleType.setText("" + dtm.getValueAt(tableMotorBike.getSelectedRow(), 2));
        txtEngineCapacity.setText("" + dtm.getValueAt(tableMotorBike.getSelectedRow(), 3));
        txtParkTime.setText(""+dtm.getValueAt(tableMotorBike.getSelectedRow(),5));
    }//GEN-LAST:event_tableMotorBikeMouseClicked

    private void btnRemoveVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveVehicleActionPerformed
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
            
            System.out.print(diffMinutes + " minutes, ");
            System.out.print(diffSeconds + " seconds.");
            
            
            this.hour=diffHours;
            
            
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
            Logger.getLogger(MotorBikePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }//GEN-LAST:event_btnRemoveVehicleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRemoveVehicle;
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
    private javax.swing.JTable tableMotorBike;
    private javax.swing.JTextField txtEngineCapacity;
    private javax.swing.JTextField txtParkTime;
    private javax.swing.JTextField txtPlateId;
    private javax.swing.JTextField txtVehicleBrand;
    private javax.swing.JTextField txtVehicleType;
    // End of variables declaration//GEN-END:variables

    private void loadAllBiks() {
        try {
            DefaultTableModel dtm=(DefaultTableModel) tableMotorBike.getModel();
            dtm.setRowCount(0);
            List<MotorBikeDTO>getAllMotorBikes=MotorBikeController.showAllMotorBike();
            if(getAllMotorBikes!=null){
                
                for (MotorBikeDTO motorBikeDTO : getAllMotorBikes) {
                    Object[] rowDate={
                        motorBikeDTO.getIdPlate(),
                        motorBikeDTO.getVehicleBrand(),
                        motorBikeDTO.getVehicleType(),
                        motorBikeDTO.getEngineCapacity(),
                       
                        motorBikeDTO.getDateTime().getDate(),
                        motorBikeDTO.getDateTime().getEntryTime(),
                        motorBikeDTO.getStatus()
                    };
                    dtm.addRow(rowDate);
                    
                    
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(MotorBikePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setPayment() {
        try {
            PaymentDTO paymentDTO=new PaymentDTO();
            paymentDTO.setIdPlate(txtPlateId.getText());
            paymentDTO.setVehicleType(txtVehicleType.getText());
            paymentDTO.setVehicleBrand(txtVehicleBrand.getText());
            paymentDTO.setDuration_of_Time(this.hour);
            paymentDTO.setPrice(this.cost);
            
            DateTimeDTO dateTimeDTO=new DateTimeDTO();
            dateTimeDTO.setDate(this.date);
            
            paymentDTO.setDateTime(dateTimeDTO);
            
            boolean isPaymentAdded=PaymentController.saveMotorBikePayment(paymentDTO);
            if(isPaymentAdded){
                loadAllBiks();
                MianForm.countAllVehicle();
                JOptionPane.showMessageDialog(this, "Vehicle Remove Successfully");
            }
        } catch (Exception ex) {
            Logger.getLogger(MotorBikePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

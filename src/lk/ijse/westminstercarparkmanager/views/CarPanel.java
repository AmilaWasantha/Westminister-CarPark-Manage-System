/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.westminstercarparkmanager.views;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.westminstercarparkmanager.controller.CarController;
import lk.ijse.westminstercarparkmanager.controller.PaymentController;
import lk.ijse.westminstercarparkmanager.dto.CarDTO;
import lk.ijse.westminstercarparkmanager.dto.DateTimeDTO;
import lk.ijse.westminstercarparkmanager.dto.PaymentDTO;
import sun.applet.Main;

/**
 *
 * @author user
 */
public class CarPanel extends javax.swing.JPanel {
    
    private double price;
    private double cost;
    
   private long  hour;
   private long hours;
    String date="";
    String entryTime="";
    String exitTime="";
    static int avilableVehicle;
    /**
     * Creates new form Car
     */
    public CarPanel() {
        initComponents();
        
        
        //loadAllCars();
        
    }

    public CarPanel(String date, String entryTime) {
        initComponents();
        loadAllCars();
        this.date=date;
        System.out.println("Date "+date);
        this.entryTime=entryTime;
        
        
    }

    CarPanel(String availabelVehicle) {
       this.avilableVehicle=Integer.parseInt(availabelVehicle);
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
        txtNoOfDoor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtVehicleType = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtColour = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCars = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btncalculate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtParkTime = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

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
        jLabel3.setText("No of Door");

        txtNoOfDoor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNoOfDoor.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Vehicle Type :");

        txtVehicleType.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Colour : ");

        txtColour.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtColour.setForeground(new java.awt.Color(0, 0, 0));

        tableCars.setBackground(new java.awt.Color(51, 255, 255));
        tableCars.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tableCars.setForeground(new java.awt.Color(0, 0, 0));
        tableCars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plate Id", "Vehicle Brand", "Vehicle Type", "Colour", "No Of Door", "Date", "Entry Time", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCars.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCarsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCars);

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 0, 0));
        btnAdd.setText("Add ");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btncalculate.setBackground(new java.awt.Color(255, 255, 255));
        btncalculate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btncalculate.setForeground(new java.awt.Color(0, 0, 0));
        btncalculate.setText("Remove ");
        btncalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalculateActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Park Tilme :");

        txtParkTime.setEditable(false);
        txtParkTime.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtParkTime.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("                                                 Car Form");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 102));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/westminstercarparkmanager/assets/Form.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/westminstercarparkmanager/assets/Remove.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/westminstercarparkmanager/assets/addBtn.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVehicleBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlateId, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNoOfDoor, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(134, 134, 134)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtParkTime, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtVehicleType, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(btncalculate))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtColour, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(403, 403, 403)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(1208, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(25, 25, 25)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPlateId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtColour, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdd)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVehicleBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVehicleType, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btncalculate)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNoOfDoor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtParkTime, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(377, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
            String plateId=txtPlateId.getText();
            String brand=txtVehicleBrand.getText();
            String colour=txtColour.getText();
            int door=Integer.parseInt(txtNoOfDoor.getText());
            String type=txtVehicleType.getText();
            
            
            CarDTO carDTO=new CarDTO();
            
            DateTimeDTO dateTimeDTO = new DateTimeDTO();
            dateTimeDTO.setDate(this.date);
            dateTimeDTO.setEntryTime(this.entryTime);
            dateTimeDTO.setExitTime(this.exitTime);
            carDTO.setDateTime(dateTimeDTO);
            
            
            carDTO.setCarColor(colour);
            carDTO.setNumDoors(door);
            carDTO.setIdPlate(plateId);
            carDTO.setVehicleBrand(brand);
            carDTO.setVehicleType(type);
            carDTO.setStatus("AVAILABLE");
            
            
            if(this.avilableVehicle < 20){
                try {
                    boolean isAdded=CarController.saveCar(carDTO);
                    if(isAdded){
                        
                        loadAllCars();
                        MianForm.countAllVehicle();
                        JOptionPane.showMessageDialog(this, "Vehicle Added");
                    }
                } catch (Exception ex) {
                    Logger.getLogger(CarPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Vehicle Is Full");
                    
                
            }
       
    }//GEN-LAST:event_btnAddActionPerformed

    private void tableCarsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCarsMouseClicked
        DefaultTableModel dtm = (DefaultTableModel) tableCars.getModel();
        txtPlateId.setText("" + dtm.getValueAt(tableCars.getSelectedRow(), 0));
        txtVehicleBrand.setText("" + dtm.getValueAt(tableCars.getSelectedRow(), 1));
        txtVehicleType.setText("" + dtm.getValueAt(tableCars.getSelectedRow(), 2));
        txtColour.setText("" + dtm.getValueAt(tableCars.getSelectedRow(), 3));
        txtNoOfDoor.setText("" + dtm.getValueAt(tableCars.getSelectedRow(), 4));
        txtParkTime.setText("" + dtm.getValueAt(tableCars.getSelectedRow(), 6));
        
    }//GEN-LAST:event_tableCarsMouseClicked

    private void btncalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalculateActionPerformed
        
        String startTime=txtParkTime.getText();
        System.out.println("Time: "+startTime);
        String exitTime=this.entryTime;
        System.out.println("park Tilme : "+exitTime);
        
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");

		Date d1 = null;
		Date d2 = null;
          try {
			d1 = format.parse(startTime);
			d2 = format.parse(exitTime);

			
			long diff = d2.getTime() - d1.getTime();

			long diffSeconds = diff / 1000 % 60;
			long diffMinutes = diff / (60 * 1000) % 60;
			long diffHours = diff / (60 * 60 * 1000) % 24;
			//long diffDays = diff / (24 * 60 * 60 * 1000);

			
			System.out.print(diffMinutes + " minutes, ");
			System.out.print(diffSeconds + " seconds.");
                        
                        //if(diffMinutes>30){
                            //diffHours+=1;
                             this.hour=diffHours;
                           
                       
                        System.out.println("hourfasdffdaffsafafs : "+this.hour);
                        
                        
                        if(hour<=3){
                            cost=hour*3;
                        }else if(hour>3&&hour<24){
                            cost=(hour-3)*1;
                            cost+=9;
                        }else{
                            cost=30;
                        }
                        
                        
                        
                        setPayment();
                        
               } catch (Exception e) {
			e.printStackTrace();
		}   
          
                
    }//GEN-LAST:event_btncalculateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btncalculate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTable tableCars;
    private javax.swing.JTextField txtColour;
    private javax.swing.JTextField txtNoOfDoor;
    private javax.swing.JTextField txtParkTime;
    private javax.swing.JTextField txtPlateId;
    private javax.swing.JTextField txtVehicleBrand;
    private javax.swing.JTextField txtVehicleType;
    // End of variables declaration//GEN-END:variables

   
    
    
    private void loadAllCars() {
        try {
            DefaultTableModel dtm=(DefaultTableModel) tableCars.getModel();
            dtm.setRowCount(0);
            List<CarDTO>getAllCArs=CarController.showAllCars();
            if(getAllCArs!=null){
                
                for (CarDTO allCAr : getAllCArs) {
                    Object[] rowDate={
                        allCAr.getIdPlate(),
                        allCAr.getVehicleBrand(),
                        allCAr.getVehicleType(),
                        allCAr.getCarColor(),
                        allCAr.getNumDoors(),
                        allCAr.getDateTime().getDate(),
                        allCAr.getDateTime().getEntryTime(),
                        allCAr.getStatus()
                    };
                    dtm.addRow(rowDate);
                    
                    
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(CarPanel.class.getName()).log(Level.SEVERE, null, ex);
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
            
            boolean isPaymentAdded=PaymentController.savePayment(paymentDTO);
            if(isPaymentAdded){
                loadAllCars();
                MianForm.countAllVehicle();
                JOptionPane.showMessageDialog(this, "Vehicle Remove successfully");
            }
        } catch (Exception ex) {
            Logger.getLogger(CarPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
}

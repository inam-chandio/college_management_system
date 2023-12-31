/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import DAO.StudentDao;
import DaoImp.StudentDAOImpl;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Department;
import model.Student;

public class StudentFrame extends javax.swing.JFrame {
      StudentDao stDAO = new StudentDAOImpl();
    String[] column = {"ID","Roll Number","Name","F.Name","Age","Email","M.Number","Department ID"};
    DefaultTableModel defaultTableModel = null;
    private Student student;
    public StudentFrame() {
        initComponents();
       fillStudentTable();
    }

  
private void fillStudentTable(){
           defaultTableModel = new DefaultTableModel(column,0);
      List<Student> list =  stDAO.getAllStud();
       
           for(Student s:list ){
            Object[] row = {s.getSt_id(),s.getSt_rollNumber(),s.getSt_name(),s.getSt_fatherName(),s.getSt_age(),s.getSt_email(),s.getSt_mobile_Number(),s.getDep_ID()};
               // Object[] row = {s.getDep_ID(),s.getDep_name(),s.getDep_code()};
            defaultTableModel.addRow(row);
            stTable.setModel(defaultTableModel);
        }

/*
private Student getStudent(){
    Student s = new Student();
    Integer id = s.getSt_id();
    String rollNumber=s.getSt_rollNumber();
    String name = s.getSt_name();
    String fName=s.getSt_fatherName();
    String email=s.getSt_email();
    Integer age=s.getSt_age();
    Integer mNumber=s.getSt_mobile_Number();
    Integer depID=s.getDep_ID();
    
    
    
   
    s.setSt_id(id);
   s.setSt_rollNumber(rollNumber);
    s.setSt_name(name);
    s.setSt_fatherName(fName);
    s.setSt_age(age);
    s.setSt_email(email);
    s.setSt_mobile_Number(mNumber);
    s.setDep_ID(depID);
          return s;
    
    */
    
            
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        stfname = new javax.swing.JLabel();
        rollNumbertxt = new javax.swing.JTextField();
        stname = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        strollno = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        stage = new javax.swing.JLabel();
        stmail = new javax.swing.JLabel();
        emailtxt = new javax.swing.JTextField();
        stno = new javax.swing.JLabel();
        depid = new javax.swing.JTextField();
        dpid = new javax.swing.JLabel();
        number = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        stTable = new javax.swing.JTable();
        stupdatebtn = new javax.swing.JButton();
        stClearbtn = new javax.swing.JButton();
        staddbtn = new javax.swing.JButton();
        stdelete1 = new javax.swing.JButton();
        txtage = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(33, 125, 194));

        jPanel2.setBackground(new java.awt.Color(26, 34, 56));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/back btn.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("ID");

        stfname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        stfname.setForeground(new java.awt.Color(26, 34, 56));
        stfname.setText("F.Name");

        rollNumbertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollNumbertxtActionPerformed(evt);
            }
        });

        stname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        stname.setForeground(new java.awt.Color(26, 34, 56));
        stname.setText("Name");

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });

        strollno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        strollno.setForeground(new java.awt.Color(26, 34, 56));
        strollno.setText("Roll No");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        stage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        stage.setText("Age");

        stmail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        stmail.setForeground(new java.awt.Color(26, 34, 56));
        stmail.setText("Email");

        emailtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtxtActionPerformed(evt);
            }
        });

        stno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        stno.setForeground(new java.awt.Color(26, 34, 56));
        stno.setText("M.Number");

        depid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depidActionPerformed(evt);
            }
        });

        dpid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dpid.setForeground(new java.awt.Color(26, 34, 56));
        dpid.setText("Dep.ID");

        number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberActionPerformed(evt);
            }
        });

        stTable.setBackground(new java.awt.Color(157, 170, 242));
        stTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        stTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "RollNumber", "Name", "F.Name", "Age", "Email", "M.Number", "Department ID"
            }
        ));
        stTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(stTable);

        stupdatebtn.setBackground(new java.awt.Color(244, 219, 125));
        stupdatebtn.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        stupdatebtn.setForeground(new java.awt.Color(26, 34, 56));
        stupdatebtn.setText("UPDATE");
        stupdatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stupdatebtnActionPerformed(evt);
            }
        });

        stClearbtn.setBackground(new java.awt.Color(244, 219, 125));
        stClearbtn.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        stClearbtn.setForeground(new java.awt.Color(26, 34, 56));
        stClearbtn.setText("CLEAR");
        stClearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stClearbtnActionPerformed(evt);
            }
        });

        staddbtn.setBackground(new java.awt.Color(244, 219, 125));
        staddbtn.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        staddbtn.setForeground(new java.awt.Color(26, 34, 56));
        staddbtn.setText("ADD");
        staddbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staddbtnActionPerformed(evt);
            }
        });

        stdelete1.setBackground(new java.awt.Color(244, 219, 125));
        stdelete1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        stdelete1.setForeground(new java.awt.Color(26, 34, 56));
        stdelete1.setText("DELETE");
        stdelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdelete1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(26, 34, 56));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dpid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(depid))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(stname)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(staddbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(83, 83, 83)
                                        .addComponent(stupdatebtn)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(stdelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(97, 97, 97)
                                        .addComponent(stClearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(stmail)
                                        .addGap(186, 186, 186))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(strollno)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rollNumbertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(241, 241, 241)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(stno)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(stfname)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addGap(259, 259, 259))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id)
                            .addComponent(stname)
                            .addComponent(txtname)
                            .addComponent(strollno)
                            .addComponent(rollNumbertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stage)
                            .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stfname)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stmail)
                            .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stno)
                    .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depid, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dpid))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staddbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stupdatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stdelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stClearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 238, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rollNumbertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollNumbertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rollNumbertxtActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void emailtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtxtActionPerformed

    private void numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberActionPerformed

    private void stupdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stupdatebtnActionPerformed
       // int id = Integer.parseInt(stid4.getText());
       
        int sid = Integer.parseInt(id.getText());
          String s_name = txtname.getText();
          String s_rollNumber=rollNumbertxt.getText();
           int sage = Integer.parseInt((String) txtage.getValue());
         
          String faname = fname.getText();
          String semail=emailtxt.getText();
           int sdeptID = Integer.parseInt(depid.getText());
           int snumber = Integer.parseInt(number.getText()); 
           
           
       //  int courseMarks=Integer.parseInt(txtcrsmark.getText());
            
             Student d = new Student();
             d.setSt_id(sid);
             d.setSt_name(s_name);
             d.setSt_rollNumber(s_rollNumber);
             d.setSt_age(sage);
             d.setSt_fatherName(faname);
             d.setSt_email(semail);
             d.setDep_ID(sdeptID);
             d.setSt_mobile_Number(snumber);
       stDAO.updateStudent(d);
        fillStudentTable();
        clearField();
      
    }//GEN-LAST:event_stupdatebtnActionPerformed

    private void stClearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stClearbtnActionPerformed
        // TODO add your handling code here:
        clearField();
    }//GEN-LAST:event_stClearbtnActionPerformed

    private void staddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staddbtnActionPerformed
         //int id=Integer.parseInt(id.getText());
         int st_id = Integer.parseInt(id.getText());
        String rollNumber=rollNumbertxt.getText();
        String name = txtname.getText();
        String fName=fname.getText();
        String email=emailtxt.getText();
        int age = (int)txtage.getValue();
       
        int mNumber=Integer.parseInt(number.getText());
        int depID=Integer.parseInt(depid.getText());
         
        
        Student student=new Student();
        student.setSt_id(st_id);
        student.setSt_rollNumber(rollNumber);
        student.setSt_fatherName(fName);

         student.setSt_email(email);
         student.setSt_age(age);
         student.setSt_mobile_Number(mNumber);
         student.setSt_name(name);
         student.setDep_ID(depID);
         
           stDAO.addStudent(student);
        fillStudentTable();
        clearField();
    }//GEN-LAST:event_staddbtnActionPerformed

    private void stdelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdelete1ActionPerformed
        // TODO add your handling code here:
        
         int s_id=Integer.parseInt(id.getText());
        Student s = new Student();
        s.setSt_id(s_id);
        stDAO.deleteStudent(s);
        fillStudentTable();
        clearField();
  
        
    }//GEN-LAST:event_stdelete1ActionPerformed

    private void stTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stTableMouseClicked
        // TODO add your handling code here:
         int index = stTable.getSelectedRow();
        TableModel model = stTable.getModel();
        
        String s_id = model.getValueAt(index, 0).toString();
        String rollNumber = model.getValueAt(index, 1).toString(); 
        String name=model.getValueAt(index, 2).toString();
        String fName=model.getValueAt(index, 3).toString();
        int age=(int) model.getValueAt(index, 4);
        String email=model.getValueAt(index, 5).toString();
        String mNumber=model.getValueAt(index, 6).toString();
        String DepID=model.getValueAt(index, 7).toString();
       // String code = model.getValueAt(index, 2).toString();
        
       id.setText(s_id);
       txtname.setText(name);
       rollNumbertxt.setText(rollNumber);
       fname.setText(fName);

       txtage.setValue(age);
       emailtxt.setText(email);
       number.setText(mNumber);
       depid.setText(DepID);
    }//GEN-LAST:event_stTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new HomeFrame().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void depidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depidActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
          

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentFrame().setVisible(true);
            }
        });
    }
      private void clearField(){
        id.setText("");
        txtname.setText("");
        rollNumbertxt.setText("");
        txtage.setValue(0);
        fname.setText("");
        emailtxt.setText("");
        depid.setText("");
        number.setText("");
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField depid;
    private javax.swing.JLabel dpid;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField number;
    private javax.swing.JTextField rollNumbertxt;
    private javax.swing.JButton stClearbtn;
    private javax.swing.JTable stTable;
    private javax.swing.JButton staddbtn;
    private javax.swing.JLabel stage;
    private javax.swing.JButton stdelete1;
    private javax.swing.JLabel stfname;
    private javax.swing.JLabel stmail;
    private javax.swing.JLabel stname;
    private javax.swing.JLabel stno;
    private javax.swing.JLabel strollno;
    private javax.swing.JButton stupdatebtn;
    private javax.swing.JSpinner txtage;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables

  
}

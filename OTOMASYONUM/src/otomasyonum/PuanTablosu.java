package otomasyonum;
import static otomasyonum.PuanTablosu.DB_URL;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.sql.*;
import java.sql.DriverManager;
import java.util.*;


/**
 *
 * @author Çağrı
 */
public class PuanTablosu extends javax.swing.JFrame {
 
    public PuanTablosu() {
        initComponents();
        TabloDoldur();
        
    }
        public PuanTablosu(String gelenV){
        initComponents();
    
    }
    static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
    static final String DOMAIN_NAME="localhost:3306";
    static final String DB_NAME="tablo?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";
    static final String DB_URL="jdbc:mysql://"+DOMAIN_NAME+"/"+DB_NAME;
    static final String USER="root";
    static final String PASS="Avci12345";
    static ResultSet res;
    Connection conn =null;
    Statement st = null;
    public Statement baglantiAc() throws Exception{
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
            return conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
    }
    public void baglantiKapat() throws Exception{
            conn.close();
    }

    
    private void TabloDoldur(){
    
        Connection conn =null;
        
        try{
        Class.forName("com.mysql.jdbc.Driver");
        conn=(Connection) DriverManager.getConnection(DB_URL,USER,PASS);
        String sql="select * from tablo.okullar";
        PreparedStatement pstmt=conn.prepareStatement(sql);
        ResultSet rs=pstmt.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        conn.close();
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        karne_not = new javax.swing.JTextField();
        tr_dogru = new javax.swing.JTextField();
        mt_dogru = new javax.swing.JTextField();
        sb_dogru = new javax.swing.JTextField();
        fen_dogru = new javax.swing.JTextField();
        buton_giris = new javax.swing.JButton();
        cikis = new javax.swing.JButton();
        tr_yanlis = new javax.swing.JTextField();
        mt_yanlis = new javax.swing.JTextField();
        sb_yanlis = new javax.swing.JTextField();
        fen_yanlis = new javax.swing.JTextField();
        tr_bos = new javax.swing.JTextField();
        mt_bos = new javax.swing.JTextField();
        sb_bos = new javax.swing.JTextField();
        fen_bos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        puansonucu = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        gelenVeri = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        okulsonuc = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jTextField6.setText("jTextField6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SINAV BİLGİLERİ");
        setBackground(new java.awt.Color(204, 255, 255));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 0, 153));
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("TÜRKÇE :");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("SOSYAL BİLGİLER  : ");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("MATEMATİK :");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("FEN BİLİMLERİ :");

        jLabel5.setBackground(new java.awt.Color(153, 153, 0));
        jLabel5.setForeground(new java.awt.Color(255, 0, 255));
        jLabel5.setText("KARNE NOT ORTALAMASI :");

        karne_not.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                karne_notActionPerformed(evt);
            }
        });

        tr_dogru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr_dogruActionPerformed(evt);
            }
        });

        mt_dogru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mt_dogruActionPerformed(evt);
            }
        });

        buton_giris.setBackground(new java.awt.Color(255, 0, 0));
        buton_giris.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buton_giris.setForeground(new java.awt.Color(255, 255, 0));
        buton_giris.setText("YERLEŞTİRMENİZİ GÖRMEK İÇİN TIKLAYINIZ");
        buton_giris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_girisActionPerformed(evt);
            }
        });

        cikis.setBackground(new java.awt.Color(255, 0, 51));
        cikis.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cikis.setText("ÇIKIŞ");
        cikis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cikisMouseClicked(evt);
            }
        });
        cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikisActionPerformed(evt);
            }
        });

        tr_yanlis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr_yanlisActionPerformed(evt);
            }
        });

        mt_yanlis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mt_yanlisActionPerformed(evt);
            }
        });

        sb_yanlis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sb_yanlisActionPerformed(evt);
            }
        });

        tr_bos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr_bosActionPerformed(evt);
            }
        });

        mt_bos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mt_bosActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("DOĞRU");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("YANLIŞ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("BOŞ");

        jTextField1.setBackground(new java.awt.Color(51, 51, 255));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 0));
        jTextField1.setText("                                 ....BAŞARILAR....");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        puansonucu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        puansonucu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel9.setBackground(new java.awt.Color(153, 51, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("           PUANINIZ:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("                 YERLEŞTİRİLDİĞİNİZ OKUL :");

        gelenVeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gelenVeriActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(255, 204, 204));
        jTable1.setForeground(new java.awt.Color(0, 102, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "OKUL ID", "OKUL PUANI", "OKUL  ADI "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jTable1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTable1İnputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        okulsonuc.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        okulsonuc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel11.setBackground(new java.awt.Color(255, 255, 102));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("                      TC : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE)
            .addComponent(cikis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(gelenVeri, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(karne_not, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(buton_giris, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(mt_dogru, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fen_dogru, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sb_dogru, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tr_dogru, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))))
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tr_yanlis, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addComponent(mt_yanlis)
                                .addComponent(fen_yanlis)
                                .addComponent(sb_yanlis)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(36, 36, 36)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sb_bos)
                                .addComponent(fen_bos)
                                .addComponent(mt_bos)
                                .addComponent(tr_bos, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(okulsonuc, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(437, 437, 437)
                        .addComponent(puansonucu, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tr_bos, tr_dogru, tr_yanlis});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(karne_not, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tr_dogru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tr_yanlis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mt_dogru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sb_dogru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sb_yanlis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sb_bos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fen_dogru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fen_yanlis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fen_bos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(mt_yanlis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mt_bos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(tr_bos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buton_giris, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gelenVeri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(puansonucu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(okulsonuc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel4, jLabel5});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {fen_dogru, mt_dogru, sb_dogru, tr_dogru});

        karne_not.getAccessibleContext().setAccessibleName("karnenot");
        tr_dogru.getAccessibleContext().setAccessibleName("trd");
        tr_dogru.getAccessibleContext().setAccessibleDescription("trd");
        mt_dogru.getAccessibleContext().setAccessibleName("matd");
        sb_dogru.getAccessibleContext().setAccessibleName("sosd");
        fen_dogru.getAccessibleContext().setAccessibleName("fend");
        buton_giris.getAccessibleContext().setAccessibleName("tik");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mt_dogruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mt_dogruActionPerformed
         
    }//GEN-LAST:event_mt_dogruActionPerformed

    private void tr_dogruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr_dogruActionPerformed
 
    }//GEN-LAST:event_tr_dogruActionPerformed

    private void tr_yanlisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr_yanlisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tr_yanlisActionPerformed

    private void mt_yanlisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mt_yanlisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mt_yanlisActionPerformed

    private void tr_bosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr_bosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tr_bosActionPerformed

    private void mt_bosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mt_bosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mt_bosActionPerformed

    private void buton_girisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_girisActionPerformed

        int a=Integer.parseInt(tr_dogru.getText());
        int b=Integer.parseInt(mt_dogru.getText());
        int c=Integer.parseInt(sb_dogru.getText());
        int d=Integer.parseInt(fen_dogru.getText());
        int sonuc=a+b+c+d;
        int q=Integer.parseInt(tr_yanlis.getText());
        int w=Integer.parseInt(mt_yanlis.getText());
        int e=Integer.parseInt(sb_yanlis.getText());
        int r=Integer.parseInt(fen_yanlis.getText());
        int sonuc1=q+w+e+r;
        int t=Integer.parseInt(tr_bos.getText());
        int y=Integer.parseInt(mt_bos.getText());
        int u=Integer.parseInt(sb_bos.getText());
        int ı=Integer.parseInt(fen_bos.getText());
        int sonuc3=t+y+u+ı;
        int z=Integer.parseInt(karne_not.getText());
        int sonuc4=z;
        int net=sonuc*4-sonuc1*1+sonuc4;
        Integer.toString(a);
        Integer.toString(b);
        Integer.toString(c);
        Integer.toString(d);
        Integer.toString(q);
        Integer.toString(w);
        Integer.toString(e);
        Integer.toString(r);
        Integer.toString(t);
        Integer.toString(y);
        Integer.toString(u);
        Integer.toString(ı);
        Integer.toString(z);
        puansonucu.setText(Integer.toString(net));
        //----------------------------------------------------------------------
        
        int puanı=Integer.parseInt(puansonucu.getText());
        
        if(puanı<150){
        okulsonuc.setText("ENDUSTRI MESLEK LISESI");
        }
        else if(puanı<200){
        okulsonuc.setText("MURAT TICARET LISESI");
        }
        else if(puanı<250){
        okulsonuc.setText("HIDIR SEVER ANADOLU LISESI");
        }
        else if(puanı<300){
        okulsonuc.setText("BALAKGAZI ANADOLU LISESI");
        }
        else if(puanı<350){
        okulsonuc.setText("MERKEZ ANADOLU LISESI");
        }
        else if(puanı<400){
        okulsonuc.setText("KOLOĞLU ANADOLU LISESI");
        }
        else if(puanı<450){
        okulsonuc.setText("ÇUBUKBEY ANADOLU LISESI");
        }
        else if(puanı<500){
        okulsonuc.setText("CEMIL MERIC FEN LISESI");
        }
        else{
        okulsonuc.setText("KARA KARAKAYA FEN LISESI");
        }
    }//GEN-LAST:event_buton_girisActionPerformed

    private void karne_notActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_karne_notActionPerformed

        

        
    }//GEN-LAST:event_karne_notActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void sb_yanlisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sb_yanlisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sb_yanlisActionPerformed

    private void gelenVeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gelenVeriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gelenVeriActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
            


    }//GEN-LAST:event_jTable1MousePressed

    private void jTable1İnputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTable1İnputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1İnputMethodTextChanged

    private void cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisActionPerformed
            

    }//GEN-LAST:event_cikisActionPerformed

    private void cikisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cikisMouseClicked

             setVisible(false); 





    }//GEN-LAST:event_cikisMouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
    gelenVeri.setText(GirisEkrani.tcNo);

    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(PuanTablosu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PuanTablosu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PuanTablosu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PuanTablosu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PuanTablosu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buton_giris;
    private javax.swing.JButton cikis;
    private javax.swing.JTextField fen_bos;
    private javax.swing.JTextField fen_dogru;
    private javax.swing.JTextField fen_yanlis;
    private javax.swing.JTextField gelenVeri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField karne_not;
    private javax.swing.JTextField mt_bos;
    private javax.swing.JTextField mt_dogru;
    private javax.swing.JTextField mt_yanlis;
    private javax.swing.JLabel okulsonuc;
    private javax.swing.JLabel puansonucu;
    private javax.swing.JTextField sb_bos;
    private javax.swing.JTextField sb_dogru;
    private javax.swing.JTextField sb_yanlis;
    private javax.swing.JTextField tr_bos;
    private javax.swing.JTextField tr_dogru;
    private javax.swing.JTextField tr_yanlis;
    // End of variables declaration//GEN-END:variables
}

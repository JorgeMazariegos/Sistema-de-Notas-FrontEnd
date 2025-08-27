package com.umg.sistema.de.notas;

import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;


public class app extends javax.swing.JFrame {

    //Variables globales
    int currentOpaqueLabel = 1;
    boolean showPassword = false;
        
    public app() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        login = new javax.swing.JPanel();
        pnlLogintab = new javax.swing.JPanel();
        lblLoginTopInfo = new javax.swing.JLabel();
        inSesion = new javax.swing.JPanel();
        lblLoginTitle = new javax.swing.JLabel();
        txtLoginEmail = new javax.swing.JTextField();
        passLoginPassword = new javax.swing.JPasswordField();
        btnLoginLog = new javax.swing.JButton();
        lblIconPassword = new javax.swing.JLabel();
        lblIconEmail = new javax.swing.JLabel();
        lblLoginEmailMessage = new javax.swing.JLabel();
        lblLoginMessagePassword = new javax.swing.JLabel();
        lblLoginShowHide = new javax.swing.JLabel();
        teacherDashboard = new javax.swing.JPanel();
        pnlTeacherTop = new javax.swing.JPanel();
        lblTeacherTopInfo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlTeacherInfo = new javax.swing.JPanel();
        lblTeacherShowDashboard = new javax.swing.JLabel();
        lblTeacherShowAttendance = new javax.swing.JLabel();
        lblTeacherShowAttendance1 = new javax.swing.JLabel();
        lblTeacherShowAttendance2 = new javax.swing.JLabel();
        lblTeacherShowAttendance3 = new javax.swing.JLabel();
        pnlTeacherContent = new javax.swing.JPanel();
        dashboard = new javax.swing.JPanel();
        lblDashboardTitleCursos = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnlDashboardCourse4 = new javax.swing.JPanel();
        lblDashboardCourse4 = new javax.swing.JLabel();
        pnlDashboardCourse5 = new javax.swing.JPanel();
        lblDashboardCourse5 = new javax.swing.JLabel();
        pnlDashboardCourse6 = new javax.swing.JPanel();
        lblDashboardCourse6 = new javax.swing.JLabel();
        pnlDashboardCourse1 = new javax.swing.JPanel();
        lblDashboardCourse1 = new javax.swing.JLabel();
        pnlDashboardCourse2 = new javax.swing.JPanel();
        lblDashboardCourse2 = new javax.swing.JLabel();
        pnlDashboardCourse3 = new javax.swing.JPanel();
        lblDashboardCourse3 = new javax.swing.JLabel();
        lblDashboardTitleHorario = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        pnlDashboardSchedule = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        attendance = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        grades = new javax.swing.JPanel();
        homework = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        mainPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        mainPanel.setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(53, 36, 97));
        login.setLayout(null);

        pnlLogintab.setBackground(new java.awt.Color(53, 36, 97));
        pnlLogintab.setPreferredSize(new java.awt.Dimension(800, 30));

        lblLoginTopInfo.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        lblLoginTopInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblLoginTopInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N
        lblLoginTopInfo.setText("Iniciar sesión");

        javax.swing.GroupLayout pnlLogintabLayout = new javax.swing.GroupLayout(pnlLogintab);
        pnlLogintab.setLayout(pnlLogintabLayout);
        pnlLogintabLayout.setHorizontalGroup(
            pnlLogintabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogintabLayout.createSequentialGroup()
                .addGap(342, 342, 342)
                .addComponent(lblLoginTopInfo)
                .addContainerGap(354, Short.MAX_VALUE))
        );
        pnlLogintabLayout.setVerticalGroup(
            pnlLogintabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLoginTopInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        login.add(pnlLogintab);
        pnlLogintab.setBounds(0, 0, 800, 30);

        inSesion.setBackground(new java.awt.Color(236, 231, 220));
        inSesion.setPreferredSize(new java.awt.Dimension(500, 600));

        lblLoginTitle.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        lblLoginTitle.setForeground(new java.awt.Color(55, 59, 62));
        lblLoginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginTitle.setText("Iniciar Sesión");

        txtLoginEmail.setBackground(new java.awt.Color(252, 255, 252));
        txtLoginEmail.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        txtLoginEmail.setForeground(new java.awt.Color(102, 102, 102));
        txtLoginEmail.setText("Correo");
        txtLoginEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(53, 36, 97)));
        txtLoginEmail.setCaretColor(new java.awt.Color(53, 36, 97));
        txtLoginEmail.setSelectionColor(new java.awt.Color(19, 122, 127));
        txtLoginEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLoginEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLoginEmailFocusLost(evt);
            }
        });

        passLoginPassword.setBackground(new java.awt.Color(252, 255, 252));
        passLoginPassword.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        passLoginPassword.setForeground(new java.awt.Color(102, 102, 102));
        passLoginPassword.setText("Contraseña");
        passLoginPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(53, 36, 97)));
        passLoginPassword.setCaretColor(new java.awt.Color(53, 36, 97));
        passLoginPassword.setEchoChar('\u0000');
        passLoginPassword.setSelectionColor(new java.awt.Color(19, 122, 127));
        passLoginPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passLoginPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passLoginPasswordFocusLost(evt);
            }
        });

        btnLoginLog.setBackground(new java.awt.Color(53, 36, 97));
        btnLoginLog.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnLoginLog.setForeground(new java.awt.Color(255, 255, 255));
        btnLoginLog.setText("Iniciar Sesión");
        btnLoginLog.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(55, 59, 62), 1, true));
        btnLoginLog.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLoginLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginLogActionPerformed(evt);
            }
        });

        lblIconPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lock.png"))); // NOI18N

        lblIconEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/email.png"))); // NOI18N

        lblLoginEmailMessage.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        lblLoginEmailMessage.setForeground(new java.awt.Color(255, 51, 51));

        lblLoginMessagePassword.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        lblLoginMessagePassword.setForeground(new java.awt.Color(255, 51, 51));
        lblLoginMessagePassword.setPreferredSize(new java.awt.Dimension(200, 15));

        lblLoginShowHide.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        lblLoginShowHide.setForeground(new java.awt.Color(53, 36, 97));
        lblLoginShowHide.setText("Mostrar");
        lblLoginShowHide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLoginShowHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginShowHideMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout inSesionLayout = new javax.swing.GroupLayout(inSesion);
        inSesion.setLayout(inSesionLayout);
        inSesionLayout.setHorizontalGroup(
            inSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inSesionLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(inSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIconPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIconEmail, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblLoginMessagePassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLoginLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passLoginPassword)
                    .addComponent(txtLoginEmail)
                    .addComponent(lblLoginEmailMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLoginShowHide)
                .addContainerGap(85, Short.MAX_VALUE))
            .addComponent(lblLoginTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        inSesionLayout.setVerticalGroup(
            inSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inSesionLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(lblLoginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLoginEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIconEmail))
                .addGap(3, 3, 3)
                .addComponent(lblLoginEmailMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(inSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(passLoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblLoginShowHide))
                    .addComponent(lblIconPassword))
                .addGap(4, 4, 4)
                .addComponent(lblLoginMessagePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLoginLog, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        login.add(inSesion);
        inSesion.setBounds(300, -10, 500, 600);

        mainPanel.add(login, "login");

        teacherDashboard.setLayout(null);

        pnlTeacherTop.setBackground(new java.awt.Color(53, 36, 97));
        pnlTeacherTop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlTeacherTop.setForeground(new java.awt.Color(255, 255, 255));

        lblTeacherTopInfo.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblTeacherTopInfo.setForeground(new java.awt.Color(236, 231, 220));
        lblTeacherTopInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard.png"))); // NOI18N
        lblTeacherTopInfo.setText("Dashboard");
        lblTeacherTopInfo.setMaximumSize(new java.awt.Dimension(93, 30));
        lblTeacherTopInfo.setMinimumSize(new java.awt.Dimension(93, 30));
        lblTeacherTopInfo.setPreferredSize(new java.awt.Dimension(93, 30));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Profesor");

        javax.swing.GroupLayout pnlTeacherTopLayout = new javax.swing.GroupLayout(pnlTeacherTop);
        pnlTeacherTop.setLayout(pnlTeacherTopLayout);
        pnlTeacherTopLayout.setHorizontalGroup(
            pnlTeacherTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTeacherTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255)
                .addComponent(lblTeacherTopInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(313, Short.MAX_VALUE))
        );
        pnlTeacherTopLayout.setVerticalGroup(
            pnlTeacherTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTeacherTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblTeacherTopInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        teacherDashboard.add(pnlTeacherTop);
        pnlTeacherTop.setBounds(0, 0, 800, 30);

        pnlTeacherInfo.setBackground(new java.awt.Color(53, 36, 97));

        lblTeacherShowDashboard.setBackground(new java.awt.Color(35, 151, 155));
        lblTeacherShowDashboard.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblTeacherShowDashboard.setForeground(new java.awt.Color(252, 255, 252));
        lblTeacherShowDashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTeacherShowDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconTeacherDashboard.png"))); // NOI18N
        lblTeacherShowDashboard.setText("Dashboard");
        lblTeacherShowDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTeacherShowDashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTeacherShowDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTeacherShowDashboardMouseExited(evt);
            }
        });

        lblTeacherShowAttendance.setBackground(new java.awt.Color(35, 151, 155));
        lblTeacherShowAttendance.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblTeacherShowAttendance.setForeground(new java.awt.Color(252, 255, 252));
        lblTeacherShowAttendance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTeacherShowAttendance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconTeacherAttendance.png"))); // NOI18N
        lblTeacherShowAttendance.setText("Tareas");
        lblTeacherShowAttendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTeacherShowAttendanceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTeacherShowAttendanceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTeacherShowAttendanceMouseExited(evt);
            }
        });

        lblTeacherShowAttendance1.setBackground(new java.awt.Color(35, 151, 155));
        lblTeacherShowAttendance1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblTeacherShowAttendance1.setForeground(new java.awt.Color(252, 255, 252));
        lblTeacherShowAttendance1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTeacherShowAttendance1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconTeacherAttendance.png"))); // NOI18N
        lblTeacherShowAttendance1.setText("Asistencia");
        lblTeacherShowAttendance1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTeacherShowAttendance1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTeacherShowAttendance1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTeacherShowAttendance1MouseExited(evt);
            }
        });

        lblTeacherShowAttendance2.setBackground(new java.awt.Color(35, 151, 155));
        lblTeacherShowAttendance2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblTeacherShowAttendance2.setForeground(new java.awt.Color(252, 255, 252));
        lblTeacherShowAttendance2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTeacherShowAttendance2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconTeacherAttendance.png"))); // NOI18N
        lblTeacherShowAttendance2.setText("Notas");
        lblTeacherShowAttendance2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTeacherShowAttendance2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTeacherShowAttendance2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTeacherShowAttendance2MouseExited(evt);
            }
        });

        lblTeacherShowAttendance3.setBackground(new java.awt.Color(35, 151, 155));
        lblTeacherShowAttendance3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblTeacherShowAttendance3.setForeground(new java.awt.Color(252, 255, 252));
        lblTeacherShowAttendance3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTeacherShowAttendance3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconTeacherAttendance.png"))); // NOI18N
        lblTeacherShowAttendance3.setText("Tareas");
        lblTeacherShowAttendance3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTeacherShowAttendance3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTeacherShowAttendance3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTeacherShowAttendance3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlTeacherInfoLayout = new javax.swing.GroupLayout(pnlTeacherInfo);
        pnlTeacherInfo.setLayout(pnlTeacherInfoLayout);
        pnlTeacherInfoLayout.setHorizontalGroup(
            pnlTeacherInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTeacherShowDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addGroup(pnlTeacherInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTeacherInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTeacherShowAttendance1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTeacherShowAttendance2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTeacherShowAttendance3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTeacherShowAttendance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlTeacherInfoLayout.setVerticalGroup(
            pnlTeacherInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTeacherInfoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTeacherShowDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTeacherShowAttendance1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTeacherShowAttendance2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTeacherShowAttendance3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTeacherShowAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(354, Short.MAX_VALUE))
        );

        teacherDashboard.add(pnlTeacherInfo);
        pnlTeacherInfo.setBounds(0, 0, 230, 600);

        pnlTeacherContent.setBackground(new java.awt.Color(35, 151, 155));
        pnlTeacherContent.setLayout(new java.awt.CardLayout());

        dashboard.setBackground(new java.awt.Color(35, 151, 155));

        lblDashboardTitleCursos.setBackground(new java.awt.Color(255, 255, 255));
        lblDashboardTitleCursos.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        lblDashboardTitleCursos.setForeground(new java.awt.Color(0, 0, 0));
        lblDashboardTitleCursos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardTitleCursos.setText("Cursos");
        lblDashboardTitleCursos.setToolTipText("");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        pnlDashboardCourse4.setBackground(new java.awt.Color(236, 231, 220));
        pnlDashboardCourse4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 15, 11), 1, true));
        pnlDashboardCourse4.setPreferredSize(new java.awt.Dimension(170, 100));

        lblDashboardCourse4.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblDashboardCourse4.setForeground(new java.awt.Color(0, 0, 0));
        lblDashboardCourse4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardCourse4.setText("Curso 4");

        javax.swing.GroupLayout pnlDashboardCourse4Layout = new javax.swing.GroupLayout(pnlDashboardCourse4);
        pnlDashboardCourse4.setLayout(pnlDashboardCourse4Layout);
        pnlDashboardCourse4Layout.setHorizontalGroup(
            pnlDashboardCourse4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDashboardCourse4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse4, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDashboardCourse4Layout.setVerticalGroup(
            pnlDashboardCourse4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse4)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pnlDashboardCourse5.setBackground(new java.awt.Color(236, 231, 220));
        pnlDashboardCourse5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 15, 11), 1, true));
        pnlDashboardCourse5.setPreferredSize(new java.awt.Dimension(170, 100));

        lblDashboardCourse5.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblDashboardCourse5.setForeground(new java.awt.Color(0, 0, 0));
        lblDashboardCourse5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardCourse5.setText("Curso 5");

        javax.swing.GroupLayout pnlDashboardCourse5Layout = new javax.swing.GroupLayout(pnlDashboardCourse5);
        pnlDashboardCourse5.setLayout(pnlDashboardCourse5Layout);
        pnlDashboardCourse5Layout.setHorizontalGroup(
            pnlDashboardCourse5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse5, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDashboardCourse5Layout.setVerticalGroup(
            pnlDashboardCourse5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse5)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pnlDashboardCourse6.setBackground(new java.awt.Color(236, 231, 220));
        pnlDashboardCourse6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 15, 11), 1, true));
        pnlDashboardCourse6.setForeground(new java.awt.Color(19, 122, 127));
        pnlDashboardCourse6.setPreferredSize(new java.awt.Dimension(170, 100));

        lblDashboardCourse6.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblDashboardCourse6.setForeground(new java.awt.Color(0, 0, 0));
        lblDashboardCourse6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardCourse6.setText("Curso 6");

        javax.swing.GroupLayout pnlDashboardCourse6Layout = new javax.swing.GroupLayout(pnlDashboardCourse6);
        pnlDashboardCourse6.setLayout(pnlDashboardCourse6Layout);
        pnlDashboardCourse6Layout.setHorizontalGroup(
            pnlDashboardCourse6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse6, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDashboardCourse6Layout.setVerticalGroup(
            pnlDashboardCourse6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse6)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pnlDashboardCourse1.setBackground(new java.awt.Color(236, 231, 220));
        pnlDashboardCourse1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 15, 11), 1, true));
        pnlDashboardCourse1.setPreferredSize(new java.awt.Dimension(170, 100));

        lblDashboardCourse1.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblDashboardCourse1.setForeground(new java.awt.Color(0, 0, 0));
        lblDashboardCourse1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardCourse1.setText("Curso 1");

        javax.swing.GroupLayout pnlDashboardCourse1Layout = new javax.swing.GroupLayout(pnlDashboardCourse1);
        pnlDashboardCourse1.setLayout(pnlDashboardCourse1Layout);
        pnlDashboardCourse1Layout.setHorizontalGroup(
            pnlDashboardCourse1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDashboardCourse1Layout.setVerticalGroup(
            pnlDashboardCourse1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse1)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pnlDashboardCourse2.setBackground(new java.awt.Color(236, 231, 220));
        pnlDashboardCourse2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 15, 11), 1, true));
        pnlDashboardCourse2.setPreferredSize(new java.awt.Dimension(170, 100));

        lblDashboardCourse2.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblDashboardCourse2.setForeground(new java.awt.Color(0, 0, 0));
        lblDashboardCourse2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardCourse2.setText("Curso 2");

        javax.swing.GroupLayout pnlDashboardCourse2Layout = new javax.swing.GroupLayout(pnlDashboardCourse2);
        pnlDashboardCourse2.setLayout(pnlDashboardCourse2Layout);
        pnlDashboardCourse2Layout.setHorizontalGroup(
            pnlDashboardCourse2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDashboardCourse2Layout.setVerticalGroup(
            pnlDashboardCourse2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse2)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pnlDashboardCourse3.setBackground(new java.awt.Color(236, 231, 220));
        pnlDashboardCourse3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 15, 11), 1, true));
        pnlDashboardCourse3.setForeground(new java.awt.Color(19, 122, 127));
        pnlDashboardCourse3.setPreferredSize(new java.awt.Dimension(170, 100));

        lblDashboardCourse3.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblDashboardCourse3.setForeground(new java.awt.Color(0, 0, 0));
        lblDashboardCourse3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardCourse3.setText("Curso 3");

        javax.swing.GroupLayout pnlDashboardCourse3Layout = new javax.swing.GroupLayout(pnlDashboardCourse3);
        pnlDashboardCourse3.setLayout(pnlDashboardCourse3Layout);
        pnlDashboardCourse3Layout.setHorizontalGroup(
            pnlDashboardCourse3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse3, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDashboardCourse3Layout.setVerticalGroup(
            pnlDashboardCourse3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse3)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        lblDashboardTitleHorario.setBackground(new java.awt.Color(0, 0, 0));
        lblDashboardTitleHorario.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        lblDashboardTitleHorario.setForeground(new java.awt.Color(0, 0, 0));
        lblDashboardTitleHorario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardTitleHorario.setText("Horario");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        pnlDashboardSchedule.setBackground(new java.awt.Color(236, 231, 220));
        pnlDashboardSchedule.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlDashboardSchedule.setLayout(new java.awt.GridLayout(6, 6));

        jLabel19.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Hora");
        pnlDashboardSchedule.add(jLabel19);

        jLabel13.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Lunes");
        pnlDashboardSchedule.add(jLabel13);

        jLabel14.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Martes");
        pnlDashboardSchedule.add(jLabel14);

        jLabel15.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Miércoles");
        pnlDashboardSchedule.add(jLabel15);

        jLabel16.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Jueves");
        pnlDashboardSchedule.add(jLabel16);

        jLabel17.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Viernes");
        pnlDashboardSchedule.add(jLabel17);

        jLabel18.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Hora 1");
        pnlDashboardSchedule.add(jLabel18);

        jLabel20.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Clase 1");
        pnlDashboardSchedule.add(jLabel20);

        jLabel21.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Clase 2");
        pnlDashboardSchedule.add(jLabel21);

        jLabel22.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Clase 3");
        pnlDashboardSchedule.add(jLabel22);

        jLabel25.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Clase 4");
        pnlDashboardSchedule.add(jLabel25);

        jLabel23.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Clase 5");
        pnlDashboardSchedule.add(jLabel23);

        jLabel24.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Hora 2");
        pnlDashboardSchedule.add(jLabel24);

        jLabel26.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Clase 6");
        pnlDashboardSchedule.add(jLabel26);

        jLabel27.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Clase 7");
        pnlDashboardSchedule.add(jLabel27);

        jLabel28.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Clase 8");
        pnlDashboardSchedule.add(jLabel28);

        jLabel31.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 51, 51));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Clase 9");
        pnlDashboardSchedule.add(jLabel31);

        jLabel34.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 51, 51));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Clase 10");
        pnlDashboardSchedule.add(jLabel34);

        jLabel42.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(51, 51, 51));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Hora 3");
        pnlDashboardSchedule.add(jLabel42);

        jLabel43.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(51, 51, 51));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Clase 11");
        pnlDashboardSchedule.add(jLabel43);

        jLabel49.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(51, 51, 51));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Clase 12");
        pnlDashboardSchedule.add(jLabel49);

        jLabel50.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(51, 51, 51));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Clase 13");
        pnlDashboardSchedule.add(jLabel50);

        jLabel51.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(51, 51, 51));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Clase 14");
        pnlDashboardSchedule.add(jLabel51);

        jLabel52.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(51, 51, 51));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Clase 15");
        pnlDashboardSchedule.add(jLabel52);

        jLabel53.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(51, 51, 51));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Hora 4");
        pnlDashboardSchedule.add(jLabel53);

        jLabel54.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(51, 51, 51));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Clase 16");
        pnlDashboardSchedule.add(jLabel54);

        jLabel55.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(51, 51, 51));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("Clase 17");
        pnlDashboardSchedule.add(jLabel55);

        jLabel56.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(51, 51, 51));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Clase 18");
        pnlDashboardSchedule.add(jLabel56);

        jLabel57.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(51, 51, 51));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Clase 19");
        pnlDashboardSchedule.add(jLabel57);

        jLabel58.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(51, 51, 51));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Clase 20");
        pnlDashboardSchedule.add(jLabel58);

        jLabel59.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(51, 51, 51));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("Hora 5");
        pnlDashboardSchedule.add(jLabel59);

        jLabel60.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(51, 51, 51));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("Clase 21");
        pnlDashboardSchedule.add(jLabel60);

        jLabel61.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(51, 51, 51));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("Clase 22");
        pnlDashboardSchedule.add(jLabel61);

        jLabel62.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(51, 51, 51));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("Clase 23");
        pnlDashboardSchedule.add(jLabel62);

        jLabel63.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(51, 51, 51));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("Clase 24");
        pnlDashboardSchedule.add(jLabel63);

        jLabel64.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(51, 51, 51));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("Clase 25");
        pnlDashboardSchedule.add(jLabel64);

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDashboardSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDashboardTitleCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(pnlDashboardCourse1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(pnlDashboardCourse2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(pnlDashboardCourse3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(pnlDashboardCourse4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(pnlDashboardCourse5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(pnlDashboardCourse6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblDashboardTitleHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addComponent(lblDashboardTitleCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDashboardCourse1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDashboardCourse2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDashboardCourse3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDashboardCourse4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDashboardCourse5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDashboardCourse6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(lblDashboardTitleHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(pnlDashboardSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlTeacherContent.add(dashboard, "teacherDashboard");

        attendance.setBackground(new java.awt.Color(255, 255, 255));
        attendance.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ASISTENCIA");

        javax.swing.GroupLayout attendanceLayout = new javax.swing.GroupLayout(attendance);
        attendance.setLayout(attendanceLayout);
        attendanceLayout.setHorizontalGroup(
            attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attendanceLayout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel2)
                .addContainerGap(268, Short.MAX_VALUE))
        );
        attendanceLayout.setVerticalGroup(
            attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attendanceLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jLabel2)
                .addContainerGap(341, Short.MAX_VALUE))
        );

        pnlTeacherContent.add(attendance, "teacherAttendance");

        javax.swing.GroupLayout gradesLayout = new javax.swing.GroupLayout(grades);
        grades.setLayout(gradesLayout);
        gradesLayout.setHorizontalGroup(
            gradesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        gradesLayout.setVerticalGroup(
            gradesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        pnlTeacherContent.add(grades, "card4");

        javax.swing.GroupLayout homeworkLayout = new javax.swing.GroupLayout(homework);
        homework.setLayout(homeworkLayout);
        homeworkLayout.setHorizontalGroup(
            homeworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        homeworkLayout.setVerticalGroup(
            homeworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        pnlTeacherContent.add(homework, "card5");

        teacherDashboard.add(pnlTeacherContent);
        pnlTeacherContent.setBounds(230, 30, 570, 570);

        mainPanel.add(teacherDashboard, "teacherApp");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginLogActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
        initTeacher();
        card.show(mainPanel, "teacherApp");
    }//GEN-LAST:event_btnLoginLogActionPerformed

    private void lblTeacherShowDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowDashboardMouseClicked
        CardLayout card = (CardLayout)pnlTeacherContent.getLayout();
        initTeacherMenuOpaque(0);
        card.show(pnlTeacherContent, "teacherDashboard");
        teacherTopInfo();
    }//GEN-LAST:event_lblTeacherShowDashboardMouseClicked

    private void lblTeacherShowAttendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowAttendanceMouseClicked
        CardLayout card = (CardLayout)pnlTeacherContent.getLayout();
        initTeacherMenuOpaque(1);
        card.show(pnlTeacherContent, "teacherAttendance");
        teacherTopInfo();
    }//GEN-LAST:event_lblTeacherShowAttendanceMouseClicked

    private void lblTeacherShowDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowDashboardMouseEntered
        lblTeacherShowDashboard.setOpaque(true);
        lblTeacherShowDashboard.repaint();
    }//GEN-LAST:event_lblTeacherShowDashboardMouseEntered

    private void lblTeacherShowDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowDashboardMouseExited
        if(currentOpaqueLabel==0){
            return;
        }else{
            lblTeacherShowDashboard.setOpaque(false);
            lblTeacherShowDashboard.repaint();
        }
    }//GEN-LAST:event_lblTeacherShowDashboardMouseExited

    private void lblTeacherShowAttendanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowAttendanceMouseEntered
        lblTeacherShowAttendance.setOpaque(true);
        lblTeacherShowAttendance.repaint();
    }//GEN-LAST:event_lblTeacherShowAttendanceMouseEntered

    private void lblTeacherShowAttendanceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowAttendanceMouseExited
        if(currentOpaqueLabel==1){
            return;
        }else{
            lblTeacherShowAttendance.setOpaque(false);
            lblTeacherShowAttendance.repaint();
        }
    }//GEN-LAST:event_lblTeacherShowAttendanceMouseExited

    private void txtLoginEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoginEmailFocusGained
        if("Correo".equals(txtLoginEmail.getText())){
            txtLoginEmail.setText("");
            txtLoginEmail.setForeground(Color.BLACK);
        }
        lblLoginEmailMessage.setText("");
    }//GEN-LAST:event_txtLoginEmailFocusGained

    private void txtLoginEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoginEmailFocusLost
        if("".equals(txtLoginEmail.getText())){
            txtLoginEmail.setText("Correo");
            txtLoginEmail.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtLoginEmailFocusLost

    private void passLoginPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passLoginPasswordFocusGained
        if("Contraseña".equals(String.valueOf(passLoginPassword.getPassword()))){
            passLoginPassword.setText("");
            passLoginPassword.setForeground(Color.BLACK);
        }
        showPassword();
        lblLoginMessagePassword.setText("");
    }//GEN-LAST:event_passLoginPasswordFocusGained

    private void passLoginPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passLoginPasswordFocusLost
        if("".equals(String.valueOf(passLoginPassword.getPassword()))){
            passLoginPassword.setText("Contraseña");
            passLoginPassword.setForeground(Color.GRAY);
            passLoginPassword.setEchoChar('\u0000');
        }
            
    }//GEN-LAST:event_passLoginPasswordFocusLost

    private void lblLoginShowHideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginShowHideMouseClicked
        if(showPassword){
            lblLoginShowHide.setText("Mostrar");
        }else{
            lblLoginShowHide.setText("Ocultar");
        }
        showPassword = !showPassword;
        if("Contraseña".equals(String.valueOf(passLoginPassword.getPassword()))){
            passLoginPassword.setEchoChar('\u0000');
        }else{
            showPassword();
        }
    }//GEN-LAST:event_lblLoginShowHideMouseClicked

    private void lblTeacherShowAttendance1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowAttendance1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherShowAttendance1MouseClicked

    private void lblTeacherShowAttendance1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowAttendance1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherShowAttendance1MouseEntered

    private void lblTeacherShowAttendance1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowAttendance1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherShowAttendance1MouseExited

    private void lblTeacherShowAttendance2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowAttendance2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherShowAttendance2MouseClicked

    private void lblTeacherShowAttendance2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowAttendance2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherShowAttendance2MouseEntered

    private void lblTeacherShowAttendance2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowAttendance2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherShowAttendance2MouseExited

    private void lblTeacherShowAttendance3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowAttendance3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherShowAttendance3MouseClicked

    private void lblTeacherShowAttendance3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowAttendance3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherShowAttendance3MouseEntered

    private void lblTeacherShowAttendance3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowAttendance3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherShowAttendance3MouseExited
   
    private void initTeacher(){
        initTeacherMenuOpaque(0);
        teacherTopInfo();
    }
    
    private void initTeacherMenuOpaque(int option){
        List<JLabel> labelList;
        labelList = new ArrayList<>();
        labelList.add(lblTeacherShowDashboard);
        labelList.add(lblTeacherShowAttendance);
              
        if(currentOpaqueLabel==option){
            return;
        }
        
        labelList.get(option).setOpaque(true);
        labelList.get(currentOpaqueLabel).setOpaque(false);
        
        labelList.get(option).repaint();
        labelList.get(currentOpaqueLabel).repaint();
        currentOpaqueLabel = option;
    }
    
    private void showPassword(){
        if(showPassword){
            passLoginPassword.setEchoChar('\u0000');
        }else{
            passLoginPassword.setEchoChar('\u2022');
        }
    }
    
    //graphics java, jfreechart
    
    private void teacherTopInfo(){
        switch(currentOpaqueLabel){
            case 0:{
                lblTeacherTopInfo.setText("Dashboard");
                
                lblTeacherTopInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard.png")));
                break;
            }
            case 1:{
                lblTeacherTopInfo.setText("Asistencia");
                lblTeacherTopInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendance.png")));
                break;
            }
            
        }
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new app().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel attendance;
    private javax.swing.JButton btnLoginLog;
    private javax.swing.JPanel dashboard;
    private javax.swing.JPanel grades;
    private javax.swing.JPanel homework;
    private javax.swing.JPanel inSesion;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblDashboardCourse1;
    private javax.swing.JLabel lblDashboardCourse2;
    private javax.swing.JLabel lblDashboardCourse3;
    private javax.swing.JLabel lblDashboardCourse4;
    private javax.swing.JLabel lblDashboardCourse5;
    private javax.swing.JLabel lblDashboardCourse6;
    private javax.swing.JLabel lblDashboardTitleCursos;
    private javax.swing.JLabel lblDashboardTitleHorario;
    private javax.swing.JLabel lblIconEmail;
    private javax.swing.JLabel lblIconPassword;
    private javax.swing.JLabel lblLoginEmailMessage;
    private javax.swing.JLabel lblLoginMessagePassword;
    private javax.swing.JLabel lblLoginShowHide;
    private javax.swing.JLabel lblLoginTitle;
    private javax.swing.JLabel lblLoginTopInfo;
    private javax.swing.JLabel lblTeacherShowAttendance;
    private javax.swing.JLabel lblTeacherShowAttendance1;
    private javax.swing.JLabel lblTeacherShowAttendance2;
    private javax.swing.JLabel lblTeacherShowAttendance3;
    private javax.swing.JLabel lblTeacherShowDashboard;
    private javax.swing.JLabel lblTeacherTopInfo;
    private javax.swing.JPanel login;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPasswordField passLoginPassword;
    private javax.swing.JPanel pnlDashboardCourse1;
    private javax.swing.JPanel pnlDashboardCourse2;
    private javax.swing.JPanel pnlDashboardCourse3;
    private javax.swing.JPanel pnlDashboardCourse4;
    private javax.swing.JPanel pnlDashboardCourse5;
    private javax.swing.JPanel pnlDashboardCourse6;
    private javax.swing.JPanel pnlDashboardSchedule;
    private javax.swing.JPanel pnlLogintab;
    private javax.swing.JPanel pnlTeacherContent;
    private javax.swing.JPanel pnlTeacherInfo;
    private javax.swing.JPanel pnlTeacherTop;
    private javax.swing.JPanel teacherDashboard;
    private javax.swing.JTextField txtLoginEmail;
    // End of variables declaration//GEN-END:variables
}

package com.umg.sistema.de.notas;

import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

//Model imports
import com.umg.sistema.de.notas.model.Teacher;
import com.umg.sistema.de.notas.model.Seccion;
import com.umg.sistema.de.notas.model.Course;
import com.umg.sistema.de.notas.model.Student;
import com.umg.sistema.de.notas.model.Tarea;
import com.umg.sistema.de.notas.model.Asignacion;
import com.umg.sistema.de.notas.model.Grade;

//Service imoports
import com.umg.sistema.de.notas.service.TeacherService;
import com.umg.sistema.de.notas.service.SeccionService;
import com.umg.sistema.de.notas.service.CourseService;
import com.umg.sistema.de.notas.service.AsignacionService;
import com.umg.sistema.de.notas.service.TareaService;
import com.umg.sistema.de.notas.service.GradeService;

import com.umg.sistema.de.notas.validation.Validation;
import com.umg.sistema.de.notas.validation.Encryption;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;



public class app extends javax.swing.JFrame {
    
    //Objetos para operaciones CRUD
    TeacherService teacherService = new TeacherService();
    SeccionService seccionService = new SeccionService();
    CourseService courseService = new CourseService();
    AsignacionService asignacionService = new AsignacionService();
    TareaService tareaService = new TareaService();
    GradeService gradeService = new GradeService();
    
    //Objetos para validar / encriptar
    Validation validation = new Validation();
    Encryption encryption = new Encryption();
    
    //Variables globales
    int currentOpaqueLabel = 1;
    boolean showPassword = false;
    
    //Informacion del usuario que inicio sesion
    Teacher teacher = new Teacher();
    
    //Listas para llenar los campos de las interfaces
    List<Course> teacherCourseList;
    List<Seccion> teacherSeccionList;
    List<Student> courseStudentList;
    List<Tarea> teacherHomeworkList;
    List<Asignacion> asignacionList;
    List<Grade> gradeList;
    List<Grade> updateGrade;
            
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
        teacherApp = new javax.swing.JPanel();
        pnlTeacherTop = new javax.swing.JPanel();
        lblTeacherTopInfo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlTeacherInfo = new javax.swing.JPanel();
        lblTeacherShowDashboard = new javax.swing.JLabel();
        lblTeacherLogOut = new javax.swing.JLabel();
        lblTeacherShowGrades = new javax.swing.JLabel();
        lblTeacherShowHomework = new javax.swing.JLabel();
        pnlTeacherContent = new javax.swing.JPanel();
        dashboard = new javax.swing.JPanel();
        lblDashboardTitleCursos = new javax.swing.JLabel();
        pnlDashboardCourse4 = new javax.swing.JPanel();
        lblDashboardCourse4 = new javax.swing.JLabel();
        lblSeccion4 = new javax.swing.JLabel();
        pnlDashboardCourse5 = new javax.swing.JPanel();
        lblDashboardCourse5 = new javax.swing.JLabel();
        lblSeccion5 = new javax.swing.JLabel();
        pnlDashboardCourse6 = new javax.swing.JPanel();
        lblDashboardCourse6 = new javax.swing.JLabel();
        lblSeccion6 = new javax.swing.JLabel();
        pnlDashboardCourse1 = new javax.swing.JPanel();
        lblDashboardCourse1 = new javax.swing.JLabel();
        lblSeccion1 = new javax.swing.JLabel();
        pnlDashboardCourse2 = new javax.swing.JPanel();
        lblDashboardCourse2 = new javax.swing.JLabel();
        lblSeccion2 = new javax.swing.JLabel();
        pnlDashboardCourse3 = new javax.swing.JPanel();
        lblDashboardCourse3 = new javax.swing.JLabel();
        lblSeccion3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        homework = new javax.swing.JPanel();
        tabbedPaneHomework = new javax.swing.JTabbedPane();
        pnlAddHomework = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        cmbBoxHomeworkCourses = new javax.swing.JComboBox<>();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        txtAgregarTareaTitulo = new javax.swing.JTextField();
        scrollPaneDescripcionTarea = new javax.swing.JScrollPane();
        txtareaAgregarTareaDescripcion = new javax.swing.JTextArea();
        spinFechaEntrega = new javax.swing.JSpinner();
        btnAgregarTarea = new javax.swing.JButton();
        cmbBoxHomeworkSection = new javax.swing.JComboBox<>();
        pnlUpdateHomework = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        cmbBoxUpdateHomeworkCourses = new javax.swing.JComboBox<>();
        jLabel67 = new javax.swing.JLabel();
        cmbBoxUpdateHomeworkSection = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listUpdateTareas = new javax.swing.JList<>();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel68 = new javax.swing.JLabel();
        txtTareaUpdateTitulo = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        scrollUpdateHomework = new javax.swing.JScrollPane();
        txtAreaUpdateTareaDescripcion = new javax.swing.JTextArea();
        jLabel70 = new javax.swing.JLabel();
        lblUpdateFechaAsignacion = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        spinnerUpdateTareaFechaEntrega = new javax.swing.JSpinner();
        btnUpdateTarea = new javax.swing.JButton();
        btnConsultarTareas = new javax.swing.JButton();
        scrollPaneTeacherCourse = new javax.swing.JScrollPane();
        course = new javax.swing.JPanel();
        lblCoursePageTitle = new javax.swing.JLabel();
        lblCoursePSeccion = new javax.swing.JLabel();
        lblCoursePCodigo = new javax.swing.JLabel();
        lblCourseCode = new javax.swing.JLabel();
        lblCourseSeccion = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel39 = new javax.swing.JLabel();
        lblCoursePCodigo1 = new javax.swing.JLabel();
        lblCourseSemester = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableCourseTareaList = new javax.swing.JTable();
        btnCourseAddTarea = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel41 = new javax.swing.JLabel();
        scrollTableCourseStudents = new javax.swing.JScrollPane();
        tableCourseStudents = new javax.swing.JTable();
        scrollPaneGrades = new javax.swing.JScrollPane();
        grades = new javax.swing.JPanel();
        tabbedPaneNotas = new javax.swing.JTabbedPane();
        pnlAttendanceAdd1 = new javax.swing.JPanel();
        scrollPaneAddGradesTable = new javax.swing.JScrollPane();
        tableAddGrades = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        cmbCoursesAddGrade = new javax.swing.JComboBox<>();
        cmbBoxRegistrarNotaTipoEvaluacion = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        btnAddGrades = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel72 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listAddGradeHomework = new javax.swing.JList<>();
        jLabel33 = new javax.swing.JLabel();
        cmbBoxAddGradeSeccion = new javax.swing.JComboBox<>();
        btnAddGradeBuscarTareas = new javax.swing.JButton();
        btnAddGradeLoadStudents = new javax.swing.JButton();
        lblAddNotaMissingTareaSelected = new javax.swing.JLabel();
        lblAddNotaMissingTarea = new javax.swing.JLabel();
        pnlAttendanceCheckUpdate1 = new javax.swing.JPanel();
        scrollTableConsultaNotas = new javax.swing.JScrollPane();
        tableGetUpdateNotes = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        cmbBoxConsultaNotasCurso = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmbBoxConsultaNotasEstudiante = new javax.swing.JComboBox<>();
        btnUpdateGrade = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        cmbBoxConsultaNotasEvaluacion = new javax.swing.JComboBox<>();
        txtTotalNotas = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        btnConsultarNotas = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cmbBoxConsultaNotasLetraSeccion = new javax.swing.JComboBox<>();
        btnSortGradesConsulta = new javax.swing.JButton();
        adminApp = new javax.swing.JPanel();

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
        txtLoginEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoginEmailKeyPressed(evt);
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
        passLoginPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passLoginPasswordKeyPressed(evt);
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
        inSesion.setBounds(300, 0, 500, 600);

        mainPanel.add(login, "login");

        teacherApp.setLayout(null);

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

        teacherApp.add(pnlTeacherTop);
        pnlTeacherTop.setBounds(0, 0, 800, 30);

        pnlTeacherInfo.setBackground(new java.awt.Color(53, 36, 97));

        lblTeacherShowDashboard.setBackground(new java.awt.Color(35, 151, 155));
        lblTeacherShowDashboard.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblTeacherShowDashboard.setForeground(new java.awt.Color(252, 255, 252));
        lblTeacherShowDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTeacherShowDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconTeacherDashboard.png"))); // NOI18N
        lblTeacherShowDashboard.setText("Dashboard");
        lblTeacherShowDashboard.setFocusable(false);
        lblTeacherShowDashboard.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
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

        lblTeacherLogOut.setBackground(new java.awt.Color(35, 151, 155));
        lblTeacherLogOut.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblTeacherLogOut.setForeground(new java.awt.Color(255, 102, 102));
        lblTeacherLogOut.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTeacherLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        lblTeacherLogOut.setText("Cerrar Sesión");
        lblTeacherLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTeacherLogOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTeacherLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTeacherLogOutMouseExited(evt);
            }
        });

        lblTeacherShowGrades.setBackground(new java.awt.Color(35, 151, 155));
        lblTeacherShowGrades.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblTeacherShowGrades.setForeground(new java.awt.Color(252, 255, 252));
        lblTeacherShowGrades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTeacherShowGrades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconTeacherAttendance.png"))); // NOI18N
        lblTeacherShowGrades.setText("Notas");
        lblTeacherShowGrades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTeacherShowGradesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTeacherShowGradesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTeacherShowGradesMouseExited(evt);
            }
        });

        lblTeacherShowHomework.setBackground(new java.awt.Color(35, 151, 155));
        lblTeacherShowHomework.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblTeacherShowHomework.setForeground(new java.awt.Color(252, 255, 252));
        lblTeacherShowHomework.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTeacherShowHomework.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconTeacherAttendance.png"))); // NOI18N
        lblTeacherShowHomework.setText("Tareas");
        lblTeacherShowHomework.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTeacherShowHomeworkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTeacherShowHomeworkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTeacherShowHomeworkMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlTeacherInfoLayout = new javax.swing.GroupLayout(pnlTeacherInfo);
        pnlTeacherInfo.setLayout(pnlTeacherInfoLayout);
        pnlTeacherInfoLayout.setHorizontalGroup(
            pnlTeacherInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTeacherInfoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlTeacherInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTeacherShowDashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(lblTeacherShowGrades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTeacherShowHomework, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(pnlTeacherInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTeacherLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTeacherInfoLayout.setVerticalGroup(
            pnlTeacherInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTeacherInfoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTeacherShowDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTeacherShowGrades, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTeacherShowHomework, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTeacherLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(401, Short.MAX_VALUE))
        );

        teacherApp.add(pnlTeacherInfo);
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
        lblDashboardTitleCursos.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        pnlDashboardCourse4.setBackground(new java.awt.Color(236, 231, 220));
        pnlDashboardCourse4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 15, 11), 1, true));
        pnlDashboardCourse4.setPreferredSize(new java.awt.Dimension(170, 100));

        lblDashboardCourse4.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblDashboardCourse4.setForeground(new java.awt.Color(0, 0, 0));
        lblDashboardCourse4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardCourse4.setText("Curso 4");

        lblSeccion4.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        lblSeccion4.setForeground(new java.awt.Color(0, 0, 0));
        lblSeccion4.setText("Seccion");

        javax.swing.GroupLayout pnlDashboardCourse4Layout = new javax.swing.GroupLayout(pnlDashboardCourse4);
        pnlDashboardCourse4.setLayout(pnlDashboardCourse4Layout);
        pnlDashboardCourse4Layout.setHorizontalGroup(
            pnlDashboardCourse4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDashboardCourse4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse4, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlDashboardCourse4Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lblSeccion4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDashboardCourse4Layout.setVerticalGroup(
            pnlDashboardCourse4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSeccion4)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pnlDashboardCourse5.setBackground(new java.awt.Color(236, 231, 220));
        pnlDashboardCourse5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 15, 11), 1, true));
        pnlDashboardCourse5.setPreferredSize(new java.awt.Dimension(170, 100));

        lblDashboardCourse5.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblDashboardCourse5.setForeground(new java.awt.Color(0, 0, 0));
        lblDashboardCourse5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardCourse5.setText("Curso 5");

        lblSeccion5.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        lblSeccion5.setForeground(new java.awt.Color(0, 0, 0));
        lblSeccion5.setText("Seccion");

        javax.swing.GroupLayout pnlDashboardCourse5Layout = new javax.swing.GroupLayout(pnlDashboardCourse5);
        pnlDashboardCourse5.setLayout(pnlDashboardCourse5Layout);
        pnlDashboardCourse5Layout.setHorizontalGroup(
            pnlDashboardCourse5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse5, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlDashboardCourse5Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lblSeccion5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDashboardCourse5Layout.setVerticalGroup(
            pnlDashboardCourse5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSeccion5)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pnlDashboardCourse6.setBackground(new java.awt.Color(236, 231, 220));
        pnlDashboardCourse6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 15, 11), 1, true));
        pnlDashboardCourse6.setForeground(new java.awt.Color(19, 122, 127));
        pnlDashboardCourse6.setPreferredSize(new java.awt.Dimension(170, 100));

        lblDashboardCourse6.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblDashboardCourse6.setForeground(new java.awt.Color(0, 0, 0));
        lblDashboardCourse6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardCourse6.setText("Curso 6");

        lblSeccion6.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        lblSeccion6.setForeground(new java.awt.Color(0, 0, 0));
        lblSeccion6.setText("Seccion");

        javax.swing.GroupLayout pnlDashboardCourse6Layout = new javax.swing.GroupLayout(pnlDashboardCourse6);
        pnlDashboardCourse6.setLayout(pnlDashboardCourse6Layout);
        pnlDashboardCourse6Layout.setHorizontalGroup(
            pnlDashboardCourse6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse6, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDashboardCourse6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSeccion6)
                .addGap(60, 60, 60))
        );
        pnlDashboardCourse6Layout.setVerticalGroup(
            pnlDashboardCourse6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSeccion6)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pnlDashboardCourse1.setBackground(new java.awt.Color(236, 231, 220));
        pnlDashboardCourse1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 15, 11), 1, true));
        pnlDashboardCourse1.setPreferredSize(new java.awt.Dimension(170, 100));

        lblDashboardCourse1.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblDashboardCourse1.setForeground(new java.awt.Color(0, 0, 0));
        lblDashboardCourse1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardCourse1.setText("Curso 1");
        lblDashboardCourse1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardCourse1MouseClicked(evt);
            }
        });

        lblSeccion1.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        lblSeccion1.setForeground(new java.awt.Color(0, 0, 0));
        lblSeccion1.setText("Seccion");

        javax.swing.GroupLayout pnlDashboardCourse1Layout = new javax.swing.GroupLayout(pnlDashboardCourse1);
        pnlDashboardCourse1.setLayout(pnlDashboardCourse1Layout);
        pnlDashboardCourse1Layout.setHorizontalGroup(
            pnlDashboardCourse1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlDashboardCourse1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lblSeccion1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDashboardCourse1Layout.setVerticalGroup(
            pnlDashboardCourse1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSeccion1)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pnlDashboardCourse2.setBackground(new java.awt.Color(236, 231, 220));
        pnlDashboardCourse2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 15, 11), 1, true));
        pnlDashboardCourse2.setPreferredSize(new java.awt.Dimension(170, 100));

        lblDashboardCourse2.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblDashboardCourse2.setForeground(new java.awt.Color(0, 0, 0));
        lblDashboardCourse2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardCourse2.setText("Curso 2");
        lblDashboardCourse2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardCourse2MouseClicked(evt);
            }
        });

        lblSeccion2.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        lblSeccion2.setForeground(new java.awt.Color(0, 0, 0));
        lblSeccion2.setText("Seccion");

        javax.swing.GroupLayout pnlDashboardCourse2Layout = new javax.swing.GroupLayout(pnlDashboardCourse2);
        pnlDashboardCourse2.setLayout(pnlDashboardCourse2Layout);
        pnlDashboardCourse2Layout.setHorizontalGroup(
            pnlDashboardCourse2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlDashboardCourse2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lblSeccion2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDashboardCourse2Layout.setVerticalGroup(
            pnlDashboardCourse2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSeccion2)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pnlDashboardCourse3.setBackground(new java.awt.Color(236, 231, 220));
        pnlDashboardCourse3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 15, 11), 1, true));
        pnlDashboardCourse3.setForeground(new java.awt.Color(19, 122, 127));
        pnlDashboardCourse3.setPreferredSize(new java.awt.Dimension(170, 100));

        lblDashboardCourse3.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblDashboardCourse3.setForeground(new java.awt.Color(0, 0, 0));
        lblDashboardCourse3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardCourse3.setText("Curso 3");

        lblSeccion3.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        lblSeccion3.setForeground(new java.awt.Color(0, 0, 0));
        lblSeccion3.setText("Seccion");

        javax.swing.GroupLayout pnlDashboardCourse3Layout = new javax.swing.GroupLayout(pnlDashboardCourse3);
        pnlDashboardCourse3.setLayout(pnlDashboardCourse3Layout);
        pnlDashboardCourse3Layout.setHorizontalGroup(
            pnlDashboardCourse3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse3, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlDashboardCourse3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lblSeccion3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDashboardCourse3Layout.setVerticalGroup(
            pnlDashboardCourse3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSeccion3)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(pnlDashboardCourse6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addContainerGap(310, Short.MAX_VALUE))
        );

        pnlTeacherContent.add(dashboard, "teacherDashboard");

        tabbedPaneHomework.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        tabbedPaneHomework.setName(""); // NOI18N

        jLabel40.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        jLabel40.setText("Agregar Tarea");

        jLabel44.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel44.setText("Curso:");

        cmbBoxHomeworkCourses.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        cmbBoxHomeworkCourses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));

        jLabel45.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel45.setText("Sección:");

        jLabel46.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel46.setText("Titulo:");

        jLabel47.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel47.setText("Descripcion:");

        jLabel48.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel48.setText("Fecha de entrega:");

        txtAgregarTareaTitulo.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N

        txtareaAgregarTareaDescripcion.setColumns(20);
        txtareaAgregarTareaDescripcion.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        txtareaAgregarTareaDescripcion.setLineWrap(true);
        txtareaAgregarTareaDescripcion.setRows(5);
        txtareaAgregarTareaDescripcion.setWrapStyleWord(true);
        scrollPaneDescripcionTarea.setViewportView(txtareaAgregarTareaDescripcion);

        spinFechaEntrega.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        spinFechaEntrega.setModel(new javax.swing.SpinnerDateModel());

        btnAgregarTarea.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        btnAgregarTarea.setText("Agregar Tarea");
        btnAgregarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTareaActionPerformed(evt);
            }
        });

        cmbBoxHomeworkSection.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        cmbBoxHomeworkSection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));

        javax.swing.GroupLayout pnlAddHomeworkLayout = new javax.swing.GroupLayout(pnlAddHomework);
        pnlAddHomework.setLayout(pnlAddHomeworkLayout);
        pnlAddHomeworkLayout.setHorizontalGroup(
            pnlAddHomeworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddHomeworkLayout.createSequentialGroup()
                .addGroup(pnlAddHomeworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddHomeworkLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbBoxHomeworkCourses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAddHomeworkLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbBoxHomeworkSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAddHomeworkLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel47))
                    .addGroup(pnlAddHomeworkLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spinFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAddHomeworkLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlAddHomeworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scrollPaneDescripcionTarea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlAddHomeworkLayout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAgregarTareaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlAddHomeworkLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAgregarTarea))
                    .addGroup(pnlAddHomeworkLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel40)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        pnlAddHomeworkLayout.setVerticalGroup(
            pnlAddHomeworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddHomeworkLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addGap(28, 28, 28)
                .addGroup(pnlAddHomeworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(cmbBoxHomeworkCourses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAddHomeworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(cmbBoxHomeworkSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlAddHomeworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(txtAgregarTareaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPaneDescripcionTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlAddHomeworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(spinFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAgregarTarea)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        tabbedPaneHomework.addTab("Agregar / Consultar", pnlAddHomework);

        jLabel65.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        jLabel65.setText("Actualizar Tarea");

        jLabel66.setText("Curso:");

        cmbBoxUpdateHomeworkCourses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));

        jLabel67.setText("Sección:");

        cmbBoxUpdateHomeworkSection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));

        listUpdateTareas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listUpdateTareasValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listUpdateTareas);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel68.setText("Titulo:");

        jLabel69.setText("Descripción:");

        txtAreaUpdateTareaDescripcion.setColumns(20);
        txtAreaUpdateTareaDescripcion.setLineWrap(true);
        txtAreaUpdateTareaDescripcion.setRows(5);
        txtAreaUpdateTareaDescripcion.setWrapStyleWord(true);
        scrollUpdateHomework.setViewportView(txtAreaUpdateTareaDescripcion);

        jLabel70.setText("Fecha de asignación:");

        lblUpdateFechaAsignacion.setText("--");

        jLabel71.setText("Fecha de entrega:");

        spinnerUpdateTareaFechaEntrega.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        spinnerUpdateTareaFechaEntrega.setModel(new javax.swing.SpinnerDateModel());

        btnUpdateTarea.setText("Actualizar Tarea");
        btnUpdateTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTareaActionPerformed(evt);
            }
        });

        btnConsultarTareas.setText("Buscar tareas");
        btnConsultarTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarTareasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUpdateHomeworkLayout = new javax.swing.GroupLayout(pnlUpdateHomework);
        pnlUpdateHomework.setLayout(pnlUpdateHomeworkLayout);
        pnlUpdateHomeworkLayout.setHorizontalGroup(
            pnlUpdateHomeworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUpdateHomeworkLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUpdateHomeworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUpdateHomeworkLayout.createSequentialGroup()
                        .addGroup(pnlUpdateHomeworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel66)
                            .addComponent(jLabel67))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlUpdateHomeworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbBoxUpdateHomeworkSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbBoxUpdateHomeworkCourses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarTareas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(pnlUpdateHomeworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel65)
                    .addGroup(pnlUpdateHomeworkLayout.createSequentialGroup()
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlUpdateHomeworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlUpdateHomeworkLayout.createSequentialGroup()
                                .addComponent(jLabel68)
                                .addGap(18, 18, 18)
                                .addComponent(txtTareaUpdateTitulo))
                            .addComponent(jLabel69)
                            .addComponent(btnUpdateTarea)
                            .addComponent(scrollUpdateHomework, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUpdateHomeworkLayout.createSequentialGroup()
                                .addComponent(jLabel70)
                                .addGap(18, 18, 18)
                                .addComponent(lblUpdateFechaAsignacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlUpdateHomeworkLayout.createSequentialGroup()
                                .addComponent(jLabel71)
                                .addGap(18, 18, 18)
                                .addComponent(spinnerUpdateTareaFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27))
        );
        pnlUpdateHomeworkLayout.setVerticalGroup(
            pnlUpdateHomeworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUpdateHomeworkLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel65)
                .addGroup(pnlUpdateHomeworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUpdateHomeworkLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlUpdateHomeworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlUpdateHomeworkLayout.createSequentialGroup()
                                .addGroup(pnlUpdateHomeworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel68)
                                    .addComponent(txtTareaUpdateTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel69)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollUpdateHomework, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pnlUpdateHomeworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel70)
                                    .addComponent(lblUpdateFechaAsignacion))
                                .addGap(18, 18, 18)
                                .addGroup(pnlUpdateHomeworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel71)
                                    .addComponent(spinnerUpdateTareaFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdateTarea))
                            .addGroup(pnlUpdateHomeworkLayout.createSequentialGroup()
                                .addGroup(pnlUpdateHomeworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel66)
                                    .addComponent(cmbBoxUpdateHomeworkCourses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(pnlUpdateHomeworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbBoxUpdateHomeworkSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel67))
                                .addGap(18, 18, 18)
                                .addComponent(btnConsultarTareas)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUpdateHomeworkLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        tabbedPaneHomework.addTab("tab2", pnlUpdateHomework);

        javax.swing.GroupLayout homeworkLayout = new javax.swing.GroupLayout(homework);
        homework.setLayout(homeworkLayout);
        homeworkLayout.setHorizontalGroup(
            homeworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeworkLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPaneHomework)
                .addContainerGap())
        );
        homeworkLayout.setVerticalGroup(
            homeworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeworkLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPaneHomework)
                .addContainerGap())
        );

        tabbedPaneHomework.getAccessibleContext().setAccessibleName("Agregar");

        pnlTeacherContent.add(homework, "teacherHomework");

        scrollPaneTeacherCourse.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPaneTeacherCourse.setPreferredSize(new java.awt.Dimension(560, 802));

        course.setPreferredSize(new java.awt.Dimension(560, 800));

        lblCoursePageTitle.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        lblCoursePageTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCoursePageTitle.setText("COURSE TITLE");

        lblCoursePSeccion.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        lblCoursePSeccion.setText("Sección:");

        lblCoursePCodigo.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        lblCoursePCodigo.setText("Código:");

        lblCourseCode.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        lblCourseCode.setText("--");

        lblCourseSeccion.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        lblCourseSeccion.setText("--");

        jLabel39.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Tareas");

        lblCoursePCodigo1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        lblCoursePCodigo1.setText("Semestre:");

        lblCourseSemester.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        lblCourseSemester.setText("--");

        tableCourseTareaList.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tableCourseTareaList);

        btnCourseAddTarea.setText("Agregar nueva tarea");
        btnCourseAddTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseAddTareaActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Alumnos");

        tableCourseStudents.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollTableCourseStudents.setViewportView(tableCourseStudents);

        javax.swing.GroupLayout courseLayout = new javax.swing.GroupLayout(course);
        course.setLayout(courseLayout);
        courseLayout.setHorizontalGroup(
            courseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(courseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(courseLayout.createSequentialGroup()
                        .addGroup(courseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblCoursePageTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, courseLayout.createSequentialGroup()
                                .addComponent(lblCoursePCodigo)
                                .addGap(18, 18, 18)
                                .addComponent(lblCourseCode))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, courseLayout.createSequentialGroup()
                                .addComponent(lblCoursePSeccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCourseSeccion))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, courseLayout.createSequentialGroup()
                                .addComponent(lblCoursePCodigo1)
                                .addGap(18, 18, 18)
                                .addComponent(lblCourseSemester))
                            .addComponent(btnCourseAddTarea, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                            .addComponent(scrollTableCourseStudents, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
        );
        courseLayout.setVerticalGroup(
            courseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCoursePageTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(courseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCoursePCodigo)
                    .addComponent(lblCourseCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(courseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCoursePSeccion)
                    .addComponent(lblCourseSeccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(courseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCoursePCodigo1)
                    .addComponent(lblCourseSemester))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCourseAddTarea)
                .addGap(8, 8, 8)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollTableCourseStudents, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addContainerGap())
        );

        scrollPaneTeacherCourse.setViewportView(course);

        pnlTeacherContent.add(scrollPaneTeacherCourse, "teacherCourse");

        scrollPaneGrades.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tabbedPaneNotas.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N

        pnlAttendanceAdd1.setBackground(new java.awt.Color(35, 151, 155));

        scrollPaneAddGradesTable.setBackground(new java.awt.Color(153, 0, 0));
        scrollPaneAddGradesTable.setForeground(new java.awt.Color(255, 51, 255));
        scrollPaneAddGradesTable.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tableAddGrades.setBackground(new java.awt.Color(102, 153, 255));
        tableAddGrades.setForeground(new java.awt.Color(0, 0, 0));
        tableAddGrades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableAddGrades.setGridColor(new java.awt.Color(51, 51, 255));
        tableAddGrades.setRowHeight(30);
        tableAddGrades.setRowMargin(5);
        tableAddGrades.setShowGrid(true);
        tableAddGrades.setShowVerticalLines(false);
        tableAddGrades.setUpdateSelectionOnSort(false);
        scrollPaneAddGradesTable.setViewportView(tableAddGrades);
        if (tableAddGrades.getColumnModel().getColumnCount() > 0) {
            tableAddGrades.getColumnModel().getColumn(0).setResizable(false);
            tableAddGrades.getColumnModel().getColumn(0).setPreferredWidth(200);
            tableAddGrades.getColumnModel().getColumn(1).setResizable(false);
            tableAddGrades.getColumnModel().getColumn(2).setResizable(false);
            tableAddGrades.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel12.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        jLabel12.setText("Registrar Notas");

        jLabel29.setText("Elegir curso:");

        cmbCoursesAddGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));

        cmbBoxRegistrarNotaTipoEvaluacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Tarea", "Parcial", "Examen Final" }));

        jLabel35.setText("Tipo de evaluacion:");

        btnAddGrades.setText("Agregar Notas");
        btnAddGrades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddGradesActionPerformed(evt);
            }
        });

        jLabel38.setText("Notas de estudiantes:");

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel72.setText("Tareas");

        jScrollPane4.setViewportView(listAddGradeHomework);

        jLabel33.setText("Elegir Sección:");

        cmbBoxAddGradeSeccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));

        btnAddGradeBuscarTareas.setText("Buscar Tareas");
        btnAddGradeBuscarTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddGradeBuscarTareasActionPerformed(evt);
            }
        });

        btnAddGradeLoadStudents.setText("Cargar alumnos");
        btnAddGradeLoadStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddGradeLoadStudentsActionPerformed(evt);
            }
        });

        lblAddNotaMissingTareaSelected.setBackground(new java.awt.Color(255, 255, 255));
        lblAddNotaMissingTareaSelected.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        lblAddNotaMissingTareaSelected.setForeground(new java.awt.Color(255, 102, 102));

        lblAddNotaMissingTarea.setBackground(new java.awt.Color(255, 255, 255));
        lblAddNotaMissingTarea.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        lblAddNotaMissingTarea.setForeground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout pnlAttendanceAdd1Layout = new javax.swing.GroupLayout(pnlAttendanceAdd1);
        pnlAttendanceAdd1.setLayout(pnlAttendanceAdd1Layout);
        pnlAttendanceAdd1Layout.setHorizontalGroup(
            pnlAttendanceAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAttendanceAdd1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAttendanceAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAttendanceAdd1Layout.createSequentialGroup()
                        .addGroup(pnlAttendanceAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAttendanceAdd1Layout.createSequentialGroup()
                                .addGroup(pnlAttendanceAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel33))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlAttendanceAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbCoursesAddGrade, 0, 121, Short.MAX_VALUE)
                                    .addComponent(cmbBoxAddGradeSeccion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbBoxRegistrarNotaTipoEvaluacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAddGradeBuscarTareas)
                                    .addComponent(lblAddNotaMissingTarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel29))
                        .addGroup(pnlAttendanceAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAttendanceAdd1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel72)
                                .addGap(143, 143, 143))
                            .addGroup(pnlAttendanceAdd1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlAttendanceAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlAttendanceAdd1Layout.createSequentialGroup()
                                        .addComponent(lblAddNotaMissingTareaSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pnlAttendanceAdd1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane4)
                                        .addGap(26, 26, 26))))))
                    .addGroup(pnlAttendanceAdd1Layout.createSequentialGroup()
                        .addGap(432, 432, 432)
                        .addComponent(btnAddGrades)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(pnlAttendanceAdd1Layout.createSequentialGroup()
                .addGroup(pnlAttendanceAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAttendanceAdd1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel12))
                    .addGroup(pnlAttendanceAdd1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlAttendanceAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollPaneAddGradesTable, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlAttendanceAdd1Layout.createSequentialGroup()
                                .addComponent(btnAddGradeLoadStudents)
                                .addGap(92, 92, 92)
                                .addComponent(jLabel38)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAttendanceAdd1Layout.setVerticalGroup(
            pnlAttendanceAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAttendanceAdd1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(20, 20, 20)
                .addGroup(pnlAttendanceAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlAttendanceAdd1Layout.createSequentialGroup()
                        .addGroup(pnlAttendanceAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(cmbCoursesAddGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel72))
                        .addGroup(pnlAttendanceAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAttendanceAdd1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlAttendanceAdd1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(pnlAttendanceAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel33)
                                    .addComponent(cmbBoxAddGradeSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlAttendanceAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbBoxRegistrarNotaTipoEvaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel35))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAddNotaMissingTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddGradeBuscarTareas)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAddNotaMissingTareaSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator6))
                .addGap(18, 18, 18)
                .addGroup(pnlAttendanceAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(btnAddGradeLoadStudents))
                .addGap(18, 18, 18)
                .addComponent(scrollPaneAddGradesTable, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAddGrades)
                .addContainerGap())
        );

        tabbedPaneNotas.addTab("Agregar", pnlAttendanceAdd1);

        pnlAttendanceCheckUpdate1.setBackground(new java.awt.Color(35, 151, 155));

        scrollTableConsultaNotas.setBackground(new java.awt.Color(153, 0, 0));
        scrollTableConsultaNotas.setForeground(new java.awt.Color(255, 51, 255));
        scrollTableConsultaNotas.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tableGetUpdateNotes.setBackground(new java.awt.Color(102, 153, 255));
        tableGetUpdateNotes.setForeground(new java.awt.Color(0, 0, 0));
        tableGetUpdateNotes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableGetUpdateNotes.setGridColor(new java.awt.Color(51, 51, 255));
        tableGetUpdateNotes.setRowHeight(30);
        tableGetUpdateNotes.setRowMargin(5);
        tableGetUpdateNotes.setShowGrid(true);
        tableGetUpdateNotes.setShowVerticalLines(false);
        tableGetUpdateNotes.setUpdateSelectionOnSort(false);
        scrollTableConsultaNotas.setViewportView(tableGetUpdateNotes);
        if (tableGetUpdateNotes.getColumnModel().getColumnCount() > 0) {
            tableGetUpdateNotes.getColumnModel().getColumn(0).setResizable(false);
            tableGetUpdateNotes.getColumnModel().getColumn(0).setPreferredWidth(200);
            tableGetUpdateNotes.getColumnModel().getColumn(1).setResizable(false);
            tableGetUpdateNotes.getColumnModel().getColumn(2).setResizable(false);
            tableGetUpdateNotes.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel8.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel8.setText("Elegir Curso:");

        cmbBoxConsultaNotasCurso.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        cmbBoxConsultaNotasCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));

        jLabel9.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Consulta de Notas");

        jLabel10.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel10.setText("Estudiante");

        cmbBoxConsultaNotasEstudiante.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        cmbBoxConsultaNotasEstudiante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));

        btnUpdateGrade.setText("Actualizar");
        btnUpdateGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateGradeActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel30.setText("Tipo de evaluacion");

        cmbBoxConsultaNotasEvaluacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Tarea", "Parcial", "Examen Final" }));

        txtTotalNotas.setEditable(false);
        txtTotalNotas.setText("--");

        jLabel32.setText("Total:");

        btnConsultarNotas.setText("Consultar");
        btnConsultarNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarNotasActionPerformed(evt);
            }
        });

        jLabel11.setText("Elegir Sección:");

        cmbBoxConsultaNotasLetraSeccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));

        btnSortGradesConsulta.setText("Filtrar por estudiante");
        btnSortGradesConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortGradesConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAttendanceCheckUpdate1Layout = new javax.swing.GroupLayout(pnlAttendanceCheckUpdate1);
        pnlAttendanceCheckUpdate1.setLayout(pnlAttendanceCheckUpdate1Layout);
        pnlAttendanceCheckUpdate1Layout.setHorizontalGroup(
            pnlAttendanceCheckUpdate1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAttendanceCheckUpdate1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAttendanceCheckUpdate1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAttendanceCheckUpdate1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlAttendanceCheckUpdate1Layout.createSequentialGroup()
                            .addComponent(jLabel32)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTotalNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlAttendanceCheckUpdate1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(scrollTableConsultaNotas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlAttendanceCheckUpdate1Layout.createSequentialGroup()
                                .addGroup(pnlAttendanceCheckUpdate1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlAttendanceCheckUpdate1Layout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbBoxConsultaNotasEvaluacion, 0, 100, Short.MAX_VALUE))
                                    .addGroup(pnlAttendanceCheckUpdate1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmbBoxConsultaNotasCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbBoxConsultaNotasLetraSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlAttendanceCheckUpdate1Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(btnSortGradesConsulta)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbBoxConsultaNotasEstudiante, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btnUpdateGrade))
                    .addComponent(btnConsultarNotas))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        pnlAttendanceCheckUpdate1Layout.setVerticalGroup(
            pnlAttendanceCheckUpdate1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAttendanceCheckUpdate1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAttendanceCheckUpdate1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbBoxConsultaNotasCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cmbBoxConsultaNotasLetraSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAttendanceCheckUpdate1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBoxConsultaNotasEvaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultarNotas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(pnlAttendanceCheckUpdate1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBoxConsultaNotasEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(btnSortGradesConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollTableConsultaNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAttendanceCheckUpdate1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(37, 37, 37)
                .addComponent(btnUpdateGrade)
                .addContainerGap())
        );

        tabbedPaneNotas.addTab("Consultar / Actualizar", pnlAttendanceCheckUpdate1);

        javax.swing.GroupLayout gradesLayout = new javax.swing.GroupLayout(grades);
        grades.setLayout(gradesLayout);
        gradesLayout.setHorizontalGroup(
            gradesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneNotas)
        );
        gradesLayout.setVerticalGroup(
            gradesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneNotas, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        scrollPaneGrades.setViewportView(grades);

        pnlTeacherContent.add(scrollPaneGrades, "teacherGrades");

        teacherApp.add(pnlTeacherContent);
        pnlTeacherContent.setBounds(230, 30, 570, 570);

        mainPanel.add(teacherApp, "teacherApp");

        javax.swing.GroupLayout adminAppLayout = new javax.swing.GroupLayout(adminApp);
        adminApp.setLayout(adminAppLayout);
        adminAppLayout.setHorizontalGroup(
            adminAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        adminAppLayout.setVerticalGroup(
            adminAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        mainPanel.add(adminApp, "card4");

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
        //forzar login de teacher
       /* CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "teacherApp");
        initTeacher();*/
        
        String correo = txtLoginEmail.getText();
        char[] charPassword = passLoginPassword.getPassword();
        String password = String.valueOf(charPassword);
        
        int comprobarCorreo = validation.comprobarCorreo(correo);
        
        if(comprobarCorreo!=0){
            lblLoginEmailMessage.setText("");
            lblLoginMessagePassword.setText("");
        }
        
        switch(comprobarCorreo){
            case 0:{
                lblLoginEmailMessage.setText("Correo incorrecto, intente con @edu");
                break;
            }
            case 1:{
            try {
                loginTeacher(correo, password);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(app.class.getName()).log(Level.SEVERE, null, ex);
            }
                break;
            }
            
        } 
              
    }//GEN-LAST:event_btnLoginLogActionPerformed

    private void loginTeacher(String correo, String password) throws NoSuchAlgorithmException{
        CardLayout card = (CardLayout)mainPanel.getLayout();
        try{
            teacher = teacherService.loginTeacher(correo);
        }catch(Exception e){
            System.out.println(e.getMessage());
            lblLoginEmailMessage.setText("Correo incorrecto");
            return;
        }
        if (validation.comprobarPassword(teacher, password)){
            initTeacher();
            card.show(mainPanel, "teacherApp");      
        }else{
            lblLoginMessagePassword.setText("Contraseña incorrecta");
        }
        
    }
    
    private void lblTeacherShowDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowDashboardMouseClicked
        CardLayout card = (CardLayout)pnlTeacherContent.getLayout();
        initTeacherMenuOpaque(0);
        card.show(pnlTeacherContent, "teacherDashboard");
        teacherTopInfo();
    }//GEN-LAST:event_lblTeacherShowDashboardMouseClicked

    private void lblTeacherShowDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowDashboardMouseEntered
        lblTeacherShowDashboard.setOpaque(true);
        lblTeacherShowDashboard.repaint();
    }//GEN-LAST:event_lblTeacherShowDashboardMouseEntered

    private void lblTeacherShowDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowDashboardMouseExited
        if(currentOpaqueLabel!=0){
            lblTeacherShowDashboard.setOpaque(false);
            lblTeacherShowDashboard.repaint();
        }
    }//GEN-LAST:event_lblTeacherShowDashboardMouseExited

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

    private void lblTeacherLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherLogOutMouseClicked
        CardLayout card = (CardLayout)mainPanel.getLayout();
        teacher = new Teacher();
        card.show(mainPanel, "login");
    }//GEN-LAST:event_lblTeacherLogOutMouseClicked

    private void lblTeacherLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherLogOutMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherLogOutMouseEntered

    private void lblTeacherLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherLogOutMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherLogOutMouseExited

    private void lblTeacherShowGradesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowGradesMouseClicked
        CardLayout card = (CardLayout)pnlTeacherContent.getLayout();
        initTeacherMenuOpaque(1);
        card.show(pnlTeacherContent, "teacherGrades");
        teacherTopInfo();
        initGradesPanel();

    }//GEN-LAST:event_lblTeacherShowGradesMouseClicked

    private void lblTeacherShowGradesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowGradesMouseEntered
        lblTeacherShowGrades.setOpaque(true);
        lblTeacherShowGrades.repaint();
    }//GEN-LAST:event_lblTeacherShowGradesMouseEntered

    private void lblTeacherShowGradesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowGradesMouseExited
        if(currentOpaqueLabel!=2){
            lblTeacherShowGrades.setOpaque(false);
            lblTeacherShowGrades.repaint();
        }
    }//GEN-LAST:event_lblTeacherShowGradesMouseExited

    private void lblTeacherShowHomeworkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowHomeworkMouseClicked
        CardLayout card = (CardLayout)pnlTeacherContent.getLayout();
        initTeacherMenuOpaque(2);
        card.show(pnlTeacherContent, "teacherHomework");
        teacherTopInfo();
        initHomeworkTab();
    }//GEN-LAST:event_lblTeacherShowHomeworkMouseClicked

    private void initHomeworkTab(){
        
        tabbedPaneHomework.setTitleAt(0, "Agregar");
        tabbedPaneHomework.setTitleAt(1, "Consultar / Modificar");
        
        vaciarCBX(cmbBoxHomeworkCourses);
        vaciarCBX(cmbBoxHomeworkSection);
        vaciarCBX(cmbBoxUpdateHomeworkCourses);
        vaciarCBX(cmbBoxUpdateHomeworkSection);
        
        //Fill comboBox no filtro
        for(Course c : teacherCourseList){
            String curso = c.getNombre();
            cmbBoxHomeworkCourses.addItem(curso);
            cmbBoxUpdateHomeworkCourses.addItem(curso);
        }
        
        //Fill comboBox filtro

        for(Seccion s : teacherSeccionList){
            String seccion = String.valueOf(s.getLetra_seccion());
            boolean found = false;
            for(int i = 0; i < cmbBoxHomeworkSection.getItemCount(); i++){
                if(seccion.equals(cmbBoxHomeworkSection.getItemAt(i))){
                    found = true;
                }
            }
            if(!found){
                cmbBoxHomeworkSection.addItem(seccion); 
                cmbBoxUpdateHomeworkSection.addItem(seccion);                
            }

        }
            

        scrollUpdateHomework.getVerticalScrollBar().setUI(new CustomScrollBarUI());
        scrollPaneDescripcionTarea.getVerticalScrollBar().setUI(new CustomScrollBarUI());
    }
    
    private void vaciarCBX(JComboBox comboBox){
            comboBox.removeAllItems();
            comboBox.addItem("--");
    }
    
    private void lblTeacherShowHomeworkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowHomeworkMouseEntered
        lblTeacherShowHomework.setOpaque(true);
        lblTeacherShowHomework.repaint();
    }//GEN-LAST:event_lblTeacherShowHomeworkMouseEntered

    private void lblTeacherShowHomeworkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowHomeworkMouseExited
        if(currentOpaqueLabel!=3){
            lblTeacherShowHomework.setOpaque(false);
            lblTeacherShowHomework.repaint();
        }
    }//GEN-LAST:event_lblTeacherShowHomeworkMouseExited

    private void txtLoginEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoginEmailKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_F1){
            txtLoginEmail.setText("jramirez@edu.com");
            passLoginPassword.setText("clave");
        }
    }//GEN-LAST:event_txtLoginEmailKeyPressed

    private void passLoginPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passLoginPasswordKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             
        }
    }//GEN-LAST:event_passLoginPasswordKeyPressed

    private void lblDashboardCourse1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardCourse1MouseClicked
        CardLayout card = (CardLayout)pnlTeacherContent.getLayout();
        initCoursePage(lblDashboardCourse1.getText());
        card.show(pnlTeacherContent, "teacherCourse");
    }//GEN-LAST:event_lblDashboardCourse1MouseClicked

    private void btnAgregarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTareaActionPerformed
        // TODO add your handling code here:
        int idSeccion = encontrarIDSeccion((String) cmbBoxHomeworkCourses.getSelectedItem(), (String) cmbBoxHomeworkSection.getSelectedItem());
        if(idSeccion ==  0){
            JOptionPane.showMessageDialog(this, "Error en los campos. Agregue una seccion y curso válidos");
            return;
        }
        String titulo = txtAgregarTareaTitulo.getText();
        String descripcion = txtareaAgregarTareaDescripcion.getText();
        Date fechaEntrega = (Date) spinFechaEntrega.getValue();
        
        Tarea tarea = new Tarea();
        tarea.setId_seccion(idSeccion);
        tarea.setTitulo(titulo);
        tarea.setDescripcion(descripcion);
        tarea.setFecha_entrega(fechaEntrega);
        
        try {
            tareaService.createTarea(tarea);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al registrar la tarea. " + ex.getMessage());
        }
        
        JOptionPane.showMessageDialog(this, "Tarea registrada con éxito");
        
        txtAgregarTareaTitulo.setText("");
        txtareaAgregarTareaDescripcion.setText("");
        cmbBoxHomeworkCourses.setSelectedIndex(0);
        cmbBoxHomeworkSection.setSelectedIndex(0);
    }//GEN-LAST:event_btnAgregarTareaActionPerformed

    private void btnConsultarTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarTareasActionPerformed

        int idSeccion = encontrarIDSeccion((String )cmbBoxUpdateHomeworkCourses.getSelectedItem(), (String) cmbBoxUpdateHomeworkSection.getSelectedItem());
        consultarTareasdeCurso(idSeccion);
        
        DefaultListModel<String> model = new DefaultListModel<>();
        
        for(int i = 0; i < teacherHomeworkList.size(); i++){
             model.addElement(teacherHomeworkList.get(i).getTitulo());
        }
        listUpdateTareas.setModel(model);
    }//GEN-LAST:event_btnConsultarTareasActionPerformed

    private void listUpdateTareasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listUpdateTareasValueChanged
        String selectedHomework = listUpdateTareas.getSelectedValue();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        
        for(int i = 0; i<teacherHomeworkList.size(); i++){
            if(teacherHomeworkList.get(i).getTitulo().equals(selectedHomework)){
                txtTareaUpdateTitulo.setText(teacherHomeworkList.get(i).getTitulo());
                txtAreaUpdateTareaDescripcion.setText(teacherHomeworkList.get(i).getDescripcion());
                String fechaAsignacion = sdf.format(teacherHomeworkList.get(i).getFecha_asignacion());
                lblUpdateFechaAsignacion.setText(fechaAsignacion);
                spinnerUpdateTareaFechaEntrega.setValue(teacherHomeworkList.get(i).getFecha_entrega());
            }
        }
    }//GEN-LAST:event_listUpdateTareasValueChanged

    private void btnUpdateTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTareaActionPerformed
     
        int idTarea = 0;
        int idSeccion = 0;
        Date fechaAsignada = null;
     
        Tarea tareaNueva = new Tarea();
        
        for(Tarea tarea : teacherHomeworkList){
            if(tarea.getTitulo().equals(listUpdateTareas.getSelectedValue())){
                idTarea = tarea.getId_tarea();
                idSeccion = tarea.getId_seccion();
                fechaAsignada = tarea.getFecha_asignacion();
                break;
            }
        }        
        
        Date fechaEntrega = (Date) spinnerUpdateTareaFechaEntrega.getValue();
        tareaNueva.setId_tarea(idTarea);
        tareaNueva.setId_seccion(idSeccion);
        tareaNueva.setTitulo(txtTareaUpdateTitulo.getText());
        tareaNueva.setDescripcion(txtAreaUpdateTareaDescripcion.getText());
        tareaNueva.setFecha_asignacion(fechaAsignada);
        tareaNueva.setFecha_entrega(fechaEntrega);
                
        try {
            tareaService.updateTarea(idTarea, tareaNueva);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al actualizar la tarea: " + ex.getMessage());
        }
        JOptionPane.showMessageDialog(this, "Tarea actualizada correctamente.");
     
    }//GEN-LAST:event_btnUpdateTareaActionPerformed

    private void btnCourseAddTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseAddTareaActionPerformed
        CardLayout card = (CardLayout)pnlTeacherContent.getLayout();
        initTeacherMenuOpaque(2);
        card.show(pnlTeacherContent, "teacherHomework");
        teacherTopInfo();
        initHomeworkTab();
    }//GEN-LAST:event_btnCourseAddTareaActionPerformed

    private void lblDashboardCourse2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardCourse2MouseClicked
        CardLayout card = (CardLayout)pnlTeacherContent.getLayout();
        initCoursePage(lblDashboardCourse2.getText());
        card.show(pnlTeacherContent, "teacherCourse");
    }//GEN-LAST:event_lblDashboardCourse2MouseClicked

    private void btnAddGradeBuscarTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGradeBuscarTareasActionPerformed
        if(!cmbBoxRegistrarNotaTipoEvaluacion.getSelectedItem().equals("Tarea")){
            lblAddNotaMissingTarea.setText("Debe elegir tarea");
            return;
        }else{
            lblAddNotaMissingTarea.setText("");
        }
        
        String courseName = (String) cmbCoursesAddGrade.getSelectedItem();
        String seccion = (String) cmbBoxAddGradeSeccion.getSelectedItem();
        
        int seccionID = encontrarIDSeccion(courseName, seccion);
        
        consultarTareasdeCurso(seccionID);
        
        DefaultListModel<String> model = new DefaultListModel<>();
        
        for(int i = 0; i < teacherHomeworkList.size(); i++){
             model.addElement(teacherHomeworkList.get(i).getTitulo());
        }
        listAddGradeHomework.setModel(model);
    }//GEN-LAST:event_btnAddGradeBuscarTareasActionPerformed

    private void btnAddGradeLoadStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGradeLoadStudentsActionPerformed
        // TODO add your handling code here:
        if(cmbBoxRegistrarNotaTipoEvaluacion.getSelectedItem().equals("Tarea")){
            if(listAddGradeHomework.isSelectionEmpty()){
                lblAddNotaMissingTareaSelected.setText("Debe elegir tarea");
                return;
            }else{
                lblAddNotaMissingTareaSelected.setText("");
            }
        }
        
        String curso = (String)cmbCoursesAddGrade.getSelectedItem();
        String seccion = (String)cmbBoxAddGradeSeccion.getSelectedItem();
        
        int seccionID = encontrarIDSeccion(curso, seccion);
        
        try {
            courseStudentList = asignacionService.getStudentsBySection(seccionID);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error cargando estudiantes: "+ ex.getMessage());
        }
        
        DefaultTableModel model;
        model = new DefaultTableModel(new String [] {"Nombre","Carnet","Nota"}, 0);
        tableAddGrades.setModel(model);
        
        for(Student s : courseStudentList){
            model.addRow(new Object []{s.getNombre() +" "+ s.getApellido(), s.getCarnet(), 0});
        }
        
    }//GEN-LAST:event_btnAddGradeLoadStudentsActionPerformed

    private void btnAddGradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGradesActionPerformed
        // TODO add your handling code here:          
        String courseName = (String)cmbCoursesAddGrade.getSelectedItem();
        String seccion = (String)cmbBoxAddGradeSeccion.getSelectedItem();
        int idSeccion = encontrarIDSeccion(courseName, seccion);
        
        try {
            asignacionList = asignacionService.getAsignacionesBySection(idSeccion);
        } catch (Exception ex) {
            Logger.getLogger(app.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String tipoEvaluacion;
        
        if(cmbBoxRegistrarNotaTipoEvaluacion.getSelectedItem().equals("Tarea")){
            tipoEvaluacion = "Tarea [" + listAddGradeHomework.getSelectedValue() + "]";
        }else{
            tipoEvaluacion = (String)cmbBoxRegistrarNotaTipoEvaluacion.getSelectedItem();
        }
        
        for(int i = 0; i < tableAddGrades.getRowCount(); i++){
            Grade nota = new Grade();
            nota.setNota(BigDecimal.valueOf(Double.parseDouble((String)tableAddGrades.getValueAt(i, 2))));
            nota.setTipoEvaluacion(tipoEvaluacion);
            nota.setId_asignacion(asignacionList.get(i).getId_asignacion());
            nota.setFecha(new Date());
            
            try {
                if(isGradeValid(nota)){
                    gradeService.createGrade(nota);
                }else{
                    JOptionPane.showMessageDialog(this, "Notas incorrectas.");
                    return;
                }
            } catch (Exception ex) {
                Logger.getLogger(app.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        JOptionPane.showMessageDialog(this, "Notas registradas correctamente.");
        
        cmbCoursesAddGrade.setSelectedItem("--");
        cmbBoxAddGradeSeccion.setSelectedItem("--");
        cmbBoxRegistrarNotaTipoEvaluacion.setSelectedItem("--");
        listAddGradeHomework.removeAll();
        tableAddGrades.removeAll();
    }//GEN-LAST:event_btnAddGradesActionPerformed

    private void btnSortGradesConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortGradesConsultaActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model;
        model = new DefaultTableModel(new String [] {"Nombre","Carnet","Tarea","Nota"}, 0);
        tableGetUpdateNotes.setModel(model);
        BigDecimal total = BigDecimal.ZERO;
        updateGrade = new ArrayList<>();
        
        for(Grade g : gradeList){
            int idAsignacion = g.getId_asignacion();
            int idEstudiante = 0;
            String nombre = null;
            String apellido = null;
            String carnet = null;
            String tarea = g.getTipoEvaluacion();
            BigDecimal nota = g.getNota();            
            
            for(Asignacion a : asignacionList){
                if(idAsignacion == a.getId_asignacion()){
                    idEstudiante = a.getId_estudiante();
                }
            }     
            for(Student s: courseStudentList){
                if(idEstudiante == s.getId_estudiante()){
                    nombre = s.getNombre();
                    apellido = s.getApellido();
                    carnet = s.getCarnet();
                }
                
            } 
            
            String selectedEstudiante = cmbBoxConsultaNotasEstudiante.getSelectedItem().toString();
            String selectedEvaluacion = cmbBoxConsultaNotasEvaluacion.getSelectedItem().toString();

            Object[] row = { nombre + " " + apellido, carnet, tarea, nota };
            
            if (shouldAddRow(selectedEstudiante, selectedEvaluacion, carnet, tarea)) {
                model.addRow(row);
                updateGrade.add(g);
                total = total.add(nota);              
            }
            
            if(!cmbBoxConsultaNotasEstudiante.getSelectedItem().equals("--")){
                int totalFinal = total.setScale(0, RoundingMode.HALF_UP).intValue();
                txtTotalNotas.setText(String.valueOf(totalFinal));
            }
        }
    }//GEN-LAST:event_btnSortGradesConsultaActionPerformed

    private boolean shouldAddRow(String selectedEstudiante, String selectedEvaluacion, String carnet, String tarea) {       
        if (selectedEstudiante.equals("--")) {
            return matchesEvaluacion(selectedEvaluacion, tarea);
        }

        if (carnet.equals(selectedEstudiante)) {
            return matchesEvaluacion(selectedEvaluacion, tarea);
        }

        return false;
    }

    private boolean matchesEvaluacion(String selectedEvaluacion, String tarea) {
        switch (selectedEvaluacion) {
            case "--":
                return true;
            case "Tarea":
                String[] isTarea = tarea.split("\\[");
                return isTarea[0].equals("Tarea ");
            default:
                return selectedEvaluacion.equals(tarea);
        }
    }
    
    private void btnConsultarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarNotasActionPerformed
        String courseSelected = (String) cmbBoxConsultaNotasCurso.getSelectedItem();
        String section = (String) cmbBoxConsultaNotasLetraSeccion.getSelectedItem();
        
        if (courseSelected == null || courseSelected.equals("--") || section == null || section.equals("--")) {
            JOptionPane.showMessageDialog(this, "Seleccione curso y seccion válidos");
            return;
        }
        
        cmbBoxConsultaNotasEstudiante.setSelectedItem("--");
        
        int idSeccion = encontrarIDSeccion(courseSelected, section);        
        gradeList = new ArrayList<>();
        
        try {
            asignacionList = asignacionService.getAsignacionesBySection(idSeccion);
            courseStudentList = asignacionService.getStudentsBySection(idSeccion);
            for(Asignacion a : asignacionList){
                gradeList.addAll(gradeService.getGradesByAsignacion(a.getId_asignacion()));             
            }
        } catch (Exception ex) {
            Logger.getLogger(app.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        DefaultTableModel model;
        model = new DefaultTableModel(new String [] {"Nombre","Carnet","Tarea","Nota"}, 0);
        tableGetUpdateNotes.setModel(model);
        
        vaciarCBX(cmbBoxConsultaNotasEstudiante);
        for(Student s : courseStudentList){
            cmbBoxConsultaNotasEstudiante.addItem(s.getCarnet());
        }
        updateGrade = new ArrayList<>();
        
        for(Grade g : gradeList){
            int idAsignacion = g.getId_asignacion();
            int idEstudiante = 0;
            String nombre = null;
            String apellido = null;
            String carnet = null;
            String tarea = g.getTipoEvaluacion();
            BigDecimal nota = g.getNota();
             
            for(Asignacion a : asignacionList){
                if(idAsignacion == a.getId_asignacion()){
                    idEstudiante = a.getId_estudiante();
                }
            }     
            for(Student s: courseStudentList){
                if(idEstudiante == s.getId_estudiante()){
                    nombre = s.getNombre();
                    apellido = s.getApellido();
                    carnet = s.getCarnet();
                }
            }
            
            if(cmbBoxConsultaNotasEvaluacion.getSelectedItem().equals("--")){
                model.addRow(new Object[]{nombre + " " +apellido, carnet, tarea, nota});
                updateGrade.add(g);
            }else if(cmbBoxConsultaNotasEvaluacion.getSelectedItem().equals("Tarea")){  
                String [] isTarea = tarea.split("\\[");  
                if(isTarea[0].equals("Tarea ")){
                    model.addRow(new Object[]{nombre + " " +apellido, carnet, tarea, nota});
                    updateGrade.add(g);
                }
            }else{
                if(cmbBoxConsultaNotasEvaluacion.getSelectedItem().equals(tarea)){
                    model.addRow(new Object[]{nombre + " " +apellido, carnet, tarea, nota});
                    updateGrade.add(g);
                }
            }        
         }

    }//GEN-LAST:event_btnConsultarNotasActionPerformed

    private void btnUpdateGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateGradeActionPerformed
        // TODO add your handling code here:
       for(int i = 0; i<updateGrade.size(); i++){ 
           Grade nuevaNota = new Grade(); 
           nuevaNota.setId_grado(updateGrade.get(i).getId_grado());
           Object valor = tableGetUpdateNotes.getValueAt(i, 3);
           if(valor instanceof BigDecimal){
               nuevaNota.setNota((BigDecimal) tableGetUpdateNotes.getValueAt(i, 3)); 
           }else{
               nuevaNota.setNota(BigDecimal.valueOf(Double.parseDouble((String) tableGetUpdateNotes.getValueAt(i, 3))));
           }    
           nuevaNota.setTipoEvaluacion(updateGrade.get(i).getTipoEvaluacion()); 
           nuevaNota.setId_asignacion(updateGrade.get(i).getId_asignacion()); 
           nuevaNota.setFecha(updateGrade.get(i).getFecha());
           
           
           try { 
               if(isGradeValid(nuevaNota)){ 
                   gradeService.updateGrade(updateGrade.get(i).getId_grado(), nuevaNota); 
                }else{
                    System.out.println("Grade invalid for id: " + nuevaNota.getId_grado() + ", value: " + nuevaNota.getNota());
                } 
           } catch (Exception ex){ 
               JOptionPane.showMessageDialog(this, "Error al actualizr las notas: " + ex.getMessage());
               return; 
           } 
       }

        
        JOptionPane.showMessageDialog(this, "Notas actualizadas correctamente.");
        cmbBoxConsultaNotasCurso.setSelectedItem("--");
        cmbBoxConsultaNotasLetraSeccion.setSelectedItem("--");
        cmbBoxConsultaNotasEvaluacion.setSelectedItem("--");
        cmbBoxConsultaNotasEstudiante.setSelectedItem("--");
    }//GEN-LAST:event_btnUpdateGradeActionPerformed
    
    private boolean isGradeValid(Grade nota) throws Exception {

    List<Grade> existingGrades = gradeService.getGradesByAsignacion(nota.getId_asignacion());
    
    BigDecimal total = BigDecimal.ZERO;
    for (Grade grade : existingGrades) {
        if(grade.getId_grado() != nota.getId_grado()){
            total = total.add(grade.getNota());
        }
        
    }
    
    total = total.add(nota.getNota());
    
    return total.compareTo(new BigDecimal(100)) <= 0;
}
    
    private void consultarTareasdeCurso(int idSeccion){
        try {
            teacherHomeworkList = tareaService.getTareasbySeccion(idSeccion);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error cargando tareas: "+ ex.getMessage());
        }
    }
    
    private int encontrarIDSeccion(String courseName, String sectionLetter){
        int cursoID = 0;
        int idSeccion = 0;
        
        for(int i = 0; i < teacherCourseList.size(); i ++){
            if(courseName.equals(teacherCourseList.get(i).getNombre())){
                cursoID = teacherCourseList.get(i).getId_curso();
                break;
            }
        }
        if(cursoID == 0){
            
            return 0;
        }
        for(int i = 0; i < teacherSeccionList.size(); i ++){
            if(sectionLetter.equals(String.valueOf(teacherSeccionList.get(i).getLetra_seccion())) && cursoID == teacherSeccionList.get(i).getId_curso()){
                idSeccion = teacherSeccionList.get(i).getId_seccion();
                break;                  
            }
        }
        
        if(idSeccion == 0){
            System.out.println("seccion 0");
            return 0;
        }
        
        return idSeccion;
    }
    
    private void courseStudentTable(Seccion seccion){
        try {
            courseStudentList = asignacionService.getStudentsBySection(seccion.getId_seccion());
        } catch (Exception ex) {
            Logger.getLogger(app.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DefaultTableModel table;
        table = new DefaultTableModel(new String[]{"Nombre","Apellido","Carnet"}, 0);   
        tableCourseStudents.setModel(table);
        
        for(Student s : courseStudentList){
            table.addRow(new Object[]{s.getNombre(),s.getApellido(),s.getCarnet()});
        }
        
        changeTableLook(tableCourseStudents);
        
        scrollTableCourseStudents.getVerticalScrollBar().setUI(new CustomScrollBarUI());
    }
    
    
    private void initTeacher(){
        initTeacherMenuOpaque(0);
        teacherTopInfo();
        initTeacherLists();
        initDashBoardCourses();
    }
    
    private void initTeacherMenuOpaque(int option){
        List<JLabel> labelList;
        labelList = new ArrayList<>();
        labelList.add(lblTeacherShowDashboard);
        labelList.add(lblTeacherShowGrades);
        labelList.add(lblTeacherShowHomework);
              
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
                lblTeacherTopInfo.setText("Notas");
                lblTeacherTopInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendance.png"))); //TODO
                break;
            }
            case 2:{
                lblTeacherTopInfo.setText("Tareas");
                lblTeacherTopInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendance.png"))); //TODO
                break;
            }
        }
    }
    
    private void changeTableLook(JTable table){
    table.setShowVerticalLines(true);
    table.setShowHorizontalLines(true);
        
    table.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, 
            boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        setOpaque(true);
        setBackground(new Color(20, 20, 20)); // Dark background
        setForeground(new Color(255, 255, 255)); // White text (changed from black)
        setFont(new Font("Sitka Small", Font.BOLD, 12));
        setHorizontalAlignment(JLabel.CENTER); // Optional: center align text
        return this;
    }
    });
    }
    
    private void initTeacherLists(){
        int teacherID = teacher.getId_profesor();
        teacherCourseList = new ArrayList<>();
        teacherSeccionList = new ArrayList<>();

        try {
            teacherSeccionList = seccionService.getTeacherCourses(teacherID);
            for(int i = 0; i < teacherSeccionList.size(); i++){
                teacherCourseList.add(courseService.getOne(teacherSeccionList.get(i).getId_curso()));
            }
        } catch (Exception ex) {
            System.out.println("Exception : " + ex.getMessage());
        }

    }
    
    private void initDashBoardCourses(){
        List<JLabel> titleLabels;
        titleLabels = new ArrayList<>();
        titleLabels.add(lblDashboardCourse1);
        titleLabels.add(lblDashboardCourse2);
        titleLabels.add(lblDashboardCourse3);
        titleLabels.add(lblDashboardCourse4);
        titleLabels.add(lblDashboardCourse5);
        titleLabels.add(lblDashboardCourse6);
        
        List<JLabel> seccionLabels;
        seccionLabels = new ArrayList<>();
        seccionLabels.add(lblSeccion1);
        seccionLabels.add(lblSeccion2);
        seccionLabels.add(lblSeccion3);
        seccionLabels.add(lblSeccion4);
        seccionLabels.add(lblSeccion5);
        seccionLabels.add(lblSeccion6);
        
        for(int i = 0; i < teacherCourseList.size(); i++){
            titleLabels.get(i).setText(teacherCourseList.get(i).getNombre());
            seccionLabels.get(i).setText("Sección: " + String.valueOf(teacherSeccionList.get(i).getLetra_seccion()));
        }
    }
    
    private void initCoursePage(String courseName){
        Course c;
        Seccion seccion = new Seccion();
        
        scrollPaneTeacherCourse.getVerticalScrollBar().setUI(new CustomScrollBarUI());
        
        //Course information
        for(int i = 0; i<teacherCourseList.size(); i++){
            if(teacherCourseList.get(i).getNombre().equals(courseName)){
                c = teacherCourseList.get(i);
                seccion = teacherSeccionList.get(i);
                lblCoursePageTitle.setText(courseName);
                lblCourseCode.setText(c.getCodigo());
                lblCourseSeccion.setText(String.valueOf(seccion.getLetra_seccion()));
                lblCourseSemester.setText(c.getSemestre());
            }
        }
        //Students in the course
        courseStudentTable(seccion);
        
        //Tareas in the course
        courseTareasTable(seccion);
        //TODO
    }
    
    private void courseTareasTable(Seccion seccion){
        try {
            teacherHomeworkList = tareaService.getTareasbySeccion(seccion.getId_seccion());
        } catch (Exception ex) {
            Logger.getLogger(app.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DefaultTableModel model;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        
        model = new DefaultTableModel(new String [] {"Titulo", "Fecha de Asignacion","Fecha de Entrega"}, 0);
        tableCourseTareaList.setModel(model);
        
        model.setRowCount(0);
        
        for(Tarea t : teacherHomeworkList){
            
            String fechaAsignacion = sdf.format(t.getFecha_asignacion());
            String fechaEntrega = sdf.format(t.getFecha_entrega());
            model.addRow(new Object[]{t.getTitulo(),fechaAsignacion, fechaEntrega});
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
    private javax.swing.JPanel adminApp;
    private javax.swing.JButton btnAddGradeBuscarTareas;
    private javax.swing.JButton btnAddGradeLoadStudents;
    private javax.swing.JButton btnAddGrades;
    private javax.swing.JButton btnAgregarTarea;
    private javax.swing.JButton btnConsultarNotas;
    private javax.swing.JButton btnConsultarTareas;
    private javax.swing.JButton btnCourseAddTarea;
    private javax.swing.JButton btnLoginLog;
    private javax.swing.JButton btnSortGradesConsulta;
    private javax.swing.JButton btnUpdateGrade;
    private javax.swing.JButton btnUpdateTarea;
    private javax.swing.JComboBox<String> cmbBoxAddGradeSeccion;
    private javax.swing.JComboBox<String> cmbBoxConsultaNotasCurso;
    private javax.swing.JComboBox<String> cmbBoxConsultaNotasEstudiante;
    private javax.swing.JComboBox<String> cmbBoxConsultaNotasEvaluacion;
    private javax.swing.JComboBox<String> cmbBoxConsultaNotasLetraSeccion;
    private javax.swing.JComboBox<String> cmbBoxHomeworkCourses;
    private javax.swing.JComboBox<String> cmbBoxHomeworkSection;
    private javax.swing.JComboBox<String> cmbBoxRegistrarNotaTipoEvaluacion;
    private javax.swing.JComboBox<String> cmbBoxUpdateHomeworkCourses;
    private javax.swing.JComboBox<String> cmbBoxUpdateHomeworkSection;
    private javax.swing.JComboBox<String> cmbCoursesAddGrade;
    private javax.swing.JPanel course;
    private javax.swing.JPanel dashboard;
    private javax.swing.JPanel grades;
    private javax.swing.JPanel homework;
    private javax.swing.JPanel inSesion;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblAddNotaMissingTarea;
    private javax.swing.JLabel lblAddNotaMissingTareaSelected;
    private javax.swing.JLabel lblCourseCode;
    private javax.swing.JLabel lblCoursePCodigo;
    private javax.swing.JLabel lblCoursePCodigo1;
    private javax.swing.JLabel lblCoursePSeccion;
    private javax.swing.JLabel lblCoursePageTitle;
    private javax.swing.JLabel lblCourseSeccion;
    private javax.swing.JLabel lblCourseSemester;
    private javax.swing.JLabel lblDashboardCourse1;
    private javax.swing.JLabel lblDashboardCourse2;
    private javax.swing.JLabel lblDashboardCourse3;
    private javax.swing.JLabel lblDashboardCourse4;
    private javax.swing.JLabel lblDashboardCourse5;
    private javax.swing.JLabel lblDashboardCourse6;
    private javax.swing.JLabel lblDashboardTitleCursos;
    private javax.swing.JLabel lblIconEmail;
    private javax.swing.JLabel lblIconPassword;
    private javax.swing.JLabel lblLoginEmailMessage;
    private javax.swing.JLabel lblLoginMessagePassword;
    private javax.swing.JLabel lblLoginShowHide;
    private javax.swing.JLabel lblLoginTitle;
    private javax.swing.JLabel lblLoginTopInfo;
    private javax.swing.JLabel lblSeccion1;
    private javax.swing.JLabel lblSeccion2;
    private javax.swing.JLabel lblSeccion3;
    private javax.swing.JLabel lblSeccion4;
    private javax.swing.JLabel lblSeccion5;
    private javax.swing.JLabel lblSeccion6;
    private javax.swing.JLabel lblTeacherLogOut;
    private javax.swing.JLabel lblTeacherShowDashboard;
    private javax.swing.JLabel lblTeacherShowGrades;
    private javax.swing.JLabel lblTeacherShowHomework;
    private javax.swing.JLabel lblTeacherTopInfo;
    private javax.swing.JLabel lblUpdateFechaAsignacion;
    private javax.swing.JList<String> listAddGradeHomework;
    private javax.swing.JList<String> listUpdateTareas;
    private javax.swing.JPanel login;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPasswordField passLoginPassword;
    private javax.swing.JPanel pnlAddHomework;
    private javax.swing.JPanel pnlAttendanceAdd1;
    private javax.swing.JPanel pnlAttendanceCheckUpdate1;
    private javax.swing.JPanel pnlDashboardCourse1;
    private javax.swing.JPanel pnlDashboardCourse2;
    private javax.swing.JPanel pnlDashboardCourse3;
    private javax.swing.JPanel pnlDashboardCourse4;
    private javax.swing.JPanel pnlDashboardCourse5;
    private javax.swing.JPanel pnlDashboardCourse6;
    private javax.swing.JPanel pnlLogintab;
    private javax.swing.JPanel pnlTeacherContent;
    private javax.swing.JPanel pnlTeacherInfo;
    private javax.swing.JPanel pnlTeacherTop;
    private javax.swing.JPanel pnlUpdateHomework;
    private javax.swing.JScrollPane scrollPaneAddGradesTable;
    private javax.swing.JScrollPane scrollPaneDescripcionTarea;
    private javax.swing.JScrollPane scrollPaneGrades;
    private javax.swing.JScrollPane scrollPaneTeacherCourse;
    private javax.swing.JScrollPane scrollTableConsultaNotas;
    private javax.swing.JScrollPane scrollTableCourseStudents;
    private javax.swing.JScrollPane scrollUpdateHomework;
    private javax.swing.JSpinner spinFechaEntrega;
    private javax.swing.JSpinner spinnerUpdateTareaFechaEntrega;
    private javax.swing.JTabbedPane tabbedPaneHomework;
    private javax.swing.JTabbedPane tabbedPaneNotas;
    private javax.swing.JTable tableAddGrades;
    private javax.swing.JTable tableCourseStudents;
    private javax.swing.JTable tableCourseTareaList;
    private javax.swing.JTable tableGetUpdateNotes;
    private javax.swing.JPanel teacherApp;
    private javax.swing.JTextField txtAgregarTareaTitulo;
    private javax.swing.JTextArea txtAreaUpdateTareaDescripcion;
    private javax.swing.JTextField txtLoginEmail;
    private javax.swing.JTextField txtTareaUpdateTitulo;
    private javax.swing.JTextField txtTotalNotas;
    private javax.swing.JTextArea txtareaAgregarTareaDescripcion;
    // End of variables declaration//GEN-END:variables

    private void initGradesPanel() {
        //TODO
        vaciarCBX(cmbCoursesAddGrade);
        vaciarCBX(cmbBoxAddGradeSeccion);
        vaciarCBX(cmbBoxConsultaNotasCurso);
        vaciarCBX(cmbBoxConsultaNotasLetraSeccion);
        
        for(Course c : teacherCourseList){
            String curso = c.getNombre();
            cmbCoursesAddGrade.addItem(curso);
            cmbBoxConsultaNotasCurso.addItem(curso);
        }

        for(Seccion s : teacherSeccionList){
            String seccion = String.valueOf(s.getLetra_seccion());
            boolean found = false;
            for(int i = 0; i < cmbBoxAddGradeSeccion.getItemCount(); i++){
                if(seccion.equals(cmbBoxAddGradeSeccion.getItemAt(i))){
                    found = true;
                }
            }
            if(!found){
                cmbBoxAddGradeSeccion.addItem(seccion);
                cmbBoxConsultaNotasLetraSeccion.addItem(seccion);
            }
        }
        
        scrollPaneGrades.getVerticalScrollBar().setUI(new CustomScrollBarUI());
        scrollTableConsultaNotas.getVerticalScrollBar().setUI(new CustomScrollBarUI());
        
        DefaultTableModel model;
        model = new DefaultTableModel(new String [] {"Nombre","Carnet","Nota"}, 0);
        tableAddGrades.setModel(model);
        
        DefaultTableModel model2;
        model2 = new DefaultTableModel(new String [] {"Nombre","Carnet","Tarea","Nota"}, 0);
        tableGetUpdateNotes.setModel(model2);
        
        tableAddGrades.getColumn("Nombre").setPreferredWidth(200);
        changeTableLook(tableAddGrades);
        changeTableLook(tableGetUpdateNotes);
    }
}

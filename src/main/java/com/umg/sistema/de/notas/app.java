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

        jLabel94 = new javax.swing.JLabel();
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
        pnlTeacherTop1 = new javax.swing.JPanel();
        lblTeacherTopInfo1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnlTeacherInfo1 = new javax.swing.JPanel();
        lblTeacherShowDashboard1 = new javax.swing.JLabel();
        lblTeacherLogOut1 = new javax.swing.JLabel();
        lblTeacherShowGrades1 = new javax.swing.JLabel();
        lblTeacherShowHomework1 = new javax.swing.JLabel();
        lblTeacherShowHomework2 = new javax.swing.JLabel();
        lblTeacherShowHomework3 = new javax.swing.JLabel();
        lblTeacherShowHomework4 = new javax.swing.JLabel();
        pnlTeacherContent1 = new javax.swing.JPanel();
        dashboard1 = new javax.swing.JPanel();
        lblDashboardTitleCursos1 = new javax.swing.JLabel();
        pnlDashboardCourse7 = new javax.swing.JPanel();
        lblDashboardCourse7 = new javax.swing.JLabel();
        lblSeccion7 = new javax.swing.JLabel();
        pnlDashboardCourse8 = new javax.swing.JPanel();
        lblDashboardCourse8 = new javax.swing.JLabel();
        lblSeccion8 = new javax.swing.JLabel();
        pnlDashboardCourse9 = new javax.swing.JPanel();
        lblDashboardCourse9 = new javax.swing.JLabel();
        lblSeccion9 = new javax.swing.JLabel();
        pnlDashboardCourse10 = new javax.swing.JPanel();
        lblDashboardCourse10 = new javax.swing.JLabel();
        lblSeccion10 = new javax.swing.JLabel();
        pnlDashboardCourse11 = new javax.swing.JPanel();
        lblDashboardCourse11 = new javax.swing.JLabel();
        lblSeccion11 = new javax.swing.JLabel();
        pnlDashboardCourse12 = new javax.swing.JPanel();
        lblDashboardCourse12 = new javax.swing.JLabel();
        lblSeccion12 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        homework1 = new javax.swing.JPanel();
        tabbedPaneHomework1 = new javax.swing.JTabbedPane();
        pnlAddHomework1 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        cmbBoxHomeworkCourses1 = new javax.swing.JComboBox<>();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        txtAgregarTareaTitulo1 = new javax.swing.JTextField();
        scrollPaneDescripcionTarea1 = new javax.swing.JScrollPane();
        txtareaAgregarTareaDescripcion1 = new javax.swing.JTextArea();
        spinFechaEntrega1 = new javax.swing.JSpinner();
        btnAgregarTarea1 = new javax.swing.JButton();
        cmbBoxHomeworkSection1 = new javax.swing.JComboBox<>();
        pnlUpdateHomework1 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        cmbBoxUpdateHomeworkCourses1 = new javax.swing.JComboBox<>();
        jLabel75 = new javax.swing.JLabel();
        cmbBoxUpdateHomeworkSection1 = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        listUpdateTareas1 = new javax.swing.JList<>();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel76 = new javax.swing.JLabel();
        txtTareaUpdateTitulo1 = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        scrollUpdateHomework1 = new javax.swing.JScrollPane();
        txtAreaUpdateTareaDescripcion1 = new javax.swing.JTextArea();
        jLabel78 = new javax.swing.JLabel();
        lblUpdateFechaAsignacion1 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        spinnerUpdateTareaFechaEntrega1 = new javax.swing.JSpinner();
        btnUpdateTarea1 = new javax.swing.JButton();
        btnConsultarTareas1 = new javax.swing.JButton();
        scrollPaneTeacherCourse1 = new javax.swing.JScrollPane();
        course1 = new javax.swing.JPanel();
        lblCoursePageTitle1 = new javax.swing.JLabel();
        lblCoursePSeccion1 = new javax.swing.JLabel();
        lblCoursePCodigo2 = new javax.swing.JLabel();
        lblCourseCode1 = new javax.swing.JLabel();
        lblCourseSeccion1 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel43 = new javax.swing.JLabel();
        lblCoursePCodigo3 = new javax.swing.JLabel();
        lblCourseSemester1 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableCourseTareaList1 = new javax.swing.JTable();
        btnCourseAddTarea1 = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel54 = new javax.swing.JLabel();
        scrollTableCourseStudents1 = new javax.swing.JScrollPane();
        tableCourseStudents1 = new javax.swing.JTable();
        scrollPaneGrades1 = new javax.swing.JScrollPane();
        grades1 = new javax.swing.JPanel();
        tabbedPaneNotas1 = new javax.swing.JTabbedPane();
        pnlAttendanceAdd2 = new javax.swing.JPanel();
        scrollPaneAddGradesTable1 = new javax.swing.JScrollPane();
        tableAddGrades1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        cmbCoursesAddGrade1 = new javax.swing.JComboBox<>();
        cmbBoxRegistrarNotaTipoEvaluacion1 = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        btnAddGrades1 = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel80 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        listAddGradeHomework1 = new javax.swing.JList<>();
        jLabel34 = new javax.swing.JLabel();
        cmbBoxAddGradeSeccion1 = new javax.swing.JComboBox<>();
        btnAddGradeBuscarTareas1 = new javax.swing.JButton();
        btnAddGradeLoadStudents1 = new javax.swing.JButton();
        lblAddNotaMissingTareaSelected1 = new javax.swing.JLabel();
        lblAddNotaMissingTarea1 = new javax.swing.JLabel();
        pnlAttendanceCheckUpdate2 = new javax.swing.JPanel();
        scrollTableConsultaNotas1 = new javax.swing.JScrollPane();
        tableGetUpdateNotes1 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        cmbBoxConsultaNotasCurso1 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cmbBoxConsultaNotasEstudiante1 = new javax.swing.JComboBox<>();
        btnUpdateGrade1 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        cmbBoxConsultaNotasEvaluacion1 = new javax.swing.JComboBox<>();
        txtTotalNotas1 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        btnConsultarNotas1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        cmbBoxConsultaNotasLetraSeccion1 = new javax.swing.JComboBox<>();
        btnSortGradesConsulta1 = new javax.swing.JButton();
        profesoresCRUD = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Actualiza = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Agregar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        estudiantesCRUD = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        agregarEstudiante = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        actualizarEstudiante = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        cursoCRUD = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        Consultar = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel93 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        seccionesCRUD = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        asignacionesCRUD = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();

        jLabel94.setText("jLabel94");

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
        lblDashboardTitleCursos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardTitleCursos.setText("Cursos");
        lblDashboardTitleCursos.setToolTipText("");
        lblDashboardTitleCursos.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        pnlDashboardCourse4.setBackground(new java.awt.Color(236, 231, 220));
        pnlDashboardCourse4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 15, 11), 1, true));
        pnlDashboardCourse4.setPreferredSize(new java.awt.Dimension(170, 100));

        lblDashboardCourse4.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblDashboardCourse4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardCourse4.setText("Curso 4");

        lblSeccion4.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
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
        lblDashboardCourse5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardCourse5.setText("Curso 5");

        lblSeccion5.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
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
        lblDashboardCourse6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardCourse6.setText("Curso 6");

        lblSeccion6.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
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
        lblDashboardCourse1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardCourse1.setText("Curso 1");
        lblDashboardCourse1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardCourse1MouseClicked(evt);
            }
        });

        lblSeccion1.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
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
        lblDashboardCourse2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardCourse2.setText("Curso 2");
        lblDashboardCourse2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardCourse2MouseClicked(evt);
            }
        });

        lblSeccion2.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
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
        lblDashboardCourse3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardCourse3.setText("Curso 3");

        lblSeccion3.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
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

        adminApp.setLayout(null);

        pnlTeacherTop1.setBackground(new java.awt.Color(53, 36, 97));
        pnlTeacherTop1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlTeacherTop1.setForeground(new java.awt.Color(255, 255, 255));

        lblTeacherTopInfo1.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblTeacherTopInfo1.setForeground(new java.awt.Color(236, 231, 220));
        lblTeacherTopInfo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard.png"))); // NOI18N
        lblTeacherTopInfo1.setText("Dashboard");
        lblTeacherTopInfo1.setMaximumSize(new java.awt.Dimension(93, 30));
        lblTeacherTopInfo1.setMinimumSize(new java.awt.Dimension(93, 30));
        lblTeacherTopInfo1.setPreferredSize(new java.awt.Dimension(93, 30));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Profesor");

        javax.swing.GroupLayout pnlTeacherTop1Layout = new javax.swing.GroupLayout(pnlTeacherTop1);
        pnlTeacherTop1.setLayout(pnlTeacherTop1Layout);
        pnlTeacherTop1Layout.setHorizontalGroup(
            pnlTeacherTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTeacherTop1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255)
                .addComponent(lblTeacherTopInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(313, Short.MAX_VALUE))
        );
        pnlTeacherTop1Layout.setVerticalGroup(
            pnlTeacherTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTeacherTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblTeacherTopInfo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        adminApp.add(pnlTeacherTop1);
        pnlTeacherTop1.setBounds(0, 0, 800, 30);

        pnlTeacherInfo1.setBackground(new java.awt.Color(53, 36, 97));

        lblTeacherShowDashboard1.setBackground(new java.awt.Color(35, 151, 155));
        lblTeacherShowDashboard1.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblTeacherShowDashboard1.setForeground(new java.awt.Color(252, 255, 252));
        lblTeacherShowDashboard1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTeacherShowDashboard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconTeacherDashboard.png"))); // NOI18N
        lblTeacherShowDashboard1.setText("Dashboard");
        lblTeacherShowDashboard1.setFocusable(false);
        lblTeacherShowDashboard1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lblTeacherShowDashboard1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTeacherShowDashboard1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTeacherShowDashboard1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTeacherShowDashboard1MouseExited(evt);
            }
        });

        lblTeacherLogOut1.setBackground(new java.awt.Color(35, 151, 155));
        lblTeacherLogOut1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblTeacherLogOut1.setForeground(new java.awt.Color(255, 102, 102));
        lblTeacherLogOut1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTeacherLogOut1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        lblTeacherLogOut1.setText("Cerrar Sesión");
        lblTeacherLogOut1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTeacherLogOut1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTeacherLogOut1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTeacherLogOut1MouseExited(evt);
            }
        });

        lblTeacherShowGrades1.setBackground(new java.awt.Color(35, 151, 155));
        lblTeacherShowGrades1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblTeacherShowGrades1.setForeground(new java.awt.Color(252, 255, 252));
        lblTeacherShowGrades1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTeacherShowGrades1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconTeacherAttendance.png"))); // NOI18N
        lblTeacherShowGrades1.setText("Profesores");
        lblTeacherShowGrades1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTeacherShowGrades1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTeacherShowGrades1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTeacherShowGrades1MouseExited(evt);
            }
        });

        lblTeacherShowHomework1.setBackground(new java.awt.Color(35, 151, 155));
        lblTeacherShowHomework1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblTeacherShowHomework1.setForeground(new java.awt.Color(252, 255, 252));
        lblTeacherShowHomework1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTeacherShowHomework1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconTeacherAttendance.png"))); // NOI18N
        lblTeacherShowHomework1.setText("Cursos");
        lblTeacherShowHomework1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTeacherShowHomework1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTeacherShowHomework1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTeacherShowHomework1MouseExited(evt);
            }
        });

        lblTeacherShowHomework2.setBackground(new java.awt.Color(35, 151, 155));
        lblTeacherShowHomework2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblTeacherShowHomework2.setForeground(new java.awt.Color(252, 255, 252));
        lblTeacherShowHomework2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTeacherShowHomework2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconTeacherAttendance.png"))); // NOI18N
        lblTeacherShowHomework2.setText("Estudiantes");
        lblTeacherShowHomework2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTeacherShowHomework2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTeacherShowHomework2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTeacherShowHomework2MouseExited(evt);
            }
        });

        lblTeacherShowHomework3.setBackground(new java.awt.Color(35, 151, 155));
        lblTeacherShowHomework3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblTeacherShowHomework3.setForeground(new java.awt.Color(252, 255, 252));
        lblTeacherShowHomework3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTeacherShowHomework3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconTeacherAttendance.png"))); // NOI18N
        lblTeacherShowHomework3.setText("Asignaciones");
        lblTeacherShowHomework3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTeacherShowHomework3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTeacherShowHomework3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTeacherShowHomework3MouseExited(evt);
            }
        });

        lblTeacherShowHomework4.setBackground(new java.awt.Color(35, 151, 155));
        lblTeacherShowHomework4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblTeacherShowHomework4.setForeground(new java.awt.Color(252, 255, 252));
        lblTeacherShowHomework4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTeacherShowHomework4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconTeacherAttendance.png"))); // NOI18N
        lblTeacherShowHomework4.setText("Secciones");
        lblTeacherShowHomework4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTeacherShowHomework4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTeacherShowHomework4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTeacherShowHomework4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlTeacherInfo1Layout = new javax.swing.GroupLayout(pnlTeacherInfo1);
        pnlTeacherInfo1.setLayout(pnlTeacherInfo1Layout);
        pnlTeacherInfo1Layout.setHorizontalGroup(
            pnlTeacherInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTeacherInfo1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlTeacherInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTeacherShowDashboard1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(lblTeacherShowGrades1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTeacherShowHomework1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(pnlTeacherInfo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTeacherLogOut1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlTeacherInfo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTeacherShowHomework3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTeacherInfo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTeacherShowHomework4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlTeacherInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlTeacherInfo1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblTeacherShowHomework2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(10, 10, 10)))
        );
        pnlTeacherInfo1Layout.setVerticalGroup(
            pnlTeacherInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTeacherInfo1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTeacherShowDashboard1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTeacherShowGrades1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(lblTeacherShowHomework1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTeacherShowHomework4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTeacherShowHomework3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(lblTeacherLogOut1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(213, Short.MAX_VALUE))
            .addGroup(pnlTeacherInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlTeacherInfo1Layout.createSequentialGroup()
                    .addGap(121, 121, 121)
                    .addComponent(lblTeacherShowHomework2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(444, Short.MAX_VALUE)))
        );

        adminApp.add(pnlTeacherInfo1);
        pnlTeacherInfo1.setBounds(0, 0, 230, 600);

        pnlTeacherContent1.setBackground(new java.awt.Color(35, 151, 155));
        pnlTeacherContent1.setLayout(new java.awt.CardLayout());

        dashboard1.setBackground(new java.awt.Color(35, 151, 155));

        lblDashboardTitleCursos1.setBackground(new java.awt.Color(255, 255, 255));
        lblDashboardTitleCursos1.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        lblDashboardTitleCursos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardTitleCursos1.setText("Cursos");
        lblDashboardTitleCursos1.setToolTipText("");
        lblDashboardTitleCursos1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        pnlDashboardCourse7.setBackground(new java.awt.Color(236, 231, 220));
        pnlDashboardCourse7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 15, 11), 1, true));
        pnlDashboardCourse7.setPreferredSize(new java.awt.Dimension(170, 100));

        lblDashboardCourse7.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblDashboardCourse7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardCourse7.setText("Curso 4");

        lblSeccion7.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        lblSeccion7.setText("Seccion");

        javax.swing.GroupLayout pnlDashboardCourse7Layout = new javax.swing.GroupLayout(pnlDashboardCourse7);
        pnlDashboardCourse7.setLayout(pnlDashboardCourse7Layout);
        pnlDashboardCourse7Layout.setHorizontalGroup(
            pnlDashboardCourse7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDashboardCourse7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse7, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlDashboardCourse7Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lblSeccion7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDashboardCourse7Layout.setVerticalGroup(
            pnlDashboardCourse7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSeccion7)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pnlDashboardCourse8.setBackground(new java.awt.Color(236, 231, 220));
        pnlDashboardCourse8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 15, 11), 1, true));
        pnlDashboardCourse8.setPreferredSize(new java.awt.Dimension(170, 100));

        lblDashboardCourse8.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblDashboardCourse8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardCourse8.setText("Curso 5");

        lblSeccion8.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        lblSeccion8.setText("Seccion");

        javax.swing.GroupLayout pnlDashboardCourse8Layout = new javax.swing.GroupLayout(pnlDashboardCourse8);
        pnlDashboardCourse8.setLayout(pnlDashboardCourse8Layout);
        pnlDashboardCourse8Layout.setHorizontalGroup(
            pnlDashboardCourse8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse8, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlDashboardCourse8Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lblSeccion8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDashboardCourse8Layout.setVerticalGroup(
            pnlDashboardCourse8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSeccion8)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pnlDashboardCourse9.setBackground(new java.awt.Color(236, 231, 220));
        pnlDashboardCourse9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 15, 11), 1, true));
        pnlDashboardCourse9.setForeground(new java.awt.Color(19, 122, 127));
        pnlDashboardCourse9.setPreferredSize(new java.awt.Dimension(170, 100));

        lblDashboardCourse9.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblDashboardCourse9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardCourse9.setText("Curso 6");

        lblSeccion9.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        lblSeccion9.setText("Seccion");

        javax.swing.GroupLayout pnlDashboardCourse9Layout = new javax.swing.GroupLayout(pnlDashboardCourse9);
        pnlDashboardCourse9.setLayout(pnlDashboardCourse9Layout);
        pnlDashboardCourse9Layout.setHorizontalGroup(
            pnlDashboardCourse9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse9, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDashboardCourse9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSeccion9)
                .addGap(60, 60, 60))
        );
        pnlDashboardCourse9Layout.setVerticalGroup(
            pnlDashboardCourse9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSeccion9)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pnlDashboardCourse10.setBackground(new java.awt.Color(236, 231, 220));
        pnlDashboardCourse10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 15, 11), 1, true));
        pnlDashboardCourse10.setPreferredSize(new java.awt.Dimension(170, 100));

        lblDashboardCourse10.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblDashboardCourse10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardCourse10.setText("Curso 1");
        lblDashboardCourse10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardCourse10MouseClicked(evt);
            }
        });

        lblSeccion10.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        lblSeccion10.setText("Seccion");

        javax.swing.GroupLayout pnlDashboardCourse10Layout = new javax.swing.GroupLayout(pnlDashboardCourse10);
        pnlDashboardCourse10.setLayout(pnlDashboardCourse10Layout);
        pnlDashboardCourse10Layout.setHorizontalGroup(
            pnlDashboardCourse10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse10, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlDashboardCourse10Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lblSeccion10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDashboardCourse10Layout.setVerticalGroup(
            pnlDashboardCourse10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSeccion10)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pnlDashboardCourse11.setBackground(new java.awt.Color(236, 231, 220));
        pnlDashboardCourse11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 15, 11), 1, true));
        pnlDashboardCourse11.setPreferredSize(new java.awt.Dimension(170, 100));

        lblDashboardCourse11.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblDashboardCourse11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardCourse11.setText("Curso 2");
        lblDashboardCourse11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardCourse11MouseClicked(evt);
            }
        });

        lblSeccion11.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        lblSeccion11.setText("Seccion");

        javax.swing.GroupLayout pnlDashboardCourse11Layout = new javax.swing.GroupLayout(pnlDashboardCourse11);
        pnlDashboardCourse11.setLayout(pnlDashboardCourse11Layout);
        pnlDashboardCourse11Layout.setHorizontalGroup(
            pnlDashboardCourse11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse11, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlDashboardCourse11Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lblSeccion11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDashboardCourse11Layout.setVerticalGroup(
            pnlDashboardCourse11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSeccion11)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pnlDashboardCourse12.setBackground(new java.awt.Color(236, 231, 220));
        pnlDashboardCourse12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 15, 11), 1, true));
        pnlDashboardCourse12.setForeground(new java.awt.Color(19, 122, 127));
        pnlDashboardCourse12.setPreferredSize(new java.awt.Dimension(170, 100));

        lblDashboardCourse12.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblDashboardCourse12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardCourse12.setText("Curso 3");

        lblSeccion12.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        lblSeccion12.setText("Seccion");

        javax.swing.GroupLayout pnlDashboardCourse12Layout = new javax.swing.GroupLayout(pnlDashboardCourse12);
        pnlDashboardCourse12.setLayout(pnlDashboardCourse12Layout);
        pnlDashboardCourse12Layout.setHorizontalGroup(
            pnlDashboardCourse12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse12, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlDashboardCourse12Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lblSeccion12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDashboardCourse12Layout.setVerticalGroup(
            pnlDashboardCourse12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboardCourse12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSeccion12)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout dashboard1Layout = new javax.swing.GroupLayout(dashboard1);
        dashboard1.setLayout(dashboard1Layout);
        dashboard1Layout.setHorizontalGroup(
            dashboard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboard1Layout.createSequentialGroup()
                .addGroup(dashboard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDashboardTitleCursos1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashboard1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashboard1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(pnlDashboardCourse10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(pnlDashboardCourse11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(pnlDashboardCourse12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashboard1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(pnlDashboardCourse7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(pnlDashboardCourse8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(pnlDashboardCourse9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        dashboard1Layout.setVerticalGroup(
            dashboard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboard1Layout.createSequentialGroup()
                .addComponent(lblDashboardTitleCursos1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(dashboard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDashboardCourse10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDashboardCourse11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDashboardCourse12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(dashboard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDashboardCourse7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDashboardCourse8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDashboardCourse9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(310, Short.MAX_VALUE))
        );

        pnlTeacherContent1.add(dashboard1, "teacherDashboard");

        tabbedPaneHomework1.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        tabbedPaneHomework1.setName(""); // NOI18N

        jLabel42.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        jLabel42.setText("Agregar Tarea");

        jLabel49.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel49.setText("Curso:");

        cmbBoxHomeworkCourses1.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        cmbBoxHomeworkCourses1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));

        jLabel50.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel50.setText("Sección:");

        jLabel51.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel51.setText("Titulo:");

        jLabel52.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel52.setText("Descripcion:");

        jLabel53.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel53.setText("Fecha de entrega:");

        txtAgregarTareaTitulo1.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N

        txtareaAgregarTareaDescripcion1.setColumns(20);
        txtareaAgregarTareaDescripcion1.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        txtareaAgregarTareaDescripcion1.setLineWrap(true);
        txtareaAgregarTareaDescripcion1.setRows(5);
        txtareaAgregarTareaDescripcion1.setWrapStyleWord(true);
        scrollPaneDescripcionTarea1.setViewportView(txtareaAgregarTareaDescripcion1);

        spinFechaEntrega1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        spinFechaEntrega1.setModel(new javax.swing.SpinnerDateModel());

        btnAgregarTarea1.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        btnAgregarTarea1.setText("Agregar Tarea");
        btnAgregarTarea1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTarea1ActionPerformed(evt);
            }
        });

        cmbBoxHomeworkSection1.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        cmbBoxHomeworkSection1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));

        javax.swing.GroupLayout pnlAddHomework1Layout = new javax.swing.GroupLayout(pnlAddHomework1);
        pnlAddHomework1.setLayout(pnlAddHomework1Layout);
        pnlAddHomework1Layout.setHorizontalGroup(
            pnlAddHomework1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddHomework1Layout.createSequentialGroup()
                .addGroup(pnlAddHomework1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddHomework1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbBoxHomeworkCourses1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAddHomework1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbBoxHomeworkSection1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAddHomework1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel52))
                    .addGroup(pnlAddHomework1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spinFechaEntrega1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAddHomework1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlAddHomework1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scrollPaneDescripcionTarea1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlAddHomework1Layout.createSequentialGroup()
                                .addComponent(jLabel51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAgregarTareaTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlAddHomework1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAgregarTarea1))
                    .addGroup(pnlAddHomework1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel42)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        pnlAddHomework1Layout.setVerticalGroup(
            pnlAddHomework1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddHomework1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addGap(28, 28, 28)
                .addGroup(pnlAddHomework1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(cmbBoxHomeworkCourses1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAddHomework1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(cmbBoxHomeworkSection1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlAddHomework1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(txtAgregarTareaTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPaneDescripcionTarea1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlAddHomework1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(spinFechaEntrega1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAgregarTarea1)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        tabbedPaneHomework1.addTab("Agregar / Consultar", pnlAddHomework1);

        jLabel73.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        jLabel73.setText("Actualizar Tarea");

        jLabel74.setText("Curso:");

        cmbBoxUpdateHomeworkCourses1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));

        jLabel75.setText("Sección:");

        cmbBoxUpdateHomeworkSection1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));

        listUpdateTareas1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listUpdateTareas1ValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(listUpdateTareas1);

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel76.setText("Titulo:");

        jLabel77.setText("Descripción:");

        txtAreaUpdateTareaDescripcion1.setColumns(20);
        txtAreaUpdateTareaDescripcion1.setLineWrap(true);
        txtAreaUpdateTareaDescripcion1.setRows(5);
        txtAreaUpdateTareaDescripcion1.setWrapStyleWord(true);
        scrollUpdateHomework1.setViewportView(txtAreaUpdateTareaDescripcion1);

        jLabel78.setText("Fecha de asignación:");

        lblUpdateFechaAsignacion1.setText("--");

        jLabel79.setText("Fecha de entrega:");

        spinnerUpdateTareaFechaEntrega1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        spinnerUpdateTareaFechaEntrega1.setModel(new javax.swing.SpinnerDateModel());

        btnUpdateTarea1.setText("Actualizar Tarea");
        btnUpdateTarea1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTarea1ActionPerformed(evt);
            }
        });

        btnConsultarTareas1.setText("Buscar tareas");
        btnConsultarTareas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarTareas1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUpdateHomework1Layout = new javax.swing.GroupLayout(pnlUpdateHomework1);
        pnlUpdateHomework1.setLayout(pnlUpdateHomework1Layout);
        pnlUpdateHomework1Layout.setHorizontalGroup(
            pnlUpdateHomework1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUpdateHomework1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUpdateHomework1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUpdateHomework1Layout.createSequentialGroup()
                        .addGroup(pnlUpdateHomework1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel74)
                            .addComponent(jLabel75))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlUpdateHomework1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbBoxUpdateHomeworkSection1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbBoxUpdateHomeworkCourses1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarTareas1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(pnlUpdateHomework1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel73)
                    .addGroup(pnlUpdateHomework1Layout.createSequentialGroup()
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlUpdateHomework1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlUpdateHomework1Layout.createSequentialGroup()
                                .addComponent(jLabel76)
                                .addGap(18, 18, 18)
                                .addComponent(txtTareaUpdateTitulo1))
                            .addComponent(jLabel77)
                            .addComponent(btnUpdateTarea1)
                            .addComponent(scrollUpdateHomework1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUpdateHomework1Layout.createSequentialGroup()
                                .addComponent(jLabel78)
                                .addGap(18, 18, 18)
                                .addComponent(lblUpdateFechaAsignacion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlUpdateHomework1Layout.createSequentialGroup()
                                .addComponent(jLabel79)
                                .addGap(18, 18, 18)
                                .addComponent(spinnerUpdateTareaFechaEntrega1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27))
        );
        pnlUpdateHomework1Layout.setVerticalGroup(
            pnlUpdateHomework1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUpdateHomework1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel73)
                .addGroup(pnlUpdateHomework1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUpdateHomework1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlUpdateHomework1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlUpdateHomework1Layout.createSequentialGroup()
                                .addGroup(pnlUpdateHomework1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel76)
                                    .addComponent(txtTareaUpdateTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel77)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollUpdateHomework1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pnlUpdateHomework1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel78)
                                    .addComponent(lblUpdateFechaAsignacion1))
                                .addGap(18, 18, 18)
                                .addGroup(pnlUpdateHomework1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel79)
                                    .addComponent(spinnerUpdateTareaFechaEntrega1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdateTarea1))
                            .addGroup(pnlUpdateHomework1Layout.createSequentialGroup()
                                .addGroup(pnlUpdateHomework1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel74)
                                    .addComponent(cmbBoxUpdateHomeworkCourses1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(pnlUpdateHomework1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbBoxUpdateHomeworkSection1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel75))
                                .addGap(18, 18, 18)
                                .addComponent(btnConsultarTareas1)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUpdateHomework1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        tabbedPaneHomework1.addTab("tab2", pnlUpdateHomework1);

        javax.swing.GroupLayout homework1Layout = new javax.swing.GroupLayout(homework1);
        homework1.setLayout(homework1Layout);
        homework1Layout.setHorizontalGroup(
            homework1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homework1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPaneHomework1)
                .addContainerGap())
        );
        homework1Layout.setVerticalGroup(
            homework1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homework1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPaneHomework1)
                .addContainerGap())
        );

        pnlTeacherContent1.add(homework1, "teacherHomework");

        scrollPaneTeacherCourse1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPaneTeacherCourse1.setPreferredSize(new java.awt.Dimension(560, 802));

        course1.setPreferredSize(new java.awt.Dimension(560, 800));

        lblCoursePageTitle1.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        lblCoursePageTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCoursePageTitle1.setText("COURSE TITLE");

        lblCoursePSeccion1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        lblCoursePSeccion1.setText("Sección:");

        lblCoursePCodigo2.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        lblCoursePCodigo2.setText("Código:");

        lblCourseCode1.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        lblCourseCode1.setText("--");

        lblCourseSeccion1.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        lblCourseSeccion1.setText("--");

        jLabel43.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Tareas");

        lblCoursePCodigo3.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        lblCoursePCodigo3.setText("Semestre:");

        lblCourseSemester1.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        lblCourseSemester1.setText("--");

        tableCourseTareaList1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(tableCourseTareaList1);

        btnCourseAddTarea1.setText("Agregar nueva tarea");
        btnCourseAddTarea1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseAddTarea1ActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Alumnos");

        tableCourseStudents1.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollTableCourseStudents1.setViewportView(tableCourseStudents1);

        javax.swing.GroupLayout course1Layout = new javax.swing.GroupLayout(course1);
        course1.setLayout(course1Layout);
        course1Layout.setHorizontalGroup(
            course1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(course1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(course1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(course1Layout.createSequentialGroup()
                        .addGroup(course1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblCoursePageTitle1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, course1Layout.createSequentialGroup()
                                .addComponent(lblCoursePCodigo2)
                                .addGap(18, 18, 18)
                                .addComponent(lblCourseCode1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, course1Layout.createSequentialGroup()
                                .addComponent(lblCoursePSeccion1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCourseSeccion1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, course1Layout.createSequentialGroup()
                                .addComponent(lblCoursePCodigo3)
                                .addGap(18, 18, 18)
                                .addComponent(lblCourseSemester1))
                            .addComponent(btnCourseAddTarea1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                            .addComponent(scrollTableCourseStudents1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
        );
        course1Layout.setVerticalGroup(
            course1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(course1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCoursePageTitle1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(course1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCoursePCodigo2)
                    .addComponent(lblCourseCode1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(course1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCoursePSeccion1)
                    .addComponent(lblCourseSeccion1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(course1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCoursePCodigo3)
                    .addComponent(lblCourseSemester1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCourseAddTarea1)
                .addGap(8, 8, 8)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollTableCourseStudents1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addContainerGap())
        );

        scrollPaneTeacherCourse1.setViewportView(course1);

        pnlTeacherContent1.add(scrollPaneTeacherCourse1, "teacherCourse");

        scrollPaneGrades1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tabbedPaneNotas1.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N

        pnlAttendanceAdd2.setBackground(new java.awt.Color(35, 151, 155));

        scrollPaneAddGradesTable1.setBackground(new java.awt.Color(153, 0, 0));
        scrollPaneAddGradesTable1.setForeground(new java.awt.Color(255, 51, 255));
        scrollPaneAddGradesTable1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tableAddGrades1.setBackground(new java.awt.Color(102, 153, 255));
        tableAddGrades1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableAddGrades1.setGridColor(new java.awt.Color(51, 51, 255));
        tableAddGrades1.setRowHeight(30);
        tableAddGrades1.setRowMargin(5);
        tableAddGrades1.setShowGrid(true);
        tableAddGrades1.setShowVerticalLines(false);
        tableAddGrades1.setUpdateSelectionOnSort(false);
        scrollPaneAddGradesTable1.setViewportView(tableAddGrades1);
        if (tableAddGrades1.getColumnModel().getColumnCount() > 0) {
            tableAddGrades1.getColumnModel().getColumn(0).setResizable(false);
            tableAddGrades1.getColumnModel().getColumn(0).setPreferredWidth(200);
            tableAddGrades1.getColumnModel().getColumn(1).setResizable(false);
            tableAddGrades1.getColumnModel().getColumn(2).setResizable(false);
            tableAddGrades1.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel13.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        jLabel13.setText("Registrar Notas");

        jLabel31.setText("Elegir curso:");

        cmbCoursesAddGrade1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));

        cmbBoxRegistrarNotaTipoEvaluacion1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Tarea", "Parcial", "Examen Final" }));

        jLabel36.setText("Tipo de evaluacion:");

        btnAddGrades1.setText("Agregar Notas");
        btnAddGrades1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddGrades1ActionPerformed(evt);
            }
        });

        jLabel55.setText("Notas de estudiantes:");

        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel80.setText("Tareas");

        jScrollPane7.setViewportView(listAddGradeHomework1);

        jLabel34.setText("Elegir Sección:");

        cmbBoxAddGradeSeccion1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));

        btnAddGradeBuscarTareas1.setText("Buscar Tareas");
        btnAddGradeBuscarTareas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddGradeBuscarTareas1ActionPerformed(evt);
            }
        });

        btnAddGradeLoadStudents1.setText("Cargar alumnos");
        btnAddGradeLoadStudents1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddGradeLoadStudents1ActionPerformed(evt);
            }
        });

        lblAddNotaMissingTareaSelected1.setBackground(new java.awt.Color(255, 255, 255));
        lblAddNotaMissingTareaSelected1.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        lblAddNotaMissingTareaSelected1.setForeground(new java.awt.Color(255, 102, 102));

        lblAddNotaMissingTarea1.setBackground(new java.awt.Color(255, 255, 255));
        lblAddNotaMissingTarea1.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        lblAddNotaMissingTarea1.setForeground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout pnlAttendanceAdd2Layout = new javax.swing.GroupLayout(pnlAttendanceAdd2);
        pnlAttendanceAdd2.setLayout(pnlAttendanceAdd2Layout);
        pnlAttendanceAdd2Layout.setHorizontalGroup(
            pnlAttendanceAdd2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAttendanceAdd2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAttendanceAdd2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAttendanceAdd2Layout.createSequentialGroup()
                        .addGroup(pnlAttendanceAdd2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAttendanceAdd2Layout.createSequentialGroup()
                                .addGroup(pnlAttendanceAdd2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel36)
                                    .addComponent(jLabel34))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlAttendanceAdd2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbCoursesAddGrade1, 0, 121, Short.MAX_VALUE)
                                    .addComponent(cmbBoxAddGradeSeccion1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbBoxRegistrarNotaTipoEvaluacion1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAddGradeBuscarTareas1)
                                    .addComponent(lblAddNotaMissingTarea1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel31))
                        .addGroup(pnlAttendanceAdd2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAttendanceAdd2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel80)
                                .addGap(143, 143, 143))
                            .addGroup(pnlAttendanceAdd2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlAttendanceAdd2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlAttendanceAdd2Layout.createSequentialGroup()
                                        .addComponent(lblAddNotaMissingTareaSelected1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pnlAttendanceAdd2Layout.createSequentialGroup()
                                        .addComponent(jScrollPane7)
                                        .addGap(26, 26, 26))))))
                    .addGroup(pnlAttendanceAdd2Layout.createSequentialGroup()
                        .addGap(432, 432, 432)
                        .addComponent(btnAddGrades1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(pnlAttendanceAdd2Layout.createSequentialGroup()
                .addGroup(pnlAttendanceAdd2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAttendanceAdd2Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel13))
                    .addGroup(pnlAttendanceAdd2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlAttendanceAdd2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollPaneAddGradesTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlAttendanceAdd2Layout.createSequentialGroup()
                                .addComponent(btnAddGradeLoadStudents1)
                                .addGap(92, 92, 92)
                                .addComponent(jLabel55)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAttendanceAdd2Layout.setVerticalGroup(
            pnlAttendanceAdd2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAttendanceAdd2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(20, 20, 20)
                .addGroup(pnlAttendanceAdd2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlAttendanceAdd2Layout.createSequentialGroup()
                        .addGroup(pnlAttendanceAdd2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(cmbCoursesAddGrade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel80))
                        .addGroup(pnlAttendanceAdd2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAttendanceAdd2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlAttendanceAdd2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(pnlAttendanceAdd2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel34)
                                    .addComponent(cmbBoxAddGradeSeccion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlAttendanceAdd2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbBoxRegistrarNotaTipoEvaluacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel36))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAddNotaMissingTarea1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddGradeBuscarTareas1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAddNotaMissingTareaSelected1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator11))
                .addGap(18, 18, 18)
                .addGroup(pnlAttendanceAdd2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(btnAddGradeLoadStudents1))
                .addGap(18, 18, 18)
                .addComponent(scrollPaneAddGradesTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAddGrades1)
                .addContainerGap())
        );

        tabbedPaneNotas1.addTab("Agregar", pnlAttendanceAdd2);

        pnlAttendanceCheckUpdate2.setBackground(new java.awt.Color(35, 151, 155));

        scrollTableConsultaNotas1.setBackground(new java.awt.Color(153, 0, 0));
        scrollTableConsultaNotas1.setForeground(new java.awt.Color(255, 51, 255));
        scrollTableConsultaNotas1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tableGetUpdateNotes1.setBackground(new java.awt.Color(102, 153, 255));
        tableGetUpdateNotes1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableGetUpdateNotes1.setGridColor(new java.awt.Color(51, 51, 255));
        tableGetUpdateNotes1.setRowHeight(30);
        tableGetUpdateNotes1.setRowMargin(5);
        tableGetUpdateNotes1.setShowGrid(true);
        tableGetUpdateNotes1.setShowVerticalLines(false);
        tableGetUpdateNotes1.setUpdateSelectionOnSort(false);
        scrollTableConsultaNotas1.setViewportView(tableGetUpdateNotes1);
        if (tableGetUpdateNotes1.getColumnModel().getColumnCount() > 0) {
            tableGetUpdateNotes1.getColumnModel().getColumn(0).setResizable(false);
            tableGetUpdateNotes1.getColumnModel().getColumn(0).setPreferredWidth(200);
            tableGetUpdateNotes1.getColumnModel().getColumn(1).setResizable(false);
            tableGetUpdateNotes1.getColumnModel().getColumn(2).setResizable(false);
            tableGetUpdateNotes1.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel14.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel14.setText("Elegir Curso:");

        cmbBoxConsultaNotasCurso1.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        cmbBoxConsultaNotasCurso1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));

        jLabel15.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Consulta de Notas");

        jLabel16.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel16.setText("Estudiante");

        cmbBoxConsultaNotasEstudiante1.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        cmbBoxConsultaNotasEstudiante1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));

        btnUpdateGrade1.setText("Actualizar");
        btnUpdateGrade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateGrade1ActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel37.setText("Tipo de evaluacion");

        cmbBoxConsultaNotasEvaluacion1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Tarea", "Parcial", "Examen Final" }));

        txtTotalNotas1.setEditable(false);
        txtTotalNotas1.setText("--");

        jLabel56.setText("Total:");

        btnConsultarNotas1.setText("Consultar");
        btnConsultarNotas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarNotas1ActionPerformed(evt);
            }
        });

        jLabel17.setText("Elegir Sección:");

        cmbBoxConsultaNotasLetraSeccion1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));

        btnSortGradesConsulta1.setText("Filtrar por estudiante");
        btnSortGradesConsulta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortGradesConsulta1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAttendanceCheckUpdate2Layout = new javax.swing.GroupLayout(pnlAttendanceCheckUpdate2);
        pnlAttendanceCheckUpdate2.setLayout(pnlAttendanceCheckUpdate2Layout);
        pnlAttendanceCheckUpdate2Layout.setHorizontalGroup(
            pnlAttendanceCheckUpdate2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAttendanceCheckUpdate2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAttendanceCheckUpdate2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAttendanceCheckUpdate2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlAttendanceCheckUpdate2Layout.createSequentialGroup()
                            .addComponent(jLabel56)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTotalNotas1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlAttendanceCheckUpdate2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(scrollTableConsultaNotas1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlAttendanceCheckUpdate2Layout.createSequentialGroup()
                                .addGroup(pnlAttendanceCheckUpdate2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlAttendanceCheckUpdate2Layout.createSequentialGroup()
                                        .addComponent(jLabel37)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbBoxConsultaNotasEvaluacion1, 0, 100, Short.MAX_VALUE))
                                    .addGroup(pnlAttendanceCheckUpdate2Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmbBoxConsultaNotasCurso1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbBoxConsultaNotasLetraSeccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlAttendanceCheckUpdate2Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(btnSortGradesConsulta1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbBoxConsultaNotasEstudiante1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btnUpdateGrade1))
                    .addComponent(btnConsultarNotas1))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        pnlAttendanceCheckUpdate2Layout.setVerticalGroup(
            pnlAttendanceCheckUpdate2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAttendanceCheckUpdate2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAttendanceCheckUpdate2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cmbBoxConsultaNotasCurso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(cmbBoxConsultaNotasLetraSeccion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAttendanceCheckUpdate2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBoxConsultaNotasEvaluacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultarNotas1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(pnlAttendanceCheckUpdate2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBoxConsultaNotasEstudiante1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(btnSortGradesConsulta1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollTableConsultaNotas1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAttendanceCheckUpdate2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalNotas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56))
                .addGap(37, 37, 37)
                .addComponent(btnUpdateGrade1)
                .addContainerGap())
        );

        tabbedPaneNotas1.addTab("Consultar / Actualizar", pnlAttendanceCheckUpdate2);

        javax.swing.GroupLayout grades1Layout = new javax.swing.GroupLayout(grades1);
        grades1.setLayout(grades1Layout);
        grades1Layout.setHorizontalGroup(
            grades1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneNotas1)
        );
        grades1Layout.setVerticalGroup(
            grades1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneNotas1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        scrollPaneGrades1.setViewportView(grades1);

        pnlTeacherContent1.add(scrollPaneGrades1, "teacherGrades");

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabel1.setText("CONSULTAR O ACTUALIZAR PROFESOR");

        jLabel21.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel21.setText("ID Profesor");

        jLabel22.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel22.setText("Nombre");

        jLabel23.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel23.setText("Email");

        jLabel24.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel24.setText("Especialidad");

        jLabel25.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel25.setText("Telefono");

        jLabel26.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel26.setText("Password");

        jLabel27.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel27.setText("Estado");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "EMAIL", "ESPECIALIDAD", "TELEFONO", "PASSWORD", "ESTADO"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jButton2.setText("Consultar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Actualizar");

        javax.swing.GroupLayout ActualizaLayout = new javax.swing.GroupLayout(Actualiza);
        Actualiza.setLayout(ActualizaLayout);
        ActualizaLayout.setHorizontalGroup(
            ActualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ActualizaLayout.createSequentialGroup()
                .addGroup(ActualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ActualizaLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1))
                    .addGroup(ActualizaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ActualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ActualizaLayout.createSequentialGroup()
                                .addGroup(ActualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel27))
                                .addGap(27, 27, 27)
                                .addGroup(ActualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ActualizaLayout.createSequentialGroup()
                                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton3))
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ActualizaLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(ActualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        ActualizaLayout.setVerticalGroup(
            ActualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ActualizaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(ActualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ActualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ActualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ActualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ActualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ActualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ActualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultar/ Actualizar", Actualiza);

        jLabel2.setFont(new java.awt.Font("Sitka Small", 1, 36)); // NOI18N
        jLabel2.setText("Agregar Maestro");

        jLabel3.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel6.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel6.setText("Email");

        jLabel7.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel7.setText("Especialidad");

        jLabel18.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel18.setText("Telefono");

        jLabel19.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel19.setText("Password");

        jLabel20.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel20.setText("Estado");

        jButton1.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jButton1.setText("Agregar");

        javax.swing.GroupLayout AgregarLayout = new javax.swing.GroupLayout(Agregar);
        Agregar.setLayout(AgregarLayout);
        AgregarLayout.setHorizontalGroup(
            AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AgregarLayout.createSequentialGroup()
                        .addGroup(AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(48, 48, 48)
                        .addGroup(AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                .addComponent(jTextField3)
                                .addComponent(jTextField4)
                                .addComponent(jTextField5)
                                .addComponent(jTextField6))
                            .addComponent(jLabel2)))
                    .addComponent(jButton1))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        AgregarLayout.setVerticalGroup(
            AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(55, 55, 55)
                .addGroup(AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar", Agregar);

        javax.swing.GroupLayout profesoresCRUDLayout = new javax.swing.GroupLayout(profesoresCRUD);
        profesoresCRUD.setLayout(profesoresCRUDLayout);
        profesoresCRUDLayout.setHorizontalGroup(
            profesoresCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        profesoresCRUDLayout.setVerticalGroup(
            profesoresCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pnlTeacherContent1.add(profesoresCRUD, "card6");

        jLabel28.setFont(new java.awt.Font("Sitka Small", 1, 36)); // NOI18N
        jLabel28.setText("AGREGAR ESTUDIANTE");

        jLabel57.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel57.setText("Nombre");

        jLabel58.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel58.setText("Apellido");

        jLabel59.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel59.setText("Email");

        jLabel60.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel60.setText("Carnet");

        jLabel61.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel61.setText("Telefono");

        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jButton4.setText("AGREGAR");

        javax.swing.GroupLayout agregarEstudianteLayout = new javax.swing.GroupLayout(agregarEstudiante);
        agregarEstudiante.setLayout(agregarEstudianteLayout);
        agregarEstudianteLayout.setHorizontalGroup(
            agregarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarEstudianteLayout.createSequentialGroup()
                .addGroup(agregarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(agregarEstudianteLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel28))
                    .addGroup(agregarEstudianteLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(agregarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addGroup(agregarEstudianteLayout.createSequentialGroup()
                                .addGroup(agregarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel58)
                                    .addComponent(jLabel57)
                                    .addComponent(jLabel59)
                                    .addComponent(jLabel60)
                                    .addComponent(jLabel61))
                                .addGap(85, 85, 85)
                                .addGroup(agregarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(201, Short.MAX_VALUE))
        );
        agregarEstudianteLayout.setVerticalGroup(
            agregarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addGap(27, 27, 27)
                .addGroup(agregarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(agregarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(agregarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(agregarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(agregarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jButton4)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Agregar", agregarEstudiante);

        jLabel62.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabel62.setText("Consultar o Actualizar Estudiante");

        jLabel63.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel63.setText("ID Estudiante");

        jLabel64.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel64.setText("Nombre");

        jLabel81.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel81.setText("Apellido");

        jLabel82.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel82.setText("Email");

        jLabel83.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel83.setText("Carnet");

        jLabel84.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel84.setText("Telefono");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO", "EMAIL", "CARNET", "TELEFONO"
            }
        ));
        jScrollPane8.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
        }

        jButton6.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jButton6.setText("ACTUALIZAR");

        jButton7.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jButton7.setText("Consultar");

        javax.swing.GroupLayout actualizarEstudianteLayout = new javax.swing.GroupLayout(actualizarEstudiante);
        actualizarEstudiante.setLayout(actualizarEstudianteLayout);
        actualizarEstudianteLayout.setHorizontalGroup(
            actualizarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizarEstudianteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(actualizarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actualizarEstudianteLayout.createSequentialGroup()
                        .addGroup(actualizarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel63)
                            .addComponent(jLabel84, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel83, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel82, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel81, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(actualizarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jTextField23, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField22, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField21, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField20, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField19, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(45, 45, 45)
                        .addComponent(jButton6)
                        .addGap(305, 305, 305))
                    .addGroup(actualizarEstudianteLayout.createSequentialGroup()
                        .addGroup(actualizarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(actualizarEstudianteLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel62)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        actualizarEstudianteLayout.setVerticalGroup(
            actualizarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizarEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel62)
                .addGap(25, 25, 25)
                .addGroup(actualizarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(actualizarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(actualizarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(actualizarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel82)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(actualizarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel83)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(actualizarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel84)
                    .addGroup(actualizarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Consultar/ Actualizar", actualizarEstudiante);

        javax.swing.GroupLayout estudiantesCRUDLayout = new javax.swing.GroupLayout(estudiantesCRUD);
        estudiantesCRUD.setLayout(estudiantesCRUDLayout);
        estudiantesCRUDLayout.setHorizontalGroup(
            estudiantesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        estudiantesCRUDLayout.setVerticalGroup(
            estudiantesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        pnlTeacherContent1.add(estudiantesCRUD, "card7");

        jLabel89.setText("ID Curso");

        jLabel90.setText("Nombre");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primer Semestre", "Segundo Semestre", "Tercer Semestre", "Cuarto Semestre", "Quinto Semestre", "Sexto Semestre", "Septimo Semeste", "Octavo Semestre", "Noveno Semestre", "Decimo Semestre" }));

        jLabel91.setText("Codigo");

        jLabel92.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabel92.setText("Actualizar o Consultar Curso");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "CODIGO", "Semestre"
            }
        ));
        jScrollPane9.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(3).setResizable(false);
        }

        Consultar.setText("Consultar");

        jButton8.setText("Actualizar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel93.setText("Semestre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel89)
                            .addComponent(jLabel90)
                            .addComponent(jLabel91)
                            .addComponent(jLabel93)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Consultar)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel92)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(jTextField28, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField27, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton8)
                                .addGap(28, 28, 28)))))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel92)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel89)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel91)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8)
                    .addComponent(jLabel93))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Consultar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Actualizar/Consultar", jPanel1);

        jLabel85.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabel85.setText("AGREGAR CURSO");

        jLabel86.setText("Nombre");

        jLabel87.setText("Codigo");

        jLabel88.setText("Semestre");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primer Semestre", "Segundo Semestre", "Tercer Semestre", "Cuarto Semestre", "Quinto Semestre", "Sexto Semestre", "Septimo Semeste", "Octavo Semestre", "Noveno Semestre", "Decimo Semestre" }));

        jButton5.setText("AGREGAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel85))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel87)
                                    .addComponent(jLabel86)
                                    .addComponent(jLabel88))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField25, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(jTextField26)))
                            .addComponent(jButton5))))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel85)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(337, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Agregar", jPanel2);

        javax.swing.GroupLayout cursoCRUDLayout = new javax.swing.GroupLayout(cursoCRUD);
        cursoCRUD.setLayout(cursoCRUDLayout);
        cursoCRUDLayout.setHorizontalGroup(
            cursoCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        cursoCRUDLayout.setVerticalGroup(
            cursoCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pnlTeacherContent1.add(cursoCRUD, "card8");

        jLabel95.setFont(new java.awt.Font("Sitka Small", 1, 36)); // NOI18N
        jLabel95.setText("Secciones");

        jLabel96.setText("ID Curso");

        jLabel97.setText("ID Profesor");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", " " }));

        jLabel98.setText("Letra");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID CURSO", "ID PROFESOR", "LETRA"
            }
        ));
        jScrollPane10.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(2).setResizable(false);
        }

        jButton9.setText("Consultar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Agregar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout seccionesCRUDLayout = new javax.swing.GroupLayout(seccionesCRUD);
        seccionesCRUD.setLayout(seccionesCRUDLayout);
        seccionesCRUDLayout.setHorizontalGroup(
            seccionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seccionesCRUDLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel95)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seccionesCRUDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(seccionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(seccionesCRUDLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton9))
                    .addGroup(seccionesCRUDLayout.createSequentialGroup()
                        .addGroup(seccionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel96)
                            .addComponent(jLabel97)
                            .addComponent(jLabel98))
                        .addGap(57, 57, 57)
                        .addGroup(seccionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        seccionesCRUDLayout.setVerticalGroup(
            seccionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seccionesCRUDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel95)
                .addGap(18, 18, 18)
                .addGroup(seccionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seccionesCRUDLayout.createSequentialGroup()
                        .addGroup(seccionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel96)
                            .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(seccionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel97)
                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(seccionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel98)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton10))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jButton9)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pnlTeacherContent1.add(seccionesCRUD, "card9");

        jLabel99.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabel99.setText("ASIGNACION");

        jLabel100.setText("ID Estudiante");

        jLabel101.setText("ID Seccion");

        jButton11.setText("ASIGNAR");

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane11.setViewportView(jTable5);

        jButton12.setText("CONSULTAR");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("ACTUALIZAR");

        javax.swing.GroupLayout asignacionesCRUDLayout = new javax.swing.GroupLayout(asignacionesCRUD);
        asignacionesCRUD.setLayout(asignacionesCRUDLayout);
        asignacionesCRUDLayout.setHorizontalGroup(
            asignacionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asignacionesCRUDLayout.createSequentialGroup()
                .addGroup(asignacionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(asignacionesCRUDLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel99))
                    .addGroup(asignacionesCRUDLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(asignacionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel100)
                            .addComponent(jLabel101))
                        .addGap(56, 56, 56)
                        .addGroup(asignacionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(asignacionesCRUDLayout.createSequentialGroup()
                                .addComponent(jButton11)
                                .addGap(18, 18, 18)
                                .addComponent(jButton13))
                            .addGroup(asignacionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField32)
                                .addComponent(jTextField33, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                    .addGroup(asignacionesCRUDLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(asignacionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton12)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        asignacionesCRUDLayout.setVerticalGroup(
            asignacionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asignacionesCRUDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel99)
                .addGap(31, 31, 31)
                .addGroup(asignacionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel100)
                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(asignacionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel101)
                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(asignacionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton13))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton12)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pnlTeacherContent1.add(asignacionesCRUD, "card10");

        adminApp.add(pnlTeacherContent1);
        pnlTeacherContent1.setBounds(230, 30, 570, 570);

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

    private void lblTeacherShowDashboard1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowDashboard1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherShowDashboard1MouseClicked

    private void lblTeacherShowDashboard1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowDashboard1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherShowDashboard1MouseEntered

    private void lblTeacherShowDashboard1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowDashboard1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherShowDashboard1MouseExited

    private void lblTeacherLogOut1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherLogOut1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherLogOut1MouseClicked

    private void lblTeacherLogOut1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherLogOut1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherLogOut1MouseEntered

    private void lblTeacherLogOut1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherLogOut1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherLogOut1MouseExited

    private void lblTeacherShowGrades1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowGrades1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherShowGrades1MouseClicked

    private void lblTeacherShowGrades1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowGrades1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherShowGrades1MouseEntered

    private void lblTeacherShowGrades1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowGrades1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherShowGrades1MouseExited

    private void lblTeacherShowHomework1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowHomework1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherShowHomework1MouseClicked

    private void lblTeacherShowHomework1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowHomework1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherShowHomework1MouseEntered

    private void lblTeacherShowHomework1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowHomework1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherShowHomework1MouseExited

    private void lblDashboardCourse10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardCourse10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblDashboardCourse10MouseClicked

    private void lblDashboardCourse11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardCourse11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblDashboardCourse11MouseClicked

    private void btnAgregarTarea1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTarea1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarTarea1ActionPerformed

    private void listUpdateTareas1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listUpdateTareas1ValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_listUpdateTareas1ValueChanged

    private void btnUpdateTarea1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTarea1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateTarea1ActionPerformed

    private void btnConsultarTareas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarTareas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarTareas1ActionPerformed

    private void btnCourseAddTarea1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseAddTarea1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCourseAddTarea1ActionPerformed

    private void btnAddGrades1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGrades1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddGrades1ActionPerformed

    private void btnAddGradeBuscarTareas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGradeBuscarTareas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddGradeBuscarTareas1ActionPerformed

    private void btnAddGradeLoadStudents1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGradeLoadStudents1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddGradeLoadStudents1ActionPerformed

    private void btnUpdateGrade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateGrade1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateGrade1ActionPerformed

    private void btnConsultarNotas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarNotas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarNotas1ActionPerformed

    private void btnSortGradesConsulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortGradesConsulta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSortGradesConsulta1ActionPerformed

    private void lblTeacherShowHomework2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowHomework2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherShowHomework2MouseClicked

    private void lblTeacherShowHomework2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowHomework2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherShowHomework2MouseEntered

    private void lblTeacherShowHomework2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowHomework2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherShowHomework2MouseExited

    private void lblTeacherShowHomework3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowHomework3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherShowHomework3MouseClicked

    private void lblTeacherShowHomework3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowHomework3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherShowHomework3MouseEntered

    private void lblTeacherShowHomework3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowHomework3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherShowHomework3MouseExited

    private void lblTeacherShowHomework4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowHomework4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherShowHomework4MouseClicked

    private void lblTeacherShowHomework4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowHomework4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherShowHomework4MouseEntered

    private void lblTeacherShowHomework4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherShowHomework4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTeacherShowHomework4MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed
    
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
    private javax.swing.JPanel Actualiza;
    private javax.swing.JPanel Agregar;
    private javax.swing.JButton Consultar;
    private javax.swing.JPanel actualizarEstudiante;
    private javax.swing.JPanel adminApp;
    private javax.swing.JPanel agregarEstudiante;
    private javax.swing.JPanel asignacionesCRUD;
    private javax.swing.JButton btnAddGradeBuscarTareas;
    private javax.swing.JButton btnAddGradeBuscarTareas1;
    private javax.swing.JButton btnAddGradeLoadStudents;
    private javax.swing.JButton btnAddGradeLoadStudents1;
    private javax.swing.JButton btnAddGrades;
    private javax.swing.JButton btnAddGrades1;
    private javax.swing.JButton btnAgregarTarea;
    private javax.swing.JButton btnAgregarTarea1;
    private javax.swing.JButton btnConsultarNotas;
    private javax.swing.JButton btnConsultarNotas1;
    private javax.swing.JButton btnConsultarTareas;
    private javax.swing.JButton btnConsultarTareas1;
    private javax.swing.JButton btnCourseAddTarea;
    private javax.swing.JButton btnCourseAddTarea1;
    private javax.swing.JButton btnLoginLog;
    private javax.swing.JButton btnSortGradesConsulta;
    private javax.swing.JButton btnSortGradesConsulta1;
    private javax.swing.JButton btnUpdateGrade;
    private javax.swing.JButton btnUpdateGrade1;
    private javax.swing.JButton btnUpdateTarea;
    private javax.swing.JButton btnUpdateTarea1;
    private javax.swing.JComboBox<String> cmbBoxAddGradeSeccion;
    private javax.swing.JComboBox<String> cmbBoxAddGradeSeccion1;
    private javax.swing.JComboBox<String> cmbBoxConsultaNotasCurso;
    private javax.swing.JComboBox<String> cmbBoxConsultaNotasCurso1;
    private javax.swing.JComboBox<String> cmbBoxConsultaNotasEstudiante;
    private javax.swing.JComboBox<String> cmbBoxConsultaNotasEstudiante1;
    private javax.swing.JComboBox<String> cmbBoxConsultaNotasEvaluacion;
    private javax.swing.JComboBox<String> cmbBoxConsultaNotasEvaluacion1;
    private javax.swing.JComboBox<String> cmbBoxConsultaNotasLetraSeccion;
    private javax.swing.JComboBox<String> cmbBoxConsultaNotasLetraSeccion1;
    private javax.swing.JComboBox<String> cmbBoxHomeworkCourses;
    private javax.swing.JComboBox<String> cmbBoxHomeworkCourses1;
    private javax.swing.JComboBox<String> cmbBoxHomeworkSection;
    private javax.swing.JComboBox<String> cmbBoxHomeworkSection1;
    private javax.swing.JComboBox<String> cmbBoxRegistrarNotaTipoEvaluacion;
    private javax.swing.JComboBox<String> cmbBoxRegistrarNotaTipoEvaluacion1;
    private javax.swing.JComboBox<String> cmbBoxUpdateHomeworkCourses;
    private javax.swing.JComboBox<String> cmbBoxUpdateHomeworkCourses1;
    private javax.swing.JComboBox<String> cmbBoxUpdateHomeworkSection;
    private javax.swing.JComboBox<String> cmbBoxUpdateHomeworkSection1;
    private javax.swing.JComboBox<String> cmbCoursesAddGrade;
    private javax.swing.JComboBox<String> cmbCoursesAddGrade1;
    private javax.swing.JPanel course;
    private javax.swing.JPanel course1;
    private javax.swing.JPanel cursoCRUD;
    private javax.swing.JPanel dashboard;
    private javax.swing.JPanel dashboard1;
    private javax.swing.JPanel estudiantesCRUD;
    private javax.swing.JPanel grades;
    private javax.swing.JPanel grades1;
    private javax.swing.JPanel homework;
    private javax.swing.JPanel homework1;
    private javax.swing.JPanel inSesion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblAddNotaMissingTarea;
    private javax.swing.JLabel lblAddNotaMissingTarea1;
    private javax.swing.JLabel lblAddNotaMissingTareaSelected;
    private javax.swing.JLabel lblAddNotaMissingTareaSelected1;
    private javax.swing.JLabel lblCourseCode;
    private javax.swing.JLabel lblCourseCode1;
    private javax.swing.JLabel lblCoursePCodigo;
    private javax.swing.JLabel lblCoursePCodigo1;
    private javax.swing.JLabel lblCoursePCodigo2;
    private javax.swing.JLabel lblCoursePCodigo3;
    private javax.swing.JLabel lblCoursePSeccion;
    private javax.swing.JLabel lblCoursePSeccion1;
    private javax.swing.JLabel lblCoursePageTitle;
    private javax.swing.JLabel lblCoursePageTitle1;
    private javax.swing.JLabel lblCourseSeccion;
    private javax.swing.JLabel lblCourseSeccion1;
    private javax.swing.JLabel lblCourseSemester;
    private javax.swing.JLabel lblCourseSemester1;
    private javax.swing.JLabel lblDashboardCourse1;
    private javax.swing.JLabel lblDashboardCourse10;
    private javax.swing.JLabel lblDashboardCourse11;
    private javax.swing.JLabel lblDashboardCourse12;
    private javax.swing.JLabel lblDashboardCourse2;
    private javax.swing.JLabel lblDashboardCourse3;
    private javax.swing.JLabel lblDashboardCourse4;
    private javax.swing.JLabel lblDashboardCourse5;
    private javax.swing.JLabel lblDashboardCourse6;
    private javax.swing.JLabel lblDashboardCourse7;
    private javax.swing.JLabel lblDashboardCourse8;
    private javax.swing.JLabel lblDashboardCourse9;
    private javax.swing.JLabel lblDashboardTitleCursos;
    private javax.swing.JLabel lblDashboardTitleCursos1;
    private javax.swing.JLabel lblIconEmail;
    private javax.swing.JLabel lblIconPassword;
    private javax.swing.JLabel lblLoginEmailMessage;
    private javax.swing.JLabel lblLoginMessagePassword;
    private javax.swing.JLabel lblLoginShowHide;
    private javax.swing.JLabel lblLoginTitle;
    private javax.swing.JLabel lblLoginTopInfo;
    private javax.swing.JLabel lblSeccion1;
    private javax.swing.JLabel lblSeccion10;
    private javax.swing.JLabel lblSeccion11;
    private javax.swing.JLabel lblSeccion12;
    private javax.swing.JLabel lblSeccion2;
    private javax.swing.JLabel lblSeccion3;
    private javax.swing.JLabel lblSeccion4;
    private javax.swing.JLabel lblSeccion5;
    private javax.swing.JLabel lblSeccion6;
    private javax.swing.JLabel lblSeccion7;
    private javax.swing.JLabel lblSeccion8;
    private javax.swing.JLabel lblSeccion9;
    private javax.swing.JLabel lblTeacherLogOut;
    private javax.swing.JLabel lblTeacherLogOut1;
    private javax.swing.JLabel lblTeacherShowDashboard;
    private javax.swing.JLabel lblTeacherShowDashboard1;
    private javax.swing.JLabel lblTeacherShowGrades;
    private javax.swing.JLabel lblTeacherShowGrades1;
    private javax.swing.JLabel lblTeacherShowHomework;
    private javax.swing.JLabel lblTeacherShowHomework1;
    private javax.swing.JLabel lblTeacherShowHomework2;
    private javax.swing.JLabel lblTeacherShowHomework3;
    private javax.swing.JLabel lblTeacherShowHomework4;
    private javax.swing.JLabel lblTeacherTopInfo;
    private javax.swing.JLabel lblTeacherTopInfo1;
    private javax.swing.JLabel lblUpdateFechaAsignacion;
    private javax.swing.JLabel lblUpdateFechaAsignacion1;
    private javax.swing.JList<String> listAddGradeHomework;
    private javax.swing.JList<String> listAddGradeHomework1;
    private javax.swing.JList<String> listUpdateTareas;
    private javax.swing.JList<String> listUpdateTareas1;
    private javax.swing.JPanel login;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPasswordField passLoginPassword;
    private javax.swing.JPanel pnlAddHomework;
    private javax.swing.JPanel pnlAddHomework1;
    private javax.swing.JPanel pnlAttendanceAdd1;
    private javax.swing.JPanel pnlAttendanceAdd2;
    private javax.swing.JPanel pnlAttendanceCheckUpdate1;
    private javax.swing.JPanel pnlAttendanceCheckUpdate2;
    private javax.swing.JPanel pnlDashboardCourse1;
    private javax.swing.JPanel pnlDashboardCourse10;
    private javax.swing.JPanel pnlDashboardCourse11;
    private javax.swing.JPanel pnlDashboardCourse12;
    private javax.swing.JPanel pnlDashboardCourse2;
    private javax.swing.JPanel pnlDashboardCourse3;
    private javax.swing.JPanel pnlDashboardCourse4;
    private javax.swing.JPanel pnlDashboardCourse5;
    private javax.swing.JPanel pnlDashboardCourse6;
    private javax.swing.JPanel pnlDashboardCourse7;
    private javax.swing.JPanel pnlDashboardCourse8;
    private javax.swing.JPanel pnlDashboardCourse9;
    private javax.swing.JPanel pnlLogintab;
    private javax.swing.JPanel pnlTeacherContent;
    private javax.swing.JPanel pnlTeacherContent1;
    private javax.swing.JPanel pnlTeacherInfo;
    private javax.swing.JPanel pnlTeacherInfo1;
    private javax.swing.JPanel pnlTeacherTop;
    private javax.swing.JPanel pnlTeacherTop1;
    private javax.swing.JPanel pnlUpdateHomework;
    private javax.swing.JPanel pnlUpdateHomework1;
    private javax.swing.JPanel profesoresCRUD;
    private javax.swing.JScrollPane scrollPaneAddGradesTable;
    private javax.swing.JScrollPane scrollPaneAddGradesTable1;
    private javax.swing.JScrollPane scrollPaneDescripcionTarea;
    private javax.swing.JScrollPane scrollPaneDescripcionTarea1;
    private javax.swing.JScrollPane scrollPaneGrades;
    private javax.swing.JScrollPane scrollPaneGrades1;
    private javax.swing.JScrollPane scrollPaneTeacherCourse;
    private javax.swing.JScrollPane scrollPaneTeacherCourse1;
    private javax.swing.JScrollPane scrollTableConsultaNotas;
    private javax.swing.JScrollPane scrollTableConsultaNotas1;
    private javax.swing.JScrollPane scrollTableCourseStudents;
    private javax.swing.JScrollPane scrollTableCourseStudents1;
    private javax.swing.JScrollPane scrollUpdateHomework;
    private javax.swing.JScrollPane scrollUpdateHomework1;
    private javax.swing.JPanel seccionesCRUD;
    private javax.swing.JSpinner spinFechaEntrega;
    private javax.swing.JSpinner spinFechaEntrega1;
    private javax.swing.JSpinner spinnerUpdateTareaFechaEntrega;
    private javax.swing.JSpinner spinnerUpdateTareaFechaEntrega1;
    private javax.swing.JTabbedPane tabbedPaneHomework;
    private javax.swing.JTabbedPane tabbedPaneHomework1;
    private javax.swing.JTabbedPane tabbedPaneNotas;
    private javax.swing.JTabbedPane tabbedPaneNotas1;
    private javax.swing.JTable tableAddGrades;
    private javax.swing.JTable tableAddGrades1;
    private javax.swing.JTable tableCourseStudents;
    private javax.swing.JTable tableCourseStudents1;
    private javax.swing.JTable tableCourseTareaList;
    private javax.swing.JTable tableCourseTareaList1;
    private javax.swing.JTable tableGetUpdateNotes;
    private javax.swing.JTable tableGetUpdateNotes1;
    private javax.swing.JPanel teacherApp;
    private javax.swing.JTextField txtAgregarTareaTitulo;
    private javax.swing.JTextField txtAgregarTareaTitulo1;
    private javax.swing.JTextArea txtAreaUpdateTareaDescripcion;
    private javax.swing.JTextArea txtAreaUpdateTareaDescripcion1;
    private javax.swing.JTextField txtLoginEmail;
    private javax.swing.JTextField txtTareaUpdateTitulo;
    private javax.swing.JTextField txtTareaUpdateTitulo1;
    private javax.swing.JTextField txtTotalNotas;
    private javax.swing.JTextField txtTotalNotas1;
    private javax.swing.JTextArea txtareaAgregarTareaDescripcion;
    private javax.swing.JTextArea txtareaAgregarTareaDescripcion1;
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

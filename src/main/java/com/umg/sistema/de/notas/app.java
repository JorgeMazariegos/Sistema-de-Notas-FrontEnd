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
import com.umg.sistema.de.notas.model.Admin;

//Service imoports
import com.umg.sistema.de.notas.service.TeacherService;
import com.umg.sistema.de.notas.service.SeccionService;
import com.umg.sistema.de.notas.service.CourseService;
import com.umg.sistema.de.notas.service.AsignacionService;
import com.umg.sistema.de.notas.service.TareaService;
import com.umg.sistema.de.notas.service.GradeService;
import com.umg.sistema.de.notas.service.AdminService;
import com.umg.sistema.de.notas.service.StudentService;

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
    AdminService adminService = new AdminService();
    StudentService studentService = new StudentService();
    
    //Objetos para validar / encriptar
    Validation validation = new Validation();
    Encryption encryption = new Encryption();
    
    //Variables globales
    int currentOpaqueLabel = 1;
    int currentAdminOpaqueLabel = 1;
    boolean showPassword = false;
    
    //Informacion del usuario que inicio sesion
    Teacher teacher = new Teacher();
    Admin admin = new Admin();
    
    //Listas para llenar los campos de las interfaces
    List<Course> teacherCourseList;
    List<Seccion> teacherSeccionList;
    List<Student> courseStudentList;
    List<Tarea> teacherHomeworkList;
    List<Asignacion> asignacionList;
    List<Grade> gradeList;
    List<Grade> updateGrade;
    List<Teacher> listaTeachers;
    List<Student> listaEstudiantes;
    List<Course> listaCursos;
    List<Seccion> listaSeccion;
    List<Asignacion> listaAsignacion;
    
    //Tablas de admin
    DefaultTableModel tableConsultaTeachers;
    DefaultTableModel tableConsultaEstudiantes;
    DefaultTableModel tableCRUDCurso;
    DefaultTableModel tableCRUDSeccion;
    DefaultTableModel tableCRUDAsignacion;
    
    public app() {
        initComponents();
        
        //Init admin tables
        
        tableConsultaTeachers = new DefaultTableModel(new String [] {"ID", "Nombre","Email","Especialidad","Telefono","Estado"}, 0);
        tblProfesorUpdate.setModel(tableConsultaTeachers);
        
        tableConsultaEstudiantes = new DefaultTableModel(new String [] {"ID", "Nombre","Apellido","Email","Carnet", "Telefono"}, 0);
        tblStudentUpdate.setModel(tableConsultaEstudiantes);
        
        tableCRUDCurso = new DefaultTableModel(new String [] {"ID", "Nombre","Codigo","Semestre"}, 0);
        tblCursoCRUD.setModel(tableCRUDCurso);
        
        tableCRUDSeccion = new DefaultTableModel(new String [] {"ID", "ID Curso","ID Profesor","Letra"}, 0);
        tblCrudSeccion.setModel(tableCRUDSeccion);
        
        tableCRUDAsignacion = new DefaultTableModel(new String [] {"ID", "ID Estudiante","ID Sección"}, 0);
        tblAsignacionCRUD.setModel(tableCRUDAsignacion);
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
        pnlAdminTop = new javax.swing.JPanel();
        lblAdminTopInfo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnlAdminInfo = new javax.swing.JPanel();
        lblAdminLogOut = new javax.swing.JLabel();
        lblAdminShowProfesores = new javax.swing.JLabel();
        lblAdminShowEstudiantes = new javax.swing.JLabel();
        lblAdminShowCursos = new javax.swing.JLabel();
        lblAdminShowSecciones = new javax.swing.JLabel();
        lblAdminShowAsignaciones = new javax.swing.JLabel();
        pnlAdminContent = new javax.swing.JPanel();
        profesoresCRUD = new javax.swing.JPanel();
        tabPaneMaestroCRUD = new javax.swing.JTabbedPane();
        Agregar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtProfesorNombre = new javax.swing.JTextField();
        txtProfesorEmail = new javax.swing.JTextField();
        txtProfesorEspecialidad = new javax.swing.JTextField();
        txtProfesorTelefono = new javax.swing.JTextField();
        txtTeacherPassword = new javax.swing.JTextField();
        btnAddProfesor = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        Actualiza = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtNombreProfesorUpdate = new javax.swing.JTextField();
        txtEmailProfesorUpdate = new javax.swing.JTextField();
        txtEspecialidadProfesorUpdate = new javax.swing.JTextField();
        txtTelefonoProfesorUpdate = new javax.swing.JTextField();
        txtPasswordProfesorUpdate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProfesorUpdate = new javax.swing.JTable();
        btnConsultarProfesor = new javax.swing.JButton();
        btnActualizarProfesor = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtIDProfesorUpdate = new javax.swing.JTextField();
        radioButtonDarDeBajaProfesorUpdate = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        estudiantesCRUD = new javax.swing.JPanel();
        tbPaneEstudiantes = new javax.swing.JTabbedPane();
        agregarEstudiante = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        txtAgregarEstudianteNombre = new javax.swing.JTextField();
        txtAgregarEstudianteApellido = new javax.swing.JTextField();
        txtAgregarEstudianteCorreo = new javax.swing.JTextField();
        txtAgregarEstudianteCarnet = new javax.swing.JTextField();
        txtAgregarEstudianteTelefono = new javax.swing.JTextField();
        btnAgregarEstudiante = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        actualizarEstudiante = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        txtActualizarAlumnoID = new javax.swing.JTextField();
        txtActualizarAlumnoNombre = new javax.swing.JTextField();
        txtActualizarAlumnoApellido = new javax.swing.JTextField();
        txtActualizarAlumnoEmail = new javax.swing.JTextField();
        txtActualizarAlumnoCarnet = new javax.swing.JTextField();
        txtActualizarAlumnoTelefono = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblStudentUpdate = new javax.swing.JTable();
        btnActualizarEstudiante = new javax.swing.JButton();
        btnConsultarEstudiantes = new javax.swing.JButton();
        cursoCRUD = new javax.swing.JPanel();
        txtCursoAgregarCodigo = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        cmbBoxCursoAgregarSemestre = new javax.swing.JComboBox<>();
        btnAddCurso = new javax.swing.JButton();
        btnActualizarCurso = new javax.swing.JButton();
        txtCursoAgregarNombre = new javax.swing.JTextField();
        scrollPaneTableCursos = new javax.swing.JScrollPane();
        tblCursoCRUD = new javax.swing.JTable();
        btnConsultarCursos = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtCursoAgregarID = new javax.swing.JTextField();
        btnClearSelection = new javax.swing.JButton();
        seccionesCRUD = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        cmbBoxCrudSeccionLetra = new javax.swing.JComboBox<>();
        txtCrudSeccionIDCurso = new javax.swing.JTextField();
        txtCrudSeccionIDProfesor = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblCrudSeccion = new javax.swing.JTable();
        btnConsultarSecciones = new javax.swing.JButton();
        btnAddSeccion = new javax.swing.JButton();
        btnUpdateSeccion = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtCrudSeccionIDSeccion = new javax.swing.JTextField();
        asignacionesCRUD = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        txtIDEstudiante = new javax.swing.JTextField();
        txtIDSeccion = new javax.swing.JTextField();
        btnAsignarCurso = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblAsignacionCRUD = new javax.swing.JTable();
        btnConsultarAsignaciones = new javax.swing.JButton();
        btnUpdateAsignacion = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtIDAsignacion = new javax.swing.JTextField();

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
        lblTeacherTopInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
                .addGap(171, 171, 171)
                .addComponent(lblTeacherTopInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
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

        lblTeacherLogOut.setBackground(new java.awt.Color(51, 0, 0));
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
        lblTeacherShowGrades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grades.png"))); // NOI18N
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
        lblTeacherShowHomework.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homework.png"))); // NOI18N
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTeacherLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(413, Short.MAX_VALUE))
        );

        teacherApp.add(pnlTeacherInfo);
        pnlTeacherInfo.setBounds(0, 0, 230, 600);

        pnlTeacherContent.setBackground(new java.awt.Color(35, 151, 155));
        pnlTeacherContent.setLayout(new java.awt.CardLayout());

        dashboard.setBackground(new java.awt.Color(35, 151, 155));

        lblDashboardTitleCursos.setBackground(new java.awt.Color(255, 255, 255));
        lblDashboardTitleCursos.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        lblDashboardTitleCursos.setForeground(new java.awt.Color(51, 51, 51));
        lblDashboardTitleCursos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardTitleCursos.setText("Cursos");
        lblDashboardTitleCursos.setToolTipText("");
        lblDashboardTitleCursos.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        pnlDashboardCourse4.setBackground(new java.awt.Color(236, 231, 220));
        pnlDashboardCourse4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 15, 11), 1, true));
        pnlDashboardCourse4.setPreferredSize(new java.awt.Dimension(170, 100));

        lblDashboardCourse4.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblDashboardCourse4.setForeground(new java.awt.Color(51, 51, 51));
        lblDashboardCourse4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardCourse4.setText("--");
        lblDashboardCourse4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardCourse4MouseClicked(evt);
            }
        });

        lblSeccion4.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        lblSeccion4.setForeground(new java.awt.Color(51, 51, 51));
        lblSeccion4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSeccion4.setText("--");

        javax.swing.GroupLayout pnlDashboardCourse4Layout = new javax.swing.GroupLayout(pnlDashboardCourse4);
        pnlDashboardCourse4.setLayout(pnlDashboardCourse4Layout);
        pnlDashboardCourse4Layout.setHorizontalGroup(
            pnlDashboardCourse4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDashboardCourse4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSeccion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDashboardCourse4, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                .addContainerGap())
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
        lblDashboardCourse5.setForeground(new java.awt.Color(51, 51, 51));
        lblDashboardCourse5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardCourse5.setText("--");
        lblDashboardCourse5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardCourse5MouseClicked(evt);
            }
        });

        lblSeccion5.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        lblSeccion5.setForeground(new java.awt.Color(51, 51, 51));
        lblSeccion5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSeccion5.setText("--");

        javax.swing.GroupLayout pnlDashboardCourse5Layout = new javax.swing.GroupLayout(pnlDashboardCourse5);
        pnlDashboardCourse5.setLayout(pnlDashboardCourse5Layout);
        pnlDashboardCourse5Layout.setHorizontalGroup(
            pnlDashboardCourse5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDashboardCourse5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSeccion5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDashboardCourse5, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                .addContainerGap())
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
        lblDashboardCourse6.setForeground(new java.awt.Color(51, 51, 51));
        lblDashboardCourse6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardCourse6.setText("--");
        lblDashboardCourse6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardCourse6MouseClicked(evt);
            }
        });

        lblSeccion6.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        lblSeccion6.setForeground(new java.awt.Color(51, 51, 51));
        lblSeccion6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSeccion6.setText("--");

        javax.swing.GroupLayout pnlDashboardCourse6Layout = new javax.swing.GroupLayout(pnlDashboardCourse6);
        pnlDashboardCourse6.setLayout(pnlDashboardCourse6Layout);
        pnlDashboardCourse6Layout.setHorizontalGroup(
            pnlDashboardCourse6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDashboardCourse6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSeccion6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDashboardCourse6, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                .addContainerGap())
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
        lblDashboardCourse1.setForeground(new java.awt.Color(51, 51, 51));
        lblDashboardCourse1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardCourse1.setText("--");
        lblDashboardCourse1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardCourse1MouseClicked(evt);
            }
        });

        lblSeccion1.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        lblSeccion1.setForeground(new java.awt.Color(51, 51, 51));
        lblSeccion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSeccion1.setText("--");

        javax.swing.GroupLayout pnlDashboardCourse1Layout = new javax.swing.GroupLayout(pnlDashboardCourse1);
        pnlDashboardCourse1.setLayout(pnlDashboardCourse1Layout);
        pnlDashboardCourse1Layout.setHorizontalGroup(
            pnlDashboardCourse1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDashboardCourse1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSeccion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDashboardCourse1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                .addContainerGap())
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
        lblDashboardCourse2.setForeground(new java.awt.Color(51, 51, 51));
        lblDashboardCourse2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardCourse2.setText("--");
        lblDashboardCourse2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardCourse2MouseClicked(evt);
            }
        });

        lblSeccion2.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        lblSeccion2.setForeground(new java.awt.Color(51, 51, 51));
        lblSeccion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSeccion2.setText("--");

        javax.swing.GroupLayout pnlDashboardCourse2Layout = new javax.swing.GroupLayout(pnlDashboardCourse2);
        pnlDashboardCourse2.setLayout(pnlDashboardCourse2Layout);
        pnlDashboardCourse2Layout.setHorizontalGroup(
            pnlDashboardCourse2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDashboardCourse2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSeccion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDashboardCourse2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                .addContainerGap())
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
        lblDashboardCourse3.setForeground(new java.awt.Color(51, 51, 51));
        lblDashboardCourse3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboardCourse3.setText("--");
        lblDashboardCourse3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardCourse3MouseClicked(evt);
            }
        });

        lblSeccion3.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        lblSeccion3.setForeground(new java.awt.Color(51, 51, 51));
        lblSeccion3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSeccion3.setText("--");

        javax.swing.GroupLayout pnlDashboardCourse3Layout = new javax.swing.GroupLayout(pnlDashboardCourse3);
        pnlDashboardCourse3.setLayout(pnlDashboardCourse3Layout);
        pnlDashboardCourse3Layout.setHorizontalGroup(
            pnlDashboardCourse3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardCourse3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDashboardCourse3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDashboardCourse3, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(lblSeccion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

        pnlAddHomework.setBackground(new java.awt.Color(35, 151, 155));

        jLabel40.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(51, 51, 51));
        jLabel40.setText("Agregar Tarea");

        jLabel44.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(51, 51, 51));
        jLabel44.setText("Curso:");

        cmbBoxHomeworkCourses.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        cmbBoxHomeworkCourses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));

        jLabel45.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(51, 51, 51));
        jLabel45.setText("Sección:");

        jLabel46.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(51, 51, 51));
        jLabel46.setText("Titulo:");

        jLabel47.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(51, 51, 51));
        jLabel47.setText("Descripcion:");

        jLabel48.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(51, 51, 51));
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
                .addContainerGap(153, Short.MAX_VALUE))
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
                .addContainerGap(104, Short.MAX_VALUE))
        );

        tabbedPaneHomework.addTab("Agregar / Consultar", pnlAddHomework);

        pnlUpdateHomework.setBackground(new java.awt.Color(35, 151, 155));

        jLabel65.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(51, 51, 51));
        jLabel65.setText("Actualizar Tarea");

        jLabel66.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(51, 51, 51));
        jLabel66.setText("Curso:");

        cmbBoxUpdateHomeworkCourses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));

        jLabel67.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(51, 51, 51));
        jLabel67.setText("Sección:");

        cmbBoxUpdateHomeworkSection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));

        listUpdateTareas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listUpdateTareasValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listUpdateTareas);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel68.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(51, 51, 51));
        jLabel68.setText("Titulo:");

        jLabel69.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(51, 51, 51));
        jLabel69.setText("Descripción:");

        txtAreaUpdateTareaDescripcion.setColumns(20);
        txtAreaUpdateTareaDescripcion.setLineWrap(true);
        txtAreaUpdateTareaDescripcion.setRows(5);
        txtAreaUpdateTareaDescripcion.setWrapStyleWord(true);
        scrollUpdateHomework.setViewportView(txtAreaUpdateTareaDescripcion);

        jLabel70.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(51, 51, 51));
        jLabel70.setText("Fecha de asignación:");

        lblUpdateFechaAsignacion.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        lblUpdateFechaAsignacion.setForeground(new java.awt.Color(51, 51, 51));
        lblUpdateFechaAsignacion.setText("--");

        jLabel71.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(51, 51, 51));
        jLabel71.setText("Fecha de entrega:");

        spinnerUpdateTareaFechaEntrega.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        spinnerUpdateTareaFechaEntrega.setModel(new javax.swing.SpinnerDateModel());

        btnUpdateTarea.setText("Actualizar Tarea");
        btnUpdateTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTareaActionPerformed(evt);
            }
        });

        btnConsultarTareas.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
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
                .addContainerGap(113, Short.MAX_VALUE))
        );

        tabbedPaneHomework.addTab("tab2", pnlUpdateHomework);

        javax.swing.GroupLayout homeworkLayout = new javax.swing.GroupLayout(homework);
        homework.setLayout(homeworkLayout);
        homeworkLayout.setHorizontalGroup(
            homeworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeworkLayout.createSequentialGroup()
                .addComponent(tabbedPaneHomework)
                .addContainerGap())
        );
        homeworkLayout.setVerticalGroup(
            homeworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeworkLayout.createSequentialGroup()
                .addComponent(tabbedPaneHomework)
                .addContainerGap())
        );

        tabbedPaneHomework.getAccessibleContext().setAccessibleName("Agregar");

        pnlTeacherContent.add(homework, "teacherHomework");

        scrollPaneTeacherCourse.setForeground(new java.awt.Color(51, 51, 51));
        scrollPaneTeacherCourse.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPaneTeacherCourse.setPreferredSize(new java.awt.Dimension(560, 802));

        course.setBackground(new java.awt.Color(35, 151, 155));
        course.setPreferredSize(new java.awt.Dimension(560, 800));

        lblCoursePageTitle.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        lblCoursePageTitle.setForeground(new java.awt.Color(51, 51, 51));
        lblCoursePageTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCoursePageTitle.setText("COURSE TITLE");

        lblCoursePSeccion.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        lblCoursePSeccion.setForeground(new java.awt.Color(51, 51, 51));
        lblCoursePSeccion.setText("Sección:");

        lblCoursePCodigo.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        lblCoursePCodigo.setForeground(new java.awt.Color(51, 51, 51));
        lblCoursePCodigo.setText("Código:");

        lblCourseCode.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        lblCourseCode.setForeground(new java.awt.Color(51, 51, 51));
        lblCourseCode.setText("--");

        lblCourseSeccion.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        lblCourseSeccion.setForeground(new java.awt.Color(51, 51, 51));
        lblCourseSeccion.setText("--");

        jLabel39.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(51, 51, 51));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Tareas");

        lblCoursePCodigo1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        lblCoursePCodigo1.setForeground(new java.awt.Color(51, 51, 51));
        lblCoursePCodigo1.setText("Semestre:");

        lblCourseSemester.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        lblCourseSemester.setForeground(new java.awt.Color(51, 51, 51));
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
        jLabel41.setForeground(new java.awt.Color(51, 51, 51));
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

        grades.setBackground(new java.awt.Color(62, 66, 68));

        tabbedPaneNotas.setBackground(new java.awt.Color(62, 66, 68));
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

        pnlAdminTop.setBackground(new java.awt.Color(53, 36, 97));
        pnlAdminTop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlAdminTop.setForeground(new java.awt.Color(255, 255, 255));

        lblAdminTopInfo.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblAdminTopInfo.setForeground(new java.awt.Color(236, 231, 220));
        lblAdminTopInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdminTopInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard.png"))); // NOI18N
        lblAdminTopInfo.setText("Dashboard");
        lblAdminTopInfo.setMaximumSize(new java.awt.Dimension(93, 30));
        lblAdminTopInfo.setMinimumSize(new java.awt.Dimension(93, 30));
        lblAdminTopInfo.setPreferredSize(new java.awt.Dimension(93, 30));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Administrador");

        javax.swing.GroupLayout pnlAdminTopLayout = new javax.swing.GroupLayout(pnlAdminTop);
        pnlAdminTop.setLayout(pnlAdminTopLayout);
        pnlAdminTopLayout.setHorizontalGroup(
            pnlAdminTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdminTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134)
                .addComponent(lblAdminTopInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(216, Short.MAX_VALUE))
        );
        pnlAdminTopLayout.setVerticalGroup(
            pnlAdminTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdminTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblAdminTopInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        adminApp.add(pnlAdminTop);
        pnlAdminTop.setBounds(0, 0, 800, 30);

        pnlAdminInfo.setBackground(new java.awt.Color(53, 36, 97));

        lblAdminLogOut.setBackground(new java.awt.Color(51, 0, 0));
        lblAdminLogOut.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblAdminLogOut.setForeground(new java.awt.Color(255, 102, 102));
        lblAdminLogOut.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAdminLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        lblAdminLogOut.setText("Cerrar Sesión");
        lblAdminLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdminLogOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAdminLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAdminLogOutMouseExited(evt);
            }
        });

        lblAdminShowProfesores.setBackground(new java.awt.Color(35, 151, 155));
        lblAdminShowProfesores.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblAdminShowProfesores.setForeground(new java.awt.Color(252, 255, 252));
        lblAdminShowProfesores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAdminShowProfesores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teacher.png"))); // NOI18N
        lblAdminShowProfesores.setText("Profesores");
        lblAdminShowProfesores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdminShowProfesoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAdminShowProfesoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAdminShowProfesoresMouseExited(evt);
            }
        });

        lblAdminShowEstudiantes.setBackground(new java.awt.Color(35, 151, 155));
        lblAdminShowEstudiantes.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblAdminShowEstudiantes.setForeground(new java.awt.Color(252, 255, 252));
        lblAdminShowEstudiantes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAdminShowEstudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student.png"))); // NOI18N
        lblAdminShowEstudiantes.setText("Estudiantes");
        lblAdminShowEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdminShowEstudiantesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAdminShowEstudiantesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAdminShowEstudiantesMouseExited(evt);
            }
        });

        lblAdminShowCursos.setBackground(new java.awt.Color(35, 151, 155));
        lblAdminShowCursos.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblAdminShowCursos.setForeground(new java.awt.Color(252, 255, 252));
        lblAdminShowCursos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAdminShowCursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courses.png"))); // NOI18N
        lblAdminShowCursos.setText("Cursos");
        lblAdminShowCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdminShowCursosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAdminShowCursosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAdminShowCursosMouseExited(evt);
            }
        });

        lblAdminShowSecciones.setBackground(new java.awt.Color(35, 151, 155));
        lblAdminShowSecciones.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblAdminShowSecciones.setForeground(new java.awt.Color(252, 255, 252));
        lblAdminShowSecciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAdminShowSecciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seccion.png"))); // NOI18N
        lblAdminShowSecciones.setText("Secciones");
        lblAdminShowSecciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdminShowSeccionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAdminShowSeccionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAdminShowSeccionesMouseExited(evt);
            }
        });

        lblAdminShowAsignaciones.setBackground(new java.awt.Color(35, 151, 155));
        lblAdminShowAsignaciones.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblAdminShowAsignaciones.setForeground(new java.awt.Color(252, 255, 252));
        lblAdminShowAsignaciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAdminShowAsignaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asignacion.png"))); // NOI18N
        lblAdminShowAsignaciones.setText("Asignaciones");
        lblAdminShowAsignaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdminShowAsignacionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAdminShowAsignacionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAdminShowAsignacionesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlAdminInfoLayout = new javax.swing.GroupLayout(pnlAdminInfo);
        pnlAdminInfo.setLayout(pnlAdminInfoLayout);
        pnlAdminInfoLayout.setHorizontalGroup(
            pnlAdminInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdminInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAdminInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAdminLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(lblAdminShowAsignaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAdminShowProfesores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAdminShowEstudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAdminShowCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAdminShowSecciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlAdminInfoLayout.setVerticalGroup(
            pnlAdminInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdminInfoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblAdminShowProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAdminShowEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAdminShowCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAdminShowSecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAdminShowAsignaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAdminLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(329, Short.MAX_VALUE))
        );

        adminApp.add(pnlAdminInfo);
        pnlAdminInfo.setBounds(0, 0, 230, 600);

        pnlAdminContent.setBackground(new java.awt.Color(35, 151, 155));
        pnlAdminContent.setLayout(new java.awt.CardLayout());

        profesoresCRUD.setBackground(new java.awt.Color(35, 151, 155));
        profesoresCRUD.setForeground(new java.awt.Color(35, 151, 155));

        tabPaneMaestroCRUD.setBackground(new java.awt.Color(236, 231, 220));
        tabPaneMaestroCRUD.setForeground(new java.awt.Color(51, 51, 51));
        tabPaneMaestroCRUD.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N

        Agregar.setBackground(new java.awt.Color(35, 151, 155));

        jLabel2.setFont(new java.awt.Font("Sitka Small", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Agregar Maestro");

        jLabel3.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nombre");

        jLabel6.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Email");

        jLabel7.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Especialidad");

        jLabel18.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Telefono");

        jLabel19.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Contraseña");

        btnAddProfesor.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        btnAddProfesor.setText("Agregar");
        btnAddProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProfesorActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("@edu.com");

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
                            .addComponent(jLabel19))
                        .addGap(48, 48, 48)
                        .addGroup(AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProfesorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AgregarLayout.createSequentialGroup()
                                .addGroup(AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtProfesorEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(txtProfesorEspecialidad)
                                    .addComponent(txtProfesorTelefono)
                                    .addComponent(txtTeacherPassword))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13))
                            .addComponent(jLabel2)))
                    .addComponent(btnAddProfesor))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        AgregarLayout.setVerticalGroup(
            AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(55, 55, 55)
                .addGroup(AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProfesorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtProfesorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtProfesorEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtProfesorTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtTeacherPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddProfesor)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        tabPaneMaestroCRUD.addTab("Agregar", Agregar);

        Actualiza.setBackground(new java.awt.Color(35, 151, 155));

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabel1.setText("CONSULTAR O ACTUALIZAR PROFESOR");

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

        tblProfesorUpdate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "EMAIL", "ESPECIALIDAD", "TELEFONO", "ESTADO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblProfesorUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProfesorUpdateMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProfesorUpdate);
        if (tblProfesorUpdate.getColumnModel().getColumnCount() > 0) {
            tblProfesorUpdate.getColumnModel().getColumn(0).setResizable(false);
            tblProfesorUpdate.getColumnModel().getColumn(1).setResizable(false);
            tblProfesorUpdate.getColumnModel().getColumn(2).setResizable(false);
            tblProfesorUpdate.getColumnModel().getColumn(3).setResizable(false);
            tblProfesorUpdate.getColumnModel().getColumn(4).setResizable(false);
        }

        btnConsultarProfesor.setText("Consultar");
        btnConsultarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarProfesorActionPerformed(evt);
            }
        });

        btnActualizarProfesor.setText("Actualizar");
        btnActualizarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProfesorActionPerformed(evt);
            }
        });

        jLabel14.setText("ID");

        radioButtonDarDeBajaProfesorUpdate.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        radioButtonDarDeBajaProfesorUpdate.setText("Dar de baja");

        jLabel15.setText("@edu.com");

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
                        .addComponent(radioButtonDarDeBajaProfesorUpdate))
                    .addGroup(ActualizaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ActualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ActualizaLayout.createSequentialGroup()
                                .addComponent(btnConsultarProfesor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnActualizarProfesor))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ActualizaLayout.createSequentialGroup()
                                .addGroup(ActualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel14))
                                .addGap(27, 27, 27)
                                .addGroup(ActualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombreProfesorUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(txtEmailProfesorUpdate)
                                    .addComponent(txtEspecialidadProfesorUpdate)
                                    .addComponent(txtTelefonoProfesorUpdate)
                                    .addComponent(txtPasswordProfesorUpdate)
                                    .addComponent(txtIDProfesorUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ActualizaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ActualizaLayout.setVerticalGroup(
            ActualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ActualizaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ActualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(txtIDProfesorUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ActualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(txtNombreProfesorUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ActualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addGroup(ActualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEmailProfesorUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ActualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(txtEspecialidadProfesorUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ActualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(txtTelefonoProfesorUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ActualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPasswordProfesorUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioButtonDarDeBajaProfesorUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ActualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultarProfesor)
                    .addComponent(btnActualizarProfesor))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        tabPaneMaestroCRUD.addTab("Consultar / Actualizar", Actualiza);

        javax.swing.GroupLayout profesoresCRUDLayout = new javax.swing.GroupLayout(profesoresCRUD);
        profesoresCRUD.setLayout(profesoresCRUDLayout);
        profesoresCRUDLayout.setHorizontalGroup(
            profesoresCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPaneMaestroCRUD, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        profesoresCRUDLayout.setVerticalGroup(
            profesoresCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPaneMaestroCRUD, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pnlAdminContent.add(profesoresCRUD, "profesoresCRUD");

        estudiantesCRUD.setBackground(new java.awt.Color(35, 151, 155));

        tbPaneEstudiantes.setBackground(new java.awt.Color(236, 231, 220));
        tbPaneEstudiantes.setForeground(new java.awt.Color(51, 51, 51));
        tbPaneEstudiantes.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N

        agregarEstudiante.setBackground(new java.awt.Color(35, 151, 155));

        jLabel28.setFont(new java.awt.Font("Sitka Small", 1, 36)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setText("Agregar Estudiante");

        jLabel57.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(51, 51, 51));
        jLabel57.setText("Nombre");

        jLabel58.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(51, 51, 51));
        jLabel58.setText("Apellido");

        jLabel59.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(51, 51, 51));
        jLabel59.setText("Email");

        jLabel60.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(51, 51, 51));
        jLabel60.setText("Carnet");

        jLabel61.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(51, 51, 51));
        jLabel61.setText("Telefono");

        btnAgregarEstudiante.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        btnAgregarEstudiante.setText("AGREGAR");
        btnAgregarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEstudianteActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("@edu.student.com");

        javax.swing.GroupLayout agregarEstudianteLayout = new javax.swing.GroupLayout(agregarEstudiante);
        agregarEstudiante.setLayout(agregarEstudianteLayout);
        agregarEstudianteLayout.setHorizontalGroup(
            agregarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarEstudianteLayout.createSequentialGroup()
                .addGroup(agregarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(agregarEstudianteLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(agregarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarEstudiante)
                            .addGroup(agregarEstudianteLayout.createSequentialGroup()
                                .addGroup(agregarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel58)
                                    .addComponent(jLabel57)
                                    .addComponent(jLabel59)
                                    .addComponent(jLabel60)
                                    .addComponent(jLabel61))
                                .addGap(18, 18, 18)
                                .addGroup(agregarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAgregarEstudianteApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAgregarEstudianteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(agregarEstudianteLayout.createSequentialGroup()
                                        .addComponent(txtAgregarEstudianteCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16))
                                    .addComponent(txtAgregarEstudianteCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAgregarEstudianteTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(agregarEstudianteLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel28)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        agregarEstudianteLayout.setVerticalGroup(
            agregarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addGap(27, 27, 27)
                .addGroup(agregarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(txtAgregarEstudianteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(agregarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(txtAgregarEstudianteApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(agregarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(txtAgregarEstudianteCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(agregarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(txtAgregarEstudianteCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(agregarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(txtAgregarEstudianteTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnAgregarEstudiante)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        tbPaneEstudiantes.addTab("Agregar", agregarEstudiante);

        actualizarEstudiante.setBackground(new java.awt.Color(35, 151, 155));

        jLabel62.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(51, 51, 51));
        jLabel62.setText("Consultar o Actualizar Estudiante");

        jLabel63.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(51, 51, 51));
        jLabel63.setText("ID Estudiante");

        jLabel64.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(51, 51, 51));
        jLabel64.setText("Nombre");

        jLabel81.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(51, 51, 51));
        jLabel81.setText("Apellido");

        jLabel82.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(51, 51, 51));
        jLabel82.setText("Email");

        jLabel83.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(51, 51, 51));
        jLabel83.setText("Carnet");

        jLabel84.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(51, 51, 51));
        jLabel84.setText("Telefono");

        tblStudentUpdate.setModel(new javax.swing.table.DefaultTableModel(
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
        tblStudentUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentUpdateMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tblStudentUpdate);
        if (tblStudentUpdate.getColumnModel().getColumnCount() > 0) {
            tblStudentUpdate.getColumnModel().getColumn(0).setResizable(false);
            tblStudentUpdate.getColumnModel().getColumn(1).setResizable(false);
            tblStudentUpdate.getColumnModel().getColumn(2).setResizable(false);
            tblStudentUpdate.getColumnModel().getColumn(3).setResizable(false);
            tblStudentUpdate.getColumnModel().getColumn(4).setResizable(false);
        }

        btnActualizarEstudiante.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        btnActualizarEstudiante.setText("Actualizar");
        btnActualizarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarEstudianteActionPerformed(evt);
            }
        });

        btnConsultarEstudiantes.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        btnConsultarEstudiantes.setText("Consultar");
        btnConsultarEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarEstudiantesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout actualizarEstudianteLayout = new javax.swing.GroupLayout(actualizarEstudiante);
        actualizarEstudiante.setLayout(actualizarEstudianteLayout);
        actualizarEstudianteLayout.setHorizontalGroup(
            actualizarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizarEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(actualizarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actualizarEstudianteLayout.createSequentialGroup()
                        .addComponent(btnConsultarEstudiantes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizarEstudiante))
                    .addGroup(actualizarEstudianteLayout.createSequentialGroup()
                        .addGroup(actualizarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel63)
                            .addComponent(jLabel84, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel83, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel82, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel81, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(actualizarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel62)
                            .addGroup(actualizarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtActualizarAlumnoTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtActualizarAlumnoCarnet, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtActualizarAlumnoEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtActualizarAlumnoApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtActualizarAlumnoNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtActualizarAlumnoID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        actualizarEstudianteLayout.setVerticalGroup(
            actualizarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizarEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(actualizarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(txtActualizarAlumnoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(actualizarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(txtActualizarAlumnoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(actualizarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(txtActualizarAlumnoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(actualizarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel82)
                    .addComponent(txtActualizarAlumnoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(actualizarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel83)
                    .addComponent(txtActualizarAlumnoCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(actualizarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel84)
                    .addComponent(txtActualizarAlumnoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(actualizarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarEstudiante)
                    .addComponent(btnConsultarEstudiantes))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        tbPaneEstudiantes.addTab("Consultar / Actualizar", actualizarEstudiante);

        javax.swing.GroupLayout estudiantesCRUDLayout = new javax.swing.GroupLayout(estudiantesCRUD);
        estudiantesCRUD.setLayout(estudiantesCRUDLayout);
        estudiantesCRUDLayout.setHorizontalGroup(
            estudiantesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbPaneEstudiantes)
        );
        estudiantesCRUDLayout.setVerticalGroup(
            estudiantesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbPaneEstudiantes)
        );

        pnlAdminContent.add(estudiantesCRUD, "estudiantesCRUD");

        cursoCRUD.setBackground(new java.awt.Color(35, 151, 155));
        cursoCRUD.setForeground(new java.awt.Color(51, 51, 51));

        jLabel102.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(51, 51, 51));
        jLabel102.setText("Nombre");

        jLabel104.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(51, 51, 51));
        jLabel104.setText("Semestre");

        jLabel94.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(51, 51, 51));
        jLabel94.setText("AGREGAR CURSO");

        jLabel103.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(51, 51, 51));
        jLabel103.setText("Codigo");

        cmbBoxCursoAgregarSemestre.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        cmbBoxCursoAgregarSemestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Primer Semestre", "Segundo Semestre", "Tercer Semestre", "Cuarto Semestre", "Quinto Semestre", "Sexto Semestre", "Septimo Semeste", "Octavo Semestre", "Noveno Semestre", "Decimo Semestre" }));

        btnAddCurso.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        btnAddCurso.setText("Agregar");
        btnAddCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCursoActionPerformed(evt);
            }
        });

        btnActualizarCurso.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        btnActualizarCurso.setText("Actualizar");
        btnActualizarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCursoActionPerformed(evt);
            }
        });

        tblCursoCRUD.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        tblCursoCRUD.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCursoCRUD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCursoCRUDMouseClicked(evt);
            }
        });
        scrollPaneTableCursos.setViewportView(tblCursoCRUD);
        if (tblCursoCRUD.getColumnModel().getColumnCount() > 0) {
            tblCursoCRUD.getColumnModel().getColumn(0).setResizable(false);
            tblCursoCRUD.getColumnModel().getColumn(1).setResizable(false);
            tblCursoCRUD.getColumnModel().getColumn(3).setResizable(false);
        }

        btnConsultarCursos.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        btnConsultarCursos.setText("Consultar");
        btnConsultarCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCursosActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("ID");

        btnClearSelection.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        btnClearSelection.setText("Limpiar selección");
        btnClearSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearSelectionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cursoCRUDLayout = new javax.swing.GroupLayout(cursoCRUD);
        cursoCRUD.setLayout(cursoCRUDLayout);
        cursoCRUDLayout.setHorizontalGroup(
            cursoCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cursoCRUDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cursoCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneTableCursos, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                    .addGroup(cursoCRUDLayout.createSequentialGroup()
                        .addComponent(btnConsultarCursos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizarCurso)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddCurso))
                    .addGroup(cursoCRUDLayout.createSequentialGroup()
                        .addGroup(cursoCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel103)
                            .addGroup(cursoCRUDLayout.createSequentialGroup()
                                .addGroup(cursoCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel102)
                                    .addComponent(jLabel104)
                                    .addComponent(jLabel17))
                                .addGap(27, 27, 27)
                                .addGroup(cursoCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(cursoCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCursoAgregarCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                        .addComponent(txtCursoAgregarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                        .addComponent(txtCursoAgregarID))
                                    .addGroup(cursoCRUDLayout.createSequentialGroup()
                                        .addComponent(cmbBoxCursoAgregarSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnClearSelection)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cursoCRUDLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel94)
                .addGap(165, 165, 165))
        );
        cursoCRUDLayout.setVerticalGroup(
            cursoCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cursoCRUDLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel94)
                .addGap(10, 10, 10)
                .addGroup(cursoCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtCursoAgregarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cursoCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel102)
                    .addComponent(txtCursoAgregarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cursoCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCursoAgregarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel103))
                .addGap(18, 18, 18)
                .addGroup(cursoCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBoxCursoAgregarSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel104)
                    .addComponent(btnClearSelection))
                .addGap(18, 18, 18)
                .addComponent(scrollPaneTableCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(cursoCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarCurso)
                    .addComponent(btnAddCurso)
                    .addComponent(btnConsultarCursos))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pnlAdminContent.add(cursoCRUD, "cursoCRUD");

        seccionesCRUD.setBackground(new java.awt.Color(35, 151, 155));

        jLabel95.setBackground(new java.awt.Color(51, 51, 51));
        jLabel95.setFont(new java.awt.Font("Sitka Small", 1, 36)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(51, 51, 51));
        jLabel95.setText("Secciones");

        jLabel96.setBackground(new java.awt.Color(51, 51, 51));
        jLabel96.setForeground(new java.awt.Color(51, 51, 51));
        jLabel96.setText("ID Curso");

        jLabel97.setBackground(new java.awt.Color(51, 51, 51));
        jLabel97.setForeground(new java.awt.Color(51, 51, 51));
        jLabel97.setText("ID Profesor");

        cmbBoxCrudSeccionLetra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K" }));

        jLabel98.setBackground(new java.awt.Color(51, 51, 51));
        jLabel98.setForeground(new java.awt.Color(51, 51, 51));
        jLabel98.setText("Letra");

        tblCrudSeccion.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCrudSeccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCrudSeccionMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(tblCrudSeccion);
        if (tblCrudSeccion.getColumnModel().getColumnCount() > 0) {
            tblCrudSeccion.getColumnModel().getColumn(2).setResizable(false);
        }

        btnConsultarSecciones.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        btnConsultarSecciones.setText("Consultar");
        btnConsultarSecciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarSeccionesActionPerformed(evt);
            }
        });

        btnAddSeccion.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        btnAddSeccion.setText("Agregar");
        btnAddSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSeccionActionPerformed(evt);
            }
        });

        btnUpdateSeccion.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        btnUpdateSeccion.setText("Actualizar");
        btnUpdateSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSeccionActionPerformed(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(51, 51, 51));
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("ID Seccion");

        javax.swing.GroupLayout seccionesCRUDLayout = new javax.swing.GroupLayout(seccionesCRUD);
        seccionesCRUD.setLayout(seccionesCRUDLayout);
        seccionesCRUDLayout.setHorizontalGroup(
            seccionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seccionesCRUDLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel95)
                .addContainerGap(209, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seccionesCRUDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(seccionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConsultarSecciones)
                    .addGroup(seccionesCRUDLayout.createSequentialGroup()
                        .addGroup(seccionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(seccionesCRUDLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addComponent(txtCrudSeccionIDSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(seccionesCRUDLayout.createSequentialGroup()
                                .addGroup(seccionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel96)
                                    .addComponent(jLabel97)
                                    .addComponent(jLabel98))
                                .addGroup(seccionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(seccionesCRUDLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCrudSeccionIDCurso))
                                    .addGroup(seccionesCRUDLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(seccionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbBoxCrudSeccionLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCrudSeccionIDProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))))
                            .addGroup(seccionesCRUDLayout.createSequentialGroup()
                                .addComponent(btnAddSeccion)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdateSeccion)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(17, 17, 17))
        );
        seccionesCRUDLayout.setVerticalGroup(
            seccionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seccionesCRUDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel95)
                .addGap(18, 18, 18)
                .addGroup(seccionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(seccionesCRUDLayout.createSequentialGroup()
                        .addGroup(seccionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtCrudSeccionIDSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(seccionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel96)
                            .addComponent(txtCrudSeccionIDCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(seccionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel97)
                            .addComponent(txtCrudSeccionIDProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(seccionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel98)
                            .addComponent(cmbBoxCrudSeccionLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(seccionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddSeccion)
                            .addComponent(btnUpdateSeccion))))
                .addGap(28, 28, 28)
                .addComponent(btnConsultarSecciones)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pnlAdminContent.add(seccionesCRUD, "seccionCRUD");

        asignacionesCRUD.setBackground(new java.awt.Color(35, 151, 155));

        jLabel99.setBackground(new java.awt.Color(51, 51, 51));
        jLabel99.setFont(new java.awt.Font("Sitka Small", 1, 36)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(51, 51, 51));
        jLabel99.setText("ASIGNACION");

        jLabel100.setBackground(new java.awt.Color(51, 51, 51));
        jLabel100.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(51, 51, 51));
        jLabel100.setText("ID Estudiante");

        jLabel101.setBackground(new java.awt.Color(51, 51, 51));
        jLabel101.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(51, 51, 51));
        jLabel101.setText("ID Seccion");

        btnAsignarCurso.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        btnAsignarCurso.setText("Asignar");
        btnAsignarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarCursoActionPerformed(evt);
            }
        });

        tblAsignacionCRUD.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        tblAsignacionCRUD.setModel(new javax.swing.table.DefaultTableModel(
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
        tblAsignacionCRUD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAsignacionCRUDMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(tblAsignacionCRUD);

        btnConsultarAsignaciones.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        btnConsultarAsignaciones.setText("Consultar");
        btnConsultarAsignaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarAsignacionesActionPerformed(evt);
            }
        });

        btnUpdateAsignacion.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        btnUpdateAsignacion.setText("Actualizar");
        btnUpdateAsignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAsignacionActionPerformed(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(51, 51, 51));
        jLabel21.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("ID Asignacion");

        javax.swing.GroupLayout asignacionesCRUDLayout = new javax.swing.GroupLayout(asignacionesCRUD);
        asignacionesCRUD.setLayout(asignacionesCRUDLayout);
        asignacionesCRUDLayout.setHorizontalGroup(
            asignacionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asignacionesCRUDLayout.createSequentialGroup()
                .addGroup(asignacionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConsultarAsignaciones)
                    .addGroup(asignacionesCRUDLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(asignacionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel100)
                            .addComponent(btnAsignarCurso)
                            .addComponent(jLabel101)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(asignacionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIDSeccion, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(btnUpdateAsignacion)
                            .addComponent(txtIDEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtIDAsignacion))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, asignacionesCRUDLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel99)
                .addGap(159, 159, 159))
        );
        asignacionesCRUDLayout.setVerticalGroup(
            asignacionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asignacionesCRUDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel99)
                .addGap(31, 31, 31)
                .addGroup(asignacionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(asignacionesCRUDLayout.createSequentialGroup()
                        .addGroup(asignacionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtIDAsignacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(asignacionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel100)
                            .addComponent(txtIDEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(asignacionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel101)
                            .addComponent(txtIDSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(asignacionesCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAsignarCurso)
                            .addComponent(btnUpdateAsignacion))))
                .addGap(18, 18, 18)
                .addComponent(btnConsultarAsignaciones)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        pnlAdminContent.add(asignacionesCRUD, "asignacionCRUD");

        adminApp.add(pnlAdminContent);
        pnlAdminContent.setBounds(230, 30, 570, 570);

        mainPanel.add(adminApp, "adminApp");

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
            }case 2:{
                try{
                    loginAdmin(correo, password);
                }catch(NoSuchAlgorithmException ex){
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
    
    private void loginAdmin(String correo, String password) throws NoSuchAlgorithmException{
        CardLayout card = (CardLayout)mainPanel.getLayout();
        try{
            admin = adminService.loginAdmin(correo);
        }catch(Exception e){
            lblLoginEmailMessage.setText("Correo incorrecto");
            return;
        }
        if (validation.comprobarAdminPassword(admin, password)){
            initAdmin();
            card.show(mainPanel, "adminApp");      
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
        lblTeacherLogOut.setOpaque(true);
        lblTeacherLogOut.repaint();
    }//GEN-LAST:event_lblTeacherLogOutMouseEntered

    private void lblTeacherLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherLogOutMouseExited
        lblTeacherLogOut.setOpaque(false);
        lblTeacherLogOut.repaint();
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
        if(currentOpaqueLabel!=1){
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
        if(currentOpaqueLabel!=2){
            lblTeacherShowHomework.setOpaque(false);
            lblTeacherShowHomework.repaint();
        }
    }//GEN-LAST:event_lblTeacherShowHomeworkMouseExited

    private void txtLoginEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoginEmailKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_F1){
            txtLoginEmail.setText("jramirez@edu.com");
            passLoginPassword.setText("clave");
        }
        if(evt.getKeyCode()==KeyEvent.VK_F2){
            txtLoginEmail.setText("admin1@edu.admin.com");
            passLoginPassword.setText("password");
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
        lblTeacherTopInfo.setText(lblDashboardCourse1.getText());
        lblTeacherTopInfo.setIcon((new javax.swing.ImageIcon(getClass().getResource("/courseIcon.png"))));
        
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
        lblTeacherTopInfo.setText(lblDashboardCourse2.getText());
        lblTeacherTopInfo.setIcon((new javax.swing.ImageIcon(getClass().getResource("/courseIcon.png"))));
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

    private void lblAdminLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminLogOutMouseClicked
        CardLayout card = (CardLayout)mainPanel.getLayout();
        admin = new Admin();
        card.show(mainPanel, "login");
    }//GEN-LAST:event_lblAdminLogOutMouseClicked

    private void lblAdminLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminLogOutMouseEntered
        lblAdminLogOut.setOpaque(true);
        lblAdminLogOut.repaint();
    }//GEN-LAST:event_lblAdminLogOutMouseEntered

    private void lblAdminLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminLogOutMouseExited
        lblAdminLogOut.setOpaque(false);
        lblAdminLogOut.repaint();
    }//GEN-LAST:event_lblAdminLogOutMouseExited

    private void lblAdminShowProfesoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminShowProfesoresMouseClicked

       CardLayout card = (CardLayout)pnlAdminContent.getLayout();
       initAdminMenuOpaque(0);
       card.show(pnlAdminContent, "profesoresCRUD");
       adminTopInfo();
       initAdminTeacherTab();
    }//GEN-LAST:event_lblAdminShowProfesoresMouseClicked

    private void initAdminTeacherTab(){              
        tblProfesorUpdate.getColumn("ID").setPreferredWidth(20);       
        changeTableLook(tblProfesorUpdate);
 
    }
    
    private void lblAdminShowProfesoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminShowProfesoresMouseEntered
        lblAdminShowProfesores.setOpaque(true);
        lblAdminShowProfesores.repaint();
    }//GEN-LAST:event_lblAdminShowProfesoresMouseEntered

    private void lblAdminShowProfesoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminShowProfesoresMouseExited
        if(currentAdminOpaqueLabel!=0){
            lblAdminShowProfesores.setOpaque(false);
            lblAdminShowProfesores.repaint();
        }
    }//GEN-LAST:event_lblAdminShowProfesoresMouseExited

    private void lblAdminShowCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminShowCursosMouseClicked
       CardLayout card = (CardLayout)pnlAdminContent.getLayout();
       initAdminMenuOpaque(2);
       card.show(pnlAdminContent, "cursoCRUD");
       adminTopInfo();
       initAdminCursoTab();                         
    }//GEN-LAST:event_lblAdminShowCursosMouseClicked

    private void initAdminCursoTab(){
        tblCursoCRUD.getColumn("ID").setPreferredWidth(20);       
        changeTableLook(tblCursoCRUD);
    }
    
    private void lblAdminShowCursosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminShowCursosMouseEntered
        lblAdminShowCursos.setOpaque(true);
        lblAdminShowCursos.repaint();
    }//GEN-LAST:event_lblAdminShowCursosMouseEntered

    private void lblAdminShowCursosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminShowCursosMouseExited
        if(currentAdminOpaqueLabel!=2){
            lblAdminShowCursos.setOpaque(false);
            lblAdminShowCursos.repaint();
        }
    }//GEN-LAST:event_lblAdminShowCursosMouseExited

    private void lblAdminShowEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminShowEstudiantesMouseClicked
        CardLayout card = (CardLayout)pnlAdminContent.getLayout();
        initAdminMenuOpaque(1);
        card.show(pnlAdminContent, "estudiantesCRUD");
        adminTopInfo();
        initAdminStudentTab();
    }//GEN-LAST:event_lblAdminShowEstudiantesMouseClicked

    private void initAdminStudentTab(){
        tblStudentUpdate.getColumn("ID").setPreferredWidth(20);       
        changeTableLook(tblStudentUpdate);
    }
    
    private void lblAdminShowEstudiantesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminShowEstudiantesMouseEntered
        lblAdminShowEstudiantes.setOpaque(true);
        lblAdminShowEstudiantes.repaint();
    }//GEN-LAST:event_lblAdminShowEstudiantesMouseEntered

    private void lblAdminShowEstudiantesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminShowEstudiantesMouseExited
        if(currentAdminOpaqueLabel!=1){
            lblAdminShowEstudiantes.setOpaque(false);
            lblAdminShowEstudiantes.repaint();
        }
    }//GEN-LAST:event_lblAdminShowEstudiantesMouseExited

    private void lblAdminShowAsignacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminShowAsignacionesMouseClicked
        CardLayout card = (CardLayout)pnlAdminContent.getLayout();
        initAdminMenuOpaque(4);
        card.show(pnlAdminContent, "asignacionCRUD");
        adminTopInfo();
        initAdminAsignacionTab(); 
    }//GEN-LAST:event_lblAdminShowAsignacionesMouseClicked

    private void initAdminAsignacionTab(){
        tblAsignacionCRUD.getColumn("ID").setPreferredWidth(20);       
        changeTableLook(tblAsignacionCRUD);
    }
    
    private void lblAdminShowAsignacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminShowAsignacionesMouseEntered
        lblAdminShowAsignaciones.setOpaque(true);
        lblAdminShowAsignaciones.repaint();
    }//GEN-LAST:event_lblAdminShowAsignacionesMouseEntered

    private void lblAdminShowAsignacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminShowAsignacionesMouseExited
        if(currentAdminOpaqueLabel!=4){
            lblAdminShowAsignaciones.setOpaque(false);
            lblAdminShowAsignaciones.repaint();
        }
    }//GEN-LAST:event_lblAdminShowAsignacionesMouseExited

    private void lblAdminShowSeccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminShowSeccionesMouseClicked
       CardLayout card = (CardLayout)pnlAdminContent.getLayout();
       initAdminMenuOpaque(3);
       card.show(pnlAdminContent, "seccionCRUD");
       adminTopInfo();
       initAdminSeccionTab(); 
    }//GEN-LAST:event_lblAdminShowSeccionesMouseClicked
  
    private void initAdminSeccionTab(){
        tblCrudSeccion.getColumn("ID").setPreferredWidth(20);       
        changeTableLook(tblCrudSeccion);
    }
    
    private void lblAdminShowSeccionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminShowSeccionesMouseEntered
        lblAdminShowSecciones.setOpaque(true);
        lblAdminShowSecciones.repaint();
    }//GEN-LAST:event_lblAdminShowSeccionesMouseEntered

    private void lblAdminShowSeccionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminShowSeccionesMouseExited
        if(currentAdminOpaqueLabel!=3){
            lblAdminShowSecciones.setOpaque(false);
            lblAdminShowSecciones.repaint();
        }
    }//GEN-LAST:event_lblAdminShowSeccionesMouseExited

    private void btnConsultarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarProfesorActionPerformed
        loadTeachers();
    }//GEN-LAST:event_btnConsultarProfesorActionPerformed

    private void loadTeachers(){
        tableConsultaTeachers.setRowCount(0);
        try{
            listaTeachers = teacherService.getTeachers();
            for(Teacher t : listaTeachers){
                String status = t.isEstado() ? "✅" : "❌";
                tableConsultaTeachers.addRow(new Object[]{
                    t.getId_profesor(),
                    t.getNombre(),
                    t.getEmail(),
                    t.getEspecialidad(),
                    t.getTelefono(),
                    status
                });
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error cargando profesores:"+ ex.getMessage());
        }
    }
    
    private void btnActualizarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCursoActionPerformed

        Course c = new Course();
        int id = Integer.parseInt(txtCursoAgregarID.getText());
        c.setId_curso(id);
        c.setNombre(txtCursoAgregarNombre.getText());
        c.setCodigo(txtCursoAgregarCodigo.getText());
        c.setSemestre((String)cmbBoxCursoAgregarSemestre.getSelectedItem());
        try{
            courseService.updateCourse(id, c);
            JOptionPane.showMessageDialog(this, "Curso actualizado correctamente.");
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al actualizar curso: " + ex.getMessage());
        }
        crudCourseClearFields();        
        loadCursos();
    }//GEN-LAST:event_btnActualizarCursoActionPerformed

    private void btnConsultarSeccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarSeccionesActionPerformed
        loadSecciones();
    }//GEN-LAST:event_btnConsultarSeccionesActionPerformed

    private void loadSecciones(){
        tableCRUDSeccion.setRowCount(0);
        try{
            listaSeccion = seccionService.getSeccions();
            for(Seccion s : listaSeccion){
                tableCRUDSeccion.addRow(new Object[]{s.getId_seccion(), s.getId_curso(), s.getId_profesor(), s.getLetra_seccion()});
            }
        }catch(Exception ex){
                JOptionPane.showMessageDialog(this, "Error cargando secciones:"+ ex.getMessage());
        }
    }
    
    private void btnAddSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSeccionActionPerformed

        Seccion s = new Seccion();
        String letraSeccion = (String)cmbBoxCrudSeccionLetra.getSelectedItem();
        s.setLetra_seccion(letraSeccion.charAt(0));
        s.setId_curso(Integer.parseInt(txtCrudSeccionIDCurso.getText()));
        s.setId_profesor(Integer.parseInt(txtCrudSeccionIDProfesor.getText()));
        
        try{
            seccionService.createSeccion(s);
            JOptionPane.showMessageDialog(this, "Sección agregada con éxito.");
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al agregar la sección: " + ex.getMessage());
        }
        clearSeccionesFields();
        loadSecciones();
    }//GEN-LAST:event_btnAddSeccionActionPerformed

    private void clearSeccionesFields(){
        txtCrudSeccionIDSeccion.setText("");
        txtCrudSeccionIDCurso.setText("");
        txtCrudSeccionIDProfesor.setText("");
        cmbBoxCrudSeccionLetra.setSelectedItem("A");
    }
    
    private void btnConsultarAsignacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarAsignacionesActionPerformed
        loadAsignaciones();
    }//GEN-LAST:event_btnConsultarAsignacionesActionPerformed

    private void loadAsignaciones(){
        tableCRUDAsignacion.setRowCount(0);
        try{
            listaAsignacion = asignacionService.getAsignaciones();
            for(Asignacion a : listaAsignacion){
                tableCRUDAsignacion.addRow(new Object[]{a.getId_asignacion(), a.getId_estudiante(), a.getId_seccion()});
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error cargando asignaciones:"+ ex.getMessage());
        }        
    }
    
    private void btnAddProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProfesorActionPerformed
        Teacher t = new Teacher();
        t.setNombre(txtProfesorNombre.getText());
        t.setEmail(txtProfesorEmail.getText() + "@edu.com");
        t.setEspecialidad(txtProfesorEspecialidad.getText());
        t.setTelefono(txtProfesorTelefono.getText());
        String encryptedPassword = "";
        try {
            encryptedPassword = encryption.hashMD5(txtTeacherPassword.getText());
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(app.class.getName()).log(Level.SEVERE, null, ex);
        }
        t.setPassword(encryptedPassword);
        t.setEstado(true);
        
        try {
            teacherService.createTeacher(t);
            JOptionPane.showMessageDialog(this, "Profesor agregado con éxito.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al agregar el profesor: " + ex.getMessage());
        }
        
        txtProfesorNombre.setText("");
        txtProfesorEmail.setText("");
        txtProfesorEspecialidad.setText("");
        txtProfesorTelefono.setText("");
        txtTeacherPassword.setText("");
    }//GEN-LAST:event_btnAddProfesorActionPerformed

    private void tblProfesorUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProfesorUpdateMouseClicked
 
        int row = tblProfesorUpdate.getSelectedRow();
        txtIDProfesorUpdate.setText(String.valueOf(tblProfesorUpdate.getValueAt(row, 0)));
        txtNombreProfesorUpdate.setText((String) tblProfesorUpdate.getValueAt(row, 1));
        txtEmailProfesorUpdate.setText((String) tblProfesorUpdate.getValueAt(row, 2));
        txtEspecialidadProfesorUpdate.setText((String) tblProfesorUpdate.getValueAt(row, 3));
        txtTelefonoProfesorUpdate.setText((String) tblProfesorUpdate.getValueAt(row, 4));
        
    }//GEN-LAST:event_tblProfesorUpdateMouseClicked

    private void btnActualizarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProfesorActionPerformed
 
        int row = tblProfesorUpdate.getSelectedRow();
        boolean darBaja = radioButtonDarDeBajaProfesorUpdate.isSelected();
        Teacher t = new Teacher();
        int id = Integer.parseInt(txtIDProfesorUpdate.getText());
        t.setId_profesor(id);
        t.setNombre(txtNombreProfesorUpdate.getText());
        t.setEmail(txtEmailProfesorUpdate.getText()  + "@edu.com");
        t.setEspecialidad(txtEspecialidadProfesorUpdate.getText());
        t.setTelefono(txtTelefonoProfesorUpdate.getText());
        if(txtPasswordProfesorUpdate.getText().equals("")){
            t.setPassword(listaTeachers.get(row).getPassword());
        }else{          
            try {     
                String encryptedPass = encryption.hashMD5(txtPasswordProfesorUpdate.getText());
                t.setPassword(encryptedPass);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(app.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        t.setEstado(!darBaja);
        
        try {
            teacherService.updateTeacher(id, t);
            JOptionPane.showMessageDialog(this, "Profesor actualizado correctamente.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al actualizar profesor: " + ex.getMessage());
        }
        loadTeachers();
        txtIDProfesorUpdate.setText("");
        txtNombreProfesorUpdate.setText("");
        txtEmailProfesorUpdate.setText("");
        txtEspecialidadProfesorUpdate.setText("");
        txtTelefonoProfesorUpdate.setText("");
        radioButtonDarDeBajaProfesorUpdate.setSelected(false);
    }//GEN-LAST:event_btnActualizarProfesorActionPerformed

    private void btnAgregarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEstudianteActionPerformed

        Student s = new Student();
        s.setNombre(txtAgregarEstudianteNombre.getText());
        s.setApellido(txtAgregarEstudianteApellido.getText());
        s.setEmail(txtAgregarEstudianteCorreo.getText() + "@edu.student.com");
        s.setCarnet(txtAgregarEstudianteCarnet.getText());
        s.setTelefono(txtAgregarEstudianteTelefono.getText());
        
        try{
            studentService.createStudent(s);
            JOptionPane.showMessageDialog(this, "Estudiante agregado con éxito");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error al agregar el estudiante: " + ex.getMessage());
        }
        
        txtAgregarEstudianteNombre.setText("");
        txtAgregarEstudianteApellido.setText("");
        txtAgregarEstudianteCorreo.setText("");
        txtAgregarEstudianteCarnet.setText("");
        txtAgregarEstudianteTelefono.setText("");    
    }//GEN-LAST:event_btnAgregarEstudianteActionPerformed

    private void btnConsultarEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarEstudiantesActionPerformed
        loadStudents();
    }//GEN-LAST:event_btnConsultarEstudiantesActionPerformed

    private void btnActualizarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEstudianteActionPerformed
        Student s = new Student();
        int id = Integer.parseInt(txtActualizarAlumnoID.getText());
        s.setId_estudiante(id);
        s.setNombre(txtActualizarAlumnoNombre.getText());
        s.setApellido(txtActualizarAlumnoApellido.getText());
        s.setEmail(txtActualizarAlumnoEmail.getText());
        s.setCarnet(txtActualizarAlumnoCarnet.getText());
        s.setTelefono(txtActualizarAlumnoTelefono.getText());
        
        try{
            studentService.updateStudent(id, s);
            JOptionPane.showMessageDialog(this, "Estudiante actualizado correctamente.");
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al actualizar estudiante: " + ex.getMessage());
        }
        loadStudents();
        txtActualizarAlumnoID.setText("");
        txtActualizarAlumnoNombre.setText("");
        txtActualizarAlumnoApellido.setText("");
        txtActualizarAlumnoEmail.setText("");
        txtActualizarAlumnoCarnet.setText("");
        txtActualizarAlumnoTelefono.setText("");         
    }//GEN-LAST:event_btnActualizarEstudianteActionPerformed

    private void tblStudentUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentUpdateMouseClicked
       int row = tblStudentUpdate.getSelectedRow();
       txtActualizarAlumnoID.setText(String.valueOf(tblStudentUpdate.getValueAt(row, 0)));
       txtActualizarAlumnoNombre.setText((String) tblStudentUpdate.getValueAt(row, 1));
       txtActualizarAlumnoApellido.setText((String) tblStudentUpdate.getValueAt(row, 2));
       txtActualizarAlumnoEmail.setText((String) tblStudentUpdate.getValueAt(row, 3));
       txtActualizarAlumnoCarnet.setText((String) tblStudentUpdate.getValueAt(row, 4));
       txtActualizarAlumnoTelefono.setText((String) tblStudentUpdate.getValueAt(row, 5));
        
    }//GEN-LAST:event_tblStudentUpdateMouseClicked

    private void btnConsultarCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCursosActionPerformed
        loadCursos();
    }//GEN-LAST:event_btnConsultarCursosActionPerformed

    private void loadCursos(){
        tableCRUDCurso.setRowCount(0);
        try{
            listaCursos = courseService.getCourses();
            for(Course c : listaCursos){
                tableCRUDCurso.addRow(new Object[]{
                    c.getId_curso(),
                    c.getNombre(),
                    c.getCodigo(),
                    c.getSemestre(),
                });
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error cargando cursos:"+ ex.getMessage());
        }        
    }
    
    private void tblCursoCRUDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCursoCRUDMouseClicked
        
        int row = tblCursoCRUD.getSelectedRow();
        txtCursoAgregarID.setText(String.valueOf(tblCursoCRUD.getValueAt(row, 0)));
        txtCursoAgregarNombre.setText((String) tblCursoCRUD.getValueAt(row, 1));
        txtCursoAgregarCodigo.setText((String) tblCursoCRUD.getValueAt(row, 2));
        cmbBoxCursoAgregarSemestre.setSelectedItem((String) tblCursoCRUD.getValueAt(row, 3));

    }//GEN-LAST:event_tblCursoCRUDMouseClicked

    private void btnClearSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearSelectionActionPerformed
        crudCourseClearFields();          
    }//GEN-LAST:event_btnClearSelectionActionPerformed

    private void btnAddCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCursoActionPerformed
        Course c = new Course();
        c.setNombre(txtCursoAgregarNombre.getText());
        c.setCodigo(txtCursoAgregarCodigo.getText());
        int selectedSemester = cmbBoxCursoAgregarSemestre.getSelectedIndex();
        c.setSemestre(cmbBoxCursoAgregarSemestre.getItemAt(selectedSemester));
        
        try{
            courseService.createCourse(c);
            JOptionPane.showMessageDialog(this, "Curso agregado con éxito.");
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al agregar el curso: " + ex.getMessage());
        }
        crudCourseClearFields();
        loadCursos();
    }//GEN-LAST:event_btnAddCursoActionPerformed

    private void tblCrudSeccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCrudSeccionMouseClicked
        int row = tblCrudSeccion.getSelectedRow();
        txtCrudSeccionIDSeccion.setText(String.valueOf(tblCrudSeccion.getValueAt(row, 0)));
        txtCrudSeccionIDCurso.setText(String.valueOf(tblCrudSeccion.getValueAt(row, 1)));
        txtCrudSeccionIDProfesor.setText(String.valueOf(tblCrudSeccion.getValueAt(row, 2)));
        cmbBoxCrudSeccionLetra.setSelectedItem(tblCrudSeccion.getValueAt(row, 3));

    }//GEN-LAST:event_tblCrudSeccionMouseClicked

    private void btnUpdateSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSeccionActionPerformed

        Seccion s = new Seccion();
        int id = Integer.parseInt(txtCrudSeccionIDSeccion.getText());
        s.setId_seccion(id);
        String letraSeccion = (String)cmbBoxCrudSeccionLetra.getSelectedItem();
        s.setLetra_seccion(letraSeccion.charAt(0));
        s.setId_curso(Integer.parseInt(txtCrudSeccionIDCurso.getText()));
        s.setId_profesor(Integer.parseInt(txtCrudSeccionIDProfesor.getText()));
        
        try{
            seccionService.updateSeccion(id, s);
            JOptionPane.showMessageDialog(this, "Sección actualizada correctamente.");
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al actualizar sección: " + ex.getMessage());
        }
        clearSeccionesFields();
        loadSecciones();
    }//GEN-LAST:event_btnUpdateSeccionActionPerformed

    private void btnAsignarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarCursoActionPerformed

        int idEstudiante = Integer.parseInt(txtIDEstudiante.getText());
        int idSeccion = Integer.parseInt(txtIDSeccion.getText());
        
        Asignacion a = new Asignacion();
        a.setId_estudiante(idEstudiante);
        a.setId_seccion(idSeccion);
        
        try{
            asignacionService.createAsignacion(a);
            JOptionPane.showMessageDialog(this, "Asignación creada con éxito.");
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al crear la asignación: " + ex.getMessage());
        }
        clearAsignacionFields();
        loadAsignaciones();      
    }//GEN-LAST:event_btnAsignarCursoActionPerformed

    private void btnUpdateAsignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAsignacionActionPerformed

        int idAsignacion = Integer.parseInt(txtIDAsignacion.getText());
        int idEstudiante = Integer.parseInt(txtIDEstudiante.getText());
        int idSeccion = Integer.parseInt(txtIDSeccion.getText());
        
        Asignacion a = new Asignacion();
        a.setId_asignacion(idAsignacion);
        a.setId_estudiante(idEstudiante);
        a.setId_seccion(idSeccion);
    
        try{
            asignacionService.updateAsignacion(idAsignacion, a);
            JOptionPane.showMessageDialog(this, "Asignacion actualizada correctamente.");
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al actualizar asignación: " + ex.getMessage());
        }
        clearAsignacionFields();        
        loadAsignaciones();
    }//GEN-LAST:event_btnUpdateAsignacionActionPerformed

    private void tblAsignacionCRUDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAsignacionCRUDMouseClicked
        int row = tblAsignacionCRUD.getSelectedRow();
        txtIDAsignacion.setText(String.valueOf(tblAsignacionCRUD.getValueAt(row, 0)));
        txtIDEstudiante.setText(String.valueOf(tblAsignacionCRUD.getValueAt(row, 1)));
        txtIDSeccion.setText(String.valueOf(tblAsignacionCRUD.getValueAt(row, 2)));
    }//GEN-LAST:event_tblAsignacionCRUDMouseClicked

    private void lblDashboardCourse3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardCourse3MouseClicked
        CardLayout card = (CardLayout)pnlTeacherContent.getLayout();
        initCoursePage(lblDashboardCourse3.getText());
        card.show(pnlTeacherContent, "teacherCourse");
        lblTeacherTopInfo.setText(lblDashboardCourse3.getText());
        lblTeacherTopInfo.setIcon((new javax.swing.ImageIcon(getClass().getResource("/courseIcon.png"))));
    }//GEN-LAST:event_lblDashboardCourse3MouseClicked

    private void lblDashboardCourse4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardCourse4MouseClicked
        CardLayout card = (CardLayout)pnlTeacherContent.getLayout();
        initCoursePage(lblDashboardCourse4.getText());
        card.show(pnlTeacherContent, "teacherCourse");
        lblTeacherTopInfo.setText(lblDashboardCourse4.getText());
        lblTeacherTopInfo.setIcon((new javax.swing.ImageIcon(getClass().getResource("/courseIcon.png"))));
    }//GEN-LAST:event_lblDashboardCourse4MouseClicked

    private void lblDashboardCourse5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardCourse5MouseClicked
        CardLayout card = (CardLayout)pnlTeacherContent.getLayout();
        initCoursePage(lblDashboardCourse5.getText());
        card.show(pnlTeacherContent, "teacherCourse");
        lblTeacherTopInfo.setText(lblDashboardCourse5.getText());
        lblTeacherTopInfo.setIcon((new javax.swing.ImageIcon(getClass().getResource("/courseIcon.png"))));
    }//GEN-LAST:event_lblDashboardCourse5MouseClicked

    private void lblDashboardCourse6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardCourse6MouseClicked
        CardLayout card = (CardLayout)pnlTeacherContent.getLayout();
        initCoursePage(lblDashboardCourse6.getText());
        card.show(pnlTeacherContent, "teacherCourse");
        lblTeacherTopInfo.setText(lblDashboardCourse6.getText());
        lblTeacherTopInfo.setIcon((new javax.swing.ImageIcon(getClass().getResource("/courseIcon.png"))));
    }//GEN-LAST:event_lblDashboardCourse6MouseClicked

    private void clearAsignacionFields(){
        txtIDAsignacion.setText("");
        txtIDEstudiante.setText("");
        txtIDSeccion.setText("");
    }
    
    private void crudCourseClearFields(){
        txtCursoAgregarID.setText("");
        txtCursoAgregarNombre.setText("");
        txtCursoAgregarCodigo.setText("");
        cmbBoxCursoAgregarSemestre.setSelectedItem("--");   
        tblCursoCRUD.clearSelection();
    }
    
    private void loadStudents(){
        tableConsultaEstudiantes.setRowCount(0);
        try{
           listaEstudiantes = studentService.getStudents();
           for(Student s : listaEstudiantes){
               tableConsultaEstudiantes.addRow(new Object[]{s.getId_estudiante(), s.getNombre(), s.getApellido(), s.getEmail() ,s.getCarnet(), s.getTelefono()});
           }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error cargando estudiantes:"+ ex.getMessage());
        }
    }
    
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
    
    private void initAdmin(){
        initAdminMenuOpaque(0);
        adminTopInfo();
    }
    
    private void adminTopInfo(){
        switch(currentAdminOpaqueLabel){
            case 0:{
                lblAdminTopInfo.setText("Profesores");                
                lblAdminTopInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teacher.png")));
                break;
            }
            case 1:{
                lblAdminTopInfo.setText("Estudiantes");
                lblAdminTopInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student.png")));
                break;
            }
            case 2:{
                lblAdminTopInfo.setText("Cursos");
                lblAdminTopInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courses.png")));
                break;
            }
            case 3:{
                lblAdminTopInfo.setText("Secciones");
                lblAdminTopInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seccion.png")));
                break;
            }
            case 4:{
                lblAdminTopInfo.setText("Asignaciones");
                lblAdminTopInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asignacion.png")));
                break;
            }
        }
    }
    
    private void initAdminMenuOpaque(int option){
        List<JLabel> labelList;
        labelList = new ArrayList<>();
        labelList.add(lblAdminShowProfesores);
        labelList.add(lblAdminShowEstudiantes);
        labelList.add(lblAdminShowCursos);
        labelList.add(lblAdminShowSecciones);
        labelList.add(lblAdminShowAsignaciones);
        
        if(currentAdminOpaqueLabel==option){
            return;
        }
        
        labelList.get(option).setOpaque(true);
        labelList.get(currentAdminOpaqueLabel).setOpaque(false);
        
        labelList.get(option).repaint();
        labelList.get(currentAdminOpaqueLabel).repaint();
        currentAdminOpaqueLabel = option;
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
                lblTeacherTopInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grades.png"))); //TODO
                break;
            }
            case 2:{
                lblTeacherTopInfo.setText("Tareas");
                lblTeacherTopInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homework.png"))); //TODO
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
    private javax.swing.JPanel actualizarEstudiante;
    private javax.swing.JPanel adminApp;
    private javax.swing.JPanel agregarEstudiante;
    private javax.swing.JPanel asignacionesCRUD;
    private javax.swing.JButton btnActualizarCurso;
    private javax.swing.JButton btnActualizarEstudiante;
    private javax.swing.JButton btnActualizarProfesor;
    private javax.swing.JButton btnAddCurso;
    private javax.swing.JButton btnAddGradeBuscarTareas;
    private javax.swing.JButton btnAddGradeLoadStudents;
    private javax.swing.JButton btnAddGrades;
    private javax.swing.JButton btnAddProfesor;
    private javax.swing.JButton btnAddSeccion;
    private javax.swing.JButton btnAgregarEstudiante;
    private javax.swing.JButton btnAgregarTarea;
    private javax.swing.JButton btnAsignarCurso;
    private javax.swing.JButton btnClearSelection;
    private javax.swing.JButton btnConsultarAsignaciones;
    private javax.swing.JButton btnConsultarCursos;
    private javax.swing.JButton btnConsultarEstudiantes;
    private javax.swing.JButton btnConsultarNotas;
    private javax.swing.JButton btnConsultarProfesor;
    private javax.swing.JButton btnConsultarSecciones;
    private javax.swing.JButton btnConsultarTareas;
    private javax.swing.JButton btnCourseAddTarea;
    private javax.swing.JButton btnLoginLog;
    private javax.swing.JButton btnSortGradesConsulta;
    private javax.swing.JButton btnUpdateAsignacion;
    private javax.swing.JButton btnUpdateGrade;
    private javax.swing.JButton btnUpdateSeccion;
    private javax.swing.JButton btnUpdateTarea;
    private javax.swing.JComboBox<String> cmbBoxAddGradeSeccion;
    private javax.swing.JComboBox<String> cmbBoxConsultaNotasCurso;
    private javax.swing.JComboBox<String> cmbBoxConsultaNotasEstudiante;
    private javax.swing.JComboBox<String> cmbBoxConsultaNotasEvaluacion;
    private javax.swing.JComboBox<String> cmbBoxConsultaNotasLetraSeccion;
    private javax.swing.JComboBox<String> cmbBoxCrudSeccionLetra;
    private javax.swing.JComboBox<String> cmbBoxCursoAgregarSemestre;
    private javax.swing.JComboBox<String> cmbBoxHomeworkCourses;
    private javax.swing.JComboBox<String> cmbBoxHomeworkSection;
    private javax.swing.JComboBox<String> cmbBoxRegistrarNotaTipoEvaluacion;
    private javax.swing.JComboBox<String> cmbBoxUpdateHomeworkCourses;
    private javax.swing.JComboBox<String> cmbBoxUpdateHomeworkSection;
    private javax.swing.JComboBox<String> cmbCoursesAddGrade;
    private javax.swing.JPanel course;
    private javax.swing.JPanel cursoCRUD;
    private javax.swing.JPanel dashboard;
    private javax.swing.JPanel estudiantesCRUD;
    private javax.swing.JPanel grades;
    private javax.swing.JPanel homework;
    private javax.swing.JPanel inSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblAddNotaMissingTarea;
    private javax.swing.JLabel lblAddNotaMissingTareaSelected;
    private javax.swing.JLabel lblAdminLogOut;
    private javax.swing.JLabel lblAdminShowAsignaciones;
    private javax.swing.JLabel lblAdminShowCursos;
    private javax.swing.JLabel lblAdminShowEstudiantes;
    private javax.swing.JLabel lblAdminShowProfesores;
    private javax.swing.JLabel lblAdminShowSecciones;
    private javax.swing.JLabel lblAdminTopInfo;
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
    private javax.swing.JPanel pnlAdminContent;
    private javax.swing.JPanel pnlAdminInfo;
    private javax.swing.JPanel pnlAdminTop;
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
    private javax.swing.JPanel profesoresCRUD;
    private javax.swing.JRadioButton radioButtonDarDeBajaProfesorUpdate;
    private javax.swing.JScrollPane scrollPaneAddGradesTable;
    private javax.swing.JScrollPane scrollPaneDescripcionTarea;
    private javax.swing.JScrollPane scrollPaneGrades;
    private javax.swing.JScrollPane scrollPaneTableCursos;
    private javax.swing.JScrollPane scrollPaneTeacherCourse;
    private javax.swing.JScrollPane scrollTableConsultaNotas;
    private javax.swing.JScrollPane scrollTableCourseStudents;
    private javax.swing.JScrollPane scrollUpdateHomework;
    private javax.swing.JPanel seccionesCRUD;
    private javax.swing.JSpinner spinFechaEntrega;
    private javax.swing.JSpinner spinnerUpdateTareaFechaEntrega;
    private javax.swing.JTabbedPane tabPaneMaestroCRUD;
    private javax.swing.JTabbedPane tabbedPaneHomework;
    private javax.swing.JTabbedPane tabbedPaneNotas;
    private javax.swing.JTable tableAddGrades;
    private javax.swing.JTable tableCourseStudents;
    private javax.swing.JTable tableCourseTareaList;
    private javax.swing.JTable tableGetUpdateNotes;
    private javax.swing.JTabbedPane tbPaneEstudiantes;
    private javax.swing.JTable tblAsignacionCRUD;
    private javax.swing.JTable tblCrudSeccion;
    private javax.swing.JTable tblCursoCRUD;
    private javax.swing.JTable tblProfesorUpdate;
    private javax.swing.JTable tblStudentUpdate;
    private javax.swing.JPanel teacherApp;
    private javax.swing.JTextField txtActualizarAlumnoApellido;
    private javax.swing.JTextField txtActualizarAlumnoCarnet;
    private javax.swing.JTextField txtActualizarAlumnoEmail;
    private javax.swing.JTextField txtActualizarAlumnoID;
    private javax.swing.JTextField txtActualizarAlumnoNombre;
    private javax.swing.JTextField txtActualizarAlumnoTelefono;
    private javax.swing.JTextField txtAgregarEstudianteApellido;
    private javax.swing.JTextField txtAgregarEstudianteCarnet;
    private javax.swing.JTextField txtAgregarEstudianteCorreo;
    private javax.swing.JTextField txtAgregarEstudianteNombre;
    private javax.swing.JTextField txtAgregarEstudianteTelefono;
    private javax.swing.JTextField txtAgregarTareaTitulo;
    private javax.swing.JTextArea txtAreaUpdateTareaDescripcion;
    private javax.swing.JTextField txtCrudSeccionIDCurso;
    private javax.swing.JTextField txtCrudSeccionIDProfesor;
    private javax.swing.JTextField txtCrudSeccionIDSeccion;
    private javax.swing.JTextField txtCursoAgregarCodigo;
    private javax.swing.JTextField txtCursoAgregarID;
    private javax.swing.JTextField txtCursoAgregarNombre;
    private javax.swing.JTextField txtEmailProfesorUpdate;
    private javax.swing.JTextField txtEspecialidadProfesorUpdate;
    private javax.swing.JTextField txtIDAsignacion;
    private javax.swing.JTextField txtIDEstudiante;
    private javax.swing.JTextField txtIDProfesorUpdate;
    private javax.swing.JTextField txtIDSeccion;
    private javax.swing.JTextField txtLoginEmail;
    private javax.swing.JTextField txtNombreProfesorUpdate;
    private javax.swing.JTextField txtPasswordProfesorUpdate;
    private javax.swing.JTextField txtProfesorEmail;
    private javax.swing.JTextField txtProfesorEspecialidad;
    private javax.swing.JTextField txtProfesorNombre;
    private javax.swing.JTextField txtProfesorTelefono;
    private javax.swing.JTextField txtTareaUpdateTitulo;
    private javax.swing.JTextField txtTeacherPassword;
    private javax.swing.JTextField txtTelefonoProfesorUpdate;
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
        scrollPaneAddGradesTable.getVerticalScrollBar().setUI(new CustomScrollBarUI());       
        
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

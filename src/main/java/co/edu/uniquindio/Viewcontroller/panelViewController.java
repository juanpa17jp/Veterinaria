package co.edu.uniquindio.Viewcontroller;

import co.edu.uniquindio.Clases.*;
import co.edu.uniquindio.Controllers.ClinicaVeterinaria;
import co.edu.uniquindio.Enums.Especialidad;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ResourceBundle;

public class panelViewController implements Initializable {

    // FXML Components - Mascotas
    @FXML private TextField txtfieldNombreMascota;
    @FXML private TextField txtFieldEspecie;
    @FXML private TextField txtFieldRaza;
    @FXML private TextField txtFieldEdad;
    @FXML private TextField txtFieldIdMascota;
    @FXML private TextField txtFieldPropietario;
    @FXML private Button btnRegistrarMascota;
    @FXML private Button btnLimpiarCamposMascota;
    @FXML private TableView<Mascota> tableMascotas;
    @FXML private TableColumn<Mascota, String> clNombreMascota;
    @FXML private TableColumn<Mascota, String> clEspecie;
    @FXML private TableColumn<Mascota, String> clRaza;
    @FXML private TableColumn<Mascota, Integer> clEdad;
    @FXML private TableColumn<Mascota, String> clIdMascota;

    // FXML Components - Propietarios
    @FXML private TextField txtFieldNombre;
    @FXML private TextField txtFieldApellidoPropietario;
    @FXML private TextField txtFieldCedulaPropietario;
    @FXML private TextField txtFieldTelefonoPropietario;
    @FXML private TextField txtFieldDireccionPropietario;
    @FXML private Button btnRegistrarPropietario;
    @FXML private Button btnLimpiarCamposPropietario;
    @FXML private TableView<Propietario> tbPropietarios;
    @FXML private TableColumn<Propietario, String> clNombrePropietario;
    @FXML private TableColumn<Propietario, String> clApellidoPropietario;
    @FXML private TableColumn<Propietario, String> clCedulaPropietario;
    @FXML private TableColumn<Propietario, Integer> clTelefonoPropietario;
    @FXML private TableColumn<Propietario, String> clDireccionPropietario;

    // FXML Components - Veterinarios
    @FXML private TextField txtFieldNombreVeterinario;
    @FXML private TextField txtFieldApellidoVeterinario;
    @FXML private TextField txtFieldCedulaVeterinario;
    @FXML private TextField txtFieldTelefonoVeterinario;
    @FXML private TextField txtFieldDireccionVeterinario;
    @FXML private ComboBox<Especialidad> cmboxEspecialidad;
    @FXML private TextField txtFieldIdLicencia;
    @FXML private Button btnRegistrarVeterinario;
    @FXML private Button clLimpiarCamposVeterinario;
    @FXML private TableView<Veterinario> tbVeterinarios;
    @FXML private TableColumn<Veterinario, String> clNombreVeterinario;
    @FXML private TableColumn<Veterinario, String> clApellidoVeterinario;
    @FXML private TableColumn<Veterinario, String> clCedulaVeterinario;
    @FXML private TableColumn<Veterinario, Integer> clTelefonoVeterinario;
    @FXML private TableColumn<Veterinario, String> clDireccionVeterinario;
    @FXML private TableColumn<Veterinario, Especialidad> clEspecialidad;
    @FXML private TableColumn<Veterinario, String> clLicencia;

    // FXML Components - Personal
    @FXML private TextField txtFieldNombrePersonal;
    @FXML private TextField txtFieldApellidoPersonal;
    @FXML private TextField txtFieldCedulaPersonal;
    @FXML private TextField txtFieldTelefonoPersonal;
    @FXML private TextField txtFieldDireccionPersonal;
    @FXML private Button btnRegistrarPersonal;
    @FXML private Button btnLimpiarCamposPersonal;
    @FXML private TableView<PersonalApoyo> tbPersonal;
    @FXML private TableColumn<PersonalApoyo, String> clNombrePersonal;
    @FXML private TableColumn<PersonalApoyo, String> clApellidoPersonal;
    @FXML private TableColumn<PersonalApoyo, String> clCedulaPersonal;
    @FXML private TableColumn<PersonalApoyo, Integer> clTelefonoPersonal;
    @FXML private TableColumn<PersonalApoyo, String> clDireccionPersonal;

    // FXML Components - Agendar Consulta
    @FXML private DatePicker dtpikFechaConsulta;
    @FXML private ComboBox<String> cmbxHoraConsulta;
    @FXML private TextField txtFieldMascota;
    @FXML private TextField txtFieldVeterinario;
    @FXML private TextField txtFieldMotivo;
    @FXML private Button btnAgendarConsulta;
    @FXML private Button btnLimpiarCamposAgendarConsulta;
    @FXML private TextField txtFieldConsultaPorDia;
    @FXML private Button btnBuscar;
    @FXML private Button btnRefrescarTablaAgendarConsulta;
    @FXML private TableView<AgendaCita> tbConsultasAgendada;
    @FXML private TableColumn<AgendaCita, LocalDate> clFechaAgendada;
    @FXML private TableColumn<AgendaCita, LocalTime> clHoraAgendada;
    @FXML private TableColumn<AgendaCita, String> clMascotaAgenda;
    @FXML private TableColumn<AgendaCita, String> clVeterinarioAgenda;
    @FXML private TableColumn<AgendaCita, String> clMotivoagenda;

    // FXML Components - Gestionar Consulta
    @FXML private TextField txtFieldDiagnosticoConsulta;
    @FXML private TextField txtFieldTratamientoConsulta;
    @FXML private Button btnRegistrarConsulta;
    @FXML private Button btnLimpiarCamposConsulta;
    @FXML private TextField clConsultaPorMascota;
    @FXML private Button btnBuscarConsulta;
    @FXML private Button btnRefrescarTablaConsulta;
    @FXML private TableView<Cita> tbConsultas;
    @FXML private TableColumn<Cita, LocalDate> clFechaConsulta;
    @FXML private TableColumn<Cita, LocalTime> clHoraConsulta;
    @FXML private TableColumn<Cita, String> clMascotaConsulta;
    @FXML private TableColumn<Cita, String> clVeterinarioConsulta;
    @FXML private TableColumn<Cita, String> clMotivoConsulta;
    @FXML private TableColumn<Cita, String> clDiagnosticoConsulta;
    @FXML private TableColumn<Cita, String> clTratamientoConsulta;

    private ClinicaVeterinaria controller= new ClinicaVeterinaria("Veterinaria Pancho Pelaez","Cra 32 89-87","107891");
    private ObservableList<Mascota> mascotas = FXCollections.observableArrayList();
    private ObservableList<Propietario> propietarios = FXCollections.observableArrayList();
    private ObservableList<Veterinario> veterinarios = FXCollections.observableArrayList();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        inicializarTablas();
        inicializarComboBoxes();
    }

    private void inicializarTablas() {
        // Configurar tabla de mascotas
        clNombreMascota.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        clEspecie.setCellValueFactory(new PropertyValueFactory<>("especie"));
        clRaza.setCellValueFactory(new PropertyValueFactory<>("raza"));
        clEdad.setCellValueFactory(new PropertyValueFactory<>("edad"));
        clIdMascota.setCellValueFactory(new PropertyValueFactory<>("ID"));
        cargarMascotas();

        // Configurar tabla de propietarios
        clNombrePropietario.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        clApellidoPropietario.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        clCedulaPropietario.setCellValueFactory(new PropertyValueFactory<>("id"));
        clTelefonoPropietario.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        clDireccionPropietario.setCellValueFactory(new PropertyValueFactory<>("direccion"));
        cargarPropietarios();

        // Configurar tabla de veterinarios
        clNombreVeterinario.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        clApellidoVeterinario.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        clCedulaVeterinario.setCellValueFactory(new PropertyValueFactory<>("id"));
        clTelefonoVeterinario.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        clDireccionVeterinario.setCellValueFactory(new PropertyValueFactory<>("direccion"));
        clEspecialidad.setCellValueFactory(new PropertyValueFactory<>("especialidad"));
        clLicencia.setCellValueFactory(new PropertyValueFactory<>("IDLicencia"));
        cargarVeterinarios();

        // Configurar tabla de personal
        clNombrePersonal.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        clApellidoPersonal.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        clCedulaPersonal.setCellValueFactory(new PropertyValueFactory<>("id"));
        clTelefonoPersonal.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        clDireccionPersonal.setCellValueFactory(new PropertyValueFactory<>("direccion"));
        //tbPersonal.setItems(controller.getPersonalApoyo());

        // Configurar tabla de citas agendadas
        clFechaAgendada.setCellValueFactory(new PropertyValueFactory<>("fecha"));
        clHoraAgendada.setCellValueFactory(new PropertyValueFactory<>("hora"));
        clMotivoagenda.setCellValueFactory(new PropertyValueFactory<>("motivoConsulta"));
        //tbConsultasAgendada.setItems(controller.getCitasAgendadas());

        // Configurar tabla de consultas
        clDiagnosticoConsulta.setCellValueFactory(new PropertyValueFactory<>("diagnostico"));
        clTratamientoConsulta.setCellValueFactory(new PropertyValueFactory<>("tratamiento"));
        //tbConsultas.setItems(controller.getConsultasRealizadas());
    }

    private void inicializarComboBoxes() {
        cmboxEspecialidad.setItems(FXCollections.observableArrayList(Especialidad.values()));
        cmbxHoraConsulta.setItems(FXCollections.observableArrayList(
                "7:00","08:00", "09:00", "10:00", "11:00","12:00","13:00","14:00", "15:00", "16:00", "17:00",
                "18:00"
        ));
    }

    @FXML
    void agendarConsulta(ActionEvent event) {

    }

    @FXML
    void btnLimpiarCamposMascota(ActionEvent event) {

    }

    @FXML
    void btnLimpiarCamposPersonal(ActionEvent event) {

    }

    @FXML
    void btnLimpiarCamposPropietario(ActionEvent event) {

    }

    @FXML
    void btnRegistrarMascota(ActionEvent event) {
        String nombre = txtfieldNombreMascota.getText();
        String especie = txtFieldEspecie.getText();
        String raza = txtFieldRaza.getText();
        int edad = Integer.parseInt(txtFieldEdad.getText());
        String id = txtFieldIdMascota.getText();
        String cedulaPropietario = txtFieldPropietario.getText();

        if (nombre == null || especie== null || raza == null || id == null || cedulaPropietario == null || edad <= 0) {
            mostrarAlerta("Error", "Todos los campos son obligatorios", Alert.AlertType.ERROR);
            return;
        }

        if (controller.registrarMascota(nombre, especie, raza, edad, id, cedulaPropietario)) {
            mostrarAlerta("Éxito", "Mascota registrada correctamente", Alert.AlertType.INFORMATION);
            limpiarCamposMascota();
            cargarMascotas();
        } else {
            mostrarAlerta("Error", "No se pudo registrar la mascota. Verifique los datos.", Alert.AlertType.ERROR);
        }
    }

    private void limpiarCamposMascota() {
        txtfieldNombreMascota.clear();
        txtFieldEspecie.clear();
        txtFieldRaza.clear();
        txtFieldEdad.clear();
        txtFieldIdMascota.clear();
        txtFieldPropietario.clear();
    }

    @FXML
    void btnRegistrarPersonal(ActionEvent event) {

    }

    @FXML
    void btnRegistrarPropietario(ActionEvent event) {
        String nombre = txtFieldNombre.getText();
        String apellido = txtFieldApellidoPropietario.getText();
        String cedula = txtFieldCedulaPropietario.getText();
        int telefono = Integer.parseInt(txtFieldTelefonoPropietario.getText());
        String direccion = txtFieldDireccionPropietario.getText();

        if (nombre== null || apellido == null || cedula == null || telefono == 0 || direccion == null) {
            mostrarAlerta("Error", "Todos los campos son obligatorios", Alert.AlertType.ERROR);
            return;
        }

        if (controller.registrarPropietario(nombre, apellido, cedula, direccion, telefono)) {
            mostrarAlerta("Éxito", "Propietario registrado correctamente", Alert.AlertType.INFORMATION);
            limpiarCamposPropietario();
            cargarPropietarios();
        } else {
            mostrarAlerta("Error", "No se pudo registrar el propietario. Verifique los datos.", Alert.AlertType.ERROR);
        }
    }

    private void limpiarCamposPropietario() {
        txtFieldNombre.clear();
        txtFieldApellidoPropietario.clear();
        txtFieldCedulaPropietario.clear();
        txtFieldTelefonoPropietario.clear();
        txtFieldDireccionPropietario.clear();
    }

    public void cargarMascotas() {
        mascotas.setAll(controller.getMascotas());
        tableMascotas.setItems(mascotas);
    }
    public void cargarPropietarios(){
        propietarios.setAll(controller.getPropietarios());
        tbPropietarios.setItems(propietarios);
    }
    public void cargarVeterinarios(){
        veterinarios.setAll(controller.getVeterinarios());
        tbVeterinarios.setItems(veterinarios);
    }

    @FXML
    void consultarPorDia(ActionEvent event) {

    }

    @FXML
    void consultarTablaMascota(ActionEvent event) {

    }

    @FXML
    void limpiarCamposAgendarConsulta(ActionEvent event) {

    }

    @FXML
    void limpiarCamposConsulta(ActionEvent event) {

    }

    @FXML
    void limpiarCamposVeterinario(ActionEvent event) {

    }

    @FXML
    void refrescarTablaAgendarConsulta(ActionEvent event) {

    }

    @FXML
    void refrescarTablaConsulta(ActionEvent event) {

    }

    @FXML
    void registrarConsulta(ActionEvent event) {

    }

    @FXML
    void registrarVeterinario(ActionEvent event) {

    }



    private void mostrarAlerta(String titulo, String mensaje, Alert.AlertType tipo) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

}

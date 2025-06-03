public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Lionel", "Messi", "12345678", 30, "Calle Falsa 123",
                "1234-5678", "E123", "Ingeniería", 8.5);
        estudiante.mostrarInformacion();
        estudiante.estudiar();
    }
}

// Clase Padre
class Persona {
    String nombre;
    String apellido;
    String dni;
    int edad;
    String direccion;
    String telefono;

    public Persona(String nombre, String apellido, String dni, int edad, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("ID: " + dni);
        System.out.println("Edad: " + edad);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
    }

    // Getters necesarios para Estudiante
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}

// Clase Hija Estudiante
class Estudiante extends Persona {
    private String matricula;
    private String carrera;
    private double promedio;

    public Estudiante(String nombre, String apellido, String dni, int edad, String direccion, String telefono,
                      String matricula, String carrera, double promedio) {
        super(nombre, apellido, dni, edad, direccion, telefono);
        this.matricula = matricula;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio: " + promedio);
    }

    public void estudiar() {
        System.out.println("El estudiante " + getNombre() + " " + getApellido() + " está estudiando " + carrera + ".");
    }

    // Getters y Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}

// Clase Hija Profesor
class Profesor extends Persona {
    String departamento;
    double salario;
    int añosexp;

    public Profesor(String nombre, String apellido, String dni, int edad, String direccion, String telefono,
                    String departamento, double salario, int añosexp) {
        super(nombre, apellido, dni, edad, direccion, telefono);
        this.departamento = departamento;
        this.salario = salario;
        this.añosexp = añosexp;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Departamento: " + departamento);
        System.out.println("Salario: " + salario);
        System.out.println("Años de Experiencia: " + añosexp);
    }
}




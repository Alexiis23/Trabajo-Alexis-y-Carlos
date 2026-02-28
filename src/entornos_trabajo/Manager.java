package entornos_trabajo;

public class Manager {

    private String nombre;
    private double salario;
    private String departamento;
    private int empleadosACargo;

    public Manager() {
    }

    public Manager(String nombre, double salario, String departamento, int empleadosACargo) {
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
        this.empleadosACargo = empleadosACargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getEmpleadosACargo() {
        return empleadosACargo;
    }

    public void setEmpleadosACargo(int empleadosACargo) {
        this.empleadosACargo = empleadosACargo;
    }

    public void calcularSalarioAnual() {
        System.out.println(salario * 12 + empleadosACargo * 1000);
    }
}

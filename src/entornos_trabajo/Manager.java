package entornos_trabajo;

public class Manager extends Employee {

    private int empleadosACargo;

    public Manager() {
        super();
    }

    public Manager(String nombre, double salario, String departamento, int empleadosACargo) {
        super();
        setNombre(nombre);
        setSalario(salario);
        setDepartamento(departamento);
        this.empleadosACargo = empleadosACargo;
    }

    public int getEmpleadosACargo() {
        return empleadosACargo;
    }

    public void setEmpleadosACargo(int empleadosACargo) {
        this.empleadosACargo = empleadosACargo;
    }

    @Override
    public void calcularSalarioAnual() {
        System.out.println(getSalario() * 12 + empleadosACargo * 1000);
    }
}
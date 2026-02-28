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
    public double calcularSalarioAnual() {
        return getSalario() * 12 + empleadosACargo * 1000;
    }
}


package parcial1lab;

public class EmpleadoAsalariado extends Empleado {
    // Additional attribute
    private double deducciones;

    // Constructor
    public EmpleadoAsalariado(String nombre, double salarioBase, double deducciones) {
        super(nombre, salarioBase);
        this.deducciones = deducciones;
    }

    // Implement abstract method to calculate salary
    @Override
    public double calcularSalario() {
        return salarioBase - deducciones;
    }
}

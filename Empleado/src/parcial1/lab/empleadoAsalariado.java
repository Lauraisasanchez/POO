
package parcial1.lab;

public class empleadoAsalariado extends Empleado {
    private double deducciones;

    public empleadoAsalariado(double deducciones, String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.deducciones = deducciones;
    }

    public double getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(double deducciones) {
        this.deducciones = deducciones;
    }
    
    
}

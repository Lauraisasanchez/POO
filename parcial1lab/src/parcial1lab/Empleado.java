
package parcial1lab;

public abstract class Empleado {
 
    String nombre;
    double salarioBase;


    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();
}
    



package parcial1.lab;


public class empleadoHoras extends Empleado {
    private int horasTrabajadas;
    private double tarifaHora;

    public empleadoHoras(int horasTrabajadas, double tarifaHora, String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }
    public double calcularSalario(){
        double salario;
        salario=(this.horasTrabajadas*this.tarifaHora);
        return salario;
    }
}

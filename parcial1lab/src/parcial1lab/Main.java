
package parcial1lab;

public class Main {

    public static void main(String[] args) {
     
        Empleado[] empleados = new Empleado[10];

        empleados[0] = new EmpleadoAsalariado("luisa", 3500.0, 500.0);
        empleados[1] = new EmpleadoPorHoras("laura", 0.0, 160, 15.0);
        empleados[2] = new EmpleadoAsalariado("Charlie", 4000.0, 600.0);
        empleados[3] = new EmpleadoPorHoras("David", 0.0, 120, 12.0);
        empleados[4] = new EmpleadoAsalariado("Eva", 3000.0, 450.0);
        empleados[5] = new EmpleadoPorHoras("Frank", 0.0, 140, 14.0);
        empleados[6] = new EmpleadoAsalariado("Grace", 4500.0, 700.0);
        empleados[7] = new EmpleadoPorHoras("Hank", 0.0, 180, 16.0);
        empleados[8] = new EmpleadoAsalariado("Ivy", 3800.0, 550.0);
        empleados[9] = new EmpleadoPorHoras("Jack", 0.0, 130, 13.0);

        System.out.println("Empleados por horas:");
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoPorHoras) {
                System.out.println("Nombre: " + empleado.nombre + ", Salario: " + empleado.calcularSalario());
            }
        }
        
        System.out.println("Empleados asalariados:");
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoAsalariado) {
                System.out.println("Nombre: " + empleado.nombre + ", Salario: " + empleado.calcularSalario());
            }
        }

        empleados[0].nombre = "luisa";

        System.out.println("Empleados por horas (despues de la modificacion):");
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoPorHoras) {
                System.out.println("Nombre: " + empleado.nombre + ", Salario: " + empleado.calcularSalario());
            }
        }

        Empleado empleadoEspecifico = empleados[2];
        System.out.println("Empleado Especifico - Nombre: " + empleadoEspecifico.nombre + ", Salario: " + empleadoEspecifico.calcularSalario());
    }
}

 
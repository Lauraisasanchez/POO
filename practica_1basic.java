//laura isabel sanchez fernandez
package poo;

public class POO {

    public static void main(String[] args) {
        /*int edad = 25;
        double temperatura = 98.6;
        char calificacion = ´A´;
        boolean activo = true;
        String nombre = "John Doe";
        
        int[] numeros = {1, 2, 3, 4, 5};*/
        //System.out.println("Hello world");

        // Crear  una instancia de la clase POO
        POO intance = new POO();
        
        // Llamar al método action en la instancia creada
        int result = intance.sum(1, 2);
        System.out.println("Result: " + result);
    }

    public int sum(int num1, int num2) {
        // System.out.println("Result: " + (num1 + num2));
        return (num1 + num2);
    }
}

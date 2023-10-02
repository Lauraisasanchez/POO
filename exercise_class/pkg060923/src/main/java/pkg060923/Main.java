package pkg060923;

import exercise.persona;

public class Main {

    public static void main(String[] args) {
        
       persona[] arrayPerson=new persona[3];
       
       arrayPerson[0] = new persona("laura", "sanchez", "104623013232235");
        arrayPerson[1] = new persona("luisa", "florez", "1233437373783289");
        arrayPerson[2] = new persona("anny", "fernandez", "1066656433235");
       
       /* UN SOLO OBJETO
            persona person = new persona("Fernando", "Mulato", "104623013232235");
            persona person2 = new persona("Juan", "Lopez", "1233437373783289");
        
            System.out.println("-------------------");
            System.out.println(person.getFirstName());
            System.out.println(person.getLastName());
            System.out.println(person.getDocument());
            System.out.println("-------------------");

            person.setFirstName("Jesus");// Cambiamos el valor de la variable firstName atravez del método set.

            System.out.println("-------------------");
            System.out.println(person.getFirstName());
            System.out.println(person.getLastName());
            System.out.println(person.getDocument());
            System.out.println("-------------------");
        */
       
        //arrayPerson[0].setFirstName("Jesus");// Cambiamos el valor del variable firstName atravez del método set. Para vector
        for (int i = 0; i < 3; i++) {
        System.out.println(arrayPerson[i].getFirstName());
        }
        for (persona person : arrayPerson) {
        System.out.println(person.getFirstName());
        }
        //for (int i = 0; i < arrayPerson.length; i++) {
        //System.out.println(arrayPerson[i].getFirstName());
        }
    }





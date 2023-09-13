
package clase4;


public class Main {
     public static void main(String[] args) {

        //-->Declaracion del objeto PERRO
	    animal perro = new perro("Stich","Carnivoro",15,"Doberman");
        perro.Alimentarse();
        //-->Declaracion de otro objeto PERRO
        perro perro1 = new perro("Teddy","Croquetas",10,"Chihuahua");
        perro1.Alimentarse();
        //-->Declaracion del objeto Gato
        animal gato = new gato("Pelusa","Galletas",15,"Siames");
        gato.Alimentarse();
        //-->Declaracion del objeto Caballo
        animal caballo = new caballo("juan","Pasto",25,"Fino");
        caballo.Alimentarse();
        //delaracion de objeto araña
        animal araña = new araña("faber","fourloko",18,"tarantula" );
        araña.Alimentarse();
        //declaracion del objeto sapo 
        animal sapo = new sapo("sebacho","gusanos",17,"feka" );
        sapo.Alimentarse();
    }
}
    

package exercise;

public class persona {
    
    String FirstName;
    String lastName;
    String document;//poner el static sirve para poder acceder al main
    
    //constructor
    public persona(String FirstName,String lastName,String document){
        this.FirstName=FirstName;
        this.lastName=lastName;
        this.document=document;
    }
    
    //metodo get. obtener valor
    public String getFirstName(){
        return FirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDocument() {
        return document;
    }

    //metodo set.asignar valor

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
    


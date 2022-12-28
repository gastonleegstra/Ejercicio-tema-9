public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Ana");
        cliente.setEdad(60);
        cliente.setTelefono(42649074);
        cliente.setCredito(90000.70);
        //imprimi cliente
        System.out.println("Cliente: "+cliente.getNombre()+
                "\n Edad: "+cliente.getEdad()+
                "\n Telefono: "+cliente.getTelefono()+
                "\n Credito: "+cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Eduardo");
        trabajador.setEdad(45);
        trabajador.setTelefono(42303026);
        trabajador.setSalario(150000.50);
        //imprimi trabajador
        System.out.println("Trabajado: "+trabajador.getNombre()+
                            "\n Edad: "+trabajador.getEdad()+
                            "\n Telefono: "+trabajador.getTelefono()+
                            "\n Salario: "+trabajador.getSalario());
    }
}
class Persona{
    private int edad;
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    private String nombre;
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    private  int telefono;
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
}

class Cliente extends Persona{
    private double credito;
    public void setCredito(double credito){
        this.credito = credito;
    }

    public double getCredito(){
        return this.credito;
    }
}
class Trabajador extends Persona{
    private double salario;

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return this.salario;
    }
}
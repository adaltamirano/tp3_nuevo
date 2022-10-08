package tp3.t3_ip;

public class Funciones {
    public static void main(String[] args) {
        suma(  20 , 30, 50);
        Auto miAuto= new Auto();
        miAuto.AgregarPuertas();
        System.out.println("eL numero total de puertas es de: "+miAuto.puertas);
    }
    public static void suma(int a, int b, int c){
        int otroResultado;
        otroResultado= a +b + c;
        String text = "La suma de los valores a + b + c : " + otroResultado;
        System.out.println(text);

    }
}
class Auto{
    public int puertas= 3;
    public void AgregarPuertas(){
        this.puertas++;
    }
}
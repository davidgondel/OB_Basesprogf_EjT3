public class Main {
    public static void main(String[] args) {
        int resultado=suma(4,3, 5);
        System.out.println(resultado);
        Coche miCoche=new Coche();
        miCoche.anadirPuertas();
        System.out.println(miCoche.puertas);
    }
    public static int suma(int a, int b, int c){
        return a+b+c;
    }
    static class Coche {
        public int puertas=0;
        public void anadirPuertas(){
            this.puertas++;
        }
    }
}
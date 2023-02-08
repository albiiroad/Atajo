/**
 * Bicicleta class
 *
 * @Java IES Severo Ochoa
 * @2.0
 */

public class Bicicleta {
    public Bicicleta(){
        int ruedas = 4;
        boolean luces = false;
        String marca = "Orbea";
    }

    public static int calcularRuta1(int[] camino1){
        int sum = 0;
        for (int i = 0; i < camino1.length; i++) {
            sum = sum+camino1[i];
        }
        return sum;
    }
    public static int calcularRuta2(int[] camino2){
        int sum = 0;
        for (int i = 0; i < camino2.length; i++) {
            sum = sum+camino2[i];
        }
        return sum;
    }
    public static int calcularRuta3(int[] camino3){
        int sum = 0;
        for (int i = 0; i < camino3.length; i++) {
            sum = sum+camino3[i];
        }
        return sum;
    }

    public static String rutaCorta(int [] camino1, int [] camino2, int [] camino3)
    {
        if(calcularRuta1(camino1) < calcularRuta2(camino2) && calcularRuta1(camino1) < calcularRuta3(camino3)){
            return "camino1";
        }else if(calcularRuta2(camino2) < calcularRuta3(camino3) && calcularRuta2(camino2) < calcularRuta1(camino1)){
            return "camino2";
        }else if(calcularRuta3(camino3) < calcularRuta2(camino2) && calcularRuta3(camino3) < calcularRuta1(camino1)){

        }return "camino3";

    }

    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta();
        int[] camino1 = {12,34,21,46,25,49,30};
        int[] camino2 = {24,1,5,2,10,15,21};
        int[] camino3 = {1,5,6,7,8,10,1,46,10,1};
        System.out.println("El camino más corto es: "+bici.rutaCorta(camino1,camino2,camino3)+".");
    }
}


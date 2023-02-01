import java.util.Arrays;

public class Tartaglia {

    public static void main(String[] args) {
        int[] tartaglioso = genTriangle(7);
        System.out.println(Arrays.toString(tartaglioso));
    }

    /* questo metodo prende in input un intero n e ritorna un array lungo n+1 che rappresenti
    la n-esima riga del triangolo di Tartaglia
     */
    public static int[] genTriangle(int n) {
        // caso base
        if (n == 0) {
            int[] array = {1};
            System.out.println(Arrays.toString(array));
            return array;
        }
        else {
            int[] oldArray = genTriangle(n-1);
            int[] newArray = new int[n+1];
            newArray[0] = 1;
            newArray[newArray.length-1] = 1;
            for (int i = 1; i < newArray.length-1; i++) {

                newArray[i] = oldArray[i-1] + oldArray[i];
            }
            System.out.println(Arrays.toString(newArray));
            return newArray;
        }
    }

}


package PBO;

/**
 *
 * @author NaufalRafif
 */
public class Matematika implements InterfaceMTK{

    @Override
    public void Pertambahan(int a,int b) {
    int totaltambah= a + b;
        System.out.println("Pertambahan : "+ a +"+"+ b +" = "+ totaltambah);
    }

    @Override
    public void Pengurangan(int a, int b) {
    int totalkurang= a - b;
        System.out.println("Pengurangan : "+ a +"-"+ b +" = "+ totalkurang);
    }

    @Override
    public void Perkalian(int a, int b) {
    int totalkali= a * b;
        System.out.println("Perkalian : "+ a +"*"+ b +" = "+ totalkali);
    }

    @Override
    public void Pembagian(int a, int b) {
     int totalbagi= a / b;
        System.out.println("Pembagian : "+ a +"/"+ b +" = "+ totalbagi);
    }
    
}

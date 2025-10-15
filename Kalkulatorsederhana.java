/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulatorsederhana;

/**
 *
 * @author User-26
 */
public class Kalkulatorsederhana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        penjumlahan jumlah = new penjumlahan(3,7,"hasil penjumlahan");
        pengurangan kurang = new pengurangan(90,80,"hasil pengurangan");
        pembagian bagi = new pembagian(10,5,"hasil pembagian");
        perkalian kali = new perkalian(5,7,"hasil perkalian");
        kuadrat kuadrat = new kuadrat(4,"hasil kuadrat");
        akar yaakar = new akar(9);
       
    }
    
   private static class penjumlahan{
   public penjumlahan(int a,int b,String keterangan){
   System.out.println(keterangan);
   
   int c;
         c = a+b;
         System.out.println(c);
   }
   }
    
   private static class pengurangan{
   public pengurangan(int a,int b,String keterangan){
   System.out.println(keterangan+a+" - "+b);
   System.out.println(a-b);
   }
   }
   
   private static class pembagian{
   public pembagian(int a,int b,String keterangan){
       System.out.println(keterangan+a+" / "+b);
   System.out.println(a/b);
   }
   }
   
   private static class perkalian{
   public perkalian(int a,int b,String keterangan){
       System.out.println(keterangan+a+" * "+b);
   System.out.println(a*b);
   }
   }
   
   private static class kuadrat{
   public kuadrat(int a,String keterangan){
   System.out.println(keterangan+a);
   System.out.println(a*a);
   }
   }
   
   private static class akar{
   public akar (int a){
   System.out.println("akar dari " +a+ " adalah:" + Math.sqrt(a));
   }
   }
}

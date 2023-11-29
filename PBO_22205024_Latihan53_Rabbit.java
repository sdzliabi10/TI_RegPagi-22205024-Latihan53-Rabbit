/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspert11_Latihan53_Rabbit;


/**
 *
 * @author Administrator
 * Nama : Sofiullah Abi Sadzili
 * Nim  : 22205024
 * Prodi: Teknik Informatika
 * Deskripsi : program ini berisi tentang desripsi rabbit
 */
public class PBO_22205024_Latihan53_Rabbit {
    public static void main(String[] args){
        Rabbit rabbit = new Rabbit("Peter", false, "grass", 4, "grey");
        System.out.println("Hello,His name is" + rabbit.getName());
        System.out.println(rabbit.getName() + "is Vegetarian?" + rabbit.isVegetaian());
        System.out.println(rabbit.getName() + "eats" + rabbit.getEats());
        System.out.println(rabbit.getName() + "has" + rabbit.getNo0Legs() + "legs.");
        System.out.println(rabbit.getName() + "is" + rabbit.getColor());
    }
}

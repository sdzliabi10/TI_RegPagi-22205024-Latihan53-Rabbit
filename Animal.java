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
public class Animal {
    protected boolean vegetarian;
    protected String eats;
    protected int no0fLegs;
    
    public Animal(boolean vegetarian, String food, int legs){
        this.vegetarian = vegetarian;
        this.eats = food;
        this.no0fLegs = legs;
    }
    public boolean isVegetaian(){
        return vegetarian;
    }
    public String getEats(){
        return eats;
    }
    public int getNo0Legs(){
        return no0fLegs;
    }
}

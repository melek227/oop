/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author melek
 */
public class Product { //tanımladığımız productu productmanager classı kullanacak
    
    //attributesleri
    private String _name;
    private String _description;
    private int _stokAdedi;
    private int _id;
    private double _prices;
    private int _stockAmount;
    private String _renk;
    
    
    //parametreli constructoru
   public Product(int id, String name, String description, double price, int stockAmount, String renk){
      _id=id;
      _name=name;
      _description=description;
      _stockAmount=stockAmount;
      _renk=renk;
       
       
   };
   
   //parametresiz constructoru
   public Product(){
       
   };
    
   //Overloading=>product classının parametreli ve parametresiz constructoru var.İstenilen kullanılabilir.
   
   //getter
    public int getId(){
          return _id;
    }
    
    //Setter
    public void setId(int Id){
        _id=Id;
    }
    
    

    
    
}

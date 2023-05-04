/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oop;


/**
 *
 * @author melek
 */
public class Oop {

    public static void main(String[] args) {
        
       CustomerManager customerManager=new CustomerManager(); //bellekte customermanager classı türünde bir nesne oluşturuldu
       customerManager.Add();
       
       //////////////////////////////////////////
       //name description vs için textbox oluşturduk
       //kullanıcı istediği ürün bilgilerini girdiğinde bu bilgileri classdaki attributeslerle eşitleriz
       Product product=new Product(1,"laptop", "Asus", 300,2, "Siyah");
     
       productManager productManager=new productManager();//ürünleri veri tabanına eklemek için bir nesne oluşturduk
       productManager.Add(product);
    
   
       
       
    }
    
    
    
    
}


    
    


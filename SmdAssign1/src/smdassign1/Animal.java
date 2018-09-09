/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smdassign1;

/**
 *
 * @author admin
 */
public abstract class Animal {
    public String name;

    
    Animal(String pname){
        name = pname;
    }
    
    public abstract void eat();
    public void printName(){
        System.out.println("Animal name: " + name);
    }
    
}

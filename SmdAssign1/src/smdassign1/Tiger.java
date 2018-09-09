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
public class Tiger extends Animal implements Run,Sleep{
    public int age;
    public static String type = "Carnivore";
    
    Tiger(String pname,int page){
        super(pname);
        age = page;
    }
    
    @Override
    public void run() throws IllegalAccessException{
        System.out.println( this.name + " tiger is running");
        throw new IllegalAccessException();
    }
    
    @Override
    public void sleep(){
        try{
            System.out.println(this.name + " tiger is asleep.");
            throw new NullPointerException();
        
        }
        catch(NullPointerException e2){
            System.out.println("Unchecked Exception: NullPointerException caught in sleep function.");
        }
    }
    
    @Override
    public void eat(){
        System.out.println("Tiger eats meat.");
    }
    
    public static void printType(){
        System.out.println("Static Method: Tiger is a Carnivore.");
    }
    
    public static class Bengal{
        final String stripes = "Black & Orange Stripes.";
        public final void showStripes(){
            System.out.println("Bengal tiger has " + stripes);
        }
    }
    
    public class Cub{
        boolean isCute;
        Cub(boolean pcute){
            isCute = pcute;
        }
        public void cuteness(){
            System.out.println("This tiger cub is ");
            if(!isCute)
                System.out.println("not ");
            System.out.println("cute.");
        }
    }
    
    
}

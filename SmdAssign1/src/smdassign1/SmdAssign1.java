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
public class SmdAssign1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Tiger t = new Tiger("sher",10);
            Tiger.Cub c = t.new Cub(true);
            Tiger.Bengal b = new Tiger.Bengal();
            
            t.printName();
            t.eat();
            Tiger.printType();
            b.showStripes();
            c.cuteness();
            t.sleep();
            t.run();
            
        }
        catch(IllegalAccessException e1){
            System.out.println("Checked Exception IllegalAccessException caught in main");
        }
        catch(Exception e){
            System.out.println("Caught other Exception in main.");
        }
        finally{
            System.out.println("Finally:This Code executes always");
        }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design;

import design.newpackage.OS;
import design.newpackage.Operation;
import java.util.*;


public class Design {

   
    public static void main(String[] args) {
        Operation ops=new Operation();
        System.out.println("enter the type of network: >.open/n>.close/n>.any");
        Scanner sc=new Scanner(System.in);
       String str= sc.nextLine();
        OS obj=ops.gfd(str);
        obj.spec();
        
    }
    
}

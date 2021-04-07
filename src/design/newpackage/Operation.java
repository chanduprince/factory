/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.newpackage;

/**
 *
 * @author miracle
 */
public class Operation {
    public OS gfd(String str)
    {
        if(str.equals("open"))
            return new Andriod();
        else if(str.equals("close"))
            return new IOS();
        else
            return new Windows();
        
    
    
}
}
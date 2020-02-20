/*
 * Kaia Mac
 * calculates the area of a scalene triangle
 * 18/02/2020
 */

package areaoftriangle.java;

import javax.swing.*;
/**
 *
 * @author kamac8665
 */
public class AreaOfTriangleJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    int sideA, sideB, sideC;
    String myInput;
    
    //Prompts user to enter three side lengths
    myInput = JOptionPane.showInputDialog("Please enter the length of side A:");
    sideA = Integer.parseInt(myInput);
    
    myInput = JOptionPane.showInputDialog("Please enter the length of side B:");
    sideB = Integer.parseInt(myInput);
        
    myInput = JOptionPane.showInputDialog("Please enter the length of side C:");
    sideC = Integer.parseInt(myInput);
    
    //Calculates area [a + b + Sin(C)] / 2.
    double area;
    
    area = Math.sin(sideC);
    area = area + sideA;
    area = area + sideB;
    area = area / 2;
    
    //Outputs area
    System.out.println("The area of the triangle is "+ area + "cm squared");
    }
    
}

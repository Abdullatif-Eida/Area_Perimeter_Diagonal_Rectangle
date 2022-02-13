/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectanglevalues;

import javax.swing.JOptionPane;


/**
 *
 * @author mhdab
 */

public class RectangleValues {

    
       public static String sayHellotoUser(String userName)
    {
       String getUserName;
       getUserName = "Wellcome to Rectangle calculator Mr/Ms"+ " " + userName + " " +
        "you can calculate Area and Perimeter and Diagonal" + "\n";
       return(getUserName);    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RectangleGUI  rectanglUserInterface= new RectangleGUI();
        rectanglUserInterface.show();
        /*
    double Length, Width;
    String userNameHere,userName;
      userName = JOptionPane.showInputDialog("Enter your name please=");
      Length= Double.parseDouble(JOptionPane.showInputDialog("Enter the Lenght="));
      Width=  Double.parseDouble(JOptionPane.showInputDialog("Enter the Width=")); 
      userNameHere=sayHellotoUser(userName);
      
      Rectangle firstRectangle=new Rectangle(Length,Width);  
      Rectangle secondRectangle=new Rectangle(20+Math.random()*30,20+Math.random()*30);
      Rectangle thirdRectangle=new Rectangle(20+Math.random()*30,20+Math.random()*30);
      System.out.println(userNameHere);
      System.out.println("Rectangle1: result according to your Input" + " " + "area="+firstRectangle.area()+ "   " +
        "perimeter="+firstRectangle.perimeter()+ "   " +"diagonal="+firstRectangle.diagonal());
      System.out.println(""+"Rectangle2: result according to automatic Input" + " " +"area="+secondRectangle.area()+ "   " +
        "perimeter="+secondRectangle.perimeter()+ "   " +"diagonal="+secondRectangle.diagonal());
      System.out.println(""+"Rectangle3: result according to automatic Input" + " " +"area="+thirdRectangle.area()+ "   " +
         "perimeter="+thirdRectangle.perimeter()+ "   " +"diagonal="+thirdRectangle.diagonal());
*/

    }
    
}

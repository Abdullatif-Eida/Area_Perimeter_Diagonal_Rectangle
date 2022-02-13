/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectanglevalues;

/**
 *
 * @author Abdullatif
 */
public class Rectangle 
{
    private double Length;
    private double Width;
    
    public Rectangle(double Length, double Width)
    {
       this.Length=Length;
       this.Width=Width;
    }

    public void setLength(double Length)
    {    
       this.Length=Length;
    }
    public void setWidth(double Width)
    {    
       this.Width=Width;
    }
     public double getLength()
    {
         return this.Length;
    }
     public double getWidth()
    {
         return this.Width;
    }
     public double area()
    {
         return this.Length*this.Width;
    }
     public double perimeter()
    {
         return 2*(this.Length+this.Width);
    }
       public double diagonal()
    {
        return (Math.sqrt(Math.pow(Length,2)+ Math.pow(Width,2)));

    }
}



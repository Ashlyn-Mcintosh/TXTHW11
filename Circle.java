/**
 * @Class Name: Circle
 * @Author: Ashlyn McIntosh
 * @Version: 2.0
 * @Date: 1 February 2023
 * Description: A program designed to find the area and perimeter of a circle given the radius
 *
 */




public class Circle {
    public static void main (String[]args ){
        double radius = 9.5; //Radius of a circle
        double area = radius * radius * Math.PI; //Area of a circle
        double perimeter = 2 * radius * Math.PI; //Perimeter of a circle

        System.out.println("The area is = "); //Print out the area
        System.out.println(area);
        System.out.println("The perimeter is = "); //Print out the perimeter
        System.out.println(perimeter);

    }
}

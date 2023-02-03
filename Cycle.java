/**
 * @Class Name: Cycle
 * @Author: Ashlyn McIntosh
 * @Version: 1.5
 * @Date: 31 January 2023
 * Description: A program designed to calculate the number of tricycles in the shop based on the amount
 * of wheels there are
 */




public class Cycle {
    public static void main(String []args ){
        int TotalWheels = 47;
        int BikeWheels = 20; // 10 bikes with 2 wheels each
        int WheelsLeft= (TotalWheels - BikeWheels); // Take out bike wheels
        int Tricycles = WheelsLeft / 3;

        System.out.println(Tricycles);





    }
}



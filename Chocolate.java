/**
 * @Class Name: Chocolate
 * @Author: Ashlyn McIntosh
 * @Version: 1.5
 * @Date: 26 January 2023
 * Description: A program designed to count the number of bags needed to get 3 chocolates
 * instead of two chocolates.
 */





public class Chocolate {
    public static void main(String []args ){
        int ChocolateBags = 9; //Amount of bags
        int Amt = 2; //Chocolates in bag
        int AmountNeeded = 3; //How many chocolates we can fit in 1 bag
        int TotalChocolates = ChocolateBags * Amt ;
        int BagsNeeded;


        BagsNeeded = TotalChocolates / AmountNeeded;

        System.out.println(BagsNeeded);


    }
}

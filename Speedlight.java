/**
 * @Class Name: SpeedLight
 * @Author: Ashlyn McIntosh
 * @Version: 1.1
 * @Date: 31 January 2023
 * Description: A program designed to calculate the speed of light
 * In this program, I will declare variables: speedOfSound, TimeElapsed, Distance
 */




public class SpeedLight {
    public static void main (String [] args) {
        int SPEED_OF_SOUND = 340; //value never changed. It's constant
        int timeElapsed = 5;
        int distance = SPEED_OF_SOUND * timeElapsed;
        System.out.println("SPEED_OF_SOUND: " + SPEED_OF_SOUND);
        System.out.println("Time Elapsed: " + timeElapsed);
        System.out.println("Distance: " + distance);
    };
    //edited

}


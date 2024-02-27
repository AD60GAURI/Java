/* Aim:- PracticalNo3
   Author:- Gauri Nandkishor Atalkar
   Version:- 3.0
   Date:- 13 feb 2024

*/


public class PracticalNo3 
{

    // Method to calculate the volume of a cube
    public double calculateVolume(double sideLength) {
        return sideLength * sideLength * sideLength;
    }

    // Method to calculate the volume of a cylinder
    public double calculateVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    // Method to calculate the volume of a box
    public double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    public static void main(String[] args) {
        VolumeCalculator calculator = new VolumeCalculator();

        // Example usage
        double cubeVolume = calculator.calculateVolume(4.0);
        double cylinderVolume = calculator.calculateVolume(2.0, 4.0);
        double boxVolume = calculator.calculateVolume(2.5, 4.0, 5.0);

        System.out.println("Volume of Cube: " + cubeVolume);
        System.out.println("Volume of Cylinder: " + cylinderVolume);
        System.out.println("Volume of Box: " + boxVolume);
    }
}
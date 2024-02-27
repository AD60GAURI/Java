/* Aim:- Practical4
   Author:- Gauri Nandkishor Atalkar
   Version:- 3.0
   Date:- 20 feb 2024

*/

public class Practical4 
{
    public static void printName(String name) 
    {
        // Trim leading and trailing spaces
        name = name.trim();
       
        // Split the name into first and last names
        String[] names = name.split("\\s+");
       
        // Extract first and last names
        String firstName = names[0];
        String lastName = names[names.length - 1];
       
        // Print the formatted name
        System.out.println(lastName + ", " + firstName);
    }
   
    public static void main(String[] args) 
    {
        // Example usage
        printName("Bill Joy");
    }
}
package org.fasttrackIT;

//         Exercitiu practic in clasa:
//        1. Create a maven project for practicing algorithms (using maven-archetype-quickstart)
//        2. Create a method in App to receive 3 numbers, display them and display their average.
//        3. Invoke that method from App.main() with 3 numbers of your choice
//        4. Share the project on GitHub.

public class App 
{
    public void displayAverage (double a, double b, double c){

        System.out.println("Calculating average of: " + a + " , " + b + " , " + c);

        double average = (a + b + c) / 3;
        System.out.println("Average: " + average);

    }

    public static void main( String[] args )
    {
        App app = new App();
        app.displayAverage(1,2.2, 9.9);


    }
}

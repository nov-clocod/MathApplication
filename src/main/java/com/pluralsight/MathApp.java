package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Question 1
        double bobSalary = 54000;
        double garySalary = 65000;
        double highestSalary;

        highestSalary = Math.max(garySalary, bobSalary);
        System.out.println("The highest salary is: " + highestSalary);

        //Question 2
        double carPrice = 34000;
        double truckPrice = 70000;
        double smallerPrice = Math.min(carPrice, truckPrice);

        System.out.println("The smaller price is: " + smallerPrice);

        //Question 3
        double circleRadius = 7.25;
        double radiusSquared = Math.pow(circleRadius, 2);
        double areaCircle = Math.PI * radiusSquared;

        System.out.println("The area of the circle is: " + areaCircle);

        //Question 4
        double testNumber = 5.0;
        double squareRoot = Math.sqrt(testNumber);

        System.out.println("The square root of that number is: " + squareRoot);

        // Question 5
        int x1 = 5, y1 = 10, x2 = 85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("The distance between the points is: " + distance);

        //Question 6

        double value = -3.8;
        double absValue = Math.abs(value);

        System.out.println("The absolute value is: " + absValue);

        //Question 7

        double randomNumber = Math.random();

        System.out.println("Random number: " + randomNumber);

        //Question 8

        long numberDays = 24L;
        long hourInMinutes = 60L;
        long hoursInDay = 24L;

        long minutesInDay = Math.multiplyExact(hoursInDay, hourInMinutes);
        long minutesInNumberDays = Math.multiplyExact(minutesInDay, numberDays);

        System.out.println("Minutes of the given number of day is: " + minutesInNumberDays);

        //Bonus

        long millisecondsInMinute = 60000;
        double millisecondsInNumberDays = Math.multiplyExact(minutesInNumberDays, millisecondsInMinute);

        System.out.println("Milliseconds of the given number of day is: " + millisecondsInNumberDays);
    }
}

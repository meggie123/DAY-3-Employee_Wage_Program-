package com.bridgelabz.javafundamentals;

public class EmployeeWageUsingSwitchCase {
    public static void main(String args[]) {

        final int PART_TIME = 1;
        final int FULL_TIME = 2;
        final int Wage_Per_Hr = 20;
        int empType = (int) (Math.random() * 100) % 3;
        int workingHours = 0;
        switch (empType) {
            case FULL_TIME:
                System.out.println("Employee is Present Full Time");
                workingHours = 8;
                break;

            case PART_TIME:
                System.out.println("Employee is Present Part Time");
                workingHours = 4;
                break;

            default:
                System.out.println("Employee is Absent");

        }
        int wage = workingHours * Wage_Per_Hr;
        System.out.println("Employee Daily Wage is " + wage);


    }
}


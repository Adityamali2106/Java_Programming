import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////////////////////
//
//      Class Name      : program77_3
//      Description     : It is used to suggests the cheapest plan among 4.
//      Input           : mins,gb,sms count
//      Output          : Recommended Plan, Total Cost.
//      Author          : Aditya Vijay Mali
//      Date            : 02/03/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////

class MobilePlan {
    String name;
    double baseFee;
    int limitMin, limitGb, limitSms;
    double extraMinRate, extraGbRate, extraSmsRate;

    public MobilePlan(String name, double baseFee, int limitMin, int limitGb, int limitSms, 
                      double extraMinRate, double extraGbRate, double extraSmsRate) {
        this.name = name;
        this.baseFee = baseFee;
        this.limitMin = limitMin;
        this.limitGb = limitGb;
        this.limitSms = limitSms;
        this.extraMinRate = extraMinRate;
        this.extraGbRate = extraGbRate;
        this.extraSmsRate = extraSmsRate;
    }

    public double calculateTotalCost(int mins, int gb, int sms) {
        double overMin = Math.max(0, mins - limitMin) * extraMinRate;
        double overGb = Math.max(0, gb - limitGb) * extraGbRate;
        double overSms = Math.max(0, sms - limitSms) * extraSmsRate;
        return baseFee + overMin + overGb + overSms;
    }
}

public class program77_3 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int userMins = 0;
        int userGb = 0;
        int userSms = 0;

        System.out.println("Enter mongthly required min count : ");
        userMins = sobj.nextInt();

        System.out.println("Enter mongthly required GB count : ");
        userGb = sobj.nextInt();

        System.out.println("Enter mongthly required Sms count : ");
        userSms = sobj.nextInt();

        List<MobilePlan> plans = new ArrayList<>();
        plans.add(new MobilePlan("Basic", 20.0, 100, 2, 50, 0.10, 5.0, 0.05));
        plans.add(new MobilePlan("Standerd", 35.0, 300, 15, 100, 0.08, 3.0, 0.03));
        plans.add(new MobilePlan("Unlimited", 45.0, 1000, 5, 500, 0.05, 4.0, 0.02));
        plans.add(new MobilePlan("True-Unlimited", 70.0, 5000, 100, 5000, 0.01, 1.0, 0.01));

        MobilePlan recommendedPlan = null;
        double minCost = Double.MAX_VALUE;

        for (MobilePlan plan : plans) {
            double currentCost = plan.calculateTotalCost(userMins, userGb, userSms);
            if (currentCost < minCost) {
                minCost = currentCost;
                recommendedPlan = plan;
            }
        }

        System.out.println("Recommended Plan: " + recommendedPlan.name);
        System.out.printf("Total Cost: $%.2f%n", minCost);
    }
}
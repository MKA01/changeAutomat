package change;

public class compute {
    private double amount;
    private int fiveHundred = 0, twoHundred = 0, oneHundred = 0, fifty = 0, twenty = 0, ten = 0;
    private int five = 0, two = 0, one = 0, fiftyPenny = 0, twentyPenny = 0, tenPenny = 0, fivePenny = 0, twoPenny = 0, onePenny = 0;


    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void change(){
        while(amount >= 500){
            amount = amount - 500;
            fiveHundred++;
        }
        while(amount >= 200){
            amount = amount - 200;
            twoHundred++;
        }
        while(amount >= 100){
            amount = amount - 100;
            oneHundred++;
        }
        while(amount >= 50){
            amount = amount - 50;
            fifty++;
        }
        while(amount >= 20){
            amount = amount - 20;
            twenty++;
        }
        while(amount >= 10){
            amount = amount - 10;
            ten++;
        }
        while(amount >= 5){
            amount = amount - 5;
            five++;
        }
        while(amount >= 2){
            amount = amount - 2;
            two++;
        }
        while(amount >= 1){
            amount = amount - 1;
            one++;
        }
        while(amount >= 0.5){
            amount = amount - 0.5;
            fiftyPenny++;
        }
        while(amount >= 0.2){
            amount = amount - 0.2;
            twentyPenny++;
        }
        while(amount >= 0.1){
            amount = amount - 0.1;
            tenPenny++;
        }
        while(amount >= 0.05){
            amount = amount - 0.05;
            fivePenny++;
        }
        while(amount >= 0.02){
            amount = amount - 0.02;
            twoPenny++;
        }
        while(amount >= 0.01){
            amount = amount - 0.01;
            onePenny++;
        }
    }

    public void result(){
        System.out.println("Amount left: " + amount);
        System.out.println("Five hundreds: " + fiveHundred);
        System.out.println("Two hundreds: " + twoHundred);
        System.out.println("One hundreds: " + oneHundred);
        System.out.println("Fifty: " + fifty);
        System.out.println("Twenty: " + twenty);
        System.out.println("Ten: " + ten);
        System.out.println("Five: " + five);
        System.out.println("Two: " + two);
        System.out.println("One: " + one);
        System.out.println("Fifty Penny: " + fiftyPenny);
        System.out.println("Twenty Penny: " + twentyPenny);
        System.out.println("Ten Penny: " + tenPenny);
        System.out.println("Five Penny: " + fivePenny);
        System.out.println("Two Penny: " + twoPenny);
        System.out.println("One Penny: " + onePenny);
    }

}

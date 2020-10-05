package com.artem;

public class Main {

    public static void main(String[] args) {

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());

//        BankAccount dariaAccount = new BankAccount(12345, 900, "Daria Booty",
//                "sweetbooty69@sex.com", "+79001234567");
//


//        dariaAccount.accountWithdraw(100);
//
//        dariaAccount.setAccountNumber(12345);
//        dariaAccount.setUserName("Daria Booty");
//        dariaAccount.setUserEMail("sweetbooty69@gmail.com");
//        dariaAccount.setUserPhone("+79001234567");
//        dariaAccount.accountDeposit(1000100);
//        dariaAccount.accountWithdraw(100);











//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());


//        Car porsche = new Car();
//        Car holden = new Car();
//        porsche.setModel("911");
//        System.out.println(porsche.getModel());
    }
}

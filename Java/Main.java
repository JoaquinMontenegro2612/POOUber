class Main{
    public static void main(String[] args) {
        // System.out.println("May te amo");
        Car car = new Car();
        car.license = "SQQ737";
        car.driver = "Morocho Sensualote";
        car.passenger = 4;
        // System.out.println("Matricula de la Nave es: " + car.license);
        car.printDatacar();
        
        Car car2 = new Car();
        car2.license = "Benji 8422";
        car2.driver = "Benja Feroz";
        car2.passenger = 3;
        car2.printDatacar();
        
    }
}
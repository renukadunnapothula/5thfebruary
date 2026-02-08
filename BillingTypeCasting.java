final class BillingSystem {

    public static void main(String[] args) {
        
        double receivedAmount = 123.75;

        System.out.println("Received amount (double): " + receivedAmount);

        
        int storedAmount = (int) receivedAmount; 
        System.out.println("Stored amount (int): " + storedAmount);

        
        double precisionLoss = receivedAmount - storedAmount;
        System.out.println("Precision lost: " + precisionLoss);

        
        double newAmount = storedAmount; 
        System.out.println("Implicitly casted int to double: " + newAmount);
    }
}

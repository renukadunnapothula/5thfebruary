class ApiRetryMechanism {

    public static void main(String[] args) {

        int maxRetries = 3;
        int attempt = 1;
        boolean success = false;

        while (attempt <= maxRetries) {

            System.out.println("Attempt " + attempt + ": Calling API...");

            
            if (attempt == 2) { 
                success = true;
                System.out.println("✅ API Call Successful!");
                break; 
            } else {
                System.out.println("❌ API Call Failed. Retrying...");
            }

            attempt++;
        }

        if (!success) {
            System.out.println("🚫 API failed after " + maxRetries + " attempts.");
        }
    }
}

final class ConfigLoader {
    public static void main(String[] args) {

        
        int maxUsers = 150;                  
        double threshold = 100.0;            
        boolean featureFlag = true;          
        String environment = "Production";   

        
        System.out.println("Configuration Details:");
        System.out.println("----------------------");
        System.out.println("Max Users: " + maxUsers);
        System.out.println("Threshold: " + threshold);
        System.out.println("Feature Enabled: " + featureFlag);
        System.out.println("Environment: " + environment);
        System.out.println("----------------------");

        
        if (maxUsers > 100) {
            System.out.println("WARNING: Max users exceed recommended limit!");
        }

        if (threshold > 75.0) {
            System.out.println("WARNING: Threshold exceeds safe limit!");
        }

        if (!featureFlag) {
            System.out.println("INFO: Feature is disabled in this environment.");
        }

        System.out.println("Configuration validation complete.");
    }
}

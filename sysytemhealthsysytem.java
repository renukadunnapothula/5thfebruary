class SystemHealthCheck {

    public static void main(String[] args) {

        // CPU values
        double cpuUsed = 65;
        double cpuTotal = 100;

        // Memory values (in GB)
        double memoryUsed = 12;
        double memoryTotal = 16;

        // Calculate percentages using arithmetic operators
        double cpuUsage = (cpuUsed / cpuTotal) * 100;
        double memoryUsage = (memoryUsed / memoryTotal) * 100;

        // Display usage
        System.out.println("CPU Usage: " + cpuUsage + "%");
        System.out.println("Memory Usage: " + memoryUsage + "%");

        // Ternary operator for health status
        String systemStatus =
                (cpuUsage >= 80 || memoryUsage >= 80)
                        ? "CRITICAL"
                        : "HEALTHY";

        System.out.println("System Status: " + systemStatus);
    }
}

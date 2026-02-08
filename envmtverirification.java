final class EnvironmentCheck {
    public static void main(String[] args) {
        
        String javaVersion = System.getProperty("java.version");
        System.out.println("Java Version: " + javaVersion);

        
        String jvmVendor = System.getProperty("java.vendor");
        System.out.println("JVM Vendor: " + jvmVendor);

        
        String osName = System.getProperty("os.name");
        System.out.println("Operating System: " + osName);

        
        String osArch = System.getProperty("os.arch");
        System.out.println("OS Architecture: " + osArch);
    }
}
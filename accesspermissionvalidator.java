class AccessPermissionValidator {

    public static void main(String[] args) {

        int age = 20;
        boolean hasValidId = true;
        boolean hasActiveSubscription = false;

        if (age >= 18 && hasValidId && hasActiveSubscription) {
            System.out.println("✅ Access Granted");
        } else {
            System.out.println("❌ Access Denied");
        }
    }
}

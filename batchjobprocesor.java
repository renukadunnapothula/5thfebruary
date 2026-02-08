class BatchJobProcessor {

    public static void main(String[] args) {

        for (int record = 1; record <= 10; record++) {

            // Simulate invalid record
            if (record == 3 || record == 7) {
                System.out.println("⚠️ Record " + record + " is invalid. Skipping...");
                continue; // skip this record
            }

            // Simulate critical error
            if (record == 9) {
                System.out.println("❌ Critical error at record " + record);
                System.out.println("🚫 Stopping batch job...");
                break; // stop entire job
            }

            // Process valid record
            System.out.println("✅ Processing record " + record);
        }

        System.out.p

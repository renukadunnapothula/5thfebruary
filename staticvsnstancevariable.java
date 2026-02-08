class UserLogin {

    
    static int totalLogins = 0;

    
    int sessionId;

    
    UserLogin(int sessionId) {
        this.sessionId = sessionId;
        totalLogins++; // increase login count
    }

    void displayLoginInfo() {
        System.out.println("Session ID: " + sessionId);
        System.out.println("Total Logins so far: " + totalLogins);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {

        UserLogin user1 = new UserLogin(101);
        user1.displayLoginInfo();

        UserLogin user2 = new UserLogin(102);
        user2.displayLoginInfo();

        UserLogin user3 = new UserLogin(103);
        user3.displayLoginInfo();
    }
}

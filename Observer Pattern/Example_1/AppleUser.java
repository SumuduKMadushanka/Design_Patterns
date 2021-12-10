public class AppleUser implements PhoneUser {
    private String latestPhoneName;

    @Override
    public void update(String latestPhoneName) {
        this.latestPhoneName = latestPhoneName;

        // For demo purpose only
        System.out.println("Latest Apple Phone: " + latestPhoneName);
        
    }

    // Getters
    public String getLatestPhoneName() {
        return this.latestPhoneName;
    }
    
}

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneShop {
    private HashMap<String, ArrayList<Phone>> phones;
    private HashMap<String, ArrayList<PhoneUser>> phoneUserMap;

    public PhoneShop() {
        this.phones = new HashMap<>();
        this.phoneUserMap = new HashMap<>();
    }

    public void addPhoneUser(String brandName, PhoneUser phoneUser) {
        if (!this.phoneUserMap.containsKey(brandName)) {
            this.phoneUserMap.put(brandName, new ArrayList<>());
        }

        this.phoneUserMap.get(brandName).add(phoneUser);

        // For demo purpose only
        System.out.println("Added new " + brandName + " user");

    }

    public void removePhoneUser(String brandName, PhoneUser phoneUser) {
        this.phoneUserMap.get(brandName).remove(phoneUser);
    }

    public void addPhone(Phone phone) {
        if (!this.phones.containsKey(phone.getBrandName())) {
            this.phones.put(phone.getBrandName(), new ArrayList<>());
        }

        this.phones.get(phone.getBrandName()).add(phone);

        // For demo purpose only
        phone.printDetails();

        this.notifyUsers(phone.getBrandName(), phone.getPhoneName());
    }

    public void notifyUsers(String brandName, String latestPhoneName) {
        for (PhoneUser phoneUser : this.phoneUserMap.get(brandName)) {
            phoneUser.update(latestPhoneName);
        }
    }
    
}

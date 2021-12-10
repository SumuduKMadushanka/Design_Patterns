public class ObserverPatternDemo {
    
    public static void main(String[] args) {
        System.out.println("-------- Observer Pattern Demo --------");

        PhoneShop phoneShop = new PhoneShop();

        AppleUser appleUser_1 = new AppleUser();
        AppleUser appleUser_2 = new AppleUser();
        AppleUser appleUser_3 = new AppleUser();

        SamsungUser samsungUser_1 = new SamsungUser();
        SamsungUser samsungUser_2 = new SamsungUser();
        SamsungUser samsungUser_3 = new SamsungUser();

        HuaweiUser huaweiUser_1 = new HuaweiUser();
        HuaweiUser huaweiUser_2 = new HuaweiUser();
        HuaweiUser huaweiUser_3 = new HuaweiUser();

        phoneShop.addPhoneUser("apple", appleUser_1);
        phoneShop.addPhoneUser("apple", appleUser_2);
        phoneShop.addPhoneUser("apple", appleUser_3);

        phoneShop.addPhoneUser("samsung", samsungUser_1);
        phoneShop.addPhoneUser("samsung", samsungUser_2);
        phoneShop.addPhoneUser("samsung", samsungUser_3);

        phoneShop.addPhoneUser("huawei", huaweiUser_1);
        phoneShop.addPhoneUser("huawei", huaweiUser_2);
        phoneShop.addPhoneUser("huawei", huaweiUser_3);

        phoneShop.addPhone(new Phone("Samsung Galaxy A12 (4GB+128GB) (Black)", "samsung", 38999));
        phoneShop.addPhone(new Phone("Samsung Galaxy Z Fold 3 5G (12GB+256GB) (Black)", "samsung", 399990));
        phoneShop.addPhone(new Phone("Apple iPhone 12 (64GB) (Black)", "apple", 228999));
        phoneShop.addPhone(new Phone("Huawei Y7A 4G (4GB+128GB) (Blush Gold)", "huawei", 43999));
        phoneShop.addPhone(new Phone("Apple iPhone 13 Pro Max - 256GB (Sierra Blue)", "apple", 414400));
        phoneShop.addPhone(new Phone("Huawei Nova 7i - (8GB+128GB) (Gray)", "huawei", 52999));
    }
}
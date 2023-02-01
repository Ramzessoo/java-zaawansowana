package solid.srp.lived;

public class DrivingLicenseRules {

    public static boolean canHaveDrivingLicense(Human human) {
        return human.getAge() >= 18;
    }
}

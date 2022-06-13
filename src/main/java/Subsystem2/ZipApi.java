package Subsystem2;

public class ZipApi {
    private static ZipApi instance = new ZipApi();

    private ZipApi() {
        super();
    }

    public static ZipApi getInstance() {
        return instance;
    }

    public String cityRecover(String zipCode) {
        return "New York city";
    }

    public String stateRecover(String zipCode) {
        return "NY";
    }
}

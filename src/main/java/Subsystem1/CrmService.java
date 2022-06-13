package Subsystem1;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void clientRecord(String name, String zipCode, String city, String state) {
        System.out.println("Client saved in the CRM:");
        System.out.println(name);
        System.out.println(zipCode);
        System.out.println(city);
        System.out.println(state);
    }
}

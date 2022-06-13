package Facade;

import Subsystem1.CrmService;
import Subsystem2.ZipApi;

public class Facade {
    public void ClientMigrate(String name, String zipCode) {
        String city = ZipApi.getInstance().cityRecover(zipCode);
        String state = ZipApi.getInstance().stateRecover(zipCode);

        CrmService.clientRecord(name, zipCode, city, state);
    }
}

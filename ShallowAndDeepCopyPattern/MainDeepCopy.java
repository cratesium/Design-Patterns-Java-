package ShallowAndDeepCopyPattern;

import java.util.HashMap;
import java.util.Map;

public class MainDeepCopy {



    public static void main(String[] args) {

        ServersDeepCopy server1 = new ServersDeepCopy();

        System.out.println("Initializing Server 1 properties");

        server1.setDnsBook(new HashMap<>(Map.of(
                "10.10.10.10", "www.google.com",
                "10.10.10.11", "www.createsium.com",
                "10.10.10.12", "www.createsium@dev.com",
                "10.10.10.13", "www.createsium@code.com"
        )));

        server1.setKnownhosts(new HashMap<>(Map.of(
                "10.10.10.10", "privatekey1",
                "10.10.10.11", "privatekey2",
                "10.10.10.12", "privatekey3",
                "10.10.10.13", "privatekey4"
        )));

        server1.setServername("Instance ap - southeast georgia");

        System.out.println("End Server 1 properties");
        System.out.println("Server1: " + server1);

        ServersDeepCopy server2 = null;

        try {
            System.out.println("\nInitializing Server 2 using CLONE");
            server2 = (ServersDeepCopy) server1.clone();
            System.out.println("Server2: " + server2);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // Modify original
        System.out.println("Modifying Server1 data...");
        server1.setServername("Shikhar's instance 1");
        server1.getDnsBook().put("10.10.10.99", "hacked.com");

        System.out.println("After Modification:");
        System.out.println("Server1: " + server1);
        System.out.println("Server2: " + server2);
    }

}

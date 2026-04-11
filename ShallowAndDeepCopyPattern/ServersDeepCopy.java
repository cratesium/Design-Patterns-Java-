package ShallowAndDeepCopyPattern;

import java.util.HashMap;
import java.util.Map;

public class ServersDeepCopy {



    Map<String,String> dnsBook;
    Map<String,String> knownhosts;
    String servername ;

    public Map<String, String> getDnsBook() {
        return dnsBook;
    }

    public void setDnsBook(Map<String, String> dnsBook) {
        this.dnsBook = dnsBook;
    }

    public Map<String, String> getKnownhosts() {
        return knownhosts;
    }

    public void setKnownhosts(Map<String, String> knownhosts) {
        this.knownhosts = knownhosts;
    }

    public String getServername() {
        return servername;
    }

    public void setServername(String servername) {
        this.servername = servername;
    }

    @Override
    public String toString() {
        return this.knownhosts+" ;"+this.dnsBook +";"+this.servername;
    }



    @Override
    public Object clone() {

        ServersDeepCopy copy = new ServersDeepCopy();
        copy.servername = this.servername;
        copy.dnsBook = new HashMap<>(this.dnsBook);
        copy.knownhosts = new HashMap<>(this.knownhosts);

        return copy;
    }



}

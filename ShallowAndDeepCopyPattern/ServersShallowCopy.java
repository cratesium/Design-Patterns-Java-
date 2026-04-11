package ShallowAndDeepCopyPattern;

import java.util.Map;

public class ServersShallowCopy implements  Cloneable{
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
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}

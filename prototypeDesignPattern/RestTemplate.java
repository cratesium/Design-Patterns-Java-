package prototypeDesignPattern;

import java.util.Map;

public class RestTemplate implements  Cloneable {

    String url;
    Map<String,String> headers;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    String body ;
    Map<String,String> params;
    String method;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String exchangeRequest()  {

        System.out.println(this.toString());

        System.out.println("Started the Exchanging the Request");
        //Mocking heavy Opertion while creating the new Object
        try {
         Thread.sleep(5000);
        }catch (Exception e ){
         e.printStackTrace();
        }
        finally {
            System.out.println("connection successful");
            return "Successful/Failure";
        }

    }


}

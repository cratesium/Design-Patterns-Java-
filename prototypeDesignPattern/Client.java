package prototypeDesignPattern;


import java.util.HashMap;
import java.util.Map;

public class Client {

    static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setUrl("https://www.cratesium.com/users/v1/admin/files");
        restTemplate.setHeaders(Map.of("jwt", "eydkecowgerwvw.dqewfcwevwcv2e.wevwvrvwvvbrw"));
        restTemplate.setParams(Map.of("pagesize", "1"));
        restTemplate.setBody("{}");
        restTemplate.setMethod("GET");
        restTemplate.exchangeRequest();

        System.out.println(restTemplate.getBody());



        try{
           RestTemplate restTemplate1 =(RestTemplate) restTemplate.clone();
            System.out.println(restTemplate1.body);

        }catch (Exception e ){
            e.printStackTrace();
        }

    }
}

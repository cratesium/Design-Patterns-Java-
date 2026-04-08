package BuilderDesignPattern;

public class Client {


    static void main(String[] args) {
        System.out.println("initiating the Builder Design Pattern");
        User user1 = new User.UserBuilder()
                .setId("1")
                .setMail("cratesium@dev.com")
                .setProfileId("1-DASH")
                .setName("cratesium")
                .setAddress("India")
                .build();


        System.out.println(user1.toString());




        User user2 = new User.UserBuilder()
                .setId("2")
                .setMail("cratesium@gmail.com")
                .setProfileId("1-DASH-Dash")
                .setName("cratesium-dev") //without Address
                .build();


        System.out.println(user2.toString());


    }
}

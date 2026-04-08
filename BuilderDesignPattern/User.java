package BuilderDesignPattern;

public class User {

    private String name ;
    private  String id ;
    private  String address;
    private  String mail;
    private  String profileId;

    private User(UserBuilder userBuilder){
        this.name=userBuilder.name;
        this.id=userBuilder.id;
        this.address=userBuilder.address;
        this.mail=userBuilder.mail;
        this.profileId=userBuilder.profileId;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", mail='" + mail + '\'' +
                ", profileId='" + profileId + '\'' +
                '}';
    }


    static class UserBuilder {

        private String name ;
        private  String id ;
        private  String address;
        private  String mail;
        private  String profileId;

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder setMail(String mail) {
            this.mail = mail;
            return this;
        }

        public UserBuilder setProfileId(String profileId) {
            this.profileId = profileId;
            return this;
        }

        public  User build(){
          return  new User(this);

        }

    }



}

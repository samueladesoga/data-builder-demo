public class DemoFormDataBuilder {
    String firstName;
    String lastName;
    String address;

    //this can also be done with a build method and a private constructor
    public DemoFormDataBuilder(){
        this.firstName = "Sam";
        this.lastName = "Adams";
        this.address = "33, London Road, Luton";
    }

    public DemoFormDataBuilder withFirstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public DemoFormDataBuilder withLastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public DemoFormDataBuilder withAddress(String address){
        this.address = address;
        return this;
    }
}

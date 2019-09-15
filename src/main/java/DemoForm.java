public class DemoForm {
    DemoFormDataBuilder formData;
    public DemoForm(){
        this.formData = new DemoFormDataBuilder();
    }

    public DemoForm(DemoFormDataBuilder formData){
        this.formData = formData;
    }

    public void fillForm(){
        System.out.println("Filling for with First Name: " + formData.firstName);
        System.out.println("Filling for with Last Name: " + formData.lastName);
        System.out.println("Filling for with Address: " + formData.address);
    }
}

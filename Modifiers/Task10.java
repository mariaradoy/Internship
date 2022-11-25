//Add to class Person protected properties:
//
//    home address
//    mobile phone number
//
//Add to class Person private properties:
//
//    identity card number
//
//Create a scenario for setting and getting values for all new added properties.

class Person{
    protected String homeAddress;
    protected String mobilePhoneNumber;
    private String identityCardNumber;

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }
    public void setIdentityCardNumber(String identityCardNumber){
        this.identityCardNumber = identityCardNumber;
    }

    public String getMobilePhoneNumber(){
        return mobilePhoneNumber;
    }

    public String getHomeAddress(){
        return homeAddress;
    }
    public String getIdentityCardNumber(){
        return  identityCardNumber;
    }
}

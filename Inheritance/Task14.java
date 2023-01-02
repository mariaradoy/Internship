// Beauty salon
// You are asked to write a discount system for a beauty salon, which provides services and sells beauty products. 
// It offers 3 types of memberships: Premium, Gold and Silver. Premium, gold and silver members receive a discount of 20%, 15%, and 10%, respectively, 
// for all services provided. Customers without membership receive no discount. All members receive a flat 10% discount on products purchased (this might change in future). 
// Your system shall consist of three classes: Customer, Discount and Visit, as shown in the class diagram. 
// It shall compute the total bill if a customer purchases $x of products and $y of services, for a visit. Also write a test program to exercise all the classes.
// The class DiscountRate contains only static variables and methods (underlined in the class diagram).

import java.time.LocalDate;

class  Customer{
    String name;
    boolean member;
    String memberType;

    Customer(String name){
        this.name = name;
    }

    Customer() {
    }

    public String getName() {
        return name;
    }
    public boolean isMember(){
        return member;
    }
    public void setMember(boolean member){
        this.member = member;
    }

    public String getMemberType() {

        return memberType;
    }

    public void setMemberType(String type) {

        this.memberType = type;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", member=" + member +
                ", memberType='" + memberType + '\'' +
                '}';
    }
}

class Visit extends Customer{
    Customer customer;
    LocalDate date;
    double serviceExpense;
    double productExpense;

    Visit(String name, LocalDate date){
        this.name = name;
        this.date = date;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense(){
        double totalExpense = productExpense + serviceExpense;
        return  totalExpense;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}';
    }
}

class DiscountRate{
    static double serviceDiscountPremium = 0.2;
    static double serviceDiscountGold = 0.15;
    static double serviceDiscountSilver = 0.1;
    static double productDiscountPremium = 0.1;
    static double productDiscountGold = 0.1;
    static double productDiscountSilver = 0.1;

    public double getServiceDiscountRate(String type){
        if(type == "Premium"){
            return  serviceDiscountPremium;
        } else if (type == "Gold") {
            return serviceDiscountGold;
        }
        else return serviceDiscountSilver;
    }

    public double getProductDiscountRate(String type){
        if(type == "Premium"){
            return  productDiscountPremium;
        } else if (type == "Gold") {
            return productDiscountGold;
        }
        else return productDiscountSilver;
    }
}

public class polymorphism {

    public static void main(String[] args) {
        Customer gold = new Customer("Goldy");
        gold.setMember(true);
        gold.setMemberType("Gold");

        Visit visit = new Visit("Goldy", LocalDate.now());
        DiscountRate discount = new DiscountRate();

        visit.setProductExpense(256.32);
        visit.setServiceExpense(300);

        double productDiscountRate = discount.getProductDiscountRate(gold.memberType);
        visit.productExpense -= visit.productExpense * productDiscountRate;

        double serviceDiscountRate = discount.getServiceDiscountRate(gold.memberType);
        visit.serviceExpense -= visit.serviceExpense * serviceDiscountRate;

        System.out.println(visit.getProductExpense() + " " + visit.getServiceExpense());

        System.out.println(visit.getTotalExpense());
    }
}

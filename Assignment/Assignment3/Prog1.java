package Assignment3;

public class Prog1 {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Phillip","Wangchuk","SN101");
        Customer customer2 = new Customer("Phurpa","Dawa","SN102");
        Customer customer3 = new Customer("Aung","Lucus","SN103");

        Customer[] customers = {customer1,customer2,customer3};

        Address billingAdd1 = new Address("Argiro", "Chicago", "Iowa", "52557");
        Address billingAdd2 = new Address("Kurintar", "Chitwan", "Kathmandu", "52550");
        Address billingAdd3 = new Address("Juhu", "Chicago", "Maharashtra", "25001");

        Address shippingAdd1 = new Address("Hetuda", "Valley", "Texas", "12211");
        Address shippingAdd2 = new Address("Kurintar", "Chicago", "Kathmandu", "23234");
        Address shippingAdd3 = new Address("Juhu", "Chicago", "Maharashtra", "54231");

        customer1.setBillingAddress(billingAdd1);
        customer1.setShippingAddress(shippingAdd1);

        customer2.setBillingAddress(billingAdd2);
        customer2.setShippingAddress(shippingAdd2);

        customer3.setBillingAddress(billingAdd3);
        customer3.setShippingAddress(shippingAdd3);

        for(Customer c: customers){
            if(c.getBillingAddress().getCity().equals("Chicago")){
                System.out.println(c.toString());
            }
        }
    }


}

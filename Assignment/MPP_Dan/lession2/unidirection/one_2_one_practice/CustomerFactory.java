package MPP_Dan.lession2.unidirection.one_2_one_practice;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-07-03
 */
public class CustomerFactory {

    public static Customer addCustomer( String name, Integer account){
        if((account == null) || (name == null))
            throw  new IllegalArgumentException("Missing argument...");
        return new Customer(name, account);
    }
}

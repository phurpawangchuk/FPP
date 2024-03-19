package A67.Lab.Exception;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-16-03
 * User custom defined exception with 3 constructor
 */
public class UserException extends Exception {
    public UserException(){
        super();
    }

    public UserException(Throwable t){
        super(t);
    }

    public UserException(String message){

        super(message);
    }
}

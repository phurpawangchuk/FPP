package A67.Lab.Exception;

import java.util.logging.Logger;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-16-03
 */
public class TestLogger {
    private static final Logger LOG = Logger.getLogger(TestLogger.class.getPackage().toString());
    static public void test(int x, int y) throws UserException{
        try {
            throw  new UserException("Hi");
            //return;
        }catch (Exception e){
            LOG.warning("Messahe heere");
            throw  new UserException("Wow");
        }finally {
            System.out.println("Finally");
        }
    }


        public static void main(String[] args) throws UserException {
       //test(3,4);


    }
}

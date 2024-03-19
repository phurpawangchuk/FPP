package A67.Lab.Enum;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-09-03
 */
public enum Operations {
    ADD {
        public int eval( int x, int y ){ return x+y;}
    },
    SUB {
        public int eval( int x, int y ){ return x-y;}
    },
    MUL {
        public int eval( int x, int y ){ return x*y;}
    };

    abstract int eval(int a, int b);
}

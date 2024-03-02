package Lab;
class Test1 extends MySuperClass {
    public static void main(String[] args) {
        MySuperClass cl = new Test1();
        System.out.println(cl.getType());
    }
    public int getType() {
        return 3;
    }

}

class MySuperClass {
    public int getType() {
        return 2;
    }

    public int getType2() {
        return 21;
    }
}

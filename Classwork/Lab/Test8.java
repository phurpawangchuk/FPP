package Lab;

//Stackoverflow
    class Test8 {
        Test8()
        {
            TheSubclass sub = new TheSubclass();
            System.out.println("The Class constructor");
        }

        public static void main(String[] args){
            new TheSubclass();
        }
    }

    class TheSubclass extends Test8 {
        TheSubclass()
        {
            System.out.println("The Subclass constructor");
        }
    }


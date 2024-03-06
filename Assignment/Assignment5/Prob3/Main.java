package Assignment5.Prob3;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-02-03
 */
public class Main {
    public static void main(String[] args) {
        Figure[] figures ={ new UpwardHat(), new DownwardHat(),  new FaceMaker(), new Vertical()};

        for(Figure figure: figures){
            figure.getFigure();
        }
        System.out.println("\n");

        for(Figure figure: figures){
            System.out.print(figure.getClass().getSimpleName()+":  ");
            figure.getFigure();
            System.out.println("");
        }
    }
}

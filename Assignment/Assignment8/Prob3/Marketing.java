package Assignment8.Prob3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-12-03
 */
public class Marketing {
    private String employeeName;
    private String productName;
    private double salesAmount;

    public Marketing(String employeeName, String productName, double salesAmount) {
        this.employeeName = employeeName;
        this.productName = productName;
        this.salesAmount = salesAmount;
    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        List<Marketing> list1 = new ArrayList<>();
        for(Marketing m: list){
            if(m.salesAmount > 1000){
                list1.add(m);
            }
        }
        return list1;
    }

    @Override
    public String toString() {
        return "Marketing{" +
                "employeeName='" + employeeName + '\'' +
                ", productName='" + productName + '\'' +
                ", salesAmount=" + salesAmount +
                '}';
    }

    public static void main(String[] args) {
        List<Marketing> list = new ArrayList<>();
        list.add(new Marketing("Alice", "Shoe", 500));
        list.add(new Marketing("Bob", "Pen", 2500));
        list.add(new Marketing("Cathy", "Pencil", 3500));

        List<Marketing> list1 = listMoreThan1000(list);

        System.out.println(list1);

    }
}

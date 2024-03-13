package Assignment8.Prob3;

import java.util.*;

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

    public double getSalesAmount() {
        return salesAmount;
    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        List<Marketing> listMore = new ArrayList<>();

        for(Marketing m: list){
            if(m.getSalesAmount() > 1000){
                listMore.add(m);
            }
        }
        return listMore;
    }


    @Override
    public String toString() {
        return "Marketing{" +
                "employeeName='" + employeeName + '\'' +
                ", productName='" + productName + '\'' +
                ", salesAmount=" + salesAmount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Marketing marketing = (Marketing) o;
        return Double.compare(marketing.salesAmount, salesAmount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(salesAmount);
    }

    public static void main(String[] args) {
        List<Marketing> list = new ArrayList<>();
        list.add(new Marketing("Wang", "Shoe", 500));
        list.add(new Marketing("Bob", "Pen", 3500));
        list.add(new Marketing("Cathy", "Pencil", 1000));
        list.add(new Marketing("Tony", "Chair", 2500));

         list.sort(new Comparator<Marketing>() {
            @Override
            public int compare(Marketing o1, Marketing o2) {
                return Double.compare(o1.getSalesAmount(), o2.getSalesAmount());
            }
        });
        System.out.println("Sorted List:");
        System.out.println(list);

        System.out.println("Sale Amount more than 1000 :");
        List<Marketing> listOfMore = listMoreThan1000(list);

        System.out.println(listOfMore);

    }

}

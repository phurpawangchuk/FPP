package A67.Lab.Lesson8;

import java.util.Arrays;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-11-03
 */
public class MyStringList {
    private final int MAX_NUm = 4;
    private int totalElements;
    private String[] currentArray;

    MyStringList(){
        currentArray = new String[MAX_NUm];
        totalElements = 0;
    }

    public void add(String s){
        if(s==null) return;
        if(currentArray.length == totalElements)
            resizeArray();
        currentArray[totalElements++] = s;
    }

    public void insert(String s, int pos){
        if(s == null) return;
        if(pos < 0 || pos > totalElements) return;
        if(totalElements == currentArray.length)
            resizeArray();

        String[] temp = new String[currentArray.length];
        //copy left to pos
        System.arraycopy(currentArray,0, temp, 0, pos);
        temp[pos] = s;
        //copy after pos
        System.arraycopy(currentArray,pos, temp, pos+1, currentArray.length - (pos+1));

        currentArray = temp;
        totalElements++;
    }

    public void reverseList(){
    String[] temp = new String[totalElements];
    int start = 0;
    String t = null;
    int end = totalElements-1;
    while(start < end){
         t = currentArray[start];
        currentArray[start] = currentArray[end];
        currentArray[end] = t;
        start++;
        end--;

    }

        for(int i=0; i< totalElements; i++) {
            System.out.print(currentArray[i]+" ");
        }
    }

    private void resizeArray() {
        int len = currentArray.length;
        String[] temp = new String[2*len];

        System.arraycopy(currentArray, 0, temp,0, len);
        currentArray = temp;
    }

    public boolean remove(String s){
       if(s ==  null) return false;
       if(isEmpty()) return false;

       int index = -1;

       for(int i=0; i< totalElements; i++){
           if(currentArray[i].equals(s)){
               index = i;
               break;
           }
       }

       if(index == -1) return false;

       String[] temp = new String[currentArray.length];
       System.arraycopy(currentArray, 0, temp, 0, index);
       System.arraycopy(currentArray, index+1, temp, index,currentArray.length - (index+1));
       totalElements--;
       currentArray = temp;
       return true;
    }


    boolean isEmpty(){
        return totalElements==0;
    }

    public String get(int i){
        if( i < 0 || i>totalElements) return null;
        return currentArray[i];
    }

    public boolean find(String s){
        if( s ==null ) return false;
        for(int i=0; i< totalElements; i++){
            if(currentArray[i].equals(s)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb =  new StringBuilder("[");
        for(int i=0; i < totalElements; i++){
            sb.append(currentArray[i]);
            if(i < totalElements-1)
                sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }

}

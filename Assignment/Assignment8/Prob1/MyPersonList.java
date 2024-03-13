package Assignment8.Prob1;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-12-03
 */
public class MyPersonList {
    Person[] persons;
    int MAX_SIZE = 3;
    int size;

    MyPersonList(){
        persons = new Person[MAX_SIZE];
    }

    public void add(Person p){
        if(p==null) return;
        if(persons.length == size)
            resizeArray();
        persons[size++] = p;
    }


    public void insertAtPos(Person p, int pos){
        if(p == null) return;
        if(pos < 0 || pos > size) return;
        if(size == persons.length)
            resizeArray();

        Person[] temp = new Person[persons.length];
        //copy left to pos
        System.arraycopy(persons,0, temp, 0, pos);
        temp[pos] = p;
        //copy after pos
        System.arraycopy(persons,pos, temp, pos+1, persons.length - (pos+1));

        persons = temp;
        size++;
    }


    public boolean remove(Person p){
        if(p ==  null) return false;

        if(isEmpty()) return false;

        int index = -1;

        for(int i=0; i< size; i++){
            if(persons[i].getFirstName().equals(p.getFirstName())){
                index = i;
                break;
            }
        }

        if(index == -1) return false;

        Person[] temp = new Person[persons.length];
        System.arraycopy(persons, 0, temp, 0, index);
        System.arraycopy(persons, index+1, temp, index,persons.length - (index+1));
        size--;
        persons = temp;
        return true;
    }


    boolean isEmpty(){
        return size==0;
    }

    public String getLast(){
        return persons[size-1].getLastName();
    }

    public boolean find(String lastName){
        if( lastName == null ) return false;
        for(int i=0; i< size; i++){
            if(persons[i].getLastName().equals(lastName)){
                return true;
            }
        }
        return false;
    }

    private void resizeArray() {
        int len = persons.length;
        Person[] temp = new Person[2*len];

        System.arraycopy(persons, 0, temp,0, len);
        persons = temp;
    }

    public static void main(String[] args) {

        MyPersonList personList = new MyPersonList();
        personList.add(new Person("Alice","Bob", 12));
        personList.add(new Person("Smith", "Alice", 30));

        personList.insertAtPos(new Person("John", "Robert", 35), 1);

        personList.add(new Person("Brown", "Sarah", 40));
        personList.add(new Person("Davis", "Michael", 45));

        personList.remove(new Person("Brown", "Sarah", 40));

        boolean findMe1 = personList.find("Sarah");
        boolean findMe2 = personList.find("Michael");

        for(Person p: personList.persons){
            if(p != null)
                System.out.println(p.toString());
        }

        System.out.println("Find  Sarah : "+findMe1); //false
        System.out.println("Find  Michael : "+findMe2); //true

        System.out.println("Get Last: "+personList.getLast());
        //At index 1: Person[lastName=Smith, FirstName=Alice, Age=30]


    }

}

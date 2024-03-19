package A67.Lab.HashTable;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

import static java.util.Objects.hash;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-15-03
 */
public class MyHashTable {
    private static final int SIZE = 10;
    private int tableSize;
    private LinkedList[] table;

    private int numberOfElements;

    public MyHashTable() {
        this(SIZE);

    }

    public MyHashTable(int tableSize){
        this.tableSize = tableSize;
        table = new LinkedList[tableSize];
        numberOfElements = 0;
    }

    private int hash(int bigNum){
        return bigNum%tableSize;
    }

    //Separating chaining strategy collision
    public void put1(Object key, Object value){
        if(key == null) return;

        int hascode = key.hashCode();
        int hashValue = hash(hascode);

        Entry e = new Entry(key, value);

        if(table[hashValue] == null){
            table[hashValue] = new LinkedList();
            table[hashValue].add(e);
        }

    }

    //Second try
    public void put(Object key, Object value){
        //disallow null key
        if(key == null) return;

        int hashcode = key.hashCode();
        int hashValue = hash(hashcode);

        Entry e = new Entry(key, value);

        boolean keyAlreadyInUse = false;

        if (table[hashValue] != null) {
            for(Object ob : table[hashValue]) {
                Entry ent = (Entry) ob;
                if (ent.key.equals(key)) {
                    keyAlreadyInUse = true;
                    ent.value = value; //update value for this Entry
                }
            }
        }

        if(!keyAlreadyInUse) {
            // now place it in the table
            if (table[hashValue] == null) {
                table[hashValue] = new LinkedList();
            }
            table[hashValue].add(e);
        }
        numberOfElements++;
    }

    public Object get(Object key){
        int hashcode = key.hashCode();
        int hash = hash(hashcode);

        Entry e = null;

        Iterator it = table[hash].iterator();

        while(it.hasNext()){
            e = (Entry) it.next();
            if(e.key.equals(key)){
                return e.value;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String n = System.getProperty("line.separator");
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<table.length; i++) {
            if(table[i] != null) {
                sb.append("Index["+i+"]"+ " ");

                Iterator it = table[i].iterator();
                Entry e = null;
                while (it.hasNext()) {
                    e = (Entry) it.next();
                    if(e.value != null){
                        sb.append(e + n);
                    }else{
                        sb.append(e.key + "->null" + n);
                    }
                  // sb.append("\n"+e.key+" -> "+e.value);
                }
            }
        }
        return sb.toString();
    }

    public int size() { return numberOfElements;}

    public boolean isEmpty(){
        return numberOfElements == 0 ? true : false;
    }

    class Entry{
        private Object key;
        private Object value;

        public Entry(Object key, Object value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return key.toString()+"->"+value.toString();
        }
    }

    public static void main(String[] args) {
        MyHashTable myHashTable = new MyHashTable(10);
        myHashTable.put(100, "abc1");
        myHashTable.put(200, "abc2");
        myHashTable.put(400, null);
        myHashTable.put(300, "abc3");

        System.out.println(myHashTable);

        System.out.println(myHashTable.get(300));

    }
}

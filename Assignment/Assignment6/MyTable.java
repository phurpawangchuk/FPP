package Assignment6;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-06-03
 */
public class MyTable {
    private Entry[] entries;
    MyTable(){
        entries = new Entry[26];
    }

    //returns the String that is matched with char c in the table
    public String get(char c){
        //implement
        int index = c -'a';
        if(index >=0 && index < 26){
            return entries[index].str;
        }
        return null;
    }
    //adds to the table a pair (c, s) so that s can be looked up using c
    public void add(char c, String s) {
        //implement
        int index = c - 'a';
        if(index >= 0 && index < 26) {
            entries[index] = new Entry(c, s);
        }
    }

    //returns a String consisting of nicely formatted display
    //of the contents of the table
    public String toString() {
        //implement
        StringBuilder sb = new StringBuilder();
        for(Entry entry: entries){
            if(entry != null) {
                sb.append(entry.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    private class Entry {
        char ch;
        String str;

        Entry(char ch, String str){
            //implement
            this.ch = ch;
            this.str = str;
        }
        //returns a String of the form "ch->str"
        public String toString() {
            //implement
            return ch+" -> "+str;
        }
    }

}

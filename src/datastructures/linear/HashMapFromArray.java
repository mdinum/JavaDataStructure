package datastructures.linear;

import java.util.LinkedList;

public class HashMapFromArray {
    public static void main(String[] args) {
        HashMapArray obj = new HashMapArray();

        obj.put(0, "Data 1");
        obj.put(3,"Data 3");
        obj.put(13,"Data 13");
        obj.put(23,"Data 23");
        obj.put(43,"Data 43");
        obj.put(2352,"Data 2352");
        obj.put(972,"Data 972");

        obj.get(0);
        obj.get(3);
        obj.get(13);
        obj.remove(3);
        obj.get(3);
        obj.get(13);
        obj.get(2352);

        //obj.display();
    }
}

class HashMapArray {
    private LinkedList<Entry>[] hashmap = new LinkedList[10];

    public void put(int key, String value) {
        var newKey = getHash(key);

        //If there are no data in the index,initiate new list
        if (null == hashmap[newKey])
            hashmap[newKey] = new LinkedList<Entry>();

        //If the Item already existing in the list,replace the value
        for (var entry: hashmap[newKey])
            if(entry.key==key){
                entry.value = value;
                return;
            }

        //If item not in the array,add value as a new item
        hashmap[newKey].addLast(new Entry(key, value));
    }

    public void get(int key) {
        var newKey = getHash(key);
        var currentData = hashmap[newKey];
        boolean flag = false;
        if (null == currentData)
            throw new IllegalArgumentException();
        else
            for (var dataObj : currentData)
                if(dataObj.key==key) {
                    System.out.println(dataObj.value);
                    flag = true;
                    break;
                }
        System.err.println((!flag)?key+" - Not Fond":"");
    }

    public void remove(int key){
        var newKey = getHash(key);
        var currentData = hashmap[newKey];
        boolean flag = false;
        if (null == currentData)
            throw new IllegalArgumentException();
        else
            for (var dataObj : currentData)
                if(dataObj.key==key) {
                    currentData.remove(dataObj);
                    System.out.println("Done");
                    flag = true;
                    break;
                }
        System.err.println((!flag)?"Error":"");
    }

    private int getHash(int key) {
        return (key >= hashmap.length) ? key % hashmap.length : key;
    }

    public void display() {
        System.out.println(hashmap);
    }

    private class Entry {
        private int key;
        private String value;

        Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}

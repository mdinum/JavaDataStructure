import java.util.Arrays;

class Array{
    public static void main(String arg[]) {
        System.out.println("One-Dimensional Arrays Example");
        ArraySample obj = new ArraySample();
        obj.displayArray();
        obj.sortArray();
        obj.linearSearch(5);
    }
}

class ArraySample{
    /*
    Declaration an array
    _____________________
    The declaration can be done using the following both ways
    type var-name[];
    OR
    type[] var-name; 
    */
    int[] intArray1;
    int intArray2[];
    String stringArray[];
    byte byteArray[];
    short shortsArray[];
    boolean booleanArray[];
    long longArray[];
    float floatArray[];
    double doubleArray[];
    char charArray[];
    //Object Array
    Object objectArray[];

    //combining both statements (Declaration and Instantiating) in one
    int[] intArray = new int[20];
    
    //Defult constructor
    public ArraySample(){
        /*
        Instantiating an Array
        ______________________
        var-name = new type [size];
        */
        // allocating memory for 5 integers.
        intArray1 = new int[5];
        stringArray = new String[]{"one","two","three"};

        // initialize the first elements of the integer array
        intArray1[0] = 6;

        // initialize the secound elements of the integer array
        intArray1[1] = 2;

        // initialize the third elements of the integer array
        intArray1[2] = 5;

        intArray1[3] = 1;
        intArray1[4] = 9;
    }

    public void sortArray(){
        Arrays.sort(intArray1);
        System.out.println("---------Sorted Array---------");
        for (int iterable_element : intArray1) {
            System.out.println(iterable_element);
        }
    }

    public void linearSearch(int key){
        for (int i = 0; i < intArray1.length; i++)
            if(intArray1[i]==key)
                System.out.println("Found...! index="+i);
             else 
                System.out.println("Search key not found");
            
    }

    public void displayArray(){
        //Array Length
        System.out.println("Array size = "+stringArray.length);

        // accessing the elements of the specified array
        for (int i = 0; i < stringArray.length; i++)
            System.out.println("Element at index " + i + " : " + stringArray[i]);

        
        System.out.println("Array size = "+intArray1.length);

        for (int iterable_element : intArray1) {
            System.out.println(iterable_element);
        }
    }
    
}
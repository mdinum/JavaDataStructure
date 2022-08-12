package datastructures.linear;

class MultidimensionalArrays {
    public static void main(String[] arg) {
        System.out.println("Two Dimensional datastructures.linear.Array Example");
        System.out.println("_____________________________");
        TwoDimensionalArray obj = new TwoDimensionalArray();
        obj.displayArray();
        System.out.println("");
        System.out.println("Three Dimensional datastructures.linear.Array Example");
        System.out.println("_____________________________");
        ThreeDimensionalArray objt = new ThreeDimensionalArray();
        objt.displayArray();
    }
}


class TwoDimensionalArray{
    //Declaration an array
    private int[][] intArray;

    public TwoDimensionalArray(){
        //Initializing an array
        intArray = new int[][]{{11,24,36,42,58},{45,67,23,45,23},{29,64,73,40,71},{44,66,87,43,95},{34,72,93,37,89}};
    }

    public void displayArray(){
        for(int i=0;i<intArray.length;i++){
            for(int j=0;j<intArray[i].length;j++)
                System.out.print("["+i+"]["+j+"]'"+intArray[i][j]+"' ");
            System.out.println("");    
        }        
    }
}

class ThreeDimensionalArray{
    //Declaration an array
    private long[][][] intArray = new long[5][5][5];

    public void assignValues(){
        //Initializing an array with random values
        for(int i=0;i<5;i++)
            for(int j=0;j<5;j++)
                for(int k=0;k<5;k++)
                    intArray[i][j][k] = Math.round(Math.random()*100);
    }

    public void displayArray(){
        this.assignValues();
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                for(int k=0;k<5;k++)
                    System.out.print("["+i+"]["+j+"]["+k+"]'"+intArray[i][j][k]+"' ");
                System.out.println("");    
            } 
            System.out.println("");
        }       
    }

}
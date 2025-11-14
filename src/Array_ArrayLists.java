import java.util.*; //Arrays are built into Java, arraylists are a part of this package.


/**
 *
 */
public class Array_ArrayLists
{
    //instance variables

    /**
     * Constructor for objects of class Array_ArrayLists
     */
    public Array_ArrayLists()
    {
        //initialise instance variables
    }

    /**
     * Main method for class Array_ArrayLists
     *
     * @param args
     */
    public static void main(String[] args)
    {
        Array_ArrayLists array_ArrayLists = new Array_ArrayLists();
        array_ArrayLists.compare();
    }
    public void compare()
    {
        Scanner scan = new Scanner(System.in);
        String[] arrayExample = createArray();  //Call method for iterating through array entry.
        ArrayList<String> arraylistExample = new ArrayList<>(Arrays.asList(arrayExample));
        System.out.println("New String #1");
        String new1 = scan.nextLine(); //Get a new #1 string
        arrayExample[0]  = new1; //Arrays use bracket notation to access elements.
        System.out.println(Arrays.toString(arrayExample));
        arraylistExample.set(0,new1); //Arraylists use methods. Both use index numbers
        System.out.println(arraylistExample);
        //Arrays use a contiguous block of memory, saving space.
        //Arraylists are internally stored as arrays, but have metadata and overhead using more RAM
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long memoryStart = runtime.totalMemory() - runtime.freeMemory();
        ArrayList<Integer> memTestL= new ArrayList<>();
        for (int i = 0; i < 5; i++)
        {
            memTestL.add(i);
        }
        long usedMemory = (runtime.totalMemory() - runtime.freeMemory()) - memoryStart;
        System.out.println("Memory used for arraylist: " + (usedMemory / 1024) + "KB");
        System.out.println(memTestL);
        runtime.gc();
        memoryStart = runtime.totalMemory() - runtime.freeMemory();
        int[] memTestA= new int[5];
        for (int i = 0; i < 5; i++)
        {
            memTestA[i]=i;
        }
        usedMemory = (runtime.totalMemory() - runtime.freeMemory()) - memoryStart;
        System.out.println("Memory used for array: " + (usedMemory / 1024)+ "KB");
        System.out.println(Arrays.toString(memTestA));
        //Should show arraylist using twice as much memory.
        arraylistExample.add("z");
        System.out.println(arraylistExample); //Arraylists can be added to
        try
        {
            arrayExample[5] = "z"; //Arrays are a fixed size
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(Arrays.toString(arrayExample));
    }

    public String[] createArray()
    {
        Scanner in = new Scanner(System.in);
        String[] arrayExample;
        arrayExample = new String[5];
        for(int i=0;i<5;i++)
        {
            System.out.printf("Enter string #%d:",i+1);
            arrayExample[i] = in.nextLine();
        }
        return arrayExample;
    }
}
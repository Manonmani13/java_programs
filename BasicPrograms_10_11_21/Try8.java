package BasicPrograms_10_11_21;

public class Try8 {
	public static void main(String[] args) {  
        try  
        {  
        int arr[]= {1,3,5,7};  
        System.out.println(arr[10]); //may throw exception   
        }  
            // handling the array exception  
        catch(ArrayIndexOutOfBoundsException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  
    }  
}
/*
java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 4
rest of the code

*/
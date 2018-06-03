package Comum;

public class InversaoArray {
	
	public static void main(String[] args) {
		
        InverteArray(args);
	}

	private static void InverteArray(String[] args) {
		int[] arr = new int[4];
		for(int i=0; i < arr.length; i++){
            arr[i] = Integer.parseInt(args[i]);
        }
        
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
	}

}

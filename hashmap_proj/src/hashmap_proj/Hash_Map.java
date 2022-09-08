//program to create HashMap from 1 to 15 and calculate the square using for loop
import java.util.HashMap;

public class Hash_Map{
	public static void main(String args[]) {
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		map.put(1, 1);
		map.put(2, 2);
		map.put(3, 3);
		map.put(4, 4);
		map.put(5, 5);
		map.put(6, 6);
		map.put(7, 7);
		map.put(8, 8);
		map.put(9, 9);
		map.put(10, 10);
		map.put(11, 11);
		map.put(12, 12);
		map.put(13, 13);
		map.put(14, 14);
		map.put(15, 15);
		
		
		for(int i=1;i<=15;i++) {
			map.put(i,i*i); // calculate the square
			System.out.println(i*i); 
			
		}
	}
}
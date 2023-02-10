package assignmentHV.gradedAssign_1;
import java.util.*;
public class missingNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements: ");
		int n = sc.nextInt();
		int mx = 0;
		List<Integer>li = new ArrayList<>();
		Map<Integer,Integer>mp = new HashMap<>();
		System.out.println("Enter elements : ");
		for(int i = 0 ; i < n ; i++) {
			int num = sc.nextInt();
			mp.put(num,1);
			mx = Math.max(mx, num);
		}
		for(int i = 1 ; i < mx ; i++) {
			if(!mp.containsKey(i))
				li.add(i);
		}
		System.out.println("Missing Elements : ");
		print(li);
		sc.close();
	}
	public static void print(List<Integer> li) {
		for(int i = 0 ; i < li.size(); i++) {
			System.out.print(li.get(i));
			if(i == li.size()-1)
				System.out.println();
			else
				System.out.print(", ");
		}
	}

}

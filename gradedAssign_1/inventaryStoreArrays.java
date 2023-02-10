package assignmentHV.gradedAssign_1;
import java.util.*;
public class inventaryStoreArrays {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter no of products : ");
		int n = sc.nextInt();
		Map<String,List> mp = new HashMap<>();
		System.out.println("Note : enter details of product with name in one line seperared with spaces \n");
		for(int i = 0 ; i < n  ; i++ ) {
			System.out.println("Enter productName,  Specification,  cost,  count : \n");
			sc.nextLine();
			String line  = sc.nextLine();
			String[] arr = line.split(" ");
			List list = new ArrayList() ;
			String pname = arr[0];
			String pspec = arr[1];
			double cost = Double.parseDouble(arr[2]);
			int count = Integer.parseInt(arr[3]);
			list.add(pspec);
			list.add(cost);
			list.add(count);
			mp.put(pname, list);
			//list.clear();
		}
		boolean flag = true;
		while(flag != false) {
			System.out.println("------------X------------");
			System.out.println("	1.Product List  ");
			System.out.println("	2.Product count ");
			System.out.println("	3.Product details ");
			System.out.println("	4.Edit product details ");
			System.out.println("	5.Update Inventory ");
			System.out.println("	6.Exit");
			System.out.println("	Enter your choice ");
			int choice = sc.nextInt();
			if(choice == 1) {
					productList(mp);
			}else if(choice == 2) {
				productcount(mp);
			}else if(choice == 3) {
				productdetails(mp);
			}else if(choice == 4) {
				editproduct(mp);
			}else if(choice == 5) {
				updateInventory(mp);
			}else if(choice  == 6) {
				flag = false;
			}else {
					System.out.println("Enter choice between 1 - 6 ");
			}
			
		}
	}
	public static void productList(Map<String,List> mp) {
		int i = 1;
		for(String st : mp.keySet()) {
			System.out.println(i + " "+st);
			i++;
		}
	}
	public static void updateInventory(Map<String,List> mp) {
		System.out.println("-----------------------");
		System.out.println("   1. Add poduct");
		System.out.println("   2. Delete product");
		System.out.println("Enter your choice");System.out.println();
		sc.nextLine();
		int n = sc.nextInt();
		if(n == 1) {
			System.out.println("Enter productName,Specification,cost,count : ");
			sc.nextLine();
			String t = sc.nextLine();
			String []arr = t.split(" ");
			String name = arr[0];
			String spec = arr[1];
			double cost = Double.parseDouble(arr[2]);
			int count = Integer.parseInt(arr[3]);
			List list = new ArrayList();
			list.add(spec);
			list.add(cost);
			list.add(count);
			mp.put(name, list);
		}else {
			System.out.println("Enter product name to delete product : ");
			String pname = sc.nextLine();
			if(mp.containsKey(pname)) {
				mp.remove(pname);
				System.out.println("Product removed Successfully");
			}else {
				System.out.println("Product Not Found");
			}
		}
	}
	public static void editproduct(Map<String,List> mp) {
		System.out.println("Enter product name : ");
		sc.nextLine();
		String pname = sc.nextLine();
		if(mp.containsKey(pname)) {
			System.out.println("what do you want to edit :\n1.Specification\n2.Cost\n3.Product count");
			int ch = sc.nextInt();
			if(ch == 1) {
				System.out.println("Enter product specification ");
				String st = sc.nextLine();
				List list = mp.get(pname);
				list.remove(0);
				list.add(0, st);
				mp.put(pname, list);
			}else if(ch == 2) {
				System.out.println("Enter product cost ");
				double cost = sc.nextDouble();
				List list = mp.get(pname);
				list.remove(1);
				list.add(1, cost);
				mp.put(pname,list);
			}else {
				System.out.println("\nEnter product count ");
				int count = sc.nextInt();
				List list = mp.get(pname);
				list.remove(2);
				list.add(count);
				mp.put(pname,list);
			}
			return;
		}else {
			System.out.println("Product not found");
		}
	}
	public static void productcount(Map<String,List> mp) {
		System.out.println("Enter product name");
		sc.nextLine();
		String pname = sc.nextLine();
		if(mp.containsKey(pname)) {
			List temp = mp.get(pname);
			System.out.println("count of "+pname+" is "+temp.get(2));
		}else {
			System.out.println("Product not found");
		}
	}
	public static void productdetails(Map<String,List> mp) {
		System.out.println("Enter product name");
		sc.nextLine();
		String pname = sc.nextLine();
		if(mp.containsKey(pname)) {
			System.out.println("Product Name : "+pname);
			System.out.println("Product Specification : "+mp.get(pname).get(0));
			System.out.println("Product Cost : "+mp.get(pname).get(1));
			System.out.println("Product count : "+mp.get(pname).get(2));
		}else {
			System.out.println("Product not found");
		}
	}
}
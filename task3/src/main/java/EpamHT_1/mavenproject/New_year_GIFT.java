package EpamHT_1.mavenproject;
import java.util.*;
public class New_year_GIFT {
	public static void main(String args[]) {
		no_chocolates n_c=new no_chocolates();
		Scanner sc=new Scanner(System.in);
		int nc,ns,i;
		int low,high,candy=0;
		System.out.println("Enter lower range of candy:");
		low=sc.nextInt();
		
		System.out.println("Enter higher range of candy:");
		high=sc.nextInt();
		
		System.out.println("Enter total weight of the gift:");
		int gift_weight=sc.nextInt();
		
		System.out.println("Enter number of sweets:");
		ns=sc.nextInt();
		int sweets[]=new int[ns];
		for(i=0;i<ns;i++) {
			System.out.println("Enter the weight of "+(i+1)+" sweet:");
			sweets[i]=sc.nextInt();
			candy=candy+n_c.no_of_candy(low,high,sweets[i]);
		}
		
		System.out.println("Enter number of chocolates:");
		nc=sc.nextInt();
		int chocolates[]=new int[nc];
		for(i=0;i<nc;i++) {
			System.out.println("Enter the weight of "+(i+1)+" chocolate:");
			chocolates[i]=sc.nextInt();
			candy=candy+n_c.no_of_candy(low,high,chocolates[i]);
		}
		
		int remainingweight;
		remainingweight=n_c.chocolate_sweets(chocolates,sweets,gift_weight);
		System.out.println("Remaining space in gift:"+remainingweight);
		
		System.out.println("candy count:"+candy);
		sc.close();
	}
}

package EpamHT_1.mavenproject;

public class no_chocolates implements MainInterface{
	int i;
	public int chocolate_sweets(int chocolates[],int sweets[],int total_weight) {
		for(i=0;i<chocolates.length;i++) {
			total_weight=total_weight-chocolates[i];
		}
		for(i=0;i<sweets.length;i++) {
			total_weight=total_weight-sweets[i];
		}
		return total_weight;
	}
	public int no_of_candy(int low,int high,int x) {
		if(x>=low&&x<=high) {
			return 1;
		}
		else
			return 0;
	}
}

package sequality;

public class Calculate {
	public int sum(int x, int y) {
		return x + y;
	}
	public int total(int x,int y){
		int a = 0;
		for (int i=x;i<=y;i++){
			a += i;
		}
		return a;
	}
	public float sum_ave(int x, int y) {
		return (float)(x + y)/2;
	}
	public float total_ave(int x,int y){
		int a = 0;
		for (int i=x;i<=y;i++){
			a += i;
		}
		return (float)a/(y-x+1);
	}
	public int total_odds(int x,int y){
		int a = 0;
		for (int i=x;i<=y;i++){
			if (i%2==1){
				a += i;
			}
		}
		return a;
	}
	public int total_even(int x,int y){
		int a = 0;
		for (int i=x;i<=y;i++){
			if (i%2==0){
				a += i;
			}
		}
		return a;
	}
}
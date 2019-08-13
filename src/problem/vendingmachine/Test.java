package problem.vendingmachine;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {0,1,2,2};
	System.out.println(minCostClimbingStairs(arr));

	}
	
	
/*	
	 public static int minCostClimbingStairs(int[] cost) {
	        int i = cost.length-1;
	        int result = 0;
	        while(i >= 0 && i - 1 >= 0 ){
	
	        	int cheapIndex = cost[i-1] <= cost[i] ? i-1 : i;
	        	System.out.println("Current:"+ i+" Cheap:"+cheapIndex);
	        	result = result + cost[cheapIndex];
	        	i = cheapIndex - 1;
	        }
	        return result;
	    }*/
	 
	 
	
	
	 public static int minCostClimbingStairs(int[] cost) {
		 int f1 = 0, f2 = 0;
	        for (int i = cost.length - 1; i >= 0; --i) {
	            int f0 = cost[i] + Math.min(f1, f2);
	            f2 = f1;
	            f1 = f0;
	            System.out.println("FO:"+f0+" F1:"+f1+" F2:"+f2);
	        }
	        return Math.min(f1, f2);
	    }

}

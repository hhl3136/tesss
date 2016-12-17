package test;

public class MapColorTest {
		
	private int colors;
	private boolean[][] map;
	private int[] solution;
	private long sum; // 解法种数

	public MapColorTest(boolean map[][], int colors) {
		this.map = map;
		this.colors = colors;
		solution = new int[map[0].length];
	}

	public long mColoring() {
		backtrack(1);
		return sum;
	}

	private void backtrack(int t) {
		int n = map[0].length;
		//No.1
		//开始写代码，完成回溯功能
		if(t>n) {
			sum++;
			print(sum);
		} else {
			for(int i=1;i<colors;i++){
				solution[t-1]=i;
				if(ok(t)){
					backtrack(t+1);
				}
			}
		}
		//end_code
	}

	private boolean ok(int k) {
		//No.2
		//开始写代码，判断是否可以着色
		for(int j=0;j<k-1;j++){
			if(map[k-1][j]&&(solution[j]==solution[k-1])){
				return false;
			}
		}
		return true;
		//end_code
	}

	private void print(long n) {
		System.out.println("第" + n + "种方案:");
		for (int i = 0; i < solution.length; i++)
			System.out.println("第" + (i + 1) + "个结点的颜色是：" + solution[i]);
	}

	public static void main(String[] args) {
		boolean map[][] = { { false, true, false, false, false, true, true },
				{ true, false, true, true, true, true, false },
				{ false, true, false, true, false, false, false },
				{ false, true, true, false, true, false, false },
				{ false, true, false, true, false, true, false },
				{ true, true, false, false, true, false, true },
				{ true, false, false, false, false, true, false } };
		int colors = 4;
		MapColorTest mc = new MapColorTest(map, colors);
		System.out.println("共找到了 " + mc.mColoring() + " 种方案！");
	}
}






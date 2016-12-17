package test;

public class HanoiTest {
	int i=1;
	public static void main(String args[]) {
		int columnsNumber = 3;
		HanoiTest hanoi = new HanoiTest();
		hanoi.move(columnsNumber,'A','B','C');
	}
	public void moveTo(int n, char from, char to){
		int num=i++;
		System.out.println("第"+num+"步："+n+
				"号盘子"+from+"----移至---"+to);
	}
	//No.1
	//开始写代码，汉诺塔问题，实现move方法
	public void move(int columnsNumber, char A, char B, char C) {
		if(columnsNumber==1){
			moveTo(columnsNumber, A, C); 
		}else{
			move(columnsNumber-1, A, C, B);
			moveTo(columnsNumber, A, C); 
			move(columnsNumber-1, B, A,C);
		}
	}
	
	//end_code
}


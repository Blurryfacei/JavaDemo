package cn;

public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1zhixingrengwu1");
		new Thread(()->{
			int temp=0;
			for(int x=0;x<Integer.MAX_VALUE;x++) {
				temp+=x;
			}
			System.out.println("zhixing");
		}).start();
		System.out.println("2zhixingrenwu2");
		System.out.println("NzhixingrenwuN");
		System.out.println();
		System.out.println();
		System.out.println();
	}

}

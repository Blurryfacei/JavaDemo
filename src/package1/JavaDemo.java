package package1;

public class JavaDemo {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����ʼִ��");
		try {
			int x=9;
			int y=0;
			System.out.println("��������"+ (x/y));
			System.out.println("�������");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("�һᱻִ��");
		}
		System.out.println("ִ�����");
	}

}

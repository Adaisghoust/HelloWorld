public class TestSwichCase{
	public static void main(String[] args) {
		char grade = 'E';
		switch(grade)
		{
		case 'A' :
		System.out.println("����");
		break;
		case 'B' :
		case 'C' :
		System.out.println("����");
		case 'D' :
		System.out.println("����");
		break;
		default:
		System.out.println("δ֪");
		}System.out.println("�ȼ���" + grade);
		
	}
	
}

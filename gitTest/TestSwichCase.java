public class TestSwichCase{
	public static void main(String[] args) {
		char grade = 'E';
		switch(grade)
		{
		case 'A' :
		System.out.println("优秀");
		break;
		case 'B' :
		case 'C' :
		System.out.println("良好");
		case 'D' :
		System.out.println("及格");
		break;
		default:
		System.out.println("未知");
		}System.out.println("等级是" + grade);
		
	}
	
}

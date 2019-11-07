class MemberService {
	
	String id;
	String password;
	
	
	boolean login(String i,String p) {
		 if (i=="hong"&&p=="12345") {
			 return  true;
		 }else 
			 return false;
	}
	void logout(String i) {
		 if (i=="hong") {
			 System.out.println("로그아웃 되셨습니다.");
			 return ;
		 }else 
			 return ;
	}

}

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong","12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}
class Member {
	// 작성 위치
	String name;
	String id;
	String password;
	int age;

	public Member(String n, String i) {
		name = n;
		id = i;
	}
}
public class MemberExample {

	public static void main(String[] args) {
		Member user1 = new Member("홍길동", "hong");
		Member user2 = new Member("강자바", "java");
	}

}

package java_03.member;

public class MemberInfo {

	public static void main(String[] args) {

		// Member 객체 생성 - 기본 생성자
		
		Member member = new Member();
		
		member.setMemberId("malja5");
		member.setMemberName("임유진");
		member.setMemberEmail("wowmalja@gmail.com");
		member.setMemberGender("여성");
		member.setMemberPhone("010-9897-9877");
		
		System.out.println(member.getMemberId());
		System.out.println(member.getMemberName());
		System.out.println(member.getMemberEmail());
		System.out.println(member.getMemberGender());
		System.out.println(member.getMemberPhone());
		
		member.setMemberId("wowmalja");
		System.out.println(member.getMemberId());
		

		// Member(String, String) - 회원 아이디와 이름으로 구성된 생성자
		// 오징어 게임 시즌 1 출연진
		
		MemberDrama.dramaMemberInfo();
		

		// 여러명의 멤버 생성 (회원 아이디와 이름으로만 구성)


	}

}
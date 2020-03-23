package member.controller;

import java.util.Scanner;

import member.model.vo.Member;

public class MemberManager {
	
	private static Member[] m = new Member[10];
	private static int cnt = 0;
	private Scanner sc = new Scanner(System.in);
	
	public MemberManager() {}
	
	public void insertMember() {
		System.out.print("아이디 : ");
		String userId = sc.next();
		sc.nextLine();
		System.out.print("패스워드 : ");
		String userPwd = sc.next();
		sc.nextLine();
		System.out.print("이름 : ");
		String userName = sc.next();
		sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		System.out.print("이메일 : ");
		String email = sc.next();
		sc.nextLine();
		
		m[cnt] = new Member(userId, userPwd, userName, age, gender, email);
		cnt++;
		
		System.out.println("입력이 완료되었습니다. 메인 메뉴로 돌아갑니다.");
		return;
	}
	
	public void searchId() {
		System.out.print("검색할 아이디를 입력하세요. : ");
		String searchId = sc.nextLine();
		
		for(int i = 0; i < m.length; i++) {
			if(m[i].getUserId().equals(searchId)) {
				printOne(m[i]);
				return;
			}
		}
		System.out.println("검색한 회원 정보가 존재하지 않습니다.");
	}
	
	public void searchName() {
		System.out.print("검색할 이름을 입력하세요. : ");
		String searchName = sc.nextLine();
		
		for(int i = 0; i < m.length; i++) {
			if(m[i].getUserName().equals(searchName)) {
				printOne(m[i]);
				return;
			}
		}
		System.out.println("검색한 회원 정보가 존재하지 않습니다.");
	}
		
	public void searchEmail() {
		System.out.print("검색할 이메일을 입력하세요. : ");
		String searchEmail = sc.nextLine();
		
		for(int i = 0; i < m.length; i++) {
			if(m[i].getEmail().equals(searchEmail)) {
				printOne(m[i]);
				return;
			}
		}
		System.out.println("검색한 회원 정보가 존재하지 않습니다.");
	}
	
	public void updatePwd() {
		System.out.print("수정할 회원의 아이디를 입력하세요. : ");
		String userId = sc.nextLine();
		
//		int updateUserIndex = 0;
//		int count = 0;
		for(int i = 0; i < m.length; i++) {
			if(m[i].getUserId().equals(userId)) {
//				updateUserIndex = i;
				System.out.print("수정할 패스워드를 입력하세요. : ");
				String updatePwd = sc.nextLine();
				m[i].setUserPwd(updatePwd);
				System.out.println("패스워드 수정이 완료되었습니다.");
//				count++;
				printOne(m[i]);
				return;
			}
		}
		
//		if(count == 0) {
			System.out.println("수정할 회원이 존재하지 않습니다.");
//			return;
//		}
//		
//		System.out.print("수정할 패스워드를 입력하세요. : ");
//		String updatePwd = sc.nextLine();
//		m[updateUserIndex].setUserPwd(updatePwd);
//		System.out.println("패스워드 수정이 완료되었습니다.");
		
		
		
	}
	
	public void printOne(Member m) {
		System.out.println("아이디 : " + m.getUserId());
		System.out.println("패스워드 : " + m.getUserPwd());
		System.out.println("이름 : " + m.getUserName());
		System.out.println("나이 : " + m.getAge());
		System.out.println("성별 : " + m.getGender());
		System.out.println("이메일 : " + m.getEmail());
	}

}

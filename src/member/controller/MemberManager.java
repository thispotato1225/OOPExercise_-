package member.controller;

import java.util.Scanner;

import member.model.vo.Member;

public class MemberManager {
	
	private static Member[] m = new Member[10];
	private static int ctn = 0;
	private Scanner sc = new Scanner(System.in);
	
	public MemberManager() {}
	
	public void insertMember() {
		System.out.print("���̵� : ");
		String userId = sc.next();
		sc.nextLine();
		System.out.print("�н����� : ");
		String userPwd = sc.next();
		sc.nextLine();
		System.out.print("�̸� : ");
		String userName = sc.next();
		sc.nextLine();
		System.out.print("���� : ");
		int age = sc.nextInt();
		System.out.print("���� : ");
		char gender = sc.next().charAt(0);
		System.out.print("�̸��� : ");
		String email = sc.next();
		sc.nextLine();
		
		m[ctn] = new Member(userId, userPwd, userName, age, gender, email);
		ctn++;
		
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�. ���� �޴��� ���ư��ϴ�.");
		return;
	}
	
	public void searchId() {
		System.out.print("�˻��� ���̵� �Է��ϼ���. : ");
		String searchId = sc.nextLine();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(searchId)) {
				printOne(m[i]);
				return;
			}
		}
		System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
		
	}
	
	public void searchName() {
		System.out.print("�˻��� �̸��� �Է��ϼ���. : ");
		String searchName = sc.nextLine();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserName().equals(searchName)) {
				printOne(m[i]);
				return;
			}
		}
		System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
	}
		
	public void searchEmail() {
		System.out.print("�˻��� �̸����� �Է��ϼ���. : ");
		String searchEmail = sc.nextLine();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getEmail().equals(searchEmail)) {
				printOne(m[i]);
				return;
			}
		}
		System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
	}
	
	public void updatePwd() {
		System.out.print("������ ȸ���� ���̵� �Է��ϼ���. : ");
		String userId = sc.nextLine();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(userId)) {

				System.out.print("������ �н����带 �Է��ϼ���. : ");
				String updatePwd = sc.nextLine();
				m[i].setUserPwd(updatePwd);
				System.out.println("�н����� ������ �Ϸ�Ǿ����ϴ�.");
				printOne(m[i]);
				return;
			}
		}
			System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
	}
	
	public void updateName() {
		System.out.print("������ ȸ���� �̸��� �Է��ϼ���. : ");
		String userName = sc.nextLine();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserName().equals(userName)) {

				System.out.print("������ �̸��� �Է��ϼ���. : ");
				String updateName = sc.nextLine();
				m[i].setUserName(updateName);
				System.out.println("�̸� ������ �Ϸ�Ǿ����ϴ�.");
				printOne(m[i]);
				return;
			}
		}
			System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
	}
	
	public void updateEmail() {
		System.out.print("������ ȸ���� �̸����� �Է��ϼ���. : ");
		String userEmail = sc.nextLine();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getEmail().equals(userEmail)) {

				System.out.print("������ �̸����� �Է��ϼ���. : ");
				String updateEmail = sc.nextLine();
				m[i].setEmail(updateEmail);
				System.out.println("�̸��� ������ �Ϸ�Ǿ����ϴ�.");
				printOne(m[i]);
				return;
			}
		}
			System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
	}
	
	public void deleteOne() {
		System.out.print("Ż���� ȸ���� ���̵� �Է��ϼ���. : ");
		String userId = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(userId)) {
				for (int j = 0; j < ctn; j++) {
					m[j] = m[j + 1];
					return;
				}
			}
		}
		System.out.println("������ ȸ�� ������ �������� �ʽ��ϴ�.");
	}
	
	public void printOne(Member m) {
		System.out.println("���̵� : " + m.getUserId());
		System.out.println("�н����� : " + m.getUserPwd());
		System.out.println("�̸� : " + m.getUserName());
		System.out.println("���� : " + m.getAge());
		System.out.println("���� : " + m.getGender());
		System.out.println("�̸��� : " + m.getEmail());
	}

}

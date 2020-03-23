package member.view;

import java.util.Scanner;

import member.controller.MemberManager;

public class MemberMenu {
	
	private Scanner sc = new Scanner(System.in);
	private MemberManager mm = new MemberManager();
	
	public MemberMenu() {}
	
	public void mainMenu() {
		do {
			System.out.println("========== ȸ�� ���� �޴� ==========");
			System.out.println("1. �ű� ȸ�� ���");
			System.out.println("2. ȸ�� ���� �˻�");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� ���� ���");
			System.out.println("9. ����");
			System.out.println("==============================");
			System.out.print("�޴� ��ȣ�� �Է��ϼ���. : ");
			int btn = sc.nextInt();
			
			switch(btn) {
			case 1 : 
			case 2 : 
			case 3 : 
			case 4 : 
			case 5 : 
			case 9 : 
			default : System.out.println("���α׷��� �����մϴ�."); return;
			}
		} while(true);
	}
	
	public void searchMemberMenu() {
		do {
			System.out.println("========== ȸ�� ���� �˻� ==========");
			System.out.println("1. ���̵�� �˻��ϱ�");
			System.out.println("2. �̸����� �˻��ϱ�");
			System.out.println("3. �̸��Ϸ� �˻��ϱ�");
			System.out.println("9. ���θ޴���");
			System.out.println("==============================");
			System.out.print("�޴� ��ȣ�� �Է��ϼ���. : ");
			int btn = sc.nextInt();
			
			switch(btn) {
			case 1 : 
			case 2 : 
			case 3 : 
			case 9 : 
			default : System.out.println("���θ޴��� �̵��մϴ�."); return;
			}
		} while(true);
	}
	
	public void updateMemberMenu() {
		do {
			System.out.println("========== ȸ�� ���� ���� ==========");
			System.out.println("1. ��й�ȣ �����ϱ�");
			System.out.println("2. �̸� �����ϱ�");
			System.out.println("3. �̸��� �����ϱ�");
			System.out.println("9. ���θ޴���");
			System.out.println("==============================");
			System.out.print("�޴� ��ȣ�� �Է��ϼ���. : ");
			int btn = sc.nextInt();
			
			switch(btn) {
			case 1 : 
			case 2 : 
			case 3 : 
			case 9 : 
			default : System.out.println("���θ޴��� �̵��մϴ�."); return;
			}
		} while(true);
	}
	
	public void deleteMemberMenu() {
		do {
			System.out.println("========== ȸ�� ���� ���� ==========");
			System.out.println("1. ȸ�� ����");
			System.out.println("2. ��ü ȸ�� ����");
			System.out.println("9. ���θ޴���");
			System.out.println("==============================");
			System.out.print("�޴� ��ȣ�� �Է��ϼ���. : ");
			int btn = sc.nextInt();
			
			switch(btn) {
			case 1 : 
			case 2 : 
			case 9 : 
			default : System.out.println("���θ޴��� �̵��մϴ�."); return;
			}
		} while(true);
	}

}

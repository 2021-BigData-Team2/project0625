package asdf;
//���� - �̸�, ����, ����,����, ����, ���
//get /set �Լ�, ���� ���, ��հ�� �Լ�(�Ҽ��� ���� 2�ڸ����� �ݿø�)
// Ŭ���� ���ο� �ִ� �����͸� display �Լ��� ���
// main class���� 
//Ŭ���� �迭�� ����� 5���� �����͸� �Է�
//���� , ����, ������ �� �հ�� �� ��յ� ���ض�
//���κ� �հ踦 ���Ͽ� ���հ踦 ���϶�
//�� ����� ���ؼ� ����ض�

import java.util.*;

public class hw {

	public static void main(String[] args) {
		Manager s = new Manager(); 
		Scanner scan = new Scanner(System.in); 
		int count; 
		boolean chk = false; 
		Manager[] arr = new Manager[6]; 
		for(int i =0; i<arr.length; i++) { 
			arr[i] = new Manager(); 
		} //�迭 �ʱ�ȭ
		
		while(true) {
			System.out.println("�޴��Է� || 1. �Է� 2. ��� 3. ���� ||");
			int order=scan.nextInt();
			if(order==1&&chk==false) {
				for(int i=1;i<arr.length;i++) {
					System.out.print("�̸�: ");
					arr[i].setName(scan.next());
					System.out.print("����: ");
					arr[i].setKor(scan.nextInt());
					System.out.print("����: ");
					arr[i].setMath(scan.nextInt());
					System.out.print("����: ");
					arr[i].setEng(scan.nextInt());
					System.out.print("========"+i+"��° �Է� �Ϸ�=======\n");
				}
				chk=true;
			}else if(order==1&& chk==true) {
				System.out.println("�Էµ� �����Ͱ� �����մϴ�. ��¹ٶ��ϴ�.");
			}else if(order==2&&chk==true) {
				for(int i=1;i<arr.length;i++) {
					int total=0;
					total=arr[i].getEng()+arr[i].getKor()+arr[i].getMath();
					float avg=total/3;
					int ban_total=0;
					float ban_avg=0;
					ban_total += total;
					ban_avg += avg /5;
					
					System.out.println("�̸� : "+arr[i].getName());
					System.out.println("���� : "+arr[i].getKor());
					System.out.println("���� : "+arr[i].getMath());
					System.out.println("���� : "+arr[i].getEng());
					System.out.println("���� : "+total);
					System.out.println("��� : "+(int)avg);
					System.out.print("========"+i+"��° ��� �Ϸ�=======\n");
					System.out.println("�� ���� : "+ban_total);
					System.out.println("�� ���: " +ban_avg);
				}
				chk=false;
			}else if(order==2 && chk ==false) System.out.println("�Էµ� �����Ͱ� �����ϴ�. �Է��ϼ���");
			else if(order==3) {
				System.out.println("����");
				break;
			}
		}
	}

}
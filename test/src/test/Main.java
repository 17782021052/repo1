package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Data[] students = new Data[5];
        students[0] = new Data("1", "1001", "����");
        students[1] = new Data("2", "1002", "����");
        students[2] = new Data("3", "1003", "����");
        students[3] = new Data("4", "1004", "����");
        students[4] = new Data("5", "1005", "����");

        System.out.println("ѧ������:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("���Ϊ"+(i+1)+"��ѧ�������ǣ�"+students[i].getName()+"      ѧ���ǣ�"+students[i].getNum());
        }

        Scanner scanner = new Scanner(System.in);        
        System.out.print("������Ҫ����ѧ�����:");
        String stuID = scanner.next();
        boolean flag = true;
        for (int i = 0; i < students.length; i++) {
            if(students[i].getId() .equals(stuID)){
                System.out.println("�ɹ��ҵ���ѧ�����ݣ�");
                System.out.println("ѧ��:"+students[i].getNum()+"\t"+"����:"+students[i].getName());
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("��ѧ�����ݲ�����!");
        }
	}
}

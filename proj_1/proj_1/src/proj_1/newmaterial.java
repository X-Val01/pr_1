package proj_1;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import javax.swing.text.StyledEditorKit.ForegroundAction;
import java.util.Iterator;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.lang.Math;

public class newmaterial {
	int j;
	public String[] shapka;
	public String r;
	public  String a;
	public  String titlone;
	public  String titltwo;
	ArrayList<String> tabl;
	ArrayList<String> titlarray;
	String[] mas;
	
	
	public   newmaterial() {
		shapka =  new String[6];
		j=0;	
		tabl = new ArrayList<>();
		titlarray = new ArrayList<>();
		mas = new String[6];
	}
	
	public void shapka() throws IOException  {
		
		
		shapka[0] = "�   ";	
		shapka[1] = "���. �   ";	
		shapka[2] = "������������ ���������   ";	
		shapka[3] = " ���-��   ";	
		shapka[4] = " ���� �� ��.   ";	
		shapka[5] = "�����";
		this.titlone = "1  " + "   2   " 
			+ "              3            " + "    4      "
			+"    5       " + "     6  "; 		
		this.titltwo = shapka[0]  + shapka[1]  + shapka[2] 
				+  shapka[3]  + shapka[4]  + shapka[5] ;
		
	
		
		try {
			File read = new File("C:\\Users\\X-Val\\eclipse-workspace"
					+ "\\Programmsklad\\Sklad\\src\\text.txt");
			BufferedReader reader = new BufferedReader(new FileReader(read));
		
			
				
			for (int o = 0; o >=0; o++) {
				String str;
				if((str = reader.readLine()) != null ) {
					
					this.titlarray.add(str);
					System.out.println(str);
					
				}
				else {
					break;
				}
			}
				
			
		
		}
		catch(Exception e) {
			System.out.println("�����-�� ����");
		}
		
	}
	
public void newmat() throws Exception {
	
	Scanner in = new Scanner(System.in);
	
	
	
	for (  int j = 1 ; j >0; j++) {
		System.out.println("�������� ����� �������� - 1");
		System.out.println("����� � ������� ���� - 2");
		System.out.println("����������� ��������� � ������� - 3");
		System.out.println("�������� �������� - 4");
		System.out.println("������� �������� - 5");

		String str2 = in.nextLine();
			
				if(str2.compareTo("1") == 0) {
				System.out.println("������� ������");
				qwerty();
				continue;
				
				}
				if(str2.compareTo("3") == 0) {
					shapka();
					continue;						
				}
				
				if(str2.compareTo("4") == 0) {
					change();
					continue;						
				}
				
				if(str2.compareTo("5") == 0) {
					deleteone();
					continue;
				}	
				
				if(str2.compareTo("2") == 0) {
				break;
				}
				
				else {
				System.out.println("������� ���������� ����� "
						+ "������� ������� ���������");	
				newmat();
				}
	}
}
	public void qwerty() throws Exception {
		
		Scanner in = new Scanner(System.in);
		
		
		
		
		
		for (int i = 0; i < 6;i++) {
			System.out.println("������� ������ � ������� �-" + (i+1));
			System.out.println("���� ������� ����� ������� - 01  "
					+ "��������� �� ��� ����� ������� 02 " );
			String str = in.nextLine();
			String str1 =str;
			str1 = str1.toUpperCase();
			this.mas[i] = str;
			
			
			if(str.compareTo("01") == 0) {
			break;
			}
			
			if(str.compareTo("02") == 0) {
			i--;
			continue;				
			}
		}
		tabl.add(this.mas[0] +"    " + this.mas[1] + "             " + this.mas[2] 
				+ "              " + this.mas[3]  + "     "+ this.mas[4]           
								+ "      " + mas[5]);
		try {
			PrintWriter fail = new PrintWriter(new BufferedWriter(new FileWriter
					("C:\\Users\\X-Val\\eclipse-workspace"
							+ "\\Programmsklad\\Sklad\\src\\text.txt", true)));
			
			fail.println(tabl.get(j));
			
			this.j++;
			fail.close();
				} catch(Exception e ) {
					System.out.println("Error");
					
				}
		
			 
			
		System.out.println(mas[0] +"    " + mas[1] + "             " + mas[2] 
		+ "              " + mas[3]  + "     "+ mas[4]           
						+ "      " + mas[5]);	
		
		;
		}

	public void  change() throws Exception {
		Scanner in = new Scanner(System.in);
		System.out.println("������  �� �� �������� ������? �� ��� ���");
		String[] mat = new String[6];
		
		String str1 ="4";
		while (str1.compareTo("���") != 0 || str1.compareTo("��") != 0) {
			str1 = in.nextLine();
			str1=str1.toUpperCase();
			if(str1.compareTo("��") == 0) {				
				break;
			}
			
			if(str1.compareTo("���") == 0) {
				materials1_2 obj = new materials1_2();
				obj.window();
				break;
			}
			
			else {
				System.out.println("������� ����������"
						+ " �� ��� ���");
				continue;  
			} 
		}
		
		BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\X-Val\\eclipse-workspace"
				+ "\\Programmsklad\\Sklad\\src\\text.txt")));
		
		System.out.print("������� ����� ������  ���������,"
				+ " ������� ������� ��������");

		try {
			
			String str;
		
			tabl.clear();
			
			while((str=reader.readLine()) != null) {		// ������ ������ � ����� � ArrayList 													//� ������ ������ ����� � ����(��������)
				tabl.add(str);
			}
			
			try {				
				String delstring;
				int intdelstr;
				while(true) {
				intdelstr = Integer.parseInt(in.nextLine());
				intdelstr--;
				if(intdelstr>=0 && intdelstr<= tabl.size()) {
					break;
				}
				else {
					System.out.println("0 < Enter value <= "+ tabl.size() );
				}
				
				}
				String[] mas = new String[6];
				
				for (int i=0; i <mas.length;i++) {
					System.out.println("������� ������ � ������� �-" + (i+1));
					System.out.println("���� ������� ����� ������� - 01  "
							+ "��������� �� ��� ����� ������� 02 " );
					 String strq = in.nextLine();
					 
					mas[i] = strq;
					
					
					if(strq.compareTo("01") == 0) {
					break;
					}
					
					if(strq.compareTo("02") == 0) {
					i--;
					continue;
					
						
					}
					
					
				}	
				
				tabl.set(intdelstr, mas[0] +"    " + mas[1] + "             " + mas[2] 
						+ "              " + mas[3]  + "     "+ mas[4]           
								+ "      " + mas[5]);
				}catch (Exception e) {
					System.out.println("������� � �������");
					change();					
				}
			
		
			PrintWriter file1 = new PrintWriter(new BufferedWriter(new FileWriter
					("C:\\Users\\X-Val\\eclipse-workspace"
							+ "\\Programmsklad\\Sklad\\src\\text.txt")));
						
			file1.println("");
				
		} 	catch (Exception e) {
			}

			try {										// ������ ����� �������� �  ����;
				for (int o = 0; o <tabl.size(); o++) {
					PrintWriter file1 = new PrintWriter(new BufferedWriter(new FileWriter
							("C:\\Users\\X-Val\\eclipse-workspace\\Programmsklad"
									+ "\\Sklad\\src\\text.txt",true)));
					file1.println(tabl.get(o));
					file1.close();
				}					
			} catch(Exception e ) {
				System.out.println("Error");																	
				}

		reader.close();
		}
				


		
	
 
	
	
	

	public void deleteone() throws IOException {
		Scanner in = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\X-Val\\eclipse-workspace"
				+ "\\Programmsklad\\Sklad\\src\\text.txt")));
		
		System.out.print("������� ����� ������  ���������,"
				+ " ������� ������� �������");

		try {
			
			String str;
		
			tabl.clear();
			
			while((str=reader.readLine()) != null) {		// ������ ������ � ����� � ArrayList 													//� ������ ������ ����� � ����(��������)
				tabl.add(str);
			}
			
			try {
				String delstring;
				int intdelstr;
				while(true) {
				intdelstr = Integer.parseInt(in.nextLine());
				intdelstr--;
				if(intdelstr>=0 && intdelstr<= tabl.size()) {
					break;
				}
				else {
					System.out.println("0 < Enter value <= "+ tabl.size() );
				}
				
				}
				tabl.remove(intdelstr);
				}catch (Exception e) {
					System.out.println("������� � �������");
					deleteone();					
				}
			PrintWriter file1 = new PrintWriter(new BufferedWriter(new FileWriter
					("C:\\Users\\X-Val\\eclipse-workspace"
							+ "\\Programmsklad\\Sklad\\src\\text.txt")));
						
			file1.println("");
				
		} 	catch (Exception e) {
			}

			try {										// ������ ����� �������� �  ����;
				for (int o = 0; o <tabl.size(); o++) {
					PrintWriter file1 = new PrintWriter(new BufferedWriter(new FileWriter
							("C:\\Users\\X-Val\\eclipse-workspace\\Programmsklad"
									+ "\\Sklad\\src\\text.txt",true)));
					file1.println(tabl.get(o));
					file1.close();
				}
					
			} catch(Exception e ) {
				System.out.println("Error");																	
			  }

		reader.close();
		}
	
	
}


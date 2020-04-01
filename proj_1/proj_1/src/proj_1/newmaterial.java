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
		
		
		shapka[0] = "N   ";	
		shapka[1] = "N company;	
		shapka[2] = "Name Material   ";	
		shapka[3] = " Quantity   ";	
		shapka[4] = " Price.   ";	
		shapka[5] = "Full Price";
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
			System.out.println("Êàêîé-òî Åãîð");
		}
		
	}
	
public void newmat() throws Exception {
	
	Scanner in = new Scanner(System.in);
	
	
	
	for (  int j = 1 ; j >0; j++) {
		System.out.println("Add  new material - 1");
		System.out.println("Back to first menu - 2");
		System.out.println("Show Table - 3");
		System.out.println("Change material - 4");
		System.out.println("Delete Material - 5");

		String str2 = in.nextLine();
			
				if(str2.compareTo("1") == 0) {
				System.out.println("Ââåäèòå äàííûå");
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
				System.out.println("Write correct data");	
				newmat();
				}
	}
}
	public void qwerty() throws Exception {
		
		Scanner in = new Scanner(System.in);
		
		
		
		
		
		for (int i = 0; i < 6;i++) {
			System.out.println("Write data in column" + (i+1));
			System.out.println("Cancel - 01  "
					+ "Return on one step back 02 " );
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
		System.out.println("Write number material for change");
		String[] mat = new String[6];
		
		String str1 ="4";
		while (str1.compareTo("ÍÅÒ") != 0 || str1.compareTo("ÄÀ") != 0) {
			str1 = in.nextLine();
			str1=str1.toUpperCase();
			if(str1.compareTo("ÄÀ") == 0) {				
				break;
			}
			
			if(str1.compareTo("ÍÅÒ") == 0) {
				materials1_2 obj = new materials1_2();
				obj.window();
				break;
			}
			
			else {
				System.out.println("Ââåäèòå ïîæàëóéñòà"
						+ " ÄÀ èëè ÍÅÒ");
				continue;  
			} 
		}
		
		BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\X-Val\\eclipse-workspace"
				+ "\\Programmsklad\\Sklad\\src\\text.txt")));
		
		System.out.print("Ââåäèòå íîìåð ñòðîêè  ìàòåðèàëà,"
				+ " êîòîðûé æåëàåòå èçìåíèòü");

		try {
			
			String str;
		
			tabl.clear();
			
			while((str=reader.readLine()) != null) {		// çàïèñü òåêñòà ñ ôàéëà â ArrayList 													//è çàïèñü ïóñòûõ ñòðîê â ôàéë(îò÷èñòêà)
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
					System.out.println("Ââåäèòå ääàíûå â ñòîëáåö ¹-" + (i+1));
					System.out.println("Åñëè æåëàåòå âûéòè ââåäèòå - 01  "
							+ "âåðíóòüñÿ íà øàã íàçàä ââåäèòå 02 " );
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
					System.out.println("Ââåäèòå ¹ öèôðàìè");
					change();					
				}
			
		
			PrintWriter file1 = new PrintWriter(new BufferedWriter(new FileWriter
					("C:\\Users\\X-Val\\eclipse-workspace"
							+ "\\Programmsklad\\Sklad\\src\\text.txt")));
						
			file1.println("");
				
		} 	catch (Exception e) {
			}

			try {										// çàïèñü íîâûõ çíà÷åíèé â  ôàéë;
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
		
		System.out.print("Ââåäèòå íîìåð ñòðîêè  ìàòåðèàëà,"
				+ " êîòîðûé æåëàåòå óäàëèòü");

		try {
			
			String str;
		
			tabl.clear();
			
			while((str=reader.readLine()) != null) {		// çàïèñü òåêñòà ñ ôàéëà â ArrayList 													//è çàïèñü ïóñòûõ ñòðîê â ôàéë(îò÷èñòêà)
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
					System.out.println("Ââåäèòå ¹ öèôðàìè");
					deleteone();					
				}
			PrintWriter file1 = new PrintWriter(new BufferedWriter(new FileWriter
					("C:\\Users\\X-Val\\eclipse-workspace"
							+ "\\Programmsklad\\Sklad\\src\\text.txt")));
						
			file1.println("");
				
		} 	catch (Exception e) {
			}

			try {										// çàïèñü íîâûõ çíà÷åíèé â  ôàéë;
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


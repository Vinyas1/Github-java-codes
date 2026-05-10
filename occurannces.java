package javex;

public class occurannces {

	public static void main(String[] args) {

String s = "bananaapplebanana_mangobanana _apple applebanana";
String ss= "banana";

int index = 0;
int count =0;
while((index=s.indexOf(ss,index))!=-1) {
	count += 1;
	index = index + ss.length();
}

String remaining = s.replaceAll("[a-zA-Z]", " ");
System.out.println(remaining.isEmpty());
System.out.println(remaining.trim());
System.out.println("occcurance of banana is" + count);
	}
	

}

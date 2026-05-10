package javex;
enum Session {MORNING ,EVENING, AFTERNOON, NIGHT};


public class niggahome {
public static void main (String []args) {
	Session[] session = Session.values();
			System.out.println("value of all enum consatnts are");
			for (Session sessions: session)
			{
				System.out.println(sessions);
			}

			String sessionname="MORNING";
Session sessions =Session.valueOf(sessionname);
System.out.println("the vallue or the name " +sessionname+ "is :" +sessions);
int ordinal;
ordinal =sessions. ordinal();
System.out.println("the position of the " +sessions+ "is :" +ordinal );

}


}

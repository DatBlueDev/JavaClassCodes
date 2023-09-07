public class FA1_Intal {
  
  public static void main(String[] args) {
	var LastName = "Intal";
	var FirstName = "Kyle Ashe Tristan";
	var MiddleInitial = "R.";
	var Section = "Electron";
	
	String[] BFFs = {"Liu Jian Cruz", "Angela Rosales", "Ryan De La Paz"};

	var MSG = "According to all known laws\nof aviation,\nthere is no way a bee\nshould be able to fly.";

    System.out.println(LastName + ", " + FirstName + " " + MiddleInitial + "\n");
	
	System.out.println(Section + "\n");

	for (int i = 0; i<=2; i++){
		System.out.println(BFFs[i]);
	}
	
	System.out.println("\n" + MSG);

  }
}
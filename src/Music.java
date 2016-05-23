import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Music {
	Scanner userInput = new Scanner(System.in);
	private final Map<String, String> bandMap = new HashMap<>();
	
	public Music() {
		bandMap.put("pantera", "Phil Anselmo, 'Dimebag Darrell' Abbot, Rex Brown, Vinnie Paul");
		bandMap.put("metallica", "James Hetfield, Lars Ulrich, Kirk Hammett");
		bandMap.put("meshuggah", "Jens Kidman, Fredrik Thordendal, Mårten Hagström, Dick Lövgren, Tomas Haake");
		bandMap.put("lamb of god", "Randy Blythe, Mark Morton, Willie Adler, John Campbell, Chris Adler");
		
		bandMap.put("n.w.a.", "Eazy-E, Ice Cube, Mc Ren. Dr. Dre, DJ Yella");
		bandMap.put("geto boys", "Bushwick Bill, Scarface, Willie D");
		bandMap.put("thug life", "2pac, Big Syke, Mopreme, Stretch" );
		bandMap.put("souls of mischief", "A-Plus, Phesto, Opio, Tajai");
		
		bandMap.put("the chemical brothers", "Tom Rowlands, Ed Simons");
		bandMap.put("faithless", "Maxi Jazz, Sister Bliss, Rollo");
		bandMap.put("dusky", "Alfie Granger-Howell, Nick Harriman" );
		bandMap.put("sash!", "Sascha Lappessen, Ralf Kappmeier, Thomas Lüdke");

	}
	
	String metal = "Metal";
	String rap = "Rap";
	String techno = "Techno";
	
	String genreMetal = ("Pantera, Metallica, Meshuggah, Lamb of God: ");
	String genreRap = ("N.W.A., Geto Boys, Thug Life, Souls of Mischief: ");
	String genreTechno = ("The Chemical Brothers, Faithless, Dusky, Sash!: ");
	
	
	public static void main(String args[]){	
		Music music = new Music();
		music.init();

	}
	
	private void init() {
		System.out.println("The aim of this is to display the members of a musical artist/band.");
		System.out.println("Please enter one of the following genres.");
		while(true) {
			System.out.print("Metal, Rap, Techno: ");
			switch(userInput.nextLine().toLowerCase()) {
			case "metal":
				handleMetalBand();
				break;
			case "rap":	
				handleRapBand();
				break;
			case "techno":	
				handleTechnoBand();
				break;
			default:
				System.out.println("Invalid entry... please select again.");
			}
		}
	}
	
	
	private void handleMetalBand() {
		System.out.println("Choose from a band; ");
		System.out.print(genreMetal);
		String selection = "";
		selection = userInput.nextLine();
		String members = bandMap.get(selection.toLowerCase());
		System.out.println("Members: " + members);
	}	
	
	private void handleRapBand(){
		System.out.println("Choose from a band; ");
		System.out.print(genreRap);
		String selection = "";
		selection = userInput.nextLine();
		String members = bandMap.get(selection.toLowerCase());
		System.out.println("Members: " + members);
	}

	private void handleTechnoBand(){
		System.out.println("Choose from a band; ");
		System.out.print(genreTechno);
		String selection = "";
		selection = userInput.nextLine();
		String members = bandMap.get(selection.toLowerCase());
		System.out.println("Members: " + members);
}
	
}

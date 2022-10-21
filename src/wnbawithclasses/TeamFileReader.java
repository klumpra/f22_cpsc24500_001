package wnbawithclasses;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class TeamFileReader {
	public static ArrayList<Team> readTeamsFromFile(String fname) {
		try {
			ArrayList<Team> teams = new ArrayList<Team>();  // the result I'll return
			Scanner fsc = new Scanner(new File(fname));
			String line, name;
			int wins, losses;
			String[] parts;
			Team team;
			while (fsc.hasNextLine()) {
				line = fsc.nextLine().trim();
				parts = line.split("\t");
				name = parts[0];
				wins = Integer.parseInt(parts[1]);
				losses = Integer.parseInt(parts[2]);
				team = new Team(name,wins,losses);
				teams.add(team);
			}
			fsc.close();
			return teams;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;    // in java, null means "non-existent object"
		}
	}
}

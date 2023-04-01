import java.util.*;

class Program {
  private static final int HOME_TEAM_WON = 1;
  private static final int POINTS = 3;

  public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        String currBestTeam = "";
        Map<String, Integer> scores = new HashMap<>();
        scores.put(currBestTeam, 0);

        for (int i = 0; i < competitions.size(); i++) {
            List<String> match = competitions.get(i);
            String homeTeam = match.get(0);
            String awayTeam = match.get(1);
            int result = results.get(i);
            String winningTeam = result == HOME_TEAM_WON ? homeTeam : awayTeam;
          
            scores.put(winningTeam, scores.getOrDefault(winningTeam, 0) + POINTS);
            if (scores.get(winningTeam) > scores.get(currBestTeam)) {
                currBestTeam = winningTeam;
            }
        }
        return currBestTeam;
    }
}
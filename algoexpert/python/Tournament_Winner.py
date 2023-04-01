from collections import defaultdict
HOME_TEAM_WON = 1
POINTS = 3

def tournamentWinner(competitions, results):
    currBestTeam = ''
    scores = defaultdict(int)
    scores[currBestTeam] = 0

    for i in range(len(competitions)):
        homeTeam, awayTeam = competitions[i]
        result = results[i]
        winningTeam = homeTeam if result == HOME_TEAM_WON else awayTeam

        scores[winningTeam] += POINTS

        if scores[winningTeam] > scores[currBestTeam]:
            currBestTeam = winningTeam

    return currBestTeam
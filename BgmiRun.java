public class BgmiRun {
    public static void main(String[] args) {
        System.out.println("Main started");
        Bgmi.containsLobby();
        Lobby.containsMap();
        Maps.containsItems();
        Fight.fightForSurvival();
        ChickenDinner.chickenDinner();
        System.out.println("Main ended");
    }
}

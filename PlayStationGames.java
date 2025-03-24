public class PlayStationGames{
   static String games[]= { "God of War", "The Last of Us", "Uncharted", "Bloodborne", "Horizon Zero Dawn", "Spider-Man", "Ghost of Tsushima", "Ratchet & Clank", "Gran Turismo", "Demon's Souls", "Final Fantasy VII Remake", "Persona 5", "Shadow of the Colossus", "Death Stranding", "Days Gone", "Infamous Second Son", "Yakuza: Like a Dragon", "Resident Evil Village", "Cyberpunk 2077", "Nioh 2", "Far Cry 6", "Mortal Kombat 11", "Red Dead Redemption 2", "Dark Souls III", "Sekiro: Shadows Die Twice", "Call of Duty: Modern Warfare", "Battlefield V", "Assassin's Creed Valhalla", "Watch Dogs: Legion", "FIFA 22", "NBA 2K22", "Hitman 3", "Control", "Doom Eternal", "Overwatch", "Minecraft", "Genshin Impact", "Fortnite", "Apex Legends", "Rocket League" };
    public static void main(String[] args) {
        System.out.println("main started");
        gameName();
        System.out.println("main ended");
        
    }
    public static void gameName(){
        System.out.println("Start of game name");
        for(String name : games){
        
        System.out.println("The games names is "+name);
        }
        System.out.println("end of game names");
    }
}
// Write a Java program to create a class called "MusicLibrary" with a collection of songs and methods to add and remove songs, and to play a random song.
import java.util.ArrayList;
import java.util.Random;
class MusicLibrary{
    ArrayList<Song> playlist = new ArrayList<>();
    public void addSong(Song s){
        playlist.add(s);
    }
    public void removeSong(Song s){
        playlist.remove(s);
    }
    public void displayAllSong(){
        System.out.println("My playList : ");
        for(Song s : playlist){
            s.displaySong();
        }
    }

    public void playRandomSong(){
        Random random = new Random();
        int randomNum = random.nextInt(playlist.size())+1;
        if(randomNum < playlist.size()){
            System.out.println("Song played...."+ playlist.get(randomNum).getSongName());
        }
        else System.out.println("Random number is: " + randomNum);
    }
}
class Song{
    private String name;
    private String singer;
    private double duration;
    public Song(String name, String singer, double duration){
        this.name = name;
        this.singer = singer;
        this.duration = duration;
    }
    public void displaySong(){
        System.out.println("Name = "+ this.name + " Singer = "+ this.singer+" Duration = "+ this.duration);
    }
    public String getSongName(){
        return this.name;
    }
}
class Test{
    public static void main(String args[]){
        Song s1 = new Song("Humsafar", "khushi sahu", 3.45);
        Song s2 = new Song("Preety little", "Anisha patel", 2.50);
        Song s3 = new Song("Pasori", "Sakshi Jain", 5.33);
        Song s4 = new Song("Aavan javan", "Arijit Singh", 3.45);
        Song s5 = new Song("waving flag", "I don't know", 2.50);
        Song s6 = new Song("Mercy", "Badshah", 5.03);


        MusicLibrary m = new MusicLibrary();
        m.addSong(s1);
        m.displayAllSong();
        m.addSong(s2);
        m.addSong(s3);
        m.displayAllSong();

        m.removeSong(s3);
        m.displayAllSong();
        
        m.addSong(s4);
        m.addSong(s5);
        m.addSong(s6);

        m.playRandomSong();
}
}
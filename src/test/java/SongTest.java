import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class SongTest {

    public static List<Song> songList = new ArrayList<Song>();
    public static List<Singer> singerList = new ArrayList<Singer>();

    @Test
    public void addSong(){

        Singer Singer1 = new Singer("Rammstein" );
        Singer Singer2 = new Singer("Hayko Cepkin" );

        singerList.add( Singer1 );
        singerList.add( Singer2 );

    Song song1 = new Song("Du hast", 350);
    Song song2 = new Song("İch will",210);
    Song song3 = new Song("Rammstein",123);
    Song song4 = new Song("One dich",343);
    Song song5 = new Song("Main land", 215);
    Song song6 = new Song("Sonne", 214);


    songList.add(song1);
    songList.add(song2);
    songList.add(song3);
    songList.add(song4);
    songList.add(song5);
    songList.add(song6);

        Singer1.songList.add( song1 );
        Singer1.songList.add( song2 );
        Singer1.songList.add( song3 );
        Singer2.songList.add( song4 );
        Singer2.songList.add( song5 );
        Singer2.songList.add( song6 );

        for (Singer singer : singerList) {
            System.out.println( singer.SingerName + "'nin Şarkı Listesi:" );
            for (Song song : singer.songList) {
                System.out.println( song.SongName );
            }
        }
}
}

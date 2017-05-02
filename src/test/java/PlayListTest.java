import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class PlayListTest {

    public static List<Song> songList = new ArrayList<Song>();
    public static List<User> userList = new ArrayList<User>();


    @Test
    public void PlayListTest() {

        User user = new User(  "Halil", "cap" );

        Song song1 = new Song(  "Du hast", 350 );
        Song song2 = new Song( "İch will", 254 );
        Song song3 = new Song( "Rammstein", 123 );
        Song song4 = new Song(  "One dich", 343 );
        Song song5 = new Song(  "Main land", 440 );
        Song song6 = new Song(  "Sonne", 541 );

        PlayList playListT = new PlayList(  new ArrayList<Song>(), "Benim Listem:" );

        songList.add( song1 );
        songList.add( song2 );
        songList.add( song3 );
        songList.add( song4 );
        songList.add( song5 );
        songList.add( song6 );

        playListT.SongList.add( song1 );
        playListT.SongList.add( song2 );
        playListT.SongList.add( song3 );
        playListT.SongList.add( song4 );
        playListT.SongList.add( song5 );
        playListT.SongList.add( song6 );

        user.playLists.add( playListT );

        userList.add( user );

        for (User useer : userList) {
            System.out.println( PlayList.Name);
            System.out.println( useer.UserName + " İs Play List:  " );
          for(Song pp: songList){
              System.out.println( pp.SongName );
          }
            System.out.println( "Toplam süre: "+Song.totalDuration+" Dakika");
        }
    }

}
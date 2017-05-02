import org.junit.After;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class SingerTest {

    public static List<Singer> singerList = new ArrayList<Singer>();
    public static List<Album> albumList = new ArrayList<Album>();
    @Test
    public void singerTest(){
        Singer Singer1 = new Singer(  "Hadise" );
        Singer Singer2 = new Singer(  "Skrillex" );

        singerList.add( Singer1 );
        singerList.add( Singer2 );


        Album album1 = new Album( 1, "LALA" );
        Album album2 = new Album( 2, "ZABUBU" );


        albumList.add( album1 );
        albumList.add( album2 );

        Singer1.albumList.add( album1 );
        Singer2.albumList.add( album2 );

        for (Singer singer : singerList) {
            System.out.println( singer.SingerName + " Album List:" );
            for (Album album : singer.albumList) {
                System.out.println( album.AlbumName + "\n");
            }
        }

        boolean search = Singer.searchSingerByName( "hadise" );
        assertTrue(search = true);
        System.out.print( "Bulundu" );
    }

}
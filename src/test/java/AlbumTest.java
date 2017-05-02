import org.junit.After;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class AlbumTest {
    public static List<Album> albumList = new ArrayList<Album>();
    public static List<Singer> singerList = new ArrayList<Singer>();


    @Test
    public void singerAlbumTest() {
        Singer Singer1 = new Singer(  "Rammstein" );
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
    }
    @After
    public void findAllAlbums(){
        System.out.println("Album List:");
        for (Album album:albumList){
            System.out.println("Album Name: "+album.AlbumName + "\n");
        }
    }
    @After
    public void searchAlbumBy(){
        boolean search = Album.searchAlbumByName( "LALA" );
        assertTrue(search = true);
        System.out.print( "Bulundu" );
    }
}


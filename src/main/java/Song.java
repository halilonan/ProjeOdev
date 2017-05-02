import java.time.Duration;
import java.util.ArrayList;

public class Song {



    public Song( String songName,int duration) {

        SongName = songName;
        this.Duration = duration;
        totalDuration += (duration/60);
    }

    public String SongName;
    public int Duration;
    public static int totalDuration;

    public  static boolean totalDuration (){
        System.out.print( totalDuration );
        return Boolean.parseBoolean( null );
    }
}

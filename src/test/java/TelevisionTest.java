import Jackson.Kyle.ZCWLivingRoom.Television;
import org.junit.Test;
import static org.junit.Assert.*;

public class TelevisionTest {
    @Test
    public void getVolumeTest(){
        Television tv = new Television();


        int expectedValue = 0 ;

        int actualvalue = tv.getVolume();
        assertEquals(expectedValue, actualvalue);

    }


}

import org.apache.hadoop.io.Writable;


public class FlightWritable implements Writable {
    private int DEST_AIRPORT_ID;
    private float ARR_DELAY;
    private float AIR_TIME;
    private float CANCELLED;

    public FlightWritable() {}
    

}

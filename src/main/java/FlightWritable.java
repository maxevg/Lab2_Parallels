import org.apache.hadoop.io.Writable;


public class FlightWritable implements Writable {
    private int DEST_AIRPORT_ID;
    private float ARR_DELAY;
    private float AIR_TIME;
    private float CANCELLED;

    public FlightWritable() {}

    public FlightWritable(int DEST_AIRPORT_ID, float ARR_DELAY, float AIR_TIME, float CANCELLED) {
        this.DEST_AIRPORT_ID = DEST_AIRPORT_ID;
        this.ARR_DELAY = ARR_DELAY;
        this.AIR_TIME = AIR_TIME;
        this.CANCELLED = CANCELLED;
    }



}

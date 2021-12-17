import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class FlightWritableComparable implements WritableComparable {
    private int AEROPORT_ID;
    private int INDENTITY;

    public FlightWritableComparable() {}

    public FlightWritableComparable(int AEROPORT_ID, int INDENTITY) {
        this.AEROPORT_ID = AEROPORT_ID;
        this.INDENTITY = INDENTITY;
    }

    
}

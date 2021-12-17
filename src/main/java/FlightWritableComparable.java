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

    public void write(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.AEROPORT_ID);
        dataOutput.writeInt(this.INDENTITY);
    }

    public void readFields(DataInput dataInput) throws IOException {
        this.AEROPORT_ID = dataInput.readInt();
        this.INDENTITY = dataInput.readInt();
    }
}

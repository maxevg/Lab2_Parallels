import org.apache.hadoop.io.WritableComparator;

public class FlightGroupingComparatorClass extends WritableComparator {
    protected  FlightGroupingComparatorClass() {
        super(FlightWritableComparable.class, true);
    }
}

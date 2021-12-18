import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class FlightReducer extends Reducer<FlightWritableComparable, Text, Text, Text> {
    protected void reduce(FlightWritableComparable key, Iterable<Text> values, Context context)
}

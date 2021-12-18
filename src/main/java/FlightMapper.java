import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class FlightMapper extends Mapper<LongWritable, Text, FlightWritableComparable, Text> {


    @Override
    public void map(Text key, TupleWritable value,
                    OutputCollector<Text, Text> output,
                    Reporter reporter) throws IOException {
        Text call = (Text) value.get(0);
        Text system = (Text) value.get(1);
        output.collect(call, system);
    }
}
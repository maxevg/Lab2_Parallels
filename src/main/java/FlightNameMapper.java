import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.LongWritable;


public class FlightNameMapper extends Mapper<LongWritable, Text, FlightWritableComparable, Text> {

}

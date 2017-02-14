package ch09.Exercises;
/**
 * Exercise-9.16
 * @author LuckyGong
 *
 */
import java.nio.*;
import java.io.IOException;
import java.util.*;
class RandomChar{
	private static Random rand = new Random(47);
	public char next(){return (char)rand.nextInt(128);}
}

public class AdapterRandomChar extends RandomChar implements Readable{
	private int count;
	public AdapterRandomChar(char count){this.count = count;}
	@Override
	public int read(CharBuffer cb) throws IOException {
		if(count == 0) return -1;
		String result = Character.toString(next()) + " ";
		cb.append(result);
		return result.length();
	}
	
}
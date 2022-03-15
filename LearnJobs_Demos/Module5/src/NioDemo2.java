import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

public class NioDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		bufferChannelImpl();

	}

	private static void bufferChannelImpl() throws IOException {
		// TODO Auto-generated method stub
		FileInputStream input=new FileInputStream("first.txt");
		ReadableByteChannel source=input.getChannel();
		FileOutputStream output=new FileOutputStream("second.txt");
		WritableByteChannel destination=output.getChannel();
		
		ByteBuffer buffer=ByteBuffer.allocateDirect(20*1024);
		
		while(source.read(buffer)!=-1) {
			buffer.flip();
			while(buffer.hasRemaining()) {
				destination.write(buffer);
			}
		}
		
	}

}

package work_with_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx1 {
	
	public static void main(String[] args) {
		try(RandomAccessFile file = new RandomAccessFile("test10.txt", "rw");
			FileChannel channel = file.getChannel()) {
			
			ByteBuffer buffer = ByteBuffer.allocate(25);
			StringBuilder stih = new StringBuilder();
			int byteRead = channel.read(buffer);
			while (byteRead > 0) {
				System.out.println("Read " + byteRead);
				buffer.flip();
				while (buffer.hasRemaining()) {
					stih.append((char) buffer.get());
				}
				buffer.clear();
				byteRead = channel.read(buffer);
			}
			System.out.println(stih);
			
			String text = "\n“There are only two ways to live your life." +
			        " One is as though nothing is a miracle." +
			        " The other is as though everything is a miracle.”\n";
//			ByteBuffer buffer1 = ByteBuffer.allocate(text.getBytes().length);
//			buffer1.put(text.getBytes());
//			buffer1.flip();
//			channel.write(buffer1);
			
			ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes());
			channel.write(buffer2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

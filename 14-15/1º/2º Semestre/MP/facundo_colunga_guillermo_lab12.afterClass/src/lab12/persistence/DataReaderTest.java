package lab12.persistence;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DataReaderTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void isGZIPTest() {
		assertEquals(true, DataReader.isGZIP("file.txt.gz"));
		assertEquals(true, DataReader.isGZIP("file.gz"));
		assertEquals(false, DataReader.isGZIP("file.txt"));
		assertEquals(false, DataReader.isGZIP("gzipfile.txt"));
	}

}

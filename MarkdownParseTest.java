import static org.junit.Assert.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void testfilemd()throws IOException{
		Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(contents));
    }
    @Test
    public void testmd2()throws IOException{
		Path fileName = Path.of("test2.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of("link1.html"), MarkdownParse.getLinks(contents));
    }
    @Test
    public void testmd3()throws IOException{
		Path fileName = Path.of("test3.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }
    
    @Test
    public void testfilemd2()throws IOException{
		Path fileName = Path.of("test-file2.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(contents));
    }
    @Test
    public void testfilemd3()throws IOException{
		Path fileName = Path.of("test-file3.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }
    @Test
    public void testfilemd4()throws IOException{
		Path fileName = Path.of("test-file4.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }
    @Test
    public void testfilemd5()throws IOException{
		Path fileName = Path.of("test-file5.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }
    @Test
    public void testfilemd6()throws IOException{
		Path fileName = Path.of("test-file5.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }
    @Test
    public void testfilemd7()throws IOException{
		Path fileName = Path.of("test-file7.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }
    @Test
    public void testfilemd8()throws IOException{
		Path fileName = Path.of("test-file8.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of("a link on the first line"), MarkdownParse.getLinks(contents));
        assertEquals(List.of(" "), MarkdownParse.getLinks(contents));
    }
}
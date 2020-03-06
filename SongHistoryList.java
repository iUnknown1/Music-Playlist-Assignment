/** Class: CISC 3130

 * Section: MY9

 * EmplId: 23583219

 * Name: Bryan Brathwaite
 
 * Professor Katherine Chuang

*/
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
     
     public MyQueue extends LinkedList
     {
     public MyQueue(String filename)
     {
     // reading CSV files
     FileReader filereader = new FileReader(file);
     CSVParser parser = new CSVParserBuilder().withSeparator(';').build();
     CSVReader csvReader = new CSVReaderBuilder(filereader).withCSVParser(parser).build();
     // for reading the file in a list
     List<String[]> allData = csvReader.readAll();
     Queue<Place> queue = new LinkedList<>(allData);
     }
     }
     public class SongHistoryList
     {
     public static void main(String args[])
     {
     LinkedList object = new LinkedList();
     for(i=0;i<queue.length;i++)
     {
     object.add(i); // for adding the latest songs
     System.out.println("Songs: " + object);
     }
     }
     }
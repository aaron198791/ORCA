package bank.project;
import java.util.*;
import java.lang.*;
import java.net.*;
import java.io.*;
/* This will import stock information from online, and determine if a stock is worth buying*/
public class Read_Online
{

	public void connect(String url) {
        try {
            URL myURL = new URL("http://" + url + ".com");
            URLConnection myURLConnection = myURL.openConnection();

            BufferedReader br = new BufferedReader(new InputStreamReader(myURL.openStream()));

            String line;

            StringBuilder sb = new StringBuilder();
            String tagOpen = "<title>";
            String tagClose = "</title>";
            while ((line = br.readLine()) != null) {

                sb.append(line);
                sb.append(System.lineSeparator());
                int begin = line.indexOf(tagOpen) + tagOpen.length();
                int end = line.indexOf(tagClose);

                System.out.println(line.substring(begin, end));
            }

           // System.out.println(sb);
           // System.out.println(content);



        }
        catch (MalformedURLException e)
        {
            System.out.println("Couldn't Connect to the Internet");
        }
        catch (IOException e) {
            System.out.println("Cannot Connect to Internet");
        }
        }
    }


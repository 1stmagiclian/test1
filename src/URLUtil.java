import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class URLUtil {

       public static String getHtml(String urlString) {
           try {
               StringBuffer html = new StringBuffer();
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            InputStreamReader isr = new InputStreamReader(conn.getInputStream());
            BufferedReader br = new BufferedReader(isr);
            String temp;
            while ((temp = br.readLine()) != null) {
                html.append(temp).append("\n");
                }
             br.close();
            isr.close();
            return html.toString();
            } catch (Exception e) {
            e.printStackTrace();
            return null;
            }
        }
            public static void main(String[] args) {
        System.out.println(URLUtil.getHtml("http://www.163.com"));
        }
 }
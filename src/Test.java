/**
 * Created by Dobre on 30.11.2015.
 */
import java.io.*;
public class Test


{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        System.out.println(age);

    }

}

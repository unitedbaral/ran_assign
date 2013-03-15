/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assign;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ranjan
 */
public class wordCounter {

    public static void main(String[] args) throws FileNotFoundException, IOException{
        Map<String, Integer> m = new HashMap<>();
        
        FileInputStream fstream = new FileInputStream("example.txt");
        // Get the object of DataInputStream
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strLine;
        //Read File Line By Line
        while ((strLine = br.readLine()) != null) {
            String[] stringHolder = strLine.split("[\\W]");
            for (String a : stringHolder) {
            Integer freq = m.get(a);
            m.put(a, (freq == null) ? 1 : freq + 1);
        }
               
        System.out.println(m.size());
        System.out.println(m);
    }
    
}
}

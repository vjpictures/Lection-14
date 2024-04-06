package task13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) {

    }

    public static CosmicBody thePlanet;


    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        String s= null;
        try {
            s = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (s.equals(CosmicBody.SUN)){
            thePlanet=Sun.getInstance();
        }else {
            if (s.equals(CosmicBody.MOON)){
                thePlanet= Moon.getInstance();
            }else {
                if (s.equals(CosmicBody.EARTH)){
                    thePlanet= Earth.getInstance();
                }else thePlanet=null;

            }}}
}

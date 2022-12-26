package streams;


import mapCourse.Location;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner locScanner=new Scanner(System.in);
        Scanner exeScanner=new Scanner(System.in);

        ArrayList<Integer> allPossibleLocations=new ArrayList<>();


        allPossibleLocations.add(1);
        allPossibleLocations.add(2);
        allPossibleLocations.add(3);
        allPossibleLocations.add(4);
        allPossibleLocations.add(5);

        Map<Integer, Location> locations= new HashMap<>();
        Map<String,Integer> roadExits=new HashMap<>();
        Map<String,Integer> hillExits=new HashMap<>();
        Map<String,Integer> builddingExits=new HashMap<>();
        Map<String,Integer> forrestExits=new HashMap<>();
        Map<String,Integer> valleyExits=new HashMap<>();

        // road exits

        roadExits.put("n",5);
        roadExits.put("w",2);
        roadExits.put("e",3);
        roadExits.put("s",4);
        // road location
        Location roadLocation=new Location(1,"Road ",roadExits);
        //hill exits
        hillExits.put("n",5);
        //hill location
        Location hillLocation=new Location(2,"Hill ",hillExits);
        // buildding exits
        builddingExits.put("w",1);
        //building location
        Location builldingLocation =new Location(3,"Buildding",builddingExits);
        //forest exits
        forrestExits.put("s",1);
        forrestExits.put("w",2);
        //forest location
        Location forrestLocation=new Location(5,"Forrest",forrestExits);
        //valley exits
        valleyExits.put("n",1);
        valleyExits.put("w",2);
        // valley location
        Location valleyLocation=new Location(4,"Valley",valleyExits);

        // location map
        locations.put(1,roadLocation);
        locations.put(2,hillLocation);
        locations.put(3,builldingLocation);
        locations.put(4,valleyLocation);
        locations.put(5,forrestLocation);

        Integer loc=1;
        String  ex="n";
        FileWriter locationFile = null;
        try {
            locationFile = new FileWriter("streamLoc.txt");
            for (Integer loca:locations.keySet()) {

                locationFile.write("\n"+locations.get(loca).getLocationId()+" : "+locations.get(loca).getDescription());
            }
            locationFile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

package nl.bioinf.nomi.wis.hr_zones;

import java.util.ArrayList;
import java.util.List;

public class HeartRateZonesCalculator {

    public static List<String> calculateHeartrateZones(int maximumHeartRate) {
        List<String> zones = new ArrayList<>();

        int zone0 = (int)(0.5 * maximumHeartRate);
        zones.add("zone 0: 0-" + zone0 + "\n");

        int zone1 = (int)(0.6 * maximumHeartRate);
        zones.add("zone 1: " + (zone0 + 1) + "-" + zone1 + "\n");

        int zone2 = (int)(0.7 * maximumHeartRate);
        zones.add("zone 2: " + (zone1 + 1) + "-" + zone2 + "\n");

        int zone3 = (int)(0.8 * maximumHeartRate);
        zones.add("zone 3: " + (zone2 + 1) + "-" + zone3 + "\n");

        int zone4 = (int)(0.9 * maximumHeartRate);
        zones.add("zone 4: " + (zone3 + 1) + "-" + zone4 + "\n");

        zones.add("zone 5: " + (zone4 + 1) + "-" + maximumHeartRate + "\n");

        return zones;
    }
}

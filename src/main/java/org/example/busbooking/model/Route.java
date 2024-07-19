package org.example.busbooking.model;

import java.util.List;

public class Route {
        public List<Bus> busList;
        public boolean isBusAvailable;

        @Override
        public String toString() {
                return "Route{" +
                        "busList=" + busList +
                        ", isBusAvailable=" + isBusAvailable +
                        '}';
        }
}

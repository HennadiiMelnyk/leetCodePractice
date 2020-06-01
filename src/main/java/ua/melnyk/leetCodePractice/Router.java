package ua.melnyk.leetCodePractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Router {

    public static void main(String[] args) {
        List<Integer> cities = new ArrayList<>();
        cities.add(1);
        cities.add(3);
        cities.add(6);
        cities.add(2);
        cities.add(4);
        System.out.println(countRoutes(7, cities));
    }


    public static int countRoutes(int fuel, List<Integer> cities) {
        Map<Integer, List<Integer>> diffMap = new HashMap<>();
        for (int i = 0; i < cities.size(); i++) {
            if (cities.size() - 1 != i) {
                List<Integer> difference = new ArrayList<>();
                for (int j = i + 1; j < cities.size(); j++) {
                    difference.add(Math.abs(cities.get(i) - cities.get(j)));
                }
                Collections.sort(difference);
                diffMap.put(i, difference);
            }
        }
        List<Integer> list = diffMap.get(cities.get(0));
        for (Integer city : cities) {
            if (!list.isEmpty()) {
                List<Integer> tmp = diffMap.get(city);
                if (tmp != null) {
                    for (int i = 0; i < tmp.size(); i++) {
                        if (list.get(i) + tmp.get(i) <= fuel) {
                            list.add(list.get(i) + tmp.get(i));
                        }

                    }
                }
            }

        }
        return list.size();
    }
}

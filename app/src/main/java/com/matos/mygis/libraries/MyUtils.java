package com.matos.mygis.libraries;

import android.util.Log;

import com.matos.mygis.database.models.Layer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by matOS on 8/19/2015.
 */
public class MyUtils {

    private static final String TAG = "MyUtils";

    public static Map<Integer, Layer> list2Map(List<Layer> list) {
        Map<Integer, Layer> data = new HashMap<>();
        try {
            for (Layer item : list) {
                data.put(item.getUrutan(), item);
            }
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        } finally {
        }
        return data;
    }

    /**
     * Method to convert string array to integer array
     * @param strArray array of string to be converted
     * @return array of integer
     */
    public static int[] toIntArray(String[] strArray) {

        if (strArray == null) return null;

        int[] ret = new int[strArray.length];

        try {
            for (int i=0;i<strArray.length;i++) {
                ret[i] = Integer.parseInt(strArray[i]);
            }
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }

        return ret;
    }

}

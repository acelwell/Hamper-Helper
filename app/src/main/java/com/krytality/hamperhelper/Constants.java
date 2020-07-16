package com.krytality.hamperhelper;

import java.util.Dictionary;
import java.util.Hashtable;

public class Constants
{
    public Constants()
    {
        this.setDict();
    }

    public static int symbolsCount = 32;

    public static int cameraSymbolCount;

    public static boolean[] activeSymbols = new boolean[61];

    public static Dictionary dict = new Hashtable();

    // preset all the possible values for to give users an answer
    private void setDict()
    {
        dict.put(0, "Hand Wash Normal");
        dict.put(1, "Machine Wash, Normal");
        dict.put(2, "Machine Wash, Permanent Press");
        dict.put(3, "Machine Wash, Delicate");

        dict.put(4, "Do Not Wash");
        dict.put(5, "Wash at or below 30 C");
        dict.put(6, "Wash at or below 40 C");
        dict.put(7, "Wash at or below 50 C");

        dict.put(8, "Wash at or below 60 C");
        dict.put(9, "Wash at or below 95 C");
        dict.put(10, "Wash at or below 30 C");
        dict.put(11, "Wash at or below 40 C");

        dict.put(12, "Wash at or below 50 C");
        dict.put(13, "Wash at or below 60 C");
        dict.put(14, "Wash at or below 70 C");
        dict.put(15, "Wash at or below 95 C");

        dict.put(16, "Wet Clean");
        dict.put(17, "Wet Clean, Delicate");
        dict.put(18, "Wet Clean, Very Delicate");
        dict.put(19, "Do Not Wet Clean");

        dict.put(20, "Do Not Wring");
        dict.put(21, "Wring");

        dict.put(22, "Bleach");
        dict.put(23, "Do Not Bleach");
        dict.put(24, "Non-Chlorine Bleach");
        dict.put(25, "Chlorine Bleach");

        dict.put(26, "Tumble Dry, Normal");
        dict.put(27, "Tumble Dry, Low Temp");
        dict.put(28, "Tumble Dry, Medium Temp");
        dict.put(29, "Tumble Dry, High Temp");
        dict.put(30, "Tumble Dry, No Heat");

        dict.put(31, "Line Dry");
        dict.put(32, "Shade Dry");
        dict.put(33, "Line Dry in Shade");
        dict.put(34, "Drip Dry");
        dict.put(35, "Drip Dry in Shade");

        dict.put(36, "Dry Flat");
        dict.put(37, "Dry Flat in Shade");
        dict.put(38, "Natural Dry");
        dict.put(39, "Do Not Tumble Dry");
        dict.put(40, "Do Not Dry");

        dict.put(41, "Iron");
        dict.put(42, "Iron, Low Temp");
        dict.put(43, "Iron, Medium Temp");
        dict.put(44, "Iron, High Temp");
        dict.put(45, "Do Not Iron");
        dict.put(46, "Steam");
        dict.put(47, "Do Not Steam");

        dict.put(48, "Dry Clean");
        dict.put(49, "Dry Clean, Any Solvent");
        dict.put(50, "Dry Clean, Petroleum Only");
        dict.put(51, "Dry Clean, Petroleum Only Delicate");

        dict.put(52, "Dry Clean, Petroleum Only Very Delicate");
        dict.put(53, "Dry Clean, Any Solvent Except Trichloroethylene");
        dict.put(54, "Dry Clean, Any Solvent Except Trichloroethylene, Delicate");
        dict.put(55, "Dry Clean, Any Solvent Except Trichloroethylene, Very Delicate");

        dict.put(56, "Do Not Dry Clean");
        dict.put(57, "Dry Clean, Short Cycle");
        dict.put(58, "Dry Clean, Reduced Moisture");
        dict.put(59, "Dry Clean, No Steam");

        dict.put(60, "Dry Clean, Low Heat");




    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

/**
 *
 * @author Rats
 */
public class convertToSIUnits {
    
    
     // methods converting Imp Units to SI
    // Weight
    static double ounceToKg (double ounce){
        return ounce * 0.02835;
    }

    static double poundToKg (double pound){
        return pound * 0.45359;
    }

    static double StonetToKg (double stone){
        return stone * 6.35;
    }

    static double UKtonToKg (double UKton){
        return UKton * 1016;
    }
    // Volume
    static double fluidOunceToMl (double fluidOunce){
        return fluidOunce * 0.0284;
    }

    static double cupToMl (double cup){
        return cup * (0.0284 * 10);
    }

    static double pintToMl (double pint){
        return pint * 0.0284* 40;
        }
    static double quartToML (double quart ){
        return quart*(28.4 *40);
    }

    static double galonToMl (double galon){
        return galon * 0.0284 * 160;
    }
    // Length
    static double inchToMeter ( double inch){
        return inch * 0.00254;
    }

    static double footToMeter (double foot){
        return foot * 0.3048;
    }

    static double yardToMeter (double yard){
        return yard * 0.9144;
    }
    static double mileToMeter (double mile){
        return mile * 1609.344;
    }

    static double leagueToMeter (double league){
        return league * 4828.032;
    }

    // Temperature
    
    static double fahrToCelsius (double fahr){
        return (fahr-32)*1.8;
    }

    static double rankinToCelsius ( double rank){
        return (rank - 491.67)*1.8;
    }
}

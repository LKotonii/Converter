/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Rats
 */
public class convertToSIUnits {
    
    
     // methods converting Imp Units to SI
    // Weight
    static double ounceToKg (double ounce){
        double kg = 0;
        kg  = ounce * 0.02835;
        return kg;
    }

    static double poundToKg (double pound){
        double kg = 0;
        kg  = pound * 0.45359;
        return kg;
    }

    static double StonetToKg (double stone){
        double kg = 0;
        kg  = stone * 6.35;
        return kg;
    }

    static double UKtonToKg (double UKton){
        double kg = 0;
        kg  = UKton * 1016;
        return kg;
    }
    // Volume
    static double fluidOunceToMl (double fluidOunce){
        double ml = 0;
        ml  = fluidOunce * 0.0284;
        return ml;
    }

    static double cupToMl (double cup){
        double ml = 0;
        ml  = cup * (0.0284 * 10);
        return ml;
    }

    static double pintToMl (double pint){
        double ml = 0;
        ml = pint * 0.0284* 40;
        return ml;
        }
    static double quartToML (double quart ){
        double ml = 0;
        ml = quart*(28.4 *40);
        return ml;
    }

    static double galonToMl (double galon){
        double ml = 0;
        ml  = galon * 0.0284 * 160;
        return ml;
    }
    // Length
    static double inchToMeter ( double inch){
        double meter = 0;
        meter = inch * 0.00254;
        return meter;
    }

    static double footToMeter (double foot){
        double meter = 0;
        meter = foot * 0.3048;
        return meter;
    }

    static double yardToMeter (double yard){
        double meter = 0;
        meter = yard * 0.9144;
        return meter;
    }
    static double mileToMeter (double mile){
        double meter = 0;
        meter = mile * 1609.344;
        return meter;
    }

    static double leagueToMeter (double league){
        double meter = 0;
        meter = league * 4828.032;
        return meter;
    }

    // Temperature
    
    static double fahrToCelsius (double fahr){
        double cels = (fahr-32)*1.8;
        return cels;
    }

    static double rankinToCelsius ( double rank){
        double cels = (rank - 491.67)*1.8;
        return cels;
    }
}

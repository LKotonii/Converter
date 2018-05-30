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
public class convertToImpUnits {
       // methods converting SI units to imperial units
    // Length
    // checked
    static double meterToInch (double meter ){
        double inch = 0;
        inch = meter / 0.0254;
        return inch;

    }

    // checked
    static double meterToFoot (double meter){
        double foot = 0;
        foot = meter / 0.3048;
        return foot;

    }

    // checked
    static double meterToYard (double meter){
        double yard = 0;
        yard = meter / 0.9144;
        return yard ;
    }

    static double meterToMile (double meter){
        double mile = 0;
        mile = meter/1609.344;
        return mile;

    }

    static double meterToLeague (double meter){
        double league = 0 ;
        league = meter / 4828.032;
        return league;
    }


    // Volume
    static double mlToFluidOunce (double ml){
        double fluidOunce = 0;
        fluidOunce = ml / 28.4;
        return fluidOunce;

    }

    static double mlToCup ( double ml){
        double cup =0;
        cup = ml/280.4;
        return cup;

    }

    static double mlToQuart (double ml ){
        double quart = 0;
        quart = ml/(28.4 *40);
        return quart;
    }

    static double mlToPint (double ml ){
        double pint = 0;
        pint = ml/(28.4 *20);
        return pint;
    }

    static double mlToGalon (double ml ){
        double galon = 0;
        galon = ml/(28.4 *160);
        return galon;
    }

    // Weight
    static double kgToOunce (double kg){
        double ounce = 0;
        ounce = kg / 0.02835;
        return ounce;
    }

    static double kgToPound (double kg){
        
        double pound = kg / 0.45359;
        return pound;
    }

    static double kgToStone (double kg){
        double stone = 0;
        stone = kg / 6.35;
        return stone;
    }

    static double kgToUKton (double kg){
        double UKton = 0;
        UKton = kg / 1016;
        return UKton;
    }

    // Temperature

    static double celsiusToFahr (double cels){
        
        double fahr = cels*1.8 + 32;
        return fahr;
    }

    static double celsiusToRankin (double cels){
        
        double rank = (cels+273.15)*1.8 ;
        return rank ;
    }
    
}

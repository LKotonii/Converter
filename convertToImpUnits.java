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
public class ConvertToImpUnits {
       // methods converting SI units to imperial units
    // Length
    // checked
    static double meterToInch (double meter ){
        return  meter / 0.0254;

    }

    // checked
    static double meterToFoot (double meter){
        return meter / 0.3048;

    }

    // checked
    static double meterToYard (double meter){
       return meter / 0.9144;
    }

    static double meterToMile (double meter){
        return  meter/1609.344;

    }

    static double meterToLeague (double meter){
        return meter / 4828.032;
    }


    // Volume
    static double mlToFluidOunce (double ml){
       return ml / 28.4;

    }

    static double mlToCup ( double ml){
       return ml/280.4;

    }

    static double mlToQuart (double ml ){
      return  ml/(28.4 *40);
    }

    static double mlToPint (double ml ){
        return ml/(28.4 *20);
    }

    static double mlToGalon (double ml ){
        return ml/(28.4 *160);
    }

    // Weight
    static double kgToOunce (double kg){
        return kg / 0.02835;
    }

    static double kgToPound (double kg){
        return kg / 0.45359;
    }

    static double kgToStone (double kg){
        return kg / 6.35;
    }

    static double kgToUKton (double kg){
        return kg / 1016;
    }

    // Temperature

    static double celsiusToFahr (double cels){
        return cels*1.8 + 32;
    }

    static double celsiusToRankin (double cels){
        return (cels+273.15)*1.8;
    }
    
}

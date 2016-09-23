/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.conversion.multiples;

/**
 *
 * @author Labs-DECC
 */
public class HectometerDecameter extends MultipleInterface{

    public HectometerDecameter(float hectometer) {
        this.valueToConvert = hectometer;
    }

    
    
    @Override
    public Float calculate() {
        return valueToConvert * 10;
    }
    
}

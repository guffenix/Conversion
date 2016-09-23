/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.conversion.submultiples;

/**
 *
 * @author Labs-DECC
 */
public class MeterDecimeter extends SubmultipleInterface{

    public MeterDecimeter(float meter) {
        this.valueToConvert = meter;
    }

    
    @Override
    public Float calculate() {
        return valueToConvert * 10;
    }
    
}

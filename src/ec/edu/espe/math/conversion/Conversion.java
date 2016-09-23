/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.conversion;

/**
 *
 * @author Labs-DECC
 */
public interface Conversion {
    //Referente a los submúltiplos:   1 m = 10 dm     |     1 dm  = 10 cm    |    1 cm = 10 mm
    //Referente a los múltiplos:    1 dam = 10 m     |     1 hm  = 10 dam    |    1 km = 10 hm
    public abstract Float calculate();
}

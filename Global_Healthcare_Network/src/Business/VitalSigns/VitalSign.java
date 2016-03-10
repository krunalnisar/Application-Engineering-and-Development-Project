/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.VitalSigns;

/**
 *
 * @author Krunal Nisar
 */
public class VitalSign {



    
    private double respiratory;
    private double heart;
    private double bloodPressure;
    private double weight;
   

    public double getRespiratory() {
        return respiratory;
    }

    public void setRespiratory(double respiratory) {
        this.respiratory = respiratory;
    }

    public double getHeart() {
        return heart;
    }

    public void setHeart(double heart) {
        this.heart = heart;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.valueOf(respiratory);
    }
    
    

}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Report;

/**
 *
 * @author Krunal Nisar
 */
public class Assessment {
    
    private String labTest;
    private String labTestDescription;
    private String result;

    public String getLabTest() {
        return labTest;
    }

    public void setLabTest(String labTest) {
        this.labTest = labTest;
    }

    public String getLabTestDescription() {
        return labTestDescription;
    }

    public void setLabTestDescription(String labTestDescription) {
        this.labTestDescription = labTestDescription;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return labTest+"\n";
    }
 
    
    
}

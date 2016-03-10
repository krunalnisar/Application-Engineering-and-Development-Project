/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Report;

import java.util.ArrayList;

/**
 *
 * @author Krunal Nisar
 */
public class AssessmentHistory {
    
    private ArrayList<Assessment> assessmentList;
    
    public AssessmentHistory()
    {
        assessmentList = new ArrayList<>();
    }

    public ArrayList<Assessment> getAssessmentList() {
        return assessmentList;
    }

    public void setAssessmentList(ArrayList<Assessment> assessmentList) {
        this.assessmentList = assessmentList;
    }
    
    public Assessment createAssessment(String name , String description,String result)
    {
        Assessment assessment = new Assessment();
        assessment.setLabTest(name);
        assessment.setLabTestDescription(description);
        assessment.setResult(result);
        assessmentList.add(assessment);
        return assessment;
        
    }

    @Override
    public String toString() {
        return "AssessmentHistory{" + "assessmentList=" + assessmentList + '}';
    }
    
    
}

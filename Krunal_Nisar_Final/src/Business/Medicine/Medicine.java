/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Medicine;

import java.util.Date;

/**
 *
 * @author Krunal Nisar
 */
public class Medicine {
    
    String name;
    String serialNo;
    String weight;
    String description;
    String category;
    String riskReport;
    
    String status;
    String manufactureName;
    String sideEffects;
    Date date;
    private int count = 0;
    private int medcount=0;

    public int getMedcount() {
        return medcount;
    }

    public void setMedcount(int medcount) {
        this.medcount = medcount;
    }

    
    public int getCount() {
        return count;
    }

    public String getRiskReport() {
        return riskReport;
    }

    public void setRiskReport(String riskReport) {
        this.riskReport = riskReport;
    }

    public void setCount(int count) {
        this.count = count;
    }

    
    
    public enum Category
    {
        Brand("Brand"),
        Generic("Generic");
        
        private String value;

        private Category(String value) {
            this.value = value;
        }
        
        public String getvalue()
        {
            return value;
        }
        
        public String toString()
        {
            return value;
        }
        
    }
    public Medicine()
    {
       date = new Date();
    }
    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getManufactureName() {
        return manufactureName;
    }

    public void setManufactureName(String manufactureName) {
        this.manufactureName = manufactureName;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

   

    public String getSideEffects() {
        return sideEffects;
    }

    public void setSideEffects(String sideEffects) {
        this.sideEffects = sideEffects;
    }
    
    public String toString()
    {
        return name;
    }
    
}

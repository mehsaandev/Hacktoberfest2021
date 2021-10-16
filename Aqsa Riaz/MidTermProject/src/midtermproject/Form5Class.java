/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermproject;

/**
 *
 * @author Amiga
 */

//////class form 5
public class Form5Class {
    String ProjectTitle;
    String  Advisor_Name;
    String Committee_MName;
    public Form5Class(String ProjectTitle,String  Advisor_Name,String Committee_MName)
    {
        this.ProjectTitle=ProjectTitle;
        this.Advisor_Name=Advisor_Name;
        this.Committee_MName=Committee_MName;        
    }
    public String getProjectTitle(){
        return ProjectTitle;
    }
    public String gettAdvisor_name(){
        return Advisor_Name;
    }
    public String getCommittee_MName(){
        return Committee_MName;
    }
}

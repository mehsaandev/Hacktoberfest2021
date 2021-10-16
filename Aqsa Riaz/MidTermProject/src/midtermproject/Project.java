/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermproject;

import java.util.ArrayList;

/**
 *
 * @author Amiga
 */


//////////////////project classs
public class Project {

    public Project(String Project_Title1, String Advisor_Name1, String CM_Name1) {
    }
    String Project_Title;
    String Advisor_Name;
    String CM_Name;
    public ArrayList Project(String Project_Title, String Advisor_Name,String CM_Name){
        ArrayList<Project>list=new ArrayList<Project>();
        Project aq=new Project(Project_Title,Advisor_Name,CM_Name);
        list.add(aq);
        list.remove(aq);
       for(int i=0; i<list.size();i++){
           list.set(i, aq);
       }
        return list;
    }
}
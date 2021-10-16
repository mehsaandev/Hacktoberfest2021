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
 *///////This class is used to handle Advisor
public class Advisor {

    public Advisor(String AdvisorFirstName1, String AdvisorLastName1, String AdvisorId1, String AdCNIC1, String AdEmailId1, String DOB1) {
    }
        String AdvisorFirstName;
        String AdvisorLastName;
        String AdvisorId;
        String AdCNIC;
        String adGender;
        String AdEmailId;
        String DOB;
          public ArrayList Advisor(String AdvisorFirstName,String AdvisorLastName,
               String AdvisorId,String AdCNIC,String adGender,String AdEmailId,
          String DOB){
            ArrayList<Advisor> list=new ArrayList<Advisor>();
            Advisor aq= new Advisor(AdvisorFirstName,AdvisorLastName,AdvisorId,AdCNIC,AdEmailId, DOB);
                list.add(aq);
                list.remove(aq);
                for(int i=0; i<list.size();i++){
                    list.set(i, aq);
                }
                return list;
}
}

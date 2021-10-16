/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermproject;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

/**
 *
 * @author Amiga
 */

///// s tudent classssss
public class Student {

    public Student(String StdFirstName1, String StdLastName1, String StdId1, String StdCNIC1, String StdGender1, String StdEmailId1, String DOB1) {
    }
        String StdFirstName;
        String StdLastName;
        String StdId;
        String StdCNIC;
        String StdGender;
        String StdEmailId;
        String DOB;
        public ArrayList Student(String StdFirstName,String StdLastName,
               String StdId,String StdCNIC,String StdGender,String  StdEmailId,
          String DOB){
            ArrayList<Student> list=new ArrayList<Student>();
            Student aq= new Student(StdFirstName,StdLastName,StdId, StdCNIC,StdGender,StdEmailId, DOB);
                list.add(aq);  
                list.remove(aq);
                for(int i=0; i<list.size();i++){
                    list.set(i, aq);
                }
                return list;
}
}

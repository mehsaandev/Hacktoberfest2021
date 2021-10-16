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
////////form claa 4
public class Form4Class {
    public class Frm3Class {
        String StdFirstName;
        String StdLastName;
        String StdId;
        String StdCNIC;
        String StdGender;
        String StdEmailId;
        public Frm3Class(String StdFirstName,String StdLastName,
            String AdvisorId,String AdCNIC,String adGender,
            String StdEmailId){
            this.StdCNIC=AdCNIC;
            this.StdEmailId=StdEmailId;
            this.StdFirstName=StdFirstName;
            this.StdLastName=StdLastName;
            this.StdGender=adGender;
            this.StdId=AdvisorId;
        }
        public String getStdCNIC(){
            return StdCNIC;
        }
        public String StdEmailId(){
            return StdEmailId;
        }
        public String StdFirstName(){
            return StdFirstName;
        }
        public String StdLastName(){
            return StdLastName;
        }
        public String StdGender(){
            return StdGender;
        }
        public String StdId(){
            return StdId;
        }
}

}

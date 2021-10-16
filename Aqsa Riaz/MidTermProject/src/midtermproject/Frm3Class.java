/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermproject;
/////////////frmclass3
/**
 *
 * @author Amiga
 */
public class Frm3Class {
        String AdvisorFirstName;
        String AdvisorLastName;
        String AdvisorId;
        String AdCNIC;
        String adGender;
        String AdEmailId;
        String Advisor_Address;
        String DOB;
        public Frm3Class(String AdvisorFirstName,String AdvisorLastName,
            String AdvisorId,String AdCNIC,String adGender,
            String AdEmailId,String Advisor_Address,  String DOB){
            this.AdCNIC=AdCNIC;
            this.AdEmailId=AdEmailId;
            this.AdvisorFirstName=AdvisorFirstName;
            this.AdvisorLastName=AdvisorLastName;
            this.Advisor_Address=Advisor_Address;
            this.adGender=adGender;
            this.AdvisorId=AdvisorId;
            this.DOB=DOB;
        }
        public String getAdCNIC(){
            return AdCNIC;
        }
        public String AdEmailId(){
            return AdEmailId;
        }
        public String AdvisorFirstName(){
            return AdvisorFirstName;
        }
        public String AdvisorLastName(){
            return AdvisorLastName;
        }
        public String Advisor_Address(){
            return Advisor_Address;
        }
        public String adGender(){
            return adGender;
        }
        public String AdvisorId(){
            return AdvisorId;
        }
        public String DOB(){
            return DOB;
        }
}

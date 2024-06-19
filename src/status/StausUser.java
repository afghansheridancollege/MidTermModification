/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */ 


/** NewChanges new created as Enum **/
public class StausUser 
{
  public enum UserStatus {
        ZERO("REJECTED"),ONE("PENDING"),TWO("PROCESSING"),THREE("APPROVED"),INVALID("NOT VALID CODE");
        private final String status;

        UserStatus(String status) {
            this.status = status;
        }
        public void statusDetail(UserStatus status) 
        {
        System.out.println(status.getStatus()); }
}
 
}

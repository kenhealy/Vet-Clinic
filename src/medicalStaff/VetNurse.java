/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalStaff;

import staff.MedicalStaff;
import staff.StaffType;

/**
 * Veterinary Nurse - create a new MedicalSTaff and set role as VetNurse
 * @author Ken
 */
public class VetNurse extends MedicalStaff {
    
    public VetNurse(String firstname, String surname) {
        
        super(firstname, surname, StaffType.VETNURSE);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalrecords;

import java.util.Stack;

/**
 *
 * @author UTN
 */
public class MedicalsRecordsList implements SequentialDynamicsLists<MedicalRecod> {
    private Stack<MedicalRecod> medicalHistory;

    public MedicalsRecordsList(Stack medicalHistory) {
        this.medicalHistory = new Stack();
    }
    
    
}

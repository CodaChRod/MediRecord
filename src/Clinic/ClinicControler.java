/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinic;

import patients.Patient;
import vista.iView;

/**
 *
 * @author bycha
 */
public class ClinicControler {
    private Clinic clinic;
    private iView view;

    public void setView(iView view) {
        this.view = view;
    }

    private ClinicControler(iView view) {
        this.clinic = new Clinic();
        this.view = view;
    }
    
    private static ClinicControler controller;
    
    public static ClinicControler getInstance(iView view){
        if(controller == null)
            controller = new ClinicController(view);
        return controller;
    }
    
    public void addPatient(Patient patient){

    }

    public void findPatient(String id){
        
    }

    public void removePatient(String id){
        
    }

    public Iterator<Patient> getPatients(){
        
    }

    public boolean scheduleAppointment(Appointment appointment){
        return false;
    }

    public Appointment findAppointment(String code){
        return null;
    }

    public boolean rescheduleAppointment(String code, LocalDate newDate, LocalTime newTime){
        return false;
    }

    public boolean cancelAppointment(String code){
        
        return false;
    }

    public Iterator<Appointment> getAppointments(){
        return null;
    }

    public boolean checkInPatient(String patientId){
        boolean status = clinic.checkInPatient(patientId);
        if (status){
            view.showMessage("Registro completa con exito");
}else{
            
        }
        return status;
    }

    public Patient getNextPatient(){
        return null;
    }

    public Patient attendNextPatient(){
        Patient pat = clinic.getNextPatient();
        if(pat==null){
            view.ShowError("No existen más pacientes");
        }
        clinic.attendNextPatient();
      return pat;
    }

    public int getWaitingPatientCount(){
        return 0;
    }

    public boolean isPatientWaiting(String patientId){
        return false;
    }

    private static class ClinicController extends ClinicControler {

        public ClinicController(iView view) {
        }
    }
}

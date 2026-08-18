/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinic;

/**
 *
 * @author UTN
 */
public class Clinic {
    
    private PatiensList patiens;
    private AppoimentList appoiments;
    private WaitingRoomList waitingoroom;

    public Clinic(PatiensList patiens, AppoimentList appoiments, WaitingRoomList waitingoroom) {
        this.patiens = new PatiensList();
        this.appoiments = new AppoimentList();
        this.waitingoroom = new WaitingRoomList();
        
        
    }
    
    public void addPatient(Patient patient){

    }

    public void findPatient(String id){
        
    }

    public void removePatient(String id){
        
    }

    public Iterator<Patient> getPatients(){
        
    }

    public boolean scheduleAppointment(String code, Localdate newDate, Local, LocalTime nweTime){
        if(appoiments.isEmpty()) return false;
        Appoiment appo=appoiments.get(code);
        if(appo=null) return false;
        appo.reschedule(newDate.newTime);
        return true;
        
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
      Iterator<Appoiment> itAppo=appoiments.getAll();
      while(isAppo.hasNext()){
          Appoiment appo = isAppo.next();
          if(appo.getPatien().getId().equials(patiendId)&&appo.isToday()){
              waitingoroom.add(appo.getPatient());
              return true;
          }
      }
     return false;
    }

    public Patient getNextPatient(){
        return null;
    }

    public Patient attendNextPatient(){
        return null;
    }

    public int getWaitingPatientCount(){
        return 0;
    }

    public boolean isPatientWaiting(String patientId){
        return false;
    }
}

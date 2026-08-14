/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package appointments;

import Clinic.DyanamicLists;

/**
 *
 * @author UTN
 * @param <T>
 * @param <K>
 */

public interface KeyDynamicsLists <T,K> extends DyanamicLists{
    public T get(K id);
    public boolean remove(K id);
}

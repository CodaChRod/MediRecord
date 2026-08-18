/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package vista;

/**
 *
 * @author UTN
 */
public interface iView {
    public void clear();
    public void showData(T data);
    public void ShowError(String error);
    public void showMessage(String message);
    
}

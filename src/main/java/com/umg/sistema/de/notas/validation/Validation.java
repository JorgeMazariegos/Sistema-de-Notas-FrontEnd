package com.umg.sistema.de.notas.validation;
import com.umg.sistema.de.notas.model.Teacher;
import com.umg.sistema.de.notas.model.Admin;
import java.security.NoSuchAlgorithmException;

public class Validation {
    Encryption encriptar = new Encryption();
    
    public int comprobarCorreo(String correo){
        if(comprobarTeacher(correo)){
            return 1;
        }
        if(comprobarAdmin(correo)){
            return 2;
        }
        return 0;
    }
    
    public boolean comprobarPassword(Teacher teacher, String password) throws NoSuchAlgorithmException{
        return encriptar.hashMD5(password).equals(teacher.getPassword());         
    }
    
    public boolean comprobarAdminPassword(Admin admin, String password)throws NoSuchAlgorithmException{
        return encriptar.hashMD5(password).equals(admin.getPassword());
    }
     
    private boolean comprobarTeacher(String correo){
        String[] correos = {"edu.com"};
        try {
            String[] cSeparar = correo.split("@");
            for(String c : correos){
                if(cSeparar[1].equals(c)){
                    return true;
                }
            }
        }catch(Exception e) {
                return false;
        }
        return false;
    }
    
    private boolean comprobarAdmin(String correo){
        String[] correos = {"edu.admin.com"};
        try {
            String[] cSeparar = correo.split("@");
            for(String c : correos){
                if(cSeparar[1].equals(c)){
                    return true;
                }
            }
        }catch(Exception e) {
                return false;
        }
        return false;
    }
    
}

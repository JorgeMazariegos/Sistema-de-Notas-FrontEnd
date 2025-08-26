package com.umg.sistema.de.notas.validation;

public class Validation {
    public int comprobarCorreo(String correo){
        if(comprobarTeacher(correo)){
            return 1;
        }
        if(comprobarAdmin(correo)){
            return 2;
        }
        return 0;
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

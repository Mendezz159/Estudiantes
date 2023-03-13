/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estudiantes;

import java.util.HashMap;

/**
 *
 * @author HP PORTATIL
 */
public class GestionEstudiantes {
    private static HashMap<Integer, Estudiante> mapa = new HashMap<>();
                         //codigo   estudiante

    public static HashMap<Integer, Estudiante> getMapa() {
        return mapa;
    }

    public static void setMapa(HashMap<Integer, Estudiante> mapa) {
        GestionEstudiantes.mapa = mapa;
    }
    
    public static void AgregarEstudiante(int codigo, Estudiante nuevoEstudiante){
        mapa.put(codigo, nuevoEstudiante);
    }
    
    public static void ModificarEstudiante(int codigo, Estudiante nuevoEstudiante){
        mapa.replace(codigo, nuevoEstudiante);
    }
    
    public static void BorrarEstudiante(int codigo){
        mapa.remove(codigo);
    }
    
    public static boolean CodigoRegistrado(int codigo){
        return(mapa.containsKey(codigo));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz_excercise;

import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author ASUS
 */
public class FileBooking {
    public static void TulisFile(String data,String namaFile){
        try(FileWriter fw = new FileWriter(namaFile)){
            fw.write(data);
        }catch(Exception ex){
            
        }
    }
    
    public static String BacaFile(String namaFile){
        StringBuilder sb = new StringBuilder();
        try(FileReader fr = new FileReader(namaFile)){
            int posisi;
            while((posisi = fr.read())!= -1){
                sb.append((char)posisi);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            return sb.toString();
        }
    }
}

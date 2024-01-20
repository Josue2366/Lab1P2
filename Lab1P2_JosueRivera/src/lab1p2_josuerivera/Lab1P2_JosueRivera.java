/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p2_josuerivera;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author josue
 */
public class Lab1P2_JosueRivera {
static Scanner sc = new Scanner(System.in);
static Scanner cs = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        ArrayList<Correos> lista = new ArrayList<>();
        System.out.println("/////menu/////");
        System.out.println("1. Registro de usuario");
        System.out.println("2. Salir");
        System.out.println("Ingrese su opcion:");
        int respuesta= sc.nextInt();
        while (respuesta < 1 || respuesta > 2){
            System.out.println("/////menu/////");
            System.out.println("1. Registro de usuario");
            System.out.println("2. Salir");
            System.out.println("Ingrese su opcion:");
            respuesta= sc.nextInt();
        }
        while (respuesta == 1){
            
            System.out.println("////menu////");
            System.out.println("1. Registro de usuario");
            System.out.println("2. Listar todo");
            System.out.println("3. listar por dominio");
            System.out.println("4. Salir");
            System.out.println("Ingrese su opcion:");
            int res2 = sc.nextInt();
            while (res2 < 1 || res2 >4){
                System.out.println("////menu////");
                System.out.println("1. Registro de usuario");
                System.out.println("2. Listar todo");
                System.out.println("3. listar por dominio");
                System.out.println("4. salir");
                System.out.println("Ingrese una opcion valida:");
                res2 = sc.nextInt();
            }
            while (res2 > 0 && res2 <4){
                
                switch (res2){
                    case 1: 
                        System.out.println("nombre:");
                        String name = cs.nextLine();
                        System.out.println("Apellido:");
                        String Apellido = cs.nextLine();
                        System.out.println("Introduzca su fecha de nacimiento en el formato (dd/MM/yyyy):");
                        
                        String fecha = cs.nextLine();
                        
                        Date dia = new Date ();
                        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
                        String dia_act = sd.format(dia);
                        String dia_user = fecha;
                        String div [] = dia_act.split("/");
                        String div2 [] = dia_user.split("/");
                        
                        if ((Integer.parseInt(div[2]) - Integer.parseInt(div2[2])) < 13 ){
                            break;
                        }
                        if ((Integer.parseInt(div[2]) - Integer.parseInt(div2[2])) ==  13){
                            
                            if (Integer.parseInt(div[1]) > Integer.parseInt(div2[1])){
                                
                                break;
                            }
                            else if (Integer.parseInt(div[0]) >= Integer.parseInt(div[0])){
                                break;
                            }
                       
                        }
                        Date fecha_user = new Date(fecha);
                        System.out.println("Introduzca el correo");
                        String dominio = cs.nextLine();
                        while (dominios(dominio) == false){
                            System.out.println("Ingrese el correo:");
                            dominio = cs.next();
                        }
                       /* String regex1 = "^(?=>[a-z])(?=.[A-Z])(?=.\\d)(?=.[!\\?<>$%]).{8,}$";
                        Pattern pattern1 = Pattern.compile(regex1);*/
                        System.out.println("ingrese la contra");
                        String contra = cs.nextLine();
                        while (contrasenna(contra) == false){
                            System.out.println("Ingrese otra vez la contra:");
                            contra = cs.next();
                        }
                        
                        Correos user = new Correos(fecha_user,contra,dominio,name,Apellido);
                        lista.add(user);
                        
                        System.out.println("si");
                        
                        
                            
                        
                        
                    
                        
                        
                        
                        
                        System.out.println("ok1");
                        break;
                        
                    case 2:
                        if (lista.isEmpty()){
                            System.out.println("No existen cuentas para mostrar.");
                            break;
                        }
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println("Nombre: "+lista.get(i).getNombre());
                            System.out.println("Apellido: "+lista.get(i).getApellido());
                            System.out.println("Correo: "+lista.get(i).getCorreo());
                            System.out.println("passeword: "+lista.get(i).getPasseword());
                            System.out.println("Fecha: "+lista.get(i).getFecha());
                            
                        }
                        break;
                        
                                
                        
                    case 3:
                        if (lista.isEmpty()){
                            System.out.println("No existen cuentas para mostrar.");
                            break;
                        }
                        for (int i = 0; i < lista.size(); i++) {
                            if (lista.get(i).getCorreo().contains("gmail.com") ){

                            System.out.println("Nombre: "+lista.get(i).getNombre());
                            System.out.println("Apellido: "+lista.get(i).getApellido());
                            System.out.println("Correo: "+lista.get(i).getCorreo());
                            System.out.println("passeword: "+lista.get(i).getPasseword());
                            System.out.println("Fecha: "+lista.get(i).getFecha());
                            }   
                        }
                        for (int i = 0; i < lista.size(); i++) {
                            if (lista.get(i).getCorreo().contains("outlook.com") ){
                                System.out.println("Nombre: "+lista.get(i).getNombre());
                                System.out.println("Apellido: "+lista.get(i).getApellido());
                                System.out.println("Correo: "+lista.get(i).getCorreo());
                                System.out.println("passeword: "+lista.get(i).getPasseword());
                                System.out.println("Fecha: "+lista.get(i).getFecha());
                            }
                        }
                        for (int i = 0; i < lista.size(); i++) {
                            if (lista.get(i).getCorreo().contains("yahoo.com") ){
                                System.out.println("Nombre: "+lista.get(i).getNombre());
                                System.out.println("Apellido: "+lista.get(i).getApellido());
                                System.out.println("Correo: "+lista.get(i).getCorreo());
                                System.out.println("passeword: "+lista.get(i).getPasseword());
                                System.out.println("Fecha: "+lista.get(i).getFecha());
                            }
                        }
                        for (int i = 0; i < lista.size(); i++) {
                            if (lista.get(i).getCorreo().contains("icloud.com") ){
                               System.out.println("Nombre: "+lista.get(i).getNombre());
                                System.out.println("Apellido: "+lista.get(i).getApellido());
                                System.out.println("Correo: "+lista.get(i).getCorreo());
                                System.out.println("passeword: "+lista.get(i).getPasseword());
                                System.out.println("Fecha: "+lista.get(i).getFecha());
                            }
                        }
                        for (int i = 0; i < lista.size(); i++) {
                            if (lista.get(i).getCorreo().contains("protonmail.com") ){
                                System.out.println("Nombre: "+lista.get(i).getNombre());
                                System.out.println("Apellido: "+lista.get(i).getApellido());
                                System.out.println("Correo: "+lista.get(i).getCorreo());
                                System.out.println("passeword: "+lista.get(i).getPasseword());
                                System.out.println("Fecha: "+lista.get(i).getFecha());
                            }
                        }
                        for (int i = 0; i < lista.size(); i++) {
                            if (lista.get(i).getCorreo().contains("fastmail.com") ){
                                System.out.println("Nombre: "+lista.get(i).getNombre());
                                System.out.println("Apellido: "+lista.get(i).getApellido());
                                System.out.println("Correo: "+lista.get(i).getCorreo());
                                System.out.println("passeword: "+lista.get(i).getPasseword());
                                System.out.println("Fecha: "+lista.get(i).getFecha());
                            }
                        }
                        
                        
                }
                System.out.println("////menu////");
                System.out.println("1. Registro de usuario");
                System.out.println("2. Listar todo");
                System.out.println("3. listar por dominio");
                System.out.println("4. salir");
                System.out.println("Ingrese su opcion:");
                res2 = sc.nextInt();
            }
            
            System.out.println("ok1");
            System.out.println("/////menu/////");
            System.out.println("1. Registro de usuario");
            System.out.println("2. Salir");
            System.out.println("Ingrese su opcion:");
            respuesta= sc.nextInt();
            
            
        }
        //lista.get(i).getCorreo().contains("gmail.com"
    }
    public static void imprimir_dominio(ArrayList<Correos> lista){
        for (int i = 0; i < lista.size()-1; i++) {
            if (lista.get(i).getCorreo().contains("gmail.com") ){
                
                System.out.println(lista.get(i).getNombre());
                System.out.println(lista.get(i).getApellido());
                System.out.println(lista.get(i).getFecha());
                System.out.println(lista.get(i).getCorreo());
                System.out.println(lista.get(i).getPasseword());
            }
        }
        for (int i = 0; i < lista.size()-1; i++) {
            if (lista.get(i).getCorreo().contains("outlook.com") ){
                System.out.println(lista.get(i).getNombre());
                System.out.println(lista.get(i).getApellido());
                System.out.println(lista.get(i).getFecha());
                System.out.println(lista.get(i).getCorreo());
                System.out.println(lista.get(i).getPasseword());
            }
        }
        for (int i = 0; i < lista.size()-1; i++) {
            if (lista.get(i).getCorreo().contains("yahoo.com") ){
                System.out.println(lista.get(i).getNombre());
                System.out.println(lista.get(i).getApellido());
                System.out.println(lista.get(i).getFecha());
                System.out.println(lista.get(i).getCorreo());
                System.out.println(lista.get(i).getPasseword());
            }
        }
        for (int i = 0; i < lista.size()-1; i++) {
            if (lista.get(i).getCorreo().contains("iCloud.com") ){
                System.out.println(lista.get(i).getNombre());
                System.out.println(lista.get(i).getApellido());
                System.out.println(lista.get(i).getFecha());
                System.out.println(lista.get(i).getCorreo());
                System.out.println(lista.get(i).getPasseword());
            }
        }
        for (int i = 0; i < lista.size()-1; i++) {
            if (lista.get(i).getCorreo().contains("protonMail.com") ){
                System.out.println(lista.get(i).getNombre());
                System.out.println(lista.get(i).getApellido());
                System.out.println(lista.get(i).getFecha());
                System.out.println(lista.get(i).getCorreo());
                System.out.println(lista.get(i).getPasseword());
            }
        }
        for (int i = 0; i < lista.size()-1; i++) {
            if (lista.get(i).getCorreo().contains("fastMail.com") ){
                System.out.println(lista.get(i).getNombre());
                System.out.println(lista.get(i).getApellido());
                System.out.println(lista.get(i).getFecha());
                System.out.println(lista.get(i).getCorreo());
                System.out.println(lista.get(i).getPasseword());
            }
        }
    }
    public static void imprimir_todo(ArrayList<Correos> lista){
        for (int i = 0; i < lista.size() - 1; i++) {
            System.out.println(lista.get(i).getNombre()+"\n");
            System.out.println(lista.get(i).getApellido()+"\n");
            System.out.println(lista.get(i).getFecha()+"\n");
            System.out.println(lista.get(i).getCorreo()+"\n");
            System.out.println(lista.get(i).getPasseword()+"\n");
        }
    }
    public static boolean contrasenna(String contra){
        String regex = "^[a-zA-Z0-9._%&$+-?<>!]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(contra);
        
        return matcher.matches();
    }
    public static boolean dominios(String dominio){
        /*String regex1 = "^(?=>[a-z])(?=.[A-Z])(?=.\\d)(?=.[!\\?<>$%]).{8,}$";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher = pattern1.matcher(dominio);
        
        if (matcher.matches() == false){
            return matcher.matches();
        }*/
       
            String dom []= dominio.split("@");
            if ( (dom[1].equalsIgnoreCase("gmail.com"))||(dom[1].equalsIgnoreCase("outlook.com")) || (dom[1].equalsIgnoreCase("yahoo.com")) || (dom[1].equalsIgnoreCase("iCloud.com")) || (dom[1].equalsIgnoreCase("protonMail.com")) || (dom[1].equalsIgnoreCase("fastMail.com"))){
                return true;
            }
            else {
                return false;
            }
        
    }
    
}

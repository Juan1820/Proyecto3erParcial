/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3erparcial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author juanp
 */
public class NewMain {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resp=0;
        int id, edad,n;
        String nombre = null, correo, telefono;
        List<Usuario> usuario = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        
         while (resp<6){
             try {
                System.out.println("----Menu----");
        System.out.println("1---Agregar un Usuario");
        System.out.println("2---Eliminar un Usuario");
        System.out.println("3---Buscar un Usuario por nombre");
        System.out.println("4---Mostrar Usuarios");
        System.out.println("5---Salir");
        resp = Integer.parseInt(leer.next());
        switch(resp){
            case 1:
                System.out.println("Ingrese el id");
                id = leer.nextInt();
                System.out.println("Ingrese el nombre ");
                nombre = leer.next();
                System.out.println("Ingrese su edad");
                edad = leer.nextInt();
                System.out.println("Ingrese el correo ");
                correo = leer.next();
                System.out.println("Ingrese el telefono ");
                telefono = leer.next();
                usuario.add(new Usuario(id, nombre, edad, correo, telefono));
                
        break;
            case 2:
                System.out.println("eliminar usuario");
                System.out.println("Que nombre desea eliminar");
                nombre = leer.next();
                Usuario u1 = new Usuario();
                u1.setNombre(nombre);
                for(Usuario e:usuario){
                    if(e.getNombre().equals(u1.getNombre())){
                        System.out.println(usuario.indexOf(usuario));
                        
                  
                    }
                    else{
                        System.out.println("No esta men 7_7 ");
                    }
                    }
        
                
            break;
            case 3:
                System.out.println("Datos del usuario");
                System.out.println("Que nombre desea busacar");
                nombre = leer.next();
                Usuario u2 = new Usuario();
                u2.setNombre(nombre);
                for(Usuario u:usuario){
                    if(u.getNombre().equals(u2.getNombre())){
                        System.out.println("id: " + u.getId());
                        System.out.println("nombre: " + u.getNombre());
                        System.out.println("edad: " + u.getEdad());
                        System.out.println("correo: " + u.getCorreo());
                        System.out.println("telefono: " + u.getTelefono());
                }
                    else {
                        System.out.println("No se encontro el nombre joven");
                    }
                }
            break;
            case 4:
                System.out.println("Tamaño de la lista " + usuario.size());
            break;
            case 5:
                System.out.println("saliste bye");
                resp=6;
            break;
            default:
                System.out.println("opcion no valida");
        }  
             } catch (Exception e) {
             }
        
        } 
        
    }
    
}

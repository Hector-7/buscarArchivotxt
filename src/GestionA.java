
/*Se realiza la importacion de los paquetes necesarios para el uso de la importacion de archivos*/
import java.io.*;

public class GestionA {
    FileInputStream entrada; //Se crea la variable para el flujo de entrada
    FileOutputStream salida; //Se crea la variable para el flujo de salida
    File archivo; //Se crea la variable fichero
    
    //Se crea el constructor para esta clase
    public GestionA(){
        
    }
    
    /*Metodo para abrir un archivo de texto*/
    
    public String AbrirATexto(File archivo){
        String contenido="";
        try{
            entrada = new FileInputStream(archivo);
            int ascci;
            while((ascci = entrada.read()) != -1){
                char caracter = (char)ascci;
                contenido += caracter;
            }
        } catch (Exception e){
            
        }
        return contenido;
    }
    
    /*Metodo para guardar archivo de texto*/
    
    public String GuardarATexto(File archivo, String contenido){
        String respuesta = null;
        try{
            salida = new FileOutputStream(archivo);
            byte[] bytesTxt = contenido.getBytes();
            salida.write(bytesTxt);
            respuesta = "Se guardo con exito el archivo"; //Mensaje de guardado del nuevo archivo de texto con exito
        }catch (Exception e){
            
        }
        return respuesta;
    }
    
    /**/
}

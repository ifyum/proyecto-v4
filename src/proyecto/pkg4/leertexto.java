package proyecto.pkg4;
import java.io.*;

/**
 *
 * @author Ifyum
 */
public class leertexto {
    FileInputStream entrada;
    FileOutputStream salida;
    File archivo;
    
    public leertexto(){
        
    }
    
    /*Abrir un archivo de texto*/
    public String AbrirATexto(File archivo){
        String contenido="";
        try {
            entrada = new FileInputStream(archivo);
            int ascci;
            while((ascci = entrada.read())!= -1){
                char carcater = (char)ascci;
                contenido += carcater;
            }
        } catch (Exception e) {
        }
        return contenido;
    }
    
    /*Guardar archivo de texto*/
    public String GuardarATexto(File archivo, String contenido){
        String respuesta=null;
        try {
            salida = new FileOutputStream(archivo);
            byte[] bytesTxt = contenido.getBytes();
            salida.write(bytesTxt);
            respuesta = "Se guardo con exito el archivo";
        } catch (Exception e) {
        }
        return respuesta;
    }
    
    /*Abrir una imagen*/
    public byte[] AbrirAImagen(File archivo){
        byte[] bytesImg = new byte[1024*100];
        try {
            entrada = new FileInputStream(archivo);
            entrada.read(bytesImg);
        } catch (Exception e) {
        }
        return bytesImg;
    }
    
    /*Guardar imagen*/
    public String GuardarAImagen(File archivo, byte[] bytesImg){
        String respuesta=null;
        try {
            salida = new FileOutputStream(archivo);
            salida.write(bytesImg);
            respuesta = "La imagen se guardo con exito.";
        } catch (Exception e) {
        }
        return respuesta;
    }
}

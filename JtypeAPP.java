import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class JtypeAPP {
    // 1.Aplicacion jtype

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String Fichero = teclado.next();
        teclado.close();
        try(BufferedReader BR = new BufferedReader(new FileReader(Fichero))) {
            String Texto = BR.readLine();
            while (Texto != null) {
                System.out.println(Texto);
                Texto = BR.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Excepcion General");
        }
    }

}

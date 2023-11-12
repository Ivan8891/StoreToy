package org.example;

import java.io.FileWriter;
import java.io.IOException;

class Log{
    public static void log(String text){
        try (FileWriter writer = new FileWriter("prize.txt", true)){
            writer.write(text+"\n");
            System.out.println("Выйгрышь записан в файл");
        }catch (IOException e){
            System.out.println(e);
        }
    }
}

package com.yk1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class Main {
    public static void main(String[] args) throws IOException {

        try {
            FileInputStream inputStream = new FileInputStream("PATH");
        } catch (FileNotFoundException exception) {
            System.out.println("Все отлично мы ее поймали" + exception);
        }
        System.out.println("МЫ УВИДИМ ЭТОТ КОД");

        //try catch finally


    }
}
/*
thy[что мы хотим сделать]
catch[ лови эту ошибку] --> что делать

*/

// обработка ошибок! ! !
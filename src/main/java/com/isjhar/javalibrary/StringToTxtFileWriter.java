/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isjhar.javalibrary;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Isjhar-pc
 */
public class StringToTxtFileWriter 
{
    private StringToTxtFileWriter()
    {
        
    }
    
    public static void write(String fileName, String text) throws IOException
    {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(text);
        writer.close();
    }
}

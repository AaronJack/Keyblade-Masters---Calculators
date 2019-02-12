package com.company;
import java.io.*;
import java.util.ArrayList;
import java.io.FileWriter;
public class CsvWriter

{

    public static void problemLogger(String prob)

    {

        try
        {
            FileWriter sb = new FileWriter("data.csv", true);
            sb.append(System.getProperty("line.separator"));
            sb.write("Equation: ");
            sb.write(prob.toString());
            sb.append('\n');
            sb.flush();
            sb.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void solutionWriter(String sol)
    {
        try
        {
            FileWriter sb = new FileWriter("data.csv", true);
            sb.append(System.getProperty("line.separator"));
            sb.write("Solution: ");
            sb.write(sol.toString());
            sb.append('\n');
            sb.flush();
            sb.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void clearLogger()
    {
        try
        {
            FileWriter sb = new FileWriter("data.csv", true);
            sb.write("User has cleared data");
            sb.append(System.getProperty("line.separator"));
            sb.append('\n');
            sb.flush();
            sb.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

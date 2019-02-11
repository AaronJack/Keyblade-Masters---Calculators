package com.company;
import java.io.*;
import java.util.ArrayList;
import java.io.FileWriter;
public class CsvWriter
    //WRITES ON THE SAME LINE FIX IT SO IT STARTS A NEW LINE EACH TIME IT RUNS
{

    public static void problemLogger(String prob)   {

        try
        {
            FileWriter sb = new FileWriter("data.csv", true);
            sb.append(prob);
            sb.append(System.getProperty("line.separator"));
            sb.write("Equation: ");
            sb.write(sb.toString());
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
            sb.append(sol);
            sb.append(System.getProperty("line.separator"));
            sb.write("Solution: ");
            sb.write(sb.toString());
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
            sb.append(" User has cleared data ");
            sb.append(System.getProperty("line.separator"));
            sb.write(sb.toString());
            sb.flush();
            sb.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

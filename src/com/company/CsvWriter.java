package com.company;
import java.io.*;
import java.util.ArrayList;
public class CsvWriter
    //WRITES ON THE SAME LINE FIX IT SO IT STARTS A NEW LINE EACH TIME IT RUNS
{

    public void problemLogger(String prob) throws FileNotFoundException {

        try
        {
            FileWriter sb = new FileWriter("data.csv", true);
            sb.append(prob);
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
    public  void solutionWriter(String sol) throws FileNotFoundException
    {
        try
        {
            FileWriter sb = new FileWriter("data.csv", true);
            sb.append(sol);
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
    public void clearLogger()
    {
        try
        {
            FileWriter sb = new FileWriter("data.csv", true);
            sb.append("User has cleared data");
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

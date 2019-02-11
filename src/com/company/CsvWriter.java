package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class CsvWriter
    //WRITES ON THE SAME LINE FIX IT SO IT STARTS A NEW LINE EACH TIME IT RUNS
{
    public static void problemLogger(String prob)
    {
        try (PrintWriter writer = new PrintWriter(new File("data.csv")))
        {
            StringBuilder sb = new StringBuilder();
            sb.append(prob);
            sb.append(System.getProperty("line.separator"));
            writer.write(sb.toString());
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void solutionWriter(Double sol)
    {
        try (PrintWriter writer = new PrintWriter(new File("data.csv")))
        {
            StringBuilder sb = new StringBuilder();
            sb.append(sol);
            sb.append(System.getProperty("line.separator"));
            writer.write(sb.toString());
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void clearLogger()
    {
        try (PrintWriter writer = new PrintWriter(new File("data.csv")))
        {
            StringBuilder sb = new StringBuilder();
            sb.append("User has cleared data");
            sb.append(System.getProperty("line.separator"));
            writer.write(sb.toString());
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

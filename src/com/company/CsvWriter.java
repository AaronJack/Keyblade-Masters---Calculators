package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class CsvWriter
{
    public static void problemLogger(String prob)
    {
        try (PrintWriter writer = new PrintWriter(new File("data.csv")))
        {
            StringBuilder sb = new StringBuilder();
            sb.append(prob);
            writer.write(sb.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void solutionLogger(Double sol)
    {
        try (PrintWriter writer = new PrintWriter(new File("data.csv")))
        {
            StringBuilder sb = new StringBuilder();
            sb.append(sol);
            writer.write(sb.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

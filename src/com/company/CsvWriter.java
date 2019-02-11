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
    public static void solutionWriter(Double sol)
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
    public static void clearLogger()
    {
        try (PrintWriter writer = new PrintWriter(new File("data.csv")))
        {
            StringBuilder sb = new StringBuilder();
            sb.append("User has cleared data");
            writer.write(sb.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

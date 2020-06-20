package HomeWork5;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;

/*
Реализуйте метод readContent(String url), который отображает на экран
содержимое сайта, ссылка на который задаётся параметром url.

Напишите программу, считывающую из консоли строку (URL ресурса) и вызывающую
метод readContent. В том случае, если введённый URL неправильного формата
или нет доступа до указанного ресурса, пользователю предлагается повторить ввод.
*/

public class ReadContent {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String url;

        do {
            System.out.print("URL: > ");
            url = scanner.nextLine();

        } while (readContent(url)); // только тут в случае некорректного url вылетает Exception и программа вылетает.



    }

    private static boolean readContent(String url){
        boolean isNotExist = true;
        URL inputURL = null;

        try {
            inputURL = new URL(url);
        } catch (MalformedURLException e) {
            System.out.println("Неправильно введен адрес");
        }

        assert inputURL != null;
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(inputURL.openStream()));
            String inputLine;
            while ((inputLine = bf.readLine()) != null) {
                System.out.println(inputLine);
            }
            isNotExist = false;

        } catch (UnknownHostException e){
            System.out.println("Хост недоступен");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return isNotExist;
    }

}

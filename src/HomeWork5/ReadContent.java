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

        System.out.print("URL: > ");

        while (true){
            String url = scanner.nextLine();

            try {
                readContent(url);
                break;

            } catch (MalformedURLException e) {
                System.out.println("Неверный формат URL! Повторите ввод:");
                System.out.print("URL: > ");
            } catch (UnknownHostException e) {
                System.out.println("Хост недоступен");
                System.out.print("URL: > ");
            } catch (IOException e) {
                System.out.println("Ошибка соединения! Введите другой адрес:");
                System.out.print("URL: > ");
            }

        }

    }

    private static void readContent(String url) throws IOException{
        URL inputURL =  new URL(url);
        BufferedReader bf = new BufferedReader(new InputStreamReader(inputURL.openStream()));
        String inputLine;

        while ((inputLine = bf.readLine()) != null) {
                System.out.println(inputLine);
        }
    }
}

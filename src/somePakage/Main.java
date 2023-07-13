package somePakage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 * Створіть у пакеті текстовий файл і клас, внесіть у файл якийсь текст.
 * Виведіть на екран вміст файлу
 */


public class Main {
    public static void main(String[] args) throws IOException {
        String poem = "Як умру, то поховайте\n" +
                "Мене на могилі\n" +
                "Серед степу широкого\n" +
                "На Вкраїні милій,\n" +
                "Щоб лани широкополі,\n" +
                "І Дніпро, і кручі\n" +
                "Було видно, було чути,\n" +
                "Як реве ревучий.\n" +
                "Як понесе з України\n" +
                "У синєє море\n" +
                "Кров ворожу... отойді я\n" +
                "І лани і гори —\n" +
                "Все покину, і полину\n" +
                "До самого Бога\n" +
                "Молитися... а до того\n" +
                "Я не знаю Бога.\n" +
                "Поховайте та вставайте,\n" +
                "Кайдани порвіте\n" +
                "І вражою злою кров’ю\n" +
                "Волю окропіте.\n" +
                "І мене в сем’ї великій,\n" +
                "В сем’ї вольній, новій,\n" +
                "Не забудьте пом’янути\n" +
                "Незлим тихим словом.";

        FileWriter fileWriter = null;
        FileReader fileReader = null;

        try {
            fileWriter = new FileWriter("C:\\Users\\abalm\\odrive\\Google Drive IT\\IteaJavaPro\\TxtFile\\src\\somePakage\\SomeTxtFile.txt");
            for (int i = 0; i < poem.length(); i++) {
                fileWriter.write(poem.charAt(i));
            }
            System.out.println("Файл записаний!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileWriter.close();
        }

        try {
            fileReader = new FileReader("C:\\Users\\abalm\\odrive\\Google Drive IT\\IteaJavaPro\\TxtFile\\src\\somePakage\\SomeTxtFile.txt");
            int symbol = 0;
            while ((symbol = fileReader.read()) != -1) {
                System.out.print((char) symbol);
            }
            System.out.println();
            System.out.println("Файл прочитаний!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileReader.close();
        }
    }

}

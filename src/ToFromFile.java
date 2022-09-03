import java.io.*;

public class ToFromFile implements Export, Import {


    @Override
    public TaskList loadFromFile(File file) throws IOException {
        TaskList tasks = new TaskList();
        FileReader fileReader = new FileReader(file);
        while (fileReader.ready()){

        }
        return tasks;
    }

    @Override
    public void printToFile(File file, TaskList tasks) throws IOException {
        FileWriter fileWriter = new FileWriter(file,true);
        for (Task t: tasks) {
            fileWriter.write(String.valueOf(t));
            fileWriter.write(String.valueOf("-------------------------"));
        }
        fileWriter.flush();
        fileWriter.close();
    }



}

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class Json implements Import{
    public static StringBuilder convertToJson(TaskList taskList){
        StringBuilder res = new StringBuilder();
        res.append("{").append('\n');
        for (Task t: taskList) {
            res.append("{Id:").append(t.getId()).append('\n').
                    append("����� ��������:").append(t.getDateTask()).append('\n').
                    append("�������:").append(t.getDeadLine()).append('\n').
                    append("������������:").append(t.getUser()).append('\n').
                    append("���������:").append(t.getPriority()).append('\n').
                    append("������:").append(t.getWhatTheTask()).append('\n').append("}");
        }
        res.append('\n').append("}");
        return res;
    }


    @Override
    public void printToFile(File file, TaskList tasks) throws IOException {
        FileWriter fileWriter = new FileWriter(file,true);
        fileWriter.write(String.valueOf(Json.convertToJson(tasks)));
        fileWriter.flush();
        fileWriter.close();

    }
}

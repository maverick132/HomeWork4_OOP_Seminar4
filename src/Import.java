import java.io.File;
import java.io.IOException;

public interface Import<E> {
     void printToFile(File file, TaskList tasks) throws IOException;
}

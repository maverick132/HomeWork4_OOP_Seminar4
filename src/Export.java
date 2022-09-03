import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface Export<E> {
    TaskList loadFromFile(File file) throws IOException;
}

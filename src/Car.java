import java.io.Closeable;
import java.io.IOException;

public class Car implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("close");
    }

    @Override
    public String toString() {
        return "Car is going";
    }
}

package bolts;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;

public class AggregateException extends Exception {
    public List a;

    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        int i = -1;
        for (Throwable printStackTrace : this.a) {
            printStream.append("\n");
            printStream.append("  Inner throwable #");
            i++;
            printStream.append(Integer.toString(i));
            printStream.append(": ");
            printStackTrace.printStackTrace(printStream);
            printStream.append("\n");
        }
    }

    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        int i = -1;
        for (Throwable printStackTrace : this.a) {
            printWriter.append("\n");
            printWriter.append("  Inner throwable #");
            i++;
            printWriter.append(Integer.toString(i));
            printWriter.append(": ");
            printStackTrace.printStackTrace(printWriter);
            printWriter.append("\n");
        }
    }
}

package androidx.media3.datasource;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

public class HttpDataSource$HttpDataSourceException extends DataSourceException {
    public final int c;

    public HttpDataSource$HttpDataSourceException() {
        super(2008);
        this.c = 1;
    }

    public static int a(int i, int i2) {
        if (i == 2000 && i2 == 1) {
            return 2001;
        }
        return i;
    }

    public static HttpDataSource$HttpDataSourceException b(int i, IOException iOException) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !o54.P(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new HttpDataSource$HttpDataSourceException("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007) : new HttpDataSource$HttpDataSourceException(i2, i, iOException);
    }

    public HttpDataSource$HttpDataSourceException(String str, int i) {
        super(str, a(i, 1));
        this.c = 1;
    }

    public HttpDataSource$HttpDataSourceException(int i, int i2, IOException iOException) {
        super((Throwable) iOException, a(i, i2));
        this.c = i2;
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, int i) {
        super(str, iOException, a(i, 1));
        this.c = 1;
    }
}

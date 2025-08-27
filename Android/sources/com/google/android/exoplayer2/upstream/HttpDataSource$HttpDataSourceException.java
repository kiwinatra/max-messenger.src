package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

public class HttpDataSource$HttpDataSourceException extends DataSourceException {
    public HttpDataSource$HttpDataSourceException(String str, p74 p74, int i) {
        super(str, a(i, 1));
    }

    public static int a(int i, int i2) {
        if (i == 2000 && i2 == 1) {
            return 2001;
        }
        return i;
    }

    public static HttpDataSource$HttpDataSourceException b(IOException iOException, p74 p74, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !o54.P(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new HttpDataSource$HttpDataSourceException("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, p74, 2007) : new HttpDataSource$HttpDataSourceException(iOException, p74, i2, i);
    }

    public HttpDataSource$HttpDataSourceException(IOException iOException, p74 p74, int i, int i2) {
        super((Throwable) iOException, a(i, i2));
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, p74 p74, int i) {
        super(str, iOException, a(i, 1));
    }
}

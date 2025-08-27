package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/connection/RouteException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class RouteException extends RuntimeException {
    public IOException a;
    public final IOException b;

    public RouteException(IOException iOException) {
        super(iOException);
        this.b = iOException;
        this.a = iOException;
    }
}

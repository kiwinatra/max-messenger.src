package one.me.rlottie.network;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\n\u0010\t\u001a\u0004\u0018\u00010\nH&J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lone/me/rlottie/network/LottieFetchCall;", "Ljava/io/Closeable;", "isSuccessful", "", "()Z", "resultCode", "", "bodyByteStream", "Ljava/io/InputStream;", "error", "", "fileName", "rlottie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface LottieFetchCall extends Closeable {
    InputStream bodyByteStream() throws IOException;

    String error() throws IOException;

    String fileName() throws IOException;

    boolean isSuccessful();

    int resultCode() throws IOException;
}

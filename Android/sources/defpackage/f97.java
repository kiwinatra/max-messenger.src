package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import java.util.concurrent.Future;

/* renamed from: f97  reason: default package */
public final class f97 implements Closeable {
    public final URL a;
    public volatile Future b;
    public s7h c;

    public f97(URL url) {
        this.a = url;
    }

    public final void close() {
        this.b.cancel(true);
    }

    public final Bitmap m() {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.a;
        if (isLoggable) {
            Objects.toString(url);
        }
        URLConnection openConnection = url.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] o0 = tf6.o0(new tw0(inputStream));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    int length = o0.length;
                    Objects.toString(url);
                }
                if (o0.length <= 1048576) {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(o0, 0, o0.length);
                    if (decodeByteArray != null) {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Objects.toString(url);
                        }
                        return decodeByteArray;
                    }
                    throw new IOException("Failed to decode image: " + url);
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        throw th;
    }
}

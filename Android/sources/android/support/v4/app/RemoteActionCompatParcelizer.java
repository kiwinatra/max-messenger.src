package android.support.v4.app;

import androidx.core.app.RemoteActionCompat;

public final class RemoteActionCompatParcelizer extends androidx.core.app.RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(r2g r2g) {
        return androidx.core.app.RemoteActionCompatParcelizer.read(r2g);
    }

    public static void write(RemoteActionCompat remoteActionCompat, r2g r2g) {
        androidx.core.app.RemoteActionCompatParcelizer.write(remoteActionCompat, r2g);
    }
}

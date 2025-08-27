package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.work.WorkRequest;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: vp0  reason: default package */
public final class vp0 implements ServiceConnection {
    public boolean a = false;
    public final LinkedBlockingQueue b = new LinkedBlockingQueue();

    public final IBinder a(TimeUnit timeUnit) {
        vzg.l("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.a) {
            this.a = true;
            IBinder iBinder = (IBinder) this.b.poll(WorkRequest.MIN_BACKOFF_MILLIS, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.b.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}

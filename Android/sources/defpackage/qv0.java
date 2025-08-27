package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: qv0  reason: default package */
public final class qv0 extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ qv0(int i) {
        this.a = i;
    }

    public final Object initialValue() {
        switch (this.a) {
            case 0:
                return new ConcurrentLinkedQueue();
            case 1:
                return Boolean.FALSE;
            case 2:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(u0g.e);
                return simpleDateFormat;
            case 3:
                qv0 qv0 = r94.a;
                return ByteBuffer.allocate(16384);
            case 4:
                return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
            case 5:
                return new SimpleDateFormat("HH:mm:ss", Locale.US);
            case 6:
                return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
            case 7:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    return ryg.G();
                }
                if (Looper.myLooper() != null) {
                    return new ew6(new Handler(Looper.myLooper()));
                }
                return null;
            case 8:
                return new DecimalFormat("#,##0");
            case 9:
                return new DecimalFormat("#,##0.0");
            case 10:
                return Boolean.FALSE;
            default:
                return 0L;
        }
    }
}

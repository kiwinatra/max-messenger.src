package defpackage;

import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ime  reason: default package */
public final class ime {
    public static ime h;
    public static final long i = TimeUnit.MINUTES.toMillis(2);
    public volatile StatFs a = null;
    public volatile File b;
    public volatile StatFs c = null;
    public volatile File d;
    public long e;
    public final ReentrantLock f = new ReentrantLock();
    public volatile boolean g = false;

    public static StatFs b(StatFs statFs, File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        if (statFs == null) {
            try {
                statFs = new StatFs(file.getAbsolutePath());
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Throwable th) {
                n54.I(th);
                throw null;
            }
        } else {
            statFs.restat(file.getAbsolutePath());
        }
        return statFs;
    }

    public final void a() {
        if (!this.g) {
            this.f.lock();
            try {
                if (!this.g) {
                    this.b = Environment.getDataDirectory();
                    this.d = Environment.getExternalStorageDirectory();
                    this.a = b(this.a, this.b);
                    this.c = b(this.c, this.d);
                    this.e = SystemClock.uptimeMillis();
                    this.g = true;
                }
            } finally {
                this.f.unlock();
            }
        }
    }
}

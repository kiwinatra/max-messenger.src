package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: s15  reason: default package */
public final class s15 {
    public static final Object o = new Object();
    public static volatile s15 p;
    public final ReentrantReadWriteLock a;
    public final ws b;
    public volatile int c = 3;
    public final Handler d;
    public final o15 e;
    public final r15 f;
    public final o9a g;
    public final boolean h;
    public final boolean i;
    public final int[] j;
    public final boolean k;
    public final int l;
    public final int m;
    public final mf4 n;

    public s15(a96 a96) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.h = a96.b;
        this.i = a96.c;
        this.j = a96.d;
        this.k = a96.f;
        this.l = -16711936;
        r15 r15 = a96.a;
        this.f = r15;
        int i2 = a96.g;
        this.m = i2;
        this.n = a96.h;
        this.d = new Handler(Looper.getMainLooper());
        ws wsVar = new ws(0);
        this.b = wsVar;
        this.g = new o9a(11);
        ws wsVar2 = a96.e;
        if (wsVar2 != null && !wsVar2.isEmpty()) {
            wsVar.addAll(a96.e);
        }
        o15 o15 = new o15(this);
        this.e = o15;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                r15.h(new n15(o15));
            } catch (Throwable th2) {
                e(th2);
            }
        }
    }

    public static s15 a() {
        s15 s15;
        synchronized (o) {
            s15 = p;
            bs0.r("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", s15 != null);
        }
        return s15;
    }

    public static void c(a96 a96) {
        if (p == null) {
            synchronized (o) {
                try {
                    if (p == null) {
                        p = new s15(a96);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final int b() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void d() {
        bs0.r("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.m == 1);
        if (b() != 1) {
            this.a.writeLock().lock();
            try {
                if (this.c != 0) {
                    this.c = 0;
                    this.a.writeLock().unlock();
                    o15 o15 = this.e;
                    s15 s15 = (s15) o15.a;
                    try {
                        s15.f.h(new n15(o15));
                    } catch (Throwable th) {
                        s15.e(th);
                    }
                }
            } finally {
                this.a.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void e(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new cp((List) arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void f() {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 1;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new cp((List) arrayList, this.c, (Throwable) null));
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public final CharSequence g(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        boolean z;
        boolean z2 = false;
        bs0.r("Not initialized yet", b() == 1);
        if (i2 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        } else if (i3 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        } else if (i4 >= 0) {
            bs0.m("start should be <= than end", i2 <= i3);
            if (charSequence == null) {
                return null;
            }
            bs0.m("start should be < than charSequence length", i2 <= charSequence.length());
            bs0.m("end should be < than charSequence length", i3 <= charSequence.length());
            if (charSequence.length() == 0 || i2 == i3) {
                return charSequence;
            }
            if (i5 != 1) {
                if (i5 != 2) {
                    z2 = this.h;
                }
                z = z2;
            } else {
                z = true;
            }
            return this.e.c(charSequence, i2, i3, i4, z);
        } else {
            throw new IllegalArgumentException("maxEmojiCount cannot be negative");
        }
    }

    public final CharSequence h(CharSequence charSequence) {
        return g(0, charSequence == null ? 0 : charSequence.length(), charSequence, IntCompanionObject.MAX_VALUE, 0);
    }

    public final void i(q15 q15) {
        bs0.q(q15, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c != 1) {
                if (this.c != 2) {
                    this.b.add(q15);
                }
            }
            this.d.post(new cp(Arrays.asList(new q15[]{q15}), this.c, (Throwable) null));
        } finally {
            this.a.writeLock().unlock();
        }
    }
}

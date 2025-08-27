package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.io.ConstantsKt;
import one.me.rlottie.RLottieDrawable;

/* renamed from: g7a  reason: default package */
public final class g7a {
    public static g7a e;
    public int a;
    public Object b;
    public Object c;
    public Object d;

    public g7a(Context context) {
        this.b = new Handler(Looper.getMainLooper());
        this.c = new CopyOnWriteArrayList();
        this.d = new Object();
        this.a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new ao(11, this), intentFilter);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000e, code lost:
        r0 = ((java.util.concurrent.CopyOnWriteArrayList) r4.c).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        if (r0.hasNext() == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        r1 = (java.lang.ref.WeakReference) r0.next();
        r2 = (defpackage.uc4) r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r2 == null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        r2.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        ((java.util.concurrent.CopyOnWriteArrayList) r4.c).remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(int r3, defpackage.g7a r4) {
        /*
            java.lang.Object r0 = r4.d
            monitor-enter(r0)
            int r1 = r4.a     // Catch:{ all -> 0x0009 }
            if (r1 != r3) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            goto L_0x0036
        L_0x0009:
            r3 = move-exception
            goto L_0x0037
        L_0x000b:
            r4.a = r3     // Catch:{ all -> 0x0009 }
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            java.lang.Object r0 = r4.c
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            uc4 r2 = (defpackage.uc4) r2
            if (r2 == 0) goto L_0x002e
            r2.a(r3)
            goto L_0x0016
        L_0x002e:
            java.lang.Object r2 = r4.c
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            r2.remove(r1)
            goto L_0x0016
        L_0x0036:
            return
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g7a.a(int, g7a):void");
    }

    public static synchronized g7a c(Context context) {
        g7a g7a;
        synchronized (g7a.class) {
            try {
                if (e == null) {
                    e = new g7a(context);
                }
                g7a = e;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return g7a;
    }

    public lbe b(Resources resources, jbf jbf) {
        if0 if0 = (if0) this.d;
        if (if0 != null) {
            return lbe.h(if0);
        }
        Drawable drawable = (Drawable) this.c;
        if (drawable != null) {
            if0 if02 = new if0(drawable);
            this.d = if02;
            return lbe.h(if02);
        } else if (((Uri) this.b) == null) {
            if0 if03 = new if0(new ColorDrawable(this.a));
            this.d = if03;
            return lbe.h(if03);
        } else {
            wbe i = new mka(2, new h5(16, this)).i(new y3a(6, (Object) resources));
            jbf.getClass();
            kbf kbf = (kbf) jbf;
            return new tbe(i.n(kbf.a()).j(kbf.c()), new y3a(7, (Object) this), 3);
        }
    }

    public int d() {
        int i;
        synchronized (this.d) {
            i = this.a;
        }
        return i;
    }

    public int e() {
        int i = this.a;
        if (i == 2) {
            return 2048;
        }
        if (i != 3) {
            return 0;
        }
        return ConstantsKt.MINIMUM_BLOCK_SIZE;
    }

    public g7a(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        List list;
        this.b = str;
        this.a = i2;
        if (arrayList == null) {
            list = Collections.emptyList();
        } else {
            list = Collections.unmodifiableList(arrayList);
        }
        this.c = list;
        this.d = bArr;
    }

    public g7a(int i) {
        switch (i) {
            case 3:
                this.a = -1;
                this.b = null;
                this.c = null;
                return;
            default:
                this.a = 20;
                return;
        }
    }

    public g7a(RLottieDrawable rLottieDrawable) {
        this.d = rLottieDrawable;
    }
}

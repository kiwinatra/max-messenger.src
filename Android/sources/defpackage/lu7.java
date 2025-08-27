package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: lu7  reason: default package */
public final class lu7 implements fv7, ys1 {
    public final Object a = new Object();
    public final jv7 b;
    public final rv1 c;
    public boolean o = false;

    public lu7(jv7 jv7, rv1 rv1) {
        this.b = jv7;
        this.c = rv1;
        if (((lv7) jv7.getLifecycle()).d.a(iu7.o)) {
            rv1.e();
        } else {
            rv1.r();
        }
        jv7.getLifecycle().a(this);
    }

    public final qu1 b() {
        return this.c.A0;
    }

    public final jv7 e() {
        jv7 jv7;
        synchronized (this.a) {
            jv7 = this.b;
        }
        return jv7;
    }

    public final List h() {
        List unmodifiableList;
        synchronized (this.a) {
            unmodifiableList = Collections.unmodifiableList(this.c.v());
        }
        return unmodifiableList;
    }

    public final void o() {
        synchronized (this.a) {
            try {
                if (!this.o) {
                    onStop(this.b);
                    this.o = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @mma(hu7.ON_DESTROY)
    public void onDestroy(jv7 jv7) {
        synchronized (this.a) {
            rv1 rv1 = this.c;
            rv1.y((ArrayList) rv1.v());
        }
    }

    @mma(hu7.ON_PAUSE)
    public void onPause(jv7 jv7) {
        this.c.a.i(false);
    }

    @mma(hu7.ON_RESUME)
    public void onResume(jv7 jv7) {
        this.c.a.i(true);
    }

    @mma(hu7.ON_START)
    public void onStart(jv7 jv7) {
        synchronized (this.a) {
            try {
                if (!this.o) {
                    this.c.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @mma(hu7.ON_STOP)
    public void onStop(jv7 jv7) {
        synchronized (this.a) {
            try {
                if (!this.o) {
                    this.c.r();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            boolean r1 = r3.o     // Catch:{ all -> 0x0009 }
            if (r1 != 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0009:
            r3 = move-exception
            goto L_0x0027
        L_0x000b:
            r1 = 0
            r3.o = r1     // Catch:{ all -> 0x0009 }
            jv7 r1 = r3.b     // Catch:{ all -> 0x0009 }
            ju7 r1 = r1.getLifecycle()     // Catch:{ all -> 0x0009 }
            lv7 r1 = (defpackage.lv7) r1     // Catch:{ all -> 0x0009 }
            iu7 r1 = r1.d     // Catch:{ all -> 0x0009 }
            iu7 r2 = defpackage.iu7.o     // Catch:{ all -> 0x0009 }
            boolean r1 = r1.a(r2)     // Catch:{ all -> 0x0009 }
            if (r1 == 0) goto L_0x0025
            jv7 r1 = r3.b     // Catch:{ all -> 0x0009 }
            r3.onStart(r1)     // Catch:{ all -> 0x0009 }
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lu7.p():void");
    }
}

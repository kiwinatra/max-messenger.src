package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;

/* renamed from: s47  reason: default package */
public final class s47 implements mq4, v47 {
    public final Lazy a;
    public final String b;
    public final File c;
    public final jfd o;
    public final cla v;
    public final AtomicBoolean w = new AtomicBoolean();
    public long x;

    public s47(cla cla, Lazy lazy, String str, File file, jfd jfd) {
        this.a = lazy;
        this.b = str;
        this.c = file;
        this.o = jfd;
        this.v = cla;
    }

    public final void a() {
        if (!this.w.get()) {
            this.o.a(new q47(this, 1));
        }
    }

    public final void b(boolean z) {
        if (this.w.compareAndSet(false, true)) {
            jfd jfd = this.o;
            if (!jfd.f()) {
                jfd.dispose();
            }
            if (z) {
                z68.c("t47", "cancelDownload", new Object[0]);
                ((y47) this.a.getValue()).a(this.c, (String) null);
            }
        }
    }

    public final void d() {
        if (!this.w.get()) {
            this.o.a(new q47(this, 0));
        }
    }

    public final void dispose() {
        b(true);
    }

    public final void e(long j, float f) {
        if (!this.w.get()) {
            this.o.a(new r47(this, f, j, 0));
        }
    }

    public final boolean f() {
        return this.w.get();
    }

    public final String getDownloadContext() {
        return this.c.getAbsolutePath();
    }

    public final void h() {
    }

    public final void j(File file) {
        if (!this.w.get()) {
            this.o.a(new uo5(8, (Object) this, (Object) file));
        }
    }

    public final void l() {
        if (!this.w.get()) {
            this.o.a(new q47(this, 2));
        }
    }
}

package defpackage;

import java.io.File;

/* renamed from: as4  reason: default package */
public final /* synthetic */ class as4 implements qk3 {
    public final /* synthetic */ d20 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long o;
    public final /* synthetic */ File v;

    public /* synthetic */ as4(d20 d20, int i, long j, long j2, File file) {
        this.a = d20;
        this.b = i;
        this.c = j;
        this.o = j2;
        this.v = file;
    }

    public final void accept(Object obj) {
        j10 j10 = (j10) obj;
        j10.i = this.a;
        int i = this.b;
        j10.k = (float) i;
        j10.p = this.c;
        j10.o = this.o;
        File file = this.v;
        if (file != null && i == 100 && j10.r != null && file.exists()) {
            j10.u = file.lastModified();
            j10.m = file.getAbsolutePath();
        }
    }
}

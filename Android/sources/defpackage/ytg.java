package defpackage;

import com.my.tracker.obfuscated.e0;

/* renamed from: ytg  reason: default package */
public final /* synthetic */ class ytg implements Runnable {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ long w;
    public final /* synthetic */ Runnable x;

    public /* synthetic */ ytg(e0 e0Var, int i, byte[] bArr, boolean z, boolean z2, long j, Runnable runnable) {
        this.a = e0Var;
        this.b = i;
        this.c = bArr;
        this.o = z;
        this.v = z2;
        this.w = j;
        this.x = runnable;
    }

    public final void run() {
        this.a.a(this.b, this.c, this.o, this.v, this.w, this.x);
    }
}

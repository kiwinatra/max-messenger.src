package defpackage;

import com.my.tracker.obfuscated.e0;

/* renamed from: ttg  reason: default package */
public final /* synthetic */ class ttg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String o;
    public final /* synthetic */ long v;
    public final /* synthetic */ long w;
    public final /* synthetic */ long x;

    public /* synthetic */ ttg(e0 e0Var, String str, String str2, long j, long j2, long j3, int i) {
        this.a = i;
        this.b = e0Var;
        this.c = str;
        this.o = str2;
        this.v = j;
        this.w = j2;
        this.x = j3;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b(this.c, this.o, this.v, this.w, this.x);
                return;
            default:
                this.b.a(this.c, this.o, this.v, this.w, this.x);
                return;
        }
    }
}

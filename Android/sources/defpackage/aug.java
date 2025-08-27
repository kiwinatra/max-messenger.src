package defpackage;

import com.my.tracker.obfuscated.e0;
import com.my.tracker.obfuscated.o1;

/* renamed from: aug  reason: default package */
public final /* synthetic */ class aug implements Runnable {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ o1.a o;
    public final /* synthetic */ long v;

    public /* synthetic */ aug(e0 e0Var, long j, String str, o1.a aVar, long j2) {
        this.a = e0Var;
        this.b = j;
        this.c = str;
        this.o = aVar;
        this.v = j2;
    }

    public final void run() {
        this.a.a(this.b, this.c, this.o, this.v);
    }
}

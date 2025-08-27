package defpackage;

import com.my.tracker.obfuscated.e0;
import java.util.Map;

/* renamed from: utg  reason: default package */
public final /* synthetic */ class utg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ String o;
    public final /* synthetic */ String v;
    public final /* synthetic */ long w;

    public /* synthetic */ utg(e0 e0Var, String str, String str2, long j, Runnable runnable) {
        this.a = 2;
        this.b = e0Var;
        this.o = str;
        this.v = str2;
        this.w = j;
        this.c = runnable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b((Map) this.c, this.o, this.v, this.w);
                return;
            case 1:
                this.b.a((Map) this.c, this.o, this.v, this.w);
                return;
            default:
                this.b.a(this.o, this.v, this.w, (Runnable) this.c);
                return;
        }
    }

    public /* synthetic */ utg(e0 e0Var, Map map, String str, String str2, long j, int i) {
        this.a = i;
        this.b = e0Var;
        this.c = map;
        this.o = str;
        this.v = str2;
        this.w = j;
    }
}

package defpackage;

import com.my.tracker.obfuscated.e0;
import java.util.Map;

/* renamed from: vtg  reason: default package */
public final /* synthetic */ class vtg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ long o;

    public /* synthetic */ vtg(int i, long j, e0 e0Var, Map map) {
        this.a = i;
        this.b = e0Var;
        this.c = map;
        this.o = j;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b(this.c, this.o);
                return;
            default:
                this.b.a(this.c, this.o);
                return;
        }
    }
}

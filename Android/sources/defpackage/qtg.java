package defpackage;

import com.my.tracker.obfuscated.e0;
import java.util.List;

/* renamed from: qtg  reason: default package */
public final /* synthetic */ class qtg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;
    public final /* synthetic */ List c;

    public /* synthetic */ qtg(e0 e0Var, List list, int i) {
        this.a = i;
        this.b = e0Var;
        this.c = list;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b(this.c);
                return;
            default:
                this.b.a(this.c);
                return;
        }
    }
}

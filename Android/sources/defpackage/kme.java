package defpackage;

import java.util.LinkedHashSet;

/* renamed from: kme  reason: default package */
public final /* synthetic */ class kme implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ hug c;

    public /* synthetic */ kme(j09 j09, hug hug, int i) {
        this.a = i;
        this.b = j09;
        this.c = hug;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.m(this.c);
                return;
            default:
                ((LinkedHashSet) this.b.f).remove(this.c);
                return;
        }
    }
}

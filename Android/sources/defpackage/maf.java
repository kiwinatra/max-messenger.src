package defpackage;

import kotlin.Lazy;

/* renamed from: maf  reason: default package */
public final /* synthetic */ class maf implements qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ srd b;
    public final /* synthetic */ kv0 c;

    public /* synthetic */ maf(srd srd, kv0 kv0, int i) {
        this.a = i;
        this.b = srd;
        this.c = kv0;
    }

    public final void accept(Object obj) {
        kv0 kv0 = this.c;
        srd srd = this.b;
        switch (this.a) {
            case 0:
                srd.getClass();
                z68.a("a96", "Tam emoji font loaded");
                kv0.V((gq9) obj);
                return;
            default:
                Throwable th = (Throwable) obj;
                ((uta) ((m95) ((Lazy) srd.c).getValue())).c(new Exception("Can't load emoji font", th), true);
                kv0.U(th);
                return;
        }
    }
}

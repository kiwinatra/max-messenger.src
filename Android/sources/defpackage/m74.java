package defpackage;

import kotlin.Lazy;

/* renamed from: m74  reason: default package */
public final class m74 implements r2f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m74(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                return q8.s((Throwable) this.b);
            case 1:
                kp4 kp4 = (kp4) this.b;
                kp4.j.getClass();
                return kp4.j.getApplicationContext().getCacheDir();
            case 2:
                return ((po5) ((Lazy) this.b).getValue()).m();
            default:
                return this.b;
        }
    }

    public m74() {
        this.a = 0;
        this.b = p0.n;
    }
}

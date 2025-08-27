package defpackage;

import kotlin.Unit;

/* renamed from: ps1  reason: default package */
public final /* synthetic */ class ps1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ps1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                ((do1) this.b).b((Object) null);
                return;
            default:
                ugd ugd = (ugd) this.b;
                synchronized (ugd.b) {
                    ugd.c();
                    Unit unit = Unit.INSTANCE;
                }
                return;
        }
    }
}

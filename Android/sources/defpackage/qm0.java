package defpackage;

import kotlin.collections.CollectionsKt;

/* renamed from: qm0  reason: default package */
public final class qm0 implements dn4 {
    public final /* synthetic */ int a;
    public final Object b;

    public qm0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = f6e.a(CollectionsKt.listOf(new o94(0, new mgf("125.1.0.48"), hfc.ic_statusbar_call_24, new mgf("Версия SDK Звонков"), (ev0) null, 16)));
                return;
            default:
                this.b = new etc(f6e.a(CollectionsKt.emptyList()));
                return;
        }
    }

    private final void d(o94 o94) {
    }

    private final void e(o94 o94) {
    }

    public final ome a() {
        switch (this.a) {
            case 0:
                return (etc) this.b;
            default:
                return (xme) this.b;
        }
    }

    public final void b(o94 o94) {
        int i = this.a;
    }
}

package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: dfa  reason: default package */
public final /* synthetic */ class dfa implements Function0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ efa o;
    public final /* synthetic */ String v;
    public final /* synthetic */ Comparable w;

    public /* synthetic */ dfa(boolean z, String str, efa efa, a32 a32, String str2) {
        this.b = z;
        this.c = str;
        this.o = efa;
        this.w = a32;
        this.v = str2;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                boolean z = this.b;
                String str = this.c;
                if (z) {
                    return str;
                }
                return this.o.a(((a32) this.w).r(), this.v, str, true);
            default:
                boolean z2 = this.b;
                String str2 = this.c;
                return z2 ? str2 : this.o.a(this.v, (String) this.w, str2, true);
        }
    }

    public /* synthetic */ dfa(boolean z, String str, efa efa, String str2, String str3) {
        this.b = z;
        this.c = str;
        this.o = efa;
        this.v = str2;
        this.w = str3;
    }
}

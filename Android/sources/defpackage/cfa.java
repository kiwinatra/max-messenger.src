package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: cfa  reason: default package */
public final /* synthetic */ class cfa implements Function0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String o;
    public final /* synthetic */ efa v;
    public final /* synthetic */ String w;
    public final /* synthetic */ Comparable x;

    public /* synthetic */ cfa(boolean z, String str, String str2, efa efa, a32 a32, String str3) {
        this.b = z;
        this.c = str;
        this.o = str2;
        this.v = efa;
        this.x = a32;
        this.w = str3;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                boolean z = this.b;
                String str = this.o;
                if (z) {
                    return rae.q(new StringBuilder(), this.c, ": ", str);
                }
                return this.v.a(((a32) this.x).r(), this.w, str, false);
            default:
                boolean z2 = this.b;
                String str2 = this.o;
                return z2 ? rae.q(new StringBuilder(), this.c, ": ", str2) : this.v.a(this.w, (String) this.x, str2, false);
        }
    }

    public /* synthetic */ cfa(boolean z, String str, String str2, efa efa, String str3, String str4) {
        this.b = z;
        this.c = str;
        this.o = str2;
        this.v = efa;
        this.w = str3;
        this.x = str4;
    }
}

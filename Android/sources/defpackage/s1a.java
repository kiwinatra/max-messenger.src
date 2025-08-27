package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: s1a  reason: default package */
public final /* synthetic */ class s1a implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v1a b;

    public /* synthetic */ s1a(v1a v1a, int i) {
        this.a = i;
        this.b = v1a;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                v1a v1a = this.b;
                return new xcd(v1a.c, ((osa) v1a.o).b());
            default:
                v1a v1a2 = this.b;
                return new zcd(v1a2.c, ((osa) v1a2.o).b());
        }
    }
}

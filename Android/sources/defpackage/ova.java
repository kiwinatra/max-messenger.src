package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: ova  reason: default package */
public final /* synthetic */ class ova implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qva b;

    public /* synthetic */ ova(qva qva, int i) {
        this.a = i;
        this.b = qva;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return e14.a(((osa) this.b.h).b());
            default:
                qva qva = this.b;
                return new zcd(qva.g, ((osa) qva.h).b());
        }
    }
}

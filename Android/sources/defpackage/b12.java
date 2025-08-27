package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: b12  reason: default package */
public final class b12 {
    public final /* synthetic */ int a;

    public /* synthetic */ b12(int i) {
        this.a = i;
    }

    public static List a(ngf ngf, igf igf, a32 a32) {
        String h = a32.h(kl0.b, jl0.a);
        a32.m0();
        return CollectionsKt.listOf(new x72(ngf, igf, h, a32.v0, a32.g(), CollectionsKt.emptyList()));
    }

    public final List b(a32 a32) {
        switch (this.a) {
            case 0:
                return (a32 == null || !a32.K()) ? CollectionsKt.emptyList() : a32.c0() ? a(new igf(ewa.F0), new igf(ewa.E0), a32) : a32.a0() ? a(new mgf(a32.r()), new igf(ewa.G0), a32) : a(new mgf(a32.r()), new igf(ewa.H0), a32);
            default:
                if (a32 == null || !a32.L()) {
                    return CollectionsKt.emptyList();
                }
                mgf mgf = new mgf(a32.r());
                igf igf = new igf(ewa.L0);
                String h = a32.h(kl0.b, jl0.a);
                a32.m0();
                return CollectionsKt.listOf(new x72(mgf, igf, h, a32.v0, a32.g(), CollectionsKt.listOf(new igf(ewa.I0), new igf(ewa.J0), new igf(ewa.K0))));
        }
    }
}

package defpackage;

import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: bgd  reason: default package */
public final class bgd extends Lambda implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cgd b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ boolean o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bgd(cgd cgd, Serializable serializable, boolean z, int i) {
        super(0);
        this.a = i;
        this.b = cgd;
        this.c = serializable;
        this.o = z;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.d((Class) this.c, this.o);
            case 1:
                boolean z = this.o;
                return this.b.e((Class) this.c, z);
            default:
                return this.b.c((Pair) this.c, this.o);
        }
    }
}

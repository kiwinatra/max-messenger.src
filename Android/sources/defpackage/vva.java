package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;

/* renamed from: vva  reason: default package */
public final /* synthetic */ class vva implements Function1 {
    public final /* synthetic */ xva a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ wa9 o;
    public final /* synthetic */ gge v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;

    public /* synthetic */ vva(xva xva, int i, long j, wa9 wa9, gge gge, int i2, int i3) {
        this.a = xva;
        this.b = i;
        this.c = j;
        this.o = wa9;
        this.v = gge;
        this.w = i2;
        this.x = i3;
    }

    public final Object invoke(Object obj) {
        Object obj2;
        gge gge = this.v;
        int i = this.w;
        int i2 = this.x;
        zi ziVar = (zi) obj;
        xva xva = this.a;
        Context context = xva.a;
        ql8 ql8 = new ql8(((gk) xva.b.getValue()).i(this.c), 14);
        wa9 wa9 = this.o;
        int ordinal = wa9.ordinal();
        kj kjVar = jj.a;
        if (ordinal == 0) {
            try {
                Result.Companion companion = Result.Companion;
                obj2 = Result.m23constructorimpl(((k45) xva.d.getValue()).c(gge.subSequence(i, i2).toString()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.m23constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m29isFailureimpl(obj2)) {
                obj2 = null;
            }
            Drawable drawable = (Drawable) obj2;
            if (drawable != null) {
                kjVar = new ij(drawable);
            }
        } else if (ordinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        boolean z = wa9 == wa9.a;
        gc8 c2 = ((osa) ((gaf) xva.c.getValue())).c();
        int i3 = this.b;
        cl clVar = new cl(context, i3, ql8, kjVar, xva.g, z, c2);
        clVar.setBounds(0, 0, i3, i3);
        return clVar;
    }
}

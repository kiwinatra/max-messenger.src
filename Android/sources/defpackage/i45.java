package defpackage;

import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;

/* renamed from: i45  reason: default package */
public final class i45 extends xag {
    public static final /* synthetic */ KProperty[] Y = {rae.s(i45.class, "selectedFindJob", "getSelectedFindJob()Lkotlinx/coroutines/Job;", 0)};
    public final etc X;
    public final gj b;
    public final vs6 c;
    public final gaf o;
    public final Lazy v;
    public final xme w;
    public final etc x;
    public final wie y = o5a.U();
    public final xme z;

    public i45(Lazy lazy, gj gjVar, vs6 vs6, gaf gaf, gvc gvc) {
        this.b = gjVar;
        this.c = vs6;
        this.o = gaf;
        this.v = lazy;
        xme a = f6e.a(new g45(0, 0, 0, 7));
        this.w = a;
        this.x = new etc(a);
        xme a2 = f6e.a(new f45(CollectionsKt.emptyList(), CollectionsKt.emptyList()));
        this.z = a2;
        this.X = new etc(a2);
        z68.c(i45.class.getName(), "Load emoji. Start", new Object[0]);
        sbd sbd = new sbd(new c45(this, (Continuation) null));
        co1 h = kv0.h(gvc.b().a(CollectionsKt.listOf(cvc.EMOJI, cvc.ANIMOJI)));
        gk gkVar = (gk) lazy.getValue();
        gkVar.getClass();
        bs0.K(bs0.F(new ps5(bs0.u(sbd, h, new sbd(new yj(gkVar, (Continuation) null)), d45.a), new e45(this, (Continuation) null), 5), ((osa) gaf).b()), this.a);
    }

    public final n25 j(List list, hi hiVar, int i, int i2) {
        Drawable drawable;
        Object obj;
        hi hiVar2 = hiVar;
        Iterator it = list.iterator();
        while (true) {
            drawable = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) ((n25) obj).c, (Object) hiVar2.b)) {
                break;
            }
        }
        n25 n25 = (n25) obj;
        if (n25 != null) {
            drawable = n25.v;
        }
        long j = hiVar2.a;
        int roundToInt = MathKt.roundToInt(((float) 28) * vo4.c().getDisplayMetrics().density);
        gj gjVar = this.b;
        gjVar.getClass();
        Long valueOf = Long.valueOf(j);
        String str = hiVar2.c;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = hiVar2.e;
        if (str3 != null) {
            str2 = str3;
        }
        cl clVar = new cl(gjVar.b, roundToInt, f6e.a(new Triple(valueOf, str, str2)), drawable == null ? jj.a : new ij(drawable), gjVar.a);
        clVar.setBounds(0, 0, roundToInt, roundToInt);
        return new n25(i, n25 != null ? n25.b : i2, hiVar2.b, (List) null, clVar, hiVar2.a, 8);
    }

    public final void k(int i, Function1 function1) {
        aje u = ev0.u(this.a, ((osa) this.o).b(), f14.b, new h45(function1, i, this, (Continuation) null));
        this.y.setValue(this, Y[0], u);
    }
}

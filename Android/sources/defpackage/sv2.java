package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: sv2  reason: default package */
public final class sv2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ tw2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sv2(tw2 tw2, Continuation continuation) {
        super(2, continuation);
        this.b = tw2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        sv2 sv2 = new sv2(this.b, continuation);
        sv2.a = obj;
        return sv2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sv2) create((kx7) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        kx7 kx7 = (kx7) this.a;
        String name = this.b.getClass().getName();
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, name, "get result for link " + kx7, (Throwable) null);
        }
        if (kx7 instanceof vw7) {
            xag.h(this.b.K0, new v5a(new bb4(((vw7) kx7).a)));
        } else if (kx7 instanceof yw7) {
            xag.h(this.b.K0, new v5a(((yw7) kx7).a));
        } else if (kx7 instanceof cx7) {
            xag.h(this.b.K0, ox2.b.o1(((cx7) kx7).a));
        } else if (kx7 instanceof tw7) {
            s85 s85 = this.b.K0;
            ox2 ox2 = ox2.b;
            tw7 tw7 = (tw7) kx7;
            long j = tw7.a;
            String str = tw7.d;
            String str2 = tw7.b;
            boolean z = tw7.c;
            ox2.getClass();
            String str3 = ":join?id=" + j + "&link=" + str + "&channel=" + z;
            if (str2 != null) {
                str3 = str3 + "&title=" + str2;
            }
            a81.r(str3, s85);
        } else if (!(kx7 instanceof dx7)) {
            if (kx7 instanceof ex7) {
                xag.h(this.b.K0, ox2.b.o1(((ex7) kx7).a));
            } else if (kx7 instanceof gx7) {
                tw2 tw2 = this.b;
                tw2.o.i(((gx7) kx7).a, true, false, false, new s2(22, (Object) tw2, (Object) kx7));
            } else if (Intrinsics.areEqual((Object) kx7, (Object) ww7.a)) {
                xag.h(this.b.L0, new q8e(new igf(qad.E8)));
            } else if (kx7 instanceof hx7) {
                s85 s852 = this.b.K0;
                ox2 ox22 = ox2.b;
                long j2 = ((hx7) kx7).a;
                ox22.getClass();
                a81.r(":stickers/set?set_id=" + j2, s852);
            }
        }
        return Unit.INSTANCE;
    }
}

package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: h8a  reason: default package */
public final class h8a extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ NeuroAvatarsScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h8a(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.b = neuroAvatarsScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        h8a h8a = new h8a(continuation, this.b);
        h8a.a = obj;
        return h8a;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h8a) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        List list = (List) this.a;
        KProperty[] kPropertyArr = NeuroAvatarsScreen.K0;
        NeuroAvatarsScreen neuroAvatarsScreen = this.b;
        neuroAvatarsScreen.getClass();
        int i = 8;
        int i2 = 0;
        ((r8a) neuroAvatarsScreen.v0.getValue(neuroAvatarsScreen, NeuroAvatarsScreen.K0[8])).setVisibility(list.isEmpty() ? 0 : 8);
        c2b g0 = neuroAvatarsScreen.g0();
        if (!list.isEmpty()) {
            i = 0;
        }
        g0.setVisibility(i);
        c2b g02 = neuroAvatarsScreen.g0();
        neuroAvatarsScreen.I0.getClass();
        g02.k();
        for (Object next : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            b2b b2b = new b2b(g02.getContext());
            b2b.setTabItem((woa) next);
            o8f i4 = g02.i();
            i4.f = b2b;
            i4.c();
            g02.b(i4, g02.b.isEmpty());
            i2 = i3;
        }
        return Unit.INSTANCE;
    }
}

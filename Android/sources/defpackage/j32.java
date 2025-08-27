package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.profile.screens.members.ChatAdminsScreen;
import one.me.sdk.arch.Widget;

/* renamed from: j32  reason: default package */
public final class j32 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatAdminsScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j32(ChatAdminsScreen chatAdminsScreen, Continuation continuation) {
        super(2, continuation);
        this.b = chatAdminsScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        j32 j32 = new j32(this.b, continuation);
        j32.a = obj;
        return j32;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j32) create((g49) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        g49 g49 = (g49) this.a;
        boolean z = g49 instanceof c49;
        ChatAdminsScreen chatAdminsScreen = this.b;
        if (z) {
            r4c r4c = r4c.b;
            KProperty[] kPropertyArr = ChatAdminsScreen.Z;
            long d0 = chatAdminsScreen.d0();
            long j = ((c49) g49).a;
            r4c.getClass();
            r4c.Y0(r4c.p1(d0, j));
        } else if (g49 instanceof b49) {
            b49 b49 = (b49) g49;
            int i = b49.a;
            KProperty[] kPropertyArr2 = ChatAdminsScreen.Z;
            chatAdminsScreen.getClass();
            if (i == jxa.p0) {
                q32 c0 = chatAdminsScreen.c0();
                long j2 = b49.b;
                bs0.K(bs0.F(new sbd(new n32(((eu3) c0.o.getValue()).c(j2), (Continuation) null, c0, j2)), ((osa) ((gaf) c0.v.getValue())).b()), c0.a);
            }
        } else if (g49 instanceof d49) {
            if (((d49) g49).a == jxa.t0) {
                r4c r4c2 = r4c.b;
                KProperty[] kPropertyArr3 = ChatAdminsScreen.Z;
                long d02 = chatAdminsScreen.d0();
                ta4 W0 = r4c2.W0();
                W0.b(":profile/add-admins?chat_id=" + d02, (Bundle) null);
            }
        } else if (g49 instanceof f49) {
            if (((Boolean) chatAdminsScreen.x.getValue()).booleanValue()) {
                r4c r4c3 = r4c.b;
                long d03 = chatAdminsScreen.d0();
                long longValue = ((Number) chatAdminsScreen.y.getValue()).longValue();
                r4c3.getClass();
                r4c3.Y0(r4c.p1(d03, longValue));
            } else {
                e0b e0b = new e0b((Widget) chatAdminsScreen);
                e0b.i(q8.p(qad.E8, chatAdminsScreen.getContext()));
                e0b.j();
            }
        } else if (!(g49 instanceof e49)) {
            throw new NoWhenBranchMatchedException();
        } else if (((Boolean) chatAdminsScreen.x.getValue()).booleanValue()) {
            r4c r4c4 = r4c.b;
            long d04 = chatAdminsScreen.d0();
            long j3 = ((e49) g49).a;
            r4c4.getClass();
            r4c4.Y0(r4c.p1(d04, j3));
        } else {
            e0b e0b2 = new e0b((Widget) chatAdminsScreen);
            a32 j4 = chatAdminsScreen.c0().j();
            e0b2.i((j4 == null || !j4.K()) ? q8.p(qad.o1, chatAdminsScreen.getContext()) : q8.p(qad.I0, chatAdminsScreen.getContext()));
            e0b2.j();
        }
        return Unit.INSTANCE;
    }
}

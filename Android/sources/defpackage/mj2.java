package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.profile.screens.members.compact.ChatMembersCompactWidget;
import one.me.sdk.arch.Widget;

/* renamed from: mj2  reason: default package */
public final class mj2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatMembersCompactWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mj2(ChatMembersCompactWidget chatMembersCompactWidget, Continuation continuation) {
        super(2, continuation);
        this.b = chatMembersCompactWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        mj2 mj2 = new mj2(this.b, continuation);
        mj2.a = obj;
        return mj2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mj2) create((g49) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        g49 g49 = (g49) this.a;
        if (g49 instanceof c49) {
            r4c.b.s1(((c49) g49).a);
        } else {
            boolean z = g49 instanceof b49;
            ChatMembersCompactWidget chatMembersCompactWidget = this.b;
            if (z) {
                b49 b49 = (b49) g49;
                int i = b49.a;
                KProperty[] kPropertyArr = ChatMembersCompactWidget.x;
                chatMembersCompactWidget.getClass();
                int i2 = jxa.s0;
                long j = b49.b;
                if (i == i2) {
                    i49 e0 = chatMembersCompactWidget.e0();
                    e0.x.setValue(SetsKt.setOf(Long.valueOf(j)));
                } else if (i == jxa.r0) {
                    lk2 d0 = chatMembersCompactWidget.d0();
                    xag.g(d0, ((osa) ((gaf) d0.w.getValue())).b(), (f14) null, new hk2(d0, j, (Continuation) null), 2);
                }
            } else if (g49 instanceof d49) {
                int i3 = ((d49) g49).a;
                if (i3 == jxa.u0) {
                    r4c r4c = r4c.b;
                    KProperty[] kPropertyArr2 = ChatMembersCompactWidget.x;
                    r4c.n1(chatMembersCompactWidget.c0());
                } else if (i3 == jxa.D0) {
                    r4c r4c2 = r4c.b;
                    KProperty[] kPropertyArr3 = ChatMembersCompactWidget.x;
                    r4c2.q1(chatMembersCompactWidget.c0());
                } else if (i3 == jxa.X0) {
                    r4c r4c3 = r4c.b;
                    KProperty[] kPropertyArr4 = ChatMembersCompactWidget.x;
                    r4c3.r1(chatMembersCompactWidget.c0(), "MEMBER");
                }
            } else if (g49 instanceof e49) {
                r4c.b.s1(((e49) g49).a);
            } else if (g49 instanceof f49) {
                e0b e0b = new e0b((Widget) chatMembersCompactWidget);
                e0b.i(q8.p(qad.E8, chatMembersCompactWidget.getContext()));
                e0b.j();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }
}

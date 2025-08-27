package defpackage;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l82  reason: default package */
public final class l82 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ nz4 b;
    public final /* synthetic */ m82 c;
    public final /* synthetic */ a32 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l82(nz4 nz4, m82 m82, a32 a32, Continuation continuation) {
        super(2, continuation);
        this.b = nz4;
        this.c = m82;
        this.o = a32;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new l82(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l82) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Long l;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        a32 a32 = this.o;
        String str = null;
        m82 m82 = this.c;
        nz4 nz4 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str2 = nz4.d;
            nz4 nz42 = (nz4) m82.j.getValue();
            if (!Intrinsics.areEqual((Object) str2, (Object) nz42 != null ? nz42.d : null) && nz4.d != null) {
                lz1 lz1 = (lz1) m82.w.getValue();
                long j = a32.a;
                this.a = 1;
                lz1.getClass();
                String name = lz1.class.getName();
                z68.c(name, "changeChatTitle, chatId = " + j, new Object[0]);
                Lazy lazy = lz1.c;
                ((my2) ((qx2) lazy.getValue())).n().d(j, x62.a);
                String str3 = nz4.d;
                a32 h = ((my2) ((qx2) lazy.getValue())).h(j, new iz1(str3, 1));
                if (h != null) {
                    ((sv0) lz1.b.getValue()).c(new xy2(CollectionsKt.listOf(Boxing.boxLong(j)), false, false, (bl4) null, (zub) null, 124));
                    l = Boxing.boxLong(((jna) ((rl) lz1.a.getValue())).p(j, h.b.a, str3, (String) null, (a20) null));
                } else {
                    l = Boxing.boxLong(0);
                }
                if (l == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str4 = nz4.f;
        nz4 nz43 = (nz4) m82.j.getValue();
        if (nz43 != null) {
            str = nz43.f;
        }
        if (!Intrinsics.areEqual((Object) str4, (Object) str)) {
            ((jna) ((rl) m82.r.getValue())).q(a32.a, nz4.f, a32.b.a);
        }
        return Unit.INSTANCE;
    }
}

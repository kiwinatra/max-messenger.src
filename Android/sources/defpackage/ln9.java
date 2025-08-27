package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: ln9  reason: default package */
public final class ln9 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AtomicInteger c;
    public final /* synthetic */ MessagesListWidget o;
    public final /* synthetic */ Ref.ObjectRef v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ln9(Continuation continuation, AtomicInteger atomicInteger, MessagesListWidget messagesListWidget, Ref.ObjectRef objectRef) {
        super(2, continuation);
        this.c = atomicInteger;
        this.o = messagesListWidget;
        this.v = objectRef;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ln9 ln9 = new ln9(continuation, this.c, this.o, this.v);
        ln9.b = obj;
        return ln9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ln9) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: hid} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.a
            one.me.messages.list.ui.MessagesListWidget r2 = r10.o
            r3 = 1
            if (r1 == 0) goto L_0x001d
            if (r1 != r3) goto L_0x0015
            java.lang.Object r10 = r10.b
            hid r10 = (defpackage.hid) r10
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0067
        L_0x0015:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x001d:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.b
            r8 = r11
            hid r8 = (defpackage.hid) r8
            java.util.concurrent.atomic.AtomicInteger r11 = r10.c
            int r7 = r11.incrementAndGet()
            kotlin.reflect.KProperty[] r11 = one.me.messages.list.ui.MessagesListWidget.R0
            one.me.messages.list.ui.recycler.MessagesLayoutManager r11 = r2.e0()
            int r11 = r11.w()
            kotlin.jvm.internal.Ref$ObjectRef r1 = r10.v
            if (r11 != 0) goto L_0x0053
            sa3 r11 = defpackage.kne.b()
            r1.element = r11
            one.me.messages.list.ui.recycler.MessagesLayoutManager r11 = r2.e0()
            mn9 r0 = new mn9
            kotlin.jvm.internal.Ref$ObjectRef r9 = r10.v
            one.me.messages.list.ui.MessagesListWidget r5 = r10.o
            java.util.concurrent.atomic.AtomicInteger r6 = r10.c
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            r11.s1(r0)
            goto L_0x006b
        L_0x0053:
            T r11 = r1.element
            ra3 r11 = (defpackage.ra3) r11
            if (r11 == 0) goto L_0x0068
            r10.b = r8
            r10.a = r3
            sa3 r11 = (defpackage.sa3) r11
            java.lang.Object r10 = r11.a(r10)
            if (r10 != r0) goto L_0x0066
            return r0
        L_0x0066:
            r10 = r8
        L_0x0067:
            r8 = r10
        L_0x0068:
            one.me.messages.list.ui.MessagesListWidget.c0(r2, r8)
        L_0x006b:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ln9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

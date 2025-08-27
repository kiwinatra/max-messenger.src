package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.chatscreen.ChatScreen;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: qm2  reason: default package */
public final class qm2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qm2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.b = chatScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        qm2 qm2 = new qm2(continuation, this.b);
        qm2.a = obj;
        return qm2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qm2) create((o85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        xr8 xr8;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = ChatScreen.d1;
        ChatScreen chatScreen = this.b;
        chatScreen.getClass();
        int ordinal = ((pg9) ((o85) this.a).a).a.ordinal();
        if (ordinal != 0) {
            ik9 ik9 = ik9.a;
            if (ordinal == 1) {
                a32 a32 = (a32) chatScreen.B0().Q0.a.getValue();
                if (a32 != null) {
                    KProperty[] kPropertyArr2 = ChatScreen.d1;
                    KProperty kProperty = kPropertyArr2[10];
                    ReadOnlyProperty readOnlyProperty = chatScreen.N0;
                    if (!((e9d) readOnlyProperty.getValue(chatScreen, kProperty)).n()) {
                        MediaKeyboardWidget mediaKeyboardWidget = new MediaKeyboardWidget(chatScreen.F0, a32.a, false, 4, (DefaultConstructorMarker) null);
                        mediaKeyboardWidget.o = chatScreen.T0;
                        ((e9d) readOnlyProperty.getValue(chatScreen, kPropertyArr2[10])).R(iq.n(mediaKeyboardWidget, (ey3) null, (ey3) null));
                    }
                    int i = pq7.a;
                    if (pq7.b(pq7.c)) {
                        xag.h(chatScreen.s0().y, ik9);
                    }
                    if (chatScreen.E0()) {
                        gag.l(chatScreen.n0(), (n22) null);
                        gag.l((oz1) chatScreen.G0.getValue(chatScreen, kPropertyArr2[3]), (n22) null);
                        v9g.u(chatScreen.n0(), (vla) null);
                    }
                    mz2 y0 = chatScreen.y0();
                    y0.getClass();
                    y0.a.P(CollectionsKt.emptyList(), (ey3) null);
                    xr8 xr82 = chatScreen.O0;
                    if (xr82 != null) {
                        xr82.f();
                    }
                }
            } else if (ordinal == 2) {
                xr8 xr83 = chatScreen.O0;
                if (xr83 != null && xr83.l) {
                    xag.h(chatScreen.s0().y, ik9);
                }
                MessageWriteWidget r0 = chatScreen.r0();
                if (r0 != null) {
                    r0.d0().e(true);
                }
                o5a.O(new ps5(bs0.Y(new pc(pq7.f, 28), 1), new wm2((Continuation) null, chatScreen), 5), chatScreen.getViewLifecycleScope());
            } else if (ordinal == 3 && (xr8 = chatScreen.O0) != null && xr8.l) {
                xag.h(chatScreen.s0().y, ik9);
            }
        } else {
            xr8 xr84 = chatScreen.O0;
            if (xr84 != null) {
                KProperty[] kPropertyArr3 = xr8.m;
                xr84.e(true);
            }
        }
        return Unit.INSTANCE;
    }
}

package defpackage;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: nn9  reason: default package */
public final class nn9 extends SuspendLambda implements Function2 {
    public final /* synthetic */ long a;
    public final /* synthetic */ String b;
    public final /* synthetic */ MotionEvent c;
    public final /* synthetic */ MessagesListWidget o;
    public final /* synthetic */ szf v;
    public final /* synthetic */ sy7 w;
    public final /* synthetic */ View x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nn9(long j, String str, MotionEvent motionEvent, MessagesListWidget messagesListWidget, szf szf, sy7 sy7, ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.a = j;
        this.b = str;
        this.c = motionEvent;
        this.o = messagesListWidget;
        this.v = szf;
        this.w = sy7;
        this.x = viewGroup;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new nn9(this.a, this.b, this.c, this.o, this.v, this.w, (ViewGroup) this.x, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nn9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Collection collection;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Pair pair = TuplesKt.to("messages:context_menu:message_id", Boxing.boxLong(this.a));
        String str = this.b;
        Bundle f = o54.f(pair, TuplesKt.to("messages:context_menu:link_url", str));
        lw3 p = m58.b(ix3.a).p();
        MotionEvent motionEvent = this.c;
        lw3 n = p.i(motionEvent.getRawX(), motionEvent.getRawY()).m(f).n(new mgf(str));
        KProperty[] kPropertyArr = MessagesListWidget.R0;
        MessagesListWidget messagesListWidget = this.o;
        messagesListWidget.k0().getClass();
        int ordinal = this.v.ordinal();
        if (ordinal == 0) {
            collection = CollectionsKt.listOf(new ow3(this.w == sy7.v ? cwa.S : cwa.R, (ngf) new igf(ewa.R0), Integer.valueOf(cad.G0), (Integer) null, 20), new ow3(cwa.Q, (ngf) new igf(ewa.O0), Integer.valueOf(cad.v), (Integer) null, 20));
        } else if (ordinal == 1) {
            collection = CollectionsKt.listOf(new ow3(cwa.R, (ngf) new igf(ewa.T0), Integer.valueOf(cad.c0), (Integer) null, 20), new ow3(cwa.Q, (ngf) new igf(ewa.Q0), Integer.valueOf(cad.v), (Integer) null, 20));
        } else if (ordinal == 2) {
            collection = CollectionsKt.listOf(new ow3(cwa.R, (ngf) new igf(ewa.S0), Integer.valueOf(cad.G0), (Integer) null, 20), new ow3(cwa.Q, (ngf) new igf(ewa.P0), Integer.valueOf(cad.v), (Integer) null, 20));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        n.h(collection).build().o(messagesListWidget);
        b0h.K(this.x, rw6.LONG_PRESS);
        return Unit.INSTANCE;
    }
}

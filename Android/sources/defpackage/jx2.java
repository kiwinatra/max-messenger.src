package defpackage;

import android.view.View;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chats.list.ChatsListWidget;

/* renamed from: jx2  reason: default package */
public final class jx2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ChatsListWidget b;
    public final /* synthetic */ long c;
    public final /* synthetic */ View o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jx2(ChatsListWidget chatsListWidget, long j, View view, Continuation continuation) {
        super(2, continuation);
        this.b = chatsListWidget;
        this.c = j;
        this.o = view;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new jx2(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jx2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        List list = null;
        long j = this.c;
        ChatsListWidget chatsListWidget = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            KProperty[] kPropertyArr = ChatsListWidget.I0;
            tw2 f0 = chatsListWidget.f0();
            this.a = 1;
            obj = ev0.I(((osa) f0.w).a(), new rv2(f0, j, (Continuation) null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!((List) obj).isEmpty()) {
            list = obj;
        }
        List list2 = list;
        if (list2 != null) {
            Long boxLong = Boxing.boxLong(j);
            KProperty[] kPropertyArr2 = ChatsListWidget.I0;
            chatsListWidget.getClass();
            KProperty kProperty = ChatsListWidget.I0[0];
            chatsListWidget.c.b(chatsListWidget, boxLong);
            lw3 o2 = m58.b(ix3.b).h(list2).o(this.o);
            ChatsListWidget.c0(chatsListWidget, o2);
            o2.build().o(chatsListWidget);
        }
        return Unit.INSTANCE;
    }
}

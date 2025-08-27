package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.chats.search.ChatsListSearchScreen;

/* renamed from: ru2  reason: default package */
public final class ru2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ChatsListSearchScreen b;
    public final /* synthetic */ long c;
    public final /* synthetic */ View o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ru2(ChatsListSearchScreen chatsListSearchScreen, long j, View view, Continuation continuation) {
        super(2, continuation);
        this.b = chatsListSearchScreen;
        this.c = j;
        this.o = view;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ru2(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ru2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        long j = this.c;
        ChatsListSearchScreen chatsListSearchScreen = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            KProperty[] kPropertyArr = ChatsListSearchScreen.F0;
            ov2 d0 = chatsListSearchScreen.d0();
            this.a = 1;
            obj = ev0.I(((osa) d0.x).a(), new xu2(d0, j, (Continuation) null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Long boxLong = Boxing.boxLong(j);
        KProperty[] kPropertyArr2 = ChatsListSearchScreen.F0;
        chatsListSearchScreen.getClass();
        KProperty kProperty = ChatsListSearchScreen.F0[0];
        chatsListSearchScreen.o.b(chatsListSearchScreen, boxLong);
        float f = (float) 6;
        m58.b(ix3.b).h((List) obj).o(this.o).e(new Rect(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 0, MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), 0), vo4.c().getDisplayMetrics().density * 12.0f).build().o(chatsListSearchScreen);
        return Unit.INSTANCE;
    }
}

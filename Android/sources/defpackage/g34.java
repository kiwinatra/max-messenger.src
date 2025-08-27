package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import ru.ok.messages.channels.CreateChannelFragment;
import ru.ok.messages.channels.CreateChannelViewModel;

/* renamed from: g34  reason: default package */
public final class g34 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ boolean c = false;
    public final /* synthetic */ CreateChannelFragment o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g34(etc etc, Continuation continuation, CreateChannelFragment createChannelFragment) {
        super(2, continuation);
        this.b = etc;
        this.o = createChannelFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        g34 g34 = new g34((etc) this.b, continuation, this.o);
        g34.a = obj;
        return g34;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g34) create((o85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CreateChannelFragment createChannelFragment = this.o;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Object a2 = ((o85) this.a).a();
        if (Result.m26exceptionOrNullimpl(a2) != null) {
            return Unit.INSTANCE;
        }
        try {
            Unit unit = (Unit) a2;
            CreateChannelFragment.h3(createChannelFragment.D1);
            CreateChannelViewModel i3 = createChannelFragment.i3();
            i3.getClass();
            KProperty[] kPropertyArr = CreateChannelViewModel.G;
            KProperty kProperty = kPropertyArr[0];
            CreateChannelViewModel i32 = createChannelFragment.i3();
            i32.getClass();
            KProperty kProperty2 = kPropertyArr[3];
            CreateChannelViewModel i33 = createChannelFragment.i3();
            createChannelFragment.j3((String) i3.h.getValue(i3, kProperty), (RectF) i32.k.getValue(i32, kProperty2), (Rect) i33.l.getValue(i33, kPropertyArr[4]));
            obj2 = Result.m23constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            obj2 = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        if (!this.c) {
            ResultKt.throwOnFailure(obj2);
        }
        return Unit.INSTANCE;
    }
}

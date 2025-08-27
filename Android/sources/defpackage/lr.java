package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.appearancesettings.AppearanceSettingsScreen;

/* renamed from: lr  reason: default package */
public final class lr extends SuspendLambda implements Function2 {
    public u32 a;
    public int b;
    public final /* synthetic */ u32 c;
    public final /* synthetic */ AppearanceSettingsScreen o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lr(u32 u32, AppearanceSettingsScreen appearanceSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.c = u32;
        this.o = appearanceSettingsScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new lr(this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lr) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        u32 u32;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            KProperty[] kPropertyArr = AppearanceSettingsScreen.y;
            as c0 = this.o.c0();
            u32 u322 = this.c;
            this.a = u322;
            this.b = 1;
            obj = c0.k(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            u32 = u322;
        } else if (i == 1) {
            u32 = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        u32.a((ul2) obj);
        return Unit.INSTANCE;
    }
}

package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: f93  reason: default package */
public final class f93 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ ol3 b;
    public /* synthetic */ k2b c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f93(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.a = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ol3 ol3 = (ol3) obj;
        k2b k2b = (k2b) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.a) {
            case 0:
                f93 f93 = new f93(3, continuation, 0);
                f93.b = ol3;
                f93.c = k2b;
                return f93.invokeSuspend(Unit.INSTANCE);
            default:
                f93 f932 = new f93(3, continuation, 1);
                f932.b = ol3;
                f932.c = k2b;
                return f932.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                ol3 ol3 = this.b;
                int i2 = this.c.c().i;
                ol3.setBackground(new RippleDrawable(ColorStateList.valueOf(i2), (Drawable) null, new ColorDrawable(-65536)));
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                ol3 ol32 = this.b;
                int i3 = this.c.c().i;
                ol32.setBackground(new RippleDrawable(ColorStateList.valueOf(i3), (Drawable) null, new ColorDrawable(-65536)));
                return Unit.INSTANCE;
        }
    }
}

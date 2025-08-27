package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: tb2  reason: default package */
public final class tb2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ vb2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tb2(vb2 vb2, Continuation continuation) {
        super(2, continuation);
        this.b = vb2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        tb2 tb2 = new tb2(this.b, continuation);
        tb2.a = obj;
        return tb2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tb2) create((k2b) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        k2b k2b = (k2b) this.a;
        vb2 vb2 = this.b;
        if (vb2.l.isInitialized()) {
            Lazy lazy = vb2.l;
            iq.a0((Drawable) lazy.getValue(), k2b.getIcon().i);
            ((Drawable) lazy.getValue()).invalidateSelf();
        }
        Lazy lazy2 = vb2.m;
        if (lazy2.isInitialized()) {
            iq.a0((Drawable) lazy2.getValue(), k2b.getIcon().i);
            ((Drawable) lazy2.getValue()).invalidateSelf();
        }
        Lazy lazy3 = vb2.n;
        if (lazy3.isInitialized()) {
            iq.a0((Drawable) lazy3.getValue(), k2b.getIcon().i);
            ((Drawable) lazy3.getValue()).invalidateSelf();
        }
        Lazy lazy4 = vb2.o;
        if (lazy4.isInitialized()) {
            iq.a0((Drawable) lazy4.getValue(), k2b.getIcon().i);
            ((Drawable) lazy4.getValue()).invalidateSelf();
        }
        Lazy lazy5 = vb2.p;
        if (lazy5.isInitialized()) {
            iq.a0((Drawable) lazy5.getValue(), k2b.getIcon().i);
            ((Drawable) lazy5.getValue()).invalidateSelf();
        }
        Lazy lazy6 = vb2.q;
        if (lazy6.isInitialized()) {
            iq.a0((Drawable) lazy6.getValue(), k2b.getIcon().i);
            ((Drawable) lazy6.getValue()).invalidateSelf();
        }
        Lazy lazy7 = vb2.r;
        if (lazy7.isInitialized()) {
            iq.a0((Drawable) lazy7.getValue(), k2b.getIcon().i);
            ((Drawable) lazy7.getValue()).invalidateSelf();
        }
        Lazy lazy8 = vb2.s;
        if (lazy8.isInitialized()) {
            iq.a0((Drawable) lazy8.getValue(), k2b.getIcon().c);
            ((Drawable) lazy8.getValue()).invalidateSelf();
        }
        Lazy lazy9 = vb2.t;
        if (lazy9.isInitialized()) {
            iq.a0((Drawable) lazy9.getValue(), k2b.getIcon().c);
            ((Drawable) lazy9.getValue()).invalidateSelf();
        }
        Lazy lazy10 = vb2.u;
        if (lazy10.isInitialized()) {
            iq.a0((Drawable) lazy10.getValue(), k2b.getIcon().b);
            ((Drawable) lazy10.getValue()).invalidateSelf();
        }
        Lazy lazy11 = vb2.v;
        if (lazy11.isInitialized()) {
            ((bq5) lazy11.getValue()).onThemeChanged(k2b);
        }
        return Unit.INSTANCE;
    }
}

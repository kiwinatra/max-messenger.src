package defpackage;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* renamed from: ef0  reason: default package */
public final class ef0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ff0 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ l1g c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ef0(ff0 ff0, Context context, l1g l1g, Continuation continuation) {
        super(2, continuation);
        this.a = ff0;
        this.b = context;
        this.c = l1g;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ef0(this.a, this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ef0) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ff0 ff0 = this.a;
        Context context = this.b;
        l1g l1g = this.c;
        try {
            InputStream open = context.getAssets().open(l1g.a);
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            objectRef.element = ff0.a(ff0, bArr, l1g);
        } catch (IOException e) {
            z68.c("BackgroundDataLoader", "load assets failed: " + e, new Object[0]);
        }
        return objectRef.element;
    }
}

package defpackage;

import android.net.Uri;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: vl8  reason: default package */
public final class vl8 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MediaBarWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vl8(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.b = mediaBarWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        vl8 vl8 = new vl8(continuation, this.b);
        vl8.a = obj;
        return vl8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vl8) create((o19) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o19 o19 = (o19) this.a;
        boolean areEqual = Intrinsics.areEqual((Object) o19, (Object) k19.a);
        MediaBarWidget mediaBarWidget = this.b;
        if (areEqual) {
            KProperty[] kPropertyArr = MediaBarWidget.c1;
            mediaBarWidget.n0().j(true);
            il8 r0 = mediaBarWidget.r0();
            xag.h(r0.Z, sk8.a);
        } else if (Intrinsics.areEqual((Object) o19, (Object) l19.a)) {
            KProperty[] kPropertyArr2 = MediaBarWidget.c1;
            il8 r02 = mediaBarWidget.r0();
            int ordinal = ((n00) r02.y.getValue()).ordinal();
            if (ordinal == 0) {
                n00 n00 = n00.b;
                xme xme = r02.y;
                xme.getClass();
                xme.m((Object) null, n00);
                r02.k().s(2);
            } else if (ordinal == 1) {
                r02.z.s(rj8.a);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (o19 instanceof m19) {
            KProperty[] kPropertyArr3 = MediaBarWidget.c1;
            il8 r03 = mediaBarWidget.r0();
            Uri uri = ((m19) o19).a;
            r03.getClass();
            xag.h(r03.Z, new tk8(uri));
        } else if (o19 instanceof n19) {
            KProperty[] kPropertyArr4 = MediaBarWidget.c1;
            il8 r04 = mediaBarWidget.r0();
            n19 n19 = (n19) o19;
            s58 s58 = n19.a;
            r04.getClass();
            xag.h(r04.Z, new uk8(s58, n19.b, n19.c));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}

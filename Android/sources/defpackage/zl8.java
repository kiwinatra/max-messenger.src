package defpackage;

import android.os.Bundle;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.chatscreen.mediabar.partialmediaaccess.PartialMediaAccessWidget;

/* renamed from: zl8  reason: default package */
public final class zl8 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MediaBarWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zl8(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.b = mediaBarWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        zl8 zl8 = new zl8(continuation, this.b);
        zl8.a = obj;
        return zl8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zl8) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean booleanValue = ((Boolean) this.a).booleanValue();
        MediaBarWidget mediaBarWidget = this.b;
        if (booleanValue) {
            KProperty[] kPropertyArr = MediaBarWidget.c1;
            mediaBarWidget.getClass();
            mz2 mz2 = (mz2) mediaBarWidget.y0.getValue(mediaBarWidget, MediaBarWidget.c1[8]);
            if (!Intrinsics.areEqual((Object) mz2.b(), (Object) "partial_media_access_widget")) {
                i9d i9d = new i9d(new PartialMediaAccessWidget((Bundle) null, 1, (DefaultConstructorMarker) null), (String) null, (ey3) null, (ey3) null, false, -1);
                i9d.d("partial_media_access_widget");
                mz2.a.R(i9d);
            }
        } else {
            KProperty[] kPropertyArr2 = MediaBarWidget.c1;
            mediaBarWidget.getClass();
            mz2 mz22 = (mz2) mediaBarWidget.y0.getValue(mediaBarWidget, MediaBarWidget.c1[8]);
            mz22.getClass();
            mz22.a.P(CollectionsKt.emptyList(), (ey3) null);
        }
        MediaBarWidget.e0(mediaBarWidget);
        return Unit.INSTANCE;
    }
}

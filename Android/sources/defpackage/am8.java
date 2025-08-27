package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;
import one.me.sdk.gallery.MediaGalleryWidget;

/* renamed from: am8  reason: default package */
public final class am8 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MediaBarWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public am8(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.b = mediaBarWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        am8 am8 = new am8(continuation, this.b);
        am8.a = obj;
        return am8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((am8) create((pub) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int ordinal = ((pub) this.a).ordinal();
        MediaBarWidget mediaBarWidget = this.b;
        if (ordinal == 0) {
            KProperty[] kPropertyArr = MediaBarWidget.c1;
            mz2 o0 = mediaBarWidget.o0();
            if (!Intrinsics.areEqual((Object) o0.b(), (Object) "media_gallery_widget")) {
                i9d i9d = new i9d(new MediaGalleryWidget(mediaBarWidget.a, (ql6) null, 2, (DefaultConstructorMarker) null), (String) null, (ey3) null, (ey3) null, false, -1);
                i9d.d("media_gallery_widget");
                o0.a.R(i9d);
            }
            mediaBarWidget.q0().setVisibility(0);
        } else if (ordinal == 1) {
            KProperty[] kPropertyArr2 = MediaBarWidget.c1;
            mz2 o02 = mediaBarWidget.o0();
            if (!Intrinsics.areEqual((Object) o02.b(), (Object) "permissions_widget")) {
                i9d i9d2 = new i9d(new MediaBarPermissionWidget(), (String) null, (ey3) null, (ey3) null, false, -1);
                i9d2.d("permissions_widget");
                o02.a.R(i9d2);
            }
            mediaBarWidget.q0().setVisibility(8);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}

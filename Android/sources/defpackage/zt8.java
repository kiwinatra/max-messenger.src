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
import one.me.mediapicker.MediaPickerScreen;
import one.me.mediapicker.permissions.MediaPickerPermissionWidget;
import one.me.sdk.gallery.MediaGalleryWidget;

/* renamed from: zt8  reason: default package */
public final class zt8 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MediaPickerScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zt8(Continuation continuation, MediaPickerScreen mediaPickerScreen) {
        super(2, continuation);
        this.b = mediaPickerScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        zt8 zt8 = new zt8(continuation, this.b);
        zt8.a = obj;
        return zt8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zt8) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        rv3 rv3 = (rv3) this.a;
        boolean z = rv3 instanceof ov3;
        MediaPickerScreen mediaPickerScreen = this.b;
        if (z) {
            MediaPickerScreen.c0(mediaPickerScreen, false);
            h3b e0 = mediaPickerScreen.e0();
            CharSequence a2 = ((ov3) rv3).a.a(mediaPickerScreen.getContext());
            if (a2 == null) {
                a2 = "";
            }
            e0.setTitle(a2);
            mz2 mz2 = (mz2) mediaPickerScreen.b.getValue(mediaPickerScreen, MediaPickerScreen.z0[0]);
            if (!Intrinsics.areEqual((Object) mz2.b(), (Object) "MEDIA_GALLERY_WIDGET_TAG")) {
                i9d i9d = new i9d(new MediaGalleryWidget(mediaPickerScreen.c, mediaPickerScreen.d0(), (DefaultConstructorMarker) null), (String) null, (ey3) null, (ey3) null, false, -1);
                i9d.d("MEDIA_GALLERY_WIDGET_TAG");
                mz2.a.R(i9d);
            }
        } else if (rv3 instanceof pv3) {
            MediaPickerScreen.c0(mediaPickerScreen, true);
        } else if (rv3 instanceof qv3) {
            MediaPickerScreen.c0(mediaPickerScreen, false);
            mz2 mz22 = (mz2) mediaPickerScreen.b.getValue(mediaPickerScreen, MediaPickerScreen.z0[0]);
            if (!Intrinsics.areEqual((Object) mz22.b(), (Object) "MEDIA_GALLERY_WIDGET_PERMISSION_TAG")) {
                i9d i9d2 = new i9d(new MediaPickerPermissionWidget(mediaPickerScreen.c, (DefaultConstructorMarker) null), (String) null, (ey3) null, (ey3) null, false, -1);
                i9d2.d("MEDIA_GALLERY_WIDGET_PERMISSION_TAG");
                mz22.a.R(i9d2);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}

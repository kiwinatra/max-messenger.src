package defpackage;

import android.view.View;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.mediapicker.MediaPickerScreen;

/* renamed from: cu8  reason: default package */
public final class cu8 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MediaPickerScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cu8(Continuation continuation, MediaPickerScreen mediaPickerScreen) {
        super(2, continuation);
        this.b = mediaPickerScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        cu8 cu8 = new cu8(continuation, this.b);
        cu8.a = obj;
        return cu8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cu8) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        float f;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        gpd gpd = (gpd) this.a;
        boolean z = gpd instanceof fpd;
        MediaPickerScreen mediaPickerScreen = this.b;
        if (z) {
            KProperty[] kPropertyArr = MediaPickerScreen.z0;
            mediaPickerScreen.e0().setDropdownRotationProgress(c44.DEFAULT_ASPECT_RATIO);
            KProperty[] kPropertyArr2 = MediaPickerScreen.z0;
            KProperty kProperty = kPropertyArr2[4];
            mediaPickerScreen.Y.b(mediaPickerScreen, 0);
            KProperty kProperty2 = kPropertyArr2[3];
            ((oz1) mediaPickerScreen.X.getValue()).setVisibility(8);
            KProperty kProperty3 = kPropertyArr2[7];
            ((View) mediaPickerScreen.w0.getValue()).setVisibility(8);
        } else if (gpd instanceof dpd) {
            KProperty[] kPropertyArr3 = MediaPickerScreen.z0;
            mediaPickerScreen.getClass();
            KProperty[] kPropertyArr4 = MediaPickerScreen.z0;
            KProperty kProperty4 = kPropertyArr4[4];
            is isVar = mediaPickerScreen.Y;
            if (((Number) isVar.a(mediaPickerScreen)).intValue() > 0) {
                KProperty kProperty5 = kPropertyArr4[4];
                f = ((float) ((dpd) gpd).a) / ((float) ((Number) isVar.a(mediaPickerScreen)).intValue());
            } else {
                f = 180.0f;
            }
            mediaPickerScreen.e0().setDropdownRotationProgress(f);
        }
        return Unit.INSTANCE;
    }
}

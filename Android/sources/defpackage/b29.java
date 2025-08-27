package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.chatscreen.mediabar.mediatypepicker.MediaTypePickerWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.messages.location.ActLocationMap;

/* renamed from: b29  reason: default package */
public final class b29 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MediaTypePickerWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b29(Continuation continuation, MediaTypePickerWidget mediaTypePickerWidget) {
        super(2, continuation);
        this.b = mediaTypePickerWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        b29 b29 = new b29(continuation, this.b);
        b29.a = obj;
        return b29;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b29) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v5a v5a = (v5a) this.a;
        boolean areEqual = Intrinsics.areEqual((Object) v5a, (Object) i19.b);
        MediaTypePickerWidget mediaTypePickerWidget = this.b;
        if (areEqual) {
            KProperty[] kPropertyArr = MediaTypePickerWidget.w;
            Context context = mediaTypePickerWidget.getContext();
            KProperty kProperty = MediaTypePickerWidget.w[0];
            long longValue = ((Number) mediaTypePickerWidget.a.a(mediaTypePickerWidget)).longValue();
            int i = ActLocationMap.z0;
            Intent intent = new Intent(context, ActLocationMap.class);
            intent.putExtra("ru.ok.tamtam.extra.CHAT_ID", longValue);
            intent.putExtra("map:DISABLE_LIVE", false);
            intent.putExtra("map:REGULAR_SENDING", true);
            mediaTypePickerWidget.startActivityForResult(intent, 371);
        } else if (Intrinsics.areEqual((Object) v5a, (Object) j19.b)) {
            KProperty[] kPropertyArr2 = MediaTypePickerWidget.w;
            mediaTypePickerWidget.getClass();
            KProperty[] kPropertyArr3 = BottomSheetWidget.v0;
            e9d e9d = null;
            ng3 a2 = b0h.a(new igf(mra.H), (Bundle) null, 6);
            igf igf = new igf(mra.G);
            og3 og3 = og3.c;
            a2.a(new pg3(1, igf, og3));
            a2.a(new pg3(2, new igf(mra.F), og3));
            a2.a(new pg3(3, new igf(mra.E), og3.a));
            ConfirmationBottomSheet e = a2.e();
            e.setTargetController(mediaTypePickerWidget);
            zx3 zx3 = mediaTypePickerWidget;
            while (zx3.getParentController() != null) {
                zx3 = zx3.getParentController();
            }
            l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
            if (l9d != null) {
                e9d = l9d.K();
            }
            e.p0(mediaTypePickerWidget);
            if (e9d != null) {
                i9d i9d = new i9d(e, (String) null, (ey3) null, (ey3) null, false, -1);
                a81.t(false, i9d, true, "BottomSheetWidget");
                e9d.G(i9d);
            }
        } else if (v5a instanceof pa4) {
            wn2.b.Y0((pa4) v5a);
        }
        return Unit.INSTANCE;
    }
}

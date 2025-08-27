package defpackage;

import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.text.StringsKt;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;

/* renamed from: yk7  reason: default package */
public final class yk7 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ InviteByQrBottomSheet b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yk7(InviteByQrBottomSheet inviteByQrBottomSheet, Continuation continuation) {
        super(2, continuation);
        this.b = inviteByQrBottomSheet;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        yk7 yk7 = new yk7(this.b, continuation);
        yk7.a = obj;
        return yk7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yk7) create((mac) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        mac mac = (mac) this.a;
        InviteByQrBottomSheet inviteByQrBottomSheet = this.b;
        InviteByQrBottomSheet.q0(inviteByQrBottomSheet).setText(mac.a);
        ReadOnlyProperty readOnlyProperty = inviteByQrBottomSheet.y0;
        CharSequence charSequence = mac.b;
        if (charSequence == null || StringsKt.isBlank(charSequence)) {
            InviteByQrBottomSheet.r0(inviteByQrBottomSheet).setVisibility(8);
            ((LinearLayout.LayoutParams) InviteByQrBottomSheet.q0(inviteByQrBottomSheet).getLayoutParams()).topMargin = MathKt.roundToInt(((float) 27) * vo4.c().getDisplayMetrics().density);
            ((LinearLayout.LayoutParams) ((AppCompatImageView) readOnlyProperty.getValue(inviteByQrBottomSheet, InviteByQrBottomSheet.C0[2])).getLayoutParams()).topMargin = MathKt.roundToInt(((float) 15) * vo4.c().getDisplayMetrics().density);
        } else {
            InviteByQrBottomSheet.r0(inviteByQrBottomSheet).setVisibility(0);
            float f = (float) 18;
            ((LinearLayout.LayoutParams) InviteByQrBottomSheet.q0(inviteByQrBottomSheet).getLayoutParams()).topMargin = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
            ((LinearLayout.LayoutParams) ((AppCompatImageView) readOnlyProperty.getValue(inviteByQrBottomSheet, InviteByQrBottomSheet.C0[2])).getLayoutParams()).topMargin = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
        }
        InviteByQrBottomSheet.r0(inviteByQrBottomSheet).setText(charSequence);
        ((AppCompatImageView) readOnlyProperty.getValue(inviteByQrBottomSheet, InviteByQrBottomSheet.C0[2])).setImageBitmap(mac.c);
        return Unit.INSTANCE;
    }
}

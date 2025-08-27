package one.me.inviteactions.invitebyqr;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/inviteactions/invitebyqr/InviteByQrBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "invite-actions_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nInviteByQrBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InviteByQrBottomSheet.kt\none/me/inviteactions/invitebyqr/InviteByQrBottomSheet\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n235#2,10:152\n24#3:162\n24#3:163\n24#3:164\n24#3:166\n24#3:167\n24#3:168\n24#3:169\n24#3:170\n1#4:165\n*S KotlinDebug\n*F\n+ 1 InviteByQrBottomSheet.kt\none/me/inviteactions/invitebyqr/InviteByQrBottomSheet\n*L\n49#1:152,10\n61#1:162\n62#1:163\n63#1:164\n73#1:166\n74#1:167\n75#1:168\n83#1:169\n89#1:170\n*E\n"})
public final class InviteByQrBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ KProperty[] C0;
    public final Lazy A0 = createViewModelLazy(cl7.class, new i76(6, new ck7(4)));
    public final wie B0 = o5a.U();
    public final ReadOnlyProperty w0 = viewBinding(wua.l);
    public final ReadOnlyProperty x0 = viewBinding(wua.o);
    public final ReadOnlyProperty y0 = viewBinding(wua.m);
    public final Lazy z0 = LazyKt.lazy(LazyThreadSafetyMode.NONE, new u75(27, this));

    static {
        Class<InviteByQrBottomSheet> cls = InviteByQrBottomSheet.class;
        C0 = new KProperty[]{wj6.p(cls, "name", "getName()Landroidx/appcompat/widget/AppCompatTextView;", 0), wj6.p(cls, "shortName", "getShortName()Landroidx/appcompat/widget/AppCompatTextView;", 0), wj6.p(cls, "qrCode", "getQrCode()Landroidx/appcompat/widget/AppCompatImageView;", 0), rae.s(cls, "shareQrCodeJob", "getShareQrCodeJob()Lkotlinx/coroutines/Job;", 0)};
    }

    public InviteByQrBottomSheet() {
        super((Bundle) null, 1, (DefaultConstructorMarker) null);
    }

    public static final AppCompatTextView q0(InviteByQrBottomSheet inviteByQrBottomSheet) {
        inviteByQrBottomSheet.getClass();
        return (AppCompatTextView) inviteByQrBottomSheet.w0.getValue(inviteByQrBottomSheet, C0[0]);
    }

    public static final AppCompatTextView r0(InviteByQrBottomSheet inviteByQrBottomSheet) {
        inviteByQrBottomSheet.getClass();
        return (AppCompatTextView) inviteByQrBottomSheet.x0.getValue(inviteByQrBottomSheet, C0[1]);
    }

    public final View n0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext(), (AttributeSet) null);
        appCompatTextView.setId(wua.l);
        appCompatTextView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = (float) 18;
        layoutParams.topMargin = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        float f2 = (float) 20;
        layoutParams.setMarginStart(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        layoutParams.setMarginEnd(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        appCompatTextView.setLayoutParams(layoutParams);
        puf.z.b(appCompatTextView, uy4.b);
        js9 js9 = fu4.k;
        appCompatTextView.setTextColor(js9.e(appCompatTextView.getContext()).f().getText().e);
        linearLayout.addView(appCompatTextView);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout.getContext(), (AttributeSet) null);
        appCompatTextView2.setId(wua.o);
        appCompatTextView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density);
        layoutParams2.setMarginStart(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        layoutParams2.setMarginEnd(MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        appCompatTextView2.setLayoutParams(layoutParams2);
        puf.o.b(appCompatTextView2, uy4.b);
        appCompatTextView2.setTextColor(js9.e(appCompatTextView2.getContext()).f().getText().f);
        linearLayout.addView(appCompatTextView2);
        AppCompatImageView appCompatImageView = new AppCompatImageView(linearLayout.getContext(), (AttributeSet) null);
        appCompatImageView.setId(wua.m);
        float f3 = (float) 244;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
        layoutParams3.topMargin = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
        appCompatImageView.setLayoutParams(layoutParams3);
        linearLayout.setGravity(17);
        linearLayout.addView(appCompatImageView);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(wua.n);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(layoutParams4);
        oneMeButton.setMode(zpa.a);
        oneMeButton.setSize(aqa.c);
        oneMeButton.setAppearance(xpa.c);
        oneMeButton.setText(ead.e);
        ct.G(oneMeButton, 300, new xu3(20, (Object) this));
        linearLayout.addView(oneMeButton);
        b0h.H(linearLayout, new sa((Object) this, (Continuation) null, 14));
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        pm7 pm7 = (pm7) this.B0.getValue(this, C0[3]);
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
    }

    public final void onViewCreated(View view) {
        bs0.K(new ps5(((cl7) this.A0.getValue()).y, new yk7(this, (Continuation) null), 5), getViewLifecycleScope());
    }
}

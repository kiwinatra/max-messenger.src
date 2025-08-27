package one.me.dialogs.share.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B=\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0004\u0010\u0010¨\u0006\u0011"}, d2 = {"Lone/me/dialogs/share/media/ChatMediaDownloadBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "messageId", "attachId", "", "localAttachId", "", "cause", "snackbarBottomMargin", "", "forceDarkTheme", "(JJLjava/lang/String;ILjava/lang/Integer;Ljava/lang/Boolean;)V", "share-media_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nChatMediaDownloadBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatMediaDownloadBottomSheet.kt\none/me/dialogs/share/media/ChatMediaDownloadBottomSheet\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 LazyExt.kt\none/me/sdk/kotlintools/delegates/LazyExtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ViewGroupBuilders.kt\none/me/sdk/uikit/common/ViewGroupBuildersKt\n+ 6 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 7 ContextExt.kt\none/me/sdk/arch/ext/ContextExtKt\n*L\n1#1,236:1\n235#2,10:237\n420#2:248\n420#2:249\n410#2,8:267\n5#3:247\n1#4:250\n1#4:257\n1#4:262\n9#5,6:251\n15#5:258\n13#5,2:260\n15#5:263\n24#6:259\n24#6:264\n24#6:265\n24#6:266\n24#6:276\n17#7:275\n*S KotlinDebug\n*F\n+ 1 ChatMediaDownloadBottomSheet.kt\none/me/dialogs/share/media/ChatMediaDownloadBottomSheet\n*L\n44#1:237,10\n68#1:248\n69#1:249\n138#1:267,8\n57#1:247\n101#1:257\n102#1:262\n101#1:251,6\n101#1:258\n102#1:260,2\n102#1:263\n102#1:259\n109#1:264\n114#1:265\n122#1:266\n59#1:276\n205#1:275\n*E\n"})
@SuppressLint({"ValidController"})
public final class ChatMediaDownloadBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ KProperty[] C0;
    public final is A0;
    public final l2b B0;
    public final Lazy w0;
    public final Lazy x0;
    public final Lazy y0;
    public el4 z0;

    static {
        Class<ChatMediaDownloadBottomSheet> cls = ChatMediaDownloadBottomSheet.class;
        C0 = new KProperty[]{wj6.p(cls, "forceDarkTheme", "getForceDarkTheme()Z", 0), wj6.p(cls, "snackbarBottomMargin", "getSnackbarBottomMargin()Ljava/lang/Integer;", 0)};
    }

    public ChatMediaDownloadBottomSheet(Bundle bundle) {
        super(bundle);
        Lazy<VM> createViewModelLazy = createViewModelLazy(wd2.class, new s(21, new r52(8)));
        this.w0 = createViewModelLazy;
        this.x0 = LazyKt.lazy(LazyThreadSafetyMode.NONE, new nm1(5, this));
        this.y0 = u5e.a.getAccessor().h(e0b.class);
        is isVar = new is(Boolean.class, "arg:force_dark");
        this.A0 = new is(Integer.class, "arg:snack_bot_margin");
        wd2 wd2 = (wd2) createViewModelLazy.getValue();
        long j = bundle.getLong("arg:msg_id");
        long j2 = bundle.getLong("arg:attach_id");
        String string = bundle.getString("arg:local_attach_id");
        if (string != null) {
            ejd ejd = sr4.a;
            int i = bundle.getInt("arg:cause");
            ejd.getClass();
            l2b l2b = null;
            wd2.w0 = xag.g(wd2, ((osa) wd2.c).b(), (f14) null, new pd2(wd2, j, string, (sr4) sr4.X.get(i), j2, (Continuation) null), 2);
            l2b l2b2 = l2b.a;
            KProperty kProperty = C0[0];
            this.B0 = ((Boolean) isVar.a(this)).booleanValue() ? l2b2 : l2b;
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final frb d0() {
        return new id2(this);
    }

    public final k2b g0() {
        return this.B0;
    }

    public final View n0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setLayoutParams(layoutParams);
        Context context2 = frameLayout2.getContext();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, MathKt.roundToInt(((float) 223) * vo4.c().getDisplayMetrics().density));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        frameLayout3.setLayoutParams(layoutParams2);
        TextView textView = new TextView(frameLayout3.getContext());
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2, 17);
        layoutParams3.bottomMargin = MathKt.roundToInt(((float) 27) * vo4.c().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams3);
        textView.setGravity(17);
        l2b l2b = this.B0;
        textView.setTextColor((l2b == null ? fu4.k.e(textView.getContext()).f() : l2b).getText().e);
        ArrayList arrayList = wgf.a;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (a10) this.x0.getValue(), (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density));
        textView.setText(hlc.media_share_dialog_generic_share_text);
        frameLayout3.addView(textView);
        frameLayout2.addView(frameLayout3);
        OneMeButton oneMeButton = new OneMeButton(frameLayout2.getContext(), (AttributeSet) null);
        oneMeButton.setLayoutParams(new FrameLayout.LayoutParams(-1, MathKt.roundToInt(((float) 52) * vo4.c().getDisplayMetrics().density), 81));
        oneMeButton.setCustomTheme(l2b);
        oneMeButton.setSize(aqa.c);
        oneMeButton.setMode(zpa.c);
        oneMeButton.setAppearance(xpa.o);
        oneMeButton.setText(ead.h);
        ct.G(oneMeButton, 300, new x4(22, (Object) this));
        frameLayout2.addView(oneMeButton);
        return frameLayout2;
    }

    public final void onChangeStarted(ey3 ey3, fy3 fy3) {
        super.onChangeStarted(ey3, fy3);
        this.z0 = ey3 instanceof el4 ? (el4) ey3 : null;
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        ((wd2) this.w0.getValue()).k();
        this.z0 = null;
    }

    public final void onViewCreated(View view) {
        bs0.K(new ps5(ct.k(((wd2) this.w0.getValue()).v0, getViewLifecycleOwner().getLifecycle(), iu7.o), new jd2((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void q0(int i, int i2) {
        e0b e0b = (e0b) this.y0.getValue();
        e0b.i(q8.p(i, getContext()));
        e0b.f(new o0b(i2));
        KProperty kProperty = C0[1];
        Integer num = (Integer) this.A0.a(this);
        if (num != null) {
            e0b.c(new n0b(0, num.intValue(), 3));
        }
        e0b.j();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ChatMediaDownloadBottomSheet(long j, long j2, String str, int i, Integer num, Boolean bool) {
        this(o54.f(TuplesKt.to("arg:msg_id", Long.valueOf(j)), TuplesKt.to("arg:attach_id", Long.valueOf(j2)), TuplesKt.to("arg:local_attach_id", str), TuplesKt.to("arg:cause", Integer.valueOf(i)), TuplesKt.to("arg:snack_bot_margin", num), TuplesKt.to("arg:force_dark", Boolean.valueOf(bool != null ? bool.booleanValue() : false))));
    }
}

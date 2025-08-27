package one.me.chatscreen.chatstatus;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/chatscreen/chatstatus/ChatStatusBottomWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Legd;", "scopeId", "Lsp2;", "chatStatus", "(Ljava/lang/String;Lsp2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "chat-screen_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nChatStatusBottomWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatStatusBottomWidget.kt\none/me/chatscreen/chatstatus/ChatStatusBottomWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,158:1\n420#2:159\n255#2,9:160\n24#3:169\n24#3:171\n24#3:174\n24#3:175\n1#4:170\n184#5,2:172\n*S KotlinDebug\n*F\n+ 1 ChatStatusBottomWidget.kt\none/me/chatscreen/chatstatus/ChatStatusBottomWidget\n*L\n27#1:159\n31#1:160,9\n54#1:169\n80#1:171\n97#1:174\n110#1:175\n80#1:172,2\n*E\n"})
@SuppressLint({"ValidController"})
public final class ChatStatusBottomWidget extends Widget {
    public static final /* synthetic */ KProperty[] c;
    public final Lazy a;
    public final ReadOnlyProperty b;

    static {
        Class<ChatStatusBottomWidget> cls = ChatStatusBottomWidget.class;
        c = new KProperty[]{rae.s(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0), wj6.p(cls, "button", "getButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    }

    public ChatStatusBottomWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        is isVar = new is(egd.class, Widget.ARG_SCOPE_ID);
        KProperty kProperty = c[0];
        this.a = m1571getSharedViewModelcp94BC8(((egd) isVar.a(this)).a, lp2.class, (Function0) null);
        this.b = viewBinding(lra.c);
    }

    public final lp2 c0() {
        return (lp2) this.a.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        b0h.H(frameLayout, new sn2(3, (Continuation) null, 1));
        OneMeButton oneMeButton = new OneMeButton(frameLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(lra.c);
        oneMeButton.setSize(aqa.c);
        oneMeButton.setMode(zpa.c);
        oneMeButton.setAppearance(xpa.c);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        float f = (float) 12;
        float f2 = (float) 0;
        layoutParams.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        oneMeButton.setLayoutParams(layoutParams);
        frameLayout.addView(oneMeButton);
        return frameLayout;
    }

    public final void onViewCreated(View view) {
        bs0.K(new ps5(new on2(c0().V0, 28), new up2(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public ChatStatusBottomWidget(String str, sp2 sp2, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(i2a.l(str, Widget.ARG_SCOPE_ID), TuplesKt.to("arg_key_chat_status", sp2)));
    }
}

package defpackage;

import android.graphics.RectF;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* renamed from: rq2  reason: default package */
public final /* synthetic */ class rq2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatTitleIconScreen b;

    public /* synthetic */ rq2(ChatTitleIconScreen chatTitleIconScreen, int i) {
        this.a = i;
        this.b = chatTitleIconScreen;
    }

    public final Object invoke() {
        int i;
        int i2;
        int i3;
        int i4;
        ChatTitleIconScreen chatTitleIconScreen = this.b;
        boolean z = false;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = ChatTitleIconScreen.x0;
                xme xme = chatTitleIconScreen.h0().x0;
                yq2 yq2 = new yq2((String) null, (String) null, (RectF) null);
                xme.getClass();
                xme.m((Object) null, yq2);
                return Unit.INSTANCE;
            case 1:
                KProperty[] kPropertyArr2 = ChatTitleIconScreen.x0;
                int ordinal = chatTitleIconScreen.g0().ordinal();
                if (ordinal == 0) {
                    return jgd.CREATE_CHAT_INFO;
                }
                if (ordinal == 1) {
                    return jgd.CREATE_CHANNEL_INFO;
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                KProperty[] kPropertyArr3 = ChatTitleIconScreen.x0;
                h3b d = o54.d(chatTitleIconScreen.getContext(), (AttributeSet) null);
                d.setId(f1b.j);
                d.setLayoutParams(new fj3(-1, -2));
                d.setForm(z2b.a);
                int ordinal2 = chatTitleIconScreen.g0().ordinal();
                if (ordinal2 == 0) {
                    i = g1b.s;
                } else if (ordinal2 == 1) {
                    i = g1b.t;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                d.setTitle(i);
                d.setLeftActions(new p2b(new l(27, d)));
                return d;
            case 3:
                KProperty[] kPropertyArr4 = ChatTitleIconScreen.x0;
                TextView textView = new TextView(chatTitleIconScreen.getContext());
                textView.setId(f1b.f);
                textView.setLayoutParams(new fj3(0, -2));
                textView.setGravity(17);
                float f = (float) 12;
                textView.setPaddingRelative(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 0, MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), 0);
                int ordinal3 = chatTitleIconScreen.g0().ordinal();
                if (ordinal3 == 0) {
                    i2 = g1b.n;
                } else if (ordinal3 == 1) {
                    i2 = g1b.o;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                textView.setText(i2);
                b0h.H(textView, new ra(3, (Continuation) null, 6));
                return textView;
            case 4:
                KProperty[] kPropertyArr5 = ChatTitleIconScreen.x0;
                OneMeAvatarView oneMeAvatarView = new OneMeAvatarView(chatTitleIconScreen.getContext(), (AttributeSet) null);
                oneMeAvatarView.setId(f1b.h);
                float f2 = (float) 96;
                oneMeAvatarView.setLayoutParams(new fj3(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density)));
                OneMeAvatarView.g(oneMeAvatarView, ew3.b(chatTitleIconScreen.getContext(), cad.h0), (joa) null, 30);
                oneMeAvatarView.setAvatarShape(goa.a);
                ct.G(oneMeAvatarView, 300, new qq2(chatTitleIconScreen, 0));
                oneMeAvatarView.setCloseBadgeClickListener(new rq2(chatTitleIconScreen, 0));
                return oneMeAvatarView;
            case 5:
                KProperty[] kPropertyArr6 = ChatTitleIconScreen.x0;
                h2b h2b = new h2b(chatTitleIconScreen.getContext());
                h2b.setId(f1b.i);
                h2b.setLayoutParams(new fj3(0, -2));
                float f3 = (float) 12;
                h2b.setPaddingRelative(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), 0, MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density), 0);
                int ordinal4 = chatTitleIconScreen.g0().ordinal();
                if (ordinal4 == 0) {
                    i3 = g1b.q;
                } else if (ordinal4 == 1) {
                    i3 = g1b.r;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                h2b.setHint(q8.p(i3, h2b.getContext()));
                h2b.setText(chatTitleIconScreen.h0().F0);
                h2b.setBackgroundColorAttr(Integer.valueOf(jya.a));
                h2b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(((akd) ((bud) chatTitleIconScreen.b.getValue())).t())});
                b0h.H(h2b, new sq2(3, (Continuation) null, 0));
                h2b.a.addTextChangedListener(new u2(12, new pq2(chatTitleIconScreen, 0)));
                return h2b;
            case 6:
                KProperty[] kPropertyArr7 = ChatTitleIconScreen.x0;
                lm4 lm4 = new lm4(chatTitleIconScreen.getContext());
                lm4.setId(f1b.g);
                fj3 fj3 = new fj3(0, -2);
                float f4 = (float) 12;
                fj3.setMarginStart(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4));
                fj3.setMarginEnd(MathKt.roundToInt(f4 * vo4.c().getDisplayMetrics().density));
                lm4.setLayoutParams(fj3);
                lm4.setMaxCount(((akd) ((bud) chatTitleIconScreen.b.getValue())).s());
                lm4.setHint(new igf(g1b.p));
                lm4.setText(chatTitleIconScreen.h0().G0);
                lm4.setBackgroundColorAttr(Integer.valueOf(jya.a));
                lm4.setHintColorAttr(jya.L);
                b0h.H(lm4, new sa(3, (Continuation) null, 3));
                lm4.w.addTextChangedListener(new ne1(3, new pq2(chatTitleIconScreen, 2), lm4));
                return lm4;
            default:
                KProperty[] kPropertyArr8 = ChatTitleIconScreen.x0;
                OneMeButton oneMeButton = new OneMeButton(chatTitleIconScreen.getContext(), (AttributeSet) null);
                oneMeButton.setId(f1b.e);
                fj3 fj32 = new fj3(0, -2);
                float f5 = (float) 12;
                fj32.setMarginStart(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f5));
                fj32.setMarginEnd(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f5));
                fj32.bottomMargin = MathKt.roundToInt(f5 * vo4.c().getDisplayMetrics().density);
                oneMeButton.setLayoutParams(fj32);
                int ordinal5 = chatTitleIconScreen.g0().ordinal();
                if (ordinal5 == 0) {
                    i4 = g1b.l;
                } else if (ordinal5 == 1) {
                    i4 = g1b.m;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                oneMeButton.setText(i4);
                oneMeButton.setSize(aqa.c);
                oneMeButton.setMode(zpa.a);
                oneMeButton.setAppearance(xpa.o);
                fr2 h0 = chatTitleIconScreen.h0();
                String str = chatTitleIconScreen.h0().F0;
                h0.getClass();
                if ((!StringsKt.isBlank(str)) && str.length() <= ((akd) h0.o).t()) {
                    z = true;
                }
                oneMeButton.setEnabled(z);
                ct.G(oneMeButton, 300, new qq2(chatTitleIconScreen, 1));
                return oneMeButton;
        }
    }
}

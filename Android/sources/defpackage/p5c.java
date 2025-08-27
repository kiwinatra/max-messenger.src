package defpackage;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import one.me.profile.ProfileScreen;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;

/* renamed from: p5c  reason: default package */
public final class p5c extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ProfileScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p5c(Continuation continuation, ProfileScreen profileScreen) {
        super(2, continuation);
        this.b = profileScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        p5c p5c = new p5c(continuation, this.b);
        p5c.a = obj;
        return p5c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p5c) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ProfileScreen profileScreen;
        boolean z;
        int i = 8;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        owb owb = (owb) this.a;
        KProperty[] kPropertyArr = ProfileScreen.D0;
        ProfileScreen profileScreen2 = this.b;
        CharSequence charSequence = null;
        profileScreen2.e0().setRightActions(owb.b ? new u2b((d3b) null, new a3b(lya.g, new hw2(8, profileScreen2))) : s2b.a);
        KProperty[] kPropertyArr2 = ProfileScreen.D0;
        OneMeAvatarView oneMeAvatarView = (OneMeAvatarView) profileScreen2.z.getValue(profileScreen2, kPropertyArr2[4]);
        CharSequence charSequence2 = "";
        CharSequence charSequence3 = owb.f;
        if (charSequence3 == null) {
            charSequence3 = charSequence2;
        }
        gd0 gd0 = new gd0(charSequence3, owb.a);
        int i2 = OneMeAvatarView.E0;
        oneMeAvatarView.f(gd0, true);
        oneMeAvatarView.setAvatarUrls(owb.c);
        oneMeAvatarView.setAlpha(owb.i ? 0.4f : 1.0f);
        ct.G(oneMeAvatarView, 300, new wld(12, profileScreen2));
        AppCompatTextView appCompatTextView = (AppCompatTextView) profileScreen2.v0.getValue(profileScreen2, kPropertyArr2[8]);
        ngf ngf = owb.g;
        CharSequence a2 = ngf != null ? ngf.a(profileScreen2.getContext()) : null;
        boolean z2 = !(a2 == null || a2.length() == 0);
        ngf ngf2 = owb.h;
        if (z2) {
            CharSequence a3 = ngf2 != null ? ngf2.a(profileScreen2.getContext()) : null;
            if (!(a3 == null || a3.length() == 0)) {
                i = 0;
            }
        }
        appCompatTextView.setVisibility(i);
        CharSequence a4 = ngf2 != null ? ngf2.a(profileScreen2.getContext()) : null;
        if (!(a4 == null || a4.length() == 0)) {
            ((AppCompatTextView) profileScreen2.Z.getValue(profileScreen2, kPropertyArr2[7])).setText(a4);
        }
        TextView textView = (TextView) profileScreen2.Y.getValue(profileScreen2, kPropertyArr2[6]);
        if (ngf != null) {
            charSequence = ngf.a(profileScreen2.getContext());
        }
        textView.setText(charSequence);
        h3b e0 = profileScreen2.e0();
        CharSequence charSequence4 = owb.e;
        e0.setTitle(charSequence4 == null ? charSequence2 : charSequence4);
        TextView d0 = profileScreen2.d0();
        boolean z3 = owb.j;
        if (!z3) {
            profileScreen = profileScreen2;
            z = z3;
        } else {
            int v = hi7.v(profileScreen2.getContext());
            ViewGroup.LayoutParams layoutParams = profileScreen2.d0().getLayoutParams();
            int marginStart = v - (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
            ViewGroup.LayoutParams layoutParams2 = profileScreen2.d0().getLayoutParams();
            int marginEnd = marginStart - (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0);
            Context context = profileScreen2.getContext();
            TextPaint paint = profileScreen2.d0().getPaint();
            oo9 oo9 = new oo9(27);
            if (charSequence4 == null || charSequence4.length() == 0) {
                profileScreen = profileScreen2;
                z = z3;
                if (charSequence4 != null) {
                    charSequence2 = charSequence4;
                }
                charSequence4 = charSequence2;
            } else {
                m2g S = m5a.S(paint.getTextSize() / context.getResources().getDisplayMetrics().density);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence4);
                spannableStringBuilder.append(8288);
                spannableStringBuilder.append(" ");
                spannableStringBuilder.setSpan(new n2g(context, S, false, oo9), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(spannableStringBuilder);
                StaticLayout.Builder obtain = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), paint, marginEnd);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                StaticLayout build = obtain.setAlignment(alignment).setIncludePad(false).build();
                int min = Math.min(build.getLineCount() - 1, 2);
                CharSequence subSequence = build.getText().subSequence(build.getLineStart(0), build.getLineEnd(min));
                if (Intrinsics.areEqual((Object) subSequence, (Object) spannableString)) {
                    profileScreen = profileScreen2;
                    z = z3;
                    charSequence4 = spannableString;
                } else {
                    z = z3;
                    profileScreen = profileScreen2;
                    StaticLayout build2 = StaticLayout.Builder.obtain(spannableString, build.getLineStart(min), build.getLineEnd(min), paint, a81.e((float) S.b, vo4.c().getDisplayMetrics().density, a81.e((float) S.a, vo4.c().getDisplayMetrics().density, marginEnd))).setAlignment(alignment).setIncludePad(false).build();
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(StringsKt.replaceRange(subSequence, build.getLineStart(min), build.getLineEnd(min), build2.getText().subSequence(build2.getLineStart(0), build2.getLineEnd(0) - 3)));
                    spannableStringBuilder2.append(8288);
                    spannableStringBuilder2.append("...");
                    spannableStringBuilder2.append(8288);
                    spannableStringBuilder2.append(" ");
                    spannableStringBuilder2.setSpan(new n2g(context, S, false, oo9), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                    charSequence4 = new SpannableString(spannableStringBuilder2);
                }
            }
        }
        d0.setText(charSequence4);
        ProfileScreen.c0(profileScreen, profileScreen.e0(), z);
        return Unit.INSTANCE;
    }
}

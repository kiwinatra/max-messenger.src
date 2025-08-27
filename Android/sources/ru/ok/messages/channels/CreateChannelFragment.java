package ru.ok.messages.channels;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.messages.gallery.GalleryResultViewModel;
import ru.ok.messages.views.fragments.base.FrgBase;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\n¨\u0006\f"}, d2 = {"Lru/ok/messages/channels/CreateChannelFragment;", "Lru/ok/messages/views/fragments/base/FrgBase;", "<init>", "()V", "La12;", "event", "", "onEvent", "(La12;)V", "Lhj0;", "(Lhj0;)V", "t24", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCreateChannelFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateChannelFragment.kt\nru/ok/messages/channels/CreateChannelFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 6 StringExt.kt\nru/ok/tamtam/shared/StringExtKt\n+ 7 LiveDataExt.kt\nru/ok/tamtam/shared/lifecycle/LiveDataExtKt\n+ 8 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 9 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 10 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 11 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 12 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n*L\n1#1,437:1\n106#2,15:438\n24#3:453\n24#3:484\n81#4:454\n256#4,2:482\n256#4,2:630\n58#5,23:455\n93#5,3:478\n58#5,23:485\n93#5,3:508\n4#6:481\n4#6:511\n4#6:625\n4#6:626\n4#6:627\n4#6:628\n4#6:629\n131#7,10:512\n131#7,10:527\n131#7,10:542\n131#7,10:557\n131#7,10:572\n131#7,10:587\n49#8:522\n51#8:526\n49#8:537\n51#8:541\n49#8:552\n51#8:556\n49#8:567\n51#8:571\n49#8:582\n51#8:586\n49#8:597\n51#8:601\n46#9:523\n51#9:525\n46#9:538\n51#9:540\n46#9:553\n51#9:555\n46#9:568\n51#9:570\n46#9:583\n51#9:585\n46#9:598\n51#9:600\n105#10:524\n105#10:539\n105#10:554\n105#10:569\n105#10:584\n105#10:599\n108#11:602\n80#11,22:603\n28#12,12:632\n*S KotlinDebug\n*F\n+ 1 CreateChannelFragment.kt\nru/ok/messages/channels/CreateChannelFragment\n*L\n66#1:438,15\n99#1:453\n122#1:484\n106#1:454\n116#1:482,2\n105#1:630,2\n107#1:455,23\n107#1:478,3\n128#1:485,23\n128#1:508,3\n116#1:481\n150#1:511\n263#1:625\n290#1:626\n327#1:627\n329#1:628\n105#1:629\n186#1:512,10\n196#1:527,10\n200#1:542,10\n230#1:557,10\n238#1:572,10\n245#1:587,10\n186#1:522\n186#1:526\n196#1:537\n196#1:541\n200#1:552\n200#1:556\n230#1:567\n230#1:571\n238#1:582\n238#1:586\n245#1:597\n245#1:601\n186#1:523\n186#1:525\n196#1:538\n196#1:540\n200#1:553\n200#1:555\n230#1:568\n230#1:570\n238#1:583\n238#1:585\n245#1:598\n245#1:600\n186#1:524\n196#1:539\n200#1:554\n230#1:569\n238#1:584\n245#1:599\n252#1:602\n252#1:603,22\n222#1:632,12\n*E\n"})
public final class CreateChannelFragment extends FrgBase {
    public final bbg B1;
    public final bbg C1 = new bbg(Reflection.getOrCreateKotlinClass(GalleryResultViewModel.class), (Function0) new tc(15, this), (Function0) new tc(17, this), (Function0) new tc(16, this));
    public final t24 D1 = new t24();

    public CreateChannelFragment() {
        q24 q24 = new q24(this, 2);
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new uc(2, new tc(3, this)));
        this.B1 = new bbg(Reflection.getOrCreateKotlinClass(CreateChannelViewModel.class), (Function0) new vc(4, lazy), (Function0) q24, (Function0) new vc(5, lazy));
    }

    public static void h3(t24 t24) {
        z68.c("ru.ok.messages.channels.CreateChannelFragment", "Enable ui", new Object[0]);
        t24.g().setEnabled(true);
        t24.e().setEnabled(true);
        t24.f().setVisibility(0);
        ((ProgressBar) t24.X.getValue(t24, t24.Z[7])).setVisibility(4);
        t24.d().setEnabled(true);
    }

    public final void A2(View view, Bundle bundle) {
        ((m5) E2()).L(this.r1.n);
        hsg.z(((GalleryResultViewModel) ((ul6) this.C1.getValue())).d, (od6) X1(), new rt3(8, (Object) this));
        etc etc = i3().n;
        bs0.K(new on2(new ps5(new on2(etc, 28), new y24(etc, (Continuation) null, this), 5), 19), fqc.p(X1()));
        etc etc2 = i3().p;
        bs0.K(new on2(new ps5(new on2(etc2, 28), new a34(etc2, (Continuation) null, this), 5), 20), fqc.p(X1()));
        etc etc3 = i3().v;
        bs0.K(new on2(new ps5(new on2(etc3, 28), new c34(etc3, (Continuation) null, this), 5), 21), fqc.p(X1()));
        N1().g0("ru.ok.tamtam.dialogs.PICK_PHOTO_REQUEST_KEY", this, new bh3(new q24(this, 0), new q24(this, 1), 1));
        etc etc4 = i3().r;
        bs0.K(new on2(new ps5(new on2(etc4, 28), new e34(etc4, (Continuation) null, this), 5), 22), fqc.p(X1()));
        etc etc5 = i3().t;
        bs0.K(new on2(new ps5(new on2(etc5, 28), new g34(etc5, (Continuation) null, this), 5), 17), fqc.p(X1()));
        etc etc6 = i3().x;
        bs0.K(new on2(new ps5(new on2(etc6, 28), new w24(etc6, (Continuation) null, this), 5), 18), fqc.p(X1()));
    }

    public final String V2() {
        return "CHANNEL_CREATE";
    }

    public final void b3(int i, int i2, Intent intent) {
        h3(this.D1);
        if (i2 == -1 && i == 666 && intent != null) {
            CreateChannelViewModel i3 = i3();
            i3.getClass();
            j3((String) i3.h.getValue(i3, CreateChannelViewModel.G[0]), (RectF) intent.getParcelableExtra("ru.ok.tamtam.extra.CROPPED_RECT"), (Rect) intent.getParcelableExtra("ru.ok.tamtam.extra.CROPPED_ABSOLUTE"));
        } else {
            i3().l((String) null);
        }
        if (i2 == -1 && i == 88) {
            CreateChannelViewModel i32 = i3();
            xme xme = i32.m;
            o85 o85 = new o85(Boolean.FALSE);
            xme.getClass();
            xme.m((Object) null, o85);
            ev0.v(b0h.C(i32), ((osa) i32.g).a().plus(i32.F), (f14) null, new j34(i32, (Continuation) null), 2);
            return;
        }
        CreateChannelViewModel i33 = i3();
        i33.getClass();
        i33.D.setValue(i33, CreateChannelViewModel.G[7], (Object) null);
    }

    public final void e3(int i, String[] strArr, int[] iArr) {
        if (i == 158 && n54.U(strArr, iArr, "android.permission.CAMERA")) {
            i3().k();
        }
    }

    public final CreateChannelViewModel i3() {
        return (CreateChannelViewModel) this.B1.getValue();
    }

    public final void j3(String str, RectF rectF, Rect rect) {
        String str2;
        CreateChannelViewModel i3 = i3();
        i3.getClass();
        KProperty[] kPropertyArr = CreateChannelViewModel.G;
        i3.k.setValue(i3, kPropertyArr[3], rectF);
        CreateChannelViewModel i32 = i3();
        i32.getClass();
        i32.l.setValue(i32, kPropertyArr[4], rect);
        if (rect != null) {
            CreateChannelViewModel i33 = i3();
            try {
                str2 = m5a.r(str, rect, ((qra) ((id3) this.p1.b)).y().b);
            } catch (Exception unused) {
                z68.c("ru.ok.messages.channels.CreateChannelFragment", "local crop failed. Crop will be applied after update from server", new Object[0]);
                str2 = null;
            }
            i33.getClass();
            i33.i.setValue(i33, CreateChannelViewModel.G[1], str2);
            l3();
        }
    }

    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        boolean z = false;
        View inflate = layoutInflater.inflate(ujc.frg_channel_create, viewGroup, false);
        jv7 X1 = X1();
        t24 t24 = this.D1;
        t24.a(inflate, X1);
        inflate.setBackgroundColor(this.r1.n);
        b33 Y2 = Y2();
        if (Y2 != null) {
            Y2.l(S1(qad.z5));
        }
        OneMeAvatarView d = t24.d();
        d.setAvatarShape(goa.a);
        OneMeAvatarView.g(d, ew3.b(d.getContext(), ffc.ic_camera_add_filled_36), (joa) null, 30);
        ct.G(d, 300, new r24(this, 0));
        AppCompatEditText g = t24.g();
        g.setClipToOutline(true);
        float f = (float) 12;
        g.setOutlineProvider(new n04((float) MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f)));
        js9 js9 = fu4.k;
        g.setHintTextColor(js9.e(g.getContext()).f().getText().f);
        g.setTextColor(js9.e(g.getContext()).f().getText().e);
        g.setBackgroundColor(js9.e(g.getContext()).f().c().j);
        g.setInputType(16385);
        g.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i3().z)});
        g.setOnFocusChangeListener(new s24(this, g, 0));
        u3b.a(g, new u24(g, g, 0));
        g.addTextChangedListener(new ne1(1, this, g));
        KProperty[] kPropertyArr = t24.Z;
        ImageView imageView = (ImageView) t24.x.getValue(t24, kPropertyArr[4]);
        Editable text = t24.g().getText();
        imageView.setVisibility((text == null || text.length() == 0) ^ true ? 0 : 8);
        ct.G(imageView, 300, new r24(this, 1));
        AppCompatEditText e = t24.e();
        e.setClipToOutline(true);
        e.setOutlineProvider(new n04((float) MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
        e.setHintTextColor(js9.e(e.getContext()).f().getText().f);
        e.setTextColor(js9.e(e.getContext()).f().getText().e);
        e.setBackgroundColor(js9.e(e.getContext()).f().c().j);
        e.setInputType(147457);
        e.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i3().A)});
        e.addTextChangedListener(new u2(2, this));
        AppCompatTextView appCompatTextView = (AppCompatTextView) t24.z.getValue(t24, kPropertyArr[6]);
        Editable text2 = t24.e().getText();
        if (text2 == null || text2.length() == 0) {
            str = "";
        } else {
            int i = i3().A;
            Editable text3 = t24.e().getText();
            str = String.valueOf(i - (text3 != null ? text3.length() : 0));
        }
        appCompatTextView.setText(str);
        appCompatTextView.setTextColor(js9.e(appCompatTextView.getContext()).f().getText().f);
        puf.u.b(appCompatTextView, uy4.b);
        iq.h(this.r1, (ProgressBar) t24.X.getValue(t24, kPropertyArr[7]));
        OneMeButton f2 = t24.f();
        f2.setSize(aqa.c);
        f2.setMode(zpa.a);
        f2.setAppearance(xpa.o);
        Editable text4 = t24.g().getText();
        if (text4 == null || text4.length() == 0) {
            z = true;
        }
        f2.setEnabled(!z);
        f2.setText((CharSequence) f2.getResources().getString(qmc.oneme_create_channel_button_text));
        ct.G(f2, 300, new r24(this, 2));
        scf scf = this.r1;
        obd obd = new obd(new fj((a) this), (Toolbar) t24.o.getValue(t24, kPropertyArr[1]));
        obd.x = scf;
        b33 b33 = new b33(obd);
        b33.g(nad.u);
        b33.h(js9.e(G2()).f().getIcon().f);
        b33.i(new r24(this, 3));
        int i2 = scf.G;
        TextView textView = (TextView) b33.w;
        if (textView != null) {
            textView.setTextColor(i2);
        }
        if (bundle != null) {
            l3();
            CreateChannelViewModel i3 = i3();
            if (((Boolean) i3.E.getValue(i3, CreateChannelViewModel.G[8])).booleanValue()) {
                k3();
            }
        }
        return inflate;
    }

    public final void k3() {
        Context G2 = G2();
        String j = i3().j();
        wfb wfb = new wfb(G2, !(j == null || j.length() == 0), new grg(12, this));
        t24 t24 = this.D1;
        t24.getClass();
        KProperty kProperty = t24.Z[0];
        wfb.addOnLayoutChangeListener(new dr0(12, wfb));
        ((ConstraintLayout) t24.c.getValue(t24, kProperty)).addView(wfb);
        CreateChannelViewModel i3 = i3();
        i3.getClass();
        i3.E.setValue(i3, CreateChannelViewModel.G[8], Boolean.TRUE);
    }

    public final void l3() {
        OneMeAvatarView d = this.D1.d();
        d.setAvatarUrl(i3().j());
        String j = i3().j();
        d.setAddBadgeVisibility(!(j == null || j.length() == 0));
    }

    @oye
    public final void onEvent(a12 a12) {
        CreateChannelViewModel i3 = i3();
        i3.getClass();
        KProperty[] kPropertyArr = CreateChannelViewModel.G;
        if (((Number) i3.j.getValue(i3, kPropertyArr[2])).longValue() == a12.a) {
            if (this.o1) {
                CreateChannelViewModel i32 = i3();
                i32.getClass();
                i32.j.setValue(i32, kPropertyArr[2], 0L);
                CreateChannelViewModel i33 = i3();
                i33.getClass();
                String str = (String) i33.h.getValue(i33, kPropertyArr[0]);
                boolean z = !(str == null || str.length() == 0);
                long j = a12.b;
                if (z) {
                    String j2 = i3().j();
                    if (!(j2 == null || j2.length() == 0)) {
                        this.q1.g().j(j, j2);
                    }
                    CreateChannelViewModel i34 = i3();
                    i34.getClass();
                    ((jna) ((qra) ((id3) this.p1.b)).e()).M(j, m5a.n((RectF) i34.k.getValue(i34, kPropertyArr[3])), str);
                }
                o5.U(1, j, G2(), false);
                E2().finish();
                return;
            }
            ryg.S(this.s1, a12, true);
        }
    }

    @oye
    public final void onEvent(hj0 hj0) {
        CreateChannelViewModel i3 = i3();
        i3.getClass();
        KProperty[] kPropertyArr = CreateChannelViewModel.G;
        if (((Number) i3.j.getValue(i3, kPropertyArr[2])).longValue() == hj0.a) {
            if (this.o1) {
                CreateChannelViewModel i32 = i3();
                i32.getClass();
                i32.j.setValue(i32, kPropertyArr[2], 0L);
                h3(this.D1);
                hi7.b0(0, G2(), S1(qad.u1));
                return;
            }
            ryg.S(this.s1, hj0, true);
        }
    }
}

package ru.ok.messages.settings.folders.edit.presentation;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import org.apache.http.HttpStatus;
import ru.ok.messages.views.fragments.base.FrgBase;
import ru.ok.tamtam.stickers.panel.RelativePanelLayout;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/messages/settings/folders/edit/presentation/FolderEditFragment;", "Lru/ok/messages/views/fragments/base/FrgBase;", "Lbpe;", "Lfr7;", "Lb8b;", "bz5", "az5", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFolderEditFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FolderEditFragment.kt\nru/ok/messages/settings/folders/edit/presentation/FolderEditFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ViewModelExt.kt\nru/ok/tamtam/shared/lifecycle/ViewModelExtKt\n+ 4 Display.kt\nru/ok/tamtam/shared/DisplayKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 7 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,685:1\n112#2:686\n106#2,15:688\n14#3:687\n21#3:703\n54#4:704\n52#4:705\n54#4:790\n52#4:791\n54#4:792\n52#4:793\n54#4:794\n52#4:795\n54#4:796\n52#4:797\n326#5,2:706\n328#5,2:709\n326#5,2:711\n328#5,2:715\n326#5,2:717\n328#5,2:724\n326#5,2:726\n328#5,2:729\n326#5,2:731\n328#5,2:735\n326#5,2:737\n328#5,2:743\n65#5,2:771\n326#5,4:774\n326#5,2:778\n328#5,2:782\n68#5:784\n37#5:785\n53#5:786\n72#5:787\n24#6:708\n24#6:713\n24#6:714\n24#6:719\n24#6:720\n24#6:721\n24#6:722\n24#6:723\n24#6:728\n24#6:733\n24#6:734\n24#6:739\n24#6:740\n24#6:741\n24#6:742\n24#6:773\n24#6:780\n24#6:781\n108#6:788\n99#6:789\n24#6:798\n24#6:799\n108#6:800\n99#6:801\n58#7,23:745\n93#7,3:768\n*S KotlinDebug\n*F\n+ 1 FolderEditFragment.kt\nru/ok/messages/settings/folders/edit/presentation/FolderEditFragment\n*L\n88#1:686\n88#1:688,15\n88#1:687\n88#1:703\n160#1:704\n160#1:705\n455#1:790\n455#1:791\n479#1:792\n479#1:793\n575#1:794\n575#1:795\n640#1:796\n640#1:797\n224#1:706,2\n224#1:709,2\n228#1:711,2\n228#1:715,2\n233#1:717,2\n233#1:724,2\n317#1:726,2\n317#1:729,2\n321#1:731,2\n321#1:735,2\n326#1:737,2\n326#1:743,2\n411#1:771,2\n414#1:774,4\n419#1:778,2\n419#1:782,2\n411#1:784\n411#1:785\n411#1:786\n411#1:787\n225#1:708\n229#1:713\n230#1:714\n234#1:719\n235#1:720\n236#1:721\n237#1:722\n238#1:723\n318#1:728\n322#1:733\n323#1:734\n327#1:739\n328#1:740\n329#1:741\n330#1:742\n412#1:773\n420#1:780\n421#1:781\n449#1:788\n449#1:789\n642#1:798\n645#1:799\n104#1:800\n104#1:801\n348#1:745,23\n348#1:768,3\n*E\n"})
public final class FolderEditFragment extends FrgBase implements bpe, fr7, b8b {
    public final r46 B1;
    public final p25 C1;
    public final x15 D1;
    public final ch E1;
    public final ise F1;
    public final bz5 G1 = new bz5();
    public final bbg H1;
    public final Lazy I1;
    public final Lazy J1;
    public final Lazy K1;
    public cpe L1;
    public d8b M1;

    public FolderEditFragment(n06 n06, r46 r46, p25 p25, x15 x15, ch chVar, ise ise) {
        this.B1 = r46;
        this.C1 = p25;
        this.D1 = x15;
        this.E1 = chVar;
        this.F1 = ise;
        rn2 rn2 = new rn2(24, new j35(10, (Object) this, (Object) n06));
        tc tcVar = new tc(4, this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, new uc(3, tcVar));
        this.H1 = new bbg(Reflection.getOrCreateKotlinClass(FolderEditViewModel.class), (Function0) new vc(6, lazy), (Function0) rn2, (Function0) new vc(7, lazy));
        this.I1 = LazyKt.lazy(lazyThreadSafetyMode, new wy5(this, 0));
        this.J1 = LazyKt.lazy(lazyThreadSafetyMode, new wy5(this, 1));
        this.K1 = LazyKt.lazy(lazyThreadSafetyMode, new wy5(this, 2));
    }

    public final void A2(View view, Bundle bundle) {
        h3();
        hr7 hr7 = (hr7) this.I1.getValue();
        od6 od6 = (od6) X1();
        od6.b();
        lv7 lv7 = od6.v;
        hr7.getClass();
        lv7.a(hr7);
        bz5 bz5 = this.G1;
        ct.G(bz5.d(), 300, new uy5(this, 2));
        bz5.f().addTextChangedListener(new u2(4, this));
        ct.G(bz5.i(), 300, new uy5(this, 3));
        bz5.f().setOnFocusChangeListener(new i23(2, this));
        ev0.v(fqc.p(X1()), (CoroutineContext) null, (f14) null, new gz5(this, (Continuation) null), 3);
    }

    public final void H0(long j) {
    }

    public final void P() {
        if (G2().getResources().getConfiguration().orientation == 2) {
            this.G1.j().setVisibility(8);
            l3();
        }
        FolderEditViewModel j3 = j3();
        if (j3.j().a) {
            zz5 a = zz5.a(j3.j(), false, (e15) null, false, 126);
            xme xme = j3.h;
            xme.getClass();
            xme.m((Object) null, a);
        }
    }

    public final String V2() {
        return "CHAT_FOLDER_CREATE";
    }

    public final void Z2(View view) {
        h3();
    }

    public final void b0() {
        FolderEditViewModel j3 = j3();
        xme xme = j3.h;
        zz5 a = zz5.a(j3.j(), false, (e15) null, false, 125);
        xme.getClass();
        xme.m((Object) null, a);
        j3().l(this.G1.f().getText());
    }

    public final void d(e15 e15) {
        j3().k(e15);
        j3().l(this.G1.f().getText());
    }

    public final void f(e15 e15, e15 e152) {
        j3().k(e152);
        j3().l(this.G1.f().getText());
    }

    public final void g1() {
        this.G1.j().setVisibility(0);
        i3();
    }

    public final long h1() {
        return -1;
    }

    public final void h3() {
        View view = this.S0;
        if (view != null) {
            scf scf = this.r1;
            view.setBackgroundColor(scf.n);
            bz5 bz5 = this.G1;
            bz5.j().setTextColor(scf.G);
            TextInputLayout g = bz5.g();
            int i = scf.z;
            g.setCounterOverflowTextColor(ColorStateList.valueOf(i));
            bz5.g().setBoxStrokeErrorColor(ColorStateList.valueOf(i));
            bz5.g().setErrorTextColor(ColorStateList.valueOf(i));
            KProperty[] kPropertyArr = bz5.w0;
            KProperty kProperty = kPropertyArr[8];
            w28 w28 = bz5.Y;
            ((ImageButton) w28.getValue(bz5, kProperty)).setBackground(scf.d());
            Drawable drawable = bz5.v0;
            if (drawable != null) {
                drawable.setTint(this.r1.x);
                ((ImageButton) w28.getValue(bz5, kPropertyArr[8])).setImageDrawable(drawable);
            }
            ((TextView) bz5.w.getValue(bz5, kPropertyArr[3])).setTextColor(scf.N);
            bz5.f().setHintTextColor(this.r1.N);
            bz5.f().setTextColor(this.r1.G);
            iq.W(bz5.f(), this.r1.l);
            iq.k(this.r1, bz5.g());
            bz5.g().setCounterTextColor(ColorStateList.valueOf(this.r1.N));
            Drawable drawable2 = bz5.Z;
            if (drawable2 != null) {
                drawable2.setTint(this.r1.x);
                bz5.h().setImageDrawable(drawable2);
            }
            ImageButton h = bz5.h();
            scf scf2 = this.r1;
            h.setBackground(i8b.J(scf2.I, scf2.j));
            if (G2().getResources().getConfiguration().orientation == 2) {
                bz5.i().setBackground(i8b.f(0, scf.j, 0, MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density)));
                bz5.i().setTextColor(scf.l);
            } else {
                iq.f(this.r1, bz5.i(), MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density), 0, 0, 60);
                bz5.i().setTextColor(-1);
            }
            xoe s = cvg.s(scf, view.getContext());
            cpe cpe = this.L1;
            if (cpe != null) {
                cpe.setTheme(s);
            }
        }
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        b0h.b(E2().getOnBackPressedDispatcher(), this, new rx2(13, this));
    }

    public final void i3() {
        boolean q = this.E1.q();
        bz5 bz5 = this.G1;
        if (q) {
            TransitionManager.beginDelayedTransition(bz5.e(), new ChangeBounds());
        }
        ViewGroup.LayoutParams layoutParams = bz5.e().getLayoutParams();
        layoutParams.height = -1;
        bz5.e().setLayoutParams(layoutParams);
    }

    public final FolderEditViewModel j3() {
        return (FolderEditViewModel) this.H1.getValue();
    }

    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(ujc.fragment_chat_folder_edit, viewGroup, false);
        jv7 X1 = X1();
        bz5 bz5 = this.G1;
        bz5.a(inflate, X1);
        KProperty[] kPropertyArr = bz5.w0;
        ct.G((ImageButton) bz5.Y.getValue(bz5, kPropertyArr[8]), 300, new uy5(this, 0));
        bz5.d().setBackground((GradientDrawable) this.J1.getValue());
        Drawable b = ew3.b(G2(), nad.V);
        b.setTint(this.r1.x);
        bz5.Z = b;
        Drawable b2 = ew3.b(G2(), nad.u);
        b2.setTint(this.r1.x);
        bz5.v0 = b2;
        ImageButton h = bz5.h();
        h.setImageDrawable(bz5.Z);
        scf scf = this.r1;
        h.setBackground(i8b.J(scf.n, scf.j));
        ct.G(h, 300, new uy5(this, 1));
        bz5.f().setText((CharSequence) null);
        bz5.f().setOnEditorActionListener(new vy5(0));
        RelativePanelLayout relativePanelLayout = (RelativePanelLayout) inflate;
        d8b d8b = new d8b(G2(), relativePanelLayout, this);
        this.M1 = d8b;
        relativePanelLayout.setSizeListener(d8b);
        cpe cpe = new cpe(O1());
        cpe.N((gb8) null, true);
        cpe.setPageProvider(this.C1);
        cpe.setStickers(this.F1);
        cpe.setListener(this);
        d8b d8b2 = this.M1;
        if (d8b2 != null) {
            if (d8b2.h == null) {
                d8b2.h = new FrameLayout(d8b2.b);
            }
            d8b2.h.addView(cpe);
        }
        d8b d8b3 = this.M1;
        if (d8b3 != null) {
            d8b3.d();
        }
        this.L1 = cpe;
        if (G2().getResources().getConfiguration().orientation == 2) {
            pj3 pj3 = new pj3();
            pj3.d(bz5.e());
            pj3.e(bz5.d().getId(), 7, bz5.g().getId(), 6);
            pj3.e(bz5.d().getId(), 3, bz5.e().getId(), 3);
            pj3.e(bz5.d().getId(), 4, bz5.e().getId(), 4);
            pj3.e(bz5.d().getId(), 6, bz5.e().getId(), 6);
            pj3.e(bz5.g().getId(), 6, bz5.d().getId(), 7);
            pj3.e(bz5.g().getId(), 3, bz5.d().getId(), 3);
            pj3.e(bz5.g().getId(), 4, bz5.d().getId(), 4);
            pj3.e(bz5.g().getId(), 7, bz5.e().getId(), 7);
            pj3.c(bz5.i().getId(), 6);
            pj3.e(bz5.i().getId(), 3, bz5.e().getId(), 3);
            pj3.c(bz5.i().getId(), 4);
            pj3.e(bz5.i().getId(), 7, bz5.e().getId(), 7);
            pj3.a(bz5.e());
            ImageView d = bz5.d();
            ViewGroup.LayoutParams layoutParams = d.getLayoutParams();
            if (layoutParams != null) {
                fj3 fj3 = (fj3) layoutParams;
                float f = (float) 16;
                fj3.setMarginStart(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
                d.setLayoutParams(fj3);
                Button i = bz5.i();
                ViewGroup.LayoutParams layoutParams2 = i.getLayoutParams();
                if (layoutParams2 != null) {
                    fj3 fj32 = (fj3) layoutParams2;
                    fj32.setMarginEnd(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
                    fj32.topMargin = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
                    i.setLayoutParams(fj32);
                    TextInputLayout g = bz5.g();
                    ViewGroup.LayoutParams layoutParams3 = g.getLayoutParams();
                    if (layoutParams3 != null) {
                        fj3 fj33 = (fj3) layoutParams3;
                        fj33.setMarginStart(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
                        fj33.topMargin = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
                        fj33.setMarginEnd(MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density));
                        fj33.bottomMargin = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
                        fj33.width = MathKt.roundToInt(((float) HttpStatus.SC_BAD_REQUEST) * vo4.c().getDisplayMetrics().density);
                        g.setLayoutParams(fj33);
                        bz5.f().setGravity(8388611);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        } else {
            pj3 pj32 = new pj3();
            pj32.d(bz5.e());
            pj32.e(bz5.d().getId(), 6, bz5.e().getId(), 6);
            pj32.e(bz5.d().getId(), 3, ((TextView) bz5.w.getValue(bz5, kPropertyArr[3])).getId(), 4);
            pj32.e(bz5.d().getId(), 4, bz5.g().getId(), 3);
            pj32.e(bz5.d().getId(), 7, bz5.e().getId(), 7);
            pj32.e(bz5.g().getId(), 6, bz5.e().getId(), 6);
            pj32.e(bz5.g().getId(), 3, bz5.d().getId(), 4);
            pj32.e(bz5.g().getId(), 4, bz5.i().getId(), 3);
            pj32.e(bz5.g().getId(), 7, bz5.e().getId(), 7);
            pj32.e(bz5.i().getId(), 6, bz5.e().getId(), 6);
            pj32.c(bz5.i().getId(), 3);
            pj32.e(bz5.i().getId(), 4, bz5.e().getId(), 4);
            pj32.e(bz5.i().getId(), 7, bz5.e().getId(), 7);
            pj32.a(bz5.e());
            ImageView d2 = bz5.d();
            ViewGroup.LayoutParams layoutParams4 = d2.getLayoutParams();
            if (layoutParams4 != null) {
                fj3 fj34 = (fj3) layoutParams4;
                float f2 = (float) 0;
                fj34.setMarginStart(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
                d2.setLayoutParams(fj34);
                Button i2 = bz5.i();
                ViewGroup.LayoutParams layoutParams5 = i2.getLayoutParams();
                if (layoutParams5 != null) {
                    fj3 fj35 = (fj3) layoutParams5;
                    float f3 = (float) 40;
                    fj35.setMarginEnd(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3));
                    fj35.topMargin = MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density);
                    i2.setLayoutParams(fj35);
                    TextInputLayout g2 = bz5.g();
                    ViewGroup.LayoutParams layoutParams6 = g2.getLayoutParams();
                    if (layoutParams6 != null) {
                        fj3 fj36 = (fj3) layoutParams6;
                        fj36.setMarginStart(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3));
                        fj36.topMargin = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
                        fj36.setMarginEnd(MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
                        fj36.bottomMargin = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
                        g2.setLayoutParams(fj36);
                        bz5.f().setGravity(17);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        return inflate;
    }

    public final void k3(boolean z) {
        if (!((hr7) this.I1.getValue()).b.w || !z) {
            FolderEditViewModel j3 = j3();
            if (!j3.j().a || !z) {
                o85 o85 = new o85(wz5.a);
                xme xme = j3.f;
                xme.getClass();
                xme.m((Object) null, o85);
                return;
            }
            zz5 a = zz5.a(j3.j(), false, (e15) null, false, 126);
            xme xme2 = j3.h;
            xme2.getClass();
            xme2.m((Object) null, a);
            return;
        }
        hd8.B(E2());
    }

    public final void l3() {
        bz5 bz5 = this.G1;
        ImageView d = bz5.d();
        if (!d.isLaidOut() || d.isLayoutRequested()) {
            d.addOnLayoutChangeListener(new dr0(5, this));
            return;
        }
        int e = a81.e((float) 32, vo4.c().getDisplayMetrics().density, bz5.e().getHeight());
        if (d.getHeight() > e) {
            ViewGroup.LayoutParams layoutParams = d.getLayoutParams();
            if (layoutParams != null) {
                fj3 fj3 = (fj3) layoutParams;
                fj3.height = e;
                fj3.width = e;
                d.setLayoutParams(fj3);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ViewGroup.LayoutParams layoutParams2 = d.getLayoutParams();
        if (layoutParams2 != null) {
            fj3 fj32 = (fj3) layoutParams2;
            float f = (float) 80;
            fj32.height = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
            fj32.width = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
            d.setLayoutParams(fj32);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public final void m2() {
        super.m2();
        hr7 hr7 = (hr7) this.I1.getValue();
        od6 od6 = (od6) X1();
        od6.b();
        lv7 lv7 = od6.v;
        hr7.getClass();
        lv7.b(hr7);
        cpe cpe = this.L1;
        if (cpe != null) {
            cpe.setListener((bpe) null);
        }
        this.L1 = null;
        this.M1 = null;
    }

    public final void m3() {
        if (!this.M1.e()) {
            if (((hr7) this.I1.getValue()).b.w) {
                hd8.B(E2());
            }
            boolean q = this.E1.q();
            bz5 bz5 = this.G1;
            if (q) {
                ConstraintLayout e = bz5.e();
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.addListener(new m6(1, this));
                TransitionManager.beginDelayedTransition(e, changeBounds);
            } else {
                this.M1.h(this.L1);
            }
            ViewGroup.LayoutParams layoutParams = bz5.e().getLayoutParams();
            layoutParams.height = I2().getHeight() - this.M1.c();
            bz5.e().setLayoutParams(layoutParams);
            if (G2().getResources().getConfiguration().orientation == 2) {
                bz5.j().setVisibility(8);
                l3();
            }
        }
    }

    public final void t2() {
        super.t2();
        d8b d8b = this.M1;
        if (d8b != null) {
            d8b.f();
        }
    }

    public final void w2() {
        super.w2();
        d8b d8b = this.M1;
        if (d8b != null) {
            d8b.g();
        }
    }
}

package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.sequences.SequencesKt;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: wd1  reason: default package */
public final class wd1 extends pae {
    public final Function0 X;
    public final vag v;
    public final Executor w;
    public final vd1 x;
    public final Function0 y;
    public final Function0 z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public wd1(defpackage.vag r4, defpackage.vd1 r5, kotlin.jvm.functions.Function0 r6, defpackage.nk1 r7, defpackage.c61 r8, int r9) {
        /*
            r3 = this;
            sjd r0 = defpackage.sjd.a
            aua r0 = r0.t()
            java.util.concurrent.ExecutorService r0 = r0.a()
            r1 = r9 & 16
            r2 = 0
            if (r1 == 0) goto L_0x0010
            r7 = r2
        L_0x0010:
            r9 = r9 & 32
            if (r9 == 0) goto L_0x0015
            r8 = r2
        L_0x0015:
            r3.<init>(r0)
            r3.v = r4
            r3.w = r0
            r3.x = r5
            r3.y = r6
            r3.z = r7
            r3.X = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd1.<init>(vag, vd1, kotlin.jvm.functions.Function0, nk1, c61, int):void");
    }

    /* renamed from: J */
    public final void s(kbe kbe, int i) {
        t(kbe, i, CollectionsKt.emptyList());
    }

    /* renamed from: L */
    public final void t(kbe kbe, int i, List list) {
        Function0 function0;
        if ((kbe instanceof ud1 ? (ud1) kbe : null) != null) {
            vag.a.getClass();
            if (this.v != vag.o) {
                ((ud1) kbe).E0.setMode(en1.b);
            } else if (j() == 1 && (function0 = this.X) != null && ((Number) function0.invoke()).intValue() == 0) {
                ((ud1) kbe).E0.setMode(en1.v);
            } else {
                ((ud1) kbe).E0.setMode(en1.a);
            }
        }
        int N = N();
        View view = kbe.a;
        if (!(view.getWidth() == N && view.getHeight() == N)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = N;
                layoutParams.height = N;
                view.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        ov ovVar = (ov) this.o;
        if (((na1) ovVar.f.get(i)).i() != 1) {
            kbe.M((lz7) ovVar.f.get(i));
        } else if (list.isEmpty()) {
            kbe.M((lz7) ovVar.f.get(i));
        } else {
            ud1 ud1 = (ud1) kbe;
            for (ka1 ka1 : SequencesKt.filter(SequencesKt.flatMapIterable(CollectionsKt.asSequence(list), new h9(27)), m61.o)) {
                boolean z2 = ka1 instanceof ga1;
                gn1 gn1 = ud1.E0;
                if (z2) {
                    ga1 ga1 = (ga1) ka1;
                    gn1.T(ga1.a, ga1.b);
                } else if (ka1 instanceof ha1) {
                    gn1.setNetworkState(((ha1) ka1).a);
                } else if (ka1 instanceof fa1) {
                    gn1.Q(((fa1) ka1).a);
                } else if (ka1 instanceof ia1) {
                    gn1.R(((ia1) ka1).a);
                } else if (ka1 instanceof da1) {
                    gn1.setAvatar(((da1) ka1).a);
                } else if (ka1 instanceof ea1) {
                    gn1.setButtonAction(((ea1) ka1).a);
                } else if (ka1 instanceof ja1) {
                    gn1.setOpponentVideo(((ja1) ka1).a);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    public final int N() {
        int ordinal = this.v.ordinal();
        if (ordinal == 0) {
            return MathKt.roundToInt(((float) 96) * vo4.c().getDisplayMetrics().density);
        }
        if (ordinal == 1) {
            return MathKt.roundToInt(((float) 0) * vo4.c().getDisplayMetrics().density);
        }
        if (ordinal == 2) {
            return -1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int l(int i) {
        return ((na1) ((ov) this.o).f.get(i)).i();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [androidx.constraintlayout.widget.ConstraintLayout, android.view.View, bk1, android.view.ViewGroup] */
    public final pzc u(ViewGroup viewGroup, int i) {
        en1 en1;
        int i2 = i;
        int N = N();
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(N, N));
        vd1 vd1 = this.x;
        if (i2 == 2) {
            Context context = viewGroup.getContext();
            LinearLayout linearLayout = new LinearLayout(context, (AttributeSet) null);
            linearLayout.setOrientation(1);
            l2b l2b = l2b.a;
            linearLayout.setBackgroundColor(l2b.d.j);
            kne.L(linearLayout, vo4.c().getDisplayMetrics().density * 20.0f);
            float f = (float) 28;
            float f2 = (float) 16;
            linearLayout.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
            AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
            appCompatImageView.setId(View.generateViewId());
            linearLayout.setGravity(17);
            appCompatImageView.setImageResource(pec.ic_invite_opponents_43);
            appCompatImageView.setImageTintList(ColorStateList.valueOf(l2b.f.f));
            AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
            appCompatTextView.setId(View.generateViewId());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            float f3 = (float) 0;
            float f4 = (float) 4;
            layoutParams.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4));
            appCompatTextView.setLayoutParams(layoutParams);
            appCompatTextView.setGravity(17);
            puf.j.b(appCompatTextView, uy4.b);
            xef xef = l2b.i;
            appCompatTextView.setTextColor(xef.e);
            appCompatTextView.setText(ykc.call_item_invite_opponent_preview_title);
            AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, (AttributeSet) null);
            appCompatTextView2.setId(View.generateViewId());
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(f4 * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
            appCompatTextView2.setLayoutParams(layoutParams2);
            appCompatTextView2.setGravity(17);
            puf.m.b(appCompatTextView2, uy4.b);
            appCompatTextView2.setTextColor(xef.f);
            appCompatTextView2.setText(ykc.call_item_invite_opponent_preview_description);
            OneMeButton oneMeButton = new OneMeButton(context, (AttributeSet) null);
            oneMeButton.setId(View.generateViewId());
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
            oneMeButton.setLayoutParams(layoutParams3);
            oneMeButton.setMode(zpa.b);
            oneMeButton.setSize(aqa.b);
            oneMeButton.setAppearance(xpa.a);
            oneMeButton.setText(ykc.call_item_invite_opponent_preview_button_share);
            ct.G(oneMeButton, 300, new x4(15, (Object) linearLayout));
            oneMeButton.setCustomTheme(l2b);
            float f5 = (float) 38;
            linearLayout.addView(appCompatImageView, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f5), MathKt.roundToInt(f5 * vo4.c().getDisplayMetrics().density));
            linearLayout.addView(appCompatTextView);
            linearLayout.addView(appCompatTextView2);
            linearLayout.addView(oneMeButton);
            linearLayout.setId(kgc.call_invite_opponent_preview);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.addView(linearLayout);
            return new td1(frameLayout, (z91) vd1);
        } else if (i2 != 3) {
            gn1 gn1 = new gn1(viewGroup.getContext(), (AttributeSet) null);
            gn1.setId(kgc.call_opponent);
            int ordinal = this.v.ordinal();
            if (ordinal == 0) {
                en1 = en1.b;
            } else if (ordinal == 1) {
                en1 = en1.b;
            } else if (ordinal == 2) {
                en1 = en1.a;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            gn1.setMode(en1);
            gn1.setCustomTheme(l2b.a);
            gn1.setCallSpeakerMediator(this.z);
            gn1.setVideoLayoutUpdatesControllerProvider(this.y);
            frameLayout.addView(gn1, -1, -1);
            return new ud1(frameLayout, vd1);
        } else {
            Context context2 = viewGroup.getContext();
            ? constraintLayout = new ConstraintLayout(context2, (AttributeSet) null);
            constraintLayout.setBackgroundColor(l2b.d.f);
            kne.L(constraintLayout, vo4.c().getDisplayMetrics().density * 20.0f);
            AppCompatTextView appCompatTextView3 = new AppCompatTextView(context2, (AttributeSet) null);
            appCompatTextView3.setId(qqa.I);
            appCompatTextView3.setLayoutParams(new fj3(-1, -2));
            appCompatTextView3.setGravity(17);
            puf.b.b(appCompatTextView3, uy4.b);
            appCompatTextView3.setTextColor(l2b.i.e);
            appCompatTextView3.setText(ykc.call_item_join_by_link_preview_title);
            p8d p8d = new p8d(context2, (AttributeSet) null);
            p8d.setId(qqa.E);
            int i3 = pqa.m;
            l2b.f.getClass();
            p8d.N(i3, -1);
            p8d.setAccessibility(Integer.valueOf(sqa.d));
            p8d.setMode(k8d.v);
            float f6 = (float) 32;
            p8d.setImageSize(new l8d(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f6), MathKt.roundToInt(f6 * vo4.c().getDisplayMetrics().density)));
            p8d.setButtonPadding(MathKt.roundToInt(((float) 3) * vo4.c().getDisplayMetrics().density));
            ct.G(p8d, 300, new zj1(constraintLayout, 0));
            p8d p8d2 = new p8d(context2, (AttributeSet) null);
            p8d2.setId(qqa.F);
            k8d k8d = k8d.a;
            p8d2.setMode(k8d);
            float f7 = (float) 56;
            p8d2.setImageSize(new l8d(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f7), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f7)));
            float f8 = (float) 6;
            p8d2.setButtonPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f8));
            p8d.P(p8d2, pqa.p);
            int i4 = sqa.r;
            p8d2.setTitle(new igf(i4));
            p8d2.setAccessibility(Integer.valueOf(i4));
            ct.G(p8d2, 300, new zj1(constraintLayout, 1));
            p8d p8d3 = new p8d(context2, (AttributeSet) null);
            p8d3.setId(qqa.H);
            p8d3.setMode(k8d);
            p8d3.setImageSize(new l8d(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f7), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f7)));
            p8d3.setButtonPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f8));
            p8d.P(p8d3, pqa.Q);
            int i5 = sqa.t;
            p8d3.setTitle(new igf(i5));
            p8d3.setAccessibility(Integer.valueOf(i5));
            ct.G(p8d3, 300, new zj1(constraintLayout, 2));
            p8d p8d4 = new p8d(context2, (AttributeSet) null);
            p8d4.setId(qqa.G);
            p8d4.setMode(k8d);
            p8d4.setImageSize(new l8d(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f7), MathKt.roundToInt(f7 * vo4.c().getDisplayMetrics().density)));
            p8d4.setButtonPadding(MathKt.roundToInt(f8 * vo4.c().getDisplayMetrics().density));
            p8d.P(p8d4, pqa.O);
            int i6 = sqa.s;
            p8d4.setTitle(new igf(i6));
            p8d4.setAccessibility(Integer.valueOf(i6));
            ct.G(p8d4, 300, new zj1(constraintLayout, 3));
            constraintLayout.addView(appCompatTextView3);
            constraintLayout.addView(p8d);
            constraintLayout.addView(p8d2);
            constraintLayout.addView(p8d3);
            constraintLayout.addView(p8d4);
            pj3 h = ct.h(constraintLayout);
            int id = p8d.getId();
            h.e(id, 3, 0, 3);
            float f9 = (float) 12;
            tr1.u(f9, vo4.c().getDisplayMetrics().density, new ila(h, 3, id, 4));
            h.e(id, 7, 0, 7);
            new ila(h, 7, id, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f9));
            int id2 = appCompatTextView3.getId();
            h.e(id2, 3, p8d.getId(), 4);
            h.e(id2, 7, 0, 7);
            tr1.u(f9, vo4.c().getDisplayMetrics().density, new ila(h, 7, id2, 4));
            h.e(id2, 6, 0, 6);
            new ila(h, 6, id2, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f9));
            int id3 = p8d2.getId();
            h.e(id3, 3, appCompatTextView3.getId(), 4);
            tr1.u((float) 4, vo4.c().getDisplayMetrics().density, new ila(h, 3, id3, 4));
            h.e(id3, 6, 0, 6);
            new ila(h, 6, id3, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f9));
            h.e(id3, 7, p8d4.getId(), 6);
            h.e(id3, 4, 0, 4);
            new ila(h, 4, id3, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f9));
            int id4 = p8d4.getId();
            h.e(id4, 3, p8d2.getId(), 3);
            h.e(id4, 6, p8d2.getId(), 7);
            h.e(id4, 7, p8d3.getId(), 6);
            h.e(id4, 4, p8d2.getId(), 4);
            int id5 = p8d3.getId();
            h.e(id5, 3, p8d4.getId(), 3);
            h.e(id5, 6, p8d4.getId(), 7);
            h.e(id5, 7, 0, 7);
            new ila(h, 7, id5, 4).e(MathKt.roundToInt(f9 * vo4.c().getDisplayMetrics().density));
            h.e(id5, 4, p8d4.getId(), 4);
            h.a(constraintLayout);
            constraintLayout.setId(kgc.call_copy_link_preview);
            constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.addView(constraintLayout);
            return new td1(frameLayout, (ak1) vd1);
        }
    }
}

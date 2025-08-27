package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import ru.ok.messages.actions.ExtraActionsView;
import ru.ok.messages.chats.common.CommonChatsViewModel;
import ru.ok.onechat.widgets.NumberTextView;

/* renamed from: c73  reason: default package */
public final class c73 extends jj0 implements u65 {
    public final /* synthetic */ int v;
    public Object w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c73(j4b j4b, int i) {
        super(j4b);
        this.v = i;
    }

    public boolean E1() {
        CommonChatsViewModel commonChatsViewModel = (CommonChatsViewModel) this.w;
        if (commonChatsViewModel == null) {
            return false;
        }
        i83 l = commonChatsViewModel.l();
        y73 y73 = l instanceof y73 ? (y73) l : null;
        return y73 != null && y73.b;
    }

    public void I(hrc hrc, int i, List list) {
        scf scf;
        RecyclerView recyclerView = (RecyclerView) this.w;
        if (recyclerView != null) {
            rae.w(E(i));
            if (hrc instanceof frc) {
                frc frc = (frc) hrc;
                if (recyclerView.getItemAnimator() != null) {
                    Iterable iterable = list;
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                }
                NumberTextView numberTextView = frc.D0;
                if (numberTextView.isInEditMode()) {
                    scf = vi4.f0;
                } else {
                    Context context = numberTextView.getContext();
                    Lazy lazy = scf.b0;
                    scf = j4b.k0(context);
                }
                numberTextView.setTextColor(scf.i.b.a.b);
                numberTextView.setAlpha(0.72f);
                throw null;
            } else if (!(hrc instanceof grc)) {
                throw new NoWhenBranchMatchedException();
            } else if (((grc) hrc).D0.getLayoutParams() == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            } else {
                throw null;
            }
        }
    }

    public long k(int i) {
        switch (this.v) {
            case 0:
                return ((g83) E(i)).getId();
            case 1:
                return (long) ((zs3) E(i)).a.ordinal();
            case 3:
                rae.w(E(i));
                throw null;
            default:
                return super.k(i);
        }
    }

    public int l(int i) {
        switch (this.v) {
            case 0:
                g83 g83 = (g83) E(i);
                if (Intrinsics.areEqual((Object) g83, (Object) a83.a)) {
                    return a83.b;
                }
                if (Intrinsics.areEqual((Object) g83, (Object) c83.a)) {
                    return c83.b;
                }
                if (g83 instanceof e83) {
                    int i2 = e83.e;
                    return e83.e;
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                int ordinal = ((zs3) E(i)).a.ordinal();
                if (ordinal != 0) {
                    return (ordinal == 2 || ordinal == 3) ? 2 : 1;
                }
                return 0;
            case 3:
                rae.w(E(i));
                throw null;
            case 4:
                return hra.t;
            case 5:
                return ((ykd) E(i)).i();
            default:
                return super.l(i);
        }
    }

    public void r(RecyclerView recyclerView) {
        switch (this.v) {
            case 3:
                this.w = recyclerView;
                return;
            default:
                return;
        }
    }

    public final void s(pzc pzc, int i) {
        CharSequence charSequence;
        a32 a32;
        vk3 m;
        String str;
        String str2;
        pzc pzc2 = pzc;
        int i2 = i;
        boolean z = true;
        switch (this.v) {
            case 0:
                a73 a73 = (a73) pzc2;
                g83 g83 = (g83) E(i2);
                if ((a73 instanceof y63) && (g83 instanceof e83)) {
                    y63 y63 = (y63) a73;
                    e83 e83 = (e83) g83;
                    pb pbVar = new pb(17, this, (e83) g83);
                    y63.D0.a(e83.a, false);
                    y63.E0.setText(e83.b);
                    y63.F0.setText(e83.c);
                    ct.G(y63.a, 300, pbVar);
                    return;
                }
                return;
            case 1:
                zs3 zs3 = (zs3) E(i2);
                if (!(pzc2 instanceof at3)) {
                    if (pzc2 instanceof tt3) {
                        tt3 tt3 = (tt3) pzc2;
                        boolean z2 = j() > 1;
                        owa owa = (owa) tt3.a;
                        int ordinal = zs3.a.ordinal();
                        if (ordinal == 2) {
                            owa.setTitle(q8.p(roa.f, owa.getContext()));
                            owa.setSubtitle(q8.p(roa.e, owa.getContext()));
                            float f = (float) 56;
                            owa.M(ew3.b(owa.getContext(), cad.b), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
                            owa.P0.setColors(tt3.F0, new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
                        } else if (ordinal == 3) {
                            owa.setTitle(q8.p(roa.d, owa.getContext()));
                            owa.setSubtitle(q8.p(roa.g, owa.getContext()));
                            float f2 = (float) 56;
                            owa.M(ew3.b(owa.getContext(), cad.w1), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
                            owa.P0.setColors(tt3.G0, new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
                        }
                        owa.setCloseButtonVisibility(false);
                        owa.setBannerClickListener(new et3(tt3, zs3, z2, 1));
                        owa.setCloseButtonClickListener(new pb(21, tt3, zs3));
                        return;
                    } else if (pzc2 instanceof ft3) {
                        ft3 ft3 = (ft3) pzc2;
                        boolean z3 = j() > 1;
                        pra pra = (pra) ft3.a;
                        int ordinal2 = zs3.a.ordinal();
                        if (ordinal2 == 1) {
                            pra.setTitle(q8.p(roa.c, pra.getContext()));
                            pra.setSubtitle(q8.p(roa.b, pra.getContext()));
                            float f3 = (float) 24;
                            pra.M(ew3.b(pra.getContext(), cad.b), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
                            pra.Q0.setColors(ft3.F0, new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
                        } else if (ordinal2 == 4) {
                            pra.setTitle(q8.p(roa.a, pra.getContext()));
                            pra.setSubtitle(q8.p(roa.g, pra.getContext()));
                            float f4 = (float) 24;
                            pra.M(ew3.b(pra.getContext(), cad.w1), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4), MathKt.roundToInt(f4 * vo4.c().getDisplayMetrics().density));
                            pra.Q0.setColors(ft3.G0, new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
                        }
                        pra.setCloseButtonVisibility(false);
                        pra.setBannerClickListener(new et3(ft3, zs3, z3, 0));
                        pra.setCloseButtonClickListener(new pb(20, ft3, zs3));
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                xk6 xk6 = (xk6) pzc2;
                lf5 lf5 = (lf5) E(i2);
                xk6.a.setOnClickListener(new h24(3, (Object) (ExtraActionsView) ((mf5) this.w), (Object) lf5));
                pm6 pm6 = (pm6) lf5.c;
                if (pm6 != null) {
                    String str3 = pm6.c;
                    TextView textView = xk6.E0;
                    textView.setText(str3);
                    textView.setTextColor(pm6.h);
                    xk6.D0.setController(pm6.k);
                    return;
                }
                return;
            case 3:
                I((hrc) pzc2, i2, CollectionsKt.emptyList());
                return;
            case 4:
                ((guc) ((huc) pzc2).a).setContacts((List) E(i2));
                return;
            default:
                ykd ykd = (ykd) E(i2);
                if (ykd instanceof pp2) {
                    pp2 pp2 = (pp2) ykd;
                    bkd bkd = new bkd(this, 0);
                    ckd ckd = new ckd(this, 0);
                    i42 i42 = (i42) ((qp2) pzc2).a;
                    ct.G(i42, 300, new pb(13, bkd, pp2));
                    i42.setOnLongClickListener(new v32(ckd, pp2, i42, 3));
                    int id = i42.getId();
                    i42.setId(Long.hashCode(pp2.c));
                    isb isb = pp2.v0;
                    i42.setTitle(i42.b(isb.a.toString()) ? n54.S(isb.a, pp2.b, isb.b) : isb.a);
                    i42.setSubtitle(pp2.w0);
                    Uri uri = pp2.Y;
                    if (uri == null) {
                        i42.c(pp2.D0, Long.valueOf(pp2.Z));
                    } else {
                        i42.setAvatar(uri);
                    }
                    i42.setPinned(pp2.o);
                    i42.setMuted(pp2.v);
                    i42.setMention(pp2.w);
                    i42.setReaction(pp2.x);
                    i42.setTime(pp2.y);
                    if (id != i42.getId()) {
                        z = false;
                    }
                    i42.e(pp2.z, z);
                    i42.setStatus(pp2.X);
                    i42.setVerified(pp2.E0);
                    return;
                } else if (ykd instanceof ns6) {
                    ns6 ns6 = (ns6) ykd;
                    ued ued = new ued(1, this, (ns6) ykd);
                    ui0 ui0 = new ui0(19);
                    i42 i422 = (i42) ((os6) pzc2).a;
                    ct.G(i422, 300, new h24(8, (Object) ued, (Object) ns6));
                    i422.setOnLongClickListener(new v32(ui0, ns6, i422, 8));
                    i422.setId(Long.hashCode(ns6.c));
                    isb isb2 = ns6.w;
                    boolean b = i422.b(isb2.a.toString());
                    List list = ns6.b;
                    i422.setTitle(b ? n54.S(isb2.a, list, isb2.b) : isb2.a);
                    isb isb3 = ns6.x;
                    CharSequence charSequence2 = isb3.a;
                    if (i422.a(charSequence2.toString())) {
                        charSequence2 = n54.S(charSequence2, list, isb3.b);
                    }
                    i422.setSubtitle(charSequence2);
                    Uri uri2 = ns6.v;
                    if (uri2 == null) {
                        i422.c(ns6.X, Long.valueOf(ns6.c));
                    } else {
                        i422.setAvatar(uri2);
                    }
                    i422.setTime(ns6.o);
                    i422.setVerified(ns6.Y);
                    return;
                } else if (ykd instanceof bs3) {
                    bs3 bs3 = (bs3) ykd;
                    bkd bkd2 = new bkd(this, 1);
                    ckd ckd2 = new ckd(this, 1);
                    ol3 ol3 = (ol3) ((ds3) pzc2).a;
                    ct.G(ol3, 300, new pb(19, bkd2, bs3));
                    ol3.setOnLongClickListener(new v32(ckd2, bs3, ol3, 5));
                    long j = bs3.c;
                    Uri uri3 = bs3.z;
                    if (uri3 == null || (str2 = uri3.toString()) == null) {
                        str2 = Uri.EMPTY.toString();
                    }
                    ol3.Y(j, bs3.Y, str2);
                    ol3.setName(bs3.o);
                    ol3.setMessage(bs3.v);
                    ol3.setVerified(bs3.x);
                    return;
                } else if (ykd instanceof ss6) {
                    ss6 ss6 = (ss6) ykd;
                    bkd bkd3 = new bkd(this, 2);
                    ol3 ol32 = (ol3) ((ts6) pzc2).a;
                    ct.G(ol32, 300, new h24(10, (Object) bkd3, (Object) ss6));
                    boolean W = ol32.W(ss6.v.a.toString());
                    List list2 = ss6.b;
                    isb isb4 = ss6.v;
                    ol32.setName(W ? n54.S(isb4.a, list2, isb4.b) : isb4.a);
                    isb isb5 = ss6.w;
                    ol32.setMessage(ol32.V(isb5.a.toString()) ? n54.S(isb5.a, list2, isb5.b) : isb5.a);
                    Uri uri4 = ss6.z;
                    if (uri4 == null || (str = uri4.toString()) == null) {
                        str = Uri.EMPTY.toString();
                    }
                    ol32.Y(ss6.c, ss6.o, str);
                    ol32.setVerified(ss6.y);
                    return;
                } else if (ykd instanceof ge9) {
                    ge9 ge9 = (ge9) ykd;
                    bkd bkd4 = new bkd(this, 3);
                    i42 i423 = (i42) ((ie9) pzc2).a;
                    ct.G(i423, 300, new h24(21, (Object) bkd4, (Object) ge9));
                    if (ge9.w != null) {
                        i423.setTitle(ge9.z);
                        Uri uri5 = ge9.c;
                        if (uri5 == null) {
                            a32 a322 = ge9.w;
                            a322.m0();
                            i423.c(a322.v0, Long.valueOf(ge9.w.g()));
                        } else {
                            i423.setAvatar(uri5);
                        }
                    }
                    if (i423.a(ge9.y.a.toString())) {
                        isb isb6 = ge9.y;
                        charSequence = n54.S(isb6.a, ge9.b, isb6.b);
                    } else {
                        charSequence = ge9.y.a;
                    }
                    i423.setSubtitle(charSequence);
                    yva s = sjd.a.s();
                    long j2 = ge9.v.b;
                    a33 a33 = s.c;
                    i423.setTime(j4b.r(s.a, a33.u(), j2, a33.m(), true));
                    a32 a323 = ge9.w;
                    if ((a323 == null || !a323.Y()) && ((a32 = ge9.w) == null || (m = a32.m()) == null || !m.z())) {
                        z = false;
                    }
                    i423.setVerified(z);
                    return;
                } else {
                    return;
                }
        }
    }

    public void t(pzc pzc, int i, List list) {
        switch (this.v) {
            case 3:
                I((hrc) pzc, i, list);
                return;
            case 5:
                s(pzc, i);
                return;
            default:
                super.t(pzc, i, list);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [x63, pzc] */
    public final pzc u(ViewGroup viewGroup, int i) {
        scf scf;
        switch (this.v) {
            case 0:
                if (i == a83.b) {
                    View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(ujc.row_common_chat_empty, viewGroup, false);
                    ? pzc = new pzc(inflate);
                    if (inflate.isInEditMode()) {
                        scf = vi4.f0;
                    } else {
                        Context context = inflate.getContext();
                        Lazy lazy = scf.b0;
                        scf = j4b.k0(context);
                    }
                    pzc.L0(scf);
                    return pzc;
                } else if (i != c83.b) {
                    return new y63(viewGroup);
                } else {
                    zaf zaf = new zaf(viewGroup.getContext(), (AttributeSet) null);
                    zaf.setLayoutParams(new bzc(-1, MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density)));
                    return new pzc(zaf);
                }
            case 1:
                ys3 ys3 = (ys3) this.w;
                return i != 0 ? (i == 2 || i == 3) ? new tt3(viewGroup.getContext(), ys3) : new ft3(viewGroup.getContext(), ys3) : new at3(viewGroup.getContext(), ys3);
            case 2:
                return new xk6(LayoutInflater.from(viewGroup.getContext()).inflate(ujc.row_media_bar_extra_actions, viewGroup, false));
            case 3:
                return i == 1 ? new grc(viewGroup.getContext()) : new frc(viewGroup.getContext());
            case 4:
                return new pzc(new guc(viewGroup.getContext(), (gu2) this.w));
            default:
                if (i == hra.l) {
                    return new pzc(new i42(viewGroup.getContext()));
                }
                if (i == hra.o) {
                    return new pzc(new i42(viewGroup.getContext()));
                }
                if (i == hra.m) {
                    return new pzc(new ol3(viewGroup.getContext(), (AttributeSet) null));
                }
                if (i == hra.p) {
                    return new pzc(new ol3(viewGroup.getContext(), (AttributeSet) null));
                }
                if (i == hra.r) {
                    return new pzc(new i42(viewGroup.getContext()));
                }
                throw new IllegalArgumentException(wj6.h(i, "Unsupported view type: "));
        }
    }

    public void u1() {
        CommonChatsViewModel commonChatsViewModel = (CommonChatsViewModel) this.w;
        if (commonChatsViewModel != null) {
            z68.c("ru.ok.messages.chats.common.CommonChatsViewModel", "loadMore", new Object[0]);
            aje aje = commonChatsViewModel.t;
            if (aje != null) {
                aje.b((CancellationException) null);
            }
            commonChatsViewModel.t = ev0.v(b0h.C(commonChatsViewModel), (CoroutineContext) null, (f14) null, new y83(commonChatsViewModel, (Continuation) null), 3);
        }
    }

    public void v(RecyclerView recyclerView) {
        switch (this.v) {
            case 3:
                this.w = null;
                return;
            default:
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c73(ys3 ys3) {
        super((j4b) new w63(12));
        this.v = 1;
        this.w = ys3;
        C(true);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c73(defpackage.gu2 r4, java.util.concurrent.ExecutorService r5) {
        /*
            r3 = this;
            r0 = 4
            r3.v = r0
            w63 r0 = new w63
            r1 = 16
            r0.<init>(r1)
            if (r5 != 0) goto L_0x0023
            java.lang.Object r1 = defpackage.n79.c
            monitor-enter(r1)
            java.util.concurrent.ExecutorService r5 = defpackage.n79.d     // Catch:{ all -> 0x001b }
            if (r5 != 0) goto L_0x001d
            r5 = 2
            java.util.concurrent.ExecutorService r5 = java.util.concurrent.Executors.newFixedThreadPool(r5)     // Catch:{ all -> 0x001b }
            defpackage.n79.d = r5     // Catch:{ all -> 0x001b }
            goto L_0x001d
        L_0x001b:
            r3 = move-exception
            goto L_0x0021
        L_0x001d:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            java.util.concurrent.ExecutorService r5 = defpackage.n79.d
            goto L_0x0023
        L_0x0021:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r3
        L_0x0023:
            dm4 r1 = new dm4
            r2 = 3
            r1.<init>((int) r2, (java.lang.Object) r5, (java.lang.Object) r0)
            r3.<init>((defpackage.dm4) r1)
            r3.w = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c73.<init>(gu2, java.util.concurrent.ExecutorService):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c73(defpackage.dkd r4, java.util.concurrent.ExecutorService r5) {
        /*
            r3 = this;
            r0 = 5
            r3.v = r0
            w63 r0 = new w63
            r1 = 17
            r0.<init>(r1)
            if (r5 != 0) goto L_0x0023
            java.lang.Object r1 = defpackage.n79.c
            monitor-enter(r1)
            java.util.concurrent.ExecutorService r5 = defpackage.n79.d     // Catch:{ all -> 0x001b }
            if (r5 != 0) goto L_0x001d
            r5 = 2
            java.util.concurrent.ExecutorService r5 = java.util.concurrent.Executors.newFixedThreadPool(r5)     // Catch:{ all -> 0x001b }
            defpackage.n79.d = r5     // Catch:{ all -> 0x001b }
            goto L_0x001d
        L_0x001b:
            r3 = move-exception
            goto L_0x0021
        L_0x001d:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            java.util.concurrent.ExecutorService r5 = defpackage.n79.d
            goto L_0x0023
        L_0x0021:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r3
        L_0x0023:
            dm4 r1 = new dm4
            r2 = 3
            r1.<init>((int) r2, (java.lang.Object) r5, (java.lang.Object) r0)
            r3.<init>((defpackage.dm4) r1)
            r3.w = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c73.<init>(dkd, java.util.concurrent.ExecutorService):void");
    }
}

package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
import kotlin.uuid.Uuid;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.sdk.uikit.common.emptyview.OneMeEmptyView;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: t56  reason: default package */
public final class t56 extends pae {
    public final /* synthetic */ int v;
    public Object w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t56(Object obj, ExecutorService executorService, int i) {
        super(executorService);
        this.v = i;
        this.w = obj;
    }

    public void J(kbe kbe, int i) {
        switch (this.v) {
            case 0:
                kbe.M((lz7) E(i));
                return;
            case 2:
                qb qbVar = (qb) kbe;
                bb bbVar = (bb) ((lz7) E(i));
                l lVar = new l(5, this);
                qbVar.M(bbVar);
                ((ol3) qbVar.a).setOnClickListener(new pb(0, lVar, bbVar));
                return;
            case 3:
                N((dr) kbe, i);
                return;
            case 4:
                ((hi0) kbe).M((xh0) ((lz7) E(i)));
                return;
            case 5:
                if (kbe instanceof d91) {
                    d91 d91 = (d91) kbe;
                    lz7 lz7 = (lz7) E(i);
                    if (lz7 instanceof ob1) {
                        d91.M(lz7);
                        ct.G((r1e) d91.a, 300, new pb(3, (e4) this.w, (ob1) lz7));
                        return;
                    }
                    return;
                }
                kbe.M((lz7) E(i));
                return;
            case 6:
                O((c42) kbe, i);
                return;
            case 7:
                P((lp3) kbe, i);
                return;
            case 8:
                Q((qt3) kbe, i);
                return;
            case 9:
                i24 i24 = (i24) kbe;
                g24 g24 = (g24) ((lz7) E(i));
                rx2 rx2 = new rx2(9, this);
                i24.M(g24);
                ((LinearLayout) i24.a).setOnClickListener(new h24(0, (Object) rx2, (Object) g24));
                return;
            case 11:
                int i2 = ((rg5) ((lz7) E(i))).i();
                int i3 = hra.u;
                ov ovVar = (ov) this.o;
                ug5 ug5 = (ug5) this.w;
                if (i2 == i3) {
                    pg5 pg5 = (pg5) kbe;
                    rg5 rg5 = (rg5) ovVar.f.get(i);
                    f fVar = new f(18, (Object) ug5);
                    zw zwVar = new zw(18, (Object) ug5);
                    f fVar2 = new f(19, (Object) ug5);
                    pg5.M(rg5);
                    i42 i42 = (i42) pg5.a;
                    ct.G(i42, 300, new og5(rg5, fVar, fVar2, 0));
                    i42.setOnLongClickListener(new v32(zwVar, rg5, pg5, 6));
                    return;
                } else if (i2 == hra.v) {
                    tg5 tg5 = (tg5) kbe;
                    rg5 rg52 = (rg5) ovVar.f.get(i);
                    f fVar3 = new f(20, (Object) ug5);
                    zw zwVar2 = new zw(19, (Object) ug5);
                    f fVar4 = new f(21, (Object) ug5);
                    tg5.M(rg52);
                    ol3 ol3 = (ol3) tg5.a;
                    tg5.D0 = fVar3;
                    tg5.E0 = fVar4;
                    if (rg52.x) {
                        ct.G(ol3, 300, new sg5(tg5, rg52, 0));
                        ol3.X();
                    } else {
                        ct.G(ol3, 300, new sg5(tg5, rg52, 1));
                        CharSequence charSequence = rg52.w;
                        if (charSequence != null) {
                            ol3.Z(charSequence, new j35(5, (Object) fVar4, (Object) rg52));
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    ol3.setOnLongClickListener(new v32(zwVar2, rg52, tg5, 7));
                    return;
                } else {
                    return;
                }
            case 12:
                R((x36) kbe, i);
                return;
            case 13:
                S((rs6) kbe, i);
                return;
            case Protos.Attaches.Attach.LOCATION:
                T((w27) kbe, i);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                U((zj7) kbe, i);
                return;
            case 16:
                V((u29) kbe, i);
                return;
            case LangUtils.HASH_SEED:
                W((a39) kbe, i);
                return;
            case 18:
                lz7 lz72 = (lz7) ((ov) this.o).f.get(i);
                if (lz72.i() == 2 && (lz72 instanceof p8a)) {
                    p8a p8a = (p8a) lz72;
                    ((g7e) ((q8a) kbe).a).b.c();
                    return;
                } else if (lz72.i() == 1 && (lz72 instanceof q7a)) {
                    s7a s7a = (s7a) kbe;
                    q7a q7a = (q7a) lz72;
                    hq7 hq7 = new hq7(9, (Object) (g8a) this.w);
                    s7a.M(q7a);
                    ct.G((OneMeDraweeView) s7a.a, 300, new h24(23, (Object) hq7, (Object) q7a));
                    return;
                } else {
                    return;
                }
            case 19:
                X((y0c) kbe, i);
                return;
            case 20:
                X((y0c) kbe, i);
                return;
            case 21:
                X((y0c) kbe, i);
                return;
            case 22:
                Y((fuc) kbe, i);
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                if (kbe instanceof f0e) {
                    f0e f0e = (f0e) kbe;
                    lz7 lz73 = (lz7) E(i);
                    if (lz73 instanceof bp0) {
                        f0e.M(lz73);
                        ol3 ol32 = (ol3) f0e.a;
                        Integer valueOf = Integer.valueOf(sza.a);
                        zpa zpa = zpa.o;
                        bp0 bp0 = (bp0) lz73;
                        bpa bpa = (bpa) this.w;
                        ol3.b0(ol32, valueOf, zpa, new vra(20, bpa, bp0), 4);
                        ct.G(ol32, 300, new kqc(6, (Object) bpa, (Object) bp0));
                        return;
                    }
                    return;
                }
                kbe.M((lz7) E(i));
                return;
            case 25:
                i2a.n((lz7) E(i));
                new rh9(10, (Object) (wm4) this.w);
                ((u1e) kbe).P();
                throw null;
            default:
                super.s(kbe, i);
                return;
        }
    }

    public q7a L(int i) {
        lz7 lz7 = (lz7) E(i);
        if (lz7 instanceof q7a) {
            return (q7a) lz7;
        }
        return null;
    }

    public void N(dr drVar, int i) {
        ar arVar = (ar) ((ov) this.o).f.get(i);
        f fVar = new f(1, (Object) (jr) this.w);
        drVar.M(arVar);
        ct.G((br) drVar.a, 300, new cr(0, fVar, arVar));
    }

    public void O(c42 c42, int i) {
        y32 y32 = (y32) ((ov) this.o).f.get(i);
        f fVar = new f(7, (Object) (s32) this.w);
        View view = c42.a;
        b42 b42 = (b42) view;
        b42.setBackgroundPreview(y32.o);
        Boolean bool = y32.a;
        b42.setSelected(bool != null ? bool.booleanValue() : false);
        ct.G((b42) view, 300, new pb(10, fVar, y32));
    }

    public void P(lp3 lp3, int i) {
        zo3 zo3 = (zo3) ((lz7) E(i));
        rx2 rx2 = new rx2(4, this);
        qo3 qo3 = new qo3(0, zo3, this);
        wk wkVar = new wk(9, zo3, this);
        r6 r6Var = new r6(8, this);
        lp3.M(zo3);
        pb pbVar = new pb(18, wkVar, zo3);
        View view = lp3.a;
        ct.G(view, 300, pbVar);
        ol3 ol3 = (ol3) view;
        ol3.setOnLongClickListener(new yb1(2, qo3, zo3));
        if (!zo3.w0 || zo3.Y) {
            CharSequence charSequence = zo3.w;
            if (charSequence != null) {
                ol3.Z(charSequence, new s2(25, (Object) rx2, (Object) zo3));
            } else {
                ol3.X();
            }
        } else {
            ol3.setCallButtons(new wk(11, r6Var, zo3));
        }
        ol3 ol32 = (ol3) view;
        Boolean bool = zo3.v0;
        boolean z = false;
        ol32.setSelectionEnabled(bool != null);
        if (bool != null) {
            z = bool.booleanValue();
        }
        ol32.setContactSelected(z);
    }

    public void Q(qt3 qt3, int i) {
        pt3 pt3 = (pt3) ((lz7) E(i));
        s01 s01 = new s01(17, (Object) (nt3) this.w);
        qt3.M(pt3);
        qt3.Q(pt3.b, s01);
    }

    public void R(x36 x36, int i) {
        g0g g0g = (g0g) ((lz7) E(i));
        f0g f0g = g0g.b;
        f0g f0g2 = f0g.a;
        View view = x36.a;
        if (f0g == f0g2) {
            ((TextView) view).setOnClickListener((View.OnClickListener) null);
        } else {
            ct.G(view, 300, new v36((Function1) this.w, g0g, 0));
        }
        if (g0g.b == f0g2) {
            ((TextView) view).setEnabled(false);
        }
        ngf ngf = g0g.c;
        ngf.getClass();
        ((TextView) view).setText(ngf.b(view.getContext().getResources()));
    }

    public void S(rs6 rs6, int i) {
        qs6 qs6 = (qs6) ((lz7) E(i));
        ps6 ps6 = (ps6) this.w;
        f fVar = new f(26, (Object) ps6);
        zw zwVar = new zw(20, (Object) ps6);
        rs6.M(qs6);
        ol3 ol3 = (ol3) rs6.a;
        ct.G(ol3, 300, new h24(9, (Object) fVar, (Object) qs6));
        if (qs6.y) {
            ol3.setCallButtons(new wk(16, zwVar, qs6));
        } else {
            ol3.X();
        }
    }

    public void T(w27 w27, int i) {
        u27 u27 = (u27) ((ov) this.o).f.get(i);
        f fVar = new f(27, (Object) (std) this.w);
        View view = w27.a;
        v27 v27 = (v27) view;
        v27.E0.setText(u27.a);
        Boolean bool = u27.b;
        v27.setSelected(bool != null ? bool.booleanValue() : false);
        ct.G((v27) view, 300, new h24(11, (Object) fVar, (Object) u27));
    }

    public void U(zj7 zj7, int i) {
        xj7 xj7 = (xj7) ((lz7) E(i));
        f fVar = new f(28, (Object) (ak7) this.w);
        zj7.M(xj7);
        ct.G(zj7.a, 300, new h24(12, (Object) fVar, (Object) xj7));
    }

    public void V(u29 u29, int i) {
        t29 t29 = (t29) ((lz7) E(i));
        hq7 hq7 = new hq7(3, (Object) (v29) this.w);
        u29.M(t29);
        ct.G(u29.a, 300, new h24(18, (Object) hq7, (Object) t29));
    }

    public void W(a39 a39, int i) {
        z29 z29 = (z29) ((lz7) E(i));
        zw zwVar = (z29.y || z29.z) ? null : new zw(24, (Object) (v39) this.w);
        wk wkVar = new wk(20, z29, this);
        a39.M(z29);
        ol3 ol3 = (ol3) a39.a;
        ct.G(ol3, 300, new h24(19, (Object) wkVar, (Object) z29));
        if (zwVar != null) {
            ol3.setOnLongClickListener(new yb1(10, zwVar, z29));
        } else {
            ol3.setOnLongClickListener((View.OnLongClickListener) null);
            ol3.setLongClickable(false);
        }
        ol3.X();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: zv1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: xr7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v46, resolved type: up5} */
    /* JADX WARNING: type inference failed for: r1v3, types: [f7] */
    /* JADX WARNING: type inference failed for: r1v9, types: [ypd] */
    /* JADX WARNING: type inference failed for: r1v23 */
    /* JADX WARNING: type inference failed for: r1v24, types: [pzc] */
    /* JADX WARNING: type inference failed for: r1v27, types: [pzc] */
    /* JADX WARNING: type inference failed for: r1v33, types: [pzc] */
    /* JADX WARNING: type inference failed for: r1v36, types: [pzc] */
    /* JADX WARNING: type inference failed for: r1v39, types: [pzc] */
    /* JADX WARNING: type inference failed for: r1v52 */
    /* JADX WARNING: type inference failed for: r1v53 */
    /* JADX WARNING: type inference failed for: r1v54 */
    /* JADX WARNING: type inference failed for: r1v55 */
    /* JADX WARNING: type inference failed for: r1v56 */
    /* JADX WARNING: type inference failed for: r1v57 */
    /* JADX WARNING: type inference failed for: r1v58 */
    /* JADX WARNING: type inference failed for: r1v59 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void X(defpackage.y0c r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.v
            switch(r0) {
                case 19: goto L_0x01a3;
                case 20: goto L_0x011d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r7 = r5.E(r7)
            lz7 r7 = (defpackage.lz7) r7
            tzb r7 = (defpackage.tzb) r7
            r6.M(r7)
            boolean r0 = r7 instanceof defpackage.tp5
            r1 = 0
            if (r0 == 0) goto L_0x0031
            boolean r7 = r6 instanceof defpackage.up5
            if (r7 == 0) goto L_0x001c
            r1 = r6
            up5 r1 = (defpackage.up5) r1
        L_0x001c:
            if (r1 == 0) goto L_0x011c
            u0c r6 = new u0c
            r7 = 0
            r6.<init>(r5, r7)
            androidx.appcompat.widget.AppCompatEditText r5 = r1.D0
            ne1 r7 = new ne1
            r0 = 4
            r7.<init>(r0, r6, r1)
            r5.addTextChangedListener(r7)
            goto L_0x011c
        L_0x0031:
            boolean r0 = r7 instanceof defpackage.wr7
            if (r0 == 0) goto L_0x0051
            boolean r7 = r6 instanceof defpackage.xr7
            if (r7 == 0) goto L_0x003c
            r1 = r6
            xr7 r1 = (defpackage.xr7) r1
        L_0x003c:
            if (r1 == 0) goto L_0x011c
            u0c r6 = new u0c
            r7 = 1
            r6.<init>(r5, r7)
            androidx.appcompat.widget.AppCompatEditText r5 = r1.D0
            ne1 r7 = new ne1
            r0 = 7
            r7.<init>(r0, r6, r1)
            r5.addTextChangedListener(r7)
            goto L_0x011c
        L_0x0051:
            boolean r0 = r7 instanceof defpackage.jm4
            if (r0 == 0) goto L_0x007b
            boolean r7 = r6 instanceof defpackage.mm4
            if (r7 == 0) goto L_0x005c
            r1 = r6
            mm4 r1 = (defpackage.mm4) r1
        L_0x005c:
            if (r1 == 0) goto L_0x011c
            u0c r6 = new u0c
            r7 = 2
            r6.<init>(r5, r7)
            android.view.View r5 = r1.a
            lm4 r5 = (defpackage.lm4) r5
            v12 r7 = new v12
            r0 = 1
            r7.<init>((int) r0, (kotlin.jvm.functions.Function1) r6)
            android.widget.EditText r6 = r5.w
            ne1 r0 = new ne1
            r1 = 3
            r0.<init>(r1, r7, r5)
            r6.addTextChangedListener(r0)
            goto L_0x011c
        L_0x007b:
            boolean r0 = r7 instanceof defpackage.ae7
            if (r0 == 0) goto L_0x009c
            boolean r7 = r6 instanceof defpackage.be7
            if (r7 == 0) goto L_0x0086
            r1 = r6
            be7 r1 = (defpackage.be7) r1
        L_0x0086:
            if (r1 == 0) goto L_0x011c
            v0c r6 = new v0c
            r7 = 0
            r6.<init>(r5, r7)
            e7 r5 = new e7
            r7 = 11
            r5.<init>(r7, r6)
            android.view.View r6 = r1.a
            defpackage.ct.G(r6, 300, r5)
            goto L_0x011c
        L_0x009c:
            boolean r0 = r7 instanceof defpackage.vl4
            if (r0 == 0) goto L_0x00bc
            boolean r7 = r6 instanceof defpackage.ul4
            if (r7 == 0) goto L_0x00a7
            r1 = r6
            ul4 r1 = (defpackage.ul4) r1
        L_0x00a7:
            if (r1 == 0) goto L_0x011c
            v0c r6 = new v0c
            r7 = 1
            r6.<init>(r5, r7)
            e7 r5 = new e7
            r7 = 8
            r5.<init>(r7, r6)
            android.view.View r6 = r1.a
            defpackage.ct.G(r6, 300, r5)
            goto L_0x011c
        L_0x00bc:
            boolean r0 = r7 instanceof defpackage.yv1
            if (r0 == 0) goto L_0x00db
            boolean r7 = r6 instanceof defpackage.zv1
            if (r7 == 0) goto L_0x00c7
            r1 = r6
            zv1 r1 = (defpackage.zv1) r1
        L_0x00c7:
            if (r1 == 0) goto L_0x011c
            v0c r6 = new v0c
            r7 = 2
            r6.<init>(r5, r7)
            e7 r5 = new e7
            r7 = 2
            r5.<init>(r7, r6)
            one.me.sdk.uikit.common.button.OneMeButton r6 = r1.D0
            defpackage.ct.G(r6, 300, r5)
            goto L_0x011c
        L_0x00db:
            boolean r0 = r7 instanceof defpackage.p7
            if (r0 == 0) goto L_0x00fd
            boolean r0 = r6 instanceof defpackage.f7
            if (r0 == 0) goto L_0x00e6
            r1 = r6
            f7 r1 = (defpackage.f7) r1
        L_0x00e6:
            if (r1 == 0) goto L_0x011c
            vra r6 = new vra
            p7 r7 = (defpackage.p7) r7
            r0 = 11
            r6.<init>(r0, r5, r7)
            e7 r5 = new e7
            r7 = 0
            r5.<init>(r7, r6)
            android.view.View r6 = r1.a
            defpackage.ct.G(r6, 300, r5)
            goto L_0x011c
        L_0x00fd:
            boolean r7 = r7 instanceof defpackage.r98
            if (r7 == 0) goto L_0x011c
            boolean r7 = r6 instanceof defpackage.t98
            if (r7 == 0) goto L_0x0108
            r1 = r6
            t98 r1 = (defpackage.t98) r1
        L_0x0108:
            if (r1 == 0) goto L_0x011c
            v0c r6 = new v0c
            r7 = 3
            r6.<init>(r5, r7)
            e7 r5 = new e7
            r7 = 13
            r5.<init>(r7, r6)
            android.view.View r6 = r1.a
            defpackage.ct.G(r6, 300, r5)
        L_0x011c:
            return
        L_0x011d:
            java.lang.Object r7 = r5.E(r7)
            lz7 r7 = (defpackage.lz7) r7
            tzb r7 = (defpackage.tzb) r7
            r6.M(r7)
            boolean r0 = r7 instanceof defpackage.lo3
            r1 = 0
            if (r0 == 0) goto L_0x0143
            boolean r7 = r6 instanceof defpackage.xr3
            if (r7 == 0) goto L_0x0134
            r1 = r6
            xr3 r1 = (defpackage.xr3) r1
        L_0x0134:
            if (r1 == 0) goto L_0x01a2
            u99 r6 = new u99
            r7 = 19
            r6.<init>((int) r7, (java.lang.Object) r5)
            android.view.View r5 = r1.a
            defpackage.ct.G(r5, 300, r6)
            goto L_0x01a2
        L_0x0143:
            boolean r0 = r7 instanceof defpackage.p7
            if (r0 == 0) goto L_0x0183
            boolean r0 = r6 instanceof defpackage.f7
            if (r0 == 0) goto L_0x014e
            r1 = r6
            f7 r1 = (defpackage.f7) r1
        L_0x014e:
            if (r1 == 0) goto L_0x01a2
            zqa r6 = new zqa
            java.lang.Object r0 = r5.w
            zxb r0 = (defpackage.zxb) r0
            r2 = 9
            r6.<init>((int) r2, (java.lang.Object) r0)
            hq7 r2 = new hq7
            r3 = 13
            r2.<init>((int) r3, (java.lang.Object) r0)
            android.view.View r0 = r1.a
            r1 = r0
            r1e r1 = (defpackage.r1e) r1
            p7d r3 = new p7d
            r4 = 1
            r3.<init>((int) r4, (java.lang.Object) r6, (java.lang.Object) r2)
            r1.setOnSwitchCheckedListener((defpackage.n1e) r3)
            vra r6 = new vra
            p7 r7 = (defpackage.p7) r7
            r1 = 9
            r6.<init>(r1, r5, r7)
            e7 r5 = new e7
            r7 = 0
            r5.<init>(r7, r6)
            defpackage.ct.G(r0, 300, r5)
            goto L_0x01a2
        L_0x0183:
            boolean r7 = r7 instanceof defpackage.vl4
            if (r7 == 0) goto L_0x01a2
            boolean r7 = r6 instanceof defpackage.ul4
            if (r7 == 0) goto L_0x018e
            r1 = r6
            ul4 r1 = (defpackage.ul4) r1
        L_0x018e:
            if (r1 == 0) goto L_0x01a2
            ifb r6 = new ifb
            r7 = 7
            r6.<init>(r7, r5)
            e7 r5 = new e7
            r7 = 8
            r5.<init>(r7, r6)
            android.view.View r6 = r1.a
            defpackage.ct.G(r6, 300, r5)
        L_0x01a2:
            return
        L_0x01a3:
            java.lang.Object r7 = r5.E(r7)
            lz7 r7 = (defpackage.lz7) r7
            tzb r7 = (defpackage.tzb) r7
            r6.M(r7)
            boolean r0 = r7 instanceof defpackage.xpd
            r1 = 0
            if (r0 == 0) goto L_0x01cf
            boolean r7 = r6 instanceof defpackage.ypd
            if (r7 == 0) goto L_0x01ba
            r1 = r6
            ypd r1 = (defpackage.ypd) r1
        L_0x01ba:
            if (r1 == 0) goto L_0x0245
            twb r6 = new twb
            r7 = 0
            r6.<init>(r5, r7)
            kqc r5 = new kqc
            r7 = 4
            r5.<init>((int) r7, (java.lang.Object) r1, (java.lang.Object) r6)
            android.view.View r6 = r1.a
            defpackage.ct.G(r6, 300, r5)
            goto L_0x0245
        L_0x01cf:
            boolean r0 = r7 instanceof defpackage.u7e
            if (r0 == 0) goto L_0x0225
            boolean r7 = r6 instanceof defpackage.v7e
            if (r7 == 0) goto L_0x01da
            r1 = r6
            v7e r1 = (defpackage.v7e) r1
        L_0x01da:
            if (r1 == 0) goto L_0x0245
            twb r6 = new twb
            r7 = 1
            r6.<init>(r5, r7)
            androidx.appcompat.widget.AppCompatEditText r7 = r1.F0
            ne1 r0 = new ne1
            r2 = 10
            r0.<init>(r2, r1, r6)
            r7.addTextChangedListener(r0)
            uwb r6 = new uwb
            r7 = 0
            r6.<init>(r5, r7)
            android.widget.ImageView r7 = r1.J0
            e7 r0 = new e7
            r2 = 24
            r0.<init>(r2, r6)
            defpackage.ct.G(r7, 300, r0)
            uwb r6 = new uwb
            r7 = 1
            r6.<init>(r5, r7)
            e7 r7 = new e7
            r0 = 25
            r7.<init>(r0, r6)
            androidx.appcompat.widget.AppCompatTextView r6 = r1.G0
            defpackage.ct.G(r6, 300, r7)
            uwb r6 = new uwb
            r7 = 2
            r6.<init>(r5, r7)
            kqc r5 = new kqc
            r7 = 12
            r5.<init>((int) r7, (java.lang.Object) r1, (java.lang.Object) r6)
            one.me.sdk.uikit.common.button.OneMeButton r6 = r1.H0
            defpackage.ct.G(r6, 300, r5)
            goto L_0x0245
        L_0x0225:
            boolean r0 = r7 instanceof defpackage.p7
            if (r0 == 0) goto L_0x0245
            boolean r0 = r6 instanceof defpackage.f7
            if (r0 == 0) goto L_0x0230
            r1 = r6
            f7 r1 = (defpackage.f7) r1
        L_0x0230:
            if (r1 == 0) goto L_0x0245
            vra r6 = new vra
            p7 r7 = (defpackage.p7) r7
            r0 = 7
            r6.<init>(r0, r5, r7)
            e7 r5 = new e7
            r7 = 0
            r5.<init>(r7, r6)
            android.view.View r6 = r1.a
            defpackage.ct.G(r6, 300, r5)
        L_0x0245:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t56.X(y0c, int):void");
    }

    public void Y(fuc fuc, int i) {
        cuc cuc = (cuc) ((lz7) E(i));
        hq7 hq7 = new hq7(15, (Object) (gu2) this.w);
        fuc.M(cuc);
        ct.G(fuc.a, 300, new kqc((Function1) hq7, (Object) cuc, 2));
    }

    public int j() {
        switch (this.v) {
            case 6:
                return ((ov) this.o).f.size();
            default:
                return super.j();
        }
    }

    public int l(int i) {
        switch (this.v) {
            case 1:
                return ((lz7) E(i)).i();
            case 8:
                return ((pt3) ((lz7) E(i))).c;
            case 9:
                ((g24) ((lz7) E(i))).getClass();
                return f1b.n;
            case 10:
                return ((lz7) E(i)).i();
            case 11:
                return ((rg5) ((lz7) E(i))).i();
            case 12:
                return z66.$EnumSwitchMapping$0[((g0g) ((lz7) E(i))).b.ordinal()] == 1 ? gua.h : gua.p;
            case 13:
                return ((qs6) ((lz7) E(i))).z;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return ((xj7) ((lz7) E(i))).o;
            case LangUtils.HASH_SEED:
                ((z29) ((lz7) E(i))).getClass();
                return 1;
            case 18:
                return ((lz7) ((ov) this.o).f.get(i)).i();
            case 19:
                return ((tzb) ((lz7) E(i))).i();
            case 20:
                return ((tzb) ((lz7) E(i))).i();
            case 21:
                return ((tzb) ((lz7) E(i))).i();
            case 23:
                ((yuc) ((lz7) E(i))).getClass();
                return yuc.b;
            case 26:
                return ((lz7) E(i)).i();
            default:
                return super.l(i);
        }
    }

    public void s(pzc pzc, int i) {
        switch (this.v) {
            case 0:
                J((kbe) pzc, i);
                return;
            case 2:
                qb qbVar = (qb) pzc;
                bb bbVar = (bb) ((lz7) E(i));
                l lVar = new l(5, this);
                qbVar.M(bbVar);
                ((ol3) qbVar.a).setOnClickListener(new pb(0, lVar, bbVar));
                return;
            case 3:
                N((dr) pzc, i);
                return;
            case 4:
                ((hi0) pzc).M((xh0) ((lz7) E(i)));
                return;
            case 5:
                J((kbe) pzc, i);
                return;
            case 6:
                O((c42) pzc, i);
                return;
            case 7:
                P((lp3) pzc, i);
                return;
            case 8:
                Q((qt3) pzc, i);
                return;
            case 9:
                i24 i24 = (i24) pzc;
                g24 g24 = (g24) ((lz7) E(i));
                rx2 rx2 = new rx2(9, this);
                i24.M(g24);
                ((LinearLayout) i24.a).setOnClickListener(new h24(0, (Object) rx2, (Object) g24));
                return;
            case 11:
                J((kbe) pzc, i);
                return;
            case 12:
                R((x36) pzc, i);
                return;
            case 13:
                S((rs6) pzc, i);
                return;
            case Protos.Attaches.Attach.LOCATION:
                T((w27) pzc, i);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                U((zj7) pzc, i);
                return;
            case 16:
                V((u29) pzc, i);
                return;
            case LangUtils.HASH_SEED:
                W((a39) pzc, i);
                return;
            case 18:
                J((kbe) pzc, i);
                return;
            case 19:
                X((y0c) pzc, i);
                return;
            case 20:
                X((y0c) pzc, i);
                return;
            case 21:
                X((y0c) pzc, i);
                return;
            case 22:
                Y((fuc) pzc, i);
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                J((kbe) pzc, i);
                return;
            case 25:
                i2a.n((lz7) E(i));
                new rh9(10, (Object) (wm4) this.w);
                ((u1e) pzc).P();
                throw null;
            default:
                super.s(pzc, i);
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: xr7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: up5} */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v23 */
    /* JADX WARNING: type inference failed for: r1v24 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void t(defpackage.pzc r4, int r5, java.util.List r6) {
        /*
            r3 = this;
            int r0 = r3.v
            switch(r0) {
                case 3: goto L_0x021d;
                case 6: goto L_0x01f9;
                case 7: goto L_0x01ce;
                case 8: goto L_0x01ab;
                case 11: goto L_0x015e;
                case 14: goto L_0x013a;
                case 19: goto L_0x0102;
                case 21: goto L_0x00b6;
                case 22: goto L_0x0046;
                case 26: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.t(r4, r5, r6)
            return
        L_0x0009:
            kbe r4 = (defpackage.kbe) r4
            r0 = r6
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x001c
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x001c
            goto L_0x0042
        L_0x001c:
            java.util.Iterator r0 = r0.iterator()
        L_0x0020:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0042
            java.lang.Object r1 = r0.next()
            boolean r1 = r1 instanceof defpackage.fpe
            if (r1 == 0) goto L_0x0020
            java.lang.Object r3 = r3.o
            ov r3 = (defpackage.ov) r3
            java.util.List r3 = r3.f
            java.lang.Object r3 = r3.get(r5)
            lz7 r3 = (defpackage.lz7) r3
            java.lang.Object r5 = kotlin.collections.CollectionsKt.first(r6)
            r4.N(r3, r5)
            goto L_0x0045
        L_0x0042:
            r3.s(r4, r5)
        L_0x0045:
            return
        L_0x0046:
            fuc r4 = (defpackage.fuc) r4
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00b2
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r3 = r6.iterator()
        L_0x0059:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00b5
            java.lang.Object r5 = r3.next()
            boolean r6 = r5 instanceof defpackage.ytc
            android.view.View r0 = r4.a
            if (r6 == 0) goto L_0x0073
            ytc r5 = (defpackage.ytc) r5
            java.lang.String r5 = r5.e
            euc r0 = (defpackage.euc) r0
            r0.setAvatar(r5)
            goto L_0x0059
        L_0x0073:
            boolean r6 = r5 instanceof defpackage.xtc
            if (r6 == 0) goto L_0x0088
            xtc r5 = (defpackage.xtc) r5
            java.lang.CharSequence r5 = r5.e
            euc r0 = (defpackage.euc) r0
            gd0 r6 = new gd0
            long r1 = r4.v
            r6.<init>(r5, r1)
            r0.setAbbreviation(r6)
            goto L_0x0059
        L_0x0088:
            boolean r6 = r5 instanceof defpackage.ztc
            if (r6 == 0) goto L_0x0096
            ztc r5 = (defpackage.ztc) r5
            java.lang.CharSequence r5 = r5.e
            euc r0 = (defpackage.euc) r0
            r0.setName(r5)
            goto L_0x0059
        L_0x0096:
            boolean r6 = r5 instanceof defpackage.buc
            if (r6 == 0) goto L_0x00a4
            buc r5 = (defpackage.buc) r5
            boolean r5 = r5.e
            euc r0 = (defpackage.euc) r0
            r0.setVerified(r5)
            goto L_0x0059
        L_0x00a4:
            boolean r6 = r5 instanceof defpackage.auc
            if (r6 == 0) goto L_0x0059
            auc r5 = (defpackage.auc) r5
            boolean r5 = r5.e
            euc r0 = (defpackage.euc) r0
            r0.setOnline(r5)
            goto L_0x0059
        L_0x00b2:
            r3.Y(r4, r5)
        L_0x00b5:
            return
        L_0x00b6:
            y0c r4 = (defpackage.y0c) r4
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x00c1
            r3.X(r4, r5)
        L_0x00c1:
            java.util.Iterator r3 = r6.iterator()
        L_0x00c5:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0101
            java.lang.Object r5 = r3.next()
            boolean r6 = r5 instanceof defpackage.l0c
            if (r6 == 0) goto L_0x00c5
            r6 = r5
            l0c r6 = (defpackage.l0c) r6
            boolean r0 = r6 instanceof defpackage.i0c
            r1 = 0
            if (r0 == 0) goto L_0x00ec
            boolean r6 = r4 instanceof defpackage.up5
            if (r6 == 0) goto L_0x00e2
            r1 = r4
            up5 r1 = (defpackage.up5) r1
        L_0x00e2:
            if (r1 == 0) goto L_0x00c5
            i0c r5 = (defpackage.i0c) r5
            c63 r5 = r5.a
            r1.P(r5)
            goto L_0x00c5
        L_0x00ec:
            boolean r6 = r6 instanceof defpackage.j0c
            if (r6 == 0) goto L_0x00c5
            boolean r6 = r4 instanceof defpackage.xr7
            if (r6 == 0) goto L_0x00f7
            r1 = r4
            xr7 r1 = (defpackage.xr7) r1
        L_0x00f7:
            if (r1 == 0) goto L_0x00c5
            j0c r5 = (defpackage.j0c) r5
            c63 r5 = r5.a
            r1.P(r5)
            goto L_0x00c5
        L_0x0101:
            return
        L_0x0102:
            y0c r4 = (defpackage.y0c) r4
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x010d
            r3.X(r4, r5)
        L_0x010d:
            java.util.Iterator r3 = r6.iterator()
        L_0x0111:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0139
            java.lang.Object r5 = r3.next()
            boolean r6 = r5 instanceof defpackage.l0c
            if (r6 == 0) goto L_0x0111
            r6 = r5
            l0c r6 = (defpackage.l0c) r6
            boolean r6 = r6 instanceof defpackage.k0c
            if (r6 == 0) goto L_0x0111
            boolean r6 = r4 instanceof defpackage.v7e
            if (r6 == 0) goto L_0x012e
            r6 = r4
            v7e r6 = (defpackage.v7e) r6
            goto L_0x012f
        L_0x012e:
            r6 = 0
        L_0x012f:
            if (r6 == 0) goto L_0x0111
            k0c r5 = (defpackage.k0c) r5
            o54 r5 = r5.a
            r6.P(r5)
            goto L_0x0111
        L_0x0139:
            return
        L_0x013a:
            w27 r4 = (defpackage.w27) r4
            java.lang.Object r6 = kotlin.collections.CollectionsKt.lastOrNull(r6)
            if (r6 == 0) goto L_0x015a
            boolean r3 = r6 instanceof defpackage.t27
            if (r3 == 0) goto L_0x015d
            t27 r6 = (defpackage.t27) r6
            android.view.View r3 = r4.a
            v27 r3 = (defpackage.v27) r3
            java.lang.Boolean r4 = r6.a
            if (r4 == 0) goto L_0x0155
            boolean r4 = r4.booleanValue()
            goto L_0x0156
        L_0x0155:
            r4 = 0
        L_0x0156:
            r3.setSelected(r4)
            goto L_0x015d
        L_0x015a:
            r3.T(r4, r5)
        L_0x015d:
            return
        L_0x015e:
            kbe r4 = (defpackage.kbe) r4
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01a7
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            qg5 r0 = new qg5
            r1 = 7
            r0.<init>((int) r1)
            java.util.Iterator r6 = r6.iterator()
        L_0x0177:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0197
            java.lang.Object r1 = r6.next()
            boolean r2 = r1 instanceof defpackage.qg5
            if (r2 == 0) goto L_0x0188
            qg5 r1 = (defpackage.qg5) r1
            goto L_0x0189
        L_0x0188:
            r1 = 0
        L_0x0189:
            if (r1 == 0) goto L_0x0177
            java.lang.Object r2 = r0.a
            java.util.BitSet r2 = (java.util.BitSet) r2
            java.lang.Object r1 = r1.a
            java.util.BitSet r1 = (java.util.BitSet) r1
            r2.or(r1)
            goto L_0x0177
        L_0x0197:
            java.lang.Object r3 = r3.o
            ov r3 = (defpackage.ov) r3
            java.util.List r3 = r3.f
            java.lang.Object r3 = r3.get(r5)
            lz7 r3 = (defpackage.lz7) r3
            r4.N(r3, r0)
            goto L_0x01aa
        L_0x01a7:
            r3.J(r4, r5)
        L_0x01aa:
            return
        L_0x01ab:
            qt3 r4 = (defpackage.qt3) r4
            java.lang.Object r6 = kotlin.collections.CollectionsKt.firstOrNull(r6)
            if (r6 == 0) goto L_0x01ca
            boolean r5 = r6 instanceof defpackage.ot3
            if (r5 == 0) goto L_0x01cd
            ot3 r6 = (defpackage.ot3) r6
            s01 r5 = new s01
            java.lang.Object r3 = r3.w
            nt3 r3 = (defpackage.nt3) r3
            r0 = 18
            r5.<init>((int) r0, (java.lang.Object) r3)
            java.lang.Integer r3 = r6.a
            r4.Q(r3, r5)
            goto L_0x01cd
        L_0x01ca:
            r3.Q(r4, r5)
        L_0x01cd:
            return
        L_0x01ce:
            lp3 r4 = (defpackage.lp3) r4
            java.lang.Object r6 = kotlin.collections.CollectionsKt.lastOrNull(r6)
            if (r6 == 0) goto L_0x01f5
            boolean r3 = r6 instanceof defpackage.yo3
            if (r3 == 0) goto L_0x01f8
            yo3 r6 = (defpackage.yo3) r6
            android.view.View r3 = r4.a
            ol3 r3 = (defpackage.ol3) r3
            java.lang.Boolean r4 = r6.a
            r5 = 0
            if (r4 == 0) goto L_0x01e7
            r6 = 1
            goto L_0x01e8
        L_0x01e7:
            r6 = r5
        L_0x01e8:
            r3.setSelectionEnabled(r6)
            if (r4 == 0) goto L_0x01f1
            boolean r5 = r4.booleanValue()
        L_0x01f1:
            r3.setContactSelected(r5)
            goto L_0x01f8
        L_0x01f5:
            r3.P(r4, r5)
        L_0x01f8:
            return
        L_0x01f9:
            c42 r4 = (defpackage.c42) r4
            java.lang.Object r6 = kotlin.collections.CollectionsKt.lastOrNull(r6)
            if (r6 == 0) goto L_0x0219
            boolean r3 = r6 instanceof defpackage.x32
            if (r3 == 0) goto L_0x021c
            x32 r6 = (defpackage.x32) r6
            android.view.View r3 = r4.a
            b42 r3 = (defpackage.b42) r3
            java.lang.Boolean r4 = r6.a
            if (r4 == 0) goto L_0x0214
            boolean r4 = r4.booleanValue()
            goto L_0x0215
        L_0x0214:
            r4 = 0
        L_0x0215:
            r3.setSelected(r4)
            goto L_0x021c
        L_0x0219:
            r3.O(r4, r5)
        L_0x021c:
            return
        L_0x021d:
            dr r4 = (defpackage.dr) r4
            java.lang.Object r6 = kotlin.collections.CollectionsKt.lastOrNull(r6)
            if (r6 == 0) goto L_0x023d
            boolean r3 = r6 instanceof defpackage.zq
            if (r3 == 0) goto L_0x0240
            zq r6 = (defpackage.zq) r6
            android.view.View r3 = r4.a
            br r3 = (defpackage.br) r3
            java.lang.Boolean r4 = r6.a
            if (r4 == 0) goto L_0x0238
            boolean r4 = r4.booleanValue()
            goto L_0x0239
        L_0x0238:
            r4 = 0
        L_0x0239:
            r3.setSelected(r4)
            goto L_0x0240
        L_0x023d:
            r3.N(r4, r5)
        L_0x0240:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t56.t(pzc, int, java.util.List):void");
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        en0 en0;
        int i2 = i;
        js9 js9 = fu4.k;
        switch (this.v) {
            case 0:
                ViewGroup viewGroup2 = viewGroup;
                int i3 = viewGroup.getContext().getResources().getDisplayMetrics().widthPixels;
                if (i2 == ngc.oneme_folder_widget_view_type) {
                    en0 = new en0(viewGroup.getContext(), (Function1) new s56(this, 0));
                    View view = en0.a;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        float f = (float) Uuid.SIZE_BITS;
                        layoutParams.width = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
                        layoutParams.height = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
                        view.setLayoutParams(layoutParams);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                } else if (i2 == ngc.oneme_big_folder_widget_view_type) {
                    en0 = new en0(viewGroup.getContext(), new s56(this, 1));
                    int f2 = a81.f((float) 12, vo4.c().getDisplayMetrics().density, 2, i3);
                    View view2 = en0.a;
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.width = f2;
                        layoutParams2.height = MathKt.roundToInt(((float) Uuid.SIZE_BITS) * vo4.c().getDisplayMetrics().density);
                        view2.setLayoutParams(layoutParams2);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                } else if (i2 == ngc.oneme_half_folder_widget_view_type) {
                    en0 = new en0(viewGroup.getContext(), (Function1) new s56(this, 2));
                    int f3 = (a81.f((float) 12, vo4.c().getDisplayMetrics().density, 2, i3) - MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density)) / 2;
                    View view3 = en0.a;
                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                    if (layoutParams3 != null) {
                        layoutParams3.width = f3;
                        layoutParams3.height = MathKt.roundToInt(((float) Uuid.SIZE_BITS) * vo4.c().getDisplayMetrics().density);
                        view3.setLayoutParams(layoutParams3);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                } else {
                    String name = t56.class.getName();
                    throw new IllegalStateException(("Not supported viewType " + i2 + " for " + name).toString());
                }
                return en0;
            case 1:
                ViewGroup viewGroup3 = viewGroup;
                if (i2 == ena.a) {
                    return new td1(new tqa(viewGroup.getContext()), new f(0, (Object) (n) this.w));
                }
                throw new IllegalArgumentException("Not supported viewType for AboutAppAdapter");
            case 2:
                ViewGroup viewGroup4 = viewGroup;
                return new pzc(new ol3(viewGroup.getContext(), (AttributeSet) null));
            case 3:
                ViewGroup viewGroup5 = viewGroup;
                return new pzc(new br(viewGroup.getContext(), (AttributeSet) null));
            case 4:
                ViewGroup viewGroup6 = viewGroup;
                return new hi0(viewGroup.getContext(), (ys3) this.w);
            case 5:
                ViewGroup viewGroup7 = viewGroup;
                return new pzc(new r1e(viewGroup.getContext(), (AttributeSet) null));
            case 6:
                ViewGroup viewGroup8 = viewGroup;
                return new pzc(new b42(viewGroup.getContext()));
            case 7:
                ViewGroup viewGroup9 = viewGroup;
                return new pzc(new ol3(viewGroup.getContext(), (AttributeSet) null));
            case 8:
                ViewGroup viewGroup10 = viewGroup;
                OneMeEmptyView oneMeEmptyView = new OneMeEmptyView(viewGroup.getContext(), (AttributeSet) null);
                pzc pzc = new pzc(oneMeEmptyView);
                oneMeEmptyView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return pzc;
            case 9:
                return new i24(viewGroup);
            case 10:
                return i2 == zua.q ? new tx1(viewGroup.getContext(), new qr3(19)) : new g15(viewGroup.getContext(), (rt6) this.w);
            case 11:
                if (i2 == hra.u) {
                    return new pzc(new i42(viewGroup.getContext()));
                }
                if (i2 == hra.v) {
                    return new pzc(new ol3(viewGroup.getContext(), (AttributeSet) null));
                }
                throw new IllegalArgumentException(a81.j(i2, "Unknown viewType '", "'"));
            case 12:
                f0g f0g = i2 == gua.h ? f0g.a : f0g.b;
                Context context = viewGroup.getContext();
                TextView textView = new TextView(context);
                textView.setLayoutParams(new bzc(-1, -2));
                puf.i.b(textView, uy4.b);
                b0h.H(textView, new w36(3, (Continuation) null, 0));
                int roundToInt = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
                if (f0g == f0g.a) {
                    textView.setAlpha(0.35f);
                    textView.setEnabled(false);
                    EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context, zec.ic_check_filled_24);
                    js9.e(context).f().getIcon().getClass();
                    hi7.Y(enhancedVectorDrawable, "circle_background", -16745729);
                    textView.setCompoundDrawablePadding(roundToInt);
                    ArrayList arrayList = wgf.a;
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds(enhancedVectorDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
                }
                textView.setGravity(16);
                int roundToInt2 = MathKt.roundToInt(((float) 18) * vo4.c().getDisplayMetrics().density);
                textView.setPadding(roundToInt, roundToInt2, roundToInt, roundToInt2);
                return new pzc(textView);
            case 13:
                return new pzc(new ol3(viewGroup.getContext(), (AttributeSet) null));
            case Protos.Attaches.Attach.LOCATION:
                return new pzc(new v27(viewGroup.getContext()));
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return new pzc(new yj7(viewGroup.getContext()));
            case 16:
                return new pzc(new r1e(viewGroup.getContext(), (AttributeSet) null));
            case LangUtils.HASH_SEED:
                return new pzc(new ol3(viewGroup.getContext(), (AttributeSet) null));
            case 18:
                if (i2 == 1) {
                    n7a n7a = new n7a(viewGroup.getContext());
                    float f4 = (float) 64;
                    n7a.setLayoutParams(new ViewGroup.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4), MathKt.roundToInt(f4 * vo4.c().getDisplayMetrics().density)));
                    return new pzc(n7a);
                } else if (i2 == 2) {
                    g7e g7e = new g7e(viewGroup.getContext());
                    int roundToInt3 = MathKt.roundToInt(((float) 64) * vo4.c().getDisplayMetrics().density);
                    g7e.setLayoutParams(new ViewGroup.LayoutParams(roundToInt3, roundToInt3));
                    g7e.setOutlineProvider(new n04((float) roundToInt3));
                    g7e.setBackgroundColor(js9.e(viewGroup.getContext()).f().c().i);
                    b0h.H(g7e, new b03(roundToInt3, (Continuation) null));
                    return new pzc(g7e);
                } else {
                    throw new IllegalStateException(("Such viewType " + i2 + " is not supported in NeuroAvatarsAdapter").toString());
                }
            case 19:
                int i4 = i2 & 536870911;
                if (tf6.D(i4, ConstantsKt.DEFAULT_BUFFER_SIZE)) {
                    return new ypd(viewGroup.getContext());
                }
                if (tf6.D(i4, 8)) {
                    return new mnb(viewGroup.getContext(), 2);
                }
                if (tf6.D(i4, 16)) {
                    return new v7e(viewGroup.getContext());
                }
                if (tf6.D(i4, 2048)) {
                    return new mnb(viewGroup.getContext(), 1);
                }
                if (tf6.D(i4, 65536)) {
                    TextView textView2 = new TextView(viewGroup.getContext());
                    mnb mnb = new mnb(textView2);
                    textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    textView2.setGravity(17);
                    float f5 = (float) 12;
                    float f6 = (float) 28;
                    textView2.setPaddingRelative(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f5), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f6), MathKt.roundToInt(f5 * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f6 * vo4.c().getDisplayMetrics().density));
                    puf.m.b(textView2, uy4.b);
                    return mnb;
                } else if (tf6.D(i4, 1024)) {
                    return new f7(viewGroup.getContext());
                } else {
                    throw new IllegalStateException(("unknown item viewType: " + i2).toString());
                }
            case 20:
                int i5 = i2 & 536870911;
                if (tf6.D(i5, 1024)) {
                    return new f7(viewGroup.getContext());
                }
                if (tf6.D(i5, 2048) || tf6.D(i5, ConstantsKt.DEFAULT_BLOCK_SIZE)) {
                    return new mnb(viewGroup.getContext(), 1);
                }
                if (tf6.D(i5, 32768)) {
                    ol3 ol3 = new ol3(viewGroup.getContext(), (AttributeSet) null);
                    pzc pzc2 = new pzc(ol3);
                    b0h.H(ol3, new f93(3, (Continuation) null, 1));
                    return pzc2;
                } else if (tf6.D(i5, Uuid.SIZE_BITS)) {
                    return new ul4(viewGroup.getContext());
                } else {
                    throw new IllegalStateException(("unknown item viewType: " + i2).toString());
                }
            case 21:
                int i6 = i2 & 536870911;
                if (tf6.D(i6, 1)) {
                    return new up5(viewGroup.getContext());
                }
                if (tf6.D(i6, 2)) {
                    return new xr7(viewGroup.getContext());
                }
                if (tf6.D(i6, 4)) {
                    lm4 lm4 = new lm4(viewGroup.getContext());
                    pzc pzc3 = new pzc(lm4);
                    lm4.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    return pzc3;
                } else if (tf6.D(i6, 64)) {
                    return new be7(viewGroup.getContext());
                } else {
                    if (tf6.D(i6, Uuid.SIZE_BITS)) {
                        return new ul4(viewGroup.getContext());
                    }
                    if (tf6.D(i6, 256)) {
                        return new zv1(viewGroup.getContext());
                    }
                    if (tf6.D(i6, ConstantsKt.MINIMUM_BLOCK_SIZE)) {
                        OneMeButton oneMeButton = new OneMeButton(viewGroup.getContext(), (AttributeSet) null);
                        pzc pzc4 = new pzc(oneMeButton);
                        oneMeButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        oneMeButton.setGravity(17);
                        oneMeButton.setSize(aqa.c);
                        oneMeButton.setMode(zpa.b);
                        oneMeButton.setAppearance(xpa.c);
                        oneMeButton.setText(ixa.u0);
                        return pzc4;
                    } else if (tf6.D(i6, 1024)) {
                        return new f7(viewGroup.getContext());
                    } else {
                        if (tf6.D(i6, 2048)) {
                            return new mnb(viewGroup.getContext(), 1);
                        }
                        throw new IllegalStateException(("unknown item viewType: " + i2).toString());
                    }
                }
            case 22:
                return new pzc(new euc(viewGroup.getContext()));
            case 23:
                return new b61(new zuc(new rh9(9, (Object) (qu2) this.w), viewGroup.getContext()), 8);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return new pzc(new ol3(viewGroup.getContext(), (AttributeSet) null));
            case 25:
                return new pzc(new OneMeButton(viewGroup.getContext(), (AttributeSet) null));
            default:
                return bpa.t((bpa) this.w, viewGroup.getContext(), i2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t56(Executor executor) {
        super(executor);
        this.v = 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t56(ExecutorService executorService, Object obj, int i) {
        super(executorService);
        this.v = i;
        this.w = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t56(ExecutorService executorService, uoe uoe) {
        super(executorService);
        this.v = 26;
        this.w = new bpa(8, uoe);
    }
}

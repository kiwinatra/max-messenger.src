package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;
import one.me.sdk.uikit.common.emptyview.OneMeEmptyView;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.messages.scheduled.DateTimePicker;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

/* renamed from: ba  reason: default package */
public final /* synthetic */ class ba implements r8f, qk3, ybg, zi6, s21, m8d, vu, eo1, fc3, nsb, yde, i08, k08 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ba(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public void a(int i) {
        DateTimePicker dateTimePicker = (DateTimePicker) this.b;
        if (!dateTimePicker.L0) {
            n84 n84 = (n84) ((q84) this.c).E(i);
            k84 k84 = dateTimePicker.K0;
            if (k84 != null) {
                ScheduledSendPickerViewModel scheduledSendPickerViewModel = (ScheduledSendPickerViewModel) k84;
                z68.c("ScheduledSendPickerViewModel", "day = " + n84, new Object[0]);
                xme xme = scheduledSendPickerViewModel.f;
                c84 c84 = (c84) xme.getValue();
                if (c84 != null && !Intrinsics.areEqual((Object) c84.a, (Object) n84)) {
                    xme.m((Object) null, c84.a(c84, n84, (ejf) null, (ejf) null, 6));
                    scheduledSendPickerViewModel.k();
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Object, j8] */
    public void accept(Object obj) {
        ArrayList arrayList;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (this.a) {
            case 1:
                z68.c("m00", "Attach downloaded", new Object[0]);
                m00 m00 = (m00) obj3;
                m00.b.r((k00) obj2, (File) obj);
                m00.a.U0(false);
                return;
            case 16:
                w62 w62 = (w62) obj;
                ((r62) obj3).getClass();
                w62.c = (k72) obj2;
                r62.u(w62);
                w62.x = 0;
                w62.m = 0;
                return;
            case LangUtils.HASH_SEED /*17*/:
                w62 w622 = (w62) obj;
                r62 r62 = (r62) obj3;
                r62.getClass();
                Map e = w622.e();
                ltb ltb = (ltb) r62.n;
                e.remove(Long.valueOf(ltb.a.s()));
                if (((a32) obj2).c0()) {
                    for (Long remove : Collections.singletonList(Long.valueOf(ltb.a.s()))) {
                        w622.R.remove(remove);
                    }
                }
                r62.u(w622);
                w622.x = 0;
                return;
            case 18:
                w62 w623 = (w62) obj;
                ((r62) obj3).getClass();
                qu quVar = (qu) obj2;
                if (!quVar.o.isEmpty()) {
                    List<lmd> list = quVar.o;
                    ArrayList arrayList2 = new ArrayList();
                    for (lmd lmd : list) {
                        ? obj4 = new Object();
                        if (!cvg.A(lmd.b)) {
                            obj4.c = lmd.b;
                        }
                        String str = lmd.c;
                        if (!cvg.A(str)) {
                            obj4.d = str;
                        }
                        if (((List) obj4.e) == null) {
                            obj4.e = new ArrayList();
                        }
                        ((List) obj4.e).addAll(lmd.d);
                        obj4.a = lmd.g;
                        obj4.b = lmd.i;
                        arrayList2.add(new j72(obj4));
                    }
                    if (w623.y == null) {
                        w623.y = new ArrayList();
                    }
                    if (w623.y != null) {
                        if (w623.y == null) {
                            w623.y = new ArrayList();
                        }
                        arrayList = new ArrayList(w623.y);
                    } else {
                        arrayList = new ArrayList();
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        j72 j72 = (j72) it.next();
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            if (((j72) arrayList.get(size)).a.equals(j72.a)) {
                                arrayList.remove(size);
                            }
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        j72 j722 = (j72) it2.next();
                        if (!j722.c.isEmpty()) {
                            arrayList.add(j722);
                        }
                    }
                    List list2 = w623.y;
                    if (list2 != null) {
                        list2.clear();
                    }
                    if (w623.y == null) {
                        w623.y = new ArrayList();
                    }
                    w623.y.addAll(arrayList);
                }
                if (!quVar.x.isEmpty()) {
                    List list3 = w623.z;
                    if (list3 != null) {
                        list3.clear();
                    }
                    List list4 = quVar.x;
                    if (w623.z == null) {
                        w623.z = new ArrayList();
                    }
                    w623.z.addAll(list4);
                    return;
                }
                return;
            case 22:
                a89 a89 = (a89) obj;
                ek3 ek3 = (ek3) obj3;
                ek3.getClass();
                long F = (long) ek3.F(a89.a.b);
                List list5 = (List) obj2;
                if (F != -1) {
                    nf9 nf9 = new nf9();
                    KProperty[] kPropertyArr = nf9.c;
                    nf9.a.setValue(nf9, kPropertyArr[0], a89);
                    nf9.b.setValue(nf9, kPropertyArr[1], Boolean.valueOf(((of9) ek3.v.get((int) F)).b));
                    list5.add(nf9.a());
                    return;
                }
                list5.add(new of9(a89, false));
                return;
            case 23:
                nm3 nm3 = (nm3) obj;
                nm3.k = (tm3) obj3;
                nm3.i = (sm3) obj2;
                return;
            default:
                Throwable th = (Throwable) obj;
                ir3 ir3 = (ir3) obj3;
                ir3.getClass();
                if (th instanceof TamErrorException) {
                    ir3.b.a(((TamErrorException) th).a, (long[]) obj2, 0);
                    return;
                }
                return;
        }
    }

    public Object apply(Object obj) {
        kq0 kq0 = (kq0) obj;
        rt6 rt6 = (rt6) this.b;
        rt6.getClass();
        fo3 fo3 = (fo3) ((Map) this.c).get(Long.valueOf(kq0.a));
        if (fo3 == null) {
            z68.c("rt6", "prepareBotCommandItems, contactInfo is null, botId: %d", Long.valueOf(kq0.a));
            return new sq0((String) null, kq0.a, rt6.n(kq0, (fo3) null), kq0.c);
        }
        return new sq0(hhf.c(fo3.Z), kq0.a, rt6.n(kq0, fo3), kq0.c);
    }

    public void b() {
        y01 y01;
        sl1 sl1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 6:
                v01 v01 = (v01) obj2;
                if (v01.N0 != null && (y01 = v01.K0) != null) {
                    ((grg) y01).C((p8d) obj);
                    return;
                }
                return;
            default:
                tl1 tl1 = (tl1) obj2;
                if (Intrinsics.areEqual((Object) tl1.F0, (Object) Boolean.TRUE) && (sl1 = tl1.E0) != null) {
                    KProperty[] kPropertyArr = CallTopPanelWidget.o;
                    CallTopPanelWidget callTopPanelWidget = (CallTopPanelWidget) ((wie) sl1).b;
                    if (((jj1) ((ph1) callTopPanelWidget.a.getValue())).n()) {
                        xag.h(((jj1) callTopPanelWidget.d0().b).K0, yh1.b);
                        return;
                    }
                    lw3 d = m58.b(ix3.a).f().o((p8d) obj).d();
                    k91 k91 = (k91) ((jj1) callTopPanelWidget.d0().b).C0.a.getValue();
                    ow3 ow3 = z7b.a;
                    boolean z = true;
                    boolean z2 = !k91.g;
                    l21 l21 = k91.f;
                    if ((l21 != null ? l21.a : null) == null) {
                        z = false;
                    }
                    List createListBuilder = CollectionsKt.createListBuilder();
                    if (z2) {
                        createListBuilder.add(z7b.a);
                    }
                    if (z) {
                        createListBuilder.add(z7b.b);
                    }
                    d.h(CollectionsKt.build(createListBuilder)).build().o(callTopPanelWidget);
                    return;
                }
                return;
        }
    }

    public void c(View view, float f) {
        hi0 hi0 = (hi0) this.c;
        boolean z = hi0.E0.j() > 1;
        int roundToInt = MathKt.roundToInt(((float) 20) * vo4.c().getDisplayMetrics().density);
        int roundToInt2 = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
        int i = roundToInt + roundToInt2;
        float f2 = f * ((float) (-i));
        ViewPager2 viewPager2 = (ViewPager2) this.b;
        if (viewPager2.getOrientation() == 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (view instanceof OneMeEmptyView) {
                    marginLayoutParams.setMarginStart(0);
                    marginLayoutParams.setMarginEnd(0);
                } else if (!z) {
                    marginLayoutParams.setMarginStart(roundToInt2);
                    marginLayoutParams.setMarginEnd(roundToInt2);
                } else if (viewPager2.getCurrentItem() == 0) {
                    marginLayoutParams.setMarginStart(roundToInt2);
                    marginLayoutParams.setMarginEnd(i);
                } else if (viewPager2.getCurrentItem() == hi0.E0.j() - 1) {
                    marginLayoutParams.setMarginStart(i);
                    marginLayoutParams.setMarginEnd(roundToInt2);
                }
                view.setLayoutParams(marginLayoutParams);
                if (!z) {
                    f2 = c44.DEFAULT_ASPECT_RATIO;
                } else if (ct.y(viewPager2.getContext())) {
                    f2 = -f2;
                }
                view.setTranslationX(f2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public void f(Object obj, xq5 xq5) {
        ((ud) obj).E0((vob) this.c, new dm4(xq5, ((wb4) this.b).v));
    }

    public Object g(soc soc) {
        String str = (String) this.b;
        mb3 mb3 = (mb3) this.c;
        try {
            Trace.beginSection(str);
            return mb3.f.g(soc);
        } finally {
            Trace.endSection();
        }
    }

    public void i(d8 d8Var) {
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 5:
                k7 k7Var = (k7) d8Var;
                t21 t21 = (t21) obj2;
                v01 v01 = (v01) obj;
                if (k7Var instanceof h7) {
                    t21.getClass();
                    y01 y01 = v01.K0;
                    if (y01 != null) {
                        ((grg) y01).D(true);
                    }
                    Unit unit = Unit.INSTANCE;
                    hx3 hx3 = t21.a;
                    if (hx3 != null) {
                        hx3.dismiss();
                    }
                    t21.a = null;
                    return;
                } else if (k7Var instanceof i7) {
                    t21.getClass();
                    y01 y012 = v01.K0;
                    if (y012 != null) {
                        ((grg) y012).D(false);
                    }
                    Unit unit2 = Unit.INSTANCE;
                    hx3 hx32 = t21.a;
                    if (hx32 != null) {
                        hx32.dismiss();
                    }
                    t21.a = null;
                    return;
                } else if (k7Var instanceof j7) {
                    t21.getClass();
                    y01 y013 = v01.K0;
                    if (y013 != null) {
                        KProperty[] kPropertyArr = CallBottomPanelWidget.y;
                        xag.h(((jj1) ((CallBottomPanelWidget) ((grg) y013).b).e0().c).K0, vh1.b);
                    }
                    Unit unit3 = Unit.INSTANCE;
                    hx3 hx33 = t21.a;
                    if (hx33 != null) {
                        hx33.dismiss();
                    }
                    t21.a = null;
                    return;
                } else if (k7Var instanceof g7) {
                    t21.getClass();
                    y01 y014 = v01.K0;
                    if (y014 != null) {
                        KProperty[] kPropertyArr2 = CallBottomPanelWidget.y;
                        xag.h(((jj1) ((CallBottomPanelWidget) ((grg) y014).b).e0().c).K0, wh1.b);
                    }
                    Unit unit4 = Unit.INSTANCE;
                    hx3 hx34 = t21.a;
                    if (hx34 != null) {
                        hx34.dismiss();
                    }
                    t21.a = null;
                    return;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            default:
                n7 n7Var = (n7) d8Var;
                t21 t212 = (t21) obj2;
                ql1 ql1 = (ql1) obj;
                if (n7Var instanceof m7) {
                    t212.getClass();
                    sl1 sl1 = ql1.J0;
                    if (sl1 != null) {
                        ((wie) sl1).k0(vag.b);
                    }
                    Unit unit5 = Unit.INSTANCE;
                    hx3 hx35 = t212.a;
                    if (hx35 != null) {
                        hx35.dismiss();
                    }
                    t212.a = null;
                    return;
                } else if (n7Var instanceof l7) {
                    t212.getClass();
                    sl1 sl12 = ql1.J0;
                    if (sl12 != null) {
                        ((wie) sl12).k0(vag.o);
                    }
                    Unit unit6 = Unit.INSTANCE;
                    hx3 hx36 = t212.a;
                    if (hx36 != null) {
                        hx36.dismiss();
                    }
                    t212.a = null;
                    return;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
        }
    }

    public void invoke(Object obj) {
        ud udVar = (ud) obj;
        switch (this.a) {
            case 27:
                udVar.C((td) this.b, (gob) this.c);
                return;
            default:
                udVar.E((td) this.b, (sp9) this.c);
                return;
        }
    }

    public void k(o8f o8f, int i) {
        String str;
        switch (this.a) {
            case 0:
                vs6 vs6 = (vs6) this.b;
                if (!((List) vs6.b).isEmpty()) {
                    View view = o8f.f;
                    b2b b2b = view instanceof b2b ? (b2b) view : null;
                    da daVar = (da) ((List) vs6.b).get(i);
                    c2b c2b = (c2b) this.c;
                    woa woa = new woa(String.valueOf(daVar.a), c2b.getContext().getString(daVar.b), i == c2b.getSelectedTabPosition() ? voa.a : voa.b, 56);
                    if (b2b != null) {
                        b2b.setTabItem(woa);
                        return;
                    }
                    b2b b2b2 = new b2b(c2b.getContext());
                    b2b2.setTabItem(woa);
                    o8f.a(b2b2);
                    return;
                }
                return;
            case 7:
                w71 w71 = (w71) this.b;
                if (!w71.a.isEmpty()) {
                    View view2 = o8f.f;
                    b2b b2b3 = view2 instanceof b2b ? (b2b) view2 : null;
                    y71 y71 = (y71) w71.a.get(i);
                    c2b c2b2 = (c2b) this.c;
                    woa woa2 = new woa(String.valueOf(y71.a), c2b2.getContext().getString(y71.b), i == c2b2.getSelectedTabPosition() ? voa.a : voa.b, new soa(0), (Drawable) null, (Drawable) null);
                    if (b2b3 != null) {
                        b2b3.setTabItem(woa2);
                        return;
                    }
                    b2b b2b4 = new b2b(c2b2.getContext());
                    b2b4.setTabItem(woa2);
                    o8f.a(b2b4);
                    return;
                }
                return;
            default:
                c2b c2b3 = (c2b) this.c;
                int selectedTabPosition = c2b3.getSelectedTabPosition();
                View view3 = o8f.f;
                b2b b2b5 = view3 instanceof b2b ? (b2b) view3 : null;
                eg2 eg2 = (eg2) ((List) ((grg) this.b).b).get(i);
                boolean z = i == selectedTabPosition;
                Context context = c2b3.getContext();
                int ordinal = eg2.ordinal();
                if (ordinal == 0) {
                    str = q8.p(lxa.v0, context);
                } else if (ordinal == 1) {
                    str = q8.p(lxa.t0, context);
                } else if (ordinal == 2) {
                    str = q8.p(lxa.u0, context);
                } else if (ordinal == 3) {
                    str = q8.p(lxa.s0, context);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                woa woa3 = new woa(String.valueOf(eg2.ordinal()), str, z ? voa.a : voa.b, 8);
                if (b2b5 != null) {
                    b2b5.setTabItem(woa3);
                    return;
                }
                b2b b2b6 = new b2b(c2b3.getContext());
                b2b6.setTabItem(woa3);
                o8f.a(b2b6);
                return;
        }
    }

    public Object r(do1 do1) {
        switch (this.a) {
            case 11:
                ((ks1) this.b).getClass();
                ((u40) this.c).b(new js1(do1, 0));
                return "submitStillCapture";
            case 12:
                qs1 qs1 = (qs1) this.b;
                qs1.getClass();
                ryg.G().execute(new ktg(qs1, (AtomicReference) this.c, do1, 15));
                return "OnScreenFlashStart";
            default:
                uv1 uv1 = (uv1) this.b;
                uv1.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Executor executor = uv1.d;
                executor.execute(new tv1(uv1, (Context) this.c, executor, 1, do1, elapsedRealtime));
                return "CameraX initInternal";
        }
    }

    public boolean test(Object obj) {
        vk3 vk3 = (vk3) obj;
        return ((tld) this.b).g(vk3, (String) this.c) && !vk3.A();
    }

    public /* synthetic */ ba(c2b c2b, grg grg) {
        this.a = 19;
        this.c = c2b;
        this.b = grg;
    }

    /* renamed from: apply  reason: collision with other method in class */
    public zz7 m1541apply(Object obj) {
        switch (this.a) {
            case 10:
                Void voidR = (Void) obj;
                jx1 jx1 = (jx1) this.b;
                jx1.a();
                ((lk4) this.c).a();
                return jx1.m();
            default:
                qs1 qs1 = (qs1) this.b;
                qs1.getClass();
                return m5a.F(new cr0((go1) ((zz7) this.c), qs1.c, TimeUnit.SECONDS.toMillis(3)));
        }
    }
}

package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CaptureRequest;
import android.media.AudioAttributes;
import android.os.Bundle;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import androidx.media3.common.VideoFrameProcessingException;
import com.google.android.material.appbar.AppBarLayout;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import javax.inject.Provider;
import kotlin.collections.CollectionsKt;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.contextmenu.popup.ContextMenuPopupWindow;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: vs6  reason: default package */
public final class vs6 implements vla, d97, e61, ik1, zd5, qk3, f0b, hw1, lw3, ReadWriteProperty, Provider, b4d, w5g {
    public static volatile vs6 c;
    public static final Object o = new Object();
    public static vs6 v;
    public static int w;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ vs6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static vs6 r() {
        synchronized (o) {
            try {
                vs6 vs6 = v;
                if (vs6 == null) {
                    return new vs6(1, false);
                }
                v = (vs6) vs6.b;
                vs6.b = null;
                w--;
                return vs6;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public void F(long j) {
        if (j == 0) {
            ((qrf) this.b).E0 = true;
        }
        ((qrf) this.b).D0 = j;
    }

    public void I() {
        qrf qrf = (qrf) this.b;
        qrf.A0 = true;
        qrf.a();
    }

    public void L() {
        ((qrf) this.b).w.execute(new o99(3, this));
    }

    public void a(VideoFrameProcessingException videoFrameProcessingException) {
        qrf qrf = (qrf) this.b;
        qrf.getClass();
        qrf.w.execute(new sx8(10, qrf, videoFrameProcessingException));
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 10:
                xr2 xr2 = (xr2) obj;
                kz1 kz1 = (kz1) this.b;
                kz1.getClass();
                if (xr2.c != null) {
                    kz1.e().g0(kz1.o, x62.b);
                    hud hud = kz1.a;
                    if (hud == null) {
                        hud = null;
                    }
                    ((my2) ((qx2) hud.p0.getValue())).n().n0(CollectionsKt.listOf(xr2.c));
                }
                sv0 u = kz1.u();
                long j = kz1.b;
                u.c(new ij0(j));
                kz1.t().d(j);
                return;
            case 16:
                Integer num = (Integer) obj;
                f94 f94 = (f94) this.b;
                f94.getClass();
                f94.b.run();
                return;
            default:
                p25 p25 = (p25) this.b;
                p25.getClass();
                Drawable b2 = ew3.b(p25.a, nad.h2);
                Iterable iterable = (List) obj;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    d25 d25 = (d25) it.next();
                    Iterable<e15> iterable2 = d25.a;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
                    for (e15 e15 : iterable2) {
                        Iterator it2 = it;
                        e15 e152 = r8;
                        e15 e153 = new e15(e15.a + 1, e15.b, e15.c, e15.d, e15.e, e15.f, e15.g);
                        arrayList2.add(e152);
                        it = it2;
                    }
                    arrayList.add(new d25(d25.b, arrayList2));
                    it = it;
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(i16.c);
                arrayList3.addAll(arrayList);
                o25 o25 = new o25(b2, arrayList3);
                p25.o.d(Boolean.FALSE);
                p25.v.d(CollectionsKt.arrayListOf(o25));
                return;
        }
    }

    public void b(Object obj) {
        ((zq5) this.b).b.b((byte[]) obj);
    }

    public mw3 build() {
        return new ContextMenuPopupWindow(new Bundle((Bundle) this.b));
    }

    public lw3 c() {
        Rect rect = py6.b;
        Rect rect2 = py6.b;
        Bundle bundle = (Bundle) this.b;
        bundle.putParcelable("highlight_padding", rect2);
        bundle.remove("highlight_radius");
        return this;
    }

    public lw3 d() {
        Bundle bundle = (Bundle) this.b;
        bundle.remove("highlight_padding");
        bundle.remove("highlight_radius");
        return this;
    }

    public lw3 e(Rect rect, float f) {
        Bundle bundle = (Bundle) this.b;
        bundle.putParcelable("highlight_padding", rect);
        bundle.putFloat("highlight_radius", f);
        return this;
    }

    public lw3 f() {
        ((Bundle) this.b).putBoolean("dark_theme", true);
        return this;
    }

    public void g(int i, int i2) {
        ((qrf) this.b).w.execute(new wt0(this, i, i2, 2));
    }

    public Object get() {
        String packageName = ((Context) ((Provider) this.b).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public Object getValue(Object obj, KProperty kProperty) {
        Object b2 = ((hdd) this.b).b("CreateChannelViewModel:absolute_crop");
        if (b2 == null) {
            return null;
        }
        return b2;
    }

    public lw3 h(Collection collection) {
        ((Bundle) this.b).putBundle("actions", kr7.f(collection));
        return this;
    }

    public lw3 i(float f, float f2) {
        if (f < c44.DEFAULT_ASPECT_RATIO || f2 < c44.DEFAULT_ASPECT_RATIO) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Bundle bundle = (Bundle) this.b;
        bundle.putFloat("x", f);
        bundle.putFloat("y", f2);
        return this;
    }

    public void j(Typeface typeface) {
        e53 e53 = (e53) this.b;
        if (e53.o(typeface)) {
            e53.i(false);
        }
    }

    public lw3 k(float f) {
        Rect rect = py6.b;
        Bundle bundle = (Bundle) this.b;
        bundle.putParcelable("highlight_padding", rect);
        bundle.putFloat("highlight_radius", f);
        return this;
    }

    public void l(g0b g0b) {
        ((e8e) ((zs2) this.b)).b.invoke(g0b);
    }

    public lw3 m(Bundle bundle) {
        ((Bundle) this.b).putBundle(ApiProtocol.PARAM_PAYLOAD, bundle);
        return this;
    }

    public lw3 n(mgf mgf) {
        ((Bundle) this.b).putParcelable("header", mgf);
        return this;
    }

    public lw3 o(View view) {
        if (view.getId() != -1) {
            int id = view.getId();
            Bundle bundle = (Bundle) this.b;
            bundle.putInt("anchor_id", id);
            bundle.putSerializable("anchor_class", view.getClass());
            return this;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public lw3 p() {
        ((Bundle) this.b).putBoolean("dim", true);
        return this;
    }

    public yy9 q() {
        throw null;
    }

    public void setValue(Object obj, KProperty kProperty, Object obj2) {
        getValue(obj, kProperty);
        ((hdd) this.b).c(obj2, "CreateChannelViewModel:absolute_crop");
    }

    public sp9 t(hf4 hf4, p77 p77) {
        l8b l8b = (l8b) this.b;
        sp9 sp9 = null;
        int i = 0;
        while (true) {
            try {
                hf4.q(l8b.a, 0, 10, false);
                l8b.G(0);
                if (l8b.x() != 4801587) {
                    break;
                }
                l8b.H(3);
                int t = l8b.t();
                int i2 = t + 10;
                if (sp9 == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(l8b.a, 0, bArr, 0, 10);
                    hf4.q(bArr, 10, t, false);
                    sp9 = new s77(p77).N(i2, bArr);
                } else {
                    hf4.a(t, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        hf4.w = 0;
        hf4.a(i, false);
        return sp9;
    }

    public String toString() {
        switch (this.a) {
            case 28:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    public void u() {
        synchronized (o) {
            try {
                int i = w;
                if (i < 5) {
                    w = i + 1;
                    vs6 vs6 = v;
                    if (vs6 != null) {
                        this.b = vs6;
                    }
                    v = this;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void v() {
        ((InputContentInfo) this.b).requestPermission();
    }

    public void w(CaptureRequest.Key key, Object obj) {
        ie3 ie3 = ie3.c;
        ((pz9) this.b).e(vs1.o0(key), ie3, obj);
    }

    public int x(ea6 ea6) {
        String str = ea6.n;
        return (str == null || !vq9.i(str)) ? pk0.b(0, 0, 0, 0) : v0g.K(ea6.n) ? pk0.b(4, 0, 0, 0) : pk0.b(1, 0, 0, 0);
    }

    public Long y(Long l) {
        if (l.longValue() < 0) {
            this.b = null;
            return null;
        }
        Long l2 = (Long) this.b;
        this.b = l;
        if (l2 != null && l.longValue() >= l2.longValue()) {
            return Long.valueOf(l.longValue() - l2.longValue());
        }
        return null;
    }

    public iog z(View view, iog iog) {
        AppBarLayout appBarLayout = (AppBarLayout) this.b;
        appBarLayout.getClass();
        WeakHashMap weakHashMap = gag.a;
        iog iog2 = appBarLayout.getFitsSystemWindows() ? iog : null;
        if (!Objects.equals(appBarLayout.x, iog2)) {
            appBarLayout.x = iog2;
            appBarLayout.setWillNotDraw(!(appBarLayout.H0 != null && appBarLayout.getTopInset() > 0));
            appBarLayout.requestLayout();
        }
        return iog;
    }

    public /* synthetic */ vs6(int i, boolean z) {
        this.a = i;
    }

    public vs6(int i) {
        this.a = i;
        switch (i) {
            case 5:
                this.b = new fm0(1);
                return;
            case 8:
                this.b = pz9.c();
                return;
            case 13:
                this.b = new Bundle();
                return;
            case 18:
                this.b = (SmallDisplaySizeQuirk) qn4.a.g(SmallDisplaySizeQuirk.class);
                return;
            case 23:
                this.b = new l8b(10);
                return;
            case 27:
                this.b = (ExtraCroppingQuirk) qn4.a.g(ExtraCroppingQuirk.class);
                return;
            default:
                this.b = new HashSet();
                return;
        }
    }

    public vs6(i30 i30) {
        this.a = 4;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(i30.a).setFlags(i30.b).setUsage(i30.c);
        int i = v0g.a;
        if (i >= 29) {
            e30.a(usage, i30.d);
        }
        if (i >= 32) {
            g30.a(usage, i30.e);
        }
        this.b = usage.build();
    }

    public vs6(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = 22;
        this.b = new GestureDetector(context, onGestureListener, (Handler) null);
    }

    public vs6(Object obj) {
        this.a = 24;
        this.b = (InputContentInfo) obj;
    }
}

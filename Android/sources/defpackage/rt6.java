package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import com.google.android.gms.common.internal.a;
import com.yalantis.ucrop.callback.BitmapLoadCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.sdk.arch.Widget;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.util.HandledException;

/* renamed from: rt6  reason: default package */
public final class rt6 implements BitmapLoadCallback, vla, by9, lj0, vd1, o11, qk3, xg8, ReadWriteProperty {
    public static rt6 c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ rt6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static rt6 q(Context context) {
        vzg.m(context);
        synchronized (rt6.class) {
            if (c == null) {
                v2h v2h = c6h.a;
                synchronized (c6h.class) {
                    try {
                        if (c6h.c == null) {
                            c6h.c = context.getApplicationContext();
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                c = new rt6(context);
            }
        }
        return c;
    }

    public static final b5h t(PackageInfo packageInfo, b5h... b5hArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        g5h g5h = new g5h(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < b5hArr.length; i++) {
            if (b5hArr[i].equals(g5h)) {
                return b5hArr[i];
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0047 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean u(android.content.pm.PackageInfo r4, boolean r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0027
            if (r4 == 0) goto L_0x0029
            java.lang.String r2 = "com.android.vending"
            java.lang.String r3 = r4.packageName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x001a
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0027
        L_0x001a:
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo
            if (r5 != 0) goto L_0x0020
        L_0x001e:
            r5 = r1
            goto L_0x0027
        L_0x0020:
            int r5 = r5.flags
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L_0x001e
            r5 = r0
        L_0x0027:
            r2 = r4
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            if (r4 == 0) goto L_0x0048
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L_0x0048
            if (r5 == 0) goto L_0x0039
            b5h[] r4 = defpackage.w5h.a
            b5h r4 = t(r2, r4)
            goto L_0x0045
        L_0x0039:
            b5h[] r4 = defpackage.w5h.a
            r4 = r4[r1]
            b5h[] r4 = new defpackage.b5h[]{r4}
            b5h r4 = t(r2, r4)
        L_0x0045:
            if (r4 == 0) goto L_0x0048
            return r0
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rt6.u(android.content.pm.PackageInfo, boolean):boolean");
    }

    public void a() {
        z51 z51;
        e61 e61 = ((f61) this.b).H0;
        if (e61 != null && (z51 = ((a61) ((vs6) e61).b).M0) != null) {
            gga gga = CallScreen.J0;
            CallScreen callScreen = ((dh1) z51).a;
            callScreen.k0().b(oq1.OUTSIDE_SHARE, pq1.INSIDE_CALL);
            String str = hsg.n;
            hsg.G(callScreen.getContext(), f6e.J(callScreen.p0().l().k));
        }
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 10:
                Throwable th = (Throwable) obj;
                kz1 kz1 = (kz1) this.b;
                z68.f(kz1.x, "onUploadFailed: failed", th);
                eef t = kz1.t();
                long j = kz1.b;
                t.d(j);
                kz1.B();
                kz1.A();
                kz1.u().c(new hj0(j, th instanceof TamErrorException ? ((TamErrorException) th).a : new qaf("internal-error", th.toString(), (String) null)));
                return;
            case 16:
                Throwable th2 = (Throwable) obj;
                Function1 function1 = ((f94) this.b).c;
                if (function1 != null) {
                    function1.invoke(th2);
                    return;
                }
                return;
            default:
                Throwable th3 = (Throwable) obj;
                p25 p25 = (p25) this.b;
                p25.getClass();
                z68.f("p25", "load emoji error", th3);
                ((uta) p25.c).c(new HandledException(th3), true);
                return;
        }
    }

    public void b() {
        z51 z51;
        e61 e61 = ((f61) this.b).H0;
        if (e61 != null && (z51 = ((a61) ((vs6) e61).b).M0) != null) {
            gga gga = CallScreen.J0;
            CallScreen callScreen = ((dh1) z51).a;
            callScreen.k0().b(oq1.COPY_LINK, pq1.INSIDE_CALL);
            b59.k(callScreen.getContext(), f6e.J(callScreen.p0().l().k));
            if (b59.C()) {
                String string = callScreen.getContext().getString(ykc.call_link_share_dialog_share_link_copy);
                e0b e0b = new e0b((Widget) callScreen);
                e0b.i(string);
                e0b.c(new n0b(0, 0, 3));
                e0b.j();
            }
        }
    }

    public void c() {
        z51 z51;
        e61 e61 = ((f61) this.b).H0;
        if (e61 != null && (z51 = ((a61) ((vs6) e61).b).M0) != null) {
            gga gga = CallScreen.J0;
            ((dh1) z51).a.p0().k();
        }
    }

    public void d() {
        c50.a((c50) this.b);
    }

    public void e(bi3 bi3) {
        boolean z = bi3.b == 0;
        a aVar = (a) this.b;
        if (z) {
            aVar.k((u57) null, aVar.F0);
            return;
        }
        xga xga = aVar.x0;
        if (xga != null) {
            ((gt6) xga.b).l(bi3);
        }
    }

    public void f() {
        c50.a((c50) this.b);
    }

    public void g() {
        e61 e61 = ((f61) this.b).H0;
        if (e61 != null && ((a61) ((vs6) e61).b).M0 != null) {
            id1.b.getClass();
        }
    }

    public Object getValue(Object obj, KProperty kProperty) {
        Object b2 = ((hdd) this.b).b("CreateChannelViewModel:channel_name");
        if (b2 == null) {
            return null;
        }
        return b2;
    }

    public void h() {
        z51 z51;
        e61 e61 = ((f61) this.b).H0;
        if (e61 != null && (z51 = ((a61) ((vs6) e61).b).M0) != null) {
            gga gga = CallScreen.J0;
            CallScreen callScreen = ((dh1) z51).a;
            callScreen.k0().b(oq1.INSIDE_SHARE, pq1.INSIDE_CALL);
            jj1 p0 = callScreen.p0();
            xag.h(p0.K0, new ei1(f6e.J(p0.l().k)));
        }
    }

    public void i(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str != null) {
                    if (((ArrayList) this.b) == null) {
                        this.b = new ArrayList();
                    }
                    if (!((ArrayList) this.b).contains(str)) {
                        ((ArrayList) this.b).add(str);
                    }
                } else {
                    throw new IllegalArgumentException("category must not be null");
                }
            }
        }
    }

    public void j() {
        c50.a((c50) this.b);
    }

    public void k(ze1 ze1, Point point) {
        z51 z51;
        e61 e61 = ((f61) this.b).H0;
        if (e61 != null && (z51 = ((a61) ((vs6) e61).b).M0) != null) {
            gga gga = CallScreen.J0;
            ((dh1) z51).a.p0().r(ze1, point);
        }
    }

    public kw8 l() {
        if (((ArrayList) this.b) == null) {
            return kw8.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", (ArrayList) this.b);
        return new kw8((ArrayList) this.b, bundle);
    }

    public void m(ze1 ze1) {
        z51 z51;
        e61 e61 = ((f61) this.b).H0;
        if (e61 != null && (z51 = ((a61) ((vs6) e61).b).M0) != null) {
            gga gga = CallScreen.J0;
            ((dh1) z51).a.p0().o(ze1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = defpackage.l72.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String n(defpackage.kq0 r2, defpackage.fo3 r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0019
            l72 r0 = defpackage.l72.a
            java.lang.Object r1 = r1.b
            l72 r1 = (defpackage.l72) r1
            if (r1 == r0) goto L_0x0019
            java.lang.String r1 = r3.Z
            java.lang.String r1 = defpackage.hhf.c(r1)
            java.lang.String r2 = r2.b
            java.lang.String r3 = " /"
            java.lang.String r1 = defpackage.g63.i(r1, r3, r2)
            return r1
        L_0x0019:
            java.lang.String r1 = r2.b
            java.lang.String r2 = "/"
            java.lang.String r1 = defpackage.a81.m(r2, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rt6.n(kq0, fo3):java.lang.String");
    }

    public void o(ze1 ze1) {
        z51 z51;
        e61 e61 = ((f61) this.b).H0;
        if (e61 != null && (z51 = ((a61) ((vs6) e61).b).M0) != null) {
            gga gga = CallScreen.J0;
            CallScreen callScreen = ((dh1) z51).a;
            if (callScreen.p0().j(callScreen.l0().g)) {
                CallScreen.f0(callScreen);
            }
        }
    }

    public void onBitmapLoaded(Bitmap bitmap, ta5 ta5, String str, String str2) {
        frf frf = (frf) this.b;
        frf.mImageInputPath = str;
        frf.mImageOutputPath = str2;
        frf.mExifInfo = ta5;
        frf.mBitmapDecoded = true;
        frf.setImageBitmap(bitmap);
    }

    public void onFailure(Exception exc) {
        ((frf) this.b).getClass();
    }

    public void p() {
        c50.a((c50) this.b);
    }

    public void r() {
        qrf qrf = (qrf) this.b;
        qrf.B0 = true;
        if (qrf.Z.isEmpty()) {
            gk4 gk4 = qrf.x0;
            gk4.getClass();
            gk4.f();
            return;
        }
        qrf.a();
    }

    public void s(Object obj) {
        boolean z = obj instanceof List;
        ArrayList arrayList = null;
        MediaBrowserService.Result result = (MediaBrowserService.Result) this.b;
        if (z) {
            List<Parcel> list = (List) obj;
            if (list != null) {
                arrayList = new ArrayList(list.size());
                for (Parcel parcel : list) {
                    parcel.setDataPosition(0);
                    arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                    parcel.recycle();
                }
            }
            result.sendResult(arrayList);
        } else if (obj instanceof Parcel) {
            Parcel parcel2 = (Parcel) obj;
            parcel2.setDataPosition(0);
            result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
            parcel2.recycle();
        } else {
            result.sendResult((Object) null);
        }
    }

    public void setValue(Object obj, KProperty kProperty, Object obj2) {
        getValue(obj, kProperty);
        ((hdd) this.b).c(obj2, "CreateChannelViewModel:channel_name");
    }

    public void v() {
        c50.a((c50) this.b);
    }

    public void w() {
        c50.a((c50) this.b);
    }

    public void x() {
        c50.a((c50) this.b);
    }

    public void y() {
        z51 z51;
        e61 e61 = ((f61) this.b).H0;
        if (e61 != null && (z51 = ((a61) ((vs6) e61).b).M0) != null) {
            gga gga = CallScreen.J0;
            ((dh1) z51).a.p0().c.g();
        }
    }

    public iog z(View view, iog iog) {
        boolean z;
        boolean z2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        iog iog2 = iog;
        switch (this.a) {
            case 3:
                int d = iog.d();
                eo eoVar = (eo) this.b;
                eoVar.getClass();
                int d2 = iog.d();
                ActionBarContextView actionBarContextView = eoVar.E0;
                int i2 = 0;
                if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                    z = false;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) eoVar.E0.getLayoutParams();
                    boolean z3 = true;
                    if (eoVar.E0.isShown()) {
                        if (eoVar.l1 == null) {
                            eoVar.l1 = new Rect();
                            eoVar.m1 = new Rect();
                        }
                        Rect rect = eoVar.l1;
                        Rect rect2 = eoVar.m1;
                        rect.set(iog.b(), iog.d(), iog.c(), iog.a());
                        scg.a(eoVar.J0, rect, rect2);
                        int i3 = rect.top;
                        int i4 = rect.left;
                        int i5 = rect.right;
                        ViewGroup viewGroup = eoVar.J0;
                        WeakHashMap weakHashMap = gag.a;
                        iog a2 = w9g.a(viewGroup);
                        int b2 = a2 == null ? 0 : a2.b();
                        int c2 = a2 == null ? 0 : a2.c();
                        if (marginLayoutParams2.topMargin == i3 && marginLayoutParams2.leftMargin == i4 && marginLayoutParams2.rightMargin == i5) {
                            z2 = false;
                        } else {
                            marginLayoutParams2.topMargin = i3;
                            marginLayoutParams2.leftMargin = i4;
                            marginLayoutParams2.rightMargin = i5;
                            z2 = true;
                        }
                        Context context = eoVar.Y;
                        if (i3 <= 0 || eoVar.L0 != null) {
                            View view2 = eoVar.L0;
                            if (!(view2 == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()).height == (i = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == b2 && marginLayoutParams.rightMargin == c2))) {
                                marginLayoutParams.height = i;
                                marginLayoutParams.leftMargin = b2;
                                marginLayoutParams.rightMargin = c2;
                                eoVar.L0.setLayoutParams(marginLayoutParams);
                            }
                        } else {
                            View view3 = new View(context);
                            eoVar.L0 = view3;
                            view3.setVisibility(8);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                            layoutParams.leftMargin = b2;
                            layoutParams.rightMargin = c2;
                            eoVar.J0.addView(eoVar.L0, -1, layoutParams);
                        }
                        View view4 = eoVar.L0;
                        if (view4 == null) {
                            z3 = false;
                        }
                        if (z3 && view4.getVisibility() != 0) {
                            View view5 = eoVar.L0;
                            view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? fw3.a(context, wdc.abc_decor_view_status_guard_light) : fw3.a(context, wdc.abc_decor_view_status_guard));
                        }
                        if (!eoVar.Q0 && z3) {
                            d2 = 0;
                        }
                        boolean z4 = z3;
                        z3 = z2;
                        z = z4;
                    } else if (marginLayoutParams2.topMargin != 0) {
                        marginLayoutParams2.topMargin = 0;
                        z = false;
                    } else {
                        z = false;
                        z3 = false;
                    }
                    if (z3) {
                        eoVar.E0.setLayoutParams(marginLayoutParams2);
                    }
                }
                View view6 = eoVar.L0;
                if (view6 != null) {
                    if (!z) {
                        i2 = 8;
                    }
                    view6.setVisibility(i2);
                }
                return gag.f(view, d != d2 ? iog2.e(iog.b(), d2, iog.c(), iog.a()) : iog2);
            default:
                i53 i53 = (i53) this.b;
                i53.getClass();
                WeakHashMap weakHashMap2 = gag.a;
                iog iog3 = i53.getFitsSystemWindows() ? iog2 : null;
                if (!Objects.equals(i53.M0, iog3)) {
                    i53.M0 = iog3;
                    i53.requestLayout();
                }
                return iog2.a.c();
        }
    }

    public /* synthetic */ rt6(int i, boolean z) {
        this.a = i;
    }

    public rt6(zwd zwd) {
        this.a = 21;
        x8b[] x8bArr = x8b.a;
        this.b = zwd;
    }

    public rt6(Context context) {
        this.a = 0;
        this.b = context.getApplicationContext();
    }

    public rt6(ykb ykb) {
        this.a = 2;
        AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk = (AeFpsRangeLegacyQuirk) ykb.g(AeFpsRangeLegacyQuirk.class);
        if (aeFpsRangeLegacyQuirk == null) {
            this.b = null;
        } else {
            this.b = aeFpsRangeLegacyQuirk.a;
        }
    }

    public rt6(CameraCaptureSession cameraCaptureSession) {
        this.a = 9;
        this.b = new ata(cameraCaptureSession, (i8b) null);
    }

    public rt6(int i) {
        this.a = i;
        switch (i) {
            case 25:
                this.b = new LinkedHashMap(0, 0.75f, true);
                return;
            default:
                this.b = null;
                return;
        }
    }
}

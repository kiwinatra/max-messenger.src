package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.AssetManager;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.fresco.ui.common.ImagePerfDataListener;
import com.facebook.fresco.ui.common.c;
import com.facebook.fresco.ui.common.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: cy3  reason: default package */
public final class cy3 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public cy3(qr0 qr0, yo7 yo7, xqg xqg, cy3[] cy3Arr) {
        this.b = qr0;
        this.c = yo7;
        this.d = xqg;
        this.e = cy3Arr;
        yo7.getClass();
        this.f = yo7.a;
        int ordinal = xqg.ordinal();
        if (cy3Arr != null) {
            cy3 cy3 = cy3Arr[ordinal];
            if (cy3 != null || cy3 != this) {
                cy3Arr[ordinal] = this;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
        r6 = r5[r1.ordinal()];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.cy3 a(defpackage.usd r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.c
            yo7 r0 = (defpackage.yo7) r0
            xqg r1 = defpackage.h88.U(r0, r6)
            char r2 = r1.a
            java.lang.Object r3 = r5.b
            qr0 r3 = (defpackage.qr0) r3
            r3.s(r2)
            r3.k()
            java.lang.Object r2 = r5.g
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x003a
            java.lang.Object r4 = r5.h
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x0024
            java.lang.String r4 = r6.a()
        L_0x0024:
            r3.n()
            r5.j(r2)
            r6 = 58
            r3.s(r6)
            r3.x()
            r5.j(r4)
            r6 = 0
            r5.g = r6
            r5.h = r6
        L_0x003a:
            java.lang.Object r6 = r5.d
            xqg r6 = (defpackage.xqg) r6
            if (r6 != r1) goto L_0x0041
            return r5
        L_0x0041:
            java.lang.Object r5 = r5.e
            cy3[] r5 = (defpackage.cy3[]) r5
            if (r5 == 0) goto L_0x0050
            int r6 = r1.ordinal()
            r6 = r5[r6]
            if (r6 == 0) goto L_0x0050
            goto L_0x0055
        L_0x0050:
            cy3 r6 = new cy3
            r6.<init>(r3, r0, r1, r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cy3.a(usd):cy3");
    }

    public void b(boolean z) {
        if (this.a) {
            j(String.valueOf(z));
        } else {
            ((ni0) ((qr0) this.b).b).U(String.valueOf(z));
        }
    }

    public void c(usd usd, int i) {
        int ordinal = ((xqg) this.d).ordinal();
        boolean z = true;
        qr0 qr0 = (qr0) this.b;
        if (ordinal == 1) {
            if (!qr0.a) {
                qr0.s(',');
            }
            qr0.n();
        } else if (ordinal != 2) {
            if (ordinal != 3) {
                if (!qr0.a) {
                    qr0.s(',');
                }
                qr0.n();
                m5a.L((yo7) this.c, usd);
                j(usd.f(i));
                qr0.s(':');
                qr0.x();
                return;
            }
            if (i == 0) {
                this.a = true;
            }
            if (i == 1) {
                qr0.s(',');
                qr0.x();
                this.a = false;
            }
        } else if (!qr0.a) {
            if (i % 2 == 0) {
                qr0.s(',');
                qr0.n();
            } else {
                qr0.s(':');
                qr0.x();
                z = false;
            }
            this.a = z;
        } else {
            this.a = true;
            qr0.n();
        }
    }

    public void d(usd usd, int i) {
        j(usd.f(i));
    }

    public void e() {
        ((ni0) ((qr0) this.b).b).U("null");
    }

    public void f(usd usd, int i, Object obj) {
        bye bye = bye.a;
        if (obj != null || ((ap7) this.f).f) {
            g(usd, i, obj);
        }
    }

    public void g(usd usd, int i, Object obj) {
        bye bye = bye.a;
        c(usd, i);
        bye bye2 = bye.a;
        if (obj == null) {
            e();
        } else {
            i(bye, obj);
        }
    }

    public void h(usd usd, int i, aq7 aq7, Object obj) {
        c(usd, i);
        i(aq7, obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i(defpackage.aq7 r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.c
            yo7 r0 = (defpackage.yo7) r0
            ap7 r1 = r0.a
            boolean r2 = r1.i
            if (r2 == 0) goto L_0x000e
            r5.b(r4, r6)
            goto L_0x0075
        L_0x000e:
            i13 r1 = r1.p
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x0063
            r2 = 1
            if (r1 == r2) goto L_0x0023
            r0 = 2
            if (r1 != r0) goto L_0x001d
            goto L_0x0063
        L_0x001d:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L_0x0023:
            usd r1 = r5.d()
            kne r1 = r1.getKind()
            hye r2 = defpackage.hye.o
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r2 != 0) goto L_0x003b
            hye r2 = defpackage.hye.r
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x0063
        L_0x003b:
            usd r1 = r5.d()
            java.util.List r1 = r1.getAnnotations()
            java.util.Iterator r1 = r1.iterator()
        L_0x0047:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x005e
            java.lang.Object r2 = r1.next()
            java.lang.annotation.Annotation r2 = (java.lang.annotation.Annotation) r2
            boolean r3 = r2 instanceof defpackage.zo7
            if (r3 == 0) goto L_0x0047
            zo7 r2 = (defpackage.zo7) r2
            java.lang.String r0 = r2.discriminator()
            goto L_0x0064
        L_0x005e:
            ap7 r0 = r0.a
            java.lang.String r0 = r0.j
            goto L_0x0064
        L_0x0063:
            r0 = 0
        L_0x0064:
            if (r0 == 0) goto L_0x0072
            usd r1 = r5.d()
            java.lang.String r1 = r1.a()
            r4.g = r0
            r4.h = r1
        L_0x0072:
            r5.b(r4, r6)
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cy3.i(aq7, java.lang.Object):void");
    }

    public void j(String str) {
        ((qr0) this.b).u(str);
    }

    public void k(usd usd, int i, String str) {
        c(usd, i);
        j(str);
    }

    public void l() {
        xqg xqg = (xqg) this.d;
        char c2 = xqg.b;
        qr0 qr0 = (qr0) this.b;
        qr0.y();
        qr0.o();
        qr0.s(xqg.b);
    }

    public void m(d dVar, o97 o97) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        sp6 sp6;
        z7d z7d;
        dVar.getClass();
        if (this.a && (copyOnWriteArrayList = (CopyOnWriteArrayList) this.h) != null && !copyOnWriteArrayList.isEmpty()) {
            if (!(o97 != o97.c || (sp6 = ((jnb) this.b).h) == null || (z7d = sp6.d) == null)) {
                Rect bounds = z7d.getBounds();
                bounds.width();
                d dVar2 = (d) this.d;
                dVar2.getClass();
                bounds.height();
                dVar2.getClass();
            }
            c p1 = dVar.p1();
            Iterator it = ((CopyOnWriteArrayList) this.h).iterator();
            while (it.hasNext()) {
                ((ImagePerfDataListener) it.next()).onImageLoadStatusUpdated(p1, o97);
            }
        }
    }

    public void n() {
        ey3 ey3 = (ey3) this.d;
        zx3 zx3 = (zx3) this.b;
        if (zx3 != null) {
            zx3.changeEnded(ey3, (fy3) this.e);
        }
        zx3 zx32 = (zx3) this.c;
        if (zx32 != null) {
            ey3.c.remove(zx32.getInstanceId());
            zx32.changeEnded(ey3, (fy3) this.f);
        }
        for (dy3 b2 : (List) this.g) {
            b2.b(zx32, zx3, this.a);
        }
        if (ey3.a) {
            ViewGroup viewGroup = null;
            View view = (View) this.h;
            ViewParent parent = view != null ? view.getParent() : null;
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            }
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        if (ey3.d() && zx3 != null) {
            zx3.setNeedsAttach(false);
        }
    }

    public FileInputStream o(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                ((y1c) this.c).getClass();
            }
            return null;
        }
    }

    public void p(int i, Serializable serializable) {
        ((Executor) this.b).execute(new kh1((Object) this, i, (Object) serializable, 6));
    }

    public void q() {
        ArrayList arrayList;
        e0d e0d;
        int i;
        if (this.a) {
            ArrayList arrayList2 = new ArrayList();
            int i2 = Build.VERSION.SDK_INT;
            PackageManager packageManager = (PackageManager) this.e;
            if (i2 >= 30) {
                Intent intent = new Intent("android.media.MediaRoute2ProviderService");
                ArrayList arrayList3 = new ArrayList();
                for (ResolveInfo resolveInfo : packageManager.queryIntentServices(intent, 0)) {
                    arrayList3.add(resolveInfo.serviceInfo);
                }
                arrayList2 = arrayList3;
            }
            Iterator<ResolveInfo> it = packageManager.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i3 = 0;
            while (true) {
                boolean hasNext = it.hasNext();
                arrayList = (ArrayList) this.f;
                boolean z = true;
                e0d = (e0d) this.c;
                if (!hasNext) {
                    break;
                }
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null) {
                    if ((sw8.d == null ? false : sw8.c().d) && !arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            ServiceInfo serviceInfo2 = (ServiceInfo) it2.next();
                            if (serviceInfo.packageName.equals(serviceInfo2.packageName) && serviceInfo.name.equals(serviceInfo2.name)) {
                                break;
                            }
                        }
                    }
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    int size = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            i4 = -1;
                            break;
                        }
                        ComponentName componentName = ((d0d) arrayList.get(i4)).z;
                        if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                            break;
                        }
                        i4++;
                    }
                    if (i4 < 0) {
                        d0d d0d = new d0d((Context) this.b, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        d0d.y0 = new y3a(this, d0d);
                        if (!d0d.Z) {
                            if (d0d.z0) {
                                d0d.toString();
                            }
                            d0d.Z = true;
                            d0d.m();
                        }
                        i = i3 + 1;
                        arrayList.add(i3, d0d);
                        ((ow8) e0d).a(d0d);
                    } else if (i4 >= i3) {
                        d0d d0d2 = (d0d) arrayList.get(i4);
                        if (!d0d2.Z) {
                            if (d0d.z0) {
                                d0d2.toString();
                            }
                            d0d2.Z = true;
                            d0d2.m();
                        }
                        if (d0d2.w0 == null) {
                            if (!d0d2.Z || (d0d2.v == null && d0d2.Y.isEmpty())) {
                                z = false;
                            }
                            if (z) {
                                d0d2.l();
                                d0d2.i();
                            }
                        }
                        i = i3 + 1;
                        Collections.swap(arrayList, i4, i3);
                    }
                    i3 = i;
                }
            }
            if (i3 < arrayList.size()) {
                for (int size2 = arrayList.size() - 1; size2 >= i3; size2--) {
                    d0d d0d3 = (d0d) arrayList.get(size2);
                    ow8 ow8 = (ow8) e0d;
                    qw8 e2 = ow8.e(d0d3);
                    if (e2 != null) {
                        d0d3.getClass();
                        sw8.b();
                        d0d3.o = null;
                        d0d3.h((pv8) null);
                        ow8.l(e2, (jw8) null);
                        if (sw8.c) {
                            e2.toString();
                        }
                        ow8.m.b(514, e2);
                        ow8.i.remove(e2);
                    }
                    arrayList.remove(d0d3);
                    d0d3.y0 = null;
                    if (d0d3.Z) {
                        if (d0d.z0) {
                            d0d3.toString();
                        }
                        d0d3.Z = false;
                        d0d3.m();
                    }
                }
            }
        }
    }

    public void r(boolean z) {
        this.a = z;
        if (z) {
            z97 z97 = (z97) this.f;
            d dVar = (d) this.d;
            ys9 ys9 = (ys9) this.c;
            if (z97 == null) {
                this.f = new z97(ys9, dVar, this);
            }
            if (((y97) this.e) == null) {
                this.e = new y97(ys9, dVar);
            }
            if (((zb6) this.g) == null) {
                this.g = new zb6((y97) this.e);
            }
            z97 z972 = (z97) this.f;
            if (z972 != null) {
                ((jnb) this.b).g.addListener(z972);
            }
            zb6 zb6 = (zb6) this.g;
            if (zb6 != null) {
                jnb jnb = (jnb) this.b;
                synchronized (jnb) {
                    try {
                        if (jnb.G == null) {
                            jnb.G = new HashSet();
                        }
                        jnb.G.add(zb6);
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                return;
            }
            return;
        }
        z97 z973 = (z97) this.f;
        if (z973 != null) {
            ((jnb) this.b).g.removeListener(z973);
        }
        zb6 zb62 = (zb6) this.g;
        if (zb62 != null) {
            jnb jnb2 = (jnb) this.b;
            synchronized (jnb2) {
                HashSet hashSet = jnb2.G;
                if (hashSet != null) {
                    hashSet.remove(zb62);
                }
            }
        }
    }

    public boolean s() {
        return ((ap7) this.f).a;
    }

    public cy3(AwakeTimeSinceBootClock awakeTimeSinceBootClock, jnb jnb) {
        this.c = awakeTimeSinceBootClock;
        this.b = jnb;
        na7 na7 = na7.a;
        j3h j3h = new j3h(6);
        o97 o97 = o97.a;
        wdg wdg = wdg.a;
        this.d = j3h;
    }

    public cy3(Context context, ow8 ow8) {
        this.f = new ArrayList();
        this.g = new ao(12, this);
        this.h = new tj7(23, this);
        this.b = context;
        this.c = ow8;
        this.d = new Handler();
        this.e = context.getPackageManager();
    }

    public cy3(AssetManager assetManager, Executor executor, y1c y1c, String str, File file) {
        this.a = false;
        this.b = executor;
        this.c = y1c;
        this.f = str;
        this.e = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 34) {
            switch (i) {
                case 29:
                case 30:
                    bArr = kr7.w;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = kr7.v;
                    break;
            }
        }
        this.d = bArr;
    }

    public cy3(zx3 zx3, ey3 ey3, fy3 fy3, zx3 zx32, List list, View view, fy3 fy32, boolean z, ViewGroup viewGroup) {
        this.b = zx3;
        this.d = ey3;
        this.e = fy3;
        this.c = zx32;
        this.g = list;
        this.h = view;
        this.f = fy32;
        this.a = z;
    }
}

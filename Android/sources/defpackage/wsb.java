package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.Rect;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import android.util.Size;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.core.ImageCaptureException;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import com.google.android.material.datepicker.MaterialCalendar;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.sdk.uikit.common.views.OneMeContactsChipGroup;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import org.webrtc.CameraVideoCapturer;

/* renamed from: wsb  reason: default package */
public final class wsb implements xra, CameraVideoCapturer.CameraSwitchHandler, pyc, p17, up9, wz8, iw4, yr6, pn0, uye, nj6, mcg {
    public Object a;
    public Object b;

    public wsb(int i) {
        switch (i) {
            case LangUtils.HASH_SEED /*17*/:
                this.a = new npg(10);
                return;
            case 27:
                this.a = new SpannableStringBuilder();
                this.b = new ArrayDeque();
                return;
            default:
                this.a = new Rect();
                this.b = new Rect();
                return;
        }
    }

    public void A(int i, nz8 nz8, l28 l28, es8 es8) {
        Pair Y = Y(i, nz8);
        if (Y != null) {
            ((k7f) ((iw6) ((j09) this.b).k)).d(new d09(this, Y, l28, es8, 1));
        }
    }

    public void B(int i, nz8 nz8) {
        Pair Y = Y(i, nz8);
        if (Y != null) {
            ((k7f) ((iw6) ((j09) this.b).k)).d(new c09(this, Y, 0));
        }
    }

    public void C(int i, nz8 nz8, es8 es8) {
        Pair Y = Y(i, nz8);
        if (Y != null) {
            ((k7f) ((iw6) ((j09) this.b).k)).d(new b09(this, Y, es8, 0));
        }
    }

    public void D(int i, nz8 nz8) {
        Pair Y = Y(i, nz8);
        if (Y != null) {
            ((k7f) ((iw6) ((j09) this.b).k)).d(new c09(this, Y, 3));
        }
    }

    public void E(int i, nz8 nz8) {
        Pair Y = Y(i, nz8);
        if (Y != null) {
            ((k7f) ((iw6) ((j09) this.b).k)).d(new c09(this, Y, 1));
        }
    }

    public void F(int i, nz8 nz8) {
        Pair Y = Y(i, nz8);
        if (Y != null) {
            ((k7f) ((iw6) ((j09) this.b).k)).d(new c09(this, Y, 2));
        }
    }

    public void G(int i, nz8 nz8, es8 es8) {
        Pair Y = Y(i, nz8);
        if (Y != null) {
            ((k7f) ((iw6) ((j09) this.b).k)).d(new b09(this, Y, es8, 1));
        }
    }

    public Size[] H(Size[] sizeArr, int i) {
        List list;
        ArrayList arrayList;
        int i2 = i;
        ArrayList arrayList2 = new ArrayList(Arrays.asList(sizeArr));
        if (((ExtraSupportedOutputSizeQuirk) this.a) != null) {
            Size[] sizeArr2 = (i2 != 34 || !"motorola".equalsIgnoreCase(Build.BRAND) || !"moto e5 play".equalsIgnoreCase(Build.MODEL)) ? new Size[0] : new Size[]{new Size(1440, 1080), new Size(960, 720)};
            if (sizeArr2.length > 0) {
                arrayList2.addAll(Arrays.asList(sizeArr2));
            }
        }
        dr4 dr4 = (dr4) this.b;
        dr4.getClass();
        if (((ExcludedSupportedSizesQuirk) qn4.a.g(ExcludedSupportedSizesQuirk.class)) == null) {
            list = new ArrayList();
        } else {
            String str = dr4.a;
            String str2 = Build.BRAND;
            if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
                arrayList = new ArrayList();
                if (str.equals("0") && i2 == 256) {
                    arrayList.add(new Size(4160, 3120));
                    arrayList.add(new Size(4000, 3000));
                }
            } else if (!"OnePlus".equalsIgnoreCase(str2) || !"OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
                if ("HUAWEI".equalsIgnoreCase(str2) && "HWANE".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList = new ArrayList();
                    if (str.equals("0") && (i2 == 34 || i2 == 35)) {
                        arrayList.add(new Size(720, 720));
                        arrayList.add(new Size(HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_BAD_REQUEST));
                    }
                } else {
                    if ("SAMSUNG".equalsIgnoreCase(str2) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE)) {
                        arrayList = new ArrayList();
                        if (str.equals("0")) {
                            if (i2 == 34) {
                                arrayList.add(new Size(4128, 3096));
                                arrayList.add(new Size(4128, 2322));
                                arrayList.add(new Size(3088, 3088));
                                arrayList.add(new Size(3264, 2448));
                                arrayList.add(new Size(3264, 1836));
                                arrayList.add(new Size(2048, 1536));
                                arrayList.add(new Size(2048, 1152));
                                arrayList.add(new Size(1920, 1080));
                            } else if (i2 == 35) {
                                arrayList.add(new Size(4128, 2322));
                                arrayList.add(new Size(3088, 3088));
                                arrayList.add(new Size(3264, 2448));
                                arrayList.add(new Size(3264, 1836));
                                arrayList.add(new Size(2048, 1536));
                                arrayList.add(new Size(2048, 1152));
                                arrayList.add(new Size(1920, 1080));
                            }
                        } else if (str.equals("1") && (i2 == 34 || i2 == 35)) {
                            arrayList.add(new Size(3264, 2448));
                            arrayList.add(new Size(3264, 1836));
                            arrayList.add(new Size(2448, 2448));
                            arrayList.add(new Size(1920, 1920));
                            arrayList.add(new Size(2048, 1536));
                            arrayList.add(new Size(2048, 1152));
                            arrayList.add(new Size(1920, 1080));
                        }
                    } else if ("SAMSUNG".equalsIgnoreCase(str2) && "J7XELTE".equalsIgnoreCase(Build.DEVICE)) {
                        arrayList = new ArrayList();
                        if (str.equals("0")) {
                            if (i2 == 34) {
                                arrayList.add(new Size(4128, 3096));
                                arrayList.add(new Size(4128, 2322));
                                arrayList.add(new Size(3088, 3088));
                                arrayList.add(new Size(3264, 2448));
                                arrayList.add(new Size(3264, 1836));
                                arrayList.add(new Size(2048, 1536));
                                arrayList.add(new Size(2048, 1152));
                                arrayList.add(new Size(1920, 1080));
                            } else if (i2 == 35) {
                                arrayList.add(new Size(2048, 1536));
                                arrayList.add(new Size(2048, 1152));
                                arrayList.add(new Size(1920, 1080));
                            }
                        } else if (str.equals("1") && (i2 == 34 || i2 == 35)) {
                            arrayList.add(new Size(2576, 1932));
                            arrayList.add(new Size(2560, 1440));
                            arrayList.add(new Size(1920, 1920));
                            arrayList.add(new Size(2048, 1536));
                            arrayList.add(new Size(2048, 1152));
                            arrayList.add(new Size(1920, 1080));
                        }
                    } else if (!"REDMI".equalsIgnoreCase(str2) || !"joyeuse".equalsIgnoreCase(Build.DEVICE)) {
                        list = Collections.emptyList();
                    } else {
                        arrayList = new ArrayList();
                        if (str.equals("0") && i2 == 256) {
                            arrayList.add(new Size(9280, 6944));
                        }
                    }
                }
            } else {
                arrayList = new ArrayList();
                if (str.equals("0") && i2 == 256) {
                    arrayList.add(new Size(4160, 3120));
                    arrayList.add(new Size(4000, 3000));
                }
            }
            list = arrayList;
        }
        if (!list.isEmpty()) {
            arrayList2.removeAll(list);
        }
        arrayList2.isEmpty();
        return (Size[]) arrayList2.toArray(new Size[0]);
    }

    public void I(xf5 xf5, qtf qtf) {
        int i = 0;
        while (true) {
            zpf[] zpfArr = (zpf[]) this.b;
            if (i < zpfArr.length) {
                qtf.a();
                qtf.b();
                zpf B = xf5.B(qtf.e, 3);
                ea6 ea6 = (ea6) ((List) this.a).get(i);
                String str = ea6.n;
                n79.f("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
                String str2 = ea6.a;
                if (str2 == null) {
                    qtf.b();
                    str2 = qtf.f;
                }
                ba6 ba6 = new ba6();
                ba6.a = str2;
                ba6.m = vq9.l(str);
                ba6.e = ea6.e;
                ba6.d = ea6.d;
                ba6.F = ea6.G;
                ba6.p = ea6.q;
                B.e(new ea6(ba6));
                zpfArr[i] = B;
                i++;
            } else {
                return;
            }
        }
    }

    public void J(z94 z94) {
        synchronized (z94) {
        }
        Handler handler = (Handler) this.a;
        if (handler != null) {
            handler.post(new g70(this, z94, 1));
        }
    }

    public void K(boolean z) {
        a aVar = ((c) this.a).y;
        if (aVar != null) {
            aVar.Q1().o.K(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            tc6 tc6 = (tc6) it.next();
            if (!z || tc6.b) {
                tc6.a.getClass();
            }
        }
    }

    public void L(boolean z) {
        c cVar = (c) this.a;
        Context context = cVar.w.w0;
        a aVar = cVar.y;
        if (aVar != null) {
            aVar.Q1().o.L(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            tc6 tc6 = (tc6) it.next();
            if (!z || tc6.b) {
                tc6.a.getClass();
            }
        }
    }

    public void M(boolean z) {
        a aVar = ((c) this.a).y;
        if (aVar != null) {
            aVar.Q1().o.M(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            tc6 tc6 = (tc6) it.next();
            if (!z || tc6.b) {
                tc6.a.getClass();
            }
        }
    }

    public void N(boolean z) {
        a aVar = ((c) this.a).y;
        if (aVar != null) {
            aVar.Q1().o.N(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            tc6 tc6 = (tc6) it.next();
            if (!z || tc6.b) {
                tc6.a.getClass();
            }
        }
    }

    public void O(boolean z) {
        a aVar = ((c) this.a).y;
        if (aVar != null) {
            aVar.Q1().o.O(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            tc6 tc6 = (tc6) it.next();
            if (!z || tc6.b) {
                tc6.a.getClass();
            }
        }
    }

    public void P(boolean z) {
        a aVar = ((c) this.a).y;
        if (aVar != null) {
            aVar.Q1().o.P(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            tc6 tc6 = (tc6) it.next();
            if (!z || tc6.b) {
                tc6.a.getClass();
            }
        }
    }

    public void Q(boolean z) {
        c cVar = (c) this.a;
        Context context = cVar.w.w0;
        a aVar = cVar.y;
        if (aVar != null) {
            aVar.Q1().o.Q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            tc6 tc6 = (tc6) it.next();
            if (!z || tc6.b) {
                tc6.a.getClass();
            }
        }
    }

    public void R(boolean z) {
        a aVar = ((c) this.a).y;
        if (aVar != null) {
            aVar.Q1().o.R(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            tc6 tc6 = (tc6) it.next();
            if (!z || tc6.b) {
                tc6.a.getClass();
            }
        }
    }

    public void S(boolean z) {
        a aVar = ((c) this.a).y;
        if (aVar != null) {
            aVar.Q1().o.S(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            tc6 tc6 = (tc6) it.next();
            if (!z || tc6.b) {
                tc6.a.getClass();
            }
        }
    }

    public void T(boolean z) {
        a aVar = ((c) this.a).y;
        if (aVar != null) {
            aVar.Q1().o.T(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            tc6 tc6 = (tc6) it.next();
            if (!z || tc6.b) {
                tc6.a.getClass();
            }
        }
    }

    public void U(boolean z) {
        a aVar = ((c) this.a).y;
        if (aVar != null) {
            aVar.Q1().o.U(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            tc6 tc6 = (tc6) it.next();
            if (!z || tc6.b) {
                tc6.a.getClass();
            }
        }
    }

    public void V(boolean z) {
        a aVar = ((c) this.a).y;
        if (aVar != null) {
            aVar.Q1().o.V(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            tc6 tc6 = (tc6) it.next();
            if (!z || tc6.b) {
                tc6.a.getClass();
            }
        }
    }

    public void W(a aVar, View view, boolean z) {
        a aVar2 = ((c) this.a).y;
        if (aVar2 != null) {
            aVar2.Q1().o.W(aVar, view, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            tc6 tc6 = (tc6) it.next();
            if (!z || tc6.b) {
                g6d g6d = tc6.a;
                c cVar = (c) this.a;
                if (aVar == ((a) g6d.b)) {
                    wsb wsb = cVar.o;
                    synchronized (((CopyOnWriteArrayList) wsb.b)) {
                        try {
                            int size = ((CopyOnWriteArrayList) wsb.b).size();
                            int i = 0;
                            while (true) {
                                if (i >= size) {
                                    break;
                                } else if (((tc6) ((CopyOnWriteArrayList) wsb.b).get(i)).a == g6d) {
                                    ((CopyOnWriteArrayList) wsb.b).remove(i);
                                    break;
                                } else {
                                    i++;
                                }
                            }
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    ((it8) g6d.o).getClass();
                    it8.E(view, (FrameLayout) g6d.c);
                }
            }
        }
    }

    public void X(boolean z) {
        a aVar = ((c) this.a).y;
        if (aVar != null) {
            aVar.Q1().o.X(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            tc6 tc6 = (tc6) it.next();
            if (!z || tc6.b) {
                tc6.a.getClass();
            }
        }
    }

    public Pair Y(int i, nz8 nz8) {
        nz8 nz82;
        h09 h09 = (h09) this.a;
        nz8 nz83 = null;
        if (nz8 != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= h09.c.size()) {
                    nz82 = null;
                    break;
                } else if (((nz8) h09.c.get(i2)).d == nz8.d) {
                    Object obj = h09.b;
                    int i3 = cqb.n;
                    nz82 = nz8.a(Pair.create(obj, nz8.a));
                    break;
                } else {
                    i2++;
                }
            }
            if (nz82 == null) {
                return null;
            }
            nz83 = nz82;
        }
        return Pair.create(Integer.valueOf(i + h09.d), nz83);
    }

    public Long Z(String str) {
        d7d a2 = d7d.a(1, "SELECT long_value FROM Preference where `key`=?");
        a2.h(1, str);
        i6d i6d = (i6d) this.a;
        i6d.b();
        Long l = null;
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            if (o.moveToFirst()) {
                if (!o.isNull(0)) {
                    l = Long.valueOf(o.getLong(0));
                }
            }
            return l;
        } finally {
            o.close();
            a2.o();
        }
    }

    public void a(Object obj) {
        Void voidR = (Void) obj;
        ((k9f) this.b).b.A();
    }

    public p3a a0() {
        bvg bvg;
        try {
            if (((p3a) this.b) == null) {
                o3h o3h = (o3h) this.a;
                Parcel R = o3h.R(o3h.H0(), 25);
                IBinder readStrongBinder = R.readStrongBinder();
                if (readStrongBinder == null) {
                    bvg = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    bvg = queryLocalInterface instanceof uzg ? (uzg) queryLocalInterface : new bvg(readStrongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", 3);
                }
                R.recycle();
                this.b = new p3a((Object) bvg);
            }
            return (p3a) this.b;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void b(int i, nz8 nz8, l28 l28, es8 es8, IOException iOException, boolean z) {
        Pair Y = Y(i, nz8);
        if (Y != null) {
            ((k7f) ((iw6) ((j09) this.b).k)).d(new dl4(this, Y, l28, es8, iOException, z, 3));
        }
    }

    public void b0(vsb vsb) {
        i6d i6d = (i6d) this.a;
        i6d.b();
        i6d.c();
        try {
            ((li) this.b).c0(vsb);
            i6d.r();
        } finally {
            i6d.l();
        }
    }

    public void c(reb reb) {
        ((ConcurrentHashMap) this.a).put(((pd8) this.b).e(reb), reb);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0223, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a8, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a9, code lost:
        if (r5 == false) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ab, code lost:
        if (r5 == true) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ad, code lost:
        if (r5 == true) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00af, code lost:
        if (r5 == true) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b3, code lost:
        r0.c.put(java.lang.Integer.valueOf(r7.a), r7);
        r7 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c0(android.content.Context r12, android.content.res.XmlResourceParser r13) {
        /*
            r11 = this;
            pj3 r0 = new pj3
            r0.<init>()
            int r1 = r13.getAttributeCount()
            r2 = 0
            r3 = r2
        L_0x000b:
            if (r3 >= r1) goto L_0x023c
            java.lang.String r4 = r13.getAttributeName(r3)
            java.lang.String r5 = r13.getAttributeValue(r3)
            if (r4 == 0) goto L_0x0238
            if (r5 != 0) goto L_0x001b
            goto L_0x0238
        L_0x001b:
            java.lang.String r6 = "id"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x0238
            java.lang.String r1 = "/"
            boolean r1 = r5.contains(r1)
            r3 = 1
            r4 = -1
            if (r1 == 0) goto L_0x0045
            r1 = 47
            int r1 = r5.indexOf(r1)
            int r1 = r1 + r3
            java.lang.String r1 = r5.substring(r1)
            android.content.res.Resources r7 = r12.getResources()
            java.lang.String r8 = r12.getPackageName()
            int r1 = r7.getIdentifier(r1, r6, r8)
            goto L_0x0046
        L_0x0045:
            r1 = r4
        L_0x0046:
            if (r1 != r4) goto L_0x0056
            int r6 = r5.length()
            if (r6 <= r3) goto L_0x0056
            java.lang.String r1 = r5.substring(r3)
            int r1 = java.lang.Integer.parseInt(r1)
        L_0x0056:
            int r5 = r13.getEventType()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r6 = 0
            r7 = r6
        L_0x005c:
            if (r5 == r3) goto L_0x0230
            if (r5 == 0) goto L_0x0220
            r8 = 3
            r9 = 2
            if (r5 == r9) goto L_0x00c1
            if (r5 == r8) goto L_0x0068
            goto L_0x0223
        L_0x0068:
            java.lang.String r5 = r13.getName()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.util.Locale r10 = java.util.Locale.ROOT     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.String r5 = r5.toLowerCase(r10)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            int r10 = r5.hashCode()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            switch(r10) {
                case -2075718416: goto L_0x009e;
                case -190376483: goto L_0x0094;
                case 426575017: goto L_0x008a;
                case 2146106725: goto L_0x007a;
                default: goto L_0x0079;
            }     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
        L_0x0079:
            goto L_0x00a8
        L_0x007a:
            java.lang.String r10 = "constraintset"
            boolean r5 = r5.equals(r10)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x00a8
            r5 = r2
            goto L_0x00a9
        L_0x0084:
            r12 = move-exception
            goto L_0x0229
        L_0x0087:
            r12 = move-exception
            goto L_0x022d
        L_0x008a:
            java.lang.String r10 = "constraintoverride"
            boolean r5 = r5.equals(r10)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x00a8
            r5 = r9
            goto L_0x00a9
        L_0x0094:
            java.lang.String r10 = "constraint"
            boolean r5 = r5.equals(r10)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x00a8
            r5 = r3
            goto L_0x00a9
        L_0x009e:
            java.lang.String r10 = "guideline"
            boolean r5 = r5.equals(r10)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x00a8
            r5 = r8
            goto L_0x00a9
        L_0x00a8:
            r5 = r4
        L_0x00a9:
            if (r5 == 0) goto L_0x0230
            if (r5 == r3) goto L_0x00b3
            if (r5 == r9) goto L_0x00b3
            if (r5 == r8) goto L_0x00b3
            goto L_0x0223
        L_0x00b3:
            java.util.HashMap r5 = r0.c     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            int r8 = r7.a     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r5.put(r8, r7)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r7 = r6
            goto L_0x0223
        L_0x00c1:
            java.lang.String r5 = r13.getName()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            int r10 = r5.hashCode()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            switch(r10) {
                case -2025855158: goto L_0x012a;
                case -1984451626: goto L_0x0120;
                case -1962203927: goto L_0x0116;
                case -1269513683: goto L_0x010c;
                case -1238332596: goto L_0x0102;
                case -71750448: goto L_0x00f8;
                case 366511058: goto L_0x00ed;
                case 1331510167: goto L_0x00e4;
                case 1791837707: goto L_0x00d9;
                case 1803088381: goto L_0x00ce;
                default: goto L_0x00cc;
            }     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
        L_0x00cc:
            goto L_0x0134
        L_0x00ce:
            java.lang.String r8 = "Constraint"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x0134
            r8 = r2
            goto L_0x0135
        L_0x00d9:
            java.lang.String r8 = "CustomAttribute"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x0134
            r8 = 8
            goto L_0x0135
        L_0x00e4:
            java.lang.String r9 = "Barrier"
            boolean r5 = r5.equals(r9)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x0134
            goto L_0x0135
        L_0x00ed:
            java.lang.String r8 = "CustomMethod"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x0134
            r8 = 9
            goto L_0x0135
        L_0x00f8:
            java.lang.String r8 = "Guideline"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x0134
            r8 = r9
            goto L_0x0135
        L_0x0102:
            java.lang.String r8 = "Transform"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x0134
            r8 = 5
            goto L_0x0135
        L_0x010c:
            java.lang.String r8 = "PropertySet"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x0134
            r8 = 4
            goto L_0x0135
        L_0x0116:
            java.lang.String r8 = "ConstraintOverride"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x0134
            r8 = r3
            goto L_0x0135
        L_0x0120:
            java.lang.String r8 = "Motion"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x0134
            r8 = 7
            goto L_0x0135
        L_0x012a:
            java.lang.String r8 = "Layout"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x0134
            r8 = 6
            goto L_0x0135
        L_0x0134:
            r8 = r4
        L_0x0135:
            java.lang.String r5 = "XML parser error must be within a Constraint "
            switch(r8) {
                case 0: goto L_0x0217;
                case 1: goto L_0x020e;
                case 2: goto L_0x0201;
                case 3: goto L_0x01f4;
                case 4: goto L_0x01cf;
                case 5: goto L_0x01aa;
                case 6: goto L_0x0184;
                case 7: goto L_0x015e;
                case 8: goto L_0x013c;
                case 9: goto L_0x013c;
                default: goto L_0x013a;
            }
        L_0x013a:
            goto L_0x0223
        L_0x013c:
            if (r7 == 0) goto L_0x0145
            java.util.HashMap r5 = r7.f     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            defpackage.bj3.a(r12, r13, r5)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            goto L_0x0223
        L_0x0145:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.String r13 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            throw r12     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
        L_0x015e:
            if (r7 == 0) goto L_0x016b
            mj3 r5 = r7.c     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r5.a(r12, r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            goto L_0x0223
        L_0x016b:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.String r13 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            throw r12     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
        L_0x0184:
            if (r7 == 0) goto L_0x0191
            lj3 r5 = r7.d     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r5.a(r12, r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            goto L_0x0223
        L_0x0191:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.String r13 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            throw r12     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
        L_0x01aa:
            if (r7 == 0) goto L_0x01b6
            oj3 r5 = r7.e     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r5.a(r12, r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            goto L_0x0223
        L_0x01b6:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.String r13 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            throw r12     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
        L_0x01cf:
            if (r7 == 0) goto L_0x01db
            nj3 r5 = r7.b     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r5.a(r12, r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            goto L_0x0223
        L_0x01db:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.String r13 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            throw r12     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
        L_0x01f4:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            kj3 r7 = defpackage.pj3.i(r12, r5, r2)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            lj3 r5 = r7.d     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r5.h0 = r3     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            goto L_0x0223
        L_0x0201:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            kj3 r7 = defpackage.pj3.i(r12, r5, r2)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            lj3 r5 = r7.d     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r5.a = r3     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            goto L_0x0223
        L_0x020e:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            kj3 r7 = defpackage.pj3.i(r12, r5, r3)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            goto L_0x0223
        L_0x0217:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            kj3 r7 = defpackage.pj3.i(r12, r5, r2)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            goto L_0x0223
        L_0x0220:
            r13.getName()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
        L_0x0223:
            int r5 = r13.next()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            goto L_0x005c
        L_0x0229:
            r12.printStackTrace()
            goto L_0x0230
        L_0x022d:
            r12.printStackTrace()
        L_0x0230:
            java.lang.Object r11 = r11.b
            android.util.SparseArray r11 = (android.util.SparseArray) r11
            r11.put(r1, r0)
            goto L_0x023c
        L_0x0238:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x023c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsb.c0(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public int d(long j) {
        long[] jArr = (long[]) this.b;
        int b2 = t0g.b(jArr, j, false);
        if (b2 < jArr.length) {
            return b2;
        }
        return -1;
    }

    public void d0() {
        while (true) {
            ArrayDeque arrayDeque = (ArrayDeque) this.b;
            if (!arrayDeque.isEmpty()) {
                ftf ftf = (ftf) arrayDeque.removeLast();
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.a;
                spannableStringBuilder.setSpan(ftf.b, ftf.a, spannableStringBuilder.length(), 17);
            } else {
                return;
            }
        }
    }

    public void dispose() {
        SparseArray sparseArray = (SparseArray) ((p3a) this.b).a;
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            List list = (List) sparseArray.valueAt(size);
            if (list.remove((b6a) this.a) && list.isEmpty()) {
                sparseArray.removeAt(size);
            }
        }
    }

    public void e() {
        byte[] bArr = v0g.f;
        l8b l8b = (l8b) this.b;
        l8b.getClass();
        l8b.E(bArr.length, bArr);
    }

    public void e0(cv0 cv0) {
        ((ArrayDeque) this.b).addLast(new ftf(((SpannableStringBuilder) this.a).length(), cv0));
    }

    public n8b f() {
        return new zqd(12, ((p17) this.a).f(), (List) this.b);
    }

    public void f0(be8 be8) {
        try {
            o3h o3h = (o3h) this.a;
            Parcel H0 = o3h.H0();
            hzg.b(H0, be8);
            Parcel R = o3h.R(H0, 91);
            R.readInt();
            R.recycle();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.camera.core.ImageCaptureException, java.lang.Exception] */
    public void g(Throwable th) {
        zqd zqd = (zqd) this.a;
        if (!((k3d) zqd.c).g) {
            int a2 = ((bx1) ((List) zqd.b).get(0)).a();
            boolean z = th instanceof ImageCaptureException;
            k9f k9f = (k9f) this.b;
            if (z) {
                zc4 zc4 = k9f.c;
                qc0 qc0 = new qc0(a2, (ImageCaptureException) th);
                zc4.getClass();
                ev0.g();
                ((ja0) zc4.v).k.accept(qc0);
            } else {
                zc4 zc42 = k9f.c;
                qc0 qc02 = new qc0(a2, new Exception("Failed to submit capture request", th));
                zc42.getClass();
                ev0.g();
                ((ja0) zc42.v).k.accept(qc02);
            }
            k9f.b.A();
        }
    }

    public void g0(td8 td8) {
        o3h o3h = (o3h) this.a;
        if (td8 == null) {
            try {
                Parcel H0 = o3h.H0();
                hzg.c(H0, (IInterface) null);
                o3h.I0(H0, 28);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else {
            zwg zwg = new zwg(td8);
            Parcel H02 = o3h.H0();
            hzg.c(H02, zwg);
            o3h.I0(H02, 28);
        }
    }

    public EGLContext h(EGLDisplay eGLDisplay, int i, int[] iArr) {
        if (((EGLContext) this.b) == null) {
            this.b = ((npg) this.a).h(eGLDisplay, i, iArr);
        }
        return (EGLContext) this.b;
    }

    public void h0(lc5 lc5) {
        o3h o3h = (o3h) this.a;
        if (lc5 == null) {
            try {
                Parcel H0 = o3h.H0();
                hzg.c(H0, (IInterface) null);
                o3h.I0(H0, 30);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else {
            zwg zwg = new zwg(lc5);
            Parcel H02 = o3h.H0();
            hzg.c(H02, zwg);
            o3h.I0(H02, 30);
        }
    }

    public void i() {
        ViewParent parent = ((OneMeContactsChipGroup) this.b).getParent();
        ScrollView scrollView = parent instanceof ScrollView ? (ScrollView) parent : null;
        if (scrollView != null) {
            scrollView.post(new b(1, (Object) scrollView));
        }
    }

    public boolean j(UnsatisfiedLinkError unsatisfiedLinkError, nfe[] nfeArr) {
        String str = ((Context) this.a).getApplicationInfo().sourceDir;
        if (new File(str).exists()) {
            return false;
        }
        StringBuilder p = tr1.p("Base apk does not exist: ", str, ". ");
        ((ni0) this.b).N(p);
        throw new RuntimeException(p.toString(), unsatisfiedLinkError);
    }

    public long k(int i) {
        boolean z = false;
        y64.g(i >= 0);
        long[] jArr = (long[]) this.b;
        if (i < jArr.length) {
            z = true;
        }
        y64.g(z);
        return jArr[i];
    }

    public int l(int i) {
        return i;
    }

    public EGLSurface m(EGLDisplay eGLDisplay, Object obj, int i, boolean z) {
        return ((npg) this.a).m(eGLDisplay, obj, i, z);
    }

    public int n(int i) {
        p3a p3a = (p3a) this.b;
        List list = (List) ((SparseArray) p3a.a).get(i);
        if (list == null) {
            list = new ArrayList();
            ((SparseArray) p3a.a).put(i, list);
        }
        b6a b6a = (b6a) this.a;
        if (!list.contains(b6a)) {
            list.add(b6a);
        }
        return i;
    }

    public nn0 o(hf4 hf4, long j) {
        int f;
        nn0 nn0;
        hf4 hf42 = hf4;
        long j2 = hf42.o;
        int min = (int) Math.min(20000, hf42.c - j2);
        l8b l8b = (l8b) this.b;
        l8b.D(min);
        hf42.q(l8b.a, 0, min, false);
        int i = -1;
        int i2 = -1;
        long j3 = -9223372036854775807L;
        while (l8b.a() >= 4) {
            if (oq5.f(l8b.b, l8b.a) != 442) {
                l8b.H(1);
            } else {
                l8b.H(4);
                long e = u9c.e(l8b);
                if (e != -9223372036854775807L) {
                    long b2 = ((rkf) this.a).b(e);
                    if (b2 > j) {
                        if (j3 == -9223372036854775807L) {
                            return new nn0(-1, b2, j2);
                        }
                        nn0 = new nn0(0, -9223372036854775807L, j2 + ((long) i2));
                    } else if (100000 + b2 > j) {
                        nn0 = new nn0(0, -9223372036854775807L, j2 + ((long) l8b.b));
                    } else {
                        i2 = l8b.b;
                        j3 = b2;
                    }
                    return nn0;
                }
                int i3 = l8b.c;
                if (l8b.a() >= 10) {
                    l8b.H(9);
                    int u = l8b.u() & 7;
                    if (l8b.a() >= u) {
                        l8b.H(u);
                        if (l8b.a() >= 4) {
                            if (oq5.f(l8b.b, l8b.a) == 443) {
                                l8b.H(4);
                                int A = l8b.A();
                                if (l8b.a() < A) {
                                    l8b.G(i3);
                                } else {
                                    l8b.H(A);
                                }
                            }
                            while (true) {
                                if (l8b.a() < 4 || (f = oq5.f(l8b.b, l8b.a)) == 442 || f == 441 || (f >>> 8) != 1) {
                                    break;
                                }
                                l8b.H(4);
                                if (l8b.a() < 2) {
                                    l8b.G(i3);
                                    break;
                                }
                                l8b.G(Math.min(l8b.c, l8b.b + l8b.A()));
                            }
                        } else {
                            l8b.G(i3);
                        }
                    } else {
                        l8b.G(i3);
                    }
                } else {
                    l8b.G(i3);
                }
                i = l8b.b;
            }
        }
        return j3 != -9223372036854775807L ? new nn0(-2, j3, j2 + ((long) i)) : nn0.e;
    }

    public void onCameraSwitchDone(boolean z) {
        mt1 mt1 = (mt1) this.b;
        String str = (String) this.a;
        voc voc = mt1.e;
        voc.log("CameraCapturerAdapter", "onCameraSwitchDone, new camera: " + str + ", is front: " + z);
        synchronized (mt1.g) {
            mt1.h = str;
            mt1.i = z;
            mt1.j = false;
        }
        Iterator it = mt1.f.iterator();
        while (it.hasNext()) {
            ((v48) it.next()).i(mt1, true);
        }
    }

    public void onCameraSwitchError(String str) {
        mt1 mt1 = (mt1) this.b;
        mt1.e.reportException("CameraCapturerAdapter", "Error on camera switch", new IllegalStateException(a81.m("onCameraSwitchError, ", str)));
        synchronized (mt1.g) {
            mt1.j = false;
        }
        Iterator it = mt1.f.iterator();
        while (it.hasNext()) {
            ((v48) it.next()).i(mt1, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r2 = ((defpackage.m44[]) r2.a)[r3];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List p(long r3) {
        /*
            r2 = this;
            r0 = 0
            java.lang.Object r1 = r2.b
            long[] r1 = (long[]) r1
            int r3 = defpackage.t0g.f(r1, r3, r0)
            r4 = -1
            if (r3 == r4) goto L_0x001c
            java.lang.Object r2 = r2.a
            m44[] r2 = (defpackage.m44[]) r2
            r2 = r2[r3]
            m44 r3 = defpackage.m44.A0
            if (r2 != r3) goto L_0x0017
            goto L_0x001c
        L_0x0017:
            java.util.List r2 = java.util.Collections.singletonList(r2)
            return r2
        L_0x001c:
            java.util.List r2 = java.util.Collections.emptyList()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsb.p(long):java.util.List");
    }

    public gs6 q(int i, int i2, int i3) {
        return ((npg) this.a).q(i, i2, i3);
    }

    public EGLSurface r(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        ((npg) this.a).getClass();
        return ld8.s(eGLContext, eGLDisplay);
    }

    public void s(int i, nz8 nz8, l28 l28, es8 es8) {
        Pair Y = Y(i, nz8);
        if (Y != null) {
            ((k7f) ((iw6) ((j09) this.b).k)).d(new d09(this, Y, l28, es8, 0));
        }
    }

    public int t() {
        return ((long[]) this.b).length;
    }

    public void u(int i, nz8 nz8, Exception exc) {
        Pair Y = Y(i, nz8);
        if (Y != null) {
            ((k7f) ((iw6) ((j09) this.b).k)).d(new x55((Object) this, (Object) Y, (Object) exc, 21));
        }
    }

    public void v(int i, nz8 nz8, l28 l28, es8 es8) {
        Pair Y = Y(i, nz8);
        if (Y != null) {
            ((k7f) ((iw6) ((j09) this.b).k)).d(new d09(this, Y, l28, es8, 2));
        }
    }

    public n8b w(j17 j17, b17 b17) {
        return new zqd(12, ((p17) this.a).w(j17, b17), (List) this.b);
    }

    public void x(long j) {
        ((AbstractPickerScreen) this.a).l0().j(j, (ckb) null);
    }

    public void y(int i, nz8 nz8, int i2) {
        Pair Y = Y(i, nz8);
        if (Y != null) {
            ((k7f) ((iw6) ((j09) this.b).k)).d(new kh1((Object) this, (Object) Y, i2, 14));
        }
    }

    public void z(EGLDisplay eGLDisplay) {
    }

    public /* synthetic */ wsb(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ wsb(Object obj, Object obj2, boolean z) {
        this.b = obj;
        this.a = obj2;
    }

    public wsb(o3h o3h) {
        new HashMap();
        new HashMap();
        vzg.m(o3h);
        this.a = o3h;
    }

    public wsb(List list) {
        this.a = list;
        this.b = new zpf[list.size()];
    }

    public wsb(pd8 pd8) {
        this.a = new ConcurrentHashMap();
        this.b = pd8;
    }

    public wsb(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b59.V(edc.materialCalendarStyle, context, MaterialCalendar.class.getCanonicalName()).data, tnc.MaterialCalendar);
        o9a.h(obtainStyledAttributes.getResourceId(tnc.MaterialCalendar_dayStyle, 0), context);
        o9a.h(obtainStyledAttributes.getResourceId(tnc.MaterialCalendar_dayInvalidStyle, 0), context);
        o9a.h(obtainStyledAttributes.getResourceId(tnc.MaterialCalendar_daySelectedStyle, 0), context);
        o9a.h(obtainStyledAttributes.getResourceId(tnc.MaterialCalendar_dayTodayStyle, 0), context);
        ColorStateList C = m5a.C(context, obtainStyledAttributes, tnc.MaterialCalendar_rangeFillColor);
        this.a = o9a.h(obtainStyledAttributes.getResourceId(tnc.MaterialCalendar_yearStyle, 0), context);
        o9a.h(obtainStyledAttributes.getResourceId(tnc.MaterialCalendar_yearSelectedStyle, 0), context);
        this.b = o9a.h(obtainStyledAttributes.getResourceId(tnc.MaterialCalendar_yearTodayStyle, 0), context);
        new Paint().setColor(C.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}

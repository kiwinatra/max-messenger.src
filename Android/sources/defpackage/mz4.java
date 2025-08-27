package defpackage;

import android.graphics.Bitmap;
import android.media.MediaDrmException;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.tasks.Task;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: mz4  reason: default package */
public class mz4 implements m30, zi6, qk3, c43, wv9, qb5, mx3 {
    public static final mz4 a = new Object();
    public static final mz4 b = new Object();
    public static final mz4 c = new Object();
    public static final mz4 o = new Object();
    public static final mz4 v = new Object();
    public static final mz4 w = new Object();
    public static mz4 x;
    public static final /* synthetic */ mz4 y = new Object();

    public static final String b(ni0 ni0) {
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        int i = ni0.b;
        if (i >= 0) {
            int[] iArr2 = new int[Math.max(i, 8)];
            int i2 = 0;
            while (ni0.b != 0) {
                int D = ni0.D();
                int length = iArr2.length;
                if (i2 < length) {
                    iArr = iArr2;
                } else {
                    iArr = new int[(length * 2)];
                    System.arraycopy(iArr2, 0, iArr, 0, length);
                    iArr2 = iArr;
                }
                iArr2[i2] = D;
                i2++;
                iArr2 = iArr;
            }
            while (i2 != 0) {
                if (i2 != 0) {
                    i2--;
                    int i3 = iArr2[i2];
                    String str = "";
                    switch (i3) {
                        case 0:
                        case 2:
                            break;
                        case 1:
                            str = "=";
                            break;
                        case 3:
                        case 5:
                            str = "{";
                            break;
                        case 4:
                            str = "{:";
                            break;
                        case 6:
                        case 7:
                            str = "[";
                            break;
                        default:
                            throw new IllegalArgumentException(wj6.h(i3, str));
                    }
                    sb.append(str);
                    ni0.G(i3);
                } else {
                    throw new NoSuchElementException();
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException(wj6.h(i, "Illegal Capacity: "));
    }

    public static byte[] r(long j, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n44 n44 = (n44) it.next();
            Bundle b2 = n44.b();
            Bitmap bitmap = n44.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                n79.n(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                b2.putByteArray(n44.w, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(b2);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static int v(View view) {
        WeakHashMap weakHashMap = gag.a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return v(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    public static e2d w(String str) {
        e2d e2d;
        e2d[] values = e2d.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                e2d = null;
                break;
            }
            e2d = values[i];
            if (Intrinsics.areEqual((Object) e2d.a, (Object) str)) {
                break;
            }
            i++;
        }
        return e2d == null ? e2d.UNKNOWN : e2d;
    }

    public Map a(byte[] bArr) {
        throw new IllegalStateException();
    }

    public void accept(Object obj) {
        z68.f(h38.v0, "getSystemReadMarks: failed", (Throwable) obj);
    }

    public Object apply(Object obj) {
        return ((OneMeRoomDatabase) obj).I();
    }

    public ob5 c() {
        throw new IllegalStateException();
    }

    public f44 d(byte[] bArr) {
        throw new IllegalStateException();
    }

    public byte[] e() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    public boolean f(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    public void g(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    public void h(byte[] bArr) {
    }

    public byte[] i(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    public void j(byte[] bArr) {
        throw new IllegalStateException();
    }

    public mb5 k(byte[] bArr, List list, int i, HashMap hashMap) {
        throw new IllegalStateException();
    }

    public int l() {
        return 1;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, nl] */
    public Object m(pf9 pf9) {
        ? obj = new Object();
        obj.c = "";
        int e0 = ryg.e0(pf9);
        for (int i = 0; i < e0; i++) {
            String g0 = ryg.g0(pf9);
            g0.getClass();
            char c2 = 65535;
            switch (g0.hashCode()) {
                case -1724546052:
                    if (g0.equals("description")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (g0.equals("name")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 93925698:
                    if (g0.equals("botId")) {
                        c2 = 2;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    obj.c = ryg.g0(pf9);
                    break;
                case 1:
                    obj.b = ryg.g0(pf9);
                    break;
                case 2:
                    obj.a = ryg.d0(pf9, 0);
                    break;
                default:
                    pf9.A();
                    break;
            }
        }
        return new kq0(obj);
    }

    public /* synthetic */ Object n(Task task) {
        ox0 ox0 = swg.Z;
        return null;
    }

    public ibf p(pf9 pf9) {
        int i;
        String str;
        ArrayList arrayList;
        if (!pf9.m()) {
            return new xtb(CollectionsKt.emptyList());
        }
        try {
            i = ryg.e0(pf9);
        } catch (Throwable th) {
            z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = ytd.a.iterator();
            while (it.hasNext()) {
                ((xm) it.next()).a(th);
            }
            xtd.a.getClass();
            int ordinal = xtd.b.ordinal();
            if (ordinal == 0) {
                i = 0;
            } else if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th;
            }
        }
        if (i == 0) {
            return new xtb(CollectionsKt.emptyList());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            List list = null;
            try {
                str = ryg.g0(pf9);
            } catch (Throwable th2) {
                z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = ytd.a.iterator();
                while (it2.hasNext()) {
                    ((xm) it2.next()).a(th2);
                }
                xtd.a.getClass();
                int ordinal2 = xtd.b.ordinal();
                if (ordinal2 == 0) {
                    str = null;
                } else if (ordinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th2;
                }
            }
            if (str != null) {
                if (Intrinsics.areEqual((Object) str, (Object) "presetAvatars")) {
                    if (pf9.n().a() == 7) {
                        arrayList = new ArrayList();
                        int t0 = pf9.t0();
                        for (int i3 = 0; i3 < t0; i3++) {
                            arrayList.add(w7a.a(pf9));
                        }
                    } else {
                        pf9.A();
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        list = CollectionsKt.filterNotNull(arrayList);
                    }
                    if (list == null) {
                        list = CollectionsKt.emptyList();
                    }
                    arrayList2.addAll(list);
                } else {
                    Unit unit = Unit.INSTANCE;
                    try {
                        pf9.A();
                    } catch (Throwable th3) {
                        z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                        Iterator it3 = ytd.a.iterator();
                        while (it3.hasNext()) {
                            ((xm) it3.next()).a(th3);
                        }
                        xtd.a.getClass();
                        int ordinal3 = xtd.b.ordinal();
                        if (ordinal3 != 0) {
                            if (ordinal3 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th3;
                        }
                    }
                }
            }
        }
        return new xtb(arrayList2);
    }

    public void q(u6h u6h) {
    }

    public void release() {
    }

    public void s(jd8 jd8) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Event bus " + jd8 + " accessed from non-main thread " + Looper.myLooper());
        }
    }

    public boolean t() {
        return this instanceof qf8;
    }

    public void u(float f, float f2, float f3, s4e s4e) {
        s4e.c(f, c44.DEFAULT_ASPECT_RATIO);
    }
}

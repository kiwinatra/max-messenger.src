package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;

/* renamed from: edb  reason: default package */
public final class edb {
    public static final String[] d = {"android.permission.READ_CONTACTS", "android.permission.GET_ACCOUNTS"};
    public static final String[] e = {"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS", "android.permission.GET_ACCOUNTS"};
    public static final String[] f = {"android.permission.READ_CONTACTS"};
    public static final String[] g = {"android.permission.WRITE_CONTACTS"};
    public static final String[] h = {"android.permission.RECORD_AUDIO"};
    public static final String[] i = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.READ_PHONE_STATE"};
    public static final String[] j = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    public static final String[] k = {"android.permission.POST_NOTIFICATIONS"};
    public static final String[] l;
    public static final String[] m;
    public static final String[] n;
    public static final String[] o = {"android.permission.USE_FULL_SCREEN_INTENT"};
    public final Context a;
    public final g2g b;
    public final fj c;

    static {
        String[] strArr;
        String[] strArr2 = {"android.permission.CAMERA"};
        l = strArr2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            strArr = new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
        } else if (i2 >= 33) {
            strArr = new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"};
        } else {
            ggd.a.getClass();
            strArr = fgd.c;
        }
        m = strArr;
        n = (String[]) ArraysKt.plus((T[]) strArr, (T[]) strArr2);
    }

    public edb(Context context, g2g g2g) {
        this.a = context;
        this.b = g2g;
        this.c = new fj(context, 17);
    }

    public static boolean i(eng eng, String[] strArr) {
        for (String f2 : strArr) {
            if (eng.f(f2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [int] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void j(defpackage.eng r5, java.lang.String[] r6, int[] r7, int r8, int r9) {
        /*
            java.lang.Iterable r6 = kotlin.collections.ArraysKt.withIndex((T[]) r6)
            int r0 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r6, 10)
            int r0 = kotlin.collections.MapsKt.mapCapacity(r0)
            r1 = 16
            int r0 = kotlin.ranges.RangesKt.coerceAtLeast((int) r0, (int) r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            java.util.Iterator r6 = r6.iterator()
        L_0x001b:
            boolean r0 = r6.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x004b
            java.lang.Object r0 = r6.next()
            kotlin.collections.IndexedValue r0 = (kotlin.collections.IndexedValue) r0
            int r3 = r0.component1()
            java.lang.Object r0 = r0.component2()
            java.lang.String r0 = (java.lang.String) r0
            r3 = r7[r3]
            if (r3 != 0) goto L_0x0037
            r2 = 1
        L_0x0037:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            java.lang.Object r2 = r0.getFirst()
            java.lang.Object r0 = r0.getSecond()
            r1.put(r2, r0)
            goto L_0x001b
        L_0x004b:
            java.lang.String r6 = "android.permission.READ_MEDIA_VIDEO"
            java.lang.Object r7 = r1.get(r6)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r0)
            if (r7 == 0) goto L_0x0066
            java.lang.String r7 = "android.permission.READ_MEDIA_IMAGES"
            java.lang.Object r7 = r1.get(r7)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r0)
            if (r7 == 0) goto L_0x0066
            goto L_0x0092
        L_0x0066:
            java.lang.String r7 = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"
            java.lang.Object r7 = r1.get(r7)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r0)
            if (r7 == 0) goto L_0x0073
            goto L_0x0092
        L_0x0073:
            fgd r7 = defpackage.ggd.a
            r7.getClass()
            java.lang.String[] r7 = defpackage.fgd.c
            int r0 = r7.length
        L_0x007b:
            if (r2 >= r0) goto L_0x0092
            r3 = r7[r2]
            java.lang.Object r3 = r1.get(r6)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r3 != 0) goto L_0x008f
            r5.g(r8, r9)
            goto L_0x0092
        L_0x008f:
            int r2 = r2 + 1
            goto L_0x007b
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edb.j(eng, java.lang.String[], int[], int, int):void");
    }

    public static boolean k(eng eng, String[] strArr, int[] iArr, String[] strArr2, int i2, int i3) {
        for (String indexOf : strArr2) {
            int indexOf2 = ArraysKt.indexOf((T[]) strArr, indexOf);
            Integer valueOf = Integer.valueOf(indexOf2);
            if (indexOf2 < 0) {
                valueOf = null;
            }
            if (valueOf == null || iArr[valueOf.intValue()] != 0) {
                if (i(eng, strArr2)) {
                    z68.c("edb", "some permissions denied", new Object[0]);
                } else {
                    eng.g(i2, i3);
                    z68.c("edb", "some permissions denied forever", new Object[0]);
                }
                return false;
            }
        }
        z68.c("edb", "all permissions granted", new Object[0]);
        return true;
    }

    public final boolean a(boolean z, eng eng) {
        boolean z2 = true;
        if (!b(i)) {
            String[] strArr = h;
            if (z || !b(strArr)) {
                z2 = false;
                if (!z) {
                    f(eng, strArr, 178);
                } else {
                    f(eng, (String[]) ArraysKt.plus((T[]) strArr, (T[]) l), 178);
                }
            }
        }
        return z2;
    }

    public final boolean b(String[] strArr) {
        for (String d2 : strArr) {
            if (q8.d(this.a, d2) != 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean c() {
        if (!b(m)) {
            return Build.VERSION.SDK_INT >= 34 ? b(new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"}) : false;
        }
    }

    public final void d(eng eng, String[] strArr, int i2, int i3, int i4, int i5) {
        fj fjVar = this.c;
        fjVar.getClass();
        int length = strArr.length;
        boolean z = false;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                z = true;
                break;
            }
            if (!((SharedPreferences) ((Lazy) fjVar.c).getValue()).getBoolean(strArr[i6] + "_req", false)) {
                break;
            }
            i6++;
        }
        if ((!z) || i(eng, strArr)) {
            eng.c(strArr, i2, i4, i3, i5);
        } else {
            f(eng, strArr, i2);
        }
    }

    public final void e(eng eng) {
        d(eng, e, 156, bmc.permissions_contacts_request_rationale, bmc.permissions_contacts_request, bmc.permissions_dialog_enable_access);
    }

    public final void f(eng eng, String[] strArr, int i2) {
        eng.e(i2, strArr);
        SharedPreferences.Editor edit = ((SharedPreferences) ((Lazy) this.c.c).getValue()).edit();
        for (String str : strArr) {
            edit.putBoolean(str + "_req", true);
        }
        edit.apply();
    }

    public final void g(eng eng) {
        String[] strArr = l;
        int i2 = bmc.permissions_camera_request_photo;
        int i3 = aza.a;
        int i4 = aza.e;
        if (i(eng, strArr)) {
            eng.c(strArr, 158, i3, i2, i4);
        } else {
            f(eng, strArr, 158);
        }
    }

    public final void h(eng eng) {
        String[] strArr = l;
        int i2 = bmc.permissions_camera_request_video;
        int i3 = aza.a;
        int i4 = aza.e;
        if (i(eng, strArr)) {
            eng.c(strArr, 159, i3, i2, i4);
        } else {
            f(eng, strArr, 159);
        }
    }
}

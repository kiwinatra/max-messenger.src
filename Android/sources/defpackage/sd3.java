package defpackage;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import one.me.chats.picker.ActChatPickerCompat;
import org.apache.http.HttpHost;

/* renamed from: sd3  reason: default package */
public final class sd3 {
    public static final /* synthetic */ int j = 0;
    public final /* synthetic */ int a;
    public int b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public sd3(jb9 jb9, m5 m5Var, a aVar, int i2) {
        this.a = 2;
        this.e = jb9;
        z9f h2 = tr1.h((qra) ym.e());
        this.f = h2;
        this.c = m5Var;
        this.d = aVar;
        this.b = i2;
        this.g = new d6a(9, (Object) ((sjd) h2).c());
        this.i = ((qra) ym.e()).o();
    }

    public static int j(boolean z) {
        return z ? qad.q3 : qad.p3;
    }

    public boolean a(int i2, tyc tyc) {
        ArrayList arrayList = (ArrayList) this.d;
        if (i2 < 0 || i2 > arrayList.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + arrayList.size() + ". Given:" + i2);
        }
        if (this.b != 1) {
            bs0.m("All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS", tyc.b);
        } else {
            boolean z = tyc.b;
        }
        int m = m(tyc);
        if ((m == -1 ? null : (b6a) arrayList.get(m)) != null) {
            return false;
        }
        b6a b6a = new b6a(tyc, this, (ncg) this.f, ((pie) this.i).h());
        arrayList.add(i2, b6a);
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                tyc.r(recyclerView);
            }
        }
        if (b6a.e > 0) {
            ((rd3) this.e).o(e(b6a), b6a.e);
        }
        d();
        return true;
    }

    public void b(String str, String str2) {
        if (((ArrayList) this.d) == null) {
            this.d = new ArrayList();
        }
        ((ArrayList) this.d).add(sq6.q(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219));
        ((ArrayList) this.d).add(str2 != null ? sq6.q(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219) : null);
    }

    public m57 c() {
        ArrayList arrayList;
        String str = (String) this.e;
        if (str != null) {
            String B = sq6.B(0, (String) this.f, 0, 7, false);
            String B2 = sq6.B(0, (String) this.g, 0, 7, false);
            String str2 = (String) this.h;
            if (str2 != null) {
                int f2 = f();
                ArrayList arrayList2 = (ArrayList) this.c;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(sq6.B(0, (String) it.next(), 0, 7, false));
                }
                ArrayList<String> arrayList4 = (ArrayList) this.d;
                String str3 = null;
                if (arrayList4 != null) {
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
                    for (String str4 : arrayList4) {
                        arrayList.add(str4 != null ? sq6.B(0, str4, 0, 3, true) : null);
                    }
                } else {
                    arrayList = null;
                }
                String str5 = (String) this.i;
                if (str5 != null) {
                    str3 = sq6.B(0, str5, 0, 7, false);
                }
                return new m57(str, B, B2, str2, f2, arrayList3, arrayList, str3, toString());
            }
            throw new IllegalStateException("host == null");
        }
        throw new IllegalStateException("scheme == null");
    }

    public void d() {
        int i2;
        Iterator it = ((ArrayList) this.d).iterator();
        while (true) {
            if (!it.hasNext()) {
                i2 = 1;
                break;
            }
            b6a b6a = (b6a) it.next();
            int i3 = b6a.c.c;
            i2 = 3;
            if (i3 == 3 || (i3 == 2 && b6a.e == 0)) {
                break;
            }
        }
        rd3 rd3 = (rd3) this.e;
        if (i2 != rd3.c) {
            rd3.c = i2;
            rd3.a.g();
        }
    }

    public int e(b6a b6a) {
        b6a b6a2;
        Iterator it = ((ArrayList) this.d).iterator();
        int i2 = 0;
        while (it.hasNext() && (b6a2 = (b6a) it.next()) != b6a) {
            i2 += b6a2.e;
        }
        return i2;
    }

    public int f() {
        int i2;
        int i3 = this.b;
        if (i3 != -1) {
            return i3;
        }
        String str = (String) this.e;
        int hashCode = str.hashCode();
        if (hashCode != 3213448) {
            if (hashCode == 99617003 && str.equals("https")) {
                i2 = 443;
            }
            return -1;
        }
        if (str.equals(HttpHost.DEFAULT_SCHEME_NAME)) {
            i2 = 80;
        }
        return -1;
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r10 = defpackage.sq6.q(r10, 0, 0, " \"'<>#", true, false, true, false, 211);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(java.lang.String r10) {
        /*
            r9 = this;
            if (r10 == 0) goto L_0x0018
            r6 = 1
            r7 = 0
            r1 = 0
            r2 = 0
            java.lang.String r3 = " \"'<>#"
            r4 = 1
            r5 = 0
            r8 = 211(0xd3, float:2.96E-43)
            r0 = r10
            java.lang.String r10 = defpackage.sq6.q(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r10 == 0) goto L_0x0018
            java.util.ArrayList r10 = defpackage.sq6.C(r10)
            goto L_0x0019
        L_0x0018:
            r10 = 0
        L_0x0019:
            r9.d = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sd3.g(java.lang.String):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: w} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.w h(int r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.h
            w r0 = (defpackage.w) r0
            boolean r1 = r0.b
            if (r1 == 0) goto L_0x000e
            w r0 = new w
            r0.<init>()
            goto L_0x0011
        L_0x000e:
            r1 = 1
            r0.b = r1
        L_0x0011:
            java.lang.Object r4 = r4.d
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.util.Iterator r4 = r4.iterator()
            r1 = r5
        L_0x001a:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0031
            java.lang.Object r2 = r4.next()
            b6a r2 = (defpackage.b6a) r2
            int r3 = r2.e
            if (r3 <= r1) goto L_0x002f
            r0.c = r2
            r0.a = r1
            goto L_0x0031
        L_0x002f:
            int r1 = r1 - r3
            goto L_0x001a
        L_0x0031:
            java.lang.Object r4 = r0.c
            b6a r4 = (defpackage.b6a) r4
            if (r4 == 0) goto L_0x0038
            return r0
        L_0x0038:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot find wrapper for "
            java.lang.String r5 = defpackage.wj6.h(r5, r0)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sd3.h(int):w");
    }

    public void i(a89 a89, long j2) {
        a32 G = ((sjd) ((z9f) this.f)).g().G(a89.a.z);
        List<a89> singletonList = Collections.singletonList(a89);
        if (G == null) {
            z68.f("sd3", "Chat can't be null", (Throwable) null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("ru.ok.tamtam.extra.CHAT_ID", G.a);
        bundle.putLong("ru.ok.tamtam.extra.ATTACH_ID", j2);
        bundle.putBoolean("ru.ok.tamtam.extra.NOTIFY", true);
        ArrayList arrayList = new ArrayList(singletonList.size());
        for (a89 a892 : singletonList) {
            try {
                arrayList.add(Long.valueOf(a892.a.b));
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        bundle.putLongArray("ru.ok.tamtam.extra.DATA", cjf.i(arrayList));
        m5 m5Var = (m5) this.c;
        if (m5Var != null) {
            int i2 = u5.z0;
            int i3 = ActChatPickerCompat.y;
            m5Var.startActivityForResult(te8.z(m5Var, bundle, arrayList, G.a, j2), this.b);
            return;
        }
        a aVar = (a) this.d;
        if (aVar != null) {
            int i4 = u5.z0;
            int i5 = ActChatPickerCompat.y;
            b E2 = aVar.E2();
            aVar.S2(te8.z(E2, bundle, arrayList, G.a, j2), this.b, (Bundle) null);
            return;
        }
        z68.f("sd3", "forwardMessage failed: activity or fragment are null", (Throwable) null);
    }

    public b6a k(pzc pzc) {
        b6a b6a = (b6a) ((IdentityHashMap) this.g).get(pzc);
        if (b6a != null) {
            return b6a;
        }
        throw new IllegalStateException("Cannot find wrapper for " + pzc + ", seems like it is not bound by this adapter: " + this);
    }

    public void l(String str) {
        String O = o54.O(sq6.B(0, str, 0, 7, false));
        if (O != null) {
            this.h = O;
            return;
        }
        throw new IllegalArgumentException("unexpected host: ".concat(str));
    }

    public int m(tyc tyc) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((b6a) arrayList.get(i2)).c == tyc) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0242, code lost:
        if (65535 < r1) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0079, code lost:
        if (r6 == ':') goto L_0x007b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0209 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0211  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n(defpackage.m57 r26, java.lang.String r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r10 = r27
            r11 = 1
            byte[] r2 = defpackage.u0g.a
            int r2 = r27.length()
            r12 = 0
            int r2 = defpackage.u0g.m(r12, r2, r10)
            int r3 = r27.length()
            int r13 = defpackage.u0g.n(r2, r3, r10)
            int r3 = r13 - r2
            r4 = 2
            r14 = 58
            r15 = -1
            if (r3 >= r4) goto L_0x0024
        L_0x0022:
            r3 = r15
            goto L_0x007b
        L_0x0024:
            char r3 = r10.charAt(r2)
            r5 = 97
            int r6 = kotlin.jvm.internal.Intrinsics.compare((int) r3, (int) r5)
            r7 = 90
            r8 = 65
            r9 = 122(0x7a, float:1.71E-43)
            if (r6 < 0) goto L_0x003c
            int r6 = kotlin.jvm.internal.Intrinsics.compare((int) r3, (int) r9)
            if (r6 <= 0) goto L_0x0049
        L_0x003c:
            int r6 = kotlin.jvm.internal.Intrinsics.compare((int) r3, (int) r8)
            if (r6 < 0) goto L_0x0022
            int r3 = kotlin.jvm.internal.Intrinsics.compare((int) r3, (int) r7)
            if (r3 <= 0) goto L_0x0049
            goto L_0x0022
        L_0x0049:
            int r3 = r2 + 1
        L_0x004b:
            if (r3 >= r13) goto L_0x0022
            char r6 = r10.charAt(r3)
            if (r5 <= r6) goto L_0x0054
            goto L_0x0057
        L_0x0054:
            if (r9 < r6) goto L_0x0057
            goto L_0x0075
        L_0x0057:
            if (r8 <= r6) goto L_0x005a
            goto L_0x005d
        L_0x005a:
            if (r7 < r6) goto L_0x005d
            goto L_0x0075
        L_0x005d:
            r5 = 48
            if (r5 <= r6) goto L_0x0062
            goto L_0x0067
        L_0x0062:
            r5 = 57
            if (r5 < r6) goto L_0x0067
            goto L_0x0075
        L_0x0067:
            r5 = 43
            if (r6 != r5) goto L_0x006c
            goto L_0x0075
        L_0x006c:
            r5 = 45
            if (r6 != r5) goto L_0x0071
            goto L_0x0075
        L_0x0071:
            r5 = 46
            if (r6 != r5) goto L_0x0079
        L_0x0075:
            int r3 = r3 + r11
            r5 = 97
            goto L_0x004b
        L_0x0079:
            if (r6 != r14) goto L_0x0022
        L_0x007b:
            if (r3 == r15) goto L_0x00b8
            java.lang.String r5 = "https:"
            boolean r5 = kotlin.text.StringsKt__StringsJVMKt.startsWith(r10, r5, r2, true)
            if (r5 == 0) goto L_0x008c
            java.lang.String r3 = "https"
            r0.e = r3
            int r2 = r2 + 6
            goto L_0x00be
        L_0x008c:
            java.lang.String r5 = "http:"
            boolean r5 = kotlin.text.StringsKt__StringsJVMKt.startsWith(r10, r5, r2, true)
            if (r5 == 0) goto L_0x009b
            java.lang.String r3 = "http"
            r0.e = r3
            int r2 = r2 + 5
            goto L_0x00be
        L_0x009b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected URL scheme 'http' or 'https' but was '"
            r1.<init>(r2)
            java.lang.String r2 = r10.substring(r12, r3)
            r1.append(r2)
            java.lang.String r2 = "'"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00b8:
            if (r1 == 0) goto L_0x0337
            java.lang.String r3 = r1.b
            r0.e = r3
        L_0x00be:
            r3 = r2
            r5 = r12
        L_0x00c0:
            r9 = 47
            r8 = 92
            if (r3 >= r13) goto L_0x00d1
            char r6 = r10.charAt(r3)
            if (r6 == r8) goto L_0x00ce
            if (r6 != r9) goto L_0x00d1
        L_0x00ce:
            int r5 = r5 + r11
            int r3 = r3 + r11
            goto L_0x00c0
        L_0x00d1:
            java.lang.Object r3 = r0.c
            r7 = r3
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r6 = 63
            r3 = 35
            if (r5 >= r4) goto L_0x011f
            if (r1 == 0) goto L_0x011f
            java.lang.Object r4 = r0.e
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r12 = r1.b
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r4)
            r4 = r4 ^ r11
            if (r4 == 0) goto L_0x00ec
            goto L_0x011f
        L_0x00ec:
            java.lang.String r4 = r26.e()
            r0.f = r4
            java.lang.String r4 = r26.a()
            r0.g = r4
            java.lang.String r4 = r1.e
            r0.h = r4
            int r4 = r1.f
            r0.b = r4
            r7.clear()
            java.util.ArrayList r4 = r26.c()
            r7.addAll(r4)
            if (r2 == r13) goto L_0x0112
            char r4 = r10.charAt(r2)
            if (r4 != r3) goto L_0x0119
        L_0x0112:
            java.lang.String r1 = r26.d()
            r0.g(r1)
        L_0x0119:
            r14 = r2
            r21 = r7
            r2 = 0
            goto L_0x028f
        L_0x011f:
            int r2 = r2 + r5
            r12 = r2
            r16 = 0
            r17 = 0
        L_0x0125:
            java.lang.String r1 = "@/\\?#"
            int r5 = defpackage.u0g.f(r10, r12, r13, r1)
            if (r5 == r13) goto L_0x0132
            char r1 = r10.charAt(r5)
            goto L_0x0133
        L_0x0132:
            r1 = r15
        L_0x0133:
            if (r1 == r15) goto L_0x01e6
            if (r1 == r3) goto L_0x01e6
            if (r1 == r9) goto L_0x01e6
            if (r1 == r8) goto L_0x01e6
            if (r1 == r6) goto L_0x01e6
            r2 = 64
            if (r1 == r2) goto L_0x0146
            r15 = r3
            r21 = r7
            goto L_0x01d8
        L_0x0146:
            java.lang.String r4 = "%40"
            if (r16 != 0) goto L_0x01a4
            int r2 = defpackage.u0g.e(r14, r12, r5, r10)
            r18 = 0
            r19 = 0
            java.lang.String r20 = " \"':;<=>@[]^`{}|/\\?#"
            r21 = 1
            r22 = 0
            r23 = 240(0xf0, float:3.36E-43)
            r1 = r27
            r26 = r2
            r2 = r12
            r12 = r3
            r3 = r26
            r15 = r4
            r4 = r20
            r14 = r5
            r5 = r21
            r6 = r22
            r21 = r7
            r7 = r18
            r8 = r19
            r9 = r23
            java.lang.String r1 = defpackage.sq6.q(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r17 == 0) goto L_0x0185
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Object r3 = r0.f
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r1 = defpackage.rae.q(r2, r3, r15, r1)
        L_0x0185:
            r0.f = r1
            r1 = r26
            if (r1 == r14) goto L_0x01a0
            int r2 = r1 + 1
            r7 = 0
            r8 = 0
            java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
            r5 = 1
            r6 = 0
            r9 = 240(0xf0, float:3.36E-43)
            r1 = r27
            r3 = r14
            java.lang.String r1 = defpackage.sq6.q(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0.g = r1
            r16 = r11
        L_0x01a0:
            r17 = r11
            r15 = r12
            goto L_0x01d6
        L_0x01a4:
            r9 = r3
            r15 = r4
            r14 = r5
            r21 = r7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.Object r1 = r0.g
            java.lang.String r1 = (java.lang.String) r1
            r8.append(r1)
            r8.append(r15)
            r7 = 0
            r15 = 0
            java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
            r5 = 1
            r6 = 0
            r18 = 240(0xf0, float:3.36E-43)
            r1 = r27
            r2 = r12
            r3 = r14
            r12 = r8
            r8 = r15
            r15 = r9
            r9 = r18
            java.lang.String r1 = defpackage.sq6.q(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r12.append(r1)
            java.lang.String r1 = r12.toString()
            r0.g = r1
        L_0x01d6:
            int r12 = r14 + 1
        L_0x01d8:
            r3 = r15
            r7 = r21
            r6 = 63
            r8 = 92
            r9 = 47
            r14 = 58
            r15 = -1
            goto L_0x0125
        L_0x01e6:
            r15 = r3
            r14 = r5
            r21 = r7
            r5 = r12
        L_0x01eb:
            if (r5 >= r14) goto L_0x0209
            char r1 = r10.charAt(r5)
            r2 = 58
            if (r1 == r2) goto L_0x0207
            r3 = 91
            if (r1 == r3) goto L_0x01fa
            goto L_0x0205
        L_0x01fa:
            int r5 = r5 + r11
            if (r5 >= r14) goto L_0x0205
            char r1 = r10.charAt(r5)
            r3 = 93
            if (r1 != r3) goto L_0x01fa
        L_0x0205:
            int r5 = r5 + r11
            goto L_0x01eb
        L_0x0207:
            r9 = r5
            goto L_0x020a
        L_0x0209:
            r9 = r14
        L_0x020a:
            int r8 = r9 + 1
            r1 = 4
            r7 = 34
            if (r8 >= r14) goto L_0x0273
            r2 = 0
            java.lang.String r1 = defpackage.sq6.B(r12, r10, r9, r1, r2)
            java.lang.String r1 = defpackage.o54.O(r1)
            r0.h = r1
            java.lang.String r4 = ""
            r16 = 248(0xf8, float:3.48E-43)
            r5 = 0
            r6 = 0
            r17 = 0
            r18 = 0
            r1 = r27
            r2 = r8
            r3 = r14
            r15 = r7
            r7 = r17
            r15 = r8
            r8 = r18
            r24 = r9
            r9 = r16
            java.lang.String r1 = defpackage.sq6.q(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ NumberFormatException -> 0x0248 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0248 }
            if (r11 <= r1) goto L_0x023f
            goto L_0x0248
        L_0x023f:
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r2 < r1) goto L_0x0248
            goto L_0x0249
        L_0x0245:
            r15 = r8
            r24 = r9
        L_0x0248:
            r1 = -1
        L_0x0249:
            r0.b = r1
            r2 = -1
            if (r1 == r2) goto L_0x0252
            r5 = r24
            r2 = 0
            goto L_0x0289
        L_0x0252:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid URL port: \""
            r0.<init>(r1)
            java.lang.String r1 = r10.substring(r15, r14)
            r0.append(r1)
            r1 = 34
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0273:
            r5 = r9
            r2 = 0
            java.lang.String r1 = defpackage.sq6.B(r12, r10, r5, r1, r2)
            java.lang.String r1 = defpackage.o54.O(r1)
            r0.h = r1
            java.lang.Object r1 = r0.e
            java.lang.String r1 = (java.lang.String) r1
            int r1 = defpackage.sq6.u(r1)
            r0.b = r1
        L_0x0289:
            java.lang.Object r1 = r0.h
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0316
        L_0x028f:
            java.lang.String r1 = "?#"
            int r1 = defpackage.u0g.f(r10, r14, r13, r1)
            if (r14 != r1) goto L_0x0298
            goto L_0x02d0
        L_0x0298:
            char r3 = r10.charAt(r14)
            java.lang.String r4 = ""
            r5 = 47
            if (r3 == r5) goto L_0x02a6
            r5 = 92
            if (r3 != r5) goto L_0x02a9
        L_0x02a6:
            r5 = r21
            goto L_0x02b4
        L_0x02a9:
            int r3 = r21.size()
            int r3 = r3 - r11
            r5 = r21
            r5.set(r3, r4)
            goto L_0x02bb
        L_0x02b4:
            r5.clear()
            r5.add(r4)
            int r14 = r14 + r11
        L_0x02bb:
            if (r14 >= r1) goto L_0x02d0
            java.lang.String r3 = "/\\"
            int r3 = defpackage.u0g.f(r10, r14, r1, r3)
            if (r3 >= r1) goto L_0x02c7
            r4 = r11
            goto L_0x02c8
        L_0x02c7:
            r4 = r2
        L_0x02c8:
            r0.p(r10, r14, r3, r4)
            if (r4 == 0) goto L_0x02ce
            int r3 = r3 + r11
        L_0x02ce:
            r14 = r3
            goto L_0x02bb
        L_0x02d0:
            if (r1 >= r13) goto L_0x02f8
            char r2 = r10.charAt(r1)
            r3 = 63
            if (r2 != r3) goto L_0x02f8
            r2 = 35
            int r12 = defpackage.u0g.e(r2, r1, r13, r10)
            int r2 = r1 + 1
            r7 = 1
            r8 = 0
            java.lang.String r4 = " \"'<>#"
            r5 = 1
            r6 = 0
            r9 = 208(0xd0, float:2.91E-43)
            r1 = r27
            r3 = r12
            java.lang.String r1 = defpackage.sq6.q(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.ArrayList r1 = defpackage.sq6.C(r1)
            r0.d = r1
            r1 = r12
        L_0x02f8:
            if (r1 >= r13) goto L_0x0315
            char r2 = r10.charAt(r1)
            r3 = 35
            if (r2 != r3) goto L_0x0315
            int r2 = r1 + 1
            r7 = 0
            r8 = 1
            java.lang.String r4 = ""
            r5 = 1
            r6 = 0
            r9 = 176(0xb0, float:2.47E-43)
            r1 = r27
            r3 = r13
            java.lang.String r1 = defpackage.sq6.q(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0.i = r1
        L_0x0315:
            return
        L_0x0316:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid URL host: \""
            r0.<init>(r1)
            java.lang.String r1 = r10.substring(r12, r5)
            r0.append(r1)
            r1 = 34
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0337:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Expected URL scheme 'http' or 'https' but no colon was found"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sd3.n(m57, java.lang.String):void");
    }

    public void o(int i2) {
        if (1 > i2 || 65535 < i2) {
            throw new IllegalArgumentException(wj6.h(i2, "unexpected port: ").toString());
        }
        this.b = i2;
    }

    public void p(String str, int i2, int i3, boolean z) {
        String q = sq6.q(str, i2, i3, " \"<>^`{}|/\\?#", true, false, false, false, 240);
        if (!Intrinsics.areEqual((Object) q, (Object) ".") && !StringsKt__StringsJVMKt.equals(q, "%2e", true)) {
            boolean areEqual = Intrinsics.areEqual((Object) q, (Object) "..");
            ArrayList arrayList = (ArrayList) this.c;
            if (!areEqual && !StringsKt__StringsJVMKt.equals(q, "%2e.", true) && !StringsKt__StringsJVMKt.equals(q, ".%2e", true) && !StringsKt__StringsJVMKt.equals(q, "%2e%2e", true)) {
                if (((CharSequence) a81.h(1, arrayList)).length() == 0) {
                    arrayList.set(arrayList.size() - 1, q);
                } else {
                    arrayList.add(q);
                }
                if (z) {
                    arrayList.add("");
                }
            } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || !(!arrayList.isEmpty())) {
                arrayList.add("");
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
        }
    }

    public void q(String str) {
        if (((ArrayList) this.d) != null) {
            String q = sq6.q(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219);
            IntProgression step = RangesKt.step(RangesKt.downTo(((ArrayList) this.d).size() - 2, 0), 2);
            int first = step.getFirst();
            int last = step.getLast();
            int step2 = step.getStep();
            if (step2 >= 0) {
                if (first > last) {
                    return;
                }
            } else if (first < last) {
                return;
            }
            while (true) {
                if (Intrinsics.areEqual((Object) q, (Object) (String) ((ArrayList) this.d).get(first))) {
                    ((ArrayList) this.d).remove(first + 1);
                    ((ArrayList) this.d).remove(first);
                    if (((ArrayList) this.d).isEmpty()) {
                        this.d = null;
                        return;
                    }
                }
                if (first != last) {
                    first += step2;
                } else {
                    return;
                }
            }
        }
    }

    public void r(String str) {
        if (StringsKt__StringsJVMKt.equals(str, HttpHost.DEFAULT_SCHEME_NAME, true)) {
            this.e = HttpHost.DEFAULT_SCHEME_NAME;
        } else if (StringsKt__StringsJVMKt.equals(str, "https", true)) {
            this.e = "https";
        } else {
            throw new IllegalArgumentException("unexpected scheme: ".concat(str));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b8, code lost:
        if (r1 != r3) goto L_0x00ba;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r8 = this;
            int r0 = r8.a
            switch(r0) {
                case 1: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r8 = super.toString()
            return r8
        L_0x000a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r8.e
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x001e
            r0.append(r1)
            java.lang.String r1 = "://"
            r0.append(r1)
            goto L_0x0023
        L_0x001e:
            java.lang.String r1 = "//"
            r0.append(r1)
        L_0x0023:
            java.lang.Object r1 = r8.f
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            r2 = 58
            if (r1 <= 0) goto L_0x0030
            goto L_0x003a
        L_0x0030:
            java.lang.Object r1 = r8.g
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x005a
        L_0x003a:
            java.lang.Object r1 = r8.f
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.Object r1 = r8.g
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0055
            r0.append(r2)
            java.lang.Object r1 = r8.g
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
        L_0x0055:
            r1 = 64
            r0.append(r1)
        L_0x005a:
            java.lang.Object r1 = r8.h
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x007f
            boolean r1 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r1, (char) r2, false, 2, (java.lang.Object) null)
            if (r1 == 0) goto L_0x0078
            r1 = 91
            r0.append(r1)
            java.lang.Object r1 = r8.h
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            goto L_0x007f
        L_0x0078:
            java.lang.Object r1 = r8.h
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
        L_0x007f:
            int r1 = r8.b
            r3 = -1
            if (r1 != r3) goto L_0x008a
            java.lang.Object r1 = r8.e
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x00c0
        L_0x008a:
            int r1 = r8.f()
            java.lang.Object r4 = r8.e
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x00ba
            int r5 = r4.hashCode()
            r6 = 3213448(0x310888, float:4.503E-39)
            if (r5 == r6) goto L_0x00ae
            r6 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r5 == r6) goto L_0x00a3
            goto L_0x00b8
        L_0x00a3:
            java.lang.String r5 = "https"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00b8
            r3 = 443(0x1bb, float:6.21E-43)
            goto L_0x00b8
        L_0x00ae:
            java.lang.String r5 = "http"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00b8
            r3 = 80
        L_0x00b8:
            if (r1 == r3) goto L_0x00c0
        L_0x00ba:
            r0.append(r2)
            r0.append(r1)
        L_0x00c0:
            java.lang.Object r1 = r8.c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        L_0x00ca:
            if (r4 >= r2) goto L_0x00dd
            r5 = 47
            r0.append(r5)
            java.lang.Object r5 = r1.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            r0.append(r5)
            int r4 = r4 + 1
            goto L_0x00ca
        L_0x00dd:
            java.lang.Object r1 = r8.d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r1 == 0) goto L_0x0132
            r1 = 63
            r0.append(r1)
            java.lang.Object r1 = r8.d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            kotlin.ranges.IntRange r2 = kotlin.ranges.RangesKt.until((int) r3, (int) r2)
            r3 = 2
            kotlin.ranges.IntProgression r2 = kotlin.ranges.RangesKt.step((kotlin.ranges.IntProgression) r2, (int) r3)
            int r3 = r2.getFirst()
            int r4 = r2.getLast()
            int r2 = r2.getStep()
            if (r2 < 0) goto L_0x010a
            if (r3 > r4) goto L_0x0132
            goto L_0x010c
        L_0x010a:
            if (r3 < r4) goto L_0x0132
        L_0x010c:
            java.lang.Object r5 = r1.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r3 + 1
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r3 <= 0) goto L_0x0121
            r7 = 38
            r0.append(r7)
        L_0x0121:
            r0.append(r5)
            if (r6 == 0) goto L_0x012e
            r5 = 61
            r0.append(r5)
            r0.append(r6)
        L_0x012e:
            if (r3 == r4) goto L_0x0132
            int r3 = r3 + r2
            goto L_0x010c
        L_0x0132:
            java.lang.Object r1 = r8.i
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0144
            r1 = 35
            r0.append(r1)
            java.lang.Object r8 = r8.i
            java.lang.String r8 = (java.lang.String) r8
            r0.append(r8)
        L_0x0144:
            java.lang.String r8 = r0.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sd3.toString():java.lang.String");
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [java.lang.Object, p3a] */
    public sd3(rd3 rd3, qd3 qd3) {
        this.a = 0;
        this.c = new ArrayList();
        this.g = new IdentityHashMap();
        this.d = new ArrayList();
        this.h = new Object();
        this.e = rd3;
        if (qd3.a) {
            ni0 ni0 = new ni0(23, false);
            ni0.c = new SparseArray();
            ni0.b = 0;
            this.f = ni0;
        } else {
            ? obj = new Object();
            obj.a = new SparseArray();
            this.f = obj;
        }
        int i2 = qd3.b;
        this.b = i2;
        if (i2 == 1) {
            this.i = new nob(6);
        } else if (i2 == 2) {
            yl4 yl4 = new yl4(17, false);
            yl4.b = 0;
            this.i = yl4;
        } else if (i2 == 3) {
            this.i = new bpa(7);
        } else {
            throw new IllegalArgumentException("unknown stable id mode");
        }
    }

    public sd3() {
        this.a = 1;
        this.f = "";
        this.g = "";
        this.b = -1;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        arrayList.add("");
    }
}

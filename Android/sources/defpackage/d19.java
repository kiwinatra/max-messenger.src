package defpackage;

import android.content.Context;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.text.TextPaint;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.media3.common.ParserException;
import androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder;
import androidx.work.WorkRequest;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import javax.inject.Provider;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import one.me.chats.list.ChatsListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import org.apache.http.client.methods.HttpPost;

/* renamed from: d19  reason: default package */
public final class d19 implements Provider, h65, nj6, iz8 {
    public Object a;
    public Object b;
    public Object c;

    public /* synthetic */ d19(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public static HashMap A(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        Iterator it = v(arrayList).iterator();
        while (it.hasNext()) {
            hashMap.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : hashMap.keySet()) {
                if (ht.a(size, rational, pde.c)) {
                    ((List) hashMap.get(rational)).add(size);
                }
            }
        }
        return hashMap;
    }

    public static void F(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public static void G(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Size size2 = (Size) list.get(i);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public static ArrayList v(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(ht.a);
        arrayList2.add(ht.c);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList2.contains(rational)) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (ht.a(size, (Rational) it2.next(), pde.c)) {
                            break;
                        }
                    } else {
                        arrayList2.add(rational);
                        break;
                    }
                }
            }
        }
        return arrayList2;
    }

    public static Rational x(int i, boolean z) {
        if (i == 0) {
            return z ? ht.a : ht.b;
        }
        if (i != 1) {
            return null;
        }
        return z ? ht.c : ht.d;
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [qb7, jb7] */
    public void B(j74 j74, Uri uri, Map map, long j, long j2, xf5 xf5) {
        boolean z;
        boolean z2 = true;
        hf4 hf4 = new hf4(j74, j, j2);
        this.a = hf4;
        if (((tf5) this.c) == null) {
            Uri uri2 = uri;
            Map map2 = map;
            tf5[] d = ((zf5) this.b).d(uri, map);
            int length = d.length;
            lx5 lx5 = tb7.b;
            m5a.m(length, "expectedSize");
            ? jb7 = new jb7(length);
            if (d.length == 1) {
                this.c = d[0];
            } else {
                int length2 = d.length;
                int i = 0;
                while (true) {
                    if (i >= length2) {
                        break;
                    }
                    tf5 tf5 = d[i];
                    try {
                        if (tf5.n(hf4)) {
                            this.c = tf5;
                            hf4.w = 0;
                            break;
                        }
                        jb7.e(tf5.o());
                        z = ((tf5) this.c) != null || hf4.o == j;
                        n79.n(z);
                        hf4.w = 0;
                        i++;
                    } catch (EOFException unused) {
                        z = ((tf5) this.c) != null || hf4.o == j;
                    } catch (Throwable th) {
                        if (((tf5) this.c) == null && hf4.o != j) {
                            z2 = false;
                        }
                        n79.n(z2);
                        hf4.w = 0;
                        throw th;
                    }
                }
                if (((tf5) this.c) == null) {
                    StringBuilder sb = new StringBuilder("None of the available extractors (");
                    kn5 kn5 = new kn5(", ", 2);
                    Iterator it = gsg.H(new fm0(5), tb7.q(d)).iterator();
                    StringBuilder sb2 = new StringBuilder();
                    kn5.a(sb2, it);
                    sb.append(sb2.toString());
                    sb.append(") could read the stream.");
                    String sb3 = sb.toString();
                    uri.getClass();
                    k0d j3 = jb7.j();
                    ParserException parserException = new ParserException(sb3, (Exception) null, false, 1);
                    tb7.p(j3);
                    throw parserException;
                }
            }
            ((tf5) this.c).U(xf5);
        }
    }

    public boolean C(int i) {
        ChatsListWidget chatsListWidget = (ChatsListWidget) this.b;
        return i == chatsListWidget.x0.j() + chatsListWidget.y0.j() && chatsListWidget.z0.j() > 0;
    }

    public void D(Iterable iterable) {
        synchronized (this.a) {
            try {
                for (cj3 cj3 : (cj3[]) this.c) {
                    if (cj3.e != null) {
                        cj3.e = null;
                        cj3.d((d19) null, cj3.d);
                    }
                }
                for (cj3 c2 : (cj3[]) this.c) {
                    c2.c(iterable);
                }
                for (cj3 cj32 : (cj3[]) this.c) {
                    if (cj32.e != this) {
                        cj32.e = this;
                        cj32.d(this, cj32.d);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void E() {
        synchronized (this.a) {
            try {
                for (cj3 cj3 : (cj3[]) this.c) {
                    ArrayList arrayList = cj3.b;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        cj3.a.n(cj3);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void H(TextPaint textPaint) {
        ogf ogf = puf.q;
        EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) this.a;
        ogf.a(textPaint, endlessRecyclerView2.getResources().getDisplayMetrics(), uy4.b);
        textPaint.setColor(fu4.k.e(endlessRecyclerView2.getContext()).f().getText().h);
    }

    public void a(Object obj) {
        Void voidR = (Void) obj;
        ((eub) this.a).e = null;
    }

    public void b(aae aae) {
        ((dac) this.c).d(aae);
    }

    public void c(aae aae) {
        ((iz8) this.b).c(aae);
    }

    public void d(lrf lrf) {
        String str = (String) this.c;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, str, "Transformer.abortSafely, cancel transformer", (Throwable) null);
        }
        try {
            lrf.c();
        } catch (Throwable th) {
            z68.o((String) this.c, "Transformer.abortSafely, failed to cancel transformer", th);
        }
    }

    public boolean e(String str) {
        boolean z;
        cj3 cj3;
        synchronized (this.a) {
            try {
                cj3[] cj3Arr = (cj3[]) this.c;
                int length = cj3Arr.length;
                z = false;
                int i = 0;
                while (true) {
                    if (i < length) {
                        cj3 = cj3Arr[i];
                        Object obj = cj3.d;
                        if (obj != null && cj3.b(obj) && cj3.c.contains(str)) {
                            break;
                        }
                        i++;
                    } else {
                        cj3 = null;
                        break;
                    }
                }
                if (cj3 != null) {
                    h88.x().p(qog.a, "Work " + str + " constrained by " + cj3.getClass().getSimpleName());
                }
                if (cj3 == null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public lb0 f() {
        String str = ((yc0) this.b) == null ? " videoSpec" : "";
        if (((z90) this.c) == null) {
            str = str.concat(" audioSpec");
        }
        if (((Integer) this.a) == null) {
            str = tr1.j(str, " outputFormat");
        }
        if (str.isEmpty()) {
            return new lb0((yc0) this.b, (z90) this.c, ((Integer) this.a).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void g(Throwable th) {
        ((eub) this.a).e = null;
        List<bt1> list = (List) this.b;
        if (!list.isEmpty()) {
            for (bt1 t : list) {
                ((qu1) this.c).t(t);
            }
            list.clear();
        }
    }

    public Object get() {
        return new v34((Context) ((Provider) this.b).get(), (lzf) ((Provider) this.c).get(), (lzf) ((Provider) this.a).get());
    }

    public void h(lrf lrf) {
        try {
            lrf.g();
            m56 m56 = lrf.f;
            m56.o();
            ((CopyOnWriteArraySet) m56.f).clear();
        } catch (Throwable th) {
            z68.o((String) this.c, "Transformer.cleanupSafely, failed to cleanup transformer", th);
        }
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.u9 i(android.content.Intent r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.getAction()
            boolean r0 = defpackage.cvg.A(r0)
            r1 = 0
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x000c:
            java.lang.String r0 = "android.intent.action.SEND"
            java.lang.String r2 = r10.getAction()
            boolean r0 = r0.equals(r2)
            java.lang.String r2 = "android.intent.extra.TEXT"
            r3 = 4
            r4 = 2
            java.lang.Object r5 = r9.a
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r6 = r9.b
            m95 r6 = (defpackage.m95) r6
            java.lang.Object r9 = r9.c
            ln5 r9 = (defpackage.ln5) r9
            r7 = 1
            if (r0 == 0) goto L_0x00af
            u9 r0 = new u9
            r0.<init>()
            int r8 = defpackage.ct.r(r10)
            r0.b = r8
            if (r8 == 0) goto L_0x0098
            if (r8 == r7) goto L_0x0091
            if (r8 == r4) goto L_0x008a
            if (r8 == r3) goto L_0x0083
            r9 = 5
            if (r8 == r9) goto L_0x0040
            goto L_0x009e
        L_0x0040:
            java.lang.String r9 = "handleVcardIntent failed, e: "
            java.lang.String r3 = "android.intent.extra.STREAM"
            android.os.Parcelable r3 = r10.getParcelableExtra(r3)     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            android.net.Uri r3 = (android.net.Uri) r3     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            boolean r4 = defpackage.o5a.L(r3, r5, r6)     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            if (r4 == 0) goto L_0x0051
            goto L_0x007c
        L_0x0051:
            android.content.ContentResolver r4 = r5.getContentResolver()     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            java.io.InputStream r3 = r4.openInputStream(r3)     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            java.lang.String r1 = defpackage.j4b.S(r3)     // Catch:{ Exception -> 0x0064 }
        L_0x005d:
            defpackage.j4b.k(r3)
            goto L_0x007c
        L_0x0061:
            r9 = move-exception
            r1 = r3
            goto L_0x007f
        L_0x0064:
            r4 = move-exception
            goto L_0x006a
        L_0x0066:
            r9 = move-exception
            goto L_0x007f
        L_0x0068:
            r4 = move-exception
            r3 = r1
        L_0x006a:
            java.lang.String r5 = "ct"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            r6.<init>(r9)     // Catch:{ all -> 0x0061 }
            r6.append(r4)     // Catch:{ all -> 0x0061 }
            java.lang.String r9 = r6.toString()     // Catch:{ all -> 0x0061 }
            defpackage.z68.f(r5, r9, r1)     // Catch:{ all -> 0x0061 }
            goto L_0x005d
        L_0x007c:
            r0.x = r1
            goto L_0x009e
        L_0x007f:
            defpackage.j4b.k(r1)
            throw r9
        L_0x0083:
            java.util.ArrayList r9 = defpackage.ct.u(r10, r5, r6, r9)
            r0.w = r9
            goto L_0x009e
        L_0x008a:
            java.util.ArrayList r9 = defpackage.ct.u(r10, r5, r6, r9)
            r0.v = r9
            goto L_0x009e
        L_0x0091:
            java.util.ArrayList r9 = defpackage.ct.u(r10, r5, r6, r9)
            r0.o = r9
            goto L_0x009e
        L_0x0098:
            java.lang.String r9 = defpackage.ct.v(r10)
            r0.c = r9
        L_0x009e:
            int r9 = r0.b
            if (r9 == 0) goto L_0x00ae
            boolean r9 = r10.hasExtra(r2)
            if (r9 == 0) goto L_0x00ae
            java.lang.String r9 = defpackage.ct.v(r10)
            r0.c = r9
        L_0x00ae:
            return r0
        L_0x00af:
            java.lang.String r0 = "android.intent.action.SEND_MULTIPLE"
            java.lang.String r1 = r10.getAction()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00f2
            u9 r0 = new u9
            r0.<init>()
            int r1 = defpackage.ct.r(r10)
            r0.b = r1
            if (r1 == r7) goto L_0x00db
            if (r1 == r4) goto L_0x00d4
            if (r1 == r3) goto L_0x00cd
            goto L_0x00e1
        L_0x00cd:
            java.util.ArrayList r9 = defpackage.ct.t(r10, r5, r6, r9)
            r0.w = r9
            goto L_0x00e1
        L_0x00d4:
            java.util.ArrayList r9 = defpackage.ct.t(r10, r5, r6, r9)
            r0.v = r9
            goto L_0x00e1
        L_0x00db:
            java.util.ArrayList r9 = defpackage.ct.t(r10, r5, r6, r9)
            r0.o = r9
        L_0x00e1:
            int r9 = r0.b
            if (r9 == 0) goto L_0x00f1
            boolean r9 = r10.hasExtra(r2)
            if (r9 == 0) goto L_0x00f1
            java.lang.String r9 = defpackage.ct.v(r10)
            r0.c = r9
        L_0x00f1:
            return r0
        L_0x00f2:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "shouldn't be here"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d19.i(android.content.Intent):u9");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [qb7, jb7] */
    public gd3 j(a19 a19, f05 f05) {
        int i = 0;
        ? jb7 = new jb7(4);
        jb7.a(f05);
        jb7.b(new f05[0]);
        k0d j = jb7.j();
        n79.f("The composition must contain at least one EditedMediaItemSequence.", !j.isEmpty());
        tb7 p = tb7.p(j);
        t9a t9a = t9a.y;
        o05 o05 = o05.c;
        s09 s09 = (s09) this.b;
        if (!s09.j || !s09.k) {
            i = 2;
            a19.e = 2;
        } else {
            a19.e = 0;
        }
        return new gd3(p, t9a, o05, false, false, false, i, false);
    }

    public e05 k(ir8 ir8) {
        o05 o05 = o05.c;
        s09 s09 = (s09) this.b;
        boolean z = s09.i;
        m5a.m(4, "initialCapacity");
        Object[] objArr = new Object[4];
        objArr[0] = vtb.e(s09.d, s09.e);
        return new e05(ir8, z, false, false, -9223372036854775807L, -2147483647, new o05(CollectionsKt.emptyList(), tb7.n(1, objArr)));
    }

    public cf4 l(a19 a19) {
        a19.d = 1;
        int i = ((s09) this.b).f;
        f5g f5g = new f5g(i > 0 ? i : -1, 1, -1, -1, 1.0f, -1, -1, false);
        cf4 cf4 = new cf4((Context) this.a);
        cf4.c = f5g;
        cf4.o = false;
        return new cf4(cf4);
    }

    public boolean m(int i) {
        return ((h65) this.b).m(i) && u(i) != null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: qq8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: sq8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.ir8 n(defpackage.hq8 r23) {
        /*
            r22 = this;
            r0 = r23
            oq8 r1 = new oq8
            r1.<init>()
            gc4 r2 = new gc4
            r2.<init>()
            java.util.List r8 = java.util.Collections.emptyList()
            k0d r10 = defpackage.k0d.v
            uq8 r14 = new uq8
            r14.<init>()
            ar8 r21 = defpackage.ar8.d
            r3 = r22
            java.lang.Object r3 = r3.b
            s09 r3 = (defpackage.s09) r3
            android.net.Uri r4 = r3.b
            if (r0 == 0) goto L_0x0059
            long r5 = r0.a
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0059
            float r0 = r3.g
            r7 = 0
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 != 0) goto L_0x003e
            float r7 = r3.h
            r9 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x003e
            goto L_0x0059
        L_0x003e:
            float r1 = (float) r5
            float r0 = r0 * r1
            float r3 = r3.h
            float r1 = r1 * r3
            oq8 r3 = new oq8
            r3.<init>()
            long r5 = (long) r0
            r3.f(r5)
            long r0 = (long) r1
            r3.d(r0)
            qq8 r0 = new qq8
            r0.<init>(r3)
            oq8 r1 = r0.a()
        L_0x0059:
            java.lang.Object r0 = r2.e
            android.net.Uri r0 = (android.net.Uri) r0
            if (r0 == 0) goto L_0x0068
            java.lang.Object r0 = r2.d
            java.util.UUID r0 = (java.util.UUID) r0
            if (r0 == 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r0 = 0
            goto L_0x0069
        L_0x0068:
            r0 = 1
        L_0x0069:
            defpackage.n79.n(r0)
            r0 = 0
            if (r4 == 0) goto L_0x008d
            xq8 r15 = new xq8
            java.lang.Object r3 = r2.d
            java.util.UUID r3 = (java.util.UUID) r3
            if (r3 == 0) goto L_0x007c
            tq8 r0 = new tq8
            r0.<init>(r2)
        L_0x007c:
            r6 = r0
            r11 = 0
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r7 = 0
            r9 = 0
            r3 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r18 = r15
            goto L_0x008f
        L_0x008d:
            r18 = r0
        L_0x008f:
            ir8 r0 = new ir8
            sq8 r2 = new sq8
            r2.<init>(r1)
            wq8 r1 = new wq8
            r1.<init>(r14)
            us8 r20 = defpackage.us8.J
            java.lang.String r16 = ""
            r15 = r0
            r17 = r2
            r19 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d19.n(hq8):ir8");
    }

    public i65 o(int i) {
        return u(i);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, wc8] */
    public lrf p(cf4 cf4, c19 c19) {
        String str;
        String str2;
        Context applicationContext = ((Context) this.a).getApplicationContext();
        lx5 lx5 = tb7.b;
        k0d k0d = k0d.v;
        ? obj = new Object();
        fk4 build = new DefaultVideoFrameProcessor$Factory$Builder().build();
        applicationContext.getApplicationContext();
        wie wie = new wie(17);
        Looper w = v0g.w();
        m56 m56 = new m56(w, c7f.a, (k08) new xff(16));
        m56.o();
        ((CopyOnWriteArraySet) m56.f).clear();
        m56.c(c19);
        if (!((s09) this.b).k) {
            str = vq9.l("video/avc");
            n79.f("Not a video MIME type: " + str, vq9.k(str));
        } else {
            str = null;
        }
        if (str != null) {
            str2 = vq9.l(str);
            n79.f("Not a video MIME type: " + str2, str2 == null || vq9.k(str2));
        } else {
            str2 = null;
        }
        hrf hrf = new hrf((String) null, -1, 0, str2);
        yl4 yl4 = (yl4) wie.b;
        String str3 = hrf.b;
        if (str3 != null) {
            n79.m("Unsupported sample MIME type ".concat(str3), yl4.C(vq9.g(str3)).contains(str3));
        }
        String str4 = hrf.c;
        if (str4 != null) {
            n79.m("Unsupported sample MIME type ".concat(str4), yl4.C(vq9.g(str4)).contains(str4));
        }
        return new lrf(applicationContext, hrf, WorkRequest.MIN_BACKOFF_MILLIS, m56, obj, build, cf4, wie, w);
    }

    /* JADX WARNING: type inference failed for: r6v10, types: [u20, java.lang.Object, t9d] */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, mge, t9d] */
    /* JADX WARNING: type inference failed for: r6v15, types: [xie, java.lang.Object, t9d] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.t9d q(int r7, byte[] r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x012d
            r0 = 2
            if (r7 != r0) goto L_0x0120
            pf9 r7 = defpackage.fd9.a(r8)     // Catch:{ all -> 0x001a }
            int r0 = r7.w0()     // Catch:{ all -> 0x0029 }
            r1 = 0
            java.lang.Object r2 = r6.b
            wie r2 = (defpackage.wie) r2
            switch(r0) {
                case 1: goto L_0x00cf;
                case 2: goto L_0x00a9;
                case 3: goto L_0x008c;
                case 4: goto L_0x0066;
                case 5: goto L_0x005a;
                case 6: goto L_0x002c;
                case 7: goto L_0x0015;
                case 8: goto L_0x001d;
                default: goto L_0x0015;
            }
        L_0x0015:
            r7.close()     // Catch:{ all -> 0x001a }
            r6 = 0
            return r6
        L_0x001a:
            r6 = move-exception
            goto L_0x010b
        L_0x001d:
            java.lang.Object r6 = r6.c     // Catch:{ all -> 0x0029 }
            fj r6 = (defpackage.fj) r6     // Catch:{ all -> 0x0029 }
            xeg r6 = r6.t(r7)     // Catch:{ all -> 0x0029 }
            r7.close()     // Catch:{ all -> 0x001a }
            return r6
        L_0x0029:
            r6 = move-exception
            goto L_0x0102
        L_0x002c:
            int r6 = r7.y0()     // Catch:{ all -> 0x0029 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0029 }
            r0.<init>()     // Catch:{ all -> 0x0029 }
        L_0x0035:
            if (r1 >= r6) goto L_0x0051
            int r3 = r7.w0()     // Catch:{ all -> 0x0029 }
            ue1 r3 = r2.m0(r3)     // Catch:{ all -> 0x0029 }
            int r4 = r7.w0()     // Catch:{ all -> 0x0029 }
            float r4 = (float) r4     // Catch:{ all -> 0x0029 }
            r5 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 / r5
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ all -> 0x0029 }
            r0.put(r3, r4)     // Catch:{ all -> 0x0029 }
            int r1 = r1 + 1
            goto L_0x0035
        L_0x0051:
            c7a r6 = new c7a     // Catch:{ all -> 0x0029 }
            r6.<init>(r0)     // Catch:{ all -> 0x0029 }
            r7.close()     // Catch:{ all -> 0x001a }
            return r6
        L_0x005a:
            java.lang.Object r6 = r6.a     // Catch:{ all -> 0x0029 }
            cx1 r6 = (defpackage.cx1) r6     // Catch:{ all -> 0x0029 }
            a8g r6 = r6.a(r7)     // Catch:{ all -> 0x0029 }
            r7.close()     // Catch:{ all -> 0x001a }
            return r6
        L_0x0066:
            int r6 = r7.t0()     // Catch:{ all -> 0x0029 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0029 }
            r0.<init>()     // Catch:{ all -> 0x0029 }
        L_0x006f:
            if (r1 >= r6) goto L_0x0081
            int r3 = r7.w0()     // Catch:{ all -> 0x0029 }
            ue1 r3 = r2.m0(r3)     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x007e
            r0.add(r3)     // Catch:{ all -> 0x0029 }
        L_0x007e:
            int r1 = r1 + 1
            goto L_0x006f
        L_0x0081:
            xie r6 = new xie     // Catch:{ all -> 0x0029 }
            r6.<init>()     // Catch:{ all -> 0x0029 }
            r6.a = r0     // Catch:{ all -> 0x0029 }
            r7.close()     // Catch:{ all -> 0x001a }
            return r6
        L_0x008c:
            int r6 = r7.w0()     // Catch:{ all -> 0x0029 }
            ue1 r6 = r2.m0(r6)     // Catch:{ all -> 0x0029 }
            mge r0 = new mge     // Catch:{ all -> 0x0029 }
            r0.<init>()     // Catch:{ all -> 0x0029 }
            if (r6 == 0) goto L_0x00a1
            r0.a = r6     // Catch:{ all -> 0x0029 }
            r7.close()     // Catch:{ all -> 0x001a }
            return r0
        L_0x00a1:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0029 }
            java.lang.String r0 = "Illegal 'speaker' value: null"
            r6.<init>(r0)     // Catch:{ all -> 0x0029 }
            throw r6     // Catch:{ all -> 0x0029 }
        L_0x00a9:
            int r6 = r7.t0()     // Catch:{ all -> 0x0029 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0029 }
            r0.<init>()     // Catch:{ all -> 0x0029 }
        L_0x00b2:
            if (r1 >= r6) goto L_0x00c4
            int r3 = r7.w0()     // Catch:{ all -> 0x0029 }
            ue1 r3 = r2.m0(r3)     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x00c1
            r0.add(r3)     // Catch:{ all -> 0x0029 }
        L_0x00c1:
            int r1 = r1 + 1
            goto L_0x00b2
        L_0x00c4:
            u20 r6 = new u20     // Catch:{ all -> 0x0029 }
            r6.<init>()     // Catch:{ all -> 0x0029 }
            r6.a = r0     // Catch:{ all -> 0x0029 }
            r7.close()     // Catch:{ all -> 0x001a }
            return r6
        L_0x00cf:
            int r6 = r7.y0()     // Catch:{ all -> 0x0029 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0029 }
            r0.<init>()     // Catch:{ all -> 0x0029 }
        L_0x00d8:
            if (r1 >= r6) goto L_0x00f2
            java.lang.String r3 = r7.A0()     // Catch:{ all -> 0x0029 }
            ln1 r3 = defpackage.tf6.b0(r3)     // Catch:{ all -> 0x0029 }
            int r4 = r7.w0()     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x00ef
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0029 }
            r0.put(r4, r3)     // Catch:{ all -> 0x0029 }
        L_0x00ef:
            int r1 = r1 + 1
            goto L_0x00d8
        L_0x00f2:
            java.lang.Object r6 = r2.b     // Catch:{ all -> 0x0029 }
            java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6     // Catch:{ all -> 0x0029 }
            r6.putAll(r0)     // Catch:{ all -> 0x0029 }
            x77 r6 = new x77     // Catch:{ all -> 0x0029 }
            r6.<init>(r0)     // Catch:{ all -> 0x0029 }
            r7.close()     // Catch:{ all -> 0x001a }
            return r6
        L_0x0102:
            r7.close()     // Catch:{ all -> 0x0106 }
            goto L_0x010a
        L_0x0106:
            r7 = move-exception
            r6.addSuppressed(r7)     // Catch:{ all -> 0x001a }
        L_0x010a:
            throw r6     // Catch:{ all -> 0x001a }
        L_0x010b:
            ru.ok.android.webrtc.protocol.exceptions.RtcNotificationSerializeException r7 = new ru.ok.android.webrtc.protocol.exceptions.RtcNotificationSerializeException
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r8 = defpackage.fy6.a(r8)
            java.lang.String r1 = "Unable to decode notification body: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8, r6)
            r7.<init>(r0)
            throw r7
        L_0x0120:
            ru.ok.android.webrtc.protocol.exceptions.RtcNotificationSerializeException r6 = new ru.ok.android.webrtc.protocol.exceptions.RtcNotificationSerializeException
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.String r8 = "Only binary format is supported"
            r7.<init>(r8)
            r6.<init>(r7)
            throw r6
        L_0x012d:
            ru.ok.android.webrtc.protocol.exceptions.RtcNotificationSerializeException r6 = new ru.ok.android.webrtc.protocol.exceptions.RtcNotificationSerializeException
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Illegal 'format' value: null"
            r7.<init>(r8)
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d19.q(int, byte[]):t9d");
    }

    public void r(k0d k0d, gs6 gs6) {
        d19 d19 = this;
        k0d k0d2 = k0d;
        gs6 gs62 = gs6;
        if (((bs6) d19.c) == null) {
            try {
                bs6 bs6 = new bs6((Context) d19.a, "shaders/vertex_shader_transformation_es2.glsl", "shaders/fragment_shader_alpha_scale_es2.glsl");
                d19.c = bs6;
                bs6.l(new float[]{-1.0f, -1.0f, c44.DEFAULT_ASPECT_RATIO, 1.0f, 1.0f, -1.0f, c44.DEFAULT_ASPECT_RATIO, 1.0f, -1.0f, 1.0f, c44.DEFAULT_ASPECT_RATIO, 1.0f, 1.0f, 1.0f, c44.DEFAULT_ASPECT_RATIO, 1.0f});
                ((bs6) d19.c).n("uTexTransformationMatrix", ld8.q());
            } catch (IOException e) {
                throw new Exception(e);
            }
        }
        int i = gs62.b;
        int i2 = gs62.c;
        int i3 = gs62.d;
        ld8.y(i, i2, i3);
        ode ode = new ode(i2, i3);
        fu4 fu4 = (fu4) d19.b;
        fu4.j = ode;
        ld8.k();
        bs6 bs62 = (bs6) d19.c;
        bs62.getClass();
        bs62.t();
        int i4 = 3042;
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        ld8.h();
        int i5 = k0d2.o - 1;
        while (i5 >= 0) {
            xj4 xj4 = (xj4) k0d2.get(i5);
            bs6 bs63 = (bs6) d19.c;
            bs63.getClass();
            gs6 gs63 = xj4.b;
            bs63.r(gs63.a, 0, "uTexSampler");
            ode ode2 = new ode(gs63.c, gs63.d);
            float[] fArr = (float[]) fu4.d;
            Matrix.setIdentityM(fArr, 0);
            float[] fArr2 = (float[]) fu4.c;
            Matrix.setIdentityM(fArr2, 0);
            float[] fArr3 = (float[]) fu4.e;
            Matrix.setIdentityM(fArr3, 0);
            float[] fArr4 = (float[]) fu4.b;
            Matrix.setIdentityM(fArr4, 0);
            float[] fArr5 = (float[]) fu4.a;
            Matrix.setIdentityM(fArr5, 0);
            Matrix.setIdentityM((float[]) fu4.f, 0);
            float[] fArr6 = (float[]) fu4.g;
            Matrix.setIdentityM(fArr6, 0);
            float[] fArr7 = (float[]) fu4.h;
            Matrix.setIdentityM(fArr7, 0);
            float[] fArr8 = (float[]) fu4.i;
            Matrix.setIdentityM(fArr8, 0);
            g6d g6d = xj4.d;
            Pair pair = (Pair) g6d.b;
            Matrix.translateM(fArr2, 0, ((Float) pair.first).floatValue(), ((Float) pair.second).floatValue(), c44.DEFAULT_ASPECT_RATIO);
            n79.o((ode) fu4.j);
            float f = (float) ode2.a;
            ode ode3 = (ode) fu4.j;
            float f2 = (float) ode2.b;
            Matrix.scaleM(fArr, 0, f / ((float) ode3.a), f2 / ((float) ode3.b), 1.0f);
            Pair pair2 = (Pair) g6d.o;
            Matrix.scaleM(fArr4, 0, ((Float) pair2.first).floatValue(), ((Float) pair2.second).floatValue(), 1.0f);
            Matrix.invertM(fArr5, 0, fArr4, 0);
            Pair pair3 = (Pair) g6d.c;
            Matrix.translateM(fArr3, 0, ((Float) pair3.first).floatValue() * -1.0f, ((Float) pair3.second).floatValue() * -1.0f, c44.DEFAULT_ASPECT_RATIO);
            Matrix.rotateM((float[]) fu4.f, 0, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 1.0f);
            Matrix.scaleM(fArr6, 0, f2 / f, 1.0f, 1.0f);
            Matrix.invertM(fArr7, 0, fArr6, 0);
            float[] fArr9 = (float[]) fu4.i;
            Matrix.multiplyMM(fArr9, 0, fArr9, 0, (float[]) fu4.c, 0);
            float[] fArr10 = (float[]) fu4.i;
            Matrix.multiplyMM(fArr10, 0, fArr10, 0, (float[]) fu4.d, 0);
            float[] fArr11 = (float[]) fu4.i;
            Matrix.multiplyMM(fArr11, 0, fArr11, 0, (float[]) fu4.b, 0);
            float[] fArr12 = (float[]) fu4.i;
            Matrix.multiplyMM(fArr12, 0, fArr12, 0, (float[]) fu4.e, 0);
            float[] fArr13 = (float[]) fu4.i;
            Matrix.multiplyMM(fArr13, 0, fArr13, 0, (float[]) fu4.a, 0);
            float[] fArr14 = (float[]) fu4.i;
            Matrix.multiplyMM(fArr14, 0, fArr14, 0, (float[]) fu4.g, 0);
            float[] fArr15 = (float[]) fu4.i;
            Matrix.multiplyMM(fArr15, 0, fArr15, 0, (float[]) fu4.f, 0);
            float[] fArr16 = (float[]) fu4.i;
            Matrix.multiplyMM(fArr16, 0, fArr16, 0, (float[]) fu4.h, 0);
            float[] fArr17 = (float[]) fu4.i;
            Matrix.multiplyMM(fArr17, 0, fArr17, 0, (float[]) fu4.b, 0);
            bs63.n("uTransformationMatrix", fArr8);
            bs63.m("uAlphaScale", 1.0f);
            bs63.f();
            GLES20.glDrawArrays(5, 0, 4);
            ld8.h();
            k0d2 = k0d;
            i5--;
            i4 = 3042;
            d19 = this;
        }
        GLES20.glDisable(i4);
        ld8.h();
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [one.me.sdk.media.transformer.MediaTransformException, java.lang.RuntimeException] */
    /* JADX WARNING: type inference failed for: r0v22, types: [one.me.sdk.media.transformer.MediaTransformException, java.lang.RuntimeException] */
    public void s(a19 a19, gd3 gd3) {
        a19 a192 = a19;
        String str = (String) this.c;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, str, "executeWithMainLooper", (Throwable) null);
        }
        String str2 = ((s09) this.b).c;
        Handler handler = new Handler(Looper.getMainLooper());
        CountDownLatch countDownLatch = new CountDownLatch(1);
        c19 c19 = new c19(a192, this, countDownLatch, 1);
        lrf p = p(l(a19), c19);
        if (!handler.post(new po1(this, p, gd3, str2, c19, 6))) {
            a192.a(new RuntimeException("Failed to start media transform on main loop", (Throwable) null));
            if (!handler.post(new b19(this, p, 0))) {
                String str3 = (String) this.c;
                a67 a672 = z68.b;
                if (a672 != null && a672.c()) {
                    a672.d(w78.w, str3, "executeWithMainLooper, failed to cleanup transformer on main loop", (Throwable) null);
                    return;
                }
                return;
            }
            return;
        }
        s09 s09 = (s09) this.b;
        s09.getClass();
        Handler handler2 = handler;
        lrf lrf = p;
        v09 v09 = new v09(handler, p, 500, 300000, (vq7) s09.l);
        v09.b();
        String str4 = (String) this.c;
        a67 a673 = z68.b;
        if (a673 != null && a673.c()) {
            a673.d(w78.o, str4, "executeWithMainLooper, waiting for completion ...", (Throwable) null);
        }
        try {
            countDownLatch.await();
            String str5 = (String) this.c;
            a67 a674 = z68.b;
            if (a674 != null) {
                if (a674.c()) {
                    a674.d(w78.o, str5, "executeWithMainLooper, completed", (Throwable) null);
                }
            }
            v09.a();
            if (!handler2.post(new b19(this, lrf, 1))) {
                String str6 = (String) this.c;
                a67 a675 = z68.b;
                if (a675 != null && a675.c()) {
                    a675.d(w78.w, str6, "executeWithMainLooper, failed to cleanup transformer on main loop", (Throwable) null);
                }
            }
        } catch (InterruptedException e) {
            a192.a(new RuntimeException("Waiting for media transform completion interrupted", e));
            if (!handler2.post(new b19(this, lrf, 2))) {
                String str7 = (String) this.c;
                a67 a676 = z68.b;
                if (a676 != null) {
                    if (a676.c()) {
                        a676.d(w78.w, str7, "executeWithMainLooper, failed to abort media transformer on main loop", (Throwable) null);
                    }
                }
            }
            v09.a();
            if (!handler2.post(new b19(this, lrf, 1))) {
                String str8 = (String) this.c;
                a67 a677 = z68.b;
                if (a677 != null && a677.c()) {
                    a677.d(w78.w, str8, "executeWithMainLooper, failed to cleanup transformer on main loop", (Throwable) null);
                }
            }
        } catch (Throwable th) {
            v09.a();
            if (!handler2.post(new b19(this, lrf, 1))) {
                String str9 = (String) this.c;
                a67 a678 = z68.b;
                if (a678 != null && a678.c()) {
                    a678.d(w78.w, str9, "executeWithMainLooper, failed to cleanup transformer on main loop", (Throwable) null);
                }
            }
            throw th;
        }
    }

    public long t() {
        hf4 hf4 = (hf4) this.a;
        if (hf4 != null) {
            return hf4.o;
        }
        return -1;
    }

    public i65 u(int i) {
        HashMap hashMap = (HashMap) this.a;
        if (hashMap.containsKey(Integer.valueOf(i))) {
            return (i65) hashMap.get(Integer.valueOf(i));
        }
        h65 h65 = (h65) this.b;
        ra0 ra0 = null;
        if (h65.m(i)) {
            i65 o = h65.o(i);
            if (o != null) {
                ArrayList arrayList = new ArrayList();
                for (sa0 sa0 : o.d()) {
                    if (yy4.a(sa0, (vy4) this.c)) {
                        arrayList.add(sa0);
                    }
                }
                if (!arrayList.isEmpty()) {
                    ra0 = ra0.e(o.a(), o.b(), o.c(), arrayList);
                }
            }
            hashMap.put(Integer.valueOf(i), ra0);
        }
        return ra0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: android.util.Size} */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b4, code lost:
        if (defpackage.pde.a(r3) < (r4.getHeight() * r4.getWidth())) goto L_0x00b6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList w(defpackage.zzf r13) {
        /*
            r12 = this;
            r0 = r13
            x97 r0 = (defpackage.x97) r0
            la0 r1 = defpackage.x97.O
            r2 = 0
            java.lang.Object r1 = r0.k(r1, r2)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0014
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            goto L_0x0015
        L_0x0014:
            r3 = r2
        L_0x0015:
            if (r3 == 0) goto L_0x0018
            return r3
        L_0x0018:
            la0 r1 = defpackage.x97.N
            java.lang.Object r1 = r0.k(r1, r2)
            w3d r1 = (defpackage.w3d) r1
            la0 r3 = defpackage.x97.M
            java.lang.Object r3 = r0.k(r3, r2)
            java.util.List r3 = (java.util.List) r3
            int r4 = r13.getInputFormat()
            if (r3 == 0) goto L_0x004d
            java.util.Iterator r3 = r3.iterator()
        L_0x0032:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x004d
            java.lang.Object r5 = r3.next()
            android.util.Pair r5 = (android.util.Pair) r5
            java.lang.Object r6 = r5.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 != r4) goto L_0x0032
            java.lang.Object r3 = r5.second
            android.util.Size[] r3 = (android.util.Size[]) r3
            goto L_0x004e
        L_0x004d:
            r3 = r2
        L_0x004e:
            if (r3 != 0) goto L_0x0052
            r3 = r2
            goto L_0x0056
        L_0x0052:
            java.util.List r3 = java.util.Arrays.asList(r3)
        L_0x0056:
            java.lang.Object r5 = r12.b
            qu1 r5 = (defpackage.qu1) r5
            if (r3 != 0) goto L_0x0060
            java.util.List r3 = r5.r(r4)
        L_0x0060:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            v93 r3 = new v93
            r6 = 1
            r3.<init>(r6)
            java.util.Collections.sort(r4, r3)
            r4.isEmpty()
            r3 = 0
            if (r1 != 0) goto L_0x0211
            java.lang.Object r12 = r12.a
            qu9 r12 = (defpackage.qu9) r12
            r12.getClass()
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0083
            goto L_0x01ec
        L_0x0083:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            v93 r1 = new v93
            r1.<init>(r6)
            java.util.Collections.sort(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            x97 r13 = (defpackage.x97) r13
            la0 r4 = defpackage.x97.L
            java.lang.Object r4 = r13.k(r4, r2)
            android.util.Size r4 = (android.util.Size) r4
            java.lang.Object r3 = r0.get(r3)
            android.util.Size r3 = (android.util.Size) r3
            if (r4 == 0) goto L_0x00b6
            int r5 = defpackage.pde.a(r3)
            int r7 = r4.getWidth()
            int r8 = r4.getHeight()
            int r8 = r8 * r7
            if (r5 >= r8) goto L_0x00b7
        L_0x00b6:
            r4 = r3
        L_0x00b7:
            android.util.Size r3 = r12.a(r13)
            android.util.Size r5 = defpackage.pde.c
            int r7 = defpackage.pde.a(r5)
            int r8 = defpackage.pde.a(r4)
            if (r8 >= r7) goto L_0x00ca
            android.util.Size r5 = defpackage.pde.a
            goto L_0x00d8
        L_0x00ca:
            if (r3 == 0) goto L_0x00d8
            int r8 = r3.getWidth()
            int r9 = r3.getHeight()
            int r9 = r9 * r8
            if (r9 >= r7) goto L_0x00d8
            r5 = r3
        L_0x00d8:
            java.util.Iterator r7 = r0.iterator()
        L_0x00dc:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0110
            java.lang.Object r8 = r7.next()
            android.util.Size r8 = (android.util.Size) r8
            int r9 = defpackage.pde.a(r8)
            int r10 = r4.getWidth()
            int r11 = r4.getHeight()
            int r11 = r11 * r10
            if (r9 > r11) goto L_0x00dc
            int r9 = r8.getWidth()
            int r10 = r8.getHeight()
            int r10 = r10 * r9
            int r9 = defpackage.pde.a(r5)
            if (r10 < r9) goto L_0x00dc
            boolean r9 = r1.contains(r8)
            if (r9 != 0) goto L_0x00dc
            r1.add(r8)
            goto L_0x00dc
        L_0x0110:
            boolean r7 = r1.isEmpty()
            if (r7 != 0) goto L_0x01ed
            la0 r0 = defpackage.x97.F
            boolean r4 = r13.u(r0)
            if (r4 == 0) goto L_0x012f
            java.lang.Object r0 = r13.n(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            boolean r4 = r12.c
            android.util.Rational r0 = x(r0, r4)
            goto L_0x0163
        L_0x012f:
            android.util.Size r0 = r12.a(r13)
            if (r0 == 0) goto L_0x0162
            java.util.ArrayList r4 = v(r1)
            java.util.Iterator r4 = r4.iterator()
        L_0x013d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0153
            java.lang.Object r5 = r4.next()
            android.util.Rational r5 = (android.util.Rational) r5
            android.util.Size r7 = defpackage.pde.c
            boolean r7 = defpackage.ht.a(r0, r5, r7)
            if (r7 == 0) goto L_0x013d
            r0 = r5
            goto L_0x0163
        L_0x0153:
            android.util.Rational r4 = new android.util.Rational
            int r5 = r0.getWidth()
            int r0 = r0.getHeight()
            r4.<init>(r5, r0)
            r0 = r4
            goto L_0x0163
        L_0x0162:
            r0 = r2
        L_0x0163:
            if (r3 != 0) goto L_0x016e
            la0 r3 = defpackage.x97.K
            java.lang.Object r13 = r13.k(r3, r2)
            r3 = r13
            android.util.Size r3 = (android.util.Size) r3
        L_0x016e:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            if (r0 != 0) goto L_0x0183
            r4.addAll(r1)
            if (r3 == 0) goto L_0x01ec
            F(r4, r3, r6)
            goto L_0x01ec
        L_0x0183:
            java.util.HashMap r13 = A(r1)
            if (r3 == 0) goto L_0x01a7
            java.util.Set r1 = r13.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0191:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01a7
            java.lang.Object r2 = r1.next()
            android.util.Rational r2 = (android.util.Rational) r2
            java.lang.Object r2 = r13.get(r2)
            java.util.List r2 = (java.util.List) r2
            F(r2, r3, r6)
            goto L_0x0191
        L_0x01a7:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r13.keySet()
            r1.<init>(r2)
            gt r2 = new gt
            java.io.Serializable r12 = r12.o
            android.util.Rational r12 = (android.util.Rational) r12
            r2.<init>((android.util.Rational) r0, (android.util.Rational) r12)
            java.util.Collections.sort(r1, r2)
            java.util.Iterator r12 = r1.iterator()
        L_0x01c0:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01ec
            java.lang.Object r0 = r12.next()
            android.util.Rational r0 = (android.util.Rational) r0
            java.lang.Object r0 = r13.get(r0)
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x01d6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01c0
            java.lang.Object r1 = r0.next()
            android.util.Size r1 = (android.util.Size) r1
            boolean r2 = r4.contains(r1)
            if (r2 != 0) goto L_0x01d6
            r4.add(r1)
            goto L_0x01d6
        L_0x01ec:
            return r4
        L_0x01ed:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = "All supported output sizes are filtered out according to current resolution selection settings. \nminSize = "
            r13.<init>(r1)
            r13.append(r5)
            java.lang.String r1 = "\nmaxSize = "
            r13.append(r1)
            r13.append(r4)
            java.lang.String r1 = "\ninitial size list: "
            r13.append(r1)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x0211:
            r7 = r13
            x97 r7 = (defpackage.x97) r7
            la0 r8 = defpackage.x97.L
            java.lang.Object r2 = r7.k(r8, r2)
            android.util.Size r2 = (android.util.Size) r2
            r0.Y(r3)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            la0 r8 = defpackage.zzf.q0
            java.lang.Object r7 = r13.k(r8, r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L_0x024f
            int r13 = r13.getInputFormat()
            int r1 = r1.c
            if (r1 != r6) goto L_0x024f
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.addAll(r4)
            java.util.List r13 = r5.l(r13)
            r1.addAll(r13)
            v93 r13 = new v93
            r13.<init>(r6)
            java.util.Collections.sort(r1, r13)
            r4 = r1
        L_0x024f:
            la0 r13 = defpackage.x97.N
            java.lang.Object r13 = r0.n(r13)
            w3d r13 = (defpackage.w3d) r13
            jq5 r0 = r13.a
            java.util.HashMap r1 = A(r4)
            java.lang.Object r12 = r12.c
            android.util.Rational r12 = (android.util.Rational) r12
            if (r12 == 0) goto L_0x026d
            int r4 = r12.getNumerator()
            int r5 = r12.getDenominator()
            if (r4 < r5) goto L_0x026f
        L_0x026d:
            r4 = r6
            goto L_0x0270
        L_0x026f:
            r4 = r3
        L_0x0270:
            int r0 = r0.b
            android.util.Rational r0 = x(r0, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.Set r5 = r1.keySet()
            r4.<init>(r5)
            gt r5 = new gt
            r5.<init>((android.util.Rational) r0, (android.util.Rational) r12)
            java.util.Collections.sort(r4, r5)
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
            java.util.Iterator r0 = r4.iterator()
        L_0x0290:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x02a6
            java.lang.Object r4 = r0.next()
            android.util.Rational r4 = (android.util.Rational) r4
            java.lang.Object r5 = r1.get(r4)
            java.util.List r5 = (java.util.List) r5
            r12.put(r4, r5)
            goto L_0x0290
        L_0x02a6:
            if (r2 == 0) goto L_0x02f3
            android.util.Size r0 = defpackage.pde.a
            int r0 = r2.getWidth()
            int r1 = r2.getHeight()
            int r1 = r1 * r0
            java.util.Set r0 = r12.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x02bb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x02f3
            java.lang.Object r2 = r0.next()
            android.util.Rational r2 = (android.util.Rational) r2
            java.lang.Object r2 = r12.get(r2)
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r2.iterator()
        L_0x02d6:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x02ec
            java.lang.Object r7 = r5.next()
            android.util.Size r7 = (android.util.Size) r7
            int r8 = defpackage.pde.a(r7)
            if (r8 > r1) goto L_0x02d6
            r4.add(r7)
            goto L_0x02d6
        L_0x02ec:
            r2.clear()
            r2.addAll(r4)
            goto L_0x02bb
        L_0x02f3:
            x3d r13 = r13.b
            if (r13 != 0) goto L_0x02f8
            goto L_0x0351
        L_0x02f8:
            java.util.Set r0 = r12.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0300:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0351
            java.lang.Object r1 = r0.next()
            android.util.Rational r1 = (android.util.Rational) r1
            java.lang.Object r1 = r12.get(r1)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0319
            goto L_0x0300
        L_0x0319:
            x3d r2 = defpackage.x3d.c
            boolean r2 = r13.equals(r2)
            if (r2 == 0) goto L_0x0322
            goto L_0x0300
        L_0x0322:
            int r2 = r13.b
            android.util.Size r4 = r13.a
            if (r2 == 0) goto L_0x0344
            if (r2 == r6) goto L_0x0340
            r5 = 2
            if (r2 == r5) goto L_0x033c
            r5 = 3
            if (r2 == r5) goto L_0x0338
            r5 = 4
            if (r2 == r5) goto L_0x0334
            goto L_0x0300
        L_0x0334:
            G(r1, r4, r3)
            goto L_0x0300
        L_0x0338:
            G(r1, r4, r6)
            goto L_0x0300
        L_0x033c:
            F(r1, r4, r3)
            goto L_0x0300
        L_0x0340:
            F(r1, r4, r6)
            goto L_0x0300
        L_0x0344:
            boolean r2 = r1.contains(r4)
            r1.clear()
            if (r2 == 0) goto L_0x0300
            r1.add(r4)
            goto L_0x0300
        L_0x0351:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Collection r12 = r12.values()
            java.util.Iterator r12 = r12.iterator()
        L_0x035e:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0384
            java.lang.Object r0 = r12.next()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x036e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x035e
            java.lang.Object r1 = r0.next()
            android.util.Size r1 = (android.util.Size) r1
            boolean r2 = r13.contains(r1)
            if (r2 != 0) goto L_0x036e
            r13.add(r1)
            goto L_0x036e
        L_0x0384:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d19.w(zzf):java.util.ArrayList");
    }

    public String y(int i) {
        z68.c("d19", "getVcfByPhoneContactId: phoneContactId %d", Integer.valueOf(i));
        try {
            String str = (String) o54.u((Context) this.a, Collections.singletonList(Integer.valueOf(i)), (m95) this.c).get(i);
            if (!cvg.A(str)) {
                return str;
            }
            z68.g("d19", "getVcfByPhoneContactId: vCard is empty for phoneContactId %d", Integer.valueOf(i));
            return null;
        } catch (Exception e) {
            Locale locale = Locale.ENGLISH;
            z68.f("d19", "getVcfByPhoneContactId: exception for phoneContactId " + i, e);
            return null;
        }
    }

    public String z(long j, c7d c7d) {
        try {
            if (!((edb) ((epa) this.b).a.getValue()).b(edb.f)) {
                z68.f("d19", "getVcfByServerPhone: no permissions for contacts", (Throwable) null);
                return null;
            }
            xdb f = c7d.f(j);
            if (f != null) {
                return y(f.o);
            }
            Locale locale = Locale.ENGLISH;
            z68.f("d19", "getVcfByServerPhone: no phoneDb found with server phone " + j, (Throwable) null);
            return null;
        } catch (Exception e) {
            Locale locale2 = Locale.ENGLISH;
            z68.f("d19", "getVcfByServerPhone: exception for server phone " + j, e);
            return null;
        }
    }

    public /* synthetic */ d19(boolean z, Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public d19(String str, h57 h57) {
        this.c = HttpPost.METHOD_NAME;
        this.b = str;
        this.a = h57;
    }

    public d19(h65 h65, vy4 vy4) {
        this.a = new HashMap();
        this.b = h65;
        this.c = vy4;
    }

    public d19(m7f m7f, pog pog) {
        im0 im0 = new im0((qj3) m7f.a, 0);
        im0 im02 = new im0((jm0) m7f.b, 1);
        im0 im03 = new im0((qj3) m7f.o, 4);
        qj3 qj3 = (qj3) m7f.c;
        this.b = pog;
        this.c = new cj3[]{im0, im02, im03, new im0(qj3, 2), new im0(qj3, 3), new cj3(qj3), new cj3(qj3)};
        this.a = new Object();
    }

    public d19(qu1 qu1, Size size) {
        Rational rational;
        this.b = qu1;
        qu1.c();
        qu1.h();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List r = qu1.r(256);
            if (r.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(r, new v93(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.c = rational;
        this.a = new qu9(qu1, rational);
    }
}

package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import com.google.android.exoplayer2.ParserException;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.apache.http.util.LangUtils;

/* renamed from: l15  reason: default package */
public final class l15 implements y28, ds6, es6, vc8, vye {
    public static final p01 o = new p01(-9223372036854775807L, 0, 5, false);
    public static final p01 v = new p01(-9223372036854775807L, 2, 5, false);
    public static final p01 w = new p01(-9223372036854775807L, 3, 5, false);
    public Object a;
    public Object b;
    public Object c;

    public /* synthetic */ l15(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public String A() {
        if (u()) {
            String str = (String) this.c;
            this.c = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public ThreadFactory B(String str, Integer num) {
        return (ThreadFactory) ((ConcurrentHashMap) this.c).computeIfAbsent(str, new yi(13, new ep1(str, this, num, 9)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        if (r7.length() == 1) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0098, code lost:
        if (r7 == 0) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d0, code lost:
        if ((r9 == null || kotlin.text.StringsKt.isBlank(r9)) != false) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        if (r6 == false) goto L_0x0026;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x000f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0046 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList C(java.util.List r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x000f:
            boolean r3 = r1.hasNext()
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x003d
            java.lang.Object r3 = r1.next()
            r6 = r3
            t1f r6 = (defpackage.t1f) r6
            tze r7 = r6.a
            sze r7 = r7.b
            sze r8 = defpackage.sze.a
            if (r7 == r8) goto L_0x0028
        L_0x0026:
            r4 = r5
            goto L_0x0037
        L_0x0028:
            l72 r7 = defpackage.l72.a
            java.lang.Object r8 = r0.b
            l72 r8 = (defpackage.l72) r8
            boolean r6 = r6.b
            if (r8 != r7) goto L_0x0034
            r4 = r6
            goto L_0x0037
        L_0x0034:
            if (r6 != 0) goto L_0x0037
            goto L_0x0026
        L_0x0037:
            if (r4 == 0) goto L_0x000f
            r2.add(r3)
            goto L_0x000f
        L_0x003d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0046:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x010c
            java.lang.Object r3 = r2.next()
            t1f r3 = (defpackage.t1f) r3
            tze r6 = r3.a
            java.lang.String r7 = r6.h
            java.lang.Object r8 = r0.c
            kotlin.Lazy r8 = (kotlin.Lazy) r8
            java.lang.String r6 = r6.c
            if (r7 == 0) goto L_0x006c
            int r9 = r7.length()
            if (r9 != 0) goto L_0x0065
            goto L_0x006c
        L_0x0065:
            int r9 = r7.length()
            if (r9 != r5) goto L_0x006c
            goto L_0x007c
        L_0x006c:
            java.lang.Object r9 = r8.getValue()
            tld r9 = (defpackage.tld) r9
            boolean r9 = r9.h(r6, r7)
            if (r9 == 0) goto L_0x007c
            android.text.SpannableStringBuilder r6 = r0.x(r6, r7)
        L_0x007c:
            tze r3 = r3.a
            java.lang.String r7 = r3.h
            java.lang.String r9 = r3.d
            r10 = 0
            if (r7 == 0) goto L_0x009b
            int r11 = r7.length()
            if (r11 != 0) goto L_0x008c
            goto L_0x009b
        L_0x008c:
            int r11 = r7.length()
            if (r11 != r5) goto L_0x009b
            if (r9 == 0) goto L_0x00b5
            int r7 = r9.length()
            if (r7 != 0) goto L_0x00b6
            goto L_0x00b5
        L_0x009b:
            if (r9 == 0) goto L_0x00b5
            int r11 = r9.length()
            if (r11 != 0) goto L_0x00a4
            goto L_0x00b5
        L_0x00a4:
            java.lang.Object r8 = r8.getValue()
            tld r8 = (defpackage.tld) r8
            boolean r8 = r8.h(r9, r7)
            if (r8 == 0) goto L_0x00b6
            android.text.SpannableStringBuilder r9 = r0.x(r9, r7)
            goto L_0x00b6
        L_0x00b5:
            r9 = r10
        L_0x00b6:
            if (r6 == 0) goto L_0x00c1
            boolean r7 = kotlin.text.StringsKt.isBlank(r6)
            if (r7 == 0) goto L_0x00bf
            goto L_0x00c1
        L_0x00bf:
            r7 = r4
            goto L_0x00c2
        L_0x00c1:
            r7 = r5
        L_0x00c2:
            if (r7 == 0) goto L_0x00d3
            if (r9 == 0) goto L_0x00cf
            boolean r7 = kotlin.text.StringsKt.isBlank(r9)
            if (r7 == 0) goto L_0x00cd
            goto L_0x00cf
        L_0x00cd:
            r7 = r4
            goto L_0x00d0
        L_0x00cf:
            r7 = r5
        L_0x00d0:
            if (r7 == 0) goto L_0x00d3
            goto L_0x0105
        L_0x00d3:
            long r12 = r3.a
            if (r6 != 0) goto L_0x00dd
            java.lang.String r6 = "id"
            java.lang.String r6 = defpackage.wj6.i(r12, r6)
        L_0x00dd:
            r14 = r6
            java.lang.String r6 = ""
            if (r9 != 0) goto L_0x00e5
            r16 = r6
            goto L_0x00e7
        L_0x00e5:
            r16 = r9
        L_0x00e7:
            java.lang.String r7 = r3.f
            if (r7 != 0) goto L_0x00ed
            r15 = r6
            goto L_0x00ee
        L_0x00ed:
            r15 = r7
        L_0x00ee:
            java.lang.String r7 = r3.h
            if (r7 != 0) goto L_0x00f5
            r17 = r6
            goto L_0x00f7
        L_0x00f5:
            r17 = r7
        L_0x00f7:
            java.util.List r18 = kotlin.collections.CollectionsKt.emptyList()
            o0f r10 = new o0f
            sze r3 = r3.b
            r11 = r10
            r19 = r3
            r11.<init>(r12, r14, r15, r16, r17, r18, r19)
        L_0x0105:
            if (r10 == 0) goto L_0x0046
            r1.add(r10)
            goto L_0x0046
        L_0x010c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l15.C(java.util.List):java.util.ArrayList");
    }

    public void D(v28 v28) {
        r28 r28 = (r28) this.b;
        if (r28 != null) {
            r28.a(true);
        }
        ExecutorService executorService = (ExecutorService) this.a;
        if (v28 != null) {
            executorService.execute(new tj7(7, v28));
        }
        executorService.shutdown();
    }

    public Bitmap E(k25 k25) {
        Bitmap bitmap = (Bitmap) ((go0) ((g6d) this.a).c).c(k25);
        if (bitmap != null) {
            return bitmap;
        }
        int i = k25.a;
        Bitmap bitmap2 = ((Bitmap[]) ((g6d) this.a).b)[i];
        boolean z = true;
        if (bitmap2 != null) {
            n35 n35 = (n35) this.b;
            int roundToInt = i == 24 ? MathKt.roundToInt(n35.a() * ((float) 1)) : MathKt.roundToInt(n35.a() * ((float) 13));
            boolean z2 = bitmap2.getWidth() == roundToInt;
            if (!z2) {
                String name = n35.class.getName();
                StringBuilder n = a81.n("Sprite is not width enough - index: ", i, "; width: ", bitmap2.getWidth(), "; requiredWidth: ");
                n.append(roundToInt);
                z68.f(name, "Sprite is not width enough, may be a problem of extracting emoji", new RuntimeException(n.toString()));
            }
            if (z2) {
                n35 n352 = (n35) this.b;
                int roundToInt2 = MathKt.roundToInt(((Number) n352.b.getValue()).floatValue() * ((float) k25.b));
                int roundToInt3 = MathKt.roundToInt(((Number) n352.b.getValue()).floatValue() * ((float) k25.c));
                int roundToInt4 = MathKt.roundToInt(n352.a());
                Rect rect = n35.c;
                rect.left = 0;
                rect.top = 0;
                rect.right = roundToInt4;
                rect.bottom = roundToInt4;
                Bitmap createBitmap = Bitmap.createBitmap(bitmap2, RangesKt.coerceIn(roundToInt2, 0, bitmap2.getWidth() - roundToInt4), RangesKt.coerceIn(roundToInt3, 0, bitmap2.getHeight() - roundToInt4), roundToInt4, roundToInt4);
                ((go0) ((g6d) this.a).c).d(new k25(k25.a, k25.b, k25.c), createBitmap);
                return createBitmap;
            }
        }
        String name2 = l15.class.getName();
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            if (bitmap2 != null) {
                z = false;
            }
            a67.d(w78, name2, i2a.i("Cannot resolve SpriteBitmap. It's null - ", z), (Throwable) null);
        }
        m35 m35 = (m35) this.c;
        m35.g.computeIfAbsent(Integer.valueOf(i), new yi(9, new j9(m35, i, 2)));
        return null;
    }

    public long F(t28 t28, q28 q28, int i) {
        Looper myLooper = Looper.myLooper();
        n79.o(myLooper);
        this.c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        r28 r28 = new r28(this, myLooper, t28, q28, i, elapsedRealtime, 1);
        n79.n(((r28) this.b) == null);
        this.b = r28;
        r28.o = null;
        ((ExecutorService) this.a).execute(r28);
        return elapsedRealtime;
    }

    public void a(String str, List list) {
        KProperty[] kPropertyArr = jib.D0;
        ((jib) this.a).k().h = null;
        boolean areEqual = Intrinsics.areEqual((Object) str, (Object) (String) this.b);
        kw1 kw1 = (kw1) this.c;
        if (areEqual) {
            kw1.resumeWith(Result.m23constructorimpl(list));
            return;
        }
        Result.Companion companion = Result.Companion;
        CancellationException cancellationException = new CancellationException("Nothing found");
        cancellationException.initCause((Throwable) null);
        kw1.resumeWith(Result.m23constructorimpl(ResultKt.createFailure(cancellationException)));
    }

    public void b() {
        IOException iOException;
        IOException iOException2 = (IOException) this.c;
        if (iOException2 == null) {
            r28 r28 = (r28) this.b;
            if (r28 != null && (iOException = r28.o) != null && r28.v > r28.b) {
                throw iOException;
            }
            return;
        }
        throw iOException2;
    }

    public void c(Collection collection) {
        if (collection == null) {
            throw new IllegalArgumentException("filters must not be null");
        } else if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                IntentFilter intentFilter = (IntentFilter) it.next();
                if (intentFilter != null) {
                    if (((ArrayList) this.c) == null) {
                        this.c = new ArrayList();
                    }
                    if (!((ArrayList) this.c).contains(intentFilter)) {
                        ((ArrayList) this.c).add(intentFilter);
                    }
                }
            }
        }
    }

    public int d(long j) {
        long[] jArr = (long[]) this.c;
        int b2 = v0g.b(jArr, j, false);
        if (b2 < jArr.length) {
            return b2;
        }
        return -1;
    }

    public ln1 e() {
        Objects.requireNonNull((ue1) this.a);
        Objects.requireNonNull((a9g) this.b);
        return new ln1(this);
    }

    public nv8 g() {
        ArrayList arrayList = (ArrayList) this.c;
        Bundle bundle = (Bundle) this.a;
        if (arrayList != null) {
            bundle.putParcelableArrayList("controlFilters", arrayList);
        }
        ArrayList arrayList2 = (ArrayList) this.b;
        if (arrayList2 != null) {
            bundle.putStringArrayList("groupMemberIds", arrayList2);
        }
        return new nv8(bundle);
    }

    public synchronized void h() {
        ((mqf) this.b).V();
    }

    public String i(int i, long j, long j2, String str) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            List list = (List) this.b;
            int size = list.size();
            List list2 = (List) this.a;
            if (i2 < size) {
                sb.append((String) list2.get(i2));
                if (((Integer) list.get(i2)).intValue() == 1) {
                    sb.append(str);
                } else {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    List list3 = (List) this.c;
                    if (intValue == 2) {
                        sb.append(String.format(Locale.US, (String) list3.get(i2), new Object[]{Long.valueOf(j)}));
                    } else if (((Integer) list.get(i2)).intValue() == 3) {
                        sb.append(String.format(Locale.US, (String) list3.get(i2), new Object[]{Integer.valueOf(i)}));
                    } else if (((Integer) list.get(i2)).intValue() == 4) {
                        sb.append(String.format(Locale.US, (String) list3.get(i2), new Object[]{Long.valueOf(j2)}));
                    }
                }
                i2++;
            } else {
                sb.append((String) list2.get(list.size()));
                return sb.toString();
            }
        }
    }

    public void j() {
        r28 r28 = (r28) this.b;
        n79.o(r28);
        r28.a(false);
    }

    public long k(int i) {
        boolean z = false;
        n79.g(i >= 0);
        long[] jArr = (long[]) this.c;
        if (i < jArr.length) {
            z = true;
        }
        n79.g(z);
        return jArr[i];
    }

    public synchronized void l(gs6 gs6, long j) {
        ((mqf) this.b).R(gs6, j);
    }

    public k2b m(String str) {
        return (k2b) ((ConcurrentHashMap) ((Lazy) this.c).getValue()).computeIfAbsent(str, new yi(18, new ued(9, this, str)));
    }

    public long n() {
        gf4 gf4 = (gf4) this.c;
        if (gf4 != null) {
            return gf4.o;
        }
        return -1;
    }

    public k9a o() {
        f9a f9a = k9a.a;
        String string = q().getString("nightmode", "");
        f9a.getClass();
        List x = StringsKt__StringsKt.split$default((CharSequence) string, new char[]{','}, false, 0, 6, (Object) null);
        boolean isEmpty = x.isEmpty();
        j9a j9a = j9a.b;
        if (isEmpty) {
            return j9a;
        }
        String str = (String) CollectionsKt.first(x);
        switch (str.hashCode()) {
            case -1609594047:
                return !str.equals("enabled") ? j9a : h9a.b;
            case -887328209:
                boolean equals = str.equals("system");
                return j9a;
            case -697920873:
                if (!str.equals("schedule")) {
                    return j9a;
                }
                Duration.Companion companion = Duration.Companion;
                int parseInt = Integer.parseInt((String) x.get(1));
                DurationUnit durationUnit = DurationUnit.MINUTES;
                return new i9a(DurationKt.toDuration(parseInt, durationUnit), DurationKt.toDuration(Integer.parseInt((String) x.get(2)), durationUnit));
            case 3005871:
                return !str.equals("auto") ? j9a : new e9a(Integer.parseInt((String) x.get(1)));
            case 270940796:
                return !str.equals("disabled") ? j9a : g9a.b;
            default:
                return j9a;
        }
    }

    public List p(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            List list = (List) this.a;
            if (i2 >= list.size()) {
                break;
            }
            int i3 = i2 * 2;
            long[] jArr = (long[]) this.b;
            if (jArr[i3] <= j && j < jArr[i3 + 1]) {
                emg emg = (emg) list.get(i2);
                n44 n44 = emg.a;
                if (n44.e == -3.4028235E38f) {
                    arrayList2.add(emg);
                } else {
                    arrayList.add(n44);
                }
            }
            i2++;
        }
        Collections.sort(arrayList2, new baf(6));
        while (i < arrayList2.size()) {
            n44 n442 = ((emg) arrayList2.get(i)).a;
            ArrayList arrayList3 = arrayList2;
            n44 n443 = r4;
            n44 n444 = new n44(n442.a, n442.b, n442.c, n442.d, (float) (-1 - i), 1, n442.g, n442.h, n442.i, n442.n, n442.o, n442.j, n442.k, n442.l, n442.m, n442.p, n442.q);
            arrayList.add(n443);
            i++;
            arrayList2 = arrayList3;
        }
        return arrayList;
    }

    public SharedPreferences q() {
        return (SharedPreferences) ((Lazy) this.a).getValue();
    }

    public synchronized void r() {
        ((mqf) this.b).r();
    }

    public boolean s() {
        return ((IOException) this.c) != null;
    }

    public int t() {
        return ((long[]) this.c).length;
    }

    public boolean u() {
        String trim;
        if (((String) this.c) != null) {
            return true;
        }
        Queue queue = (Queue) this.b;
        if (!queue.isEmpty()) {
            String str = (String) queue.poll();
            str.getClass();
            this.c = str;
            return true;
        }
        do {
            String readLine = ((BufferedReader) this.a).readLine();
            this.c = readLine;
            if (readLine == null) {
                return false;
            }
            trim = readLine.trim();
            this.c = trim;
        } while (trim.isEmpty());
        return true;
    }

    public void v(gs6 gs6) {
        ((gy0) this.c).v(new az1(0, this, gs6));
    }

    public synchronized void w() {
        ((mqf) this.b).w();
        fs6 fs6 = (fs6) this.a;
        Objects.requireNonNull(fs6);
        ((gy0) this.c).v(new bz1(fs6, 0));
    }

    public SpannableStringBuilder x(CharSequence charSequence, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (!(charSequence == null || str == null)) {
            Lazy lazy = (Lazy) this.c;
            for (sld sld : ((tld) lazy.getValue()).d(charSequence.toString(), ((tld) lazy.getValue()).e(charSequence.toString(), str))) {
                spannableStringBuilder.setSpan(new aif(fu4.k.e((Context) this.a).f(), new duc(18)), sld.a, sld.b, 17);
            }
        }
        return spannableStringBuilder;
    }

    public void y(h74 h74, Uri uri, Map map, long j, long j2, wf5 wf5) {
        boolean z;
        boolean z2 = true;
        gf4 gf4 = new gf4(h74, j, j2);
        this.c = gf4;
        if (((sf5) this.b) == null) {
            Uri uri2 = uri;
            Map map2 = map;
            sf5[] d = ((yf5) this.a).d(uri, map);
            if (d.length == 1) {
                this.b = d[0];
            } else {
                int length = d.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    sf5 sf5 = d[i];
                    try {
                        if (sf5.h(gf4)) {
                            this.b = sf5;
                            gf4.w = 0;
                            break;
                        }
                        z = ((sf5) this.b) != null || gf4.o == j;
                        y64.j(z);
                        gf4.w = 0;
                        i++;
                    } catch (EOFException unused) {
                        z = ((sf5) this.b) != null || gf4.o == j;
                    } catch (Throwable th) {
                        if (((sf5) this.b) == null && gf4.o != j) {
                            z2 = false;
                        }
                        y64.j(z2);
                        gf4.w = 0;
                        throw th;
                    }
                }
                if (((sf5) this.b) == null) {
                    int i2 = t0g.a;
                    StringBuilder sb = new StringBuilder();
                    for (int i3 = 0; i3 < d.length; i3++) {
                        sb.append(d[i3].getClass().getSimpleName());
                        if (i3 < d.length - 1) {
                            sb.append(", ");
                        }
                    }
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder(g63.f(58, sb2));
                    sb3.append("None of the available extractors (");
                    sb3.append(sb2);
                    sb3.append(") could read the stream.");
                    String sb4 = sb3.toString();
                    uri.getClass();
                    throw new ParserException(sb4, (Exception) null, false, 1);
                }
            }
            ((sf5) this.b).g(wf5);
        }
    }

    public boolean z() {
        return ((r28) this.b) != null;
    }

    public l15() {
        this.b = a9g.a;
    }

    public l15(int i, Lazy lazy) {
        switch (i) {
            case LangUtils.HASH_SEED /*17*/:
                this.a = SetsKt.setOf(m2b.a, l2b.a);
                this.b = lazy;
                this.c = LazyKt.lazy(LazyThreadSafetyMode.NONE, new lce(14, this));
                return;
            default:
                this.a = lazy;
                n6e b2 = m5a.b(0, 1, cu0.b, 1);
                this.b = b2;
                this.c = new dtc(b2);
                return;
        }
    }

    public l15(yr6 yr6, fs6 fs6, fs6 fs62, gy0 gy0) {
        this.a = fs6;
        this.b = new mqf(yr6, fs62, gy0);
        this.c = gy0;
    }

    public l15(String str) {
        String concat = "ExoPlayer:Loader:".concat(str);
        int i = v0g.a;
        this.a = Executors.newSingleThreadExecutor(new td3(2, concat));
    }

    public l15(String str, String str2) {
        Bundle bundle = new Bundle();
        this.a = bundle;
        if (str != null) {
            bundle.putString("id", str);
            if (str2 != null) {
                bundle.putString("name", str2);
                return;
            }
            throw new NullPointerException("name must not be null");
        }
        throw new NullPointerException("id must not be null");
    }

    public l15(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.b = arrayDeque;
        this.a = bufferedReader;
    }
}

package defpackage;

import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import one.me.deeplink.InvalidDeeplinkNamingException;
import one.me.sdk.arch.Widget;
import ru.ok.messages.gallery.GalleryFragment;

/* renamed from: ta4  reason: default package */
public final class ta4 {
    public final String a = ta4.class.getName();
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final ArrayList f;
    public boolean g;

    public ta4(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4) {
        this.b = lazy3;
        this.c = lazy4;
        this.d = lazy;
        this.e = lazy2;
        this.f = new ArrayList();
    }

    public final ja4 a() {
        return (ja4) this.c.getValue();
    }

    public final boolean b(String str, Bundle bundle) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("try to open new screen from background thread".toString());
        } else if (StringsKt__StringsKt.startsWith$default((CharSequence) str, ':', false, 2, (Object) null)) {
            return c(y64.c(str, "max", (String) null), bundle);
        } else {
            z68.f(this.a, a81.m("Trying to open invalid app route=", str), (Throwable) null);
            throw new InvalidDeeplinkNamingException(str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: one.me.main.MainScreen} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: spa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: spa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: spa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: one.me.main.MainScreen} */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x032c, code lost:
        if (r3.d != false) goto L_0x0345;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x04fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(android.net.Uri r20, android.os.Bundle r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r5 = r21
            java.lang.String r2 = r20.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "goto = "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = ", bundle = "
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "DeepLinkRouter"
            defpackage.z68.c(r3, r2, new java.lang.Object[0])
            kotlin.Lazy r2 = r0.d
            java.lang.Object r2 = r2.getValue()
            na4 r2 = (defpackage.na4) r2
            kotlin.Pair r2 = r2.a(r1)
            if (r2 == 0) goto L_0x052f
            java.lang.Object r3 = r2.component1()
            ra4 r3 = (defpackage.ra4) r3
            java.lang.Object r2 = r2.component2()
            oa4 r2 = (defpackage.oa4) r2
            java.lang.String r4 = r20.getQuery()
            r6 = 61
            r7 = 38
            r8 = 1
            r9 = 0
            if (r4 == 0) goto L_0x008e
            boolean r10 = kotlin.text.StringsKt.isBlank(r4)
            if (r10 == 0) goto L_0x0052
            goto L_0x008e
        L_0x0052:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>(r8)
            r11 = r9
        L_0x0058:
            r12 = 4
            int r13 = kotlin.text.StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) r4, (char) r7, (int) r11, false, (int) r12, (java.lang.Object) null)
            r14 = -1
            if (r13 != r14) goto L_0x0064
            int r13 = r4.length()
        L_0x0064:
            int r12 = kotlin.text.StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) r4, (char) r6, (int) r11, false, (int) r12, (java.lang.Object) null)
            if (r12 > r13) goto L_0x006c
            if (r12 != r14) goto L_0x006d
        L_0x006c:
            r12 = r13
        L_0x006d:
            java.lang.String r11 = r4.substring(r11, r12)
            int r12 = r12 + r8
            int r12 = kotlin.ranges.RangesKt.coerceAtMost((int) r12, (int) r13)
            java.lang.String r12 = r4.substring(r12, r13)
            java.lang.String r11 = android.net.Uri.decode(r11)
            java.lang.String r12 = android.net.Uri.decode(r12)
            r10.put(r11, r12)
            int r11 = r13 + 1
            int r12 = r4.length()
            if (r11 < r12) goto L_0x0058
            goto L_0x0092
        L_0x008e:
            java.util.Map r10 = kotlin.collections.MapsKt.emptyMap()
        L_0x0092:
            java.util.Set r4 = r10.keySet()
            java.util.Set r11 = r3.c
            boolean r4 = r4.containsAll(r11)
            if (r4 == 0) goto L_0x0525
            java.util.Set r4 = r3.e
            if (r4 == 0) goto L_0x010b
            boolean r12 = r4.isEmpty()
            if (r12 == 0) goto L_0x00a9
            goto L_0x010b
        L_0x00a9:
            if (r5 == 0) goto L_0x00b5
            java.util.Set r12 = r21.keySet()
            boolean r4 = r12.containsAll(r4)
            if (r4 != 0) goto L_0x010b
        L_0x00b5:
            one.me.deeplink.MissedRequiredBundleException r0 = new one.me.deeplink.MissedRequiredBundleException
            if (r5 == 0) goto L_0x00bf
            java.util.Set r2 = r21.keySet()
            r4 = r2
            goto L_0x00c0
        L_0x00bf:
            r4 = 0
        L_0x00c0:
            java.lang.String r2 = r20.toString()
            java.util.Set r12 = r3.e
            r15 = 0
            r18 = 63
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            java.lang.String r12 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(r12, r13, r14, r15, 0, r16, r17, r18, (java.lang.Object) null)
            if (r4 == 0) goto L_0x00e1
            r7 = 0
            r10 = 63
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            java.lang.String r11 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(r4, r5, r6, r7, 0, r8, r9, r10, (java.lang.Object) null)
            goto L_0x00e2
        L_0x00e1:
            r11 = 0
        L_0x00e2:
            java.lang.String r1 = r20.toString()
            java.lang.String r4 = "Bundle required for "
            java.lang.String r5 = " not contains all params! requiredParams = "
            java.lang.String r6 = ", bundleKeys = "
            java.lang.StringBuilder r2 = defpackage.rae.r(r4, r2, r5, r12, r6)
            r2.append(r11)
            java.lang.String r4 = ", uri="
            r2.append(r4)
            r2.append(r1)
            java.lang.String r1 = ", route = "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x010b:
            if (r5 != 0) goto L_0x0113
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            goto L_0x0114
        L_0x0113:
            r4 = r5
        L_0x0114:
            java.util.Set r12 = r10.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x011c:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0138
            java.lang.Object r13 = r12.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r14 = r13.getKey()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r13 = r13.getValue()
            java.lang.String r13 = (java.lang.String) r13
            r4.putString(r14, r13)
            goto L_0x011c
        L_0x0138:
            kotlin.Pair r4 = kotlin.TuplesKt.to(r10, r4)
            java.lang.Object r10 = r4.component1()
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r4 = r4.component2()
            android.os.Bundle r4 = (android.os.Bundle) r4
            kotlin.Lazy r12 = r0.b
            java.lang.Object r12 = r12.getValue()
            va4 r12 = (defpackage.va4) r12
            dta r12 = (defpackage.dta) r12
            r12.getClass()
            ma4 r13 = r3.b
            int[] r14 = defpackage.cta.$EnumSwitchMapping$0
            int r13 = r13.ordinal()
            r13 = r14[r13]
            if (r13 != r8) goto L_0x016e
            kotlin.Lazy r12 = r12.a
            java.lang.Object r12 = r12.getValue()
            doa r12 = (defpackage.doa) r12
            boolean r12 = r12.e()
            goto L_0x016f
        L_0x016e:
            r12 = r8
        L_0x016f:
            java.lang.String r13 = ":login"
            if (r12 != 0) goto L_0x0185
            kotlin.Lazy r1 = r0.b
            java.lang.Object r1 = r1.getValue()
            va4 r1 = (defpackage.va4) r1
            dta r1 = (defpackage.dta) r1
            r1.getClass()
            boolean r0 = r0.b(r13, r4)
            return r0
        L_0x0185:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder
            r12.<init>()
            android.net.Uri r14 = r3.a
            java.lang.String r15 = defpackage.bb4.a(r14)
            android.net.Uri$Builder r12 = r12.encodedPath(r15)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.util.Set r8 = r3.c
            java.util.Iterator r17 = r8.iterator()
        L_0x019f:
            boolean r18 = r17.hasNext()
            if (r18 == 0) goto L_0x01ca
            java.lang.Object r18 = r17.next()
            r11 = r18
            java.lang.String r11 = (java.lang.String) r11
            r15.append(r11)
            r15.append(r6)
            java.lang.Object r11 = r10.get(r11)
            if (r11 == 0) goto L_0x01c2
            java.lang.String r11 = (java.lang.String) r11
            r15.append(r11)
            r15.append(r7)
            goto L_0x019f
        L_0x01c2:
            one.me.deeplink.MissedRequiredQueryParamsException r0 = new one.me.deeplink.MissedRequiredQueryParamsException
            java.util.LinkedHashSet r8 = (java.util.LinkedHashSet) r8
            r0.<init>(r14, r10, r8)
            throw r0
        L_0x01ca:
            java.lang.String r6 = r15.toString()
            java.lang.String r7 = "&"
            java.lang.String r6 = kotlin.text.StringsKt__StringsKt.removeSuffix((java.lang.String) r6, (java.lang.CharSequence) r7)
            android.net.Uri$Builder r6 = r12.encodedQuery(r6)
            android.net.Uri r6 = r6.build()
            java.lang.String r6 = r6.toString()
            ab4 r2 = r2.b(r6, r3, r4)     // Catch:{ all -> 0x0515 }
            if (r2 == 0) goto L_0x0506
            boolean r1 = r0.g
            java.lang.String r4 = ""
            if (r1 != 0) goto L_0x02ae
            ja4 r1 = r19.a()
            java.util.ArrayList r1 = r1.a()
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L_0x01fc
            goto L_0x02ae
        L_0x01fc:
            java.util.Iterator r1 = r1.iterator()
        L_0x0200:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x02ae
            java.lang.Object r5 = r1.next()
            zsa r5 = (defpackage.zsa) r5
            i9d r5 = r5.a
            java.lang.String r5 = r5.b
            if (r5 != 0) goto L_0x0213
            r5 = r4
        L_0x0213:
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x0200
            ja4 r0 = r19.a()
            bta r0 = (defpackage.bta) r0
            l9d r1 = r0.e()
            e9d r1 = r1.x()
            java.util.ArrayList r1 = r1.e()
            ws r3 = new ws
            r3.<init>((int) r9)
            java.util.List r4 = kotlin.collections.CollectionsKt.asReversedMutable(r1)
            java.util.Iterator r4 = r4.iterator()
        L_0x0238:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0252
            java.lang.Object r5 = r4.next()
            i9d r5 = (defpackage.i9d) r5
            java.lang.String r6 = r5.b
            java.lang.String r7 = r2.a
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 != 0) goto L_0x0252
            r3.add(r5)
            goto L_0x0238
        L_0x0252:
            r1.removeAll(r3)
            int r3 = r1.size()
            java.util.ListIterator r3 = r1.listIterator(r3)
        L_0x025d:
            boolean r4 = r3.hasPrevious()
            if (r4 == 0) goto L_0x0275
            java.lang.Object r4 = r3.previous()
            r5 = r4
            i9d r5 = (defpackage.i9d) r5
            java.lang.String r5 = r5.b
            java.lang.String r6 = r2.a
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x025d
            goto L_0x0276
        L_0x0275:
            r4 = 0
        L_0x0276:
            i9d r4 = (defpackage.i9d) r4
            if (r4 == 0) goto L_0x02a0
            zx3 r3 = r4.a
            if (r3 != 0) goto L_0x027f
            goto L_0x02a0
        L_0x027f:
            boolean r4 = r3 instanceof one.me.sdk.arch.Widget
            if (r4 == 0) goto L_0x0287
            r4 = r3
            one.me.sdk.arch.Widget r4 = (one.me.sdk.arch.Widget) r4
            goto L_0x0288
        L_0x0287:
            r4 = 0
        L_0x0288:
            if (r4 == 0) goto L_0x0290
            android.os.Bundle r2 = r2.c
            r4.updateArgs(r2)
            goto L_0x02a0
        L_0x0290:
            android.os.Bundle r4 = r3.getArgs()
            r4.clear()
            android.os.Bundle r3 = r3.getArgs()
            android.os.Bundle r2 = r2.c
            r3.putAll(r2)
        L_0x02a0:
            l9d r0 = r0.e()
            e9d r0 = r0.x()
            r2 = 0
            r0.P(r1, r2)
            r5 = 1
            return r5
        L_0x02ae:
            r5 = 1
            boolean r1 = r0.g
            if (r1 == 0) goto L_0x02b9
            java.util.ArrayList r0 = r0.f
            r0.add(r2)
            return r5
        L_0x02b9:
            ja4 r1 = r19.a()
            int r1 = r1.b()
            if (r1 != 0) goto L_0x02c5
            goto L_0x0345
        L_0x02c5:
            android.net.Uri r1 = r3.a
            java.lang.String r1 = defpackage.bb4.a(r1)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r13)
            if (r1 != 0) goto L_0x0345
            kotlin.Lazy r1 = r0.b
            java.lang.Object r1 = r1.getValue()
            va4 r1 = (defpackage.va4) r1
            dta r1 = (defpackage.dta) r1
            java.util.LinkedHashSet r1 = r1.b
            boolean r5 = r1 instanceof java.util.Collection
            if (r5 == 0) goto L_0x02e8
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L_0x02e8
            goto L_0x032f
        L_0x02e8:
            java.util.Iterator r1 = r1.iterator()
        L_0x02ec:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x032f
            java.lang.Object r5 = r1.next()
            ra4 r5 = (defpackage.ra4) r5
            ja4 r6 = r19.a()
            android.net.Uri r5 = r5.a
            java.lang.String r5 = defpackage.bb4.a(r5)
            java.util.ArrayList r7 = r6.a()
            int r7 = r7.size()
            r8 = 1
            if (r7 != r8) goto L_0x02ec
            java.util.ArrayList r6 = r6.a()
            java.lang.Object r6 = kotlin.collections.CollectionsKt.first(r6)
            zsa r6 = (defpackage.zsa) r6
            i9d r6 = r6.a
            java.lang.String r6 = r6.b
            if (r6 != 0) goto L_0x031e
            r6 = r4
        L_0x031e:
            java.lang.String r7 = "?"
            java.lang.String r6 = kotlin.text.StringsKt__StringsKt.substringBefore$default((java.lang.String) r6, (java.lang.String) r7, (java.lang.String) null, 2, (java.lang.Object) null)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x02ec
            boolean r1 = r3.d
            if (r1 == 0) goto L_0x032f
            goto L_0x0345
        L_0x032f:
            kotlin.Lazy r1 = r0.e
            java.lang.Object r1 = r1.getValue()
            wa4 r1 = (defpackage.wa4) r1
            java.util.LinkedHashSet r1 = r1.a
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L_0x0342
            sa4 r1 = defpackage.sa4.c
            goto L_0x0347
        L_0x0342:
            sa4 r1 = defpackage.sa4.b
            goto L_0x0347
        L_0x0345:
            sa4 r1 = defpackage.sa4.a
        L_0x0347:
            java.lang.String r3 = r0.a
            a67 r4 = defpackage.z68.b
            if (r4 != 0) goto L_0x034f
        L_0x034d:
            r7 = 0
            goto L_0x0373
        L_0x034f:
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x034d
            w78 r5 = defpackage.w78.o
            java.lang.String r6 = r2.a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "show, screen="
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = ", mode="
            r7.append(r6)
            r7.append(r1)
            java.lang.String r6 = r7.toString()
            r7 = 0
            r4.d(r5, r3, r6, r7)
        L_0x0373:
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x04fc
            r3 = 2
            r4 = 1
            if (r1 == r4) goto L_0x043c
            if (r1 != r3) goto L_0x0436
            ja4 r0 = r19.a()
            bta r0 = (defpackage.bta) r0
            l9d r1 = r0.e()
            e9d r1 = r1.x()
            r1.getClass()
            defpackage.bs0.y()
            defpackage.bs0.y()
            bg0 r3 = r1.a
            java.util.ArrayDeque r4 = r3.a
            int r4 = r4.size()
            r5 = 1
            if (r4 <= r5) goto L_0x03ac
            java.util.ArrayDeque r3 = r3.a
            java.lang.Object r3 = kotlin.collections.CollectionsKt.lastOrNull(r3)
            i9d r3 = (defpackage.i9d) r3
            r1.E(r3)
        L_0x03ac:
            l9d r1 = r0.e()
            e9d r1 = r1.x()
            java.util.ArrayList r1 = r1.e()
            int r3 = r1.size()
            if (r3 <= 0) goto L_0x0432
            java.lang.Object r1 = kotlin.collections.CollectionsKt.first(r1)
            i9d r1 = (defpackage.i9d) r1
            zx3 r1 = r1.a
            boolean r3 = r1 instanceof one.me.main.MainScreen
            if (r3 == 0) goto L_0x03cd
            one.me.main.MainScreen r1 = (one.me.main.MainScreen) r1
            goto L_0x03ce
        L_0x03cd:
            r1 = r7
        L_0x03ce:
            if (r1 != 0) goto L_0x03d3
            r8 = r9
            goto L_0x0505
        L_0x03d3:
            uc8 r3 = r1.h0()
            java.util.List r3 = r3.c
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x03df:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x03fe
            java.lang.Object r4 = r3.next()
            r5 = r4
            spa r5 = (defpackage.spa) r5
            java.lang.String r5 = r5.d
            ra4 r6 = r2.b
            android.net.Uri r6 = r6.a
            java.lang.String r6 = defpackage.bb4.a(r6)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x03df
            r11 = r4
            goto L_0x03ff
        L_0x03fe:
            r11 = r7
        L_0x03ff:
            spa r11 = (defpackage.spa) r11
            if (r11 != 0) goto L_0x041b
            java.lang.Class<one.me.main.MainScreen> r1 = one.me.main.MainScreen.class
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "invalid screen! "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            defpackage.z68.p(r1, r2)
            goto L_0x041e
        L_0x041b:
            r1.i0(r11)
        L_0x041e:
            bpa r0 = r0.e
            if (r0 == 0) goto L_0x042f
            java.lang.Object r0 = r0.b
            kotlin.Lazy r0 = (kotlin.Lazy) r0
            java.lang.Object r0 = r0.getValue()
            e24 r0 = (defpackage.e24) r0
            r0.getClass()
        L_0x042f:
            r8 = 1
            goto L_0x0505
        L_0x0432:
            r0.c(r2)
            goto L_0x042f
        L_0x0436:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x043c:
            ja4 r0 = r19.a()
            bta r0 = (defpackage.bta) r0
            r0.getClass()
            za4 r1 = r2.d
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x0480
            ya4 r2 = r2.f
            r4 = 1
            if (r1 == r4) goto L_0x046e
            if (r1 != r3) goto L_0x0468
            java.lang.Object r1 = r2.a()
            r8 r1 = (defpackage.r8) r1
            l9d r2 = r0.e()
            e9d r2 = r2.x()
            r1.a(r2)
        L_0x0465:
            r1 = 1
            goto L_0x04e9
        L_0x0468:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x046e:
            java.lang.Object r1 = r2.a()
            ly5 r1 = (defpackage.ly5) r1
            l9d r2 = r0.e()
            e9d r2 = r2.x()
            r1.a(r2)
            goto L_0x0465
        L_0x0480:
            android.os.Bundle r1 = r2.c
            java.lang.String r3 = "no_anim"
            java.lang.Boolean r3 = defpackage.o54.E(r3, r1)
            if (r3 == 0) goto L_0x048f
            boolean r3 = r3.booleanValue()
            goto L_0x0490
        L_0x048f:
            r3 = r9
        L_0x0490:
            java.lang.String r4 = "replace_top"
            java.lang.Boolean r1 = defpackage.o54.E(r4, r1)
            if (r1 == 0) goto L_0x049c
            boolean r9 = r1.booleanValue()
        L_0x049c:
            r1 = 1
            r3 = r3 ^ r1
            i9d r2 = defpackage.bta.d(r2, r3)
            boolean r3 = r0.b
            if (r3 == 0) goto L_0x04ac
            java.util.LinkedList r0 = r0.c
            r0.add(r2)
            goto L_0x04fa
        L_0x04ac:
            zx3 r3 = r2.a
            one.me.sdk.arch.Widget r3 = (one.me.sdk.arch.Widget) r3
            boolean r3 = r3.isDialog()
            if (r3 == 0) goto L_0x04d0
            if (r9 == 0) goto L_0x04c4
            l9d r3 = r0.e()
            e9d r3 = r3.K()
            r3.L(r2)
            goto L_0x04e9
        L_0x04c4:
            l9d r3 = r0.e()
            e9d r3 = r3.K()
            r3.G(r2)
            goto L_0x04e9
        L_0x04d0:
            if (r9 == 0) goto L_0x04de
            l9d r3 = r0.e()
            e9d r3 = r3.x()
            r3.L(r2)
            goto L_0x04e9
        L_0x04de:
            l9d r3 = r0.e()
            e9d r3 = r3.x()
            r3.G(r2)
        L_0x04e9:
            bpa r0 = r0.e
            if (r0 == 0) goto L_0x04fa
            java.lang.Object r0 = r0.b
            kotlin.Lazy r0 = (kotlin.Lazy) r0
            java.lang.Object r0 = r0.getValue()
            e24 r0 = (defpackage.e24) r0
            r0.getClass()
        L_0x04fa:
            r8 = r1
            goto L_0x0505
        L_0x04fc:
            r1 = 1
            ja4 r0 = r19.a()
            r0.c(r2)
            goto L_0x04fa
        L_0x0505:
            return r8
        L_0x0506:
            one.me.deeplink.FailedCreateScreenException r7 = new one.me.deeplink.FailedCreateScreenException
            r8 = 0
            r0 = r7
            r1 = r20
            r2 = r6
            r4 = r10
            r5 = r21
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            throw r7
        L_0x0515:
            r0 = move-exception
            r7 = r0
            one.me.deeplink.FailedCreateScreenException r8 = new one.me.deeplink.FailedCreateScreenException
            r0 = r8
            r1 = r20
            r2 = r6
            r4 = r10
            r5 = r21
            r6 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            throw r8
        L_0x0525:
            one.me.deeplink.MissedRequiredQueryParamsException r0 = new one.me.deeplink.MissedRequiredQueryParamsException
            java.util.Set r2 = r3.c
            java.util.LinkedHashSet r2 = (java.util.LinkedHashSet) r2
            r0.<init>(r1, r10, r2)
            throw r0
        L_0x052f:
            one.me.deeplink.MissedDeeplinkFactoryException r0 = new one.me.deeplink.MissedDeeplinkFactoryException
            java.lang.String r1 = r20.toString()
            java.lang.String r2 = "Missed factory or route for uri="
            java.lang.String r1 = defpackage.a81.m(r2, r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ta4.c(android.net.Uri, android.os.Bundle):boolean");
    }

    public final boolean d() {
        i9d i9d;
        zx3 zx3;
        if (a().b() <= 1) {
            return false;
        }
        bta bta = (bta) a();
        if (bta.b) {
            LinkedList linkedList = bta.c;
            if (!linkedList.isEmpty()) {
                linkedList.removeLast();
            }
        } else if (bta.b() <= 1 || (i9d = (i9d) CollectionsKt.lastOrNull(bta.e().x().e())) == null || (zx3 = i9d.a) == null) {
            return false;
        } else {
            if (zx3 instanceof qc6) {
                Widget widget = (Widget) ((qc6) zx3);
                a aVar = (a) CollectionsKt.lastOrNull(((b) widget.getActivity()).v().c.f());
                if (!Intrinsics.areEqual((Object) aVar != null ? aVar.getClass() : null, (Object) GalleryFragment.class)) {
                    ((b) widget.getActivity()).v().T();
                }
            }
            return bta.e().x().C();
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    public final void e(Function0 function0) {
        Object obj;
        this.g = true;
        ArrayList arrayList = this.f;
        arrayList.clear();
        try {
            function0.invoke();
            this.g = false;
            ja4 a2 = a();
            List<ab4> list = CollectionsKt.toList(arrayList);
            bta bta = (bta) a2;
            bta.getClass();
            ArrayList arrayList2 = new ArrayList();
            for (ab4 ab4 : list) {
                try {
                    Result.Companion companion = Result.Companion;
                    obj = Result.m23constructorimpl(bta.d(ab4, true));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.m23constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m29isFailureimpl(obj)) {
                    obj = null;
                }
                i9d i9d = (i9d) obj;
                if (i9d != null) {
                    arrayList2.add(i9d);
                }
            }
            bta.e().x().P(arrayList2, bta.g);
            arrayList.clear();
        } catch (Throwable th2) {
            this.g = false;
            throw th2;
        }
    }
}

package defpackage;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.text.StringsKt;

/* renamed from: xva  reason: default package */
public final class xva {
    public final Context a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final aj g = new aj();
    public final ConcurrentHashMap h = new ConcurrentHashMap();

    public xva(Context context, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5) {
        this.a = context;
        this.b = lazy;
        this.c = lazy2;
        this.d = lazy3;
        this.e = lazy4;
        this.f = lazy5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: gge} */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000e: MOVE  (r1v2 java.util.Collection) = (r19v0 java.util.List)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public final java.lang.CharSequence a(java.lang.CharSequence r18, java.util.List r19, defpackage.wa9 r20, boolean r21, int r22, boolean r23) {
        /*
            r17 = this;
            r10 = r17
            r0 = r18
            int r1 = r18.length()
            if (r1 != 0) goto L_0x000c
            goto L_0x0189
        L_0x000c:
            r1 = r19
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x0189
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x001a
            goto L_0x0189
        L_0x001a:
            gge r11 = new gge
            r11.<init>(r0)
            java.util.Iterator r12 = r19.iterator()
        L_0x0023:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0188
            java.lang.Object r0 = r12.next()
            ta9 r0 = (defpackage.ta9) r0
            long r13 = r0.a
            int r1 = r0.e
            int r15 = r0.d
            int r9 = r15 + r1
            sa9 r1 = r0.c
            int r1 = r1.ordinal()
            android.content.Context r2 = r10.a
            java.lang.String r8 = "MessageElementFormatter"
            switch(r1) {
                case 0: goto L_0x0181;
                case 1: goto L_0x0181;
                case 2: goto L_0x0173;
                case 3: goto L_0x0165;
                case 4: goto L_0x0157;
                case 5: goto L_0x00fb;
                case 6: goto L_0x00ef;
                case 7: goto L_0x00e3;
                case 8: goto L_0x00d7;
                case 9: goto L_0x00cb;
                case 10: goto L_0x004a;
                default: goto L_0x0044;
            }
        L_0x0044:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x004a:
            if (r23 == 0) goto L_0x00c7
            if (r22 <= 0) goto L_0x0051
            r3 = r22
            goto L_0x0065
        L_0x0051:
            ogf r0 = defpackage.puf.i
            r0.getClass()
            uy4 r1 = defpackage.uy4.b
            long r0 = r0.g(r1)
            float r0 = defpackage.so4.c(r0, r2)
            int r0 = kotlin.math.MathKt.roundToInt((float) r0)
            r3 = r0
        L_0x0065:
            zi r0 = new zi
            r0.<init>(r13, r3)
            java.util.concurrent.ConcurrentHashMap r7 = r10.h
            vva r6 = new vva
            r1 = r6
            r2 = r17
            r4 = r13
            r10 = r6
            r6 = r20
            r18 = r12
            r12 = r7
            r7 = r11
            r16 = r8
            r8 = r15
            r19 = r9
            r1.<init>(r2, r3, r4, r6, r7, r8, r9)
            yi r1 = new yi
            r2 = 12
            r1.<init>(r2, r10)
            java.lang.Object r0 = r12.computeIfAbsent(r0, r1)
            cl r0 = (defpackage.cl) r0
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch:{ all -> 0x00a8 }
            java.lang.Class<i35> r1 = defpackage.i35.class
            r3 = r19
            defpackage.ld8.m0(r11, r1, r15, r3)     // Catch:{ all -> 0x00a8 }
            dl r1 = new dl     // Catch:{ all -> 0x00a8 }
            r1.<init>(r13, r0)     // Catch:{ all -> 0x00a8 }
            r0 = 33
            r11.setSpan(r1, r15, r3, r0)     // Catch:{ all -> 0x00a8 }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00a8 }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x00a8 }
            goto L_0x00b3
        L_0x00a8:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)
        L_0x00b3:
            java.lang.Throwable r1 = kotlin.Result.m26exceptionOrNullimpl(r0)
            if (r1 == 0) goto L_0x00c0
            java.lang.String r2 = "Can't process animoji by message element"
            r4 = r16
            defpackage.z68.f(r4, r2, r1)
        L_0x00c0:
            kotlin.Result.m22boximpl(r0)
        L_0x00c3:
            r5 = r21
            goto L_0x0128
        L_0x00c7:
            r10 = r17
            goto L_0x0023
        L_0x00cb:
            r3 = r9
            r18 = r12
            mx6 r0 = new mx6
            r0.<init>()
            defpackage.te8.B(r11, r0, r15, r3)
            goto L_0x00c3
        L_0x00d7:
            r3 = r9
            r18 = r12
            gvf r0 = new gvf
            r0.<init>()
            defpackage.te8.B(r11, r0, r15, r3)
            goto L_0x00c3
        L_0x00e3:
            r3 = r9
            r18 = r12
            d43 r0 = new d43
            r0.<init>()
            defpackage.te8.B(r11, r0, r15, r3)
            goto L_0x00c3
        L_0x00ef:
            r3 = r9
            r18 = r12
            uxe r0 = new uxe
            r0.<init>()
            defpackage.te8.B(r11, r0, r15, r3)
            goto L_0x00c3
        L_0x00fb:
            r4 = r8
            r3 = r9
            r18 = r12
            r1 = 0
            java.util.Map r0 = r0.f
            if (r0 == 0) goto L_0x0151
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L_0x010b
            goto L_0x0151
        L_0x010b:
            java.lang.String r5 = "url"
            boolean r6 = r0.containsKey(r5)
            if (r6 != 0) goto L_0x011a
            java.lang.String r0 = "Link message element is missing"
            defpackage.z68.f(r4, r0, r1)
            goto L_0x0188
        L_0x011a:
            java.lang.Object r0 = r0.get(r5)
            boolean r4 = r0 instanceof java.lang.String
            if (r4 == 0) goto L_0x0125
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0126
        L_0x0125:
            r0 = r1
        L_0x0126:
            if (r0 != 0) goto L_0x012e
        L_0x0128:
            r10 = r17
            r12 = r18
            goto L_0x0023
        L_0x012e:
            js9 r4 = defpackage.fu4.k
            fu4 r2 = r4.e(r2)
            k2b r2 = r2.f()
            hq2 r2 = r2.a()
            r5 = r21
            ws0 r2 = r2.a(r5)
            zs0 r2 = r2.b
            int r2 = r2.b
            ky7 r4 = new ky7
            r4.<init>(r0, r2)
            r4.c = r1
            defpackage.te8.B(r11, r4, r15, r3)
            goto L_0x0128
        L_0x0151:
            java.lang.String r0 = "missing attributes"
            defpackage.z68.f(r4, r0, r1)
            goto L_0x0188
        L_0x0157:
            r5 = r21
            r3 = r9
            r18 = r12
            ol7 r0 = new ol7
            r0.<init>()
            defpackage.te8.B(r11, r0, r15, r3)
            goto L_0x0128
        L_0x0165:
            r5 = r21
            r3 = r9
            r18 = r12
            eq0 r0 = new eq0
            r0.<init>()
            defpackage.te8.B(r11, r0, r15, r3)
            goto L_0x0128
        L_0x0173:
            r5 = r21
            r3 = r9
            r18 = r12
            xs9 r0 = new xs9
            r0.<init>()
            defpackage.te8.B(r11, r0, r15, r3)
            goto L_0x0128
        L_0x0181:
            r5 = r21
            r18 = r12
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0128
        L_0x0188:
            return r11
        L_0x0189:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xva.a(java.lang.CharSequence, java.util.List, wa9, boolean, int, boolean):java.lang.CharSequence");
    }

    public final List c(CharSequence charSequence, boolean z) {
        List list;
        List list2;
        List list3;
        Object obj;
        Object obj2;
        Map map;
        sa9 sa9;
        sa9 sa92;
        Object obj3;
        int i;
        int i2;
        CharSequence charSequence2 = charSequence;
        if (charSequence.length() == 0 || !(charSequence2 instanceof Spannable)) {
            return CollectionsKt.emptyList();
        }
        Spannable spannable = (Spannable) charSequence2;
        int length = spannable.length();
        SpannableString spannableString = spannable;
        if (length != 0) {
            if (StringsKt.trim((CharSequence) spannable).length() == 0) {
                spannableString = new SpannableString("");
            } else {
                SpannableString spannableString2 = new SpannableString(spannable);
                int length2 = spannableString2.length();
                char[] cArr = new char[length2];
                spannableString2.getChars(0, length2, cArr, 0);
                if (Character.isSpaceChar(cArr[0]) || cArr[0] == 10) {
                    i = 0;
                    while (i < length2 && (Character.isSpaceChar(cArr[i]) || cArr[i] == 10)) {
                        i++;
                    }
                } else {
                    i = 0;
                }
                int i3 = length2 - 1;
                if (Character.isSpaceChar(cArr[i3]) || cArr[i3] == 10) {
                    i2 = length2;
                    while (i2 > 1) {
                        int i4 = i2 - 1;
                        if (!Character.isSpaceChar(cArr[i4]) && cArr[i4] != 10) {
                            break;
                        }
                        i2--;
                    }
                } else {
                    i2 = length2;
                }
                if (i == 0 && i2 == length2) {
                    spannableString = spannableString2;
                } else {
                    SpannableString spannableString3 = (SpannableString) spannableString2.subSequence(i, i2);
                    Iterator it = ArrayIteratorKt.iterator(spannableString3.getSpans(0, spannableString3.length(), Object.class));
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next != null) {
                            int spanStart = spannableString3.getSpanStart(next);
                            int spanEnd = spannableString3.getSpanEnd(next);
                            if (spanStart == -1 || spanStart > spannableString3.length()) {
                                spannableString3.removeSpan(next);
                            } else if (spanEnd == -1 || spanEnd > spannableString3.length()) {
                                spannableString3.removeSpan(next);
                            }
                        }
                    }
                    spannableString = spannableString3;
                }
            }
        }
        List createListBuilder = CollectionsKt.createListBuilder();
        if (spannableString.length() == 0) {
            list = CollectionsKt.emptyList();
        } else {
            try {
                obj3 = spannableString.getSpans(0, spannableString.length(), xa9.class);
            } catch (Throwable unused) {
                obj3 = null;
            }
            if (obj3 == null) {
                obj3 = new xa9[0];
            }
            ArrayList arrayList = new ArrayList();
            for (xa9 xa9 : (xa9[]) obj3) {
                int spanStart2 = spannableString.getSpanStart(xa9);
                ta9 ta9 = xa9.a;
                ta9.getClass();
                ta9 b2 = ta9.a(ta9, spanStart2, spannableString.getSpanEnd(xa9) - spanStart2, 39).b();
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(arrayList);
            ihf.c(spannableString, hhf.a, nab.b, true, new ij5(this, z, linkedHashSet));
            list = CollectionsKt.toList(linkedHashSet);
        }
        if (!(!list.isEmpty())) {
            list = null;
        }
        if (list != null) {
            createListBuilder.addAll(list);
        }
        if (spannableString.length() == 0) {
            list2 = CollectionsKt.emptyList();
        } else {
            try {
                obj2 = spannableString.getSpans(0, spannableString.length(), jf8.class);
            } catch (Throwable unused2) {
                obj2 = null;
            }
            if (obj2 == null) {
                obj2 = new jf8[0];
            }
            jf8[] jf8Arr = (jf8[]) obj2;
            if (jf8Arr.length == 0) {
                list2 = CollectionsKt.emptyList();
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (jf8 jf8 : jf8Arr) {
                    int spanStart3 = spannableString.getSpanStart(jf8);
                    int spanEnd2 = spannableString.getSpanEnd(jf8) - spanStart3;
                    switch (jf8.getType().ordinal()) {
                        case 1:
                            sa92 = sa9.o;
                            break;
                        case 2:
                            sa92 = sa9.v;
                            break;
                        case 3:
                            sa92 = sa9.z;
                            break;
                        case 4:
                            sa92 = sa9.c;
                            break;
                        case 5:
                            sa9 sa93 = sa9.w;
                            map = Collections.singletonMap("url", ((ky7) jf8).b);
                            sa9 = sa93;
                            break;
                        case 6:
                            sa92 = sa9.x;
                            break;
                        case 7:
                            sa92 = sa9.X;
                            break;
                        case 8:
                            sa92 = sa9.y;
                            break;
                        default:
                            a67 a67 = z68.b;
                            if (a67 != null && a67.c()) {
                                a67.d(w78.x, "yva", "Unknown markdown span type = " + jf8.getType(), (Throwable) null);
                            }
                            sa9 = null;
                            map = null;
                            break;
                    }
                    map = null;
                    sa9 = sa92;
                    if (sa9 != null) {
                        arrayList2.add(new ta9(0, (String) null, sa9, spanStart3, spanEnd2, map));
                    }
                }
                list2 = arrayList2;
            }
        }
        if (!(!list2.isEmpty())) {
            list2 = null;
        }
        if (list2 != null) {
            createListBuilder.addAll(list2);
        }
        if (spannableString.length() == 0) {
            list3 = CollectionsKt.emptyList();
        } else {
            try {
                obj = spannableString.getSpans(0, spannableString.length(), dl.class);
            } catch (Throwable unused3) {
                obj = null;
            }
            if (obj == null) {
                obj = new dl[0];
            }
            dl[] dlVarArr = (dl[]) obj;
            if (dlVarArr.length == 0) {
                list3 = CollectionsKt.emptyList();
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (dl dlVar : dlVarArr) {
                    int spanStart4 = spannableString.getSpanStart(dlVar);
                    ta9 ta92 = r9;
                    ta9 ta93 = new ta9(dlVar.x, (String) null, sa9.Y, spanStart4, spannableString.getSpanEnd(dlVar) - spanStart4, (Map) null);
                    arrayList3.add(ta92);
                }
                list3 = arrayList3;
            }
        }
        List list4 = true ^ list3.isEmpty() ? list3 : null;
        if (list4 != null) {
            createListBuilder.addAll(list4);
        }
        return CollectionsKt.build(createListBuilder);
    }
}

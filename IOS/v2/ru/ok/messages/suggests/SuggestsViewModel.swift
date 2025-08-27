package ru.ok.messages.suggests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ok/messages/suggests/SuggestsViewModel;", "Lyag;", "Ln1a;", "c2f", "b2f", "o83", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSuggestsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestsViewModel.kt\nru/ok/messages/suggests/SuggestsViewModel\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 LiveDataExt.kt\nru/ok/tamtam/shared/lifecycle/LiveDataExtKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,873:1\n46#2,4:874\n49#3:878\n51#3:882\n46#4:879\n51#4:881\n105#5:880\n13346#6,2:883\n13346#6,2:902\n13346#6,2:904\n774#7:885\n865#7,2:886\n1734#7,3:889\n774#7:892\n865#7,2:893\n774#7:895\n865#7,2:896\n1755#7,3:898\n77#8:888\n1#9:901\n*S KotlinDebug\n*F\n+ 1 SuggestsViewModel.kt\nru/ok/messages/suggests/SuggestsViewModel\n*L\n128#1:874,4\n249#1:878\n249#1:882\n249#1:879\n249#1:881\n249#1:880\n318#1:883,2\n716#1:902,2\n723#1:904,2\n343#1:885\n343#1:886,2\n388#1:889,3\n390#1:892\n390#1:893,2\n393#1:895\n393#1:896,2\n524#1:898,3\n356#1:888\n*E\n"})
public final class SuggestsViewModel extends yag implements n1a {
    public static final /* synthetic */ int I = 0;
    public final etc A;
    public final xme B;
    public final etc C;
    public p1a D;
    public i1a E;
    public Runnable F;
    public String G;
    public aje H;
    public final nd c;
    public final gaf d;
    public final q04 e;
    public final tld f;
    public final tcf g;
    public final yva h;
    public final Lazy i;
    public final a32 j;
    public final r1f k;
    public final b33 l;
    public pm7 m;
    public final xme n = f6e.a(Boolean.FALSE);
    public final xme o;
    public final etc p;
    public final etc q;
    public final xme r;
    public final etc s;
    public u1f t;
    public b2f u;
    public List v;
    public c2f w;
    public final p2f x;
    public aje y;
    public h69 z;

    /* JADX WARNING: type inference failed for: r7v4, types: [kotlin.coroutines.AbstractCoroutineContextElement, p2f] */
    public SuggestsViewModel(long j2, rl rlVar, jd8 jd8, mq0 mq0, jbf jbf, hxd hxd, nd ndVar, gaf gaf, q04 q04, tld tld, tcf tcf, r62 r62, km3 km3, yva yva, ltb ltb, ptb ptb, Lazy lazy, Lazy lazy2) {
        gaf gaf2 = gaf;
        this.c = ndVar;
        this.d = gaf2;
        this.e = q04;
        this.f = tld;
        this.g = tcf;
        this.h = yva;
        this.i = lazy2;
        a32 G2 = r62.G(j2);
        this.j = G2;
        xme a = f6e.a((Object) null);
        this.o = a;
        this.p = new etc(a);
        this.q = new etc(f6e.a(0));
        xme a2 = f6e.a(new o85(y1f.a));
        this.r = a2;
        this.s = new etc(a2);
        this.t = u1f.g;
        this.v = CollectionsKt.emptyList();
        this.x = new AbstractCoroutineContextElement(r04.a);
        this.A = new etc(f6e.a((Object) null));
        xme a3 = f6e.a((Object) null);
        this.B = a3;
        this.C = new etc(a3);
        kv0.K();
        if (G2 == null) {
            this.k = null;
            this.l = null;
            return;
        }
        r1f r1f = new r1f(rlVar, jd8, r62, mq0, G2, ((kbf) jbf).a(), tld, yva, ltb, ptb, hxd, lazy2, lazy, new w1f(this));
        this.k = r1f;
        l72 l72 = G2.b.b;
        this.l = new b33(l72, gaf2, r1f, (o1f) new su3(l72, km3, gaf, tld, yva, ltb, ptb, lazy, lazy2));
    }

    public static final void j(SuggestsViewModel suggestsViewModel) {
        m72 m72;
        p1a p1a = suggestsViewModel.D;
        p1a p1a2 = null;
        if (p1a == null) {
            p1a = null;
        }
        CharSequence Y = p1a.Y();
        r1f r1f = suggestsViewModel.k;
        boolean z2 = false;
        if (r1f != null) {
            ArrayList arrayList = new ArrayList(r1f.q);
            int size = (Y == null || Y.length() == 0) ? arrayList.size() : new ArrayList(r1f.p).size();
            a32 a32 = suggestsViewModel.j;
            if (((a32 == null || (m72 = a32.b) == null) ? null : m72.b) == l72.a) {
                if (size > 0 && (Y == null || Y.length() == 0)) {
                    z2 = true;
                }
            } else if (Y != null && Y.length() != 0 && Y.length() >= 3 && !arrayList.isEmpty() && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String str = ((sq0) it.next()).b;
                        if (str != null && StringsKt__StringsJVMKt.startsWith$default(Y.toString(), str, false, 2, (Object) null)) {
                            z2 = hhf.b.matcher(Y).matches();
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        p1a p1a3 = suggestsViewModel.D;
        if (p1a3 != null) {
            p1a2 = p1a3;
        }
        sff a = p1a2.o.a();
        a.i = z2;
        p1a2.o = new tff(a);
        f2a f2a = p1a2.a;
        if (f2a != null) {
            ((s3a) f2a).Z(p1a2.o);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (((java.util.Collection) r0).isEmpty() != false) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List l(java.util.List r4, defpackage.c2f r5) {
        /*
            r0 = r4
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0011
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0011
            goto L_0x0070
        L_0x0011:
            java.util.Iterator r1 = r0.iterator()
        L_0x0015:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0070
            java.lang.Object r2 = r1.next()
            zuf r2 = (defpackage.zuf) r2
            tze r2 = r2.b
            sze r2 = r2.b
            sze r3 = defpackage.sze.a
            if (r2 == r3) goto L_0x002a
            goto L_0x0015
        L_0x002a:
            c2f r1 = defpackage.c2f.a
            if (r5 != r1) goto L_0x004e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r0.iterator()
        L_0x0037:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0070
            java.lang.Object r0 = r5.next()
            r1 = r0
            zuf r1 = (defpackage.zuf) r1
            boolean r1 = r1.f
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0037
            r4.add(r0)
            goto L_0x0037
        L_0x004e:
            c2f r1 = defpackage.c2f.b
            if (r5 != r1) goto L_0x0070
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r0.iterator()
        L_0x005b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0070
            java.lang.Object r0 = r5.next()
            r1 = r0
            zuf r1 = (defpackage.zuf) r1
            boolean r1 = r1.f
            if (r1 == 0) goto L_0x005b
            r4.add(r0)
            goto L_0x005b
        L_0x0070:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.suggests.SuggestsViewModel.l(java.util.List, c2f):java.util.List");
    }

    public final void a(p1a p1a) {
        this.D = p1a;
    }

    public final void b(i1a i1a) {
        this.E = i1a;
    }

    public final boolean c() {
        if (((o85) this.s.a.getValue()).a instanceof z1f) {
            r5a r5a = new r5a();
            xme xme = this.B;
            xme.getClass();
            xme.m((Object) null, r5a);
            b2f b2f = this.u;
            if (b2f != null) {
                o(b2f);
            }
            return true;
        } else if (!((Boolean) this.n.getValue()).booleanValue()) {
            return false;
        } else {
            hsg.l(this.o);
            this.t = u1f.g;
            b33 b33 = this.l;
            if (b33 != null) {
                o1f o1f = (o1f) b33.c;
                o1f.clear();
                su3 su3 = (su3) b33.o;
                su3.clear();
                o1f.a();
                su3.getClass();
                b33.v = null;
                b33.y = null;
                b33.w = null;
                b33.x = null;
            }
            aje aje = this.H;
            if (aje != null) {
                aje.b((CancellationException) null);
            }
            this.G = null;
            return true;
        }
    }

    public final void d() {
        pm7 pm7 = this.m;
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
    }

    public final void e() {
        p1a p1a = this.D;
        if (p1a == null) {
            p1a = null;
        }
        ps5 ps5 = new ps5(kv0.h(p1a.W()), new j2f(this, (Continuation) null), 5);
        osa osa = (osa) this.d;
        this.m = bs0.K(bs0.F(new ps5(bs0.F(new zjb(bs0.v(bs0.F(ps5, osa.c()), 200), this, 10), osa.a()), new k2f(this, (Continuation) null), 5), osa.a()), b0h.C(this));
        Runnable runnable = this.F;
        if (runnable != null) {
            runnable.run();
        }
        this.F = null;
    }

    public final void i() {
        b33 b33 = this.l;
        if (b33 != null) {
            o1f o1f = (o1f) b33.c;
            o1f.clear();
            su3 su3 = (su3) b33.o;
            su3.clear();
            o1f.a();
            su3.getClass();
            b33.v = null;
            b33.y = null;
            b33.w = null;
            b33.x = null;
        }
        this.E = null;
        aje aje = this.y;
        if (aje != null) {
            aje.b((CancellationException) null);
        }
    }

    public final boolean k() {
        m72 m72;
        p1a p1a = this.D;
        Integer num = null;
        if (p1a == null) {
            p1a = null;
        }
        if (!Intrinsics.areEqual((Object) this.t.a, (Object) p1a.Y().toString())) {
            return false;
        }
        b2f b2f = (b2f) ((o85) this.r.getValue()).a;
        if (b2f instanceof a2f) {
            a2f a2f = (a2f) b2f;
            if (a2f.c == c2f.a) {
                a32 a32 = this.j;
                if (!(a32 == null || (m72 = a32.b) == null)) {
                    num = Integer.valueOf(m72.c());
                }
                if (num != null) {
                    int intValue = num.intValue() - 1;
                    ArrayList arrayList = new ArrayList();
                    for (Object next : a2f.a) {
                        if (!((zuf) next).f) {
                            arrayList.add(next);
                        }
                    }
                    if (intValue == arrayList.size()) {
                        return false;
                    }
                }
            }
        }
        boolean z2 = this.t.f;
        z68.c("SuggestsViewModel", "canLoadMore: " + z2, new Object[0]);
        return z2;
    }

    public final void m(String str) {
        aje aje;
        b33 b33 = this.l;
        if (b33 != null) {
            kv0.J();
            String y2 = vzg.y(str);
            z68.c("SuggestsViewModel", "loadMore query=" + y2, new Object[0]);
            if (!Intrinsics.areEqual((Object) this.G, (Object) str) || (aje = this.H) == null || !aje.isActive()) {
                aje aje2 = this.H;
                if (aje2 != null) {
                    aje2.b((CancellationException) null);
                }
                if (str == null || str.length() == 0) {
                    this.t = u1f.g;
                    o(y1f.a);
                    return;
                }
                this.G = str;
                this.H = ev0.v(b0h.C(this), this.e.plus(this.x), (f14) null, new f2f(this, str, b33, (Continuation) null), 2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        r6 = defpackage.erd.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(defpackage.zuf r17, java.lang.CharSequence r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = 3
            r4 = 1
            tze r5 = r0.b
            sze r6 = r5.b
            java.util.Set r7 = defpackage.avf.a
            boolean r6 = r7.contains(r6)
            java.lang.CharSequence r7 = r0.d
            java.lang.CharSequence r8 = r0.c
            if (r6 == 0) goto L_0x001a
        L_0x0018:
            r6 = r8
            goto L_0x0029
        L_0x001a:
            erd r6 = defpackage.erd.b
            erd r9 = r0.g
            if (r9 != r6) goto L_0x0021
            goto L_0x0018
        L_0x0021:
            erd r6 = defpackage.erd.a
            if (r9 != r6) goto L_0x0027
            r6 = r7
            goto L_0x0029
        L_0x0027:
            java.lang.CharSequence r6 = r5.e
        L_0x0029:
            if (r6 == 0) goto L_0x0031
            int r9 = r6.length()
            if (r9 != 0) goto L_0x0036
        L_0x0031:
            java.lang.CharSequence r6 = r5.e
            if (r6 != 0) goto L_0x0036
            return
        L_0x0036:
            sze r5 = r5.b
            int[] r9 = defpackage.d2f.$EnumSwitchMapping$0
            int r5 = r5.ordinal()
            r5 = r9[r5]
            r9 = 32
            if (r5 != r3) goto L_0x0051
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r6)
            int r2 = r0.length()
            r3 = r2
            r2 = r0
            goto L_0x0153
        L_0x0051:
            p1a r5 = r1.D
            if (r5 != 0) goto L_0x0056
            r5 = 0
        L_0x0056:
            int r5 = r5.X()
            boolean r11 = r2 instanceof android.text.SpannableStringBuilder
            if (r11 == 0) goto L_0x0063
            h69 r11 = r1.z
            android.text.SpannableStringBuilder r2 = (android.text.SpannableStringBuilder) r2
            goto L_0x006a
        L_0x0063:
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder
            r11.<init>(r2)
            r2 = r11
            r11 = 0
        L_0x006a:
            int r12 = r2.getSpanStart(r11)
            int r11 = r2.getSpanEnd(r11)
            r13 = -1
            if (r11 == r13) goto L_0x0079
            if (r12 == r13) goto L_0x0079
            r14 = r12
            goto L_0x007d
        L_0x0079:
            int r14 = defpackage.p3a.t(r2, r5)
        L_0x007d:
            if (r12 == r13) goto L_0x0082
            if (r11 == r13) goto L_0x0082
            goto L_0x009c
        L_0x0082:
            int r11 = r2.length()
            if (r5 >= r11) goto L_0x0097
            char r11 = r2.charAt(r5)
            if (r11 == r9) goto L_0x0095
            r12 = 10
            if (r11 != r12) goto L_0x0093
            goto L_0x0095
        L_0x0093:
            int r5 = r5 + r4
            goto L_0x0082
        L_0x0095:
            r11 = r5
            goto L_0x009c
        L_0x0097:
            int r5 = r2.length()
            goto L_0x0095
        L_0x009c:
            if (r14 == r13) goto L_0x01b5
            if (r11 != r13) goto L_0x00a2
            goto L_0x01b5
        L_0x00a2:
            r2.replace(r14, r11, r6)
            if (r8 == 0) goto L_0x014d
            int r5 = r8.length()
            if (r5 != 0) goto L_0x00af
            goto L_0x014d
        L_0x00af:
            if (r7 == 0) goto L_0x014d
            int r5 = r7.length()
            if (r5 != 0) goto L_0x00b9
            goto L_0x014d
        L_0x00b9:
            h69 r5 = new h69
            kotlin.ranges.IntRange r7 = new kotlin.ranges.IntRange
            int r8 = r6.length()
            int r8 = r8 + r14
            r7.<init>(r14, r8)
            int r8 = r6.length()
            r6.toString()
            qo3 r11 = new qo3
            r11.<init>(r3, r1, r0)
            int r3 = r0.h
            r5.<init>(r3, r7, r8, r11)
            int r3 = r2.length()
            r7 = 0
            java.lang.Class<h69> r8 = defpackage.h69.class
            java.lang.Object[] r3 = r2.getSpans(r7, r3, r8)
            h69[] r3 = (defpackage.h69[]) r3
            if (r3 == 0) goto L_0x00f6
            int r8 = r3.length
            r11 = r7
        L_0x00e7:
            if (r11 >= r8) goto L_0x00f6
            r12 = r3[r11]
            int r13 = r2.getSpanStart(r12)
            if (r14 != r13) goto L_0x00f4
            r2.removeSpan(r12)
        L_0x00f4:
            int r11 = r11 + r4
            goto L_0x00e7
        L_0x00f6:
            int r3 = r2.length()
            java.lang.Class<xa9> r8 = defpackage.xa9.class
            java.lang.Object[] r3 = r2.getSpans(r7, r3, r8)
            xa9[] r3 = (defpackage.xa9[]) r3
            if (r3 == 0) goto L_0x0117
            int r11 = r3.length
            r12 = r7
            r13 = 0
        L_0x0107:
            if (r12 >= r11) goto L_0x0118
            r15 = r3[r12]
            int r10 = r2.getSpanStart(r15)
            if (r14 != r10) goto L_0x0115
            r2.removeSpan(r15)
            r13 = r15
        L_0x0115:
            int r12 = r12 + r4
            goto L_0x0107
        L_0x0117:
            r13 = 0
        L_0x0118:
            int r3 = r6.length()
            int r3 = r3 + r14
            r10 = 33
            r2.setSpan(r5, r14, r3, r10)
            if (r13 != 0) goto L_0x0132
            int r3 = r6.length()
            int r3 = r3 + r14
            java.lang.Object[] r3 = r2.getSpans(r14, r3, r8)
            if (r3 == 0) goto L_0x0132
            int r3 = r3.length
            if (r3 != 0) goto L_0x014d
        L_0x0132:
            ta9 r3 = new ta9
            sa9 r5 = defpackage.sa9.a
            int r5 = r6.length()
            long r10 = r0.i
            r3.<init>(r10, r5)
            yva r0 = r1.h
            java.lang.CharSequence r0 = r0.b(r6, r3, r7, r4)
            int r3 = r0.length()
            int r3 = r3 + r14
            r2.replace(r14, r3, r0)
        L_0x014d:
            int r0 = r6.length()
            int r0 = r0 + r14
            r3 = r0
        L_0x0153:
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x0162 }
            char r0 = r2.charAt(r3)     // Catch:{ all -> 0x0162 }
            java.lang.Character r0 = java.lang.Character.valueOf(r0)     // Catch:{ all -> 0x0162 }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x0162 }
            goto L_0x016d
        L_0x0162:
            r0 = move-exception
            kotlin.Result$Companion r5 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)
        L_0x016d:
            boolean r5 = kotlin.Result.m29isFailureimpl(r0)
            if (r5 == 0) goto L_0x0174
            r0 = 0
        L_0x0174:
            java.lang.Character r0 = (java.lang.Character) r0
            if (r0 == 0) goto L_0x017e
            char r0 = r0.charValue()
            if (r0 == r9) goto L_0x0187
        L_0x017e:
            int r0 = r2.length()
            java.lang.String r5 = " "
            r2.insert(r0, r5)
        L_0x0187:
            p1a r0 = r1.D
            if (r0 != 0) goto L_0x018c
            r0 = 0
        L_0x018c:
            f2a r0 = r0.a
            if (r0 != 0) goto L_0x0191
            goto L_0x01a1
        L_0x0191:
            s3a r0 = (defpackage.s3a) r0
            ru.ok.messages.messages.widgets.MessageComposeEditText r5 = r0.X
            r5.setText(r2)
            int r2 = r2.length()
            ru.ok.messages.messages.widgets.MessageComposeEditText r0 = r0.X     // Catch:{ Exception -> 0x01a1 }
            r0.setSelection(r2)     // Catch:{ Exception -> 0x01a1 }
        L_0x01a1:
            p1a r0 = r1.D
            if (r0 != 0) goto L_0x01a7
            r10 = 0
            goto L_0x01a8
        L_0x01a7:
            r10 = r0
        L_0x01a8:
            int r3 = r3 + r4
            f2a r0 = r10.a
            if (r0 != 0) goto L_0x01ae
            goto L_0x01b5
        L_0x01ae:
            s3a r0 = (defpackage.s3a) r0
            ru.ok.messages.messages.widgets.MessageComposeEditText r0 = r0.X     // Catch:{ Exception -> 0x01b5 }
            r0.setSelection(r3)     // Catch:{ Exception -> 0x01b5 }
        L_0x01b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.suggests.SuggestsViewModel.n(zuf, java.lang.CharSequence):void");
    }

    public final void o(b2f b2f) {
        o85 o85 = new o85(b2f);
        xme xme = this.r;
        xme.getClass();
        xme.m((Object) null, o85);
        if (b2f instanceof y1f) {
            this.w = null;
        }
        if (this.E != null) {
            ev0.v(b0h.C(this), ((osa) this.d).c(), (f14) null, new o2f(this, b2f, (Continuation) null), 2);
        }
    }
}

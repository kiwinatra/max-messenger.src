package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;

/* renamed from: n71  reason: default package */
public final class n71 extends xag {
    public final xme X;
    public final xme Y;
    public final xme Z;
    public final x71 b;
    public final lf1 c;
    public final hj7 o;
    public final zp1 v;
    public final xme v0;
    public final Lazy w;
    public Long w0;
    public final Lazy x;
    public final zqd y;
    public final Lazy z;

    /* JADX WARNING: type inference failed for: r0v0, types: [hj7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v3, types: [ic3, java.lang.Object] */
    public n71(Context context, x71 x71, lf1 lf1) {
        sjd sjd = sjd.a;
        long s = ((qjd) ((x23) sjd.getAccessor().g(x23.class))).s();
        ? obj = new Object();
        obj.o = new ArrayList();
        obj.v = new ArrayList();
        obj.w = Collections.emptyList();
        obj.c = s;
        obj.a = 14400000;
        obj.b = (long) 10;
        zp1 zp1 = (zp1) sjd.getAccessor().g(zp1.class);
        Lazy lazy = rjd.w;
        Lazy lazy2 = rjd.F;
        ? obj2 = new Object();
        obj2.a = context;
        z71 z71 = new z71(obj2, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        obj2.b = LazyKt.lazy(lazyThreadSafetyMode, z71);
        obj2.c = LazyKt.lazy(lazyThreadSafetyMode, new z71(obj2, 1));
        obj2.o = LazyKt.lazy(lazyThreadSafetyMode, new z71(obj2, 2));
        obj2.v = LazyKt.lazy(lazyThreadSafetyMode, new z71(obj2, 3));
        obj2.w = LazyKt.lazy(lazyThreadSafetyMode, new z71(obj2, 4));
        obj2.x = LazyKt.lazy(lazyThreadSafetyMode, new z71(obj2, 5));
        zqd zqd = new zqd((ic3) obj2);
        Lazy h = u61.a.getAccessor().h(tq1.class);
        this.b = x71;
        this.c = lf1;
        this.o = obj;
        this.v = zp1;
        this.w = lazy;
        this.x = lazy2;
        this.y = zqd;
        this.z = h;
        xme a = f6e.a(m7b.a);
        this.X = a;
        this.Y = a;
        xme a2 = f6e.a(Boolean.FALSE);
        this.Z = a2;
        this.v0 = a2;
        l();
        zp1.getClass();
        zp1.i(new xp1(zp1, 5));
    }

    public final mz6 j(long j) {
        uz6 uz6;
        n7b n7b = (n7b) this.X.getValue();
        if (!(n7b instanceof l7b) || (uz6 = (uz6) ((l7b) n7b).a.get(Long.valueOf(j))) == null) {
            return null;
        }
        return uz6.Y;
    }

    public final boolean k() {
        hj7 hj7 = this.o;
        t9a t9a = x71.b;
        x71 x71 = this.b;
        t9a.getClass();
        if (!((ArrayList) (x71 == x71.MISSING ? hj7.v : hj7.o)).isEmpty()) {
            zp1 zp1 = this.v;
            if (zp1.c == null || zp1.c.o || !zp1.b) {
                return true;
            }
        }
        return false;
    }

    public final void l() {
        z68.c("CallHistoryPageViewModel", "register load history callbacks for type=" + this.b, new Object[0]);
        zp1 zp1 = this.v;
        zp1.getClass();
        zp1.x0.c(new xp1(zp1, 3));
        zp1.w.add(this);
        m();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v34 */
    /* JADX WARNING: type inference failed for: r17v9, types: [iz6] */
    /* JADX WARNING: type inference failed for: r17v10, types: [jz6] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x030e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0393  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x03d3  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x048d  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0497  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x04c4  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x04c7  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x04ca  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m() {
        /*
            r40 = this;
            r0 = r40
            r1 = 1
            xme r2 = r0.X
        L_0x0005:
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            n7b r4 = (defpackage.n7b) r4
            hj7 r5 = r0.o
            kotlin.Lazy r6 = r0.x
            java.lang.Object r6 = r6.getValue()
            r62 r6 = (defpackage.r62) r6
            zp1 r7 = r0.v
            java.util.concurrent.CopyOnWriteArrayList r7 = r7.o
            java.util.List r8 = kotlin.collections.CollectionsKt.emptyList()
            java.lang.Object r9 = r5.o
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            r9.clear()
            r5.w = r8
            int r8 = r9.size()
            java.util.Iterator r7 = r7.iterator()
        L_0x002f:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x0063
            java.lang.Object r10 = r7.next()
            a89 r10 = (defpackage.a89) r10
            ha9 r11 = r10.a
            long r11 = r11.z
            a32 r11 = r6.G(r11)
            if (r11 == 0) goto L_0x002f
            boolean r12 = r11.N()
            if (r12 == 0) goto L_0x005a
            vk3 r11 = r11.m()
            if (r11 == 0) goto L_0x002f
            tp1 r12 = new tp1
            r12.<init>((defpackage.a89) r10, (defpackage.vk3) r11)
            r9.add(r12)
            goto L_0x002f
        L_0x005a:
            tp1 r12 = new tp1
            r12.<init>((defpackage.a32) r11, (defpackage.a89) r10)
            r9.add(r12)
            goto L_0x002f
        L_0x0063:
            int r6 = r9.size()
            int r6 = r6 - r1
            r5.e(r9, r8, r6)
            t9a r5 = defpackage.x71.b
            x71 r6 = r0.b
            r5.getClass()
            x71 r5 = defpackage.x71.MISSING
            r7 = 0
            if (r6 != r5) goto L_0x0079
            r5 = r1
            goto L_0x007a
        L_0x0079:
            r5 = r7
        L_0x007a:
            if (r5 == 0) goto L_0x0105
            hj7 r6 = r0.o
            kotlin.Lazy r8 = r0.w
            java.lang.Object r8 = r8.getValue()
            km3 r8 = (defpackage.km3) r8
            zp1 r9 = r0.v
            java.util.concurrent.CopyOnWriteArrayList r9 = r9.o
            zqd r10 = r0.y
            r10.getClass()
            java.io.Serializable r10 = r6.v
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            r10.clear()
            if (r9 == 0) goto L_0x009e
            boolean r11 = r9.isEmpty()
            if (r11 == 0) goto L_0x00a2
        L_0x009e:
            r15 = r2
            r16 = r3
            goto L_0x00f5
        L_0x00a2:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x00ab:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x00f1
            java.lang.Object r12 = r9.next()
            r13 = r12
            a89 r13 = (defpackage.a89) r13     // Catch:{ all -> 0x00e2 }
            boolean r13 = defpackage.o5a.M(r13)     // Catch:{ all -> 0x00e2 }
            if (r13 == 0) goto L_0x00e4
            a89 r12 = (defpackage.a89) r12     // Catch:{ all -> 0x00e2 }
            ha9 r13 = r12.a     // Catch:{ all -> 0x00e2 }
            l10 r13 = r13.d()     // Catch:{ all -> 0x00e2 }
            java.util.List r13 = r13.f     // Catch:{ all -> 0x00e2 }
            tp1 r14 = new tp1     // Catch:{ all -> 0x00e2 }
            java.lang.Object r13 = r13.get(r7)     // Catch:{ all -> 0x00e2 }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ all -> 0x00e2 }
            r15 = r2
            r16 = r3
            long r2 = r13.longValue()     // Catch:{ all -> 0x00e2 }
            vk3 r2 = r8.p(r2, r1)     // Catch:{ all -> 0x00e2 }
            r14.<init>((defpackage.a89) r12, (defpackage.vk3) r2)     // Catch:{ all -> 0x00e2 }
            r11.add(r14)     // Catch:{ all -> 0x00e2 }
            goto L_0x00e7
        L_0x00e2:
            r0 = move-exception
            goto L_0x00eb
        L_0x00e4:
            r15 = r2
            r16 = r3
        L_0x00e7:
            r2 = r15
            r3 = r16
            goto L_0x00ab
        L_0x00eb:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x00f1:
            r15 = r2
            r16 = r3
            goto L_0x00f9
        L_0x00f5:
            java.util.List r11 = java.util.Collections.emptyList()
        L_0x00f9:
            r10.addAll(r11)
            int r2 = r10.size()
            int r2 = r2 - r1
            r6.e(r10, r7, r2)
            goto L_0x0108
        L_0x0105:
            r15 = r2
            r16 = r3
        L_0x0108:
            hj7 r2 = r0.o
            if (r5 == 0) goto L_0x0111
            java.io.Serializable r2 = r2.v
        L_0x010e:
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            goto L_0x0114
        L_0x0111:
            java.lang.Object r2 = r2.o
            goto L_0x010e
        L_0x0114:
            int r3 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r2, 10)
            int r3 = kotlin.collections.MapsKt.mapCapacity(r3)
            r5 = 16
            int r3 = kotlin.ranges.RangesKt.coerceAtLeast((int) r3, (int) r5)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x012b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0511
            java.lang.Object r3 = r2.next()
            tp1 r3 = (defpackage.tp1) r3
            gb1 r6 = r3.d
            if (r6 == 0) goto L_0x0143
            java.lang.String r6 = r6.b
            int r6 = r6.hashCode()
            long r8 = (long) r6
            goto L_0x0149
        L_0x0143:
            a89 r6 = r3.c
            ha9 r6 = r6.a
            long r8 = r6.b
        L_0x0149:
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            zqd r8 = r0.y
            r8.getClass()
            a89 r9 = r3.c
            a32 r10 = r3.a
            java.lang.Object r11 = r8.b
            ic3 r11 = (defpackage.ic3) r11
            r11.getClass()
            java.util.List r12 = r3.e
            if (r12 != 0) goto L_0x0163
            r12 = r7
            goto L_0x0167
        L_0x0163:
            int r12 = r12.size()
        L_0x0167:
            vk3 r13 = r3.b
            java.lang.String r14 = ""
            if (r13 == 0) goto L_0x018c
            if (r12 <= 0) goto L_0x018c
            int r12 = r12 + r1
            java.lang.Object r11 = r11.a
            android.content.Context r11 = (android.content.Context) r11
            int r7 = defpackage.vkc.call_history_item_call_call_title_with_count_calls
            java.lang.String r13 = r13.f()
            if (r13 != 0) goto L_0x017d
            r13 = r14
        L_0x017d:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r12 = new java.lang.Object[]{r13, r12}
            java.lang.String r7 = r11.getString(r7, r12)
        L_0x0189:
            r25 = r7
            goto L_0x01ae
        L_0x018c:
            if (r13 == 0) goto L_0x0197
            java.lang.String r7 = r13.f()
            if (r7 != 0) goto L_0x0189
            r25 = r14
            goto L_0x01ae
        L_0x0197:
            a32 r7 = r3.a
            if (r7 == 0) goto L_0x01a5
            r7.l0()
            java.lang.CharSequence r7 = r7.X
            java.lang.String r7 = r7.toString()
            goto L_0x0189
        L_0x01a5:
            ym r7 = defpackage.ym.v
            int r11 = defpackage.vkc.call_history_item_call_unknown_call_title
            java.lang.String r7 = r7.getString(r11)
            goto L_0x0189
        L_0x01ae:
            vk3 r7 = r3.b
            a89 r11 = r3.c
            if (r7 == 0) goto L_0x01d0
            kz6 r13 = new kz6
            long r18 = r7.r()
            ha9 r7 = r11.a
            r31 = r2
            long r1 = r7.z
            java.util.ArrayList r22 = r3.a()
            r17 = r13
            r20 = r1
            r17.<init>(r18, r20, r22)
            r26 = r8
            r2 = r13
            goto L_0x028c
        L_0x01d0:
            r31 = r2
            a32 r1 = r3.a
            if (r1 == 0) goto L_0x022f
            boolean r2 = r1.S()
            if (r2 == 0) goto L_0x022f
            ha9 r2 = r11.a
            if (r2 == 0) goto L_0x01e5
            l10 r2 = r2.d()
            goto L_0x01e6
        L_0x01e5:
            r2 = 0
        L_0x01e6:
            if (r2 == 0) goto L_0x022f
            ha9 r2 = r11.a
            if (r2 == 0) goto L_0x01f5
            l10 r2 = r2.d()
            if (r2 == 0) goto L_0x01f5
            java.lang.String r2 = r2.b
            goto L_0x01f6
        L_0x01f5:
            r2 = 0
        L_0x01f6:
            if (r2 != 0) goto L_0x01fb
            r18 = r14
            goto L_0x01fd
        L_0x01fb:
            r18 = r2
        L_0x01fd:
            ha9 r2 = r11.a
            if (r2 == 0) goto L_0x020c
            l10 r2 = r2.d()
            if (r2 == 0) goto L_0x020c
            java.lang.String r2 = r2.a
            r22 = r2
            goto L_0x020e
        L_0x020c:
            r22 = 0
        L_0x020e:
            jz6 r2 = new jz6
            m72 r1 = r1.b
            long r12 = r1.a
            if (r22 == 0) goto L_0x0223
            r17 = r2
            r19 = r12
            r21 = r25
            r17.<init>(r18, r19, r21, r22)
            r26 = r8
            goto L_0x028c
        L_0x0223:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x022f:
            if (r1 == 0) goto L_0x026a
            boolean r2 = r1.S()
            if (r2 != 0) goto L_0x026a
            iz6 r2 = new iz6
            m72 r12 = r1.b
            long r12 = r12.a
            r26 = r8
            long r7 = r1.a
            boolean r22 = r1.Q()
            java.util.ArrayList r23 = r3.a()
            if (r11 == 0) goto L_0x0258
            ha9 r1 = r11.a
            if (r1 == 0) goto L_0x0258
            l10 r1 = r1.d()
            if (r1 == 0) goto L_0x0258
            java.lang.String r1 = r1.b
            goto L_0x0259
        L_0x0258:
            r1 = 0
        L_0x0259:
            if (r1 != 0) goto L_0x025e
            r24 = r14
            goto L_0x0260
        L_0x025e:
            r24 = r1
        L_0x0260:
            r17 = r2
            r18 = r12
            r20 = r7
            r17.<init>(r18, r20, r22, r23, r24)
            goto L_0x028c
        L_0x026a:
            r26 = r8
            gb1 r2 = r3.d
            if (r2 == 0) goto L_0x0289
            jz6 r7 = new jz6
            java.lang.String r8 = r2.b
            m72 r1 = r1.b
            long r11 = r1.a
            java.lang.String r1 = r2.a
            r17 = r7
            r18 = r8
            r19 = r11
            r21 = r25
            r22 = r1
            r17.<init>(r18, r19, r21, r22)
            r2 = r7
            goto L_0x028c
        L_0x0289:
            lz6 r1 = defpackage.lz6.a
            r2 = r1
        L_0x028c:
            gb1 r1 = r3.d
            if (r1 == 0) goto L_0x029a
            java.lang.String r1 = r1.b
            int r1 = r1.hashCode()
            long r7 = (long) r1
        L_0x0297:
            r18 = r7
            goto L_0x02a1
        L_0x029a:
            a89 r1 = r3.c
            ha9 r1 = r1.a
            long r7 = r1.b
            goto L_0x0297
        L_0x02a1:
            vk3 r1 = r3.b
            if (r1 == 0) goto L_0x02ac
            long r7 = r1.r()
        L_0x02a9:
            r20 = r7
            goto L_0x02bb
        L_0x02ac:
            a32 r1 = r3.a
            if (r1 == 0) goto L_0x02b5
            m72 r1 = r1.b
            long r7 = r1.a
            goto L_0x02a9
        L_0x02b5:
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x02a9
        L_0x02bb:
            vk3 r1 = r3.b
            kl0 r7 = defpackage.kl0.b
            if (r1 == 0) goto L_0x02c8
            java.lang.String r1 = r1.t(r7)
        L_0x02c5:
            r23 = r1
            goto L_0x02d5
        L_0x02c8:
            a32 r1 = r3.a
            if (r1 == 0) goto L_0x02d3
            jl0 r8 = defpackage.jl0.a
            java.lang.String r1 = r1.h(r7, r8)
            goto L_0x02c5
        L_0x02d3:
            r23 = 0
        L_0x02d5:
            if (r9 == 0) goto L_0x02e5
            boolean r1 = defpackage.o5a.M(r9)
            if (r1 == 0) goto L_0x02e5
            boolean r1 = r9.f()
            if (r1 == 0) goto L_0x02e5
            r1 = 1
            goto L_0x02e6
        L_0x02e5:
            r1 = 0
        L_0x02e6:
            if (r9 == 0) goto L_0x0301
            ha9 r7 = r9.a
            l10 r7 = r7.d()
            if (r7 == 0) goto L_0x02fa
            boolean r7 = r7.e()
            r8 = 1
            if (r7 != r8) goto L_0x02fa
            hz6 r7 = defpackage.hz6.c
            goto L_0x02fc
        L_0x02fa:
            hz6 r7 = defpackage.hz6.b
        L_0x02fc:
            r29 = r7
            r7 = r26
            goto L_0x0304
        L_0x0301:
            hz6 r7 = defpackage.hz6.b
            goto L_0x02fc
        L_0x0304:
            java.lang.Object r8 = r7.b
            ic3 r8 = (defpackage.ic3) r8
            java.lang.Object r11 = r8.a
            android.content.Context r11 = (android.content.Context) r11
            if (r9 == 0) goto L_0x034a
            if (r10 == 0) goto L_0x034a
            boolean r10 = r10.S()
            if (r10 == 0) goto L_0x034a
            ha9 r8 = r9.a
            l10 r8 = r8.d()
            if (r8 == 0) goto L_0x0321
            long r12 = r8.e
            goto L_0x0323
        L_0x0321:
            r12 = 0
        L_0x0323:
            android.content.res.Resources r8 = r11.getResources()
            int r10 = defpackage.lqa.h
            java.lang.String r8 = r8.getString(r10)
            r10 = 0
            int r10 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r10 != 0) goto L_0x0334
            goto L_0x0340
        L_0x0334:
            java.lang.String[] r10 = defpackage.ghf.c
            java.lang.String r10 = defpackage.b0h.c(r12)
            java.lang.String r11 = " · "
            java.lang.String r8 = defpackage.g63.i(r8, r11, r10)
        L_0x0340:
            r28 = r8
            r17 = r14
            r32 = r15
            r12 = 1
            r13 = 0
            goto L_0x0495
        L_0x034a:
            if (r9 == 0) goto L_0x048d
            ha9 r10 = r9.a
            l10 r10 = r10.d()
            if (r10 == 0) goto L_0x035e
            boolean r10 = r10.e()
            r12 = 1
            if (r10 != r12) goto L_0x035e
            hz6 r10 = defpackage.hz6.c
            goto L_0x0360
        L_0x035e:
            hz6 r10 = defpackage.hz6.b
        L_0x0360:
            ha9 r12 = r9.a
            l10 r13 = r12.d()
            r17 = r14
            if (r13 == 0) goto L_0x0386
            long r13 = r13.e
            java.lang.Long r22 = java.lang.Long.valueOf(r13)
            r32 = 0
            int r13 = (r13 > r32 ? 1 : (r13 == r32 ? 0 : -1))
            if (r13 == 0) goto L_0x0377
            goto L_0x0379
        L_0x0377:
            r22 = 0
        L_0x0379:
            if (r22 == 0) goto L_0x0386
            long r13 = r22.longValue()
            java.lang.String[] r22 = defpackage.ghf.c
            java.lang.String r13 = defpackage.b0h.c(r13)
            goto L_0x0387
        L_0x0386:
            r13 = 0
        L_0x0387:
            boolean r14 = defpackage.o5a.M(r9)
            if (r14 == 0) goto L_0x0395
            boolean r14 = r9.f()
            if (r14 == 0) goto L_0x0395
            r14 = 1
            goto L_0x0396
        L_0x0395:
            r14 = 0
        L_0x0396:
            boolean r22 = r9.f()
            if (r22 == 0) goto L_0x03b0
            l10 r12 = r12.d()
            if (r12 == 0) goto L_0x03b0
            boolean r22 = r12.d()
            if (r22 != 0) goto L_0x03ae
            boolean r12 = r12.a()
            if (r12 == 0) goto L_0x03b0
        L_0x03ae:
            r12 = 1
            goto L_0x03b1
        L_0x03b0:
            r12 = 0
        L_0x03b1:
            djd r22 = defpackage.hz6.a
            r22.getClass()
            r32 = r15
            hz6 r15 = defpackage.hz6.c
            if (r10 != r15) goto L_0x03cb
            if (r12 != 0) goto L_0x03c0
            if (r14 == 0) goto L_0x03cb
        L_0x03c0:
            java.lang.Object r8 = r8.b
            kotlin.Lazy r8 = (kotlin.Lazy) r8
            java.lang.Object r8 = r8.getValue()
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            goto L_0x041f
        L_0x03cb:
            if (r10 != r15) goto L_0x03de
            boolean r22 = r9.f()
            if (r22 == 0) goto L_0x03de
            java.lang.Object r8 = r8.o
            kotlin.Lazy r8 = (kotlin.Lazy) r8
            java.lang.Object r8 = r8.getValue()
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            goto L_0x041f
        L_0x03de:
            if (r10 != r15) goto L_0x03eb
            java.lang.Object r8 = r8.w
            kotlin.Lazy r8 = (kotlin.Lazy) r8
            java.lang.Object r8 = r8.getValue()
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            goto L_0x041f
        L_0x03eb:
            hz6 r15 = defpackage.hz6.b
            if (r10 != r15) goto L_0x03fe
            if (r12 != 0) goto L_0x03f3
            if (r14 == 0) goto L_0x03fe
        L_0x03f3:
            java.lang.Object r8 = r8.c
            kotlin.Lazy r8 = (kotlin.Lazy) r8
            java.lang.Object r8 = r8.getValue()
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            goto L_0x041f
        L_0x03fe:
            if (r10 != r15) goto L_0x0411
            boolean r22 = r9.f()
            if (r22 == 0) goto L_0x0411
            java.lang.Object r8 = r8.v
            kotlin.Lazy r8 = (kotlin.Lazy) r8
            java.lang.Object r8 = r8.getValue()
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            goto L_0x041f
        L_0x0411:
            if (r10 != r15) goto L_0x041e
            java.lang.Object r8 = r8.x
            kotlin.Lazy r8 = (kotlin.Lazy) r8
            java.lang.Object r8 = r8.getValue()
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            goto L_0x041f
        L_0x041e:
            r8 = 0
        L_0x041f:
            if (r14 == 0) goto L_0x0428
            int r10 = defpackage.vkc.call_history_item_call_missed
            java.lang.String r10 = r11.getString(r10)
            goto L_0x0460
        L_0x0428:
            if (r12 == 0) goto L_0x0431
            int r10 = defpackage.vkc.call_history_item_call_reject
            java.lang.String r10 = r11.getString(r10)
            goto L_0x0460
        L_0x0431:
            boolean r10 = r9.f()
            if (r10 == 0) goto L_0x044c
            if (r13 == 0) goto L_0x0445
            int r10 = defpackage.vkc.call_history_item_call_incoming_with_time
            java.lang.Object[] r12 = new java.lang.Object[]{r13}
            java.lang.String r10 = r11.getString(r10, r12)
            if (r10 != 0) goto L_0x0460
        L_0x0445:
            int r10 = defpackage.vkc.call_history_item_call_incoming
            java.lang.String r10 = r11.getString(r10)
            goto L_0x0460
        L_0x044c:
            if (r13 == 0) goto L_0x045a
            int r10 = defpackage.vkc.call_history_item_call_outgoing_with_time
            java.lang.Object[] r12 = new java.lang.Object[]{r13}
            java.lang.String r10 = r11.getString(r10, r12)
            if (r10 != 0) goto L_0x0460
        L_0x045a:
            int r10 = defpackage.vkc.call_history_item_call_outgoing
            java.lang.String r10 = r11.getString(r10)
        L_0x0460:
            if (r8 == 0) goto L_0x0475
            int r11 = r8.getIntrinsicWidth()
            int r12 = r8.getIntrinsicHeight()
            r13 = 0
            r8.setBounds(r13, r13, r11, r12)
            android.text.style.ImageSpan r11 = new android.text.style.ImageSpan
            r12 = 1
            r11.<init>(r8, r12)
            goto L_0x0478
        L_0x0475:
            r12 = 1
            r13 = 0
            r11 = 0
        L_0x0478:
            android.text.SpannableString r8 = new android.text.SpannableString
            java.lang.String r14 = "  "
            java.lang.String r10 = defpackage.a81.m(r14, r10)
            r8.<init>(r10)
            if (r11 == 0) goto L_0x048a
            r10 = 17
            r8.setSpan(r11, r13, r12, r10)
        L_0x048a:
            r28 = r8
            goto L_0x0495
        L_0x048d:
            r17 = r14
            r32 = r15
            r12 = 1
            r13 = 0
            r28 = r17
        L_0x0495:
            if (r9 == 0) goto L_0x04c4
            java.lang.Object r7 = r7.c
            kotlin.Lazy r7 = (kotlin.Lazy) r7
            java.lang.Object r7 = r7.getValue()
            eq2 r7 = (defpackage.eq2) r7
            ha9 r8 = r9.a
            long r8 = r8.o
            hs7 r7 = r7.b
            java.lang.Object r7 = r7.get()
            yva r7 = (defpackage.yva) r7
            a33 r10 = r7.c
            java.util.Locale r34 = r10.u()
            long r37 = r10.m()
            android.content.Context r7 = r7.a
            r39 = 1
            r33 = r7
            r35 = r8
            java.lang.String r7 = defpackage.j4b.r(r33, r34, r35, r37, r39)
            goto L_0x04c5
        L_0x04c4:
            r7 = 0
        L_0x04c5:
            if (r7 != 0) goto L_0x04ca
            r26 = r17
            goto L_0x04cc
        L_0x04ca:
            r26 = r7
        L_0x04cc:
            vk3 r7 = r3.b
            if (r7 == 0) goto L_0x04d7
            java.lang.CharSequence r14 = r7.q()
        L_0x04d4:
            r22 = r14
            goto L_0x04eb
        L_0x04d7:
            a32 r7 = r3.a
            if (r7 == 0) goto L_0x04e9
            boolean r7 = r7.S()
            if (r7 != 0) goto L_0x04e9
            a32 r3 = r3.a
            r3.m0()
            java.lang.CharSequence r14 = r3.v0
            goto L_0x04d4
        L_0x04e9:
            r22 = r17
        L_0x04eb:
            boolean r3 = r2 instanceof defpackage.jz6
            uz6 r7 = new uz6
            r17 = r7
            r24 = r3
            r27 = r1
            r30 = r2
            r17.<init>(r18, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            kotlin.Pair r1 = kotlin.TuplesKt.to(r6, r7)
            java.lang.Object r2 = r1.getFirst()
            java.lang.Object r1 = r1.getSecond()
            r5.put(r2, r1)
            r1 = r12
            r7 = r13
            r2 = r31
            r15 = r32
            goto L_0x012b
        L_0x0511:
            r12 = r1
            r32 = r15
            t9a r1 = defpackage.x71.b
            x71 r2 = r0.b
            r1.getClass()
            x71 r1 = defpackage.x71.ALL
            if (r2 != r1) goto L_0x0539
            xme r1 = r0.Z
        L_0x0521:
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r3.getClass()
            boolean r3 = r5.isEmpty()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r2 = r1.b(r2, r3)
            if (r2 == 0) goto L_0x0521
        L_0x0539:
            boolean r1 = r4 instanceof defpackage.l7b
            if (r1 == 0) goto L_0x054c
            l7b r4 = (defpackage.l7b) r4
            r4.getClass()
            l7b r1 = new l7b
            r1.<init>(r5)
        L_0x0547:
            r3 = r16
            r2 = r32
            goto L_0x0552
        L_0x054c:
            l7b r1 = new l7b
            r1.<init>(r5)
            goto L_0x0547
        L_0x0552:
            boolean r1 = r2.b(r3, r1)
            if (r1 == 0) goto L_0x0559
            return
        L_0x0559:
            r1 = r12
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n71.m():void");
    }
}

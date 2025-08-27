package defpackage;

import kotlin.Lazy;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: e98  reason: default package */
public final class e98 {
    public static final /* synthetic */ int G = 0;
    public final Lazy A;
    public final Lazy B;
    public final Lazy C;
    public final Lazy D;
    public final Lazy E;
    public final Lazy F;
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;
    public final Lazy m;
    public final Lazy n;
    public final Lazy o;
    public final Lazy p;
    public final Lazy q;
    public final Lazy r;
    public final Lazy s;
    public final Lazy t;
    public final Lazy u;
    public final Lazy v;
    public final Lazy w;
    public final Lazy x;
    public final Lazy y;
    public final Lazy z;

    public e98(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7, Lazy lazy8, Lazy lazy9, Lazy lazy10, Lazy lazy11, Lazy lazy12, Lazy lazy13, Lazy lazy14, Lazy lazy15, Lazy lazy16, Lazy lazy17, Lazy lazy18, Lazy lazy19, Lazy lazy20, Lazy lazy21, Lazy lazy22, Lazy lazy23, Lazy lazy24, Lazy lazy25, Lazy lazy26, Lazy lazy27, Lazy lazy28, Lazy lazy29, Lazy lazy30, Lazy lazy31, Lazy lazy32) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
        this.e = lazy5;
        this.f = lazy6;
        this.g = lazy7;
        this.h = lazy8;
        this.i = lazy9;
        this.j = lazy10;
        this.k = lazy11;
        this.l = lazy12;
        this.m = lazy13;
        this.n = lazy14;
        this.o = lazy15;
        this.p = lazy16;
        this.q = lazy17;
        this.r = lazy18;
        this.s = lazy19;
        this.t = lazy20;
        this.u = lazy21;
        this.v = lazy22;
        this.w = lazy23;
        this.x = lazy24;
        this.y = lazy25;
        this.z = lazy26;
        this.A = lazy27;
        this.B = lazy28;
        this.C = lazy29;
        this.D = lazy30;
        this.E = lazy31;
        this.F = lazy32;
    }

    public static final long a(Ref.LongRef longRef) {
        Duration.Companion companion = Duration.Companion;
        long r0 = Duration.m1388minusLRDsOJo(DurationKt.toDuration(System.nanoTime(), DurationUnit.NANOSECONDS), longRef.element);
        longRef.element = r0;
        return r0;
    }

    public final gk b() {
        return (gk) this.E.getValue();
    }

    public final v21 c() {
        return (v21) this.p.getValue();
    }

    public final uq1 d() {
        return (uq1) this.C.getValue();
    }

    public final r62 e() {
        return (r62) this.h.getValue();
    }

    public final fn4 f() {
        return (fn4) this.d.getValue();
    }

    public final ai5 g() {
        return (ai5) this.y.getValue();
    }

    public final k78 h() {
        return (k78) this.F.getValue();
    }

    public final ou8 i() {
        return (ou8) this.o.getValue();
    }

    public final deb j() {
        return (deb) this.s.getValue();
    }

    public final oeb k() {
        return (oeb) this.t.getValue();
    }

    public final jtb l() {
        return (jtb) this.c.getValue();
    }

    public final evb m() {
        return (evb) this.z.getValue();
    }

    public final jqg n() {
        return (jqg) this.l.getValue();
    }

    public final void o(l88 l88, long j2) {
        long j3;
        l88 l882;
        e98 e98;
        long j4 = ((ltb) l()).a.g.getLong("app.last.chat.marker", 0);
        Long valueOf = Long.valueOf(j4);
        if (j4 == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            j3 = valueOf.longValue();
            l882 = l88;
        } else {
            l882 = l88;
            j3 = Long.MAX_VALUE;
        }
        long j5 = l882.Y;
        Long valueOf2 = Long.valueOf(j5);
        if (j5 == 0) {
            valueOf2 = null;
        }
        long min = Math.min(j3, valueOf2 != null ? valueOf2.longValue() : Long.MAX_VALUE);
        if (min != LongCompanionObject.MAX_VALUE && min > 0) {
            a67 a67 = z68.b;
            if (a67 == null) {
                e98 = this;
                long j6 = j2;
            } else {
                if (a67.c()) {
                    w78 w78 = w78.o;
                    cud cud = ((ltb) l()).b;
                    cud.getClass();
                    StringBuilder n2 = tr1.n(min, "api.chatsList(", ", ");
                    n2.append(j2);
                    n2.append(", ");
                    n2.append((int) cud.r(PmsKey.f23chatspagesize, (long) 50));
                    n2.append(")");
                    a67.d(w78, "e98", n2.toString(), (Throwable) null);
                } else {
                    long j7 = j2;
                }
                e98 = this;
            }
            cud cud2 = ((ltb) l()).b;
            cud2.getClass();
            jna jna = (jna) ((rl) e98.a.getValue());
            ocf.d(jna.E(), new ts2((int) cud2.r(PmsKey.f23chatspagesize, (long) 50), ((ltb) jna.D()).a.n(), min, j2), false, 0, 12);
        }
    }

    public final void p() {
        a33 a33 = ((ltb) l()).a;
        long j2 = a33.g.getLong("app.reset.at.time", 0);
        String g2 = ((doa) this.b.getValue()).g();
        long m2 = a33.m();
        if (j2 <= 0 || j2 >= m2 || g2 == null || g2.length() == 0) {
            ((jna) ((rl) this.a.getValue())).H();
            return;
        }
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            StringBuilder n2 = tr1.n(j2, "Drop cache: resetAt=", ", lastLogin=");
            n2.append(m2);
            a67.d(w78, "e98", n2.toString(), (Throwable) null);
        }
        ((osa) ((gaf) this.B.getValue())).b().p0(EmptyCoroutineContext.INSTANCE, new y86(20, (Object) this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v20, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r3v56, types: [x23] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x036e A[SYNTHETIC, Splitter:B:129:0x036e] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03fa  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0404  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0434  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0475  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0495  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x049e  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0552 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0553  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0573  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0580  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x065d  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0675  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0696  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0796  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0798  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x07b5  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x07db  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x07dd  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x07fa  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0873  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x087c  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x08a7  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x08f4  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x0934  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0946  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x0949  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x0984  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0a2a  */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x0a3b  */
    /* JADX WARNING: Removed duplicated region for block: B:402:0x0927 A[EDGE_INSN: B:402:0x0927->B:326:0x0927 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0035  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object q(long r37, defpackage.l88 r39, long r40, kotlin.coroutines.Continuation r42) {
        /*
            r36 = this;
            r1 = r36
            r2 = r39
            r3 = r40
            r0 = r42
            r5 = 1
            boolean r6 = r0 instanceof defpackage.b98
            if (r6 == 0) goto L_0x001c
            r6 = r0
            b98 r6 = (defpackage.b98) r6
            int r7 = r6.w0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L_0x001c
            int r7 = r7 - r8
            r6.w0 = r7
            goto L_0x0021
        L_0x001c:
            b98 r6 = new b98
            r6.<init>(r1, r0)
        L_0x0021:
            java.lang.Object r0 = r6.Z
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r8 = r6.w0
            r10 = 2
            java.lang.String r11 = "e98"
            java.lang.String r13 = "onLogin#21("
            java.lang.String r14 = "onLogin#5.5("
            r15 = 3
            r16 = r13
            if (r8 == 0) goto L_0x00d4
            if (r8 == r5) goto L_0x0095
            if (r8 == r10) goto L_0x0068
            if (r8 != r15) goto L_0x0060
            int r1 = r6.Y
            long r2 = r6.y
            boolean r4 = r6.X
            long r7 = r6.x
            long r14 = r6.w
            java.util.List r10 = r6.v
            java.util.List r10 = (java.util.List) r10
            x23 r12 = r6.o
            kotlin.jvm.internal.Ref$LongRef r13 = r6.c
            l88 r9 = r6.b
            e98 r6 = r6.a
            kotlin.ResultKt.throwOnFailure(r0)
            r19 = r2
            r2 = 0
            r31 = r14
            r14 = r12
            r12 = r16
            r15 = r31
            goto L_0x08e6
        L_0x0060:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0068:
            int r1 = r6.Y
            long r2 = r6.z
            boolean r4 = r6.X
            long r8 = r6.y
            long r12 = r6.x
            r10 = r1
            r36 = r2
            long r1 = r6.w
            java.util.List r3 = r6.v
            java.util.List r3 = (java.util.List) r3
            x23 r14 = r6.o
            kotlin.jvm.internal.Ref$LongRef r15 = r6.c
            l88 r5 = r6.b
            r38 = r1
            e98 r1 = r6.a
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r1
            r21 = r7
            r19 = r8
            r7 = r38
            r9 = r5
            r5 = r3
            r2 = r36
            goto L_0x056f
        L_0x0095:
            int r1 = r6.Y
            long r2 = r6.z
            boolean r4 = r6.X
            long r8 = r6.y
            long r12 = r6.x
            r5 = r1
            r36 = r2
            long r1 = r6.w
            x23 r3 = r6.o
            kotlin.jvm.internal.Ref$LongRef r10 = r6.c
            l88 r15 = r6.b
            r38 = r1
            e98 r1 = r6.a
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ all -> 0x00c0 }
            r2 = r1
            r1 = r7
            r21 = r8
            r19 = r10
            r7 = r36
            r10 = r4
            r9 = r5
            r5 = r3
            r3 = r38
            goto L_0x0363
        L_0x00c0:
            r0 = move-exception
            r21 = r8
            r19 = r10
            r10 = r4
            r9 = r5
            r4 = r0
            r5 = r3
            r2 = r38
            r31 = r36
            r36 = r1
            r1 = r7
            r7 = r31
            goto L_0x03f6
        L_0x00d4:
            kotlin.ResultKt.throwOnFailure(r0)
            a67 r0 = defpackage.z68.b
            if (r0 != 0) goto L_0x00dc
            goto L_0x0102
        L_0x00dc:
            boolean r5 = r0.c()
            if (r5 == 0) goto L_0x0102
            w78 r5 = defpackage.w78.o
            java.lang.Long r8 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r40)
            java.lang.String r8 = defpackage.iq.U(r8)
            long r9 = r2.Y
            java.lang.Long r9 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r9)
            java.lang.String r9 = defpackage.iq.U(r9)
            java.lang.String r10 = "onLogin#1: start, chatsLastSync = "
            java.lang.String r12 = ", chatMarker = "
            java.lang.String r8 = defpackage.g63.j(r10, r8, r12, r9)
            r9 = 0
            r0.d(r5, r11, r8, r9)
        L_0x0102:
            kotlin.time.Duration$Companion r0 = kotlin.time.Duration.Companion
            long r8 = java.lang.System.nanoTime()
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            long r8 = kotlin.time.DurationKt.toDuration((long) r8, (kotlin.time.DurationUnit) r0)
            kotlin.jvm.internal.Ref$LongRef r10 = new kotlin.jvm.internal.Ref$LongRef
            r10.<init>()
            r10.element = r8
            a67 r0 = defpackage.z68.b
            if (r0 != 0) goto L_0x011c
        L_0x0119:
            r19 = r7
            goto L_0x014f
        L_0x011c:
            boolean r5 = r0.c()
            if (r5 == 0) goto L_0x0119
            w78 r5 = defpackage.w78.o
            long r12 = a(r10)
            java.lang.String r12 = kotlin.time.Duration.m1402toStringimpl(r12)
            ue3 r13 = r2.z
            if (r13 == 0) goto L_0x0132
            r13 = 1
            goto L_0x0133
        L_0x0132:
            r13 = 0
        L_0x0133:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r19 = r7
            java.lang.String r7 = "onLogin#2("
            r15.<init>(r7)
            r15.append(r12)
            java.lang.String r7 = "): notifConfigLogic.onConfiguration with config="
            r15.append(r7)
            r15.append(r13)
            java.lang.String r7 = r15.toString()
            r12 = 0
            r0.d(r5, r11, r7, r12)
        L_0x014f:
            ue3 r0 = r2.z
            if (r0 == 0) goto L_0x0161
            kotlin.Lazy r5 = r1.m
            java.lang.Object r5 = r5.getValue()
            yaa r5 = (defpackage.yaa) r5
            r7 = 1
            r5.b(r0, r7)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x0161:
            fn4 r0 = r36.f()
            boolean r5 = r0.d()
            java.lang.String r0 = r2.x
            a67 r7 = defpackage.z68.b
            if (r7 != 0) goto L_0x0174
        L_0x016f:
            r20 = r5
            r21 = r8
            goto L_0x01a3
        L_0x0174:
            boolean r12 = r7.c()
            if (r12 == 0) goto L_0x016f
            w78 r12 = defpackage.w78.o
            long r20 = a(r10)
            java.lang.String r13 = kotlin.time.Duration.m1402toStringimpl(r20)
            wtd r15 = defpackage.dbe.w
            r15.getClass()
            if (r0 == 0) goto L_0x0192
            java.lang.String r15 = defpackage.vzg.y(r0)
            r20 = r5
            goto L_0x0195
        L_0x0192:
            r20 = r5
            r15 = 0
        L_0x0195:
            java.lang.String r5 = "onLogin#3("
            r21 = r8
            java.lang.String r8 = "): updateToken="
            java.lang.String r5 = defpackage.g63.j(r5, r13, r8, r15)
            r8 = 0
            r7.d(r12, r11, r5, r8)
        L_0x01a3:
            if (r0 == 0) goto L_0x01b8
            int r5 = r0.length()
            if (r5 != 0) goto L_0x01ac
            goto L_0x01b8
        L_0x01ac:
            kotlin.Lazy r5 = r1.b
            java.lang.Object r5 = r5.getValue()
            doa r5 = (defpackage.doa) r5
            r7 = 0
            r5.i(r0, r7)
        L_0x01b8:
            jtb r0 = r36.l()
            ltb r0 = (defpackage.ltb) r0
            a33 r5 = r0.a
            fo3 r0 = r2.c
            if (r0 == 0) goto L_0x01cf
            long r7 = r0.a
            java.lang.Long r0 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r7)
            r5.y(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x01cf:
            long r7 = r2.y
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r7 - r12
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            java.lang.String r9 = "server.timeDelta"
            r5.k(r9, r0)
            long r12 = r2.w0
            r17 = 0
            int r0 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x01f1
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            java.lang.String r9 = "app.reset.at.time"
            r5.k(r9, r0)
        L_0x01f1:
            int r0 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x01f7
            r9 = 1
            goto L_0x01f8
        L_0x01f7:
            r9 = 0
        L_0x01f8:
            a67 r0 = defpackage.z68.b
            if (r0 != 0) goto L_0x01ff
        L_0x01fc:
            r23 = r7
            goto L_0x022e
        L_0x01ff:
            boolean r12 = r0.c()
            if (r12 == 0) goto L_0x01fc
            w78 r12 = defpackage.w78.o
            long r23 = a(r10)
            java.lang.String r13 = kotlin.time.Duration.m1402toStringimpl(r23)
            r23 = r7
            r15 = 1
            r7 = r9 ^ 1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r15 = "onLogin#4("
            r8.<init>(r15)
            r8.append(r13)
            java.lang.String r13 = "): attachmentsReadyLogic="
            r8.append(r13)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r8 = 0
            r0.d(r12, r11, r7, r8)
        L_0x022e:
            if (r9 != 0) goto L_0x0282
            kotlin.Lazy r0 = r1.u
            java.lang.Object r0 = r0.getValue()
            t20 r0 = (defpackage.t20) r0
            hs7 r7 = r0.a
            java.lang.Object r7 = r7.get()
            fa9 r7 = (defpackage.fa9) r7
            cd4 r8 = defpackage.oa9.b
            java.util.ArrayList r7 = r7.t()
            java.util.Iterator r7 = r7.iterator()
        L_0x024a:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0282
            java.lang.Object r8 = r7.next()
            ha9 r8 = (defpackage.ha9) r8
            boolean r12 = r8.o()
            if (r12 != 0) goto L_0x025d
            goto L_0x024a
        L_0x025d:
            w28 r12 = r8.x0
            java.lang.Object r12 = r12.b
            java.util.List r12 = (java.util.List) r12
            java.util.Iterator r12 = r12.iterator()
        L_0x0267:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x027f
            java.lang.Object r13 = r12.next()
            l20 r13 = (defpackage.l20) r13
            java.lang.String r13 = r13.q
            z10 r15 = defpackage.z10.a
            long r3 = r8.b
            r0.d(r3, r13, r15)
            r3 = r40
            goto L_0x0267
        L_0x027f:
            r3 = r40
            goto L_0x024a
        L_0x0282:
            java.util.List r0 = kotlin.collections.CollectionsKt.createListBuilder()
            fo3 r3 = r2.c
            if (r3 == 0) goto L_0x0291
            boolean r3 = r0.add(r3)
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
        L_0x0291:
            java.util.ArrayList r3 = r39.d()
            java.util.Iterator r3 = r3.iterator()
        L_0x0299:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x02ad
            java.lang.Object r4 = r3.next()
            fo3 r4 = (defpackage.fo3) r4
            os3 r7 = r4.y
            if (r7 != 0) goto L_0x0299
            r0.add(r4)
            goto L_0x0299
        L_0x02ad:
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r0)
            a67 r3 = defpackage.z68.b
            if (r3 != 0) goto L_0x02b6
            goto L_0x02e4
        L_0x02b6:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x02e4
            w78 r4 = defpackage.w78.o
            long r7 = a(r10)
            java.lang.String r7 = kotlin.time.Duration.m1402toStringimpl(r7)
            int r8 = r0.size()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "onLogin#5("
            r12.<init>(r13)
            r12.append(r7)
            java.lang.String r7 = "): ContactsController.onLogin contactsSize="
            r12.append(r7)
            r12.append(r8)
            java.lang.String r7 = r12.toString()
            r8 = 0
            r3.d(r4, r11, r7, r8)
        L_0x02e4:
            kotlin.Lazy r3 = r1.j
            java.lang.Object r3 = r3.getValue()
            km3 r3 = (defpackage.km3) r3
            r3.getClass()
            java.lang.String r4 = "km3"
            java.lang.String r7 = "onLogin start"
            defpackage.z68.c(r4, r7, new java.lang.Object[0])
            r3.D(r0)
            java.lang.String r0 = "onLogin finished"
            defpackage.z68.c(r4, r0, new java.lang.Object[0])
            a67 r0 = defpackage.z68.b
            if (r0 != 0) goto L_0x0303
            goto L_0x031d
        L_0x0303:
            boolean r3 = r0.c()
            if (r3 == 0) goto L_0x031d
            w78 r3 = defpackage.w78.o
            long r7 = a(r10)
            java.lang.String r4 = kotlin.time.Duration.m1402toStringimpl(r7)
            java.lang.String r7 = "): loadMissedContactsUseCase is started"
            java.lang.String r4 = defpackage.wj6.k(r14, r4, r7)
            r7 = 0
            r0.d(r3, r11, r4, r7)
        L_0x031d:
            kotlin.Lazy r0 = r1.A     // Catch:{ all -> 0x03ee }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x03ee }
            is9 r0 = (defpackage.is9) r0     // Catch:{ all -> 0x03ee }
            kotlin.time.Duration$Companion r3 = kotlin.time.Duration.Companion     // Catch:{ all -> 0x03ea }
            kotlin.time.DurationUnit r3 = kotlin.time.DurationUnit.SECONDS     // Catch:{ all -> 0x03ea }
            r4 = 3
            long r7 = kotlin.time.DurationKt.toDuration((int) r4, (kotlin.time.DurationUnit) r3)     // Catch:{ all -> 0x03ea }
            r6.a = r1     // Catch:{ all -> 0x03ee }
            r6.b = r2     // Catch:{ all -> 0x03ee }
            r6.c = r10     // Catch:{ all -> 0x03ee }
            r6.o = r5     // Catch:{ all -> 0x03ee }
            r3 = r37
            r6.w = r3     // Catch:{ all -> 0x03ea }
            r12 = r40
            r6.x = r12     // Catch:{ all -> 0x03e8 }
            r3 = r21
            r6.y = r3     // Catch:{ all -> 0x03e0 }
            r15 = r20
            r6.X = r15     // Catch:{ all -> 0x03d8 }
            r21 = r3
            r3 = r23
            r6.z = r3     // Catch:{ all -> 0x03cc }
            r6.Y = r9     // Catch:{ all -> 0x03cc }
            r1 = 1
            r6.w0 = r1     // Catch:{ all -> 0x03cc }
            java.lang.Object r0 = r0.r(r2, r7, r6)     // Catch:{ all -> 0x03cc }
            r1 = r19
            if (r0 != r1) goto L_0x035a
            return r1
        L_0x035a:
            r7 = r3
            r19 = r10
            r10 = r15
            r3 = r37
            r15 = r2
            r2 = r36
        L_0x0363:
            a67 r0 = defpackage.z68.b     // Catch:{ all -> 0x03c4 }
            if (r0 != 0) goto L_0x036e
        L_0x0367:
            r36 = r2
            r37 = r3
        L_0x036b:
            r39 = r5
            goto L_0x03b2
        L_0x036e:
            boolean r20 = r0.c()     // Catch:{ all -> 0x03c0 }
            if (r20 == 0) goto L_0x0367
            r36 = r2
            w78 r2 = defpackage.w78.o     // Catch:{ all -> 0x03ae }
            long r23 = a(r19)     // Catch:{ all -> 0x03ae }
            r37 = r3
            java.lang.String r3 = kotlin.time.Duration.m1402toStringimpl(r23)     // Catch:{ all -> 0x03a8 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x03a8 }
            r4.<init>()     // Catch:{ all -> 0x03a8 }
            r39 = r5
            java.lang.String r5 = "onLogin#5.x5("
            r4.append(r5)     // Catch:{ all -> 0x03a6 }
            r4.append(r3)     // Catch:{ all -> 0x03a6 }
            java.lang.String r3 = "): loadMissedContactsUseCase is ended"
            r4.append(r3)     // Catch:{ all -> 0x03a6 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x03a6 }
            r4 = 0
            r0.d(r2, r11, r3, r4)     // Catch:{ all -> 0x03a6 }
            goto L_0x03b2
        L_0x039f:
            r2 = r37
            r5 = r39
        L_0x03a3:
            r4 = r0
            goto L_0x03f6
        L_0x03a6:
            r0 = move-exception
            goto L_0x039f
        L_0x03a8:
            r0 = move-exception
        L_0x03a9:
            r39 = r5
            r2 = r37
            goto L_0x03a3
        L_0x03ae:
            r0 = move-exception
        L_0x03af:
            r37 = r3
            goto L_0x03a9
        L_0x03b2:
            r2 = r36
            r3 = r37
            r5 = r39
            r0 = r19
            r19 = r7
            r7 = r21
            goto L_0x0421
        L_0x03c0:
            r0 = move-exception
            r36 = r2
            goto L_0x03af
        L_0x03c4:
            r0 = move-exception
            r36 = r2
            r37 = r3
            r39 = r5
            goto L_0x039f
        L_0x03cc:
            r0 = move-exception
            r1 = r19
        L_0x03cf:
            r7 = r3
            r19 = r10
            r10 = r15
            r4 = r0
            r15 = r2
            r2 = r37
            goto L_0x03f6
        L_0x03d8:
            r0 = move-exception
            r21 = r3
            r1 = r19
        L_0x03dd:
            r3 = r23
            goto L_0x03cf
        L_0x03e0:
            r0 = move-exception
            r21 = r3
        L_0x03e3:
            r1 = r19
            r15 = r20
            goto L_0x03dd
        L_0x03e8:
            r0 = move-exception
            goto L_0x03e3
        L_0x03ea:
            r0 = move-exception
            r12 = r40
            goto L_0x03e3
        L_0x03ee:
            r0 = move-exception
            r12 = r40
            r1 = r19
            r15 = r20
            goto L_0x03dd
        L_0x03f6:
            a67 r0 = defpackage.z68.b
            if (r0 != 0) goto L_0x03fe
        L_0x03fa:
            r37 = r2
            goto L_0x036b
        L_0x03fe:
            boolean r20 = r0.c()
            if (r20 == 0) goto L_0x03fa
            r37 = r2
            w78 r2 = defpackage.w78.x
            long r23 = a(r19)
            java.lang.String r3 = kotlin.time.Duration.m1402toStringimpl(r23)
            java.lang.String r4 = kotlin.ExceptionsKt.stackTraceToString(r4)
            r39 = r5
            java.lang.String r5 = "): loadMissedContactsUseCase is ended "
            java.lang.String r3 = defpackage.g63.j(r14, r3, r5, r4)
            r4 = 0
            r0.d(r2, r11, r3, r4)
            goto L_0x03b2
        L_0x0421:
            a67 r14 = defpackage.z68.b
            if (r14 != 0) goto L_0x042e
        L_0x0425:
            r21 = r1
            r36 = r7
            r24 = r9
            r22 = r10
            goto L_0x0466
        L_0x042e:
            boolean r21 = r14.c()
            if (r21 == 0) goto L_0x0425
            r21 = r1
            w78 r1 = defpackage.w78.o
            long r22 = a(r0)
            r24 = r9
            java.lang.String r9 = kotlin.time.Duration.m1402toStringimpl(r22)
            r22 = r10
            java.util.List r10 = r15.o
            int r10 = r10.size()
            r36 = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "onLogin#6("
            r7.<init>(r8)
            r7.append(r9)
            java.lang.String r8 = "): ChatsController.storeChatsFromServer chatsSize="
            r7.append(r8)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            r8 = 0
            r14.d(r1, r11, r7, r8)
        L_0x0466:
            r62 r1 = r2.e()
            java.util.List r7 = r15.o
            ue3 r8 = r15.z
            if (r8 == 0) goto L_0x0475
            java.util.Map r8 = r8.c
            r28 = r8
            goto L_0x0477
        L_0x0475:
            r28 = 0
        L_0x0477:
            r1.getClass()
            vd0 r8 = new vd0
            r29 = 20
            r30 = 2
            r25 = r8
            r26 = r1
            r27 = r7
            r25.<init>((java.lang.Object) r26, (java.lang.Object) r27, (java.lang.Object) r28, (int) r29, (int) r30)
            java.lang.String r7 = "storeChatsFromServer"
            java.lang.Object r1 = r1.o0(r7, r8)
            java.util.List r1 = (java.util.List) r1
            a67 r7 = defpackage.z68.b
            if (r7 != 0) goto L_0x0498
        L_0x0495:
            r25 = r12
            goto L_0x04d0
        L_0x0498:
            boolean r8 = r7.c()
            if (r8 == 0) goto L_0x0495
            w78 r8 = defpackage.w78.o
            long r9 = a(r0)
            java.lang.String r9 = kotlin.time.Duration.m1402toStringimpl(r9)
            ue3 r10 = r15.z
            if (r10 == 0) goto L_0x04ae
            r10 = 1
            goto L_0x04af
        L_0x04ae:
            r10 = 0
        L_0x04af:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r25 = r12
            java.lang.String r12 = "onLogin#7("
            r14.<init>(r12)
            r14.append(r9)
            java.lang.String r9 = "): notifConfigLogic.onChatsAndFolders with config="
            r14.append(r9)
            r14.append(r10)
            java.lang.String r9 = "}"
            r14.append(r9)
            java.lang.String r9 = r14.toString()
            r10 = 0
            r7.d(r8, r11, r9, r10)
        L_0x04d0:
            ue3 r7 = r15.z
            if (r7 == 0) goto L_0x04e9
            kotlin.Lazy r8 = r2.m
            java.lang.Object r8 = r8.getValue()
            yaa r8 = (defpackage.yaa) r8
            ws r9 = new ws
            r10 = r1
            java.util.Collection r10 = (java.util.Collection) r10
            r9.<init>((java.util.Collection) r10)
            r8.a(r7, r9)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
        L_0x04e9:
            a67 r7 = defpackage.z68.b
            if (r7 != 0) goto L_0x04ee
            goto L_0x051e
        L_0x04ee:
            boolean r8 = r7.c()
            if (r8 == 0) goto L_0x051e
            w78 r8 = defpackage.w78.o
            long r9 = a(r0)
            java.lang.String r9 = kotlin.time.Duration.m1402toStringimpl(r9)
            java.util.Map r10 = r15.X
            int r10 = r10.size()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "onLogin#8("
            r12.<init>(r13)
            r12.append(r9)
            java.lang.String r9 = "): updateMessages with size="
            r12.append(r9)
            r12.append(r10)
            java.lang.String r9 = r12.toString()
            r10 = 0
            r7.d(r8, r11, r9, r10)
        L_0x051e:
            java.util.Map r7 = r15.X
            r6.a = r2
            r6.b = r15
            r6.c = r0
            r6.o = r5
            r8 = r1
            java.util.List r8 = (java.util.List) r8
            r6.v = r8
            r6.w = r3
            r12 = r25
            r6.x = r12
            r8 = r36
            r6.y = r8
            r10 = r22
            r6.X = r10
            r36 = r0
            r37 = r1
            r0 = r19
            r6.z = r0
            r14 = r24
            r6.Y = r14
            r1 = 2
            r6.w0 = r1
            java.lang.Object r0 = r2.t(r7, r6)
            r1 = r21
            if (r0 != r1) goto L_0x0553
            return r1
        L_0x0553:
            r21 = r1
            r0 = r2
            r31 = r15
            r15 = r36
            r32 = r5
            r5 = r37
            r33 = r14
            r14 = r32
            r34 = r3
            r4 = r10
            r10 = r33
            r2 = r19
            r19 = r8
            r9 = r31
            r7 = r34
        L_0x056f:
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x057a
        L_0x0573:
            r22 = r4
            r23 = r6
            r25 = r7
            goto L_0x059c
        L_0x057a:
            boolean r22 = r1.c()
            if (r22 == 0) goto L_0x0573
            r22 = r4
            w78 r4 = defpackage.w78.o
            long r23 = a(r15)
            r25 = r7
            java.lang.String r7 = kotlin.time.Duration.m1402toStringimpl(r23)
            java.lang.String r8 = "onLogin#9("
            r23 = r6
            java.lang.String r6 = "): PresenceController.onLogin"
            java.lang.String r6 = defpackage.wj6.k(r8, r7, r6)
            r7 = 0
            r1.d(r4, r11, r6, r7)
        L_0x059c:
            kotlin.Lazy r1 = r0.k
            java.lang.Object r1 = r1.getValue()
            rtb r1 = (defpackage.rtb) r1
            java.util.Map r4 = r9.w
            java.util.HashMap r4 = defpackage.qe8.n(r4)
            r1.j(r4, r2)
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x05b2
            goto L_0x05ce
        L_0x05b2:
            boolean r4 = r1.c()
            if (r4 == 0) goto L_0x05ce
            w78 r4 = defpackage.w78.o
            long r6 = a(r15)
            java.lang.String r6 = kotlin.time.Duration.m1402toStringimpl(r6)
            java.lang.String r7 = "onLogin#10("
            java.lang.String r8 = "): CallsController.onLogin"
            java.lang.String r6 = defpackage.wj6.k(r7, r6, r8)
            r7 = 0
            r1.d(r4, r11, r6, r7)
        L_0x05ce:
            v21 r1 = r0.c()
            r1.getClass()
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x05da
            goto L_0x05f6
        L_0x05da:
            boolean r4 = r1.c()
            if (r4 == 0) goto L_0x05f6
            w78 r4 = defpackage.w78.o
            long r6 = a(r15)
            java.lang.String r6 = kotlin.time.Duration.m1402toStringimpl(r6)
            java.lang.String r7 = "onLogin#11("
            java.lang.String r8 = "): loadChatsIfNeed"
            java.lang.String r6 = defpackage.wj6.k(r7, r6, r8)
            r7 = 0
            r1.d(r4, r11, r6, r7)
        L_0x05f6:
            r0.o(r9, r12)
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x05fe
            goto L_0x061a
        L_0x05fe:
            boolean r4 = r1.c()
            if (r4 == 0) goto L_0x061a
            w78 r4 = defpackage.w78.o
            long r6 = a(r15)
            java.lang.String r6 = kotlin.time.Duration.m1402toStringimpl(r6)
            java.lang.String r7 = "onLogin#12("
            java.lang.String r8 = "): processDraftNewsUseCase"
            java.lang.String r6 = defpackage.wj6.k(r7, r6, r8)
            r7 = 0
            r1.d(r4, r11, r6, r7)
        L_0x061a:
            evb r1 = r0.m()
            ku4 r4 = r9.x0
            long r6 = r9.y
            r1.a(r4, r6)
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x062a
            goto L_0x0646
        L_0x062a:
            boolean r4 = r1.c()
            if (r4 == 0) goto L_0x0646
            w78 r4 = defpackage.w78.o
            long r6 = a(r15)
            java.lang.String r6 = kotlin.time.Duration.m1402toStringimpl(r6)
            java.lang.String r7 = "onLogin#13("
            java.lang.String r8 = "): ServiceTaskTransmitTamTasks.execute"
            java.lang.String r6 = defpackage.wj6.k(r7, r6, r8)
            r7 = 0
            r1.d(r4, r11, r6, r7)
        L_0x0646:
            jqg r1 = r0.n()
            defpackage.rvd.A(r1)
            fn4 r1 = r0.f()
            hn4 r1 = (defpackage.hn4) r1
            cxe r1 = r1.g
            xt6 r1 = (defpackage.xt6) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x066f
            java.lang.String r1 = "update push token on server"
            defpackage.z68.c(r11, r1, new java.lang.Object[0])
            kotlin.Lazy r1 = r0.a
            java.lang.Object r1 = r1.getValue()
            rl r1 = (defpackage.rl) r1
            jna r1 = (defpackage.jna) r1
            r1.v()
        L_0x066f:
            boolean r1 = defpackage.tf6.e
            java.lang.String r4 = "onLogin#14("
            if (r1 == 0) goto L_0x0696
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x067b
        L_0x0679:
            r7 = 1
            goto L_0x06c1
        L_0x067b:
            boolean r6 = r1.c()
            if (r6 == 0) goto L_0x0679
            w78 r6 = defpackage.w78.o
            long r7 = a(r15)
            java.lang.String r7 = kotlin.time.Duration.m1402toStringimpl(r7)
            java.lang.String r8 = "): phonebook already checked"
            java.lang.String r4 = defpackage.wj6.k(r4, r7, r8)
            r7 = 0
            r1.d(r6, r11, r4, r7)
            goto L_0x0679
        L_0x0696:
            r7 = 1
            defpackage.tf6.e = r7
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x069e
            goto L_0x06b8
        L_0x069e:
            boolean r6 = r1.c()
            if (r6 == 0) goto L_0x06b8
            w78 r6 = defpackage.w78.o
            long r12 = a(r15)
            java.lang.String r8 = kotlin.time.Duration.m1402toStringimpl(r12)
            java.lang.String r12 = "): phonebook.checkUpdates()"
            java.lang.String r4 = defpackage.wj6.k(r4, r8, r12)
            r8 = 0
            r1.d(r6, r11, r4, r8)
        L_0x06b8:
            deb r1 = r0.j()
            meb r1 = (defpackage.meb) r1
            r1.c()
        L_0x06c1:
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x06c6
            goto L_0x06e2
        L_0x06c6:
            boolean r4 = r1.c()
            if (r4 == 0) goto L_0x06e2
            w78 r4 = defpackage.w78.o
            long r12 = a(r15)
            java.lang.String r6 = kotlin.time.Duration.m1402toStringimpl(r12)
            java.lang.String r8 = "onLogin#15("
            java.lang.String r12 = "): phonebookSyncService.sync()"
            java.lang.String r6 = defpackage.wj6.k(r8, r6, r12)
            r8 = 0
            r1.d(r4, r11, r6, r8)
        L_0x06e2:
            oeb r1 = r0.k()
            r1.d()
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x06ee
            goto L_0x070a
        L_0x06ee:
            boolean r4 = r1.c()
            if (r4 == 0) goto L_0x070a
            w78 r4 = defpackage.w78.o
            long r12 = a(r15)
            java.lang.String r6 = kotlin.time.Duration.m1402toStringimpl(r12)
            java.lang.String r8 = "onLogin#16("
            java.lang.String r12 = "): updateStickers"
            java.lang.String r6 = defpackage.wj6.k(r8, r6, r12)
            r8 = 0
            r1.d(r4, r11, r6, r8)
        L_0x070a:
            ou8 r1 = r0.i()
            r1.getClass()
            kotlin.Lazy r1 = r0.a
            java.lang.Object r1 = r1.getValue()
            rl r1 = (defpackage.rl) r1
            r4 = r14
            qjd r4 = (defpackage.qjd) r4
            long r12 = r4.r()
            jna r1 = (defpackage.jna) r1
            r4 = 2
            r1.h(r4, r12)
            ai5 r1 = r0.g()
            r1.m()
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x0732
            goto L_0x074e
        L_0x0732:
            boolean r4 = r1.c()
            if (r4 == 0) goto L_0x074e
            w78 r4 = defpackage.w78.o
            long r12 = a(r15)
            java.lang.String r6 = kotlin.time.Duration.m1402toStringimpl(r12)
            java.lang.String r8 = "onLogin#17("
            java.lang.String r12 = "): updateReactions"
            java.lang.String r6 = defpackage.wj6.k(r8, r6, r12)
            r8 = 0
            r1.d(r4, r11, r6, r8)
        L_0x074e:
            gk r1 = r0.b()
            r1.k()
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x075a
            goto L_0x0776
        L_0x075a:
            boolean r4 = r1.c()
            if (r4 == 0) goto L_0x0776
            w78 r4 = defpackage.w78.o
            long r12 = a(r15)
            java.lang.String r6 = kotlin.time.Duration.m1402toStringimpl(r12)
            java.lang.String r8 = "onLogin#18("
            java.lang.String r12 = "): callsCredRepository.fetchTokenAsync()"
            java.lang.String r6 = defpackage.wj6.k(r8, r6, r12)
            r8 = 0
            r1.d(r4, r11, r6, r8)
        L_0x0776:
            uq1 r1 = r0.d()
            xq1 r1 = (defpackage.xq1) r1
            r1.b()
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x0784
            goto L_0x07b3
        L_0x0784:
            boolean r4 = r1.c()
            if (r4 == 0) goto L_0x07b3
            w78 r4 = defpackage.w78.o
            long r12 = a(r15)
            java.lang.String r6 = kotlin.time.Duration.m1402toStringimpl(r12)
            if (r10 != 0) goto L_0x0798
            r8 = r7
            goto L_0x0799
        L_0x0798:
            r8 = 0
        L_0x0799:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "onLogin#19("
            r12.<init>(r13)
            r12.append(r6)
            java.lang.String r6 = "): analytics.logSkippedPushes="
            r12.append(r6)
            r12.append(r8)
            java.lang.String r6 = r12.toString()
            r8 = 0
            r1.d(r4, r11, r6, r8)
        L_0x07b3:
            if (r10 != 0) goto L_0x07c4
            kotlin.Lazy r1 = r0.g
            java.lang.Object r1 = r1.getValue()
            nd r1 = (defpackage.nd) r1
            fn4 r4 = r0.f()
            r1.b(r9, r14, r4)
        L_0x07c4:
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x07c9
            goto L_0x07f8
        L_0x07c9:
            boolean r4 = r1.c()
            if (r4 == 0) goto L_0x07f8
            w78 r4 = defpackage.w78.o
            long r12 = a(r15)
            java.lang.String r6 = kotlin.time.Duration.m1402toStringimpl(r12)
            if (r10 != 0) goto L_0x07dd
            r8 = r7
            goto L_0x07de
        L_0x07dd:
            r8 = 0
        L_0x07de:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "onLogin#20("
            r12.<init>(r13)
            r12.append(r6)
            java.lang.String r6 = "): notificationsListener.cancelServerChatId="
            r12.append(r6)
            r12.append(r8)
            java.lang.String r6 = r12.toString()
            r8 = 0
            r1.d(r4, r11, r6, r8)
        L_0x07f8:
            if (r10 != 0) goto L_0x085c
            java.util.Iterator r1 = r5.iterator()
        L_0x07fe:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x085c
            java.lang.Object r4 = r1.next()
            java.lang.Long r4 = (java.lang.Long) r4
            r62 r6 = r0.e()
            long r12 = r4.longValue()
            a32 r4 = r6.G(r12)
            if (r4 == 0) goto L_0x07fe
            m72 r6 = r4.b
            int r8 = r6.m
            if (r8 != 0) goto L_0x07fe
            long r12 = r6.k
            long r27 = r4.o()
            int r6 = (r12 > r27 ? 1 : (r12 == r27 ? 0 : -1))
            if (r6 > 0) goto L_0x07fe
            a67 r6 = defpackage.z68.b
            if (r6 != 0) goto L_0x082f
        L_0x082c:
            r36 = r1
            goto L_0x0849
        L_0x082f:
            boolean r8 = r6.c()
            if (r8 == 0) goto L_0x082c
            w78 r8 = defpackage.w78.v
            m72 r12 = r4.b
            long r12 = r12.a
            java.lang.String r7 = "cancel notifications for chat "
            r36 = r1
            java.lang.String r1 = " because of no new messages!"
            java.lang.String r1 = defpackage.wj6.j(r12, r7, r1)
            r7 = 0
            r6.d(r8, r11, r1, r7)
        L_0x0849:
            kotlin.Lazy r1 = r0.n
            java.lang.Object r1 = r1.getValue()
            qwa r1 = (defpackage.qwa) r1
            m72 r4 = r4.b
            long r6 = r4.a
            r1.a(r6)
            r1 = r36
            r7 = 1
            goto L_0x07fe
        L_0x085c:
            kotlin.Lazy r1 = r0.n
            java.lang.Object r1 = r1.getValue()
            qwa r1 = (defpackage.qwa) r1
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r6 = r5
            java.util.Collection r6 = (java.util.Collection) r6
            r4.<init>(r6)
            r1.b(r4)
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x0876
        L_0x0873:
            r12 = r16
            goto L_0x08a5
        L_0x0876:
            boolean r4 = r1.c()
            if (r4 == 0) goto L_0x0873
            w78 r4 = defpackage.w78.o
            long r6 = a(r15)
            java.lang.String r6 = kotlin.time.Duration.m1402toStringimpl(r6)
            if (r10 == 0) goto L_0x088a
            r7 = 1
            goto L_0x088b
        L_0x088a:
            r7 = 0
        L_0x088b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r12 = r16
            r8.<init>(r12)
            r8.append(r6)
            java.lang.String r6 = "): sending critical logs if initial="
            r8.append(r6)
            r8.append(r7)
            java.lang.String r6 = r8.toString()
            r7 = 0
            r1.d(r4, r11, r6, r7)
        L_0x08a5:
            if (r10 == 0) goto L_0x08f4
            k78 r1 = r0.h()
            r6 = r23
            r6.a = r0
            r6.b = r9
            r6.c = r15
            r6.o = r14
            r4 = r5
            java.util.List r4 = (java.util.List) r4
            r6.v = r4
            r7 = r25
            r6.w = r7
            r36 = r5
            r4 = r19
            r6.x = r4
            r13 = r22
            r6.X = r13
            r6.y = r2
            r6.Y = r10
            r19 = r2
            r2 = 3
            r6.w0 = r2
            r2 = 0
            java.lang.Object r1 = r1.g(r2, r6)
            r3 = r21
            if (r1 != r3) goto L_0x08db
            return r3
        L_0x08db:
            r6 = r0
            r1 = r10
            r10 = r36
            r31 = r4
            r4 = r13
            r13 = r15
            r15 = r7
            r7 = r31
        L_0x08e6:
            r0 = r6
            r25 = r10
            r10 = r1
            r31 = r13
            r13 = r4
            r3 = r19
            r20 = r15
            r15 = r31
            goto L_0x0909
        L_0x08f4:
            r36 = r5
            r4 = r19
            r13 = r22
            r7 = r25
            r19 = r2
            r2 = 0
            r25 = r36
            r31 = r4
            r3 = r19
            r20 = r7
            r7 = r31
        L_0x0909:
            qjd r14 = (defpackage.qjd) r14
            r14.x(r3)
            kotlin.Lazy r1 = r0.f
            java.lang.Object r1 = r1.getValue()
            sv0 r1 = (defpackage.sv0) r1
            java.util.List r3 = r9.o
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L_0x092a
            r4 = r3
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x092a
        L_0x0927:
            r23 = r2
            goto L_0x0940
        L_0x092a:
            java.util.Iterator r3 = r3.iterator()
        L_0x092e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0927
            java.lang.Object r4 = r3.next()
            b32 r4 = (defpackage.b32) r4
            int r4 = r4.Z
            if (r4 <= 0) goto L_0x092e
            r23 = 1
        L_0x0940:
            boolean r3 = r9.v0
            w88 r4 = new w88
            if (r10 == 0) goto L_0x0949
            r22 = 1
            goto L_0x094b
        L_0x0949:
            r22 = r2
        L_0x094b:
            r19 = r4
            r24 = r3
            r19.<init>(r20, r22, r23, r24, r25)
            r1.c(r4)
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x095a
            goto L_0x0976
        L_0x095a:
            boolean r3 = r1.c()
            if (r3 == 0) goto L_0x0976
            w78 r3 = defpackage.w78.o
            long r4 = a(r15)
            java.lang.String r4 = kotlin.time.Duration.m1402toStringimpl(r4)
            java.lang.String r5 = "onLogin#20.saved_messages "
            java.lang.String r6 = ": saved messages"
            java.lang.String r4 = defpackage.wj6.k(r5, r4, r6)
            r5 = 0
            r1.d(r3, r11, r4, r5)
        L_0x0976:
            jtb r1 = r0.l()
            ltb r1 = (defpackage.ltb) r1
            cud r1 = r1.b
            boolean r1 = r1.y()
            if (r1 == 0) goto L_0x09e3
            fo3 r1 = r9.c
            if (r1 == 0) goto L_0x09d7
            long r3 = r1.a
            java.util.List r1 = r9.o
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r5 = r1 instanceof java.util.Collection
            if (r5 == 0) goto L_0x099c
            r5 = r1
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x099c
            goto L_0x09c7
        L_0x099c:
            java.util.Iterator r1 = r1.iterator()
        L_0x09a0:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x09c7
            java.lang.Object r5 = r1.next()
            b32 r5 = (defpackage.b32) r5
            r19 = r3
            long r2 = r5.a
            r17 = 0
            int r2 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r2 != 0) goto L_0x09c2
            int r2 = r5.V0
            r3 = 2
            if (r2 != r3) goto L_0x09c3
            long r4 = r5.c
            int r2 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r2 != 0) goto L_0x09c3
            goto L_0x09e3
        L_0x09c2:
            r3 = 2
        L_0x09c3:
            r3 = r19
            r2 = 0
            goto L_0x09a0
        L_0x09c7:
            kotlin.Lazy r1 = r0.a
            java.lang.Object r1 = r1.getValue()
            rl r1 = (defpackage.rl) r1
            jna r1 = (defpackage.jna) r1
            r2 = 0
            r1.l(r2)
            goto L_0x09e3
        L_0x09d7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x09e3:
            kotlin.time.Duration$Companion r1 = kotlin.time.Duration.Companion
            long r1 = java.lang.System.nanoTime()
            kotlin.time.DurationUnit r3 = kotlin.time.DurationUnit.NANOSECONDS
            long r1 = kotlin.time.DurationKt.toDuration((long) r1, (kotlin.time.DurationUnit) r3)
            long r1 = kotlin.time.Duration.m1388minusLRDsOJo(r1, r7)
            long r3 = r9.a
            kotlin.time.DurationUnit r5 = kotlin.time.DurationUnit.MILLISECONDS
            long r3 = kotlin.time.DurationKt.toDuration((long) r3, (kotlin.time.DurationUnit) r5)
            long r1 = kotlin.time.Duration.m1389plusLRDsOJo(r1, r3)
            a67 r3 = defpackage.z68.b
            if (r3 != 0) goto L_0x0a04
            goto L_0x0a1e
        L_0x0a04:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x0a1e
            w78 r4 = defpackage.w78.o
            long r5 = a(r15)
            java.lang.String r5 = kotlin.time.Duration.m1402toStringimpl(r5)
            java.lang.String r6 = "): sendAction"
            java.lang.String r5 = defpackage.wj6.k(r12, r5, r6)
            r6 = 0
            r3.d(r4, r11, r5, r6)
        L_0x0a1e:
            if (r13 == 0) goto L_0x0a3b
            fn4 r3 = r0.f()
            boolean r3 = r3.d()
            if (r3 == 0) goto L_0x0a3b
            if (r10 == 0) goto L_0x0a2e
            r5 = 1
            goto L_0x0a2f
        L_0x0a2e:
            r5 = 0
        L_0x0a2f:
            fn4 r3 = r0.f()
            kn4 r3 = r3.b()
            r0.s(r5, r3, r1)
            goto L_0x0a4b
        L_0x0a3b:
            if (r10 == 0) goto L_0x0a3f
            r5 = 1
            goto L_0x0a40
        L_0x0a3f:
            r5 = 0
        L_0x0a40:
            fn4 r3 = r0.f()
            kn4 r3 = r3.b()
            r0.r(r5, r3, r1)
        L_0x0a4b:
            a67 r0 = defpackage.z68.b
            if (r0 != 0) goto L_0x0a50
            goto L_0x0a66
        L_0x0a50:
            boolean r3 = r0.c()
            if (r3 == 0) goto L_0x0a66
            w78 r3 = defpackage.w78.o
            java.lang.String r1 = kotlin.time.Duration.m1402toStringimpl(r1)
            java.lang.String r2 = "onLogin#22: finished "
            java.lang.String r1 = defpackage.a81.m(r2, r1)
            r2 = 0
            r0.d(r3, r11, r1, r2)
        L_0x0a66:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e98.q(long, l88, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void r(boolean z2, kn4 kn4, long j2) {
        ((nd) this.g.getValue()).d(Duration.m1371getInWholeMillisecondsimpl(j2), z2 ? "FIRST_LOGIN_PROCESSING_TIME" : "LOGIN_PROCESSING_TIME", kn4.name());
    }

    public final void s(boolean z2, kn4 kn4, long j2) {
        ((nd) this.g.getValue()).d(Duration.m1371getInWholeMillisecondsimpl(j2), z2 ? "INTERACTIVE_FIRST_LOGIN_PROCESSING_TIME" : "INTERACTIVE_LOGIN_PROCESSING_TIME", kn4.name());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: b89} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x04af  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x04cf  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x04d9  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x04e4  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x04ec  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x051b  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0531 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01ae A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0466  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0493  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(java.util.Map r30, kotlin.coroutines.Continuation r31) {
        /*
            r29 = this;
            r0 = r31
            r1 = 3
            boolean r2 = r0 instanceof defpackage.c98
            if (r2 == 0) goto L_0x0018
            r2 = r0
            c98 r2 = (defpackage.c98) r2
            int r3 = r2.x0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.x0 = r3
            r3 = r29
            goto L_0x001f
        L_0x0018:
            c98 r2 = new c98
            r3 = r29
            r2.<init>(r3, r0)
        L_0x001f:
            java.lang.Object r0 = r2.v0
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r2.x0
            java.lang.String r6 = "e98"
            r8 = 2
            r9 = 1
            if (r5 == 0) goto L_0x00b3
            if (r5 == r9) goto L_0x0088
            if (r5 == r8) goto L_0x005e
            if (r5 != r1) goto L_0x0056
            int r3 = r2.Z
            int r5 = r2.Y
            kotlin.jvm.internal.Ref$ObjectRef r10 = r2.z
            b89 r11 = r2.y
            java.util.Iterator r12 = r2.x
            a89 r13 = r2.w
            a89 r14 = r2.v
            i72 r15 = r2.o
            a32 r8 = r2.c
            java.util.Iterator r9 = r2.b
            e98 r7 = r2.a
            kotlin.ResultKt.throwOnFailure(r0)
            r16 = r6
            r28 = r4
            r4 = r1
            r1 = r7
            r7 = r28
            goto L_0x03f7
        L_0x0056:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x005e:
            int r3 = r2.Z
            int r5 = r2.Y
            kotlin.jvm.internal.Ref$ObjectRef r7 = r2.X
            kotlin.jvm.internal.Ref$ObjectRef r8 = r2.z
            b89 r9 = r2.y
            java.util.Iterator r10 = r2.x
            a89 r11 = r2.w
            a89 r12 = r2.v
            i72 r13 = r2.o
            a32 r14 = r2.c
            java.util.Iterator r15 = r2.b
            e98 r1 = r2.a
            kotlin.ResultKt.throwOnFailure(r0)
            r16 = r6
            r6 = r10
            r10 = r8
            r8 = r14
            r14 = r12
            r12 = r9
            r9 = r15
            r15 = r13
            r13 = r11
            r11 = r7
            r7 = r4
            r4 = 2
            goto L_0x03b9
        L_0x0088:
            int r1 = r2.Z
            int r3 = r2.Y
            kotlin.jvm.internal.Ref$ObjectRef r5 = r2.X
            kotlin.jvm.internal.Ref$ObjectRef r7 = r2.z
            b89 r8 = r2.y
            java.util.Iterator r9 = r2.x
            a89 r10 = r2.w
            a89 r11 = r2.v
            i72 r12 = r2.o
            a32 r13 = r2.c
            java.util.Iterator r14 = r2.b
            e98 r15 = r2.a
            kotlin.ResultKt.throwOnFailure(r0)
            r16 = r6
            r6 = r15
            r15 = r11
            r11 = r7
            r28 = r12
            r12 = r8
            r8 = r13
            r13 = r9
            r9 = r14
            r14 = r10
            r10 = r28
            goto L_0x01ba
        L_0x00b3:
            kotlin.ResultKt.throwOnFailure(r0)
            java.util.Set r0 = r30.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x00be:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0531
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r5 = r1.getKey()
            java.lang.Number r5 = (java.lang.Number) r5
            long r7 = r5.longValue()
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            kotlin.Lazy r5 = r3.v
            java.lang.Object r5 = r5.getValue()
            sa2 r5 = (defpackage.sa2) r5
            r5.getClass()
            boolean r9 = r1.isEmpty()
            if (r9 == 0) goto L_0x00f0
            java.util.List r5 = java.util.Collections.emptyList()
            goto L_0x0104
        L_0x00f0:
            idb r9 = defpackage.idb.TYPE_MSG_EDIT
            eef r5 = r5.g
            r10 = 0
            java.util.List r5 = r5.h(r10, r9)
            x52 r9 = new x52
            r10 = 3
            r9.<init>(r10, r5)
            java.util.List r5 = defpackage.cjf.q(r1, r9)
        L_0x0104:
            int r9 = r5.size()
            int r10 = r1.size()
            if (r9 == r10) goto L_0x012a
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x0113
            goto L_0x0129
        L_0x0113:
            boolean r9 = r1.c()
            if (r9 == 0) goto L_0x0129
            w78 r9 = defpackage.w78.o
            int r10 = r5.size()
            java.lang.String r11 = "updateMessages: local edit found by size "
            java.lang.String r10 = defpackage.wj6.h(r10, r11)
            r11 = 0
            r1.d(r9, r6, r10, r11)
        L_0x0129:
            r1 = r5
        L_0x012a:
            boolean r5 = r1.isEmpty()
            if (r5 != 0) goto L_0x013a
            r62 r5 = r3.e()
            a32 r5 = r5.D(r7)
            if (r5 != 0) goto L_0x013f
        L_0x013a:
            r7 = r4
            r16 = r6
            goto L_0x052c
        L_0x013f:
            m72 r7 = r5.b
            i72 r7 = r7.o0
            a89 r8 = r5.c
            a89 r9 = r5.v
            java.util.Iterator r1 = r1.iterator()
            r10 = 0
            r13 = r1
            r12 = r7
            r15 = r8
            r14 = r9
            r1 = r10
            r10 = r5
            r5 = r3
            r3 = r1
        L_0x0154:
            boolean r7 = r13.hasNext()
            if (r7 == 0) goto L_0x04e4
            java.lang.Object r7 = r13.next()
            r11 = r7
            b89 r11 = (defpackage.b89) r11
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            kotlin.Lazy r7 = r5.e
            java.lang.Object r7 = r7.getValue()
            s74 r7 = (defpackage.s74) r7
            a74 r7 = (defpackage.a74) r7
            z6d r7 = r7.c
            r16 = r6
            r9 = r7
            long r6 = r10.a
            r29 = r6
            long r6 = r11.a
            r2.a = r5
            r2.b = r0
            r2.c = r10
            r2.o = r12
            r2.v = r15
            r2.w = r14
            r2.x = r13
            r2.y = r11
            r2.z = r8
            r2.X = r8
            r2.Y = r3
            r2.Z = r1
            r17 = r0
            r0 = 1
            r2.x0 = r0
            r18 = r29
            r20 = r6
            r7 = r9
            r0 = r8
            r8 = r18
            r6 = r10
            r18 = r11
            r10 = r20
            r19 = r12
            r12 = r2
            java.lang.Object r7 = r7.j(r8, r10, r12)
            if (r7 != r4) goto L_0x01af
            return r4
        L_0x01af:
            r11 = r0
            r8 = r6
            r9 = r17
            r12 = r18
            r10 = r19
            r6 = r5
            r0 = r7
            r5 = r11
        L_0x01ba:
            r5.element = r0
            re9 r0 = r12.v
            if (r0 == 0) goto L_0x01d0
            int[] r5 = defpackage.a98.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r5[r0]
            java.lang.String r5 = ", message.id = "
            r7 = 1
            if (r0 == r7) goto L_0x02fa
            r7 = 2
            if (r0 == r7) goto L_0x01e0
        L_0x01d0:
            r26 = r1
            r29 = r3
            r7 = r4
            r17 = r6
            r0 = r8
            r1 = r9
            r19 = r10
            r18 = r13
            r13 = r2
            goto L_0x04a2
        L_0x01e0:
            T r0 = r11.element
            if (r0 == 0) goto L_0x027b
            kotlin.Lazy r0 = r6.e
            java.lang.Object r0 = r0.getValue()
            s74 r0 = (defpackage.s74) r0
            a74 r0 = (defpackage.a74) r0
            z6d r0 = r0.c
            r29 = r3
            r24 = r4
            long r3 = r8.a
            T r7 = r11.element
            ha9 r7 = (defpackage.ha9) r7
            r30 = r13
            r25 = r14
            long r13 = r7.b
            java.lang.Long r7 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r13)
            java.util.List r7 = kotlin.collections.CollectionsKt.listOf(r7)
            qe9 r13 = defpackage.qe9.DELETED
            aj9 r0 = r0.d()
            r0.o(r3, r7, r13)
            a67 r0 = defpackage.z68.b
            if (r0 != 0) goto L_0x021c
        L_0x0215:
            r26 = r1
            r27 = r2
            r4 = r16
            goto L_0x0243
        L_0x021c:
            boolean r3 = r0.c()
            if (r3 == 0) goto L_0x0215
            w78 r3 = defpackage.w78.o
            long r13 = r8.a
            T r4 = r11.element
            ha9 r4 = (defpackage.ha9) r4
            r26 = r1
            r27 = r2
            long r1 = r4.b
            java.lang.String r4 = "updateMessages, REMOVED: chat.id = "
            java.lang.StringBuilder r4 = defpackage.tr1.n(r13, r4, r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r4 = r16
            r2 = 0
            r0.d(r3, r4, r1, r2)
        L_0x0243:
            kotlin.Lazy r0 = r6.f
            java.lang.Object r0 = r0.getValue()
            sv0 r0 = (defpackage.sv0) r0
            kv9 r1 = new kv9
            long r2 = r8.a
            T r5 = r11.element
            ha9 r5 = (defpackage.ha9) r5
            long r13 = r5.b
            java.lang.Long r5 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r13)
            java.util.List r5 = kotlin.collections.CollectionsKt.listOf(r5)
            r7 = 0
            r1.<init>(r2, r5, r7)
            r0.c(r1)
            kotlin.Lazy r0 = r6.w
            java.lang.Object r0 = r0.getValue()
            wba r0 = (defpackage.wba) r0
            kotlin.Lazy r1 = r6.n
            java.lang.Object r1 = r1.getValue()
            qwa r1 = (defpackage.qwa) r1
            r0.getClass()
            defpackage.wba.a(r8, r1)
            goto L_0x0289
        L_0x027b:
            r26 = r1
            r27 = r2
            r29 = r3
            r24 = r4
            r30 = r13
            r25 = r14
            r4 = r16
        L_0x0289:
            if (r10 == 0) goto L_0x02e8
            long r0 = r10.c
            long r2 = r12.a
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x02e8
            r62 r0 = r6.e()
            m72 r1 = r8.b
            long r1 = r1.a
            r0.getClass()
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r5 = "r62"
            java.lang.String r7 = "removeLastPushMessage %d"
            defpackage.z68.c(r5, r7, r3)
            a32 r3 = r0.D(r1)
            if (r3 != 0) goto L_0x02c7
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r13 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r13)
            java.lang.String r1 = "removeLastPushMessage: chat not found! %d"
            r2 = 0
            defpackage.z68.n(r5, r2, r1, r0)
            goto L_0x02e8
        L_0x02c7:
            r13 = 1
            fm0 r1 = new fm0
            r2 = 25
            r1.<init>(r2)
            long r2 = r3.a
            r0.i(r2, r13, r1)
            xy2 r1 = new xy2
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            java.util.List r2 = (java.util.List) r2
            r1.<init>(r2, r13)
            sv0 r0 = r0.m
            r0.c(r1)
        L_0x02e8:
            r18 = r30
            r16 = r4
            r17 = r6
            r0 = r8
            r1 = r9
            r19 = r10
            r7 = r24
            r14 = r25
            r13 = r27
            goto L_0x04a2
        L_0x02fa:
            r26 = r1
            r27 = r2
            r29 = r3
            r24 = r4
            r30 = r13
            r25 = r14
            r4 = r16
            r13 = r7
            T r0 = r11.element
            if (r0 == 0) goto L_0x044d
            kotlin.Lazy r0 = r6.e
            java.lang.Object r0 = r0.getValue()
            s74 r0 = (defpackage.s74) r0
            a74 r0 = (defpackage.a74) r0
            z6d r0 = r0.c
            long r1 = r8.a
            r23 = 0
            r20 = 0
            r17 = r0
            r18 = r1
            r22 = r12
            r17.p(r18, r20, r22, r23)
            a67 r0 = defpackage.z68.b
            if (r0 != 0) goto L_0x032d
            goto L_0x035d
        L_0x032d:
            boolean r1 = r0.c()
            if (r1 == 0) goto L_0x035d
            w78 r1 = defpackage.w78.o
            long r2 = r8.a
            T r7 = r11.element
            ha9 r7 = (defpackage.ha9) r7
            if (r7 == 0) goto L_0x0344
            long r13 = r7.b
            java.lang.Long r7 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r13)
            goto L_0x0345
        L_0x0344:
            r7 = 0
        L_0x0345:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "updateMessages, EDITED: chat.id = "
            r13.<init>(r14)
            r13.append(r2)
            r13.append(r5)
            r13.append(r7)
            java.lang.String r2 = r13.toString()
            r3 = 0
            r0.d(r1, r4, r2, r3)
        L_0x035d:
            kotlin.Lazy r0 = r6.e
            java.lang.Object r0 = r0.getValue()
            s74 r0 = (defpackage.s74) r0
            a74 r0 = (defpackage.a74) r0
            z6d r5 = r0.c
            long r0 = r8.a
            long r2 = r12.a
            r13 = r27
            r13.a = r6
            r13.b = r9
            r13.c = r8
            r13.o = r10
            r13.v = r15
            r14 = r25
            r13.w = r14
            r7 = r30
            r13.x = r7
            r13.y = r12
            r13.z = r11
            r13.X = r11
            r16 = r4
            r4 = r29
            r13.Y = r4
            r4 = r26
            r13.Z = r4
            r4 = 2
            r13.x0 = r4
            r17 = r6
            r18 = r7
            r6 = r0
            r0 = r8
            r1 = r9
            r8 = r2
            r19 = r10
            r10 = r13
            java.lang.Object r2 = r5.j(r6, r8, r10)
            r7 = r24
            if (r2 != r7) goto L_0x03a8
            return r7
        L_0x03a8:
            r5 = r29
            r8 = r0
            r9 = r1
            r0 = r2
            r10 = r11
            r2 = r13
            r13 = r14
            r14 = r15
            r1 = r17
            r6 = r18
            r15 = r19
            r3 = r26
        L_0x03b9:
            r11.element = r0
            T r0 = r10.element
            if (r0 == 0) goto L_0x0445
            kotlin.Lazy r0 = r1.B
            java.lang.Object r0 = r0.getValue()
            gaf r0 = (defpackage.gaf) r0
            osa r0 = (defpackage.osa) r0
            q04 r0 = r0.b()
            d98 r11 = new d98
            r4 = 0
            r11.<init>(r1, r10, r12, r4)
            r2.a = r1
            r2.b = r9
            r2.c = r8
            r2.o = r15
            r2.v = r14
            r2.w = r13
            r2.x = r6
            r2.y = r12
            r2.z = r10
            r2.X = r4
            r2.Y = r5
            r2.Z = r3
            r4 = 3
            r2.x0 = r4
            java.lang.Object r0 = defpackage.ev0.I(r0, r11, r2)
            if (r0 != r7) goto L_0x03f5
            return r7
        L_0x03f5:
            r11 = r12
            r12 = r6
        L_0x03f7:
            kotlin.Lazy r0 = r1.q
            java.lang.Object r0 = r0.getValue()
            esb r0 = (defpackage.esb) r0
            T r6 = r10.element
            ha9 r6 = (defpackage.ha9) r6
            r62 r4 = r1.e()
            r29 = r2
            T r2 = r10.element
            ha9 r2 = (defpackage.ha9) r2
            r30 = r3
            long r2 = r2.z
            a32 r2 = r4.G(r2)
            r0.b(r2, r6)
            kotlin.Lazy r0 = r1.f
            java.lang.Object r0 = r0.getValue()
            sv0 r0 = (defpackage.sv0) r0
            twf r2 = new twf
            long r3 = r8.a
            T r6 = r10.element
            ha9 r6 = (defpackage.ha9) r6
            r10 = r5
            long r5 = r6.b
            r18 = 0
            r17 = r2
            r19 = r3
            r21 = r5
            r17.<init>(r18, r19, r21)
            r0.c(r2)
            r2 = r29
            r6 = r1
            r3 = r10
            r10 = r15
            r1 = r30
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r11
            goto L_0x0464
        L_0x0445:
            r10 = r15
            r15 = r14
            r14 = r13
            r13 = r6
            r6 = r1
            r1 = r3
            r3 = r5
            goto L_0x0464
        L_0x044d:
            r18 = r30
            r16 = r4
            r17 = r6
            r0 = r8
            r1 = r9
            r19 = r10
            r7 = r24
            r14 = r25
            r13 = r27
            r3 = r29
            r2 = r13
            r13 = r18
            r1 = r26
        L_0x0464:
            if (r10 == 0) goto L_0x0493
            long r4 = r10.c
            r29 = r1
            long r0 = r12.a
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x048e
            r62 r17 = r6.e()
            m72 r0 = r8.b
            long r0 = r0.a
            long r4 = r12.a
            java.lang.String r11 = r12.x
            r30 = r2
            r25 = r3
            long r2 = r12.c
            r18 = r0
            r20 = r4
            r22 = r2
            r24 = r11
            r17.w0(r18, r20, r22, r24)
            goto L_0x0496
        L_0x048e:
            r30 = r2
            r25 = r3
            goto L_0x0496
        L_0x0493:
            r29 = r1
            goto L_0x048e
        L_0x0496:
            r1 = r29
            r2 = r30
            r5 = r6
            r0 = r9
            r19 = r10
            r3 = r25
            r10 = r8
            goto L_0x04ad
        L_0x04a2:
            r3 = r29
            r10 = r0
            r0 = r1
            r2 = r13
            r5 = r17
            r13 = r18
            r1 = r26
        L_0x04ad:
            if (r15 == 0) goto L_0x04bf
            ha9 r4 = r15.a
            long r8 = r4.c
            r29 = r0
            r30 = r1
            long r0 = r12.a
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x04c3
            r3 = 1
            goto L_0x04c3
        L_0x04bf:
            r29 = r0
            r30 = r1
        L_0x04c3:
            if (r14 == 0) goto L_0x04d9
            ha9 r0 = r14.a
            long r0 = r0.c
            long r8 = r12.a
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x04d9
            r0 = r29
            r4 = r7
            r6 = r16
            r12 = r19
            r1 = 1
            goto L_0x0154
        L_0x04d9:
            r0 = r29
            r1 = r30
            r4 = r7
            r6 = r16
            r12 = r19
            goto L_0x0154
        L_0x04e4:
            r17 = r0
            r7 = r4
            r16 = r6
            r6 = r10
            if (r3 == 0) goto L_0x0519
            r62 r0 = r5.e()
            long r3 = r6.a
            r0.A(r3)
            kotlin.Lazy r0 = r5.f
            java.lang.Object r0 = r0.getValue()
            sv0 r0 = (defpackage.sv0) r0
            xy2 r3 = new xy2
            long r8 = r6.a
            java.lang.Long r4 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r8)
            java.util.List r4 = kotlin.collections.CollectionsKt.listOf(r4)
            r9 = r4
            java.util.Collection r9 = (java.util.Collection) r9
            r12 = 0
            r13 = 0
            r10 = 0
            r11 = 0
            r14 = 124(0x7c, float:1.74E-43)
            r8 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0.c(r3)
        L_0x0519:
            if (r1 == 0) goto L_0x0524
            r62 r0 = r5.e()
            long r3 = r6.a
            r0.y0(r3)
        L_0x0524:
            r3 = r5
            r4 = r7
            r6 = r16
            r0 = r17
            goto L_0x00be
        L_0x052c:
            r4 = r7
            r6 = r16
            goto L_0x00be
        L_0x0531:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e98.t(java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

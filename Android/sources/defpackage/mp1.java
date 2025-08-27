package defpackage;

import android.app.Application;
import android.content.Intent;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KProperty;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import one.me.calls.impl.service.CallServiceImpl;
import org.apache.http.HttpStatus;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;

/* renamed from: mp1  reason: default package */
public final class mp1 implements dp1 {
    public static final /* synthetic */ KProperty[] M = {rae.s(mp1.class, "cameraTrackerJob", "getCameraTrackerJob()Lkotlinx/coroutines/Job;", 0)};
    public final Lazy A;
    public final Lazy B;
    public final Lazy C;
    public final Lazy D;
    public final Lazy E;
    public aje F;
    public final wie G;
    public boolean H;
    public final LinkedHashSet I = new LinkedHashSet();
    public final xme J;
    public final xme K;
    public final hp1 L;
    public final cp1 a;
    public final c31 b;
    public final sp1 c;
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

    public mp1(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7, Lazy lazy8, Lazy lazy9, Lazy lazy10, Lazy lazy11, Lazy lazy12, Lazy lazy13, Lazy lazy14, Lazy lazy15, Lazy lazy16, Lazy lazy17, Lazy lazy18, Lazy lazy19, Lazy lazy20, Lazy lazy21, Lazy lazy22, Lazy lazy23, Lazy lazy24, Lazy lazy25, Lazy lazy26, Lazy lazy27, cp1 cp1, c31 c31, sp1 sp1, Lazy lazy28, Lazy lazy29) {
        cp1 cp12 = cp1;
        this.a = cp12;
        this.b = c31;
        this.c = sp1;
        this.d = lazy;
        this.e = lazy3;
        this.f = lazy4;
        this.g = lazy5;
        this.h = lazy6;
        this.i = lazy7;
        this.j = lazy9;
        this.k = lazy11;
        this.l = lazy13;
        this.m = lazy8;
        this.n = lazy10;
        this.o = lazy12;
        this.p = lazy16;
        this.q = lazy14;
        this.r = lazy17;
        this.s = lazy18;
        this.t = lazy2;
        this.u = lazy20;
        this.v = lazy21;
        this.w = lazy24;
        this.x = lazy22;
        this.y = lazy23;
        this.z = lazy25;
        this.A = lazy26;
        this.B = lazy28;
        this.C = lazy29;
        this.D = lazy15;
        this.E = lazy27;
        wie U = o5a.U();
        this.G = U;
        xme a2 = f6e.a(s44.k);
        this.J = a2;
        this.K = a2;
        this.L = new hp1(this, lazy8, lazy7, lazy2, lazy);
        ((vpa) lazy19.getValue()).getClass();
        U.setValue(this, M[0], ev0.v(cp12, ((osa) ((gaf) lazy18.getValue())).b(), (f14) null, new gp1(this, (Continuation) null), 2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: fe5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: fe5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: fe5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v15, types: [java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r4v16, types: [fe5] */
    /* JADX WARNING: type inference failed for: r4v18, types: [fe5] */
    /* JADX WARNING: type inference failed for: r4v19 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(defpackage.mp1 r17, java.lang.Throwable r18) {
        /*
            r0 = r17
            r1 = r18
            r17.getClass()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "CallEngineTag"
            java.lang.String r4 = "can't start call"
            defpackage.z68.h(r3, r1, r4, r2)
        L_0x0011:
            xme r2 = r0.J
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            s44 r4 = (defpackage.s44) r4
            s44 r5 = r17.i()
            boolean r4 = r1 instanceof ru.ok.android.api.core.ApiInvocationException
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x0082
            s44 r4 = r17.i()
            ld9 r4 = r4.a
            if (r4 == 0) goto L_0x0052
            boolean r4 = r4 instanceof defpackage.fl1
            r4 = r4 ^ r6
            if (r4 != r6) goto L_0x0052
            tq1 r8 = r17.l()
            s44 r4 = r17.j()
            java.lang.String r10 = r4.c
            r4 = r1
            ru.ok.android.api.core.ApiInvocationException r4 = (ru.ok.android.api.core.ApiInvocationException) r4
            int r4 = r4.a
            r8.getClass()
            java.lang.String r14 = java.lang.String.valueOf(r4)
            r13 = 0
            r15 = 1
            java.lang.String r9 = "GROUP_CALL_JOIN_FAILED"
            r11 = 0
            r12 = 0
            r16 = 28
            defpackage.tq1.a(r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x0052:
            r4 = r1
            ru.ok.android.api.core.ApiInvocationException r4 = (ru.ok.android.api.core.ApiInvocationException) r4
            java.lang.String r4 = r4.getMessage()
            if (r4 != 0) goto L_0x005d
            r4 = r7
            goto L_0x0073
        L_0x005d:
            java.lang.String r6 = "privacy.violation"
            boolean r6 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r4, (java.lang.CharSequence) r6, false, 2, (java.lang.Object) null)
            if (r6 != 0) goto L_0x0071
            java.lang.String r6 = "call.blocked"
            boolean r4 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r4, (java.lang.CharSequence) r6, false, 2, (java.lang.Object) null)
            if (r4 == 0) goto L_0x006e
            goto L_0x0071
        L_0x006e:
            fe5 r4 = defpackage.fe5.o
            goto L_0x0073
        L_0x0071:
            fe5 r4 = defpackage.fe5.c
        L_0x0073:
            dq1 r6 = r17.r()
            if (r4 == 0) goto L_0x007d
            java.lang.String r7 = r4.name()
        L_0x007d:
            r6.b(r7)
            r7 = r4
            goto L_0x009b
        L_0x0082:
            boolean r4 = r1 instanceof java.lang.IllegalStateException
            if (r4 == 0) goto L_0x009b
            java.lang.String r4 = r18.getMessage()
            if (r4 == 0) goto L_0x009b
            java.lang.String r8 = "endpoint is null"
            boolean r4 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r4, (java.lang.CharSequence) r8, false, 2, (java.lang.Object) null)
            if (r4 != r6) goto L_0x009b
            dq1 r4 = r17.r()
            r4.b(r7)
        L_0x009b:
            ge5 r15 = new ge5
            if (r7 != 0) goto L_0x00a1
            fe5 r7 = defpackage.fe5.o
        L_0x00a1:
            r15.<init>(r7)
            r12 = 0
            r16 = 511(0x1ff, float:7.16E-43)
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            s44 r4 = defpackage.s44.a(r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r2 = r2.b(r3, r4)
            if (r2 == 0) goto L_0x0011
            r17.x()
            boolean r2 = r1 instanceof java.io.IOException
            if (r2 == 0) goto L_0x00d0
            one.me.calls.impl.model.CallCreateException r2 = new one.me.calls.impl.model.CallCreateException
            java.lang.String r3 = r18.getMessage()
            java.lang.String r4 = "Can't create a call due to error: "
            java.lang.String r3 = defpackage.a81.m(r4, r3)
            r2.<init>(r3, r1)
            r1 = r2
        L_0x00d0:
            kotlin.Lazy r0 = r0.u
            java.lang.Object r0 = r0.getValue()
            e24 r0 = (defpackage.e24) r0
            java.lang.String r2 = "ONEME-6833"
            r0.a(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mp1.a(mp1, java.lang.Throwable):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v21, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r12v0, types: [boolean, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x028d A[LOOP:2: B:109:0x028d->B:110:0x02bb, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(defpackage.mp1 r30, ru.ok.android.externcalls.sdk.events.end.ConversationEndReason r31) {
        /*
            r1 = r30
            r2 = r31
            s44 r0 = r30.j()
            java.lang.String r5 = r0.c
            s44 r0 = r30.j()
            boolean r0 = r0.g
            s44 r3 = r30.j()
            ld9 r3 = r3.a
            r13 = 1
            if (r3 == 0) goto L_0x0021
            boolean r3 = r3.J()
            if (r3 != r13) goto L_0x0021
            r3 = 2
            goto L_0x0022
        L_0x0021:
            r3 = r13
        L_0x0022:
            boolean r14 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Hangup
            r15 = 0
            java.lang.String r4 = "ERROR"
            java.lang.String r6 = "BUSY"
            java.lang.String r7 = "REJECTED"
            if (r14 == 0) goto L_0x0031
            java.lang.String r8 = "HUNGUP"
        L_0x002f:
            r9 = r15
            goto L_0x0077
        L_0x0031:
            boolean r8 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Rejected
            if (r8 == 0) goto L_0x004e
            if (r0 == 0) goto L_0x004a
            kotlin.Lazy r8 = r1.A
            java.lang.Object r8 = r8.getValue()
            edb r8 = (defpackage.edb) r8
            java.lang.String[] r9 = defpackage.edb.h
            boolean r8 = r8.b(r9)
            if (r8 != 0) goto L_0x004a
            java.lang.String r8 = "no_permission"
            goto L_0x004b
        L_0x004a:
            r8 = r15
        L_0x004b:
            r9 = r8
            r8 = r7
            goto L_0x0077
        L_0x004e:
            boolean r8 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.RemovedFromCall
            if (r8 == 0) goto L_0x0055
            java.lang.String r8 = "KICK_BY_ADMIN"
            goto L_0x002f
        L_0x0055:
            boolean r8 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Busy
            if (r8 == 0) goto L_0x005b
            r8 = r6
            goto L_0x002f
        L_0x005b:
            boolean r8 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Canceled
            if (r8 == 0) goto L_0x0062
            java.lang.String r8 = "CANCELED"
            goto L_0x002f
        L_0x0062:
            boolean r8 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Error
            if (r8 == 0) goto L_0x0074
            r8 = r2
            ru.ok.android.externcalls.sdk.events.end.ConversationEndReason$Error r8 = (ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Error) r8
            java.lang.Throwable r8 = r8.getThrowable()
            java.lang.String r8 = r8.getMessage()
            r9 = r8
            r8 = r4
            goto L_0x0077
        L_0x0074:
            java.lang.String r8 = "OTHER"
            goto L_0x002f
        L_0x0077:
            r11 = 0
            if (r0 == 0) goto L_0x0080
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r7)
            if (r7 != 0) goto L_0x0090
        L_0x0080:
            if (r0 == 0) goto L_0x0088
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r6)
            if (r6 != 0) goto L_0x0090
        L_0x0088:
            if (r0 == 0) goto L_0x00ae
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r4)
            if (r0 == 0) goto L_0x00ae
        L_0x0090:
            tq1 r0 = r30.l()
            r0.getClass()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "INCOMING_CALL_RECEIVED"
            r16 = 80
            r10 = 0
            r17 = 0
            r3 = r0
            r6 = r8
            r8 = r10
            r10 = r17
            r12 = r11
            r11 = r16
            defpackage.tq1.a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x00d1
        L_0x00ae:
            r12 = r11
            tq1 r3 = r30.l()
            s44 r0 = r30.i()
            ld9 r0 = r0.a
            if (r0 == 0) goto L_0x00c2
            boolean r0 = r0 instanceof defpackage.fl1
            r0 = r0 ^ r13
            if (r0 != r13) goto L_0x00c2
            r10 = r13
            goto L_0x00c3
        L_0x00c2:
            r10 = r12
        L_0x00c3:
            r3.getClass()
            java.lang.String r4 = "FINISH_CALL"
            r11 = 24
            r7 = 0
            r0 = 0
            r6 = r8
            r8 = r0
            defpackage.tq1.a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x00d1:
            ru.ok.android.externcalls.sdk.Conversation r3 = r30.n()
            if (r3 == 0) goto L_0x0458
            kotlin.Lazy r4 = r1.h
            java.lang.Object r0 = r4.getValue()
            r5 = r0
            by4 r5 = (defpackage.by4) r5
            s44 r0 = r30.i()
            boolean r0 = r0.f
            if (r0 != 0) goto L_0x00eb
        L_0x00e8:
            r7 = r14
            goto L_0x0262
        L_0x00eb:
            kotlin.Lazy r0 = r1.y
            java.lang.Object r0 = r0.getValue()
            bud r0 = (defpackage.bud) r0
            akd r0 = (defpackage.akd) r0
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r6 = ru.ok.tamtam.android.prefs.PmsKey.f14callrate
            java.lang.String r6 = r0.z(r6, r15)
            if (r6 != 0) goto L_0x0101
            goto L_0x00e8
        L_0x0101:
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x0126 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x0126 }
            r0.<init>((java.lang.String) r6)     // Catch:{ all -> 0x0126 }
            java.lang.String r7 = "limit"
            r8 = 10
            int r7 = r0.optInt(r7, r8)     // Catch:{ all -> 0x0126 }
            java.lang.String r9 = "sdk-limit"
            int r9 = r0.optInt(r9, r8)     // Catch:{ all -> 0x0126 }
            java.lang.String r10 = "duration"
            int r0 = r0.optInt(r10, r8)     // Catch:{ all -> 0x0126 }
            jpc r8 = new jpc     // Catch:{ all -> 0x0126 }
            r8.<init>(r7, r9, r0)     // Catch:{ all -> 0x0126 }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r8)     // Catch:{ all -> 0x0126 }
            goto L_0x0131
        L_0x0126:
            r0 = move-exception
            kotlin.Result$Companion r7 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)
        L_0x0131:
            java.lang.Throwable r7 = kotlin.Result.m26exceptionOrNullimpl(r0)
            if (r7 == 0) goto L_0x0147
            java.lang.String r7 = "invalid rate call params json config "
            java.lang.String r6 = r7.concat(r6)
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r6)
            java.lang.String r8 = "RateCallParams"
            defpackage.z68.f(r8, r6, r7)
        L_0x0147:
            boolean r6 = kotlin.Result.m29isFailureimpl(r0)
            if (r6 == 0) goto L_0x014e
            r0 = r15
        L_0x014e:
            jpc r0 = (defpackage.jpc) r0
            if (r0 != 0) goto L_0x0153
            goto L_0x00e8
        L_0x0153:
            kotlin.Lazy r6 = r1.x
            java.lang.Object r7 = r6.getValue()
            fq r7 = (defpackage.fq) r7
            hq r7 = (defpackage.hq) r7
            ls7 r7 = r7.g
            java.lang.String r8 = "call.rate.indicator"
            int r7 = r7.getInt(r8, r12)
            ru.ok.android.externcalls.sdk.rate.RateManager r9 = r3.getRateManager()
            boolean r9 = r9.getShouldRateConversation()
            if (r9 == 0) goto L_0x0172
            int r9 = r0.b
            goto L_0x0174
        L_0x0172:
            int r9 = r0.a
        L_0x0174:
            int r9 = r9 - r7
            if (r9 > r13) goto L_0x024e
            ru.ok.android.externcalls.sdk.rate.RateManager r7 = r3.getRateManager()
            boolean r7 = r7.getShouldRateConversation()
            if (r7 == 0) goto L_0x01ac
            ru.ok.android.externcalls.sdk.rate.RateManager r7 = r3.getRateManager()
            java.util.List r7 = r7.getRateHints()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r7, 10)
            r9.<init>(r10)
            java.util.Iterator r7 = r7.iterator()
        L_0x0198:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x01b0
            java.lang.Object r10 = r7.next()
            ru.ok.android.externcalls.sdk.rate.RateHint r10 = (ru.ok.android.externcalls.sdk.rate.RateHint) r10
            java.lang.String r10 = r10.getReason()
            r9.add(r10)
            goto L_0x0198
        L_0x01ac:
            java.util.List r9 = kotlin.collections.CollectionsKt.emptyList()
        L_0x01b0:
            boolean r7 = r3.isGroupCall()
            if (r7 != 0) goto L_0x00e8
            boolean r7 = r0.d
            if (r7 != 0) goto L_0x01bc
            goto L_0x00e8
        L_0x01bc:
            ru.ok.android.externcalls.sdk.events.end.ConversationEndReason$Hangup r7 = ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Hangup.INSTANCE
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x00e8
            xme r5 = r5.e
            java.lang.Object r5 = r5.getValue()
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L_0x00e8
            long r10 = r5.longValue()
            int r0 = r0.c
            r7 = r14
            long r13 = (long) r0
            int r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0262
            kotlin.Lazy r0 = r1.p
            java.lang.Object r0 = r0.getValue()
            fq1 r0 = (defpackage.fq1) r0
            java.lang.String r10 = r3.getConversationId()
            boolean r11 = r1.H
            if (r11 != 0) goto L_0x01f3
            boolean r11 = r3.isInitialVideoEnabled()
            if (r11 == 0) goto L_0x01f1
            goto L_0x01f3
        L_0x01f1:
            r13 = r12
            goto L_0x01f4
        L_0x01f3:
            r13 = 1
        L_0x01f4:
            kotlin.Lazy r5 = r0.c
            java.lang.Object r5 = r5.getValue()
            udg r5 = (defpackage.udg) r5
            boolean r5 = r5.c()
            if (r5 == 0) goto L_0x0262
            kotlin.Lazy r0 = r0.b
            java.lang.Object r0 = r0.getValue()
            y91 r0 = (defpackage.y91) r0
            r0.getClass()
            android.content.Intent r5 = new android.content.Intent
            android.app.Application r11 = r0.c()
            java.lang.Class<one.me.android.calls.CallNotifierFixActivity> r14 = one.me.android.calls.CallNotifierFixActivity.class
            r5.<init>(r11, r14)
            java.lang.String r11 = "action-rate-call"
            r5.setAction(r11)
            java.lang.String r11 = "call_id"
            r5.putExtra(r11, r10)
            java.lang.String r10 = "is_video"
            r5.putExtra(r10, r13)
            java.util.Collection r9 = (java.util.Collection) r9
            java.lang.String[] r10 = new java.lang.String[r12]
            java.lang.Object[] r9 = r9.toArray(r10)
            java.lang.String[] r9 = (java.lang.String[]) r9
            java.lang.String r10 = "sdk_reasons"
            r5.putExtra(r10, r9)
            r9 = 268435456(0x10000000, float:2.5243549E-29)
            r5.setFlags(r9)
            android.app.Application r0 = r0.c()
            r0.startActivity(r5)
            java.lang.Object r0 = r6.getValue()
            fq r0 = (defpackage.fq) r0
            hq r0 = (defpackage.hq) r0
            r0.j(r12, r8)
            goto L_0x0262
        L_0x024e:
            r7 = r14
            java.lang.Object r0 = r6.getValue()
            fq r0 = (defpackage.fq) r0
            hq r0 = (defpackage.hq) r0
            ls7 r6 = r0.g
            int r6 = r6.getInt(r8, r12)
            r5 = 1
            int r6 = r6 + r5
            r0.j(r6, r8)
        L_0x0262:
            java.lang.Object r0 = r4.getValue()
            by4 r0 = (defpackage.by4) r0
        L_0x0268:
            xme r4 = r0.d
            java.lang.Object r5 = r4.getValue()
            r6 = r5
            java.lang.Long r6 = (java.lang.Long) r6
            boolean r4 = r4.b(r5, r15)
            if (r4 == 0) goto L_0x0268
            aje r4 = r0.b
            if (r4 == 0) goto L_0x027e
            r4.b(r15)
        L_0x027e:
            r0.b = r15
            h5d r0 = r30.t()
            r0.b()
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Missed
            xme r4 = r1.J
            if (r0 == 0) goto L_0x02e6
        L_0x028d:
            java.lang.Object r0 = r4.getValue()
            r2 = r0
            s44 r2 = (defpackage.s44) r2
            s44 r18 = r30.i()
            ge5 r2 = new ge5
            fe5 r3 = defpackage.fe5.a
            r2.<init>(r3)
            r25 = 0
            r29 = 511(0x1ff, float:7.16E-43)
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = r2
            s44 r2 = defpackage.s44.a(r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r0 = r4.b(r0, r2)
            if (r0 == 0) goto L_0x028d
            h5d r0 = r30.t()
            r0.getClass()
            g5d r1 = defpackage.g5d.END
            r0.c = r1
            tg1 r0 = r0.a()
            kotlin.Lazy r1 = r0.d
            java.lang.Object r1 = r1.getValue()
            android.media.AudioManager r1 = (android.media.AudioManager) r1
            int r1 = r1.getRingerMode()
            r2 = 2
            if (r1 == r2) goto L_0x02dd
            goto L_0x0458
        L_0x02dd:
            sg1 r1 = r0.b
            y35 r1 = r1.a
            r0.a(r1, r12)
            goto L_0x0458
        L_0x02e6:
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Rejected
            if (r0 == 0) goto L_0x0331
        L_0x02ea:
            java.lang.Object r0 = r4.getValue()
            r2 = r0
            s44 r2 = (defpackage.s44) r2
            s44 r13 = r30.i()
            ge5 r2 = new ge5
            fe5 r3 = defpackage.fe5.a
            r2.<init>(r3)
            r20 = 0
            r24 = 511(0x1ff, float:7.16E-43)
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = r2
            s44 r2 = defpackage.s44.a(r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r0 = r4.b(r0, r2)
            if (r0 == 0) goto L_0x02ea
            h5d r0 = r30.t()
            r0.getClass()
            g5d r1 = defpackage.g5d.BUSY
            r0.c = r1
            tg1 r0 = r0.a()
            sg1 r1 = r0.b
            y35 r1 = r1.f
            r0.a(r1, r12)
            goto L_0x0458
        L_0x0331:
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Busy
            if (r0 == 0) goto L_0x037c
        L_0x0335:
            java.lang.Object r0 = r4.getValue()
            r2 = r0
            s44 r2 = (defpackage.s44) r2
            s44 r13 = r30.i()
            ge5 r2 = new ge5
            fe5 r3 = defpackage.fe5.b
            r2.<init>(r3)
            r20 = 0
            r24 = 511(0x1ff, float:7.16E-43)
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = r2
            s44 r2 = defpackage.s44.a(r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r0 = r4.b(r0, r2)
            if (r0 == 0) goto L_0x0335
            h5d r0 = r30.t()
            r0.getClass()
            g5d r1 = defpackage.g5d.BUSY
            r0.c = r1
            tg1 r0 = r0.a()
            sg1 r1 = r0.b
            y35 r1 = r1.f
            r0.a(r1, r12)
            goto L_0x0458
        L_0x037c:
            he5 r5 = defpackage.he5.b
            if (r7 != 0) goto L_0x0403
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.EndedForAll
            if (r0 != 0) goto L_0x0403
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Canceled
            if (r0 != 0) goto L_0x0403
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.RemovedFromCall
            if (r0 != 0) goto L_0x0403
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.AcceptedOnAnotherDevice
            if (r0 == 0) goto L_0x0392
            goto L_0x0403
        L_0x0392:
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.ConversationAlreadyEnded
            if (r0 != 0) goto L_0x03b5
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.CallTimeout
            if (r0 != 0) goto L_0x03b5
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Error
            if (r0 != 0) goto L_0x03b5
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.ObsoleteClient
            if (r0 != 0) goto L_0x03b5
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.SignalingTimeout
            if (r0 != 0) goto L_0x03b5
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.PeerConnectionTimeout
            if (r0 != 0) goto L_0x03b5
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Unknown
            if (r0 == 0) goto L_0x03af
            goto L_0x03b5
        L_0x03af:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x03b5:
            java.lang.Object r0 = r4.getValue()
            r2 = r0
            s44 r2 = (defpackage.s44) r2
            s44 r6 = r30.i()
            boolean r2 = r6.g
            if (r2 == 0) goto L_0x03dd
            r20 = 0
            r24 = 511(0x1ff, float:7.16E-43)
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r13 = r6
            r23 = r5
            s44 r2 = defpackage.s44.a(r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x03f5
        L_0x03dd:
            ge5 r2 = new ge5
            fe5 r3 = defpackage.fe5.o
            r2.<init>(r3)
            r13 = 0
            r17 = 511(0x1ff, float:7.16E-43)
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = r2
            s44 r2 = defpackage.s44.a(r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x03f5:
            boolean r0 = r4.b(r0, r2)
            if (r0 == 0) goto L_0x03b5
            h5d r0 = r30.t()
            r0.b()
            goto L_0x0458
        L_0x0403:
            java.lang.Object r0 = r4.getValue()
            r2 = r0
            s44 r2 = (defpackage.s44) r2
            s44 r18 = r30.i()
            r25 = 0
            r29 = 511(0x1ff, float:7.16E-43)
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = r5
            s44 r2 = defpackage.s44.a(r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r0 = r4.b(r0, r2)
            if (r0 == 0) goto L_0x0403
            boolean r0 = r3.isAnswered()
            if (r0 == 0) goto L_0x0458
            h5d r0 = r30.t()
            r0.getClass()
            g5d r1 = defpackage.g5d.END
            r0.c = r1
            tg1 r0 = r0.a()
            kotlin.Lazy r1 = r0.d
            java.lang.Object r1 = r1.getValue()
            android.media.AudioManager r1 = (android.media.AudioManager) r1
            int r1 = r1.getRingerMode()
            r6 = 2
            if (r1 == r6) goto L_0x0451
            goto L_0x0458
        L_0x0451:
            sg1 r1 = r0.b
            y35 r1 = r1.a
            r0.a(r1, r12)
        L_0x0458:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mp1.b(mp1, ru.ok.android.externcalls.sdk.events.end.ConversationEndReason):void");
    }

    public static final void c(mp1 mp1) {
        Object value;
        s44 i2;
        xme xme = mp1.J;
        do {
            value = xme.getValue();
            s44 s44 = (s44) value;
            i2 = mp1.i();
            if (!i2.f) {
                mp1.z(true);
            }
            Conversation a2 = mp1.m().a();
            Collection participants = a2 != null ? a2.getParticipants() : null;
            if (participants == null) {
                participants = CollectionsKt.emptyList();
            }
            boolean z2 = i2.h;
            boolean z3 = (z2 || participants.size() <= 2) ? z2 : true;
            boolean z4 = i2.e;
            boolean z5 = (z4 || !mp1.v(participants)) ? z4 : true;
            if (!(z5 == z4 && z3 == z2)) {
                i2 = s44.a(i2, (ld9) null, 0, (String) null, (String) null, z5, false, z3, (oub) null, (me5) null, 879);
            }
        } while (!xme.b(value, i2));
    }

    public final void d() {
        z68.c("CallEngineTag", "call answer", new Object[0]);
        String str = j().c;
        ld9 ld9 = j().a;
        int i2 = 1;
        if (ld9 != null && ld9.J()) {
            i2 = 2;
        }
        tq1 l2 = l();
        l2.getClass();
        tq1.a(l2, "INCOMING_CALL_RECEIVED", str, "ANSWERED", Integer.valueOf(i2), (String) null, (String) null, false, 80);
        Conversation n2 = n();
        if (n2 != null && n2.isPrepared()) {
            n2.init();
            n2.connect();
        }
    }

    public final boolean e(vje vje) {
        ld9 ld9 = i().a;
        if (ld9 == null) {
            return true;
        }
        return (!(vje instanceof rje) || !(ld9 instanceof dl1) || ((rje) vje).a.r != ((dl1) ld9).r) && (!(vje instanceof tje) || !(ld9 instanceof fl1) || ((tje) vje).a.r != ((fl1) ld9).r) && (!(vje instanceof sje) || !(ld9 instanceof el1) || !Intrinsics.areEqual((Object) f6e.I(((sje) vje).a), (Object) f6e.I(((el1) ld9).r)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0168  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(defpackage.b31 r33) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            java.lang.String r2 = "CallEngineTag"
            java.lang.String r3 = "init prepared conversation"
            defpackage.z68.c(r2, r3, new java.lang.Object[0])
            s44 r3 = r32.i()
            oub r3 = r3.i
            if (r3 == 0) goto L_0x003d
            ru.ok.android.externcalls.sdk.Conversation r1 = r1.a
            java.lang.String r1 = r1.getConversationId()
            s44 r3 = r32.i()
            java.lang.String r3 = r3.c
            s44 r4 = r32.i()
            oub r4 = r4.i
            java.lang.String r5 = "Call already destroyed, release all: prepared="
            java.lang.String r6 = " active="
            java.lang.String r7 = " previousCallState="
            java.lang.StringBuilder r1 = defpackage.rae.r(r5, r1, r6, r3, r7)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            defpackage.z68.c(r2, r1, new java.lang.Object[0])
            r32.x()
            return
        L_0x003d:
            java.util.LinkedHashSet r3 = r0.I
            java.util.Iterator r3 = r3.iterator()
        L_0x0043:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0053
            java.lang.Object r4 = r3.next()
            fk1 r4 = (defpackage.fk1) r4
            r4.a()
            goto L_0x0043
        L_0x0053:
            s44 r3 = r32.i()
            me5 r3 = r3.j
            ru.ok.android.externcalls.sdk.Conversation r4 = r1.a
            r5 = 1
            boolean r7 = r1.d
            if (r7 == 0) goto L_0x007b
            boolean r8 = r4.isCaller()
            if (r8 == 0) goto L_0x0067
            goto L_0x007b
        L_0x0067:
            boolean r8 = r4.isAnswered()
            if (r8 != 0) goto L_0x007b
            boolean r8 = r4.isConcurrent()
            if (r8 != 0) goto L_0x007b
            boolean r8 = r4.isCaller()
            if (r8 != 0) goto L_0x007b
            r8 = r5
            goto L_0x007c
        L_0x007b:
            r8 = 0
        L_0x007c:
            a21 r9 = r32.k()
            k21 r9 = (defpackage.k21) r9
            xme r9 = r9.k
            java.lang.Object r9 = r9.getValue()
            y11 r9 = (defpackage.y11) r9
            r10 = 3
            r12 = 2
            ld9 r13 = r1.b
            ru.ok.android.externcalls.sdk.Conversation r1 = r1.a
            if (r8 == 0) goto L_0x01b0
            java.lang.String r14 = "doAfterCallPrepared show incoming"
            defpackage.z68.c(r2, r14, new java.lang.Object[0])
            kotlin.Lazy r2 = r0.p
            java.lang.Object r2 = r2.getValue()
            fq1 r2 = (defpackage.fq1) r2
            boolean r14 = r13.J()
            r2.getClass()
            java.lang.String r15 = "CallsNavigatorTag"
            java.lang.String r6 = "show showIncomingCallUi"
            defpackage.z68.c(r15, r6, new java.lang.Object[0])
            kotlin.Lazy r6 = r2.a
            java.lang.Object r6 = r6.getValue()
            kq1 r6 = (defpackage.kq1) r6
            tea r11 = r6.e()
            android.app.NotificationManager r11 = r11.b
            int r11 = defpackage.mea.b(r11)
            if (r11 == 0) goto L_0x00ca
            if (r11 == r5) goto L_0x00ca
            if (r11 == r12) goto L_0x015f
            if (r11 == r10) goto L_0x015f
            r10 = 4
            if (r11 == r10) goto L_0x015f
        L_0x00ca:
            tea r10 = r6.e()
            android.app.NotificationManager r10 = r10.b
            boolean r10 = defpackage.nea.a(r10)
            if (r10 == 0) goto L_0x015f
            tea r10 = r6.e()
            android.app.NotificationManager r10 = r10.b     // Catch:{ all -> 0x015f }
            defpackage.mea.a(r10)     // Catch:{ all -> 0x015f }
            tea r10 = r6.e()
            kotlin.Lazy r6 = r6.d
            java.lang.Object r6 = r6.getValue()
            ed4 r6 = (defpackage.ed4) r6
            r6.getClass()
            int r6 = android.os.Build.VERSION.SDK_INT
            android.app.NotificationManager r10 = r10.b
            java.lang.String r11 = "ru.oneme.app.new.incomingCalls."
            android.app.NotificationChannel r10 = defpackage.oea.i(r10, r11)
            if (r10 == 0) goto L_0x0148
            jq5 r11 = new jq5
            java.lang.String r16 = defpackage.kca.i(r10)
            int r12 = defpackage.kca.j(r10)
            r5 = 7
            r11.<init>((int) r5)
            android.net.Uri r5 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI
            r16.getClass()
            r11.b = r12
            android.media.AudioAttributes r5 = android.app.Notification.AUDIO_ATTRIBUTES_DEFAULT
            defpackage.kca.m(r10)
            defpackage.kca.g(r10)
            defpackage.kca.h(r10)
            defpackage.kca.b(r10)
            defpackage.kca.n(r10)
            defpackage.kca.f(r10)
            defpackage.kca.v(r10)
            defpackage.kca.k(r10)
            defpackage.kca.w(r10)
            defpackage.kca.o(r10)
            r5 = 30
            if (r6 < r5) goto L_0x0139
            defpackage.mca.b(r10)
            defpackage.mca.a(r10)
        L_0x0139:
            defpackage.kca.a(r10)
            defpackage.kca.l(r10)
            defpackage.lca.a(r10)
            if (r6 < r5) goto L_0x0149
            defpackage.mca.c(r10)
            goto L_0x0149
        L_0x0148:
            r11 = 0
        L_0x0149:
            if (r11 == 0) goto L_0x0152
            int r5 = r11.b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x0153
        L_0x0152:
            r5 = 0
        L_0x0153:
            if (r5 != 0) goto L_0x0156
            goto L_0x015d
        L_0x0156:
            int r5 = r5.intValue()
            if (r5 != 0) goto L_0x015d
            goto L_0x015f
        L_0x015d:
            r6 = 1
            goto L_0x0160
        L_0x015f:
            r6 = 0
        L_0x0160:
            if (r6 == 0) goto L_0x0168
            java.lang.String r2 = "notification available, will show via service."
            defpackage.z68.c(r15, r2, new java.lang.Object[0])
            goto L_0x01bb
        L_0x0168:
            if (r6 != 0) goto L_0x01aa
            kotlin.Lazy r5 = r2.c
            java.lang.Object r5 = r5.getValue()
            udg r5 = (defpackage.udg) r5
            boolean r5 = r5.c()
            if (r5 == 0) goto L_0x01aa
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r10 = "show call screen areIncomingNotificationsEnabled="
            r5.<init>(r10)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            defpackage.z68.c(r15, r5, new java.lang.Object[0])
            kotlin.Lazy r2 = r2.b
            java.lang.Object r2 = r2.getValue()
            y91 r2 = (defpackage.y91) r2
            r2.getClass()
            android.content.Intent r5 = new android.content.Intent
            android.app.Application r6 = r2.c()
            java.lang.Class<one.me.android.calls.CallNotifierFixActivity> r10 = one.me.android.calls.CallNotifierFixActivity.class
            r5.<init>(r6, r10)
            defpackage.y91.b(r5, r9, r14)
            android.app.Application r2 = r2.c()
            r2.startActivity(r5)
            goto L_0x01bb
        L_0x01aa:
            java.lang.String r0 = "can't show incoming call ui"
            defpackage.z68.c(r15, r0, new java.lang.Object[0])
            return
        L_0x01b0:
            java.lang.String r5 = "doAfterCallPrepared answer"
            defpackage.z68.c(r2, r5, new java.lang.Object[0])
            r1.init()
            r1.connect()
        L_0x01bb:
            kotlin.Lazy r2 = r0.t
            java.lang.Object r2 = r2.getValue()
            nj1 r2 = (defpackage.nj1) r2
            kotlin.Lazy r5 = r0.d
            java.lang.Object r5 = r5.getValue()
            android.app.Application r5 = (android.app.Application) r5
            r2.getClass()
            defpackage.nj1.d(r5)
            if (r8 == 0) goto L_0x0204
            h5d r2 = r32.t()
            r2.getClass()
            g5d r5 = defpackage.g5d.INCOMING
            r2.c = r5
            tg1 r2 = r2.a()
            kotlin.Lazy r5 = r2.d
            java.lang.Object r5 = r5.getValue()
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            int r5 = r5.getRingerMode()
            r6 = 1
            if (r5 == r6) goto L_0x0200
            r8 = 2
            if (r5 == r8) goto L_0x01f5
            goto L_0x023f
        L_0x01f5:
            sg1 r5 = r2.b
            y35 r5 = r5.b
            r2.a(r5, r6)
            r2.b()
            goto L_0x023f
        L_0x0200:
            r2.b()
            goto L_0x023f
        L_0x0204:
            boolean r2 = r13 instanceof defpackage.fl1
            if (r2 == 0) goto L_0x0234
            boolean r5 = r4.isCaller()
            if (r5 == 0) goto L_0x0234
            boolean r5 = r4.isDestroyed()
            if (r5 != 0) goto L_0x0234
            boolean r5 = r4.isAnswered()
            if (r5 != 0) goto L_0x0234
            le5 r3 = defpackage.le5.b
            h5d r2 = r32.t()
            r2.getClass()
            g5d r5 = defpackage.g5d.BEEP
            r2.c = r5
            tg1 r2 = r2.a()
            sg1 r5 = r2.b
            y35 r5 = r5.c
            r6 = 1
            r2.a(r5, r6)
            goto L_0x023f
        L_0x0234:
            if (r2 != 0) goto L_0x023f
            ke5 r3 = defpackage.ke5.b
            h5d r2 = r32.t()
            r2.b()
        L_0x023f:
            ru.ok.android.externcalls.sdk.connection.MediaConnectionManager r2 = r4.getMediaConnectionManager()
            dq1 r5 = r32.r()
            r2.addListener(r5)
            ru.ok.android.externcalls.sdk.record.RecordManager r2 = r4.getRecordManager()
            kotlin.Lazy r4 = r0.q
            java.lang.Object r4 = r4.getValue()
            ahd r4 = (defpackage.ahd) r4
            r2.addRecordListener(r4)
        L_0x0259:
            xme r2 = r0.J
            java.lang.Object r4 = r2.getValue()
            r5 = r4
            s44 r5 = (defpackage.s44) r5
            s44 r17 = r32.i()
            java.lang.String r21 = r1.getConversationId()
            java.lang.String r22 = r1.getJoinLink()
            boolean r5 = r13 instanceof defpackage.fl1
            r6 = 1
            r5 = r5 ^ r6
            if (r5 != 0) goto L_0x0277
            r23 = r6
            goto L_0x0281
        L_0x0277:
            ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection r8 = r1.getParticipants()
            boolean r8 = r0.v(r8)
            r23 = r8
        L_0x0281:
            boolean r8 = r13 instanceof defpackage.el1
            if (r8 == 0) goto L_0x0289
            r8 = r13
            el1 r8 = (defpackage.el1) r8
            goto L_0x028a
        L_0x0289:
            r8 = 0
        L_0x028a:
            if (r8 == 0) goto L_0x029e
            java.lang.String r9 = r1.getJoinLink()
            if (r9 != 0) goto L_0x0294
            java.lang.String r9 = r8.r
        L_0x0294:
            el1 r10 = new el1
            boolean r8 = r8.s
            r10.<init>(r9, r8)
            r18 = r10
            goto L_0x02a0
        L_0x029e:
            r18 = r13
        L_0x02a0:
            r25 = 0
            r26 = 0
            r19 = 0
            r24 = 0
            r28 = 482(0x1e2, float:6.75E-43)
            r27 = r3
            s44 r8 = defpackage.s44.a(r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28)
            boolean r2 = r2.b(r4, r8)
            if (r2 == 0) goto L_0x0259
            kotlin.Lazy r2 = r0.j
            java.lang.Object r2 = r2.getValue()
            lq4 r2 = (defpackage.lq4) r2
            aje r3 = r2.d
            r4 = 0
            if (r3 == 0) goto L_0x02c6
            r3.b(r4)
        L_0x02c6:
            r2.d = r4
            kq4 r3 = new kq4
            r3.<init>(r2, r4)
            cp1 r6 = r2.a
            r8 = 3
            aje r3 = defpackage.ev0.v(r6, r4, r4, r3, r8)
            r2.d = r3
            kotlin.Lazy r2 = r0.A
            if (r7 == 0) goto L_0x02e0
            boolean r3 = r13.J()
            if (r3 != 0) goto L_0x02e2
        L_0x02e0:
            if (r5 == 0) goto L_0x030c
        L_0x02e2:
            java.lang.Object r3 = r2.getValue()
            edb r3 = (defpackage.edb) r3
            java.lang.String[] r4 = defpackage.edb.l
            boolean r3 = r3.b(r4)
            if (r3 != 0) goto L_0x030c
            tq1 r23 = r32.l()
            java.lang.String r25 = r1.getConversationId()
            r23.getClass()
            r27 = 0
            r31 = 56
            java.lang.String r24 = "REQUEST_PERMISSION_CAM"
            java.lang.String r26 = "OUT_OF_CALL"
            r28 = 0
            r29 = 0
            r30 = r5
            defpackage.tq1.a(r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L_0x030c:
            if (r5 == 0) goto L_0x0338
            java.lang.Object r2 = r2.getValue()
            edb r2 = (defpackage.edb) r2
            java.lang.String[] r3 = defpackage.edb.h
            boolean r2 = r2.b(r3)
            if (r2 != 0) goto L_0x0338
            tq1 r23 = r32.l()
            java.lang.String r25 = r1.getConversationId()
            r23.getClass()
            r27 = 0
            r31 = 56
            java.lang.String r24 = "REQUEST_PERMISSION_MIC"
            java.lang.String r26 = "AFTER_INITIATION"
            r28 = 0
            r29 = 0
            r30 = r5
            defpackage.tq1.a(r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L_0x0338:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mp1.f(b31):void");
    }

    public final void g(b31 b31) {
        xme xme;
        Object value;
        Conversation conversation;
        ld9 ld9;
        boolean z2;
        s44 s44;
        boolean z3;
        b31 b312 = b31;
        do {
            xme = this.J;
            value = xme.getValue();
            s44 s442 = (s44) value;
            conversation = b312.a;
            String conversationId = conversation.getConversationId();
            je5 je5 = je5.b;
            String joinLink = conversation.getJoinLink();
            ld9 = b312.b;
            boolean z4 = ld9 instanceof fl1;
            z2 = !z4;
            s44 = r7;
            z3 = z4;
            s44 s443 = new s44(b312.b, conversationId, joinLink, b312.d, z2, je5, 306);
        } while (!xme.b(value, s44));
        m().a.getAndSet(conversation);
        r().c(this.L);
        r().c((x9b) this.n.getValue());
        MediaMuteManager mediaMuteManager = null;
        this.F = ev0.v(this.a, (CoroutineContext) null, (f14) null, new jp1(this, (Continuation) null), 3);
        if (!b312.d && !z2) {
            h5d t2 = t();
            t2.getClass();
            t2.c = g5d.BEEP;
            tg1 a2 = t2.a();
            a2.a(a2.b.c, true);
        }
        if (ld9 instanceof dl1) {
            a21 k2 = k();
            long j2 = ((dl1) ld9).r;
            k21 k21 = (k21) k2;
            k21.n.setValue(k21, k21.p[1], k21.a(((my2) ((qx2) k21.b.getValue())).p(j2), j2));
        } else if (z3) {
            k21 k212 = (k21) k();
            ev0.v(k212.a, ((osa) ((gaf) k212.f.getValue())).a(), (f14) null, new j21(((fl1) ld9).r, k212, (Continuation) null), 2);
        } else if (ld9 instanceof el1) {
            el1 el1 = (el1) ld9;
            k21 k213 = (k21) k();
            k213.o = Long.valueOf(((jna) ((rl) k213.c.getValue())).F(f6e.J(el1.r), el1.s));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        v9b v9b = (v9b) s();
        v9b.getClass();
        p9b p9b = new p9b(v9b, (Continuation) null);
        cp1 cp1 = v9b.a;
        ev0.v(cp1, (CoroutineContext) null, (f14) null, p9b, 3);
        v9b.z = bs0.K(new ps5(((kgd) v9b.w.getValue()).b, new q9b(v9b, (Continuation) null), 5), cp1);
        ql8 ql8 = new ql8(new ql8(((bo3) v9b.v.getValue()).a(), 17), 16);
        Duration.Companion companion = Duration.Companion;
        v9b.X = bs0.K(new ps5(new n9b(gt5.a(ql8, DurationKt.toDuration((int) HttpStatus.SC_MULTIPLE_CHOICES, DurationUnit.MILLISECONDS), new ui0(14)), v9b, 0), new r9b(v9b, (Continuation) null), 5), cp1);
        uz0 uz0 = (uz0) this.E.getValue();
        Conversation a3 = ((jz3) uz0.a.getValue()).a();
        if (a3 != null) {
            mediaMuteManager = a3.getMediaMuteManager();
        }
        if (mediaMuteManager != null) {
            mediaMuteManager.addListener((tz0) uz0.b.getValue());
        }
        Conversation n2 = n();
        if (n2 != null) {
            ((o01) ((m01) this.i.getValue())).a(n2.isCaller() ? CallsAudioManager.State.DIALING : CallsAudioManager.State.RINGING);
            z68.c("CallEngineTag", this + " conversation is ready " + n2.getConversationId(), new Object[0]);
        }
    }

    public final void h(sf1 sf1) {
        Object value;
        long j2;
        Long valueOf;
        String str;
        sf1 sf12 = sf1;
        int i2 = 0;
        z68.c("CallEngineTag", this + " doBeforeCreateConversation push=" + sf12, new Object[0]);
        k21 k21 = (k21) k();
        if (sf12 != null) {
            xme xme = k21.j;
            do {
                value = xme.getValue();
                y11 y11 = (y11) value;
                j2 = sf12.b;
                valueOf = Long.valueOf(j2);
                String str2 = sf12.d;
                if (str2 == null) {
                    str2 = "";
                }
                str = str2;
                long j3 = sf12.a;
                Long valueOf2 = Long.valueOf(j3);
                if (j3 == 0) {
                    valueOf2 = null;
                }
                if (valueOf2 != null) {
                    j2 = valueOf2.longValue();
                }
            } while (!xme.b(value, new y11(valueOf, str, sf12.e, Long.valueOf(j2), 16)));
        }
        wb wbVar = new wb(15, bs0.F(new ps5(new pc(new dtc(((rp1) k21.d.getValue()).a), 10), new g21(k21, (Continuation) null), 5), (q04) k21.l.getValue()), new e21(k21, (Continuation) null, 1));
        f14 f14 = f14.a;
        k21.m.setValue(k21, k21.p[0], ev0.v(k21.a, (CoroutineContext) null, f14.b, new zs5(wbVar, (Continuation) null), 1));
        Application application = (Application) this.d.getValue();
        ((nj1) this.t.getValue()).getClass();
        Intent intent = new Intent(application, CallServiceImpl.class);
        mj1 mj1 = mj1.a;
        nj1.b(application, intent.putExtra("ACTION", 0));
        o01 o01 = (o01) ((m01) this.i.getValue());
        CallsAudioManager callsAudioManager = (CallsAudioManager) o01.c.updateAndGet(new n01(0, o01));
        if (callsAudioManager != null) {
            i2 = callsAudioManager.hashCode();
        }
        z68.c("CallAudioController", "CallAudioController prepared: " + i2, new Object[0]);
    }

    public final s44 i() {
        return (s44) this.J.getValue();
    }

    public final s44 j() {
        return (s44) this.K.getValue();
    }

    public final a21 k() {
        return (a21) this.k.getValue();
    }

    public final tq1 l() {
        return (tq1) this.z.getValue();
    }

    public final jz3 m() {
        return (jz3) this.f.getValue();
    }

    public final Conversation n() {
        return m().a();
    }

    public final boolean o() {
        me5 me5 = j().j;
        return !((me5 instanceof he5) || (me5 instanceof ge5) || (me5 instanceof ie5));
    }

    public final boolean p() {
        Conversation a2 = m().a();
        boolean z2 = a2 != null && a2.isAnswered();
        Conversation a3 = m().a();
        boolean z3 = a3 != null && a3.isCaller();
        me5 me5 = j().j;
        if ((me5 instanceof he5) || (me5 instanceof ge5) || (me5 instanceof ie5)) {
            return false;
        }
        return z2 || z3;
    }

    public final boolean q() {
        Conversation a2 = m().a();
        boolean z2 = a2 != null && !a2.isAnswered();
        Conversation a3 = m().a();
        boolean z3 = a3 != null && !a3.isCaller();
        me5 me5 = j().j;
        return !(me5 instanceof he5) && !(me5 instanceof ge5) && !(me5 instanceof ie5) && z2 && z3;
    }

    public final dq1 r() {
        return (dq1) this.e.getValue();
    }

    public final h9b s() {
        return (h9b) this.l.getValue();
    }

    public final h5d t() {
        return (h5d) this.m.getValue();
    }

    public final void u(nw6 nw6) {
        z68.c("CallEngineTag", "hangup " + nw6, new Object[0]);
        Conversation n2 = n();
        if (n2 != null) {
            if (nw6 == null) {
                nw6 = null;
            }
            n2.hangup(new mw6(nw6));
            x();
        }
    }

    public final boolean v(Collection collection) {
        Iterable<ConversationParticipant> iterable = collection;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (ConversationParticipant externalId : iterable) {
            ParticipantId externalId2 = externalId.getExternalId();
            ze1 id = ((v9b) s()).c().a.getId();
            if (!Intrinsics.areEqual((Object) externalId2, (Object) new ParticipantId(String.valueOf(id.a), false, id.b))) {
                return true;
            }
        }
        return false;
    }

    public final boolean w() {
        boolean z2 = j().h;
        boolean z3 = ((i9b) ((v9b) s()).Y.a.getValue()).g;
        boolean isScreenCaptureEnabled = ((i9b) ((v9b) s()).Y.a.getValue()).a.a.isScreenCaptureEnabled();
        if (z2) {
            if (isScreenCaptureEnabled) {
                return false;
            }
        } else if (!z3 || isScreenCaptureEnabled) {
            return false;
        }
        return true;
    }

    public final void x() {
        xme xme;
        Object value;
        xme xme2;
        Object value2;
        Object value3;
        xme xme3;
        Object value4;
        s44 s44;
        ge5 ge5;
        z68.c("CallEngineTag", "release call data", new Object[0]);
        y11 y11 = (y11) ((k21) k()).k.getValue();
        Application application = (Application) this.d.getValue();
        ((nj1) this.t.getValue()).getClass();
        Intent intent = new Intent(application, CallServiceImpl.class);
        mj1 mj1 = mj1.a;
        intent.putExtra("ACTION", 1);
        nj1.b(application, intent);
        r().a().remove(this.L);
        dq1 r2 = r();
        Lazy lazy = this.n;
        r2.a().remove((x9b) lazy.getValue());
        aje aje = this.F;
        if (aje != null) {
            aje.b((CancellationException) null);
        }
        this.F = null;
        KProperty[] kPropertyArr = M;
        KProperty kProperty = kPropertyArr[0];
        wie wie = this.G;
        pm7 pm7 = (pm7) wie.getValue(this, kProperty);
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        wie.setValue(this, kPropertyArr[0], (Object) null);
        t().b();
        lq4 lq4 = (lq4) this.j.getValue();
        aje aje2 = lq4.d;
        if (aje2 != null) {
            aje2.b((CancellationException) null);
        }
        lq4.d = null;
        ((y9b) ((x9b) lazy.getValue())).clear();
        ((kq1) this.o.getValue()).a();
        o01 o01 = (o01) ((m01) this.i.getValue());
        o01.getClass();
        o01.a(CallsAudioManager.State.IDLE);
        CallsAudioManager callsAudioManager = (CallsAudioManager) o01.c.getAndSet((Object) null);
        Integer valueOf = callsAudioManager != null ? Integer.valueOf(callsAudioManager.hashCode()) : null;
        z68.c("CallAudioController", "CallAudioController released: " + valueOf, new Object[0]);
        by4 by4 = (by4) this.h.getValue();
        do {
            xme = by4.d;
            value = xme.getValue();
            Long l2 = (Long) value;
        } while (!xme.b(value, (Object) null));
        aje aje3 = by4.b;
        if (aje3 != null) {
            aje3.b((CancellationException) null);
        }
        by4.b = null;
        k21 k21 = (k21) k();
        k21.o = null;
        KProperty[] kPropertyArr2 = k21.p;
        KProperty kProperty2 = kPropertyArr2[0];
        wie wie2 = k21.m;
        pm7 pm72 = (pm7) wie2.getValue(k21, kProperty2);
        if (pm72 != null) {
            pm72.b((CancellationException) null);
        }
        wie2.setValue(k21, kPropertyArr2[0], (Object) null);
        KProperty kProperty3 = kPropertyArr2[1];
        wie wie3 = k21.n;
        pm7 pm73 = (pm7) wie3.getValue(k21, kProperty3);
        if (pm73 != null) {
            pm73.b((CancellationException) null);
        }
        wie3.setValue(k21, kPropertyArr2[1], (Object) null);
        do {
            xme2 = k21.j;
            value2 = xme2.getValue();
            y11 y112 = (y11) value2;
        } while (!xme2.b(value2, y11.f));
        xme xme4 = ((kgd) this.D.getValue()).b;
        do {
            value3 = xme4.getValue();
            ((Boolean) value3).getClass();
        } while (!xme4.b(value3, Boolean.FALSE));
        uz0 uz0 = (uz0) this.E.getValue();
        Conversation a2 = ((jz3) uz0.a.getValue()).a();
        MediaMuteManager mediaMuteManager = a2 != null ? a2.getMediaMuteManager() : null;
        if (mediaMuteManager != null) {
            mediaMuteManager.removeListener((tz0) uz0.b.getValue());
        }
        Conversation a3 = m().a();
        Lazy lazy2 = this.q;
        if (a3 != null) {
            a3.getMediaConnectionManager().removeListener(r());
            a3.getRecordManager().removeRecordListener((ahd) lazy2.getValue());
            try {
                a3.release();
            } catch (Throwable th) {
                Throwable th2 = th;
                z68.f("CallEngineTag", th2.getMessage(), th2);
            }
        }
        ((chd) ((ahd) lazy2.getValue())).d();
        m().a.set((Object) null);
        do {
            xme3 = this.J;
            value4 = xme3.getValue();
            s44 = (s44) value4;
            me5 me5 = s44.j;
            ge5 = me5 instanceof ge5 ? (ge5) me5 : null;
        } while (!xme3.b(value4, s44.a(s44.k, (ld9) null, 0, (String) null, (String) null, false, false, false, new oub(s44.c, (s44.h || ((ge5 != null ? ge5.b : null) == fe5.c)) ? null : s44.a, s44.j, y11), (me5) null, 767)));
    }

    public final void y(wje wje) {
        T t2;
        vje vje = wje.a;
        if (!e(vje)) {
            z68.c("CallEngineTag", "outgoing call can't start because call already started.", new Object[0]);
            return;
        }
        h((sf1) null);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ep1 ep1 = new ep1(wje, objectRef, this, 0);
        f fVar = new f(this);
        c31 c31 = this.b;
        c31.getClass();
        if (vje instanceof tje) {
            t2 = c31.a(((tje) vje).a, wje, ep1, fVar);
        } else if (vje instanceof rje) {
            t2 = c31.b(((rje) vje).a, wje, ep1, fVar);
        } else if (vje instanceof sje) {
            sje sje = (sje) vje;
            t2 = c31.d(sje.a, sje.b, wje, ep1, fVar);
        } else if (vje instanceof uje) {
            ld9 ld9 = ((uje) vje).a;
            if (ld9 instanceof fl1) {
                t2 = c31.a((fl1) ld9, wje, ep1, fVar);
            } else if (ld9 instanceof dl1) {
                t2 = c31.b((dl1) ld9, wje, ep1, fVar);
            } else if (ld9 instanceof el1) {
                el1 el1 = (el1) ld9;
                t2 = c31.d(el1.r, el1.s, wje, ep1, fVar);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        g(t2);
        objectRef.element = t2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if ((!(r2 instanceof defpackage.fl1)) == true) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z(boolean r19) {
        /*
            r18 = this;
            r0 = r18
            ru.ok.android.externcalls.sdk.Conversation r1 = r18.n()
            if (r1 == 0) goto L_0x0183
            s44 r2 = r18.i()
            ld9 r2 = r2.a
            if (r2 == 0) goto L_0x0017
            boolean r2 = r2 instanceof defpackage.fl1
            r4 = 1
            r2 = r2 ^ r4
            if (r2 != r4) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r4 = 0
        L_0x0018:
            s44 r2 = r18.i()
            boolean r2 = r2.f
            ke5 r17 = defpackage.ke5.b
            xme r15 = r0.J
            if (r19 != 0) goto L_0x006c
            if (r2 == 0) goto L_0x006c
            h5d r2 = r18.t()
            r2.b()
        L_0x002d:
            java.lang.Object r2 = r15.getValue()
            r5 = r2
            s44 r5 = (defpackage.s44) r5
            s44 r5 = r18.i()
            r13 = 0
            r14 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 1
            r16 = 479(0x1df, float:6.71E-43)
            r3 = r15
            r15 = r17
            s44 r5 = defpackage.s44.a(r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r2 = r3.b(r2, r5)
            if (r2 == 0) goto L_0x006a
            if (r4 != 0) goto L_0x006d
            h5d r2 = r18.t()
            r2.getClass()
            g5d r5 = defpackage.g5d.CONNECTED
            r2.c = r5
            tg1 r2 = r2.a()
            sg1 r5 = r2.b
            y35 r5 = r5.e
            r6 = 0
            r2.a(r5, r6)
            goto L_0x006d
        L_0x006a:
            r15 = r3
            goto L_0x002d
        L_0x006c:
            r3 = r15
        L_0x006d:
            ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection r1 = r1.getParticipants()
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L_0x007d
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x007d
            goto L_0x0183
        L_0x007d:
            java.util.Iterator r1 = r1.iterator()
        L_0x0081:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0183
            java.lang.Object r2 = r1.next()
            ru.ok.android.externcalls.sdk.ConversationParticipant r2 = (ru.ok.android.externcalls.sdk.ConversationParticipant) r2
            h9b r5 = r18.s()
            v9b r5 = (defpackage.v9b) r5
            y8b r5 = r5.c()
            cf1 r5 = r5.a
            ze1 r5 = r5.getId()
            ru.ok.android.externcalls.sdk.id.ParticipantId r6 = new ru.ok.android.externcalls.sdk.id.ParticipantId
            long r7 = r5.a
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r5 = r5.b
            r8 = 0
            r6.<init>(r7, r8, r5)
            boolean r5 = r2.isUseable()
            if (r5 == 0) goto L_0x0180
            boolean r5 = r2.isCallAccepted()
            if (r5 == 0) goto L_0x0180
            ru.ok.android.externcalls.sdk.id.ParticipantId r2 = r2.getExternalId()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r2)
            if (r2 != 0) goto L_0x0180
            kotlin.Lazy r1 = r0.t
            java.lang.Object r1 = r1.getValue()
            nj1 r1 = (defpackage.nj1) r1
            kotlin.Lazy r2 = r0.d
            java.lang.Object r2 = r2.getValue()
            android.app.Application r2 = (android.app.Application) r2
            r1.getClass()
            defpackage.nj1.d(r2)
            h5d r1 = r18.t()
            r1.b()
            kotlin.Lazy r1 = r0.h
            java.lang.Object r1 = r1.getValue()
            by4 r1 = (defpackage.by4) r1
            aje r2 = r1.b
            if (r2 != 0) goto L_0x00f9
            ay4 r2 = new ay4
            r5 = 0
            r2.<init>(r1, r5)
            cp1 r6 = r1.a
            r7 = 3
            aje r2 = defpackage.ev0.v(r6, r5, r5, r2, r7)
            r1.b = r2
        L_0x00f9:
            s44 r1 = r18.i()
            boolean r1 = r1.g
            if (r1 != 0) goto L_0x011a
            if (r4 != 0) goto L_0x011a
            h5d r1 = r18.t()
            r1.getClass()
            g5d r2 = defpackage.g5d.CONNECTED
            r1.c = r2
            tg1 r1 = r1.a()
            sg1 r2 = r1.b
            y35 r2 = r2.e
            r5 = 0
            r1.a(r2, r5)
        L_0x011a:
            if (r4 == 0) goto L_0x0150
            tq1 r6 = r18.l()
            s44 r1 = r18.j()
            java.lang.String r8 = r1.c
            h9b r1 = r18.s()
            v9b r1 = (defpackage.v9b) r1
            java.util.concurrent.atomic.AtomicReference r1 = r1.x
            java.lang.Object r1 = r1.get()
            i9b r1 = (defpackage.i9b) r1
            java.util.Map r1 = r1.c
            java.util.Collection r1 = r1.values()
            int r1 = r1.size()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            r6.getClass()
            r11 = 0
            r14 = 52
            java.lang.String r7 = "GROUP_CALL_JOIN"
            r9 = 0
            r12 = 0
            r13 = 1
            defpackage.tq1.a(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0150:
            java.lang.Object r1 = r3.getValue()
            r2 = r1
            s44 r2 = (defpackage.s44) r2
            s44 r5 = r18.i()
            r13 = 0
            r14 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 1
            r16 = 479(0x1df, float:6.71E-43)
            r15 = r17
            s44 r2 = defpackage.s44.a(r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r1 = r3.b(r1, r2)
            if (r1 == 0) goto L_0x0150
            kotlin.Lazy r0 = r0.n
            java.lang.Object r0 = r0.getValue()
            x9b r0 = (defpackage.x9b) r0
            y9b r0 = (defpackage.y9b) r0
            r0.rebindParticipantViews()
            goto L_0x0183
        L_0x0180:
            r5 = 0
            goto L_0x0081
        L_0x0183:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mp1.z(boolean):void");
    }
}

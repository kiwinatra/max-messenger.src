package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import one.me.sdk.vendor.StoreServicesInfo$ServicesNotAvailableException;
import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;

/* renamed from: f8f  reason: default package */
public final class f8f implements s98 {
    public final String a = f8f.class.getName();
    public final Lazy b;
    public final Lazy c;
    public final Lazy o;
    public final Lazy v;
    public final Lazy w;
    public final jx3 x;

    public f8f(Lazy lazy, Lazy lazy2, Lazy lazy3, hl7 hl7, Lazy lazy4, Lazy lazy5, s04 s04) {
        this.b = lazy;
        this.c = lazy2;
        this.o = lazy3;
        this.v = lazy4;
        this.w = lazy5;
        this.x = e14.a(hl7.a.s0(1, "vendor").plus(s04));
    }

    public final void a() {
        e14.c(this.x, (CancellationException) null);
    }

    public final qa3 b() {
        b8f b8f = new b8f(this, (Continuation) null);
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        if (emptyCoroutineContext.get(om7.a) == null) {
            return new qa3(0, new dbd((CoroutineContext) emptyCoroutineContext, b8f));
        }
        throw new IllegalArgumentException(("Completable context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + emptyCoroutineContext).toString());
    }

    public final x23 c() {
        return (x23) this.c.getValue();
    }

    public final e24 d() {
        return (e24) this.w.getValue();
    }

    public final String g() {
        String string = ((qjd) c()).g.getString("user.fcmToken", (String) null);
        if (!(string == null || string.length() == 0)) {
            j().getClass();
            if (Intrinsics.areEqual((Object) "GCM", (Object) ((qjd) c()).g.getString("user.pushDeviceType", (String) null))) {
                return string;
            }
        }
        ev0.v(this.x, (CoroutineContext) null, (f14) null, new c8f(this, (SystemServicesManager$PushTokenGeneratedListener) this.v.getValue(), (Continuation) null), 3);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056 A[Catch:{ Exception -> 0x002f }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0097 A[Catch:{ Exception -> 0x002f }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            java.lang.String r0 = "getPushToken: got "
            boolean r1 = r7 instanceof defpackage.d8f
            if (r1 == 0) goto L_0x0015
            r1 = r7
            d8f r1 = (defpackage.d8f) r1
            int r2 = r1.v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.v = r2
            goto L_0x001a
        L_0x0015:
            d8f r1 = new d8f
            r1.<init>(r5, r7)
        L_0x001a:
            java.lang.Object r7 = r1.c
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.v
            r4 = 1
            if (r3 == 0) goto L_0x003a
            if (r3 != r4) goto L_0x0032
            one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener r6 = r1.b
            f8f r5 = r1.a
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ Exception -> 0x002f }
            goto L_0x0050
        L_0x002f:
            r6 = move-exception
            goto L_0x00a2
        L_0x0032:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r7)
            cxe r7 = r5.j()     // Catch:{ Exception -> 0x002f }
            r1.a = r5     // Catch:{ Exception -> 0x002f }
            r1.b = r6     // Catch:{ Exception -> 0x002f }
            r1.v = r4     // Catch:{ Exception -> 0x002f }
            xt6 r7 = (defpackage.xt6) r7     // Catch:{ Exception -> 0x002f }
            java.lang.Object r7 = r7.b(r1)     // Catch:{ Exception -> 0x002f }
            if (r7 != r2) goto L_0x0050
            return r2
        L_0x0050:
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x002f }
            java.lang.String r1 = r5.a     // Catch:{ Exception -> 0x002f }
            if (r7 == 0) goto L_0x0060
            int r2 = r7.length()     // Catch:{ Exception -> 0x002f }
            if (r2 != 0) goto L_0x005d
            goto L_0x0060
        L_0x005d:
            java.lang.String r2 = "normal"
            goto L_0x0062
        L_0x0060:
            java.lang.String r2 = "empty"
        L_0x0062:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002f }
            r3.<init>(r0)     // Catch:{ Exception -> 0x002f }
            r3.append(r2)     // Catch:{ Exception -> 0x002f }
            java.lang.String r0 = " token"
            r3.append(r0)     // Catch:{ Exception -> 0x002f }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x002f }
            defpackage.z68.c(r1, r0, new java.lang.Object[0])     // Catch:{ Exception -> 0x002f }
            x23 r0 = r5.c()     // Catch:{ Exception -> 0x002f }
            qjd r0 = (defpackage.qjd) r0     // Catch:{ Exception -> 0x002f }
            java.lang.String r1 = "user.fcmToken"
            r0.l(r1, r7)     // Catch:{ Exception -> 0x002f }
            x23 r0 = r5.c()     // Catch:{ Exception -> 0x002f }
            cxe r1 = r5.j()     // Catch:{ Exception -> 0x002f }
            r1.getClass()     // Catch:{ Exception -> 0x002f }
            java.lang.String r1 = "GCM"
            qjd r0 = (defpackage.qjd) r0     // Catch:{ Exception -> 0x002f }
            java.lang.String r2 = "user.pushDeviceType"
            r0.l(r2, r1)     // Catch:{ Exception -> 0x002f }
            if (r7 == 0) goto L_0x00a9
            int r0 = r7.length()     // Catch:{ Exception -> 0x002f }
            if (r0 != 0) goto L_0x009e
            goto L_0x00a9
        L_0x009e:
            r6.onPushTokenGenerated(r7)     // Catch:{ Exception -> 0x002f }
            goto L_0x00a9
        L_0x00a2:
            java.lang.String r5 = r5.a
            java.lang.String r7 = "getPushToken: failed"
            defpackage.z68.f(r5, r7, r6)
        L_0x00a9:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f8f.h(one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String i() {
        hp5 hp5;
        xt6 xt6 = (xt6) j();
        if (xt6.a()) {
            Lazy lazy = xt6.c;
            s7h s7h = null;
            if (lazy.isInitialized() && (hp5 = (hp5) lazy.getValue()) != null) {
                try {
                    Object obj = lp5.m;
                    hp5.a();
                    s7h = ((lp5) hp5.d.a(mp5.class)).c();
                } catch (Exception e) {
                    z68.f(xt6.b, "getInstanceIdTask: failed to get FirebaseInstanceId", e);
                }
            }
            if (s7h != null) {
                try {
                    return (String) hsg.c(s7h);
                } catch (Exception e2) {
                    throw new Exception("getServiceInstanceId: getInstanceId failed", e2);
                }
            } else {
                throw new Exception("failed to get instance id task");
            }
        } else {
            throw new StoreServicesInfo$ServicesNotAvailableException();
        }
    }

    public final cxe j() {
        return (cxe) this.b.getValue();
    }
}

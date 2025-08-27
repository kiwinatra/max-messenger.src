package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.location.LocationRequest;
import kotlin.Lazy;

/* renamed from: nbg  reason: default package */
public final class nbg implements vla, t0d {
    public final Object a;
    public final Object b;

    public /* synthetic */ nbg(he heVar, LocationRequest locationRequest) {
        this.a = heVar;
        this.b = locationRequest;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(kotlin.coroutines.Continuation r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            boolean r2 = r1 instanceof defpackage.vmg
            if (r2 == 0) goto L_0x0017
            r2 = r1
            vmg r2 = (defpackage.vmg) r2
            int r3 = r2.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.c = r3
            goto L_0x001c
        L_0x0017:
            vmg r2 = new vmg
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.a
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.c
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0036
            if (r4 != r5) goto L_0x002e
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x008e
        L_0x002e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r1)
            java.lang.Object r1 = r0.b
            kotlin.Lazy r1 = (kotlin.Lazy) r1
            java.lang.Object r1 = r1.getValue()
            bud r1 = (defpackage.bud) r1
            akd r1 = (defpackage.akd) r1
            r1.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r4 = ru.ok.tamtam.android.prefs.PmsKey.f122welcomestickerids
            java.lang.String r4 = r4.name()
            java.util.List r1 = r1.g(r4, r6)
            r4 = 0
            if (r1 == 0) goto L_0x0061
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.String[] r7 = new java.lang.String[r4]
            java.lang.Object[] r1 = r1.toArray(r7)
            java.lang.String[] r1 = (java.lang.String[]) r1
            if (r1 != 0) goto L_0x0063
        L_0x0061:
            java.lang.String[] r1 = new java.lang.String[r4]
        L_0x0063:
            int r4 = r1.length
            if (r4 != 0) goto L_0x0067
            return r6
        L_0x0067:
            kotlin.random.Random$Default r4 = kotlin.random.Random.Default
            java.lang.Object r1 = kotlin.collections.ArraysKt.random((T[]) r1, (kotlin.random.Random) r4)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x00b1
            java.lang.Long r1 = kotlin.text.StringsKt.toLongOrNull(r1)
            if (r1 == 0) goto L_0x00b1
            long r7 = r1.longValue()
            java.lang.Object r0 = r0.a
            kotlin.Lazy r0 = (kotlin.Lazy) r0
            java.lang.Object r0 = r0.getValue()
            bte r0 = (defpackage.bte) r0
            r2.c = r5
            java.lang.Object r1 = r0.a(r7, r2)
            if (r1 != r3) goto L_0x008e
            return r3
        L_0x008e:
            boe r1 = (defpackage.boe) r1
            if (r1 == 0) goto L_0x00b1
            gpe r6 = new gpe
            r19 = 0
            r20 = 0
            long r8 = r1.a
            long r12 = r1.Z
            java.lang.String r14 = r1.y
            java.lang.String r15 = r1.v0
            int r0 = r1.b
            int r1 = r1.c
            r18 = 0
            r22 = 3872(0xf20, float:5.426E-42)
            r7 = r6
            r10 = r12
            r16 = r0
            r17 = r1
            r7.<init>(r8, r10, r12, r14, r15, r16, r17, r18, r19, r20, r22)
        L_0x00b1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nbg.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0081 A[Catch:{ all -> 0x00ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d0 A[Catch:{ all -> 0x00ce }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void accept(java.lang.Object r24, java.lang.Object r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            qdf r1 = (defpackage.qdf) r1
            r2 = r24
            i1h r2 = (defpackage.i1h) r2
            java.lang.Object r3 = r0.a
            he r3 = (defpackage.he) r3
            java.lang.Object r0 = r0.b
            r5 = r0
            com.google.android.gms.location.LocationRequest r5 = (com.google.android.gms.location.LocationRequest) r5
            r2.getClass()
            o15 r0 = r3.v()
            java.lang.Object r4 = r0.c
            r13 = r4
            f08 r13 = (defpackage.f08) r13
            java.util.Objects.requireNonNull(r13)
            tj5[] r4 = r2.h()
            r6 = 0
            r7 = 0
            if (r4 == 0) goto L_0x004d
            r8 = r7
        L_0x002b:
            int r9 = r4.length
            if (r8 >= r9) goto L_0x003e
            r9 = r4[r8]
            java.lang.String r10 = "location_updates_with_callback"
            java.lang.String r11 = r9.a
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x003b
            goto L_0x003f
        L_0x003b:
            int r8 = r8 + 1
            goto L_0x002b
        L_0x003e:
            r9 = r6
        L_0x003f:
            if (r9 != 0) goto L_0x0042
            goto L_0x004d
        L_0x0042:
            long r8 = r9.b()
            r10 = 1
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 < 0) goto L_0x004d
            r7 = 1
        L_0x004d:
            qae r14 = r2.J0
            monitor-enter(r14)
            qae r4 = r2.J0     // Catch:{ all -> 0x00ce }
            java.lang.Object r4 = r4.get(r13)     // Catch:{ all -> 0x00ce }
            e1h r4 = (defpackage.e1h) r4     // Catch:{ all -> 0x00ce }
            if (r4 == 0) goto L_0x0075
            if (r7 == 0) goto L_0x005d
            goto L_0x0075
        L_0x005d:
            he r3 = r4.d     // Catch:{ all -> 0x00ce }
            monitor-enter(r3)     // Catch:{ all -> 0x00ce }
            java.lang.Object r8 = r3.c     // Catch:{ all -> 0x006e }
            o15 r8 = (defpackage.o15) r8     // Catch:{ all -> 0x006e }
            if (r8 == r0) goto L_0x006c
            r8.b = r6     // Catch:{ all -> 0x006e }
            r8.c = r6     // Catch:{ all -> 0x006e }
            r3.c = r0     // Catch:{ all -> 0x006e }
        L_0x006c:
            monitor-exit(r3)     // Catch:{ all -> 0x00ce }
            goto L_0x0070
        L_0x006e:
            r0 = move-exception
            goto L_0x0073
        L_0x0070:
            r0 = r4
            r4 = r6
            goto L_0x007f
        L_0x0073:
            monitor-exit(r3)     // Catch:{ all -> 0x006e }
            throw r0     // Catch:{ all -> 0x00ce }
        L_0x0075:
            e1h r0 = new e1h     // Catch:{ all -> 0x00ce }
            r0.<init>(r3)     // Catch:{ all -> 0x00ce }
            qae r3 = r2.J0     // Catch:{ all -> 0x00ce }
            r3.put(r13, r0)     // Catch:{ all -> 0x00ce }
        L_0x007f:
            if (r7 == 0) goto L_0x00d0
            android.os.IInterface r2 = r2.o()     // Catch:{ all -> 0x00ce }
            j7h r2 = (defpackage.j7h) r2     // Catch:{ all -> 0x00ce }
            java.lang.Object r3 = r13.a     // Catch:{ all -> 0x00ce }
            int r3 = java.lang.System.identityHashCode(r3)     // Catch:{ all -> 0x00ce }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ce }
            r7.<init>()     // Catch:{ all -> 0x00ce }
            java.lang.String r8 = r13.b     // Catch:{ all -> 0x00ce }
            r7.append(r8)     // Catch:{ all -> 0x00ce }
            java.lang.String r8 = "@"
            r7.append(r8)     // Catch:{ all -> 0x00ce }
            r7.append(r3)     // Catch:{ all -> 0x00ce }
            java.lang.String r20 = r7.toString()     // Catch:{ all -> 0x00ce }
            u1h r3 = new u1h     // Catch:{ all -> 0x00ce }
            if (r4 != 0) goto L_0x00aa
            r17 = r6
            goto L_0x00ac
        L_0x00aa:
            r17 = r4
        L_0x00ac:
            r16 = 2
            r19 = 0
            r15 = r3
            r18 = r0
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x00ce }
            w0h r0 = new w0h     // Catch:{ all -> 0x00ce }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x00ce }
            android.os.Parcel r1 = r2.H0()     // Catch:{ all -> 0x00ce }
            defpackage.gzg.b(r1, r3)     // Catch:{ all -> 0x00ce }
            defpackage.gzg.b(r1, r5)     // Catch:{ all -> 0x00ce }
            r1.writeStrongBinder(r0)     // Catch:{ all -> 0x00ce }
            r0 = 88
            r2.I0(r1, r0)     // Catch:{ all -> 0x00ce }
            goto L_0x0124
        L_0x00ce:
            r0 = move-exception
            goto L_0x0126
        L_0x00d0:
            android.os.IInterface r2 = r2.o()     // Catch:{ all -> 0x00ce }
            j7h r2 = (defpackage.j7h) r2     // Catch:{ all -> 0x00ce }
            x1h r17 = new x1h     // Catch:{ all -> 0x00ce }
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 0
            r4 = r17
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00ce }
            q0h r3 = new q0h     // Catch:{ all -> 0x00ce }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x00ce }
            java.lang.Object r1 = r13.a     // Catch:{ all -> 0x00ce }
            int r1 = java.lang.System.identityHashCode(r1)     // Catch:{ all -> 0x00ce }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ce }
            r4.<init>()     // Catch:{ all -> 0x00ce }
            java.lang.String r5 = r13.b     // Catch:{ all -> 0x00ce }
            r4.append(r5)     // Catch:{ all -> 0x00ce }
            java.lang.String r5 = "@"
            r4.append(r5)     // Catch:{ all -> 0x00ce }
            r4.append(r1)     // Catch:{ all -> 0x00ce }
            java.lang.String r22 = r4.toString()     // Catch:{ all -> 0x00ce }
            z1h r1 = new z1h     // Catch:{ all -> 0x00ce }
            r16 = 1
            r18 = 0
            r20 = 0
            r15 = r1
            r19 = r0
            r21 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x00ce }
            android.os.Parcel r0 = r2.H0()     // Catch:{ all -> 0x00ce }
            defpackage.gzg.b(r0, r1)     // Catch:{ all -> 0x00ce }
            r1 = 59
            r2.I0(r0, r1)     // Catch:{ all -> 0x00ce }
        L_0x0124:
            monitor-exit(r14)     // Catch:{ all -> 0x00ce }
            return
        L_0x0126:
            monitor-exit(r14)     // Catch:{ all -> 0x00ce }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nbg.accept(java.lang.Object, java.lang.Object):void");
    }

    public iog z(View view, iog iog) {
        iog f = gag.f(view, iog);
        if (f.a.m()) {
            return f;
        }
        int b2 = f.b();
        Rect rect = (Rect) this.a;
        rect.left = b2;
        rect.top = f.d();
        rect.right = f.c();
        rect.bottom = f.a();
        ViewPager viewPager = (ViewPager) this.b;
        int childCount = viewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            iog b3 = gag.b(viewPager.getChildAt(i), f);
            rect.left = Math.min(b3.b(), rect.left);
            rect.top = Math.min(b3.d(), rect.top);
            rect.right = Math.min(b3.c(), rect.right);
            rect.bottom = Math.min(b3.a(), rect.bottom);
        }
        return f.e(rect.left, rect.top, rect.right, rect.bottom);
    }

    public nbg(Lazy lazy, Lazy lazy2) {
        this.a = lazy2;
        this.b = lazy;
    }

    public nbg(ViewPager viewPager) {
        this.b = viewPager;
        this.a = new Rect();
    }
}

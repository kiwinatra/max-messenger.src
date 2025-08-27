package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wkg  reason: default package */
public final class wkg implements xo7 {
    public final yo7 a;
    public final Lazy b;
    public final Lazy c;
    public final Set d;
    public final ru0 e;
    public tfg f;

    public wkg(yo7 yo7, Lazy lazy, Lazy lazy2) {
        this.a = yo7;
        this.b = lazy;
        this.c = lazy2;
        EnumEntries<mkg> enumEntries = mkg.Y;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(enumEntries, 10));
        for (mkg mkg : enumEntries) {
            arrayList.add(mkg.a);
        }
        this.d = CollectionsKt.toSet(arrayList);
        this.e = o54.a(0, 7, (cu0) null);
    }

    public static final void e(wkg wkg, String str) {
        tfg tfg = wkg.f;
        if (tfg != null) {
            wfg.a((wfg) wkg.b.getValue(), str, tfg.a, tfg.b, true, 0, (Integer) null, (Integer) null, 240);
        }
    }

    public static vo7 f(Throwable th) {
        fkg fkg = th instanceof fkg ? (fkg) th : null;
        int i = 1;
        int i2 = 3;
        if (fkg instanceof ekg) {
            if (((ekg) fkg).a) {
                i = 3;
            }
            return new to7(new wo7("too_many_keys", i));
        }
        int i3 = 4;
        if (fkg instanceof bkg) {
            if (((bkg) fkg).a) {
                i3 = 6;
            }
            return new to7(new wo7("not_found", i3));
        } else if (fkg instanceof akg) {
            return new to7(new wo7("not_found", 1));
        } else {
            if (fkg == null) {
                return uo7.d;
            }
            if (fkg instanceof ckg) {
                if (((ckg) fkg).a) {
                    i2 = 5;
                }
                return new to7(new wo7("too_large_key", i2));
            } else if (fkg instanceof dkg) {
                if (!((dkg) fkg).a) {
                    i3 = 2;
                }
                return new to7(new wo7("too_large_value", i3));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final Object a(String str, String str2, Continuation continuation) {
        if (!this.d.contains(str)) {
            String name = wkg.class.getName();
            z68.f(name, "Unknown method with name = " + str + " in JsDelegate: " + this, (Throwable) null);
            return Unit.INSTANCE;
        }
        mkg mkg = mkg.SECURE_SAVE_KEY;
        if (Intrinsics.areEqual((Object) str, (Object) "WebAppSecureStorageSaveKey")) {
            Object j = j(str2, true, continuation);
            return j == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? j : Unit.INSTANCE;
        } else if (Intrinsics.areEqual((Object) str, (Object) "WebAppSecureStorageGetKey")) {
            Object i = i(str2, true, continuation);
            return i == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? i : Unit.INSTANCE;
        } else if (Intrinsics.areEqual((Object) str, (Object) "WebAppSecureStorageClear")) {
            Object h = h(str2, true, continuation);
            return h == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? h : Unit.INSTANCE;
        } else if (Intrinsics.areEqual((Object) str, (Object) "WebAppDeviceStorageSaveKey")) {
            Object j2 = j(str2, false, continuation);
            return j2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? j2 : Unit.INSTANCE;
        } else if (Intrinsics.areEqual((Object) str, (Object) "WebAppDeviceStorageGetKey")) {
            Object i2 = i(str2, false, continuation);
            return i2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? i2 : Unit.INSTANCE;
        } else if (!Intrinsics.areEqual((Object) str, (Object) "WebAppDeviceStorageClear")) {
            return Unit.INSTANCE;
        } else {
            Object h2 = h(str2, false, continuation);
            return h2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? h2 : Unit.INSTANCE;
        }
    }

    public final ru0 b() {
        return this.e;
    }

    public final Set c() {
        return this.d;
    }

    public final void d(tfg tfg) {
        this.f = tfg;
    }

    public final d93 g() {
        return (d93) this.c.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(java.lang.String r10, boolean r11, kotlin.coroutines.Continuation r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.nkg
            if (r0 == 0) goto L_0x0013
            r0 = r12
            nkg r0 = (defpackage.nkg) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            nkg r0 = new nkg
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.v
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.x
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x004f
            if (r2 == r5) goto L_0x0043
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00b8
        L_0x0031:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0039:
            mkg r9 = r0.c
            zjg r10 = r0.b
            wkg r11 = r0.a
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00a2
        L_0x0043:
            uwe r9 = r0.o
            mkg r10 = r0.c
            zjg r11 = r0.b
            wkg r2 = r0.a
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0089
        L_0x004f:
            kotlin.ResultKt.throwOnFailure(r12)
            yo7 r12 = defpackage.yo7.d
            r12.getClass()
            yjg r2 = defpackage.zjg.Companion
            aq7 r2 = r2.serializer()
            java.lang.Object r10 = r12.a(r2, r10)
            zjg r10 = (defpackage.zjg) r10
            if (r11 == 0) goto L_0x0068
            mkg r12 = defpackage.mkg.SECURE_CLEAR_KEYS
            goto L_0x006a
        L_0x0068:
            mkg r12 = defpackage.mkg.CLEAR_KEYS
        L_0x006a:
            uwe r2 = new uwe
            java.lang.String r7 = r10.a
            r2.<init>(r7, r11)
            r0.a = r9
            r0.b = r10
            r0.c = r12
            r0.o = r2
            r0.x = r5
            ru0 r11 = r9.e
            java.lang.Object r11 = r11.t(r2, r0)
            if (r11 != r1) goto L_0x0084
            return r1
        L_0x0084:
            r11 = r10
            r10 = r12
            r8 = r2
            r2 = r9
            r9 = r8
        L_0x0089:
            okg r12 = new okg
            r12.<init>(r11, r10, r2, r6)
            r0.a = r2
            r0.b = r11
            r0.c = r10
            r0.o = r6
            r0.x = r4
            java.lang.Object r12 = r9.c(r12, r0)
            if (r12 != r1) goto L_0x009f
            return r1
        L_0x009f:
            r9 = r10
            r10 = r11
            r11 = r2
        L_0x00a2:
            lo7 r12 = (defpackage.lo7) r12
            pkg r2 = new pkg
            r2.<init>(r10, r9, r11, r6)
            r0.a = r6
            r0.b = r6
            r0.c = r6
            r0.x = r3
            java.lang.Object r9 = r12.d(r2, r0)
            if (r9 != r1) goto L_0x00b8
            return r1
        L_0x00b8:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wkg.h(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(java.lang.String r11, boolean r12, kotlin.coroutines.Continuation r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.qkg
            if (r0 == 0) goto L_0x0013
            r0 = r13
            qkg r0 = (defpackage.qkg) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            qkg r0 = new qkg
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.v
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.x
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x004f
            if (r2 == r5) goto L_0x0043
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x00ba
        L_0x0031:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0039:
            mkg r10 = r0.c
            ikg r11 = r0.b
            wkg r12 = r0.a
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x00a4
        L_0x0043:
            vwe r10 = r0.o
            mkg r11 = r0.c
            ikg r12 = r0.b
            wkg r2 = r0.a
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x008b
        L_0x004f:
            kotlin.ResultKt.throwOnFailure(r13)
            yo7 r13 = defpackage.yo7.d
            r13.getClass()
            hkg r2 = defpackage.ikg.Companion
            aq7 r2 = r2.serializer()
            java.lang.Object r11 = r13.a(r2, r11)
            ikg r11 = (defpackage.ikg) r11
            if (r12 == 0) goto L_0x0068
            mkg r13 = defpackage.mkg.SECURE_GET_KEY
            goto L_0x006a
        L_0x0068:
            mkg r13 = defpackage.mkg.GET_KEY
        L_0x006a:
            vwe r2 = new vwe
            java.lang.String r7 = r11.a
            java.lang.String r8 = r11.c
            r2.<init>(r7, r8, r12)
            r0.a = r10
            r0.b = r11
            r0.c = r13
            r0.o = r2
            r0.x = r5
            ru0 r12 = r10.e
            java.lang.Object r12 = r12.t(r2, r0)
            if (r12 != r1) goto L_0x0086
            return r1
        L_0x0086:
            r12 = r11
            r11 = r13
            r9 = r2
            r2 = r10
            r10 = r9
        L_0x008b:
            rkg r13 = new rkg
            r13.<init>(r12, r11, r2, r6)
            r0.a = r2
            r0.b = r12
            r0.c = r11
            r0.o = r6
            r0.x = r4
            java.lang.Object r13 = r10.c(r13, r0)
            if (r13 != r1) goto L_0x00a1
            return r1
        L_0x00a1:
            r10 = r11
            r11 = r12
            r12 = r2
        L_0x00a4:
            lo7 r13 = (defpackage.lo7) r13
            skg r2 = new skg
            r2.<init>(r11, r10, r12, r6)
            r0.a = r6
            r0.b = r6
            r0.c = r6
            r0.x = r3
            java.lang.Object r10 = r13.d(r2, r0)
            if (r10 != r1) goto L_0x00ba
            return r1
        L_0x00ba:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wkg.i(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fe A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0116 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(java.lang.String r17, boolean r18, kotlin.coroutines.Continuation r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof defpackage.tkg
            if (r3 == 0) goto L_0x001a
            r3 = r2
            tkg r3 = (defpackage.tkg) r3
            int r4 = r3.x
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001a
            int r4 = r4 - r5
            r3.x = r4
        L_0x0018:
            r9 = r3
            goto L_0x0020
        L_0x001a:
            tkg r3 = new tkg
            r3.<init>(r0, r2)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r2 = r9.v
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r9.x
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r10 = 1
            r11 = 0
            if (r4 == 0) goto L_0x006c
            if (r4 == r10) goto L_0x0067
            if (r4 == r8) goto L_0x0063
            if (r4 == r7) goto L_0x0052
            if (r4 == r6) goto L_0x0047
            if (r4 != r5) goto L_0x003f
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0117
        L_0x003f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0047:
            mkg r0 = r9.c
            zkg r1 = r9.b
            wkg r4 = r9.a
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0101
        L_0x0052:
            lo7 r0 = r9.o
            mkg r1 = r9.c
            zkg r4 = r9.b
            wkg r7 = r9.a
            kotlin.ResultKt.throwOnFailure(r2)
            r13 = r0
            r12 = r1
            r1 = r4
            r0 = r7
            goto L_0x00e9
        L_0x0063:
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x00c2
        L_0x0067:
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0134
        L_0x006c:
            kotlin.ResultKt.throwOnFailure(r2)
            yo7 r2 = defpackage.yo7.d
            r2.getClass()
            ykg r4 = defpackage.zkg.Companion
            aq7 r4 = r4.serializer()
            r12 = r17
            java.lang.Object r2 = r2.a(r4, r12)
            zkg r2 = (defpackage.zkg) r2
            if (r1 == 0) goto L_0x0088
            mkg r4 = defpackage.mkg.SECURE_SAVE_KEY
        L_0x0086:
            r12 = r4
            goto L_0x008b
        L_0x0088:
            mkg r4 = defpackage.mkg.SAVE_KEY
            goto L_0x0086
        L_0x008b:
            java.lang.String r4 = r2.c
            java.nio.charset.Charset r13 = kotlin.text.Charsets.UTF_8
            byte[] r4 = r4.getBytes(r13)
            int r4 = r4.length
            r14 = 128(0x80, float:1.794E-43)
            ru0 r15 = r0.e
            if (r4 > r14) goto L_0x011a
            java.lang.String r4 = r2.d
            if (r4 == 0) goto L_0x00c5
            byte[] r10 = r4.getBytes(r13)
            int r10 = r10.length
            r13 = 4000(0xfa0, float:5.605E-42)
            if (r10 > r13) goto L_0x00a8
            goto L_0x00c5
        L_0x00a8:
            dkg r4 = new dkg
            r4.<init>(r1)
            vo7 r6 = f(r4)
            d93 r4 = r16.g()
            r9.x = r8
            java.lang.String r8 = r2.b
            r5 = r15
            r7 = r12
            java.lang.Object r0 = r4.a(r5, r6, r7, r8, r9)
            if (r0 != r3) goto L_0x00c2
            return r3
        L_0x00c2:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00c5:
            java.lang.String r8 = r2.c
            java.lang.String r10 = r2.a
            if (r4 != 0) goto L_0x00d2
            wwe r4 = new wwe
            r4.<init>(r10, r8, r1)
            r13 = r4
            goto L_0x00d7
        L_0x00d2:
            xwe r13 = new xwe
            r13.<init>(r10, r8, r4, r1)
        L_0x00d7:
            r9.a = r0
            r9.b = r2
            r9.c = r12
            r9.o = r13
            r9.x = r7
            java.lang.Object r1 = r15.t(r13, r9)
            if (r1 != r3) goto L_0x00e8
            return r3
        L_0x00e8:
            r1 = r2
        L_0x00e9:
            ukg r2 = new ukg
            r2.<init>(r12, r0, r1, r11)
            r9.a = r0
            r9.b = r1
            r9.c = r12
            r9.o = r11
            r9.x = r6
            java.lang.Object r2 = r13.c(r2, r9)
            if (r2 != r3) goto L_0x00ff
            return r3
        L_0x00ff:
            r4 = r0
            r0 = r12
        L_0x0101:
            lo7 r2 = (defpackage.lo7) r2
            vkg r6 = new vkg
            r6.<init>(r0, r4, r1, r11)
            r9.a = r11
            r9.b = r11
            r9.c = r11
            r9.x = r5
            java.lang.Object r0 = r2.d(r6, r9)
            if (r0 != r3) goto L_0x0117
            return r3
        L_0x0117:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x011a:
            ckg r4 = new ckg
            r4.<init>(r1)
            vo7 r6 = f(r4)
            d93 r4 = r16.g()
            r9.x = r10
            java.lang.String r8 = r2.b
            r5 = r15
            r7 = r12
            java.lang.Object r0 = r4.a(r5, r6, r7, r8, r9)
            if (r0 != r3) goto L_0x0134
            return r3
        L_0x0134:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wkg.j(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

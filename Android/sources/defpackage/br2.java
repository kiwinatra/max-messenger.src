package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: br2  reason: default package */
public final class br2 extends SuspendLambda implements Function2 {
    public File a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ fr2 o;
    public final /* synthetic */ Uri v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public br2(fr2 fr2, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.o = fr2;
        this.v = uri;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        br2 br2 = new br2(this.o, this.v, continuation);
        br2.c = obj;
        return br2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((br2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.b
            r2 = 1
            if (r1 == 0) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            java.io.File r0 = r7.a
            java.lang.Object r1 = r7.c
            d14 r1 = (defpackage.d14) r1
            kotlin.ResultKt.throwOnFailure(r8)     // Catch:{ all -> 0x0015 }
            goto L_0x0070
        L_0x0015:
            r8 = move-exception
            goto L_0x0077
        L_0x0017:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x001f:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r7.c
            r1 = r8
            d14 r1 = (defpackage.d14) r1
            fr2 r8 = r7.o
            kotlin.reflect.KProperty[] r3 = defpackage.fr2.H0
            kotlin.Lazy r8 = r8.y
            java.lang.Object r8 = r8.getValue()
            po5 r8 = (defpackage.po5) r8
            fr2 r3 = r7.o
            java.lang.String r3 = r3.E0
            java.io.File r8 = r8.r(r3)
            android.net.Uri r3 = r7.v
            fr2 r4 = r7.o
            kotlin.Result$Companion r5 = kotlin.Result.Companion     // Catch:{ all -> 0x006a }
            boolean r5 = r8.exists()     // Catch:{ all -> 0x006a }
            if (r5 != 0) goto L_0x006f
            if (r3 == 0) goto L_0x006f
            kotlin.Lazy r4 = r4.v0     // Catch:{ all -> 0x006a }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x006a }
            android.content.Context r4 = (android.content.Context) r4     // Catch:{ all -> 0x006a }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ all -> 0x006a }
            java.io.InputStream r3 = r4.openInputStream(r3)     // Catch:{ all -> 0x006a }
            if (r3 == 0) goto L_0x006f
            wc8 r4 = defpackage.wc8.c     // Catch:{ all -> 0x006a }
            r7.c = r1     // Catch:{ all -> 0x006a }
            r7.a = r8     // Catch:{ all -> 0x006a }
            r7.b = r2     // Catch:{ all -> 0x006a }
            java.lang.Object r3 = r4.q(r8, r3, r7)     // Catch:{ all -> 0x006a }
            if (r3 != r0) goto L_0x006f
            return r0
        L_0x006a:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
            goto L_0x0077
        L_0x006f:
            r0 = r8
        L_0x0070:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0015 }
            java.lang.Object r8 = kotlin.Result.m23constructorimpl(r8)     // Catch:{ all -> 0x0015 }
            goto L_0x0081
        L_0x0077:
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.m23constructorimpl(r8)
        L_0x0081:
            fr2 r3 = r7.o
            java.lang.Throwable r8 = kotlin.Result.m26exceptionOrNullimpl(r8)
            if (r8 == 0) goto L_0x0099
            r3.n()
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r3 = "failed to copy picked image, e:"
            defpackage.z68.f(r1, r3, r8)
        L_0x0099:
            fr2 r8 = r7.o
            bud r8 = r8.o
            java.lang.String r1 = r0.getAbsolutePath()
            defpackage.o5a.X(r8, r1, r1)
            fr2 r8 = r7.o
            bud r8 = r8.o
            java.lang.String r1 = r0.getAbsolutePath()
            defpackage.o5a.W(r8, r1)
            android.content.Intent r8 = new android.content.Intent
            fr2 r1 = r7.o
            kotlin.Lazy r1 = r1.v0
            java.lang.Object r1 = r1.getValue()
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<ru.ok.messages.views.ActAvatarCrop> r3 = ru.ok.messages.views.ActAvatarCrop.class
            r8.<init>(r1, r3)
            java.lang.String r1 = "ru.ok.tamtam.extra.URI"
            android.net.Uri r3 = android.net.Uri.fromFile(r0)
            r8.putExtra(r1, r3)
            java.lang.String r1 = "ru.ok.tamtam.extra.FILE_PATH"
            java.lang.String r0 = r0.getAbsolutePath()
            r8.putExtra(r1, r0)
            java.lang.String r0 = "ru.ok.tamtam.extra.SHOW_RECAPTURE"
            r8.putExtra(r0, r2)
            java.lang.String r0 = "ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND"
            r1 = 0
            r8.putExtra(r0, r1)
            fr2 r7 = r7.o
            s85 r7 = r7.z0
            iq2 r0 = new iq2
            r0.<init>(r8)
            defpackage.xag.h(r7, r0)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.br2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

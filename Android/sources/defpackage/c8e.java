package defpackage;

import android.content.Context;
import android.content.pm.ShortcutManager;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.reflect.KProperty;

/* renamed from: c8e  reason: default package */
public final class c8e implements s98 {
    public static final /* synthetic */ KProperty[] Y = {rae.s(c8e.class, "shortcutsJob", "getShortcutsJob()Lkotlinx/coroutines/Job;", 0)};
    public final String X;
    public final Context a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy o;
    public final Lazy v;
    public final Lazy w;
    public final Lazy x;
    public final wie y = o5a.U();
    public final Lazy z;

    public c8e(Context context, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7) {
        this.a = context;
        this.b = lazy;
        this.c = lazy2;
        this.o = lazy4;
        this.v = lazy6;
        this.w = lazy7;
        this.x = LazyKt.lazy(new bp1(lazy5, lazy3, 2));
        this.z = LazyKt.lazy(new vra(25, this, lazy6));
        this.X = c8e.class.getName();
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [w7e, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.c8e r7, defpackage.a32 r8, kotlin.coroutines.Continuation r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof defpackage.a8e
            if (r0 == 0) goto L_0x0016
            r0 = r9
            a8e r0 = (defpackage.a8e) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x001b
        L_0x0016:
            a8e r0 = new a8e
            r0.<init>(r7, r9)
        L_0x001b:
            java.lang.Object r9 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r4) goto L_0x0031
            a32 r8 = r0.b
            c8e r7 = r0.a
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x006e
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0039:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.String r9 = r8.r()
            int r9 = r9.length()
            if (r9 != 0) goto L_0x0047
            goto L_0x0055
        L_0x0047:
            kotlin.Lazy r9 = r7.o
            java.lang.Object r9 = r9.getValue()
            x23 r9 = (defpackage.x23) r9
            boolean r9 = r8.X(r9)
            if (r9 == 0) goto L_0x0058
        L_0x0055:
            r1 = r3
            goto L_0x014f
        L_0x0058:
            kotlin.Lazy r9 = r7.w
            java.lang.Object r9 = r9.getValue()
            jca r9 = (defpackage.jca) r9
            r0.a = r7
            r0.b = r8
            r0.v = r4
            java.lang.Object r9 = r9.b(r8, r0)
            if (r9 != r1) goto L_0x006e
            goto L_0x014f
        L_0x006e:
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            if (r9 != 0) goto L_0x0073
            goto L_0x0055
        L_0x0073:
            android.content.Context r0 = r7.a
            long r1 = r8.a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            w7e r2 = new w7e
            r2.<init>()
            r2.a = r0
            r2.b = r1
            java.lang.String r0 = r8.r()
            r2.d = r0
            java.lang.String r0 = r8.r()
            r2.e = r0
            androidx.core.graphics.drawable.IconCompat r9 = androidx.core.graphics.drawable.IconCompat.b(r9)
            r2.f = r9
            zb8 r9 = defpackage.zb8.b
            r9.getClass()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = ":chats?id="
            r9.<init>(r0)
            long r0 = r8.a
            r9.append(r0)
            java.lang.String r8 = "&type=local"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            kotlin.Lazy r9 = r7.v
            java.lang.Object r0 = r9.getValue()
            cm r0 = (defpackage.cm) r0
            fz7 r0 = (defpackage.fz7) r0
            java.lang.String r0 = r0.b
            java.lang.Object r9 = r9.getValue()
            cm r9 = (defpackage.cm) r9
            fz7 r9 = (defpackage.fz7) r9
            java.lang.String r9 = r9.e
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<one.me.android.MainActivity> r5 = one.me.android.MainActivity.class
            android.content.Context r6 = r7.a
            r1.<init>(r6, r5)
            java.lang.String r5 = "CUSTOM_DEEP_LINK"
            r1.setAction(r5)
            zb8 r5 = defpackage.zb8.b
            r5.getClass()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r0 = "://"
            r5.append(r0)
            r5.append(r9)
            java.lang.String r9 = "/"
            r5.append(r9)
            r5.append(r8)
            java.lang.String r8 = r5.toString()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            r1.setData(r8)
            android.content.Intent[] r8 = new android.content.Intent[]{r1}
            r2.c = r8
            java.lang.String r8 = "ru.oneme.app.sharing.category.SHORTCUT_SHARE"
            java.util.Set r8 = kotlin.collections.SetsKt.setOf(r8)
            ws r9 = new ws
            r0 = 0
            r9.<init>((int) r0)
            r9.addAll(r8)
            r2.g = r9
            java.lang.CharSequence r8 = r2.d     // Catch:{ all -> 0x0145 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0145 }
            if (r8 != 0) goto L_0x013d
            android.content.Intent[] r8 = r2.c     // Catch:{ all -> 0x0145 }
            if (r8 == 0) goto L_0x0135
            int r8 = r8.length     // Catch:{ all -> 0x0145 }
            if (r8 == 0) goto L_0x0135
            y68 r8 = r2.h     // Catch:{ all -> 0x0145 }
            if (r8 != 0) goto L_0x0131
            y68 r8 = new y68     // Catch:{ all -> 0x0145 }
            java.lang.String r9 = r2.b     // Catch:{ all -> 0x0145 }
            r8.<init>(r9)     // Catch:{ all -> 0x0145 }
            r2.h = r8     // Catch:{ all -> 0x0145 }
        L_0x0131:
            r2.i = r4     // Catch:{ all -> 0x0145 }
            r1 = r2
            goto L_0x014f
        L_0x0135:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0145 }
            java.lang.String r9 = "Shortcut must have an intent"
            r8.<init>(r9)     // Catch:{ all -> 0x0145 }
            throw r8     // Catch:{ all -> 0x0145 }
        L_0x013d:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0145 }
            java.lang.String r9 = "Shortcut must have a non-empty label"
            r8.<init>(r9)     // Catch:{ all -> 0x0145 }
            throw r8     // Catch:{ all -> 0x0145 }
        L_0x0145:
            r8 = move-exception
            java.lang.String r7 = r7.X
            java.lang.String r9 = "fail to create shortcut"
            defpackage.z68.f(r7, r9, r8)
            goto L_0x0055
        L_0x014f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c8e.b(c8e, a32, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void a() {
        c();
    }

    public final void c() {
        try {
            Context context = this.a;
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
            y7e.A(context).getClass();
            Iterator it = y7e.z(context).iterator();
            if (it.hasNext()) {
                rae.w(it.next());
                throw null;
            }
        } catch (Throwable th) {
            z68.f(this.X, "clear: failed", th);
        }
    }

    public final void d() {
        aje v2 = ev0.v((d14) this.x.getValue(), (CoroutineContext) null, f14.b, new b8e(this, (Continuation) null), 1);
        this.y.setValue(this, Y[0], v2);
    }
}

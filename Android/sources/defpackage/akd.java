package defpackage;

import android.content.Context;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import org.apache.http.HttpStatus;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: akd  reason: default package */
public abstract class akd extends y2 implements bud {
    public static final List p = CollectionsKt.listOf("TOP", "NEW");
    public static final List q = CollectionsKt.listOf("RECENT", "NEW", "TOP");
    public static final List r = CollectionsKt.emptyList();
    public static final Lazy s = LazyKt.lazy(new red(7));
    public final boolean h = false;
    public final HashSet i = new HashSet(1);
    public final Lazy j = LazyKt.lazy(new yjd(this, 0));
    public final q3d k = new q3d(new yjd(this, 1));
    public final q3d l = new q3d(new yjd(this, 2));
    public final Lazy m;
    public final CopyOnWriteArraySet n;
    public final Lazy o;

    public akd(Context context, fn5 fn5) {
        super(context, "settings.prefs", fn5);
        this.m = LazyKt.lazy(new a1b(context, 22));
        this.n = new CopyOnWriteArraySet();
        this.o = LazyKt.lazy(new yjd(this, 3));
    }

    public final void b() {
        super.b();
        this.l.a();
    }

    public final boolean m(Enum enumR, boolean z) {
        return this.g.getBoolean(enumR.name(), z);
    }

    public final int n() {
        return (int) r(PmsKey.f26debugmode, (long) 0);
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List o(java.lang.Enum r5, java.util.List r6) {
        /*
            r4 = this;
            java.lang.String r0 = r5.name()
            r1 = 0
            java.lang.String r4 = r4.f(r0, r1)
            if (r4 != 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0012 }
            r0.<init>((java.lang.String) r4)     // Catch:{ JSONException -> 0x0012 }
            r1 = r0
        L_0x0012:
            if (r1 != 0) goto L_0x0015
            goto L_0x0048
        L_0x0015:
            java.util.ArrayList r6 = new java.util.ArrayList
            int r4 = r1.length()
            r6.<init>(r4)
            int r4 = r1.length()
            r0 = 0
        L_0x0023:
            if (r0 >= r4) goto L_0x0048
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch:{ all -> 0x003b }
            int r2 = r1.getInt(r0)     // Catch:{ all -> 0x003b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x003b }
            boolean r2 = r6.add(r2)     // Catch:{ all -> 0x003b }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x003b }
            kotlin.Result.m23constructorimpl(r2)     // Catch:{ all -> 0x003b }
            goto L_0x0045
        L_0x003b:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)
            kotlin.Result.m23constructorimpl(r2)
        L_0x0045:
            int r0 = r0 + 1
            goto L_0x0023
        L_0x0048:
            if (r6 == 0) goto L_0x004b
            return r6
        L_0x004b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "got null intlist value for "
            r4.<init>(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akd.o(java.lang.Enum, java.util.List):java.util.List");
    }

    public final String p() {
        return u(PmsKey.f50invitelink, "https://max.ru");
    }

    public final int q() {
        return (int) r(PmsKey.f57livelocationsendtimeout, (long) 60);
    }

    public final long r(Enum enumR, long j2) {
        Number number;
        try {
            number = Long.valueOf(e(enumR.name(), j2));
        } catch (ClassCastException unused) {
            number = Integer.valueOf(d(enumR.name(), (int) j2));
        }
        return number.longValue();
    }

    public final int s() {
        return (int) r(PmsKey.f63maxdescriptionlength, (long) HttpStatus.SC_BAD_REQUEST);
    }

    public final int t() {
        return (int) r(PmsKey.f73maxthemelength, (long) 200);
    }

    public final String u(Enum enumR, String str) {
        String z = z(enumR, str);
        if (z != null) {
            return z;
        }
        throw new IllegalArgumentException(("got null string value for " + enumR).toString());
    }

    public final List v(Enum enumR, List list) {
        List g = g(enumR.name(), list);
        if (g != null) {
            return g;
        }
        throw new IllegalArgumentException(("got null stringlist value for " + enumR).toString());
    }

    public final boolean w() {
        return m(PmsKey.f31draftssyncenabled, false);
    }

    public final boolean x() {
        return m(PmsKey.f98safemodeenabled, false);
    }

    public final boolean y() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    public final String z(Enum enumR, String str) {
        return f(enumR.name(), str);
    }
}

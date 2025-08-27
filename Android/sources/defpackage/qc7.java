package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import org.apache.http.HttpStatus;

/* renamed from: qc7  reason: default package */
public final class qc7 {
    public static final long l;
    public static final long m;
    public static final long n;
    public static final long o;
    public static final List p;
    public final boolean a;
    public final long b;
    public final x23 c;
    public final String d = qc7.class.getName();
    public final Lazy e;
    public final Lazy f;
    public final SharedPreferences g;
    public final LinkedHashMap h;
    public nc7 i;
    public Integer j;
    public Function0 k;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        l = timeUnit.toMillis(3);
        m = timeUnit.toMillis(180);
        n = timeUnit.toMillis(60);
        o = timeUnit.toMillis(60);
        jgd jgd = jgd.APPLICATION_BACKGROUND;
        jgd jgd2 = jgd.APPLICATION_BACKGROUND;
        Integer valueOf = Integer.valueOf(HttpStatus.SC_MULTIPLE_CHOICES);
        jgd jgd3 = jgd.APPLICATION_BACKGROUND;
        jgd jgd4 = jgd.APPLICATION_BACKGROUND;
        p = CollectionsKt.listOf(100, valueOf, 150, 450);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: nc7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: nc7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: nc7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: nc7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: nc7} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qc7(boolean r6, long r7) {
        /*
            r5 = this;
            mc7 r0 = defpackage.mc7.a
            q4 r1 = r0.getAccessor()
            java.lang.Class<x23> r2 = defpackage.x23.class
            java.lang.Object r1 = r1.g(r2)
            x23 r1 = (defpackage.x23) r1
            q4 r2 = r0.getAccessor()
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            java.lang.Object r2 = r2.g(r3)
            android.content.Context r2 = (android.content.Context) r2
            q4 r3 = r0.getAccessor()
            java.lang.Class<nd> r4 = defpackage.nd.class
            kotlin.Lazy r3 = r3.h(r4)
            q4 r0 = r0.getAccessor()
            java.lang.Class<z5a> r4 = defpackage.z5a.class
            kotlin.Lazy r0 = r0.h(r4)
            r5.<init>()
            r5.a = r6
            r5.b = r7
            r5.c = r1
            java.lang.Class<qc7> r6 = defpackage.qc7.class
            java.lang.String r6 = r6.getName()
            r5.d = r6
            r5.e = r3
            r5.f = r0
            java.lang.String r6 = "in_app_review_prefs"
            r7 = 0
            android.content.SharedPreferences r6 = r2.getSharedPreferences(r6, r7)
            r5.g = r6
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            r5.h = r7
            java.lang.String r7 = "pref_current_condition"
            r8 = 0
            java.lang.String r6 = r6.getString(r7, r8)
            if (r6 == 0) goto L_0x007a
            kotlin.enums.EnumEntries r7 = defpackage.nc7.Y
            java.util.Iterator r7 = r7.iterator()
        L_0x0062:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0078
            java.lang.Object r0 = r7.next()
            r1 = r0
            nc7 r1 = (defpackage.nc7) r1
            java.lang.String r1 = r1.a
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r6)
            if (r1 == 0) goto L_0x0062
            r8 = r0
        L_0x0078:
            nc7 r8 = (defpackage.nc7) r8
        L_0x007a:
            r5.i = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qc7.<init>(boolean, long):void");
    }

    public final void a() {
        for (oc7 oc7 : this.h.values()) {
            oc7.getClass();
        }
        this.g.edit().putString("pref_current_condition", (String) null).apply();
        this.i = null;
    }

    public final void b(xc7 xc7) {
        long currentTimeMillis = System.currentTimeMillis();
        xc7 xc72 = xc7.b;
        SharedPreferences sharedPreferences = this.g;
        if (xc7 == xc72) {
            sharedPreferences.edit().putLong("pref_last_fake_in_app_review_success_time", -1).apply();
            sharedPreferences.edit().putLong("pref_last_fake_in_app_review_fail_time", currentTimeMillis).apply();
            d((Integer) null);
        } else {
            sharedPreferences.edit().putLong("pref_last_in_app_review_time", currentTimeMillis).apply();
        }
        a();
    }

    public final void c(xc7 xc7, Integer num) {
        long currentTimeMillis = System.currentTimeMillis();
        xc7 xc72 = xc7.b;
        SharedPreferences sharedPreferences = this.g;
        if (xc7 == xc72) {
            sharedPreferences.edit().putLong("pref_last_fake_in_app_review_success_time", currentTimeMillis).apply();
            sharedPreferences.edit().putLong("pref_last_fake_in_app_review_fail_time", -1).apply();
            d(num);
        } else {
            sharedPreferences.edit().putLong("pref_last_in_app_review_time", currentTimeMillis).apply();
        }
        a();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [hj7, java.lang.Object] */
    public final void d(Integer num) {
        Integer num2;
        nc7 nc7 = this.i;
        if (nc7 != null && (num2 = this.j) != null) {
            Map createMapBuilder = MapsKt.createMapBuilder();
            x23 x23 = this.c;
            createMapBuilder.put("session_id", Long.valueOf(((a33) x23).B()));
            if (nc7 == nc7.PARTICIPATED_IN_CALL) {
                num2 = ((z5a) this.f.getValue()).d();
            }
            createMapBuilder.put("screen_from", num2);
            createMapBuilder.put("trigger", nc7.a);
            if (num != null) {
                createMapBuilder.put("mark", Integer.valueOf(num.intValue()));
            }
            Map build = MapsKt.build(createMapBuilder);
            ? obj = new Object();
            obj.v = "APP_REVIEW";
            obj.w = "app_review";
            obj.b = ((qjd) x23).s();
            obj.a = System.currentTimeMillis();
            obj.c(build);
            ((nd) this.e.getValue()).j(obj.d());
        }
    }

    public final void e(Integer num) {
        if (this.i != null) {
            if (num == null) {
                num = ((z5a) this.f.getValue()).d();
            }
            if (CollectionsKt.contains(p, num)) {
                this.j = num;
                if (this.a) {
                    wc7.b.W0().b(":inAppReview/fake", (Bundle) null);
                    return;
                }
                Function0 function0 = this.k;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    public final void f(Set set, jgd jgd) {
        nc7 nc7 = this.i;
        String str = this.d;
        if (nc7 != null) {
            z68.c(str, "InAppReviewConditionManager triggerCondition() currentCondition != null (" + nc7 + ")", new Object[0]);
            return;
        }
        a33 a33 = (a33) this.c;
        boolean z = a33.g.getBoolean("app.disable_in_app_review_time_condition", false);
        SharedPreferences sharedPreferences = this.g;
        if (z) {
            z68.c(str, "InAppReviewConditionManager isTimeAllowsStartInAppReview() clientPrefs.isDisableInAppReviewTimeCondition:" + a33.g.getBoolean("app.disable_in_app_review_time_condition", false), new Object[0]);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - l < this.b) {
                z68.c(str, "InAppReviewConditionManager isTimeAllowsStartInAppReview() hadCrashInPrevious3Days", new Object[0]);
                return;
            }
            long j2 = sharedPreferences.getLong("pref_last_fake_in_app_review_success_time", -1);
            long j3 = sharedPreferences.getLong("pref_last_fake_in_app_review_fail_time", -1);
            long j4 = sharedPreferences.getLong("pref_last_in_app_review_time", -1);
            int i2 = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
            if (!(i2 == 0 && j3 == -1 && j4 == -1) && ((i2 == 0 || currentTimeMillis - j2 < m) && ((j3 == -1 || currentTimeMillis - j3 < n) && (j4 == -1 || currentTimeMillis - j4 < o)))) {
                StringBuilder n2 = tr1.n(currentTimeMillis, "InAppReviewConditionManager isTimeAllowsStartInAppReview() currentTime:", ", lastSuccessfulFakeReviewTime:");
                n2.append(j2);
                tr1.v(n2, ", lastFailedFakeReviewTime:", j3, ", lastReviewTime:");
                n2.append(j4);
                z68.c(str, n2.toString(), new Object[0]);
                return;
            }
        }
        Iterator it = set.iterator();
        String str2 = null;
        nc7 nc72 = null;
        while (it.hasNext()) {
            pc7 pc7 = (pc7) it.next();
            int ordinal = pc7.a.ordinal();
            int i3 = pc7.b;
            if (ordinal == 0) {
                int i4 = sharedPreferences.getInt("pref_sent_messages_count", 0) + i3;
                if (i4 >= 5) {
                    sharedPreferences.edit().putInt("pref_sent_messages_count", 0).apply();
                } else {
                    sharedPreferences.edit().putInt("pref_sent_messages_count", i4).apply();
                    z68.c(str, "InAppReviewConditionManager isConditionAllowsStartInAppReview() triggeredCondition:" + pc7 + ", sentMessagesCount:" + i4, new Object[0]);
                }
            } else if (ordinal == 3) {
                int i5 = sharedPreferences.getInt("pref_reactions_count", 0) + i3;
                if (i5 >= 2) {
                    sharedPreferences.edit().putInt("pref_reactions_count", 0).apply();
                } else {
                    sharedPreferences.edit().putInt("pref_reactions_count", i5).apply();
                    z68.c(str, "InAppReviewConditionManager isConditionAllowsStartInAppReview() triggeredCondition:" + pc7 + ", addedReactionsCount:" + i5, new Object[0]);
                }
            } else if (ordinal == 4) {
                int i6 = sharedPreferences.getInt("pref_sent_stickers_count", 0) + i3;
                if (i6 >= 3) {
                    sharedPreferences.edit().putInt("pref_sent_stickers_count", 0).apply();
                } else {
                    sharedPreferences.edit().putInt("pref_sent_stickers_count", i6).apply();
                    z68.c(str, "InAppReviewConditionManager isConditionAllowsStartInAppReview() triggeredCondition:" + pc7 + ", sentStickersCount:" + i6, new Object[0]);
                }
            } else if (ordinal == 5) {
                int i7 = sharedPreferences.getInt("pref_created_group_chats_count", 0) + i3;
                if (i7 >= 2) {
                    sharedPreferences.edit().putInt("pref_created_group_chats_count", 0).apply();
                } else {
                    sharedPreferences.edit().putInt("pref_created_group_chats_count", i7).apply();
                    z68.c(str, "InAppReviewConditionManager isConditionAllowsStartInAppReview() triggeredCondition:" + pc7 + ", createdGroupChatsCount:" + i7, new Object[0]);
                }
            } else if (ordinal == 6) {
                int i8 = sharedPreferences.getInt("pref_made_pin_count", 0) + i3;
                if (i8 >= 2) {
                    sharedPreferences.edit().putInt("pref_made_pin_count", 0).apply();
                } else {
                    sharedPreferences.edit().putInt("pref_made_pin_count", i8).apply();
                    z68.c(str, "InAppReviewConditionManager isConditionAllowsStartInAppReview() triggeredCondition:" + pc7 + ", madePinCount:" + i8, new Object[0]);
                }
            }
            nc72 = pc7.a;
        }
        if (nc72 != null && ((oc7) this.h.get(nc72)) != null) {
            this.i = nc72;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            nc7 nc73 = this.i;
            if (nc73 != null) {
                str2 = nc73.a;
            }
            edit.putString("pref_current_condition", str2).apply();
            e(Integer.valueOf(jgd.a));
        }
    }
}

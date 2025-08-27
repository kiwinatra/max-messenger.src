package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: m8g  reason: default package */
public final class m8g implements jq {
    public final Object a;
    public final Object b;

    public m8g(Context context) {
        o5h o5h;
        this.a = new j6h(context, et6.b);
        synchronized (o5h.class) {
            try {
                if (o5h.o == null) {
                    o5h.o = new o5h(context.getApplicationContext(), 0);
                }
                o5h = o5h.o;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.b = o5h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(org.json.JSONObject r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.a
            w28 r0 = (defpackage.w28) r0
            r0.getClass()
            java.lang.String r1 = "feedback"
            r2 = 0
            java.lang.String r3 = "eventType"
            java.lang.String r3 = r10.getString(r3)     // Catch:{ JSONException -> 0x0046 }
            qsg r3 = defpackage.qsg.valueOf(r3)     // Catch:{ JSONException -> 0x0046 }
            int r3 = r3.ordinal()     // Catch:{ JSONException -> 0x0046 }
            java.lang.String r4 = "removedParticipantIds"
            java.lang.String r5 = "addedParticipantIds"
            java.lang.String r6 = "totalCount"
            java.lang.Object r7 = r0.o
            o60 r7 = (defpackage.o60) r7
            if (r3 == 0) goto L_0x0077
            r8 = 1
            if (r3 == r8) goto L_0x004e
            r4 = 2
            if (r3 != r4) goto L_0x0048
            boolean r3 = r10.has(r1)     // Catch:{ JSONException -> 0x0046 }
            if (r3 == 0) goto L_0x00aa
            tn1 r3 = new tn1     // Catch:{ JSONException -> 0x0046 }
            java.lang.Object r4 = r0.c     // Catch:{ JSONException -> 0x0046 }
            v02 r4 = (defpackage.v02) r4     // Catch:{ JSONException -> 0x0046 }
            org.json.JSONObject r10 = r10.getJSONObject(r1)     // Catch:{ JSONException -> 0x0046 }
            r4.getClass()     // Catch:{ JSONException -> 0x0046 }
            q51 r10 = defpackage.v02.k(r10)     // Catch:{ JSONException -> 0x0046 }
            r3.<init>(r10)     // Catch:{ JSONException -> 0x0046 }
            r2 = r3
            goto L_0x00aa
        L_0x0046:
            r10 = move-exception
            goto L_0x009f
        L_0x0048:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException     // Catch:{ JSONException -> 0x0046 }
            r10.<init>()     // Catch:{ JSONException -> 0x0046 }
            throw r10     // Catch:{ JSONException -> 0x0046 }
        L_0x004e:
            int r1 = r10.getInt(r6)     // Catch:{ JSONException -> 0x0046 }
            org.json.JSONArray r3 = r10.optJSONArray(r5)     // Catch:{ JSONException -> 0x0046 }
            if (r3 == 0) goto L_0x005d
            java.util.ArrayList r3 = r7.b(r3)     // Catch:{ JSONException -> 0x0046 }
            goto L_0x0061
        L_0x005d:
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()     // Catch:{ JSONException -> 0x0046 }
        L_0x0061:
            org.json.JSONArray r10 = r10.optJSONArray(r4)     // Catch:{ JSONException -> 0x0046 }
            if (r10 == 0) goto L_0x006c
            java.util.ArrayList r10 = r7.b(r10)     // Catch:{ JSONException -> 0x0046 }
            goto L_0x0070
        L_0x006c:
            java.util.List r10 = kotlin.collections.CollectionsKt.emptyList()     // Catch:{ JSONException -> 0x0046 }
        L_0x0070:
            un1 r4 = new un1     // Catch:{ JSONException -> 0x0046 }
            r4.<init>(r1, r3, r10)     // Catch:{ JSONException -> 0x0046 }
        L_0x0075:
            r2 = r4
            goto L_0x00aa
        L_0x0077:
            int r1 = r10.optInt(r6)     // Catch:{ JSONException -> 0x0046 }
            org.json.JSONArray r3 = r10.optJSONArray(r5)     // Catch:{ JSONException -> 0x0046 }
            if (r3 == 0) goto L_0x0086
            java.util.ArrayList r3 = r7.b(r3)     // Catch:{ JSONException -> 0x0046 }
            goto L_0x008a
        L_0x0086:
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()     // Catch:{ JSONException -> 0x0046 }
        L_0x008a:
            org.json.JSONArray r10 = r10.optJSONArray(r4)     // Catch:{ JSONException -> 0x0046 }
            if (r10 == 0) goto L_0x0095
            java.util.ArrayList r10 = r7.b(r10)     // Catch:{ JSONException -> 0x0046 }
            goto L_0x0099
        L_0x0095:
            java.util.List r10 = kotlin.collections.CollectionsKt.emptyList()     // Catch:{ JSONException -> 0x0046 }
        L_0x0099:
            sn1 r4 = new sn1     // Catch:{ JSONException -> 0x0046 }
            r4.<init>(r1, r3, r10)     // Catch:{ JSONException -> 0x0046 }
            goto L_0x0075
        L_0x009f:
            java.lang.Object r0 = r0.b
            voc r0 = (defpackage.voc) r0
            java.lang.String r1 = "WaitingRoomNotificationParser"
            java.lang.String r3 = "Can't parse chat room notification"
            r0.logException(r1, r3, r10)
        L_0x00aa:
            if (r2 == 0) goto L_0x00cd
            boolean r10 = r2 instanceof defpackage.sn1
            java.lang.Object r9 = r9.b
            wn1 r9 = (defpackage.wn1) r9
            if (r10 == 0) goto L_0x00ba
            sn1 r2 = (defpackage.sn1) r2
            r9.onAttendee(r2)
            goto L_0x00cd
        L_0x00ba:
            boolean r10 = r2 instanceof defpackage.tn1
            if (r10 == 0) goto L_0x00c4
            tn1 r2 = (defpackage.tn1) r2
            r9.onFeedback(r2)
            goto L_0x00cd
        L_0x00c4:
            boolean r10 = r2 instanceof defpackage.un1
            if (r10 == 0) goto L_0x00cd
            un1 r2 = (defpackage.un1) r2
            r9.onHandUp(r2)
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m8g.a(org.json.JSONObject):void");
    }

    public void b(JSONObject jSONObject) {
        vn1 vn1;
        w28 w28 = (w28) this.a;
        w28.getClass();
        try {
            vn1 = new vn1(!jSONObject.optBoolean("disprove", false));
        } catch (JSONException e) {
            ((voc) w28.b).logException("WaitingRoomNotificationParser", "Can't parse promotion approved", e);
            vn1 = null;
        }
        if (vn1 != null) {
            ((wn1) this.b).onPromotionUpdated(vn1);
        }
    }

    public void c(v8g v8g) {
        Handler handler = (Handler) this.a;
        if (handler != null) {
            handler.post(new s6e(26, this, v8g));
        }
    }

    public void d(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.a)) {
            hashMap = new HashMap((Map) this.a);
        }
        synchronized (((Map) this.b)) {
            hashMap2 = new HashMap((Map) this.b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).V(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((qdf) entry2.getKey()).c(new ApiException(status));
            }
        }
    }

    public /* synthetic */ m8g(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public m8g() {
        this.a = Collections.synchronizedMap(new WeakHashMap());
        this.b = Collections.synchronizedMap(new WeakHashMap());
    }
}

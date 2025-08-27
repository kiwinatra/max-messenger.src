package defpackage;

import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: l25  reason: default package */
public final class l25 {
    public final URL a;
    public final JSONObject b;
    public final URL c;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.net.URL} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l25(org.json.JSONObject r2, java.lang.String r3) {
        /*
            r1 = this;
            java.net.URL r0 = new java.net.URL
            r0.<init>(r3)
            r1.<init>()
            r1.a = r0
            r1.b = r2
            java.lang.String r3 = "width"
            r2.optInt(r3)
            java.lang.String r3 = "height"
            r2.optInt(r3)
            java.lang.String r3 = "staticUrl"
            java.lang.String r2 = r2.optString(r3)
            r3 = 0
            if (r2 == 0) goto L_0x0040
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x002b }
            java.net.URL r0 = new java.net.URL     // Catch:{ all -> 0x002b }
            r0.<init>(r2)     // Catch:{ all -> 0x002b }
            java.lang.Object r2 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x002b }
            goto L_0x0036
        L_0x002b:
            r2 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r2 = kotlin.Result.m23constructorimpl(r2)
        L_0x0036:
            boolean r0 = kotlin.Result.m29isFailureimpl(r2)
            if (r0 == 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r3 = r2
        L_0x003e:
            java.net.URL r3 = (java.net.URL) r3
        L_0x0040:
            r1.c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l25.<init>(org.json.JSONObject, java.lang.String):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l25)) {
            return false;
        }
        l25 l25 = (l25) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) l25.a) && Intrinsics.areEqual((Object) this.b, (Object) l25.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        JSONObject jSONObject = this.b;
        return hashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public final String toString() {
        return "Animation(url=" + this.a + ", otherProperties=" + this.b + ")";
    }
}

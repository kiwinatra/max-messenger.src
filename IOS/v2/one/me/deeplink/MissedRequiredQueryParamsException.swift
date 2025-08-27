package one.me.deeplink;

import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lone/me/deeplink/MissedRequiredQueryParamsException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "deep-link_release"}, k = 1, mv = {2, 0, 0})
public final class MissedRequiredQueryParamsException extends RuntimeException {
    public final Map a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MissedRequiredQueryParamsException(android.net.Uri r3, java.util.Map r4, java.util.LinkedHashSet r5) {
        /*
            r2 = this;
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Query params for "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " not contains all required params! queryParams="
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = ", requiredParams="
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            r2.a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.deeplink.MissedRequiredQueryParamsException.<init>(android.net.Uri, java.util.Map, java.util.LinkedHashSet):void");
    }
}

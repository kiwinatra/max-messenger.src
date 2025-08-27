package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: g6h  reason: default package */
public final class g6h {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String a;
    public final String b = "com.google.android.gms";
    public final boolean c;

    public g6h(String str, boolean z) {
        vzg.i(str);
        this.a = str;
        vzg.i("com.google.android.gms");
        this.c = z;
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent a(android.content.Context r6) {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = r5.a
            if (r1 == 0) goto L_0x0050
            boolean r2 = r5.c
            if (r2 == 0) goto L_0x0042
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "serviceActionBundleKey"
            r2.putString(r3, r1)
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x0020 }
            android.net.Uri r3 = d     // Catch:{ IllegalArgumentException -> 0x0020 }
            java.lang.String r4 = "serviceIntentCall"
            android.os.Bundle r6 = r6.call(r3, r4, r0, r2)     // Catch:{ IllegalArgumentException -> 0x0020 }
            goto L_0x002b
        L_0x0020:
            r6 = move-exception
            java.lang.String r2 = "Dynamic intent resolution failed: "
            java.lang.String r6 = r6.toString()
            r2.concat(r6)
            r6 = r0
        L_0x002b:
            if (r6 != 0) goto L_0x002e
            goto L_0x0037
        L_0x002e:
            java.lang.String r0 = "serviceResponseIntentKey"
            android.os.Parcelable r6 = r6.getParcelable(r0)
            r0 = r6
            android.content.Intent r0 = (android.content.Intent) r0
        L_0x0037:
            if (r0 != 0) goto L_0x0042
            java.lang.String r6 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Dynamic lookup for intent failed for action: "
            r2.concat(r6)
        L_0x0042:
            if (r0 != 0) goto L_0x0059
            android.content.Intent r6 = new android.content.Intent
            r6.<init>(r1)
            java.lang.String r5 = r5.b
            android.content.Intent r5 = r6.setPackage(r5)
            return r5
        L_0x0050:
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            android.content.Intent r0 = r5.setComponent(r0)
        L_0x0059:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g6h.a(android.content.Context):android.content.Intent");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6h)) {
            return false;
        }
        g6h g6h = (g6h) obj;
        return kne.o(this.a, g6h.a) && kne.o(this.b, g6h.b) && kne.o((Object) null, (Object) null) && this.c == g6h.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, 4225, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        vzg.m((Object) null);
        throw null;
    }
}

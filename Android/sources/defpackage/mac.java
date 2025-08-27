package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: mac  reason: default package */
public final class mac {
    public final CharSequence a;
    public final CharSequence b;
    public final Bitmap c;

    public mac(String str, String str2, Bitmap bitmap) {
        this.a = str;
        this.b = str2;
        this.c = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mac)) {
            return false;
        }
        mac mac = (mac) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) mac.a) && Intrinsics.areEqual((Object) this.b, (Object) mac.b) && Intrinsics.areEqual((Object) this.c, (Object) mac.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        Bitmap bitmap = this.c;
        if (bitmap != null) {
            i = bitmap.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "QrCodeData(name=" + this.a + ", shortName=" + this.b + ", qrCode=" + this.c + ")";
    }
}

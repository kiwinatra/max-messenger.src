package defpackage;

import android.net.Uri;

/* renamed from: fo0  reason: default package */
public interface fo0 {
    zz7 d(Uri uri);

    zz7 j(us8 us8) {
        byte[] bArr = us8.k;
        if (bArr != null) {
            return n(bArr);
        }
        Uri uri = us8.m;
        if (uri != null) {
            return d(uri);
        }
        return null;
    }

    zz7 n(byte[] bArr);
}

package defpackage;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: zp8  reason: default package */
public final class zp8 implements Parcelable {
    public static final Parcelable.Creator<zp8> CREATOR = new f27(23);
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence o;
    public final Bitmap v;
    public final Uri w;
    public final Bundle x;
    public final Uri y;
    public MediaDescription z;

    public zp8(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.o = charSequence3;
        this.v = bitmap;
        this.w = uri;
        this.x = bundle;
        this.y = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.zp8 a(java.lang.Object r13) {
        /*
            r0 = 0
            if (r13 == 0) goto L_0x006b
            android.media.MediaDescription r13 = (android.media.MediaDescription) r13
            java.lang.String r2 = defpackage.xp8.g(r13)
            java.lang.CharSequence r3 = defpackage.xp8.i(r13)
            java.lang.CharSequence r4 = defpackage.xp8.h(r13)
            java.lang.CharSequence r5 = defpackage.xp8.c(r13)
            android.graphics.Bitmap r6 = defpackage.xp8.e(r13)
            android.net.Uri r7 = defpackage.xp8.f(r13)
            android.os.Bundle r1 = defpackage.xp8.d(r13)
            if (r1 != 0) goto L_0x0025
        L_0x0023:
            r1 = r0
            goto L_0x002b
        L_0x0025:
            defpackage.px8.a(r1)
            r1.isEmpty()     // Catch:{ BadParcelableException -> 0x0023 }
        L_0x002b:
            if (r1 == 0) goto L_0x0033
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>(r1)
            r1 = r8
        L_0x0033:
            if (r1 == 0) goto L_0x0059
            java.lang.String r8 = "android.support.v4.media.description.MEDIA_URI"
            android.os.Parcelable r9 = r1.getParcelable(r8)
            android.net.Uri r9 = (android.net.Uri) r9
            if (r9 == 0) goto L_0x0057
            java.lang.String r10 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r11 = r1.containsKey(r10)
            if (r11 == 0) goto L_0x0051
            int r11 = r1.size()
            r12 = 2
            if (r11 != r12) goto L_0x0051
            r8 = r0
        L_0x004f:
            r0 = r9
            goto L_0x005a
        L_0x0051:
            r1.remove(r8)
            r1.remove(r10)
        L_0x0057:
            r8 = r1
            goto L_0x004f
        L_0x0059:
            r8 = r1
        L_0x005a:
            if (r0 == 0) goto L_0x005e
        L_0x005c:
            r9 = r0
            goto L_0x0063
        L_0x005e:
            android.net.Uri r0 = defpackage.yp8.a(r13)
            goto L_0x005c
        L_0x0063:
            zp8 r0 = new zp8
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.z = r13
        L_0x006b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zp8.a(java.lang.Object):zp8");
    }

    public final MediaDescription b() {
        MediaDescription mediaDescription = this.z;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder b2 = xp8.b();
        xp8.n(b2, this.a);
        xp8.p(b2, this.b);
        xp8.o(b2, this.c);
        xp8.j(b2, this.o);
        xp8.l(b2, this.v);
        xp8.m(b2, this.w);
        xp8.k(b2, this.x);
        yp8.b(b2, this.y);
        MediaDescription a2 = xp8.a(b2);
        this.z = a2;
        return a2;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.b + ", " + this.c + ", " + this.o;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        b().writeToParcel(parcel, i);
    }
}

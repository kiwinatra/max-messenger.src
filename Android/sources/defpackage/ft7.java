package defpackage;

import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import androidx.media3.common.PlaybackException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: ft7  reason: default package */
public abstract class ft7 {
    public static final dc7 a;

    static {
        String[] strArr = {MediaMetadataCompat.METADATA_KEY_COMPOSER, MediaMetadataCompat.METADATA_KEY_COMPILATION, MediaMetadataCompat.METADATA_KEY_DATE, MediaMetadataCompat.METADATA_KEY_YEAR, MediaMetadataCompat.METADATA_KEY_GENRE, MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER, MediaMetadataCompat.METADATA_KEY_NUM_TRACKS, MediaMetadataCompat.METADATA_KEY_DISC_NUMBER, MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, MediaMetadataCompat.METADATA_KEY_ART, MediaMetadataCompat.METADATA_KEY_ART_URI, MediaMetadataCompat.METADATA_KEY_ALBUM_ART, MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, MediaMetadataCompat.METADATA_KEY_USER_RATING, MediaMetadataCompat.METADATA_KEY_RATING, MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION, MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, MediaMetadataCompat.METADATA_KEY_MEDIA_ID, MediaMetadataCompat.METADATA_KEY_MEDIA_URI, MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE, MediaMetadataCompat.METADATA_KEY_ADVERTISEMENT, MediaMetadataCompat.METADATA_KEY_DOWNLOAD_STATUS, "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"};
        int i = dc7.c;
        Object[] objArr = new Object[32];
        objArr[0] = MediaMetadataCompat.METADATA_KEY_TITLE;
        objArr[1] = MediaMetadataCompat.METADATA_KEY_ARTIST;
        objArr[2] = MediaMetadataCompat.METADATA_KEY_DURATION;
        objArr[3] = MediaMetadataCompat.METADATA_KEY_ALBUM;
        objArr[4] = MediaMetadataCompat.METADATA_KEY_AUTHOR;
        objArr[5] = MediaMetadataCompat.METADATA_KEY_WRITER;
        System.arraycopy(strArr, 0, objArr, 6, 26);
        a = dc7.o(32, objArr);
    }

    public static long a(mob mob, vs8 vs8, long j) {
        long j2 = mob == null ? 0 : mob.c;
        long c = c(mob, vs8, j);
        long d = d(vs8);
        return d == -9223372036854775807L ? Math.max(c, j2) : v0g.k(j2, c, d);
    }

    public static byte[] b(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static long c(mob mob, vs8 vs8, long j) {
        mob mob2 = mob;
        if (mob2 == null) {
            return 0;
        }
        long j2 = mob2.b;
        if (mob2.a == 3) {
            Long valueOf = j == -9223372036854775807L ? null : Long.valueOf(j);
            j2 = Math.max(0, j2 + ((long) (mob2.o * ((float) (valueOf != null ? valueOf.longValue() : SystemClock.elapsedRealtime() - mob2.y)))));
        }
        long j3 = j2;
        long d = d(vs8);
        return d == -9223372036854775807L ? Math.max(0, j3) : v0g.k(j3, 0, d);
    }

    public static long d(vs8 vs8) {
        if (vs8 == null || !vs8.a.containsKey(MediaMetadataCompat.METADATA_KEY_DURATION)) {
            return -9223372036854775807L;
        }
        long a2 = vs8.a(MediaMetadataCompat.METADATA_KEY_DURATION);
        if (a2 <= 0) {
            return -9223372036854775807L;
        }
        return a2;
    }

    public static long e(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                throw new IllegalArgumentException(wj6.h(i, "Unrecognized FolderType: "));
        }
    }

    public static int f(long j) {
        if (j == 0) {
            return 0;
        }
        if (j == 1) {
            return 1;
        }
        if (j == 2) {
            return 2;
        }
        if (j == 3) {
            return 3;
        }
        if (j == 4) {
            return 4;
        }
        if (j == 5) {
            return 5;
        }
        return j == 6 ? 6 : 0;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.zp8 g(defpackage.ir8 r17, android.graphics.Bitmap r18) {
        /*
            r0 = r17
            r1 = 2
            r2 = 3
            r3 = -1
            r4 = 0
            r5 = 1
            java.lang.String r6 = r0.a
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            r7 = 0
            if (r6 == 0) goto L_0x0014
            r9 = r7
            goto L_0x0017
        L_0x0014:
            java.lang.String r6 = r0.a
            r9 = r6
        L_0x0017:
            if (r18 == 0) goto L_0x001c
            r13 = r18
            goto L_0x001d
        L_0x001c:
            r13 = r7
        L_0x001d:
            us8 r6 = r0.d
            android.os.Bundle r8 = r6.I
            if (r8 == 0) goto L_0x0029
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>(r8)
            r8 = r10
        L_0x0029:
            java.lang.Integer r10 = r6.p
            if (r10 == 0) goto L_0x0035
            int r11 = r10.intValue()
            if (r11 == r3) goto L_0x0035
            r11 = r5
            goto L_0x0036
        L_0x0035:
            r11 = r4
        L_0x0036:
            java.lang.Integer r12 = r6.H
            if (r12 == 0) goto L_0x003c
            r14 = r5
            goto L_0x003d
        L_0x003c:
            r14 = r4
        L_0x003d:
            if (r11 != 0) goto L_0x0041
            if (r14 == 0) goto L_0x0069
        L_0x0041:
            if (r8 != 0) goto L_0x0048
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
        L_0x0048:
            if (r11 == 0) goto L_0x005a
            r10.getClass()
            int r10 = r10.intValue()
            long r10 = e(r10)
            java.lang.String r15 = "android.media.extra.BT_FOLDER_TYPE"
            r8.putLong(r15, r10)
        L_0x005a:
            if (r14 == 0) goto L_0x0069
            r12.getClass()
            int r10 = r12.intValue()
            long r10 = (long) r10
            java.lang.String r12 = "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"
            r8.putLong(r12, r10)
        L_0x0069:
            java.lang.CharSequence r10 = r6.a
            java.lang.CharSequence r11 = r6.e
            if (r11 == 0) goto L_0x0085
            if (r8 != 0) goto L_0x0076
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
        L_0x0076:
            java.lang.String r1 = "androidx.media3.mediadescriptioncompat.title"
            r8.putCharSequence(r1, r10)
            java.lang.CharSequence r1 = r6.f
            java.lang.CharSequence r2 = r6.g
            r12 = r2
            r15 = r8
            r10 = r11
            r11 = r1
            goto L_0x010e
        L_0x0085:
            java.lang.CharSequence[] r11 = new java.lang.CharSequence[r2]
            r12 = r4
            r14 = r12
        L_0x0089:
            if (r12 >= r2) goto L_0x0104
            java.lang.String[] r15 = defpackage.vs8.o
            int r2 = r15.length
            if (r14 >= r2) goto L_0x0104
            int r2 = r14 + 1
            r14 = r15[r14]
            r14.getClass()
            int r15 = r14.hashCode()
            switch(r15) {
                case -1853648227: goto L_0x00d7;
                case -1224124471: goto L_0x00cc;
                case 1684534006: goto L_0x00c1;
                case 1879671865: goto L_0x00b6;
                case 1897146402: goto L_0x00ab;
                case 1965214221: goto L_0x00a0;
                default: goto L_0x009e;
            }
        L_0x009e:
            r14 = r3
            goto L_0x00e1
        L_0x00a0:
            java.lang.String r15 = "android.media.metadata.ALBUM_ARTIST"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x00a9
            goto L_0x009e
        L_0x00a9:
            r14 = 5
            goto L_0x00e1
        L_0x00ab:
            java.lang.String r15 = "android.media.metadata.TITLE"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x00b4
            goto L_0x009e
        L_0x00b4:
            r14 = 4
            goto L_0x00e1
        L_0x00b6:
            java.lang.String r15 = "android.media.metadata.ALBUM"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x00bf
            goto L_0x009e
        L_0x00bf:
            r14 = 3
            goto L_0x00e1
        L_0x00c1:
            java.lang.String r15 = "android.media.metadata.COMPOSER"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x00ca
            goto L_0x009e
        L_0x00ca:
            r14 = r1
            goto L_0x00e1
        L_0x00cc:
            java.lang.String r15 = "android.media.metadata.WRITER"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x00d5
            goto L_0x009e
        L_0x00d5:
            r14 = r5
            goto L_0x00e1
        L_0x00d7:
            java.lang.String r15 = "android.media.metadata.ARTIST"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x00e0
            goto L_0x009e
        L_0x00e0:
            r14 = r4
        L_0x00e1:
            switch(r14) {
                case 0: goto L_0x00f4;
                case 1: goto L_0x00f1;
                case 2: goto L_0x00ee;
                case 3: goto L_0x00eb;
                case 4: goto L_0x00e9;
                case 5: goto L_0x00e6;
                default: goto L_0x00e4;
            }
        L_0x00e4:
            r14 = r7
            goto L_0x00f6
        L_0x00e6:
            java.lang.CharSequence r14 = r6.d
            goto L_0x00f6
        L_0x00e9:
            r14 = r10
            goto L_0x00f6
        L_0x00eb:
            java.lang.CharSequence r14 = r6.c
            goto L_0x00f6
        L_0x00ee:
            java.lang.CharSequence r14 = r6.A
            goto L_0x00f6
        L_0x00f1:
            java.lang.CharSequence r14 = r6.z
            goto L_0x00f6
        L_0x00f4:
            java.lang.CharSequence r14 = r6.b
        L_0x00f6:
            boolean r15 = android.text.TextUtils.isEmpty(r14)
            if (r15 != 0) goto L_0x0101
            int r15 = r12 + 1
            r11[r12] = r14
            r12 = r15
        L_0x0101:
            r14 = r2
            r2 = 3
            goto L_0x0089
        L_0x0104:
            r2 = r11[r4]
            r3 = r11[r5]
            r1 = r11[r1]
            r12 = r1
            r10 = r2
            r11 = r3
            r15 = r8
        L_0x010e:
            ar8 r0 = r0.f
            android.net.Uri r0 = r0.a
            zp8 r1 = new zp8
            android.net.Uri r14 = r6.m
            r8 = r1
            r16 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ft7.g(ir8, android.graphics.Bitmap):zp8");
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [jk3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v0, types: [qq8, sq8] */
    public static ir8 h(zp8 zp8) {
        zp8.getClass();
        oq8 oq8 = new oq8();
        lx5 lx5 = tb7.b;
        k0d k0d = k0d.v;
        Collections.emptyList();
        uq8 uq8 = new uq8();
        ar8 ar8 = ar8.d;
        String str = zp8.a;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        ? obj = new Object();
        obj.a = zp8.y;
        ar8 ar82 = new ar8(obj);
        us8 j = j(zp8, 0);
        ? qq8 = new qq8(oq8);
        wq8 wq8 = new wq8(uq8);
        if (j == null) {
            j = us8.J;
        }
        return new ir8(str2, qq8, (xq8) null, wq8, j, ar82);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [qq8, sq8] */
    /* JADX WARNING: type inference failed for: r2v1, types: [jk3, java.lang.Object] */
    public static ir8 i(String str, vs8 vs8, int i) {
        ar8 ar8;
        oq8 oq8 = new oq8();
        lx5 lx5 = tb7.b;
        k0d k0d = k0d.v;
        Collections.emptyList();
        k0d k0d2 = k0d.v;
        uq8 uq8 = new uq8();
        ar8 ar82 = ar8.d;
        String str2 = null;
        if (str == null) {
            str = null;
        }
        CharSequence charSequence = vs8.a.getCharSequence(MediaMetadataCompat.METADATA_KEY_MEDIA_URI);
        if (charSequence != null) {
            str2 = charSequence.toString();
        }
        if (str2 != null) {
            ? obj = new Object();
            obj.a = Uri.parse(str2);
            ar8 = new ar8(obj);
        } else {
            ar8 = ar82;
        }
        us8 k = k(vs8, i);
        if (str == null) {
            str = "";
        }
        return new ir8(str, new qq8(oq8), (xq8) null, new wq8(uq8), k != null ? k : us8.J, ar8);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ss8, java.lang.Object] */
    public static us8 j(zp8 zp8, int i) {
        upc upc;
        byte[] bArr;
        if (zp8 == null) {
            return us8.J;
        }
        ? obj = new Object();
        obj.f = zp8.c;
        obj.g = zp8.o;
        obj.m = zp8.w;
        Bundle bundle = null;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                upc = new upc(i, -1.0f);
                break;
            default:
                upc = null;
                break;
        }
        obj.i = q(upc);
        Bitmap bitmap = zp8.v;
        if (bitmap != null) {
            try {
                bArr = b(bitmap);
            } catch (IOException e) {
                i8b.W("Failed to convert iconBitmap to artworkData", e);
                bArr = null;
            }
            obj.f(bArr, 3);
        }
        Bundle bundle2 = zp8.x;
        if (bundle2 != null) {
            bundle = new Bundle(bundle2);
        }
        if (bundle != null && bundle.containsKey(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE)) {
            obj.p = Integer.valueOf(f(bundle.getLong(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE)));
            bundle.remove(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE);
        }
        obj.q = Boolean.FALSE;
        if (bundle != null && bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            obj.G = Integer.valueOf((int) bundle.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        CharSequence charSequence = zp8.b;
        if (bundle == null || !bundle.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            obj.a = charSequence;
        } else {
            obj.a = bundle.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            obj.e = charSequence;
            bundle.remove("androidx.media3.mediadescriptioncompat.title");
        }
        if (bundle != null && !bundle.isEmpty()) {
            obj.H = bundle;
        }
        obj.r = Boolean.TRUE;
        return new us8(obj);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ss8, java.lang.Object] */
    public static us8 k(vs8 vs8, int i) {
        upc upc;
        upc upc2;
        String str;
        upc upc3;
        if (vs8 == null) {
            return us8.J;
        }
        ? obj = new Object();
        Bundle bundle = vs8.a;
        CharSequence charSequence = bundle.getCharSequence(MediaMetadataCompat.METADATA_KEY_TITLE);
        CharSequence charSequence2 = bundle.getCharSequence(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE);
        obj.a = charSequence != null ? charSequence : charSequence2;
        Bitmap bitmap = null;
        if (charSequence == null) {
            charSequence2 = null;
        }
        obj.e = charSequence2;
        obj.f = bundle.getCharSequence(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE);
        obj.g = bundle.getCharSequence(MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION);
        obj.b = bundle.getCharSequence(MediaMetadataCompat.METADATA_KEY_ARTIST);
        obj.c = bundle.getCharSequence(MediaMetadataCompat.METADATA_KEY_ALBUM);
        obj.d = bundle.getCharSequence(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST);
        try {
            upc = upc.a(bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_RATING));
        } catch (Exception unused) {
            upc = null;
        }
        obj.j = q(upc);
        if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_DURATION)) {
            long a2 = vs8.a(MediaMetadataCompat.METADATA_KEY_DURATION);
            if (a2 >= 0) {
                obj.i(Long.valueOf(a2));
            }
        }
        try {
            upc2 = upc.a(bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_USER_RATING));
        } catch (Exception unused2) {
            upc2 = null;
        }
        rpc q = q(upc2);
        if (q != null) {
            obj.i = q;
        } else {
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    upc3 = new upc(i, -1.0f);
                    break;
                default:
                    upc3 = null;
                    break;
            }
            obj.i = q(upc3);
        }
        if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_YEAR)) {
            obj.s = Integer.valueOf((int) vs8.a(MediaMetadataCompat.METADATA_KEY_YEAR));
        }
        String[] strArr = {MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI};
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 < 2) {
                String str2 = strArr[i3];
                if (bundle.containsKey(str2)) {
                    CharSequence charSequence3 = bundle.getCharSequence(str2);
                    if (charSequence3 != null) {
                        str = charSequence3.toString();
                    }
                } else {
                    i3++;
                }
            }
        }
        str = null;
        if (str != null) {
            obj.m = Uri.parse(str);
        }
        String[] strArr2 = {MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, MediaMetadataCompat.METADATA_KEY_ALBUM_ART};
        while (true) {
            if (i2 < 2) {
                String str3 = strArr2[i2];
                if (bundle.containsKey(str3)) {
                    try {
                        bitmap = (Bitmap) bundle.getParcelable(str3);
                    } catch (Exception unused3) {
                    }
                } else {
                    i2++;
                }
            }
        }
        if (bitmap != null) {
            try {
                obj.f(b(bitmap), 3);
            } catch (IOException e) {
                i8b.W("Failed to convert artworkBitmap to artworkData", e);
            }
        }
        boolean containsKey = bundle.containsKey(MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE);
        obj.q = Boolean.valueOf(containsKey);
        if (containsKey) {
            obj.p = Integer.valueOf(f(vs8.a(MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE)));
        }
        if (bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            obj.G = Integer.valueOf((int) vs8.a("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
        }
        obj.r = Boolean.TRUE;
        Bundle bundle2 = new Bundle(bundle);
        wvf m = a.iterator();
        while (m.hasNext()) {
            bundle2.remove((String) m.next());
        }
        if (!bundle2.isEmpty()) {
            obj.H = bundle2;
        }
        return new us8(obj);
    }

    public static vs8 l(us8 us8, String str, Uri uri, long j, Bitmap bitmap) {
        Long l;
        b8d b8d = new b8d(24);
        b8d.y(MediaMetadataCompat.METADATA_KEY_MEDIA_ID, str);
        CharSequence charSequence = us8.a;
        if (charSequence != null) {
            b8d.z(charSequence, MediaMetadataCompat.METADATA_KEY_TITLE);
        }
        CharSequence charSequence2 = us8.e;
        if (charSequence2 != null) {
            b8d.z(charSequence2, MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE);
        }
        CharSequence charSequence3 = us8.f;
        if (charSequence3 != null) {
            b8d.z(charSequence3, MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE);
        }
        CharSequence charSequence4 = us8.g;
        if (charSequence4 != null) {
            b8d.z(charSequence4, MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION);
        }
        CharSequence charSequence5 = us8.b;
        if (charSequence5 != null) {
            b8d.z(charSequence5, MediaMetadataCompat.METADATA_KEY_ARTIST);
        }
        CharSequence charSequence6 = us8.c;
        if (charSequence6 != null) {
            b8d.z(charSequence6, MediaMetadataCompat.METADATA_KEY_ALBUM);
        }
        CharSequence charSequence7 = us8.d;
        if (charSequence7 != null) {
            b8d.z(charSequence7, MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST);
        }
        Integer num = us8.t;
        if (num != null) {
            b8d.w((long) num.intValue(), MediaMetadataCompat.METADATA_KEY_YEAR);
        }
        if (uri != null) {
            b8d.y(MediaMetadataCompat.METADATA_KEY_MEDIA_URI, uri.toString());
        }
        Uri uri2 = us8.m;
        if (uri2 != null) {
            b8d.y(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, uri2.toString());
            b8d.y(MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, uri2.toString());
        }
        if (bitmap != null) {
            b8d.v(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, bitmap);
            b8d.v(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, bitmap);
        }
        Integer num2 = us8.p;
        if (!(num2 == null || num2.intValue() == -1)) {
            b8d.w(e(num2.intValue()), MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE);
        }
        if (j == -9223372036854775807L && (l = us8.h) != null) {
            j = l.longValue();
        }
        if (j != -9223372036854775807L) {
            b8d.w(j, MediaMetadataCompat.METADATA_KEY_DURATION);
        }
        upc r = r(us8.i);
        if (r != null) {
            b8d.x(MediaMetadataCompat.METADATA_KEY_USER_RATING, r);
        }
        upc r2 = r(us8.j);
        if (r2 != null) {
            b8d.x(MediaMetadataCompat.METADATA_KEY_RATING, r2);
        }
        Integer num3 = us8.H;
        if (num3 != null) {
            b8d.w((long) num3.intValue(), "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        Bundle bundle = us8.I;
        if (bundle != null) {
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (obj == null || (obj instanceof CharSequence)) {
                    b8d.z((CharSequence) obj, next);
                } else if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                    b8d.w(((Number) obj).longValue(), next);
                }
            }
        }
        return new vs8((Bundle) b8d.a);
    }

    public static PlaybackException m(mob mob) {
        String str = null;
        if (mob == null || mob.a != 7) {
            return null;
        }
        CharSequence charSequence = mob.x;
        if (charSequence != null) {
            str = charSequence.toString();
        }
        String str2 = str;
        int t = t(mob.w);
        if (t == -5) {
            t = 2000;
        } else if (t == -1) {
            t = 1000;
        }
        int i = t;
        Bundle bundle = mob.Y;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        return new PlaybackException(str2, (Throwable) null, i, bundle, SystemClock.elapsedRealtime());
    }

    public static int n(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i8b.V("Unrecognized RepeatMode: " + i + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
                return 0;
            }
        }
        return i2;
    }

    public static int o(ypb ypb) {
        if (ypb.N() != null) {
            return 7;
        }
        int playbackState = ypb.getPlaybackState();
        boolean c0 = v0g.c0(ypb, true);
        if (playbackState == 1) {
            return 0;
        }
        if (playbackState == 2) {
            return c0 ? 2 : 6;
        }
        if (playbackState == 3) {
            return c0 ? 2 : 3;
        }
        if (playbackState == 4) {
            return 1;
        }
        throw new IllegalArgumentException(wj6.h(playbackState, "Unrecognized State: "));
    }

    public static long p(int i) {
        if (i == -1) {
            return -1;
        }
        return (long) i;
    }

    public static rpc q(upc upc) {
        if (upc == null) {
            return null;
        }
        boolean z = true;
        boolean z2 = false;
        float f = upc.b;
        int i = upc.a;
        switch (i) {
            case 1:
                if (!upc.c()) {
                    return new xx6();
                }
                if (i == 1) {
                    if (f != 1.0f) {
                        z = false;
                    }
                    z2 = z;
                }
                return new xx6(z2);
            case 2:
                if (!upc.c()) {
                    return new zif();
                }
                if (i == 2) {
                    if (f != 1.0f) {
                        z = false;
                    }
                    z2 = z;
                }
                return new zif(z2);
            case 3:
                return upc.c() ? new fje(3, upc.b()) : new fje(3);
            case 4:
                return upc.c() ? new fje(4, upc.b()) : new fje(4);
            case 5:
                return upc.c() ? new fje(5, upc.b()) : new fje(5);
            case 6:
                if (!upc.c()) {
                    return new sbb();
                }
                if (i != 6 || !upc.c()) {
                    f = -1.0f;
                }
                return new sbb(f);
            default:
                return null;
        }
    }

    public static upc r(rpc rpc) {
        if (rpc == null) {
            return null;
        }
        int x = x(rpc);
        if (!rpc.b()) {
            switch (x) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return new upc(x, -1.0f);
                default:
                    return null;
            }
        } else {
            float f = 1.0f;
            switch (x) {
                case 1:
                    if (!((xx6) rpc).c) {
                        f = 0.0f;
                    }
                    return new upc(1, f);
                case 2:
                    if (!((zif) rpc).c) {
                        f = 0.0f;
                    }
                    return new upc(2, f);
                case 3:
                case 4:
                case 5:
                    return upc.d(((fje) rpc).c, x);
                case 6:
                    float f2 = ((sbb) rpc).b;
                    if (f2 < c44.DEFAULT_ASPECT_RATIO || f2 > 100.0f) {
                        return null;
                    }
                    return new upc(6, f2);
                default:
                    return null;
            }
        }
    }

    public static int s(int i) {
        if (i == -1 || i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (!(i == 2 || i == 3)) {
                i8b.V("Unrecognized PlaybackStateCompat.RepeatMode: " + i + " was converted to `Player.REPEAT_MODE_OFF`");
                return 0;
            }
        }
        return i2;
    }

    public static int t(int i) {
        switch (i) {
            case 1:
                return -2;
            case 2:
                return -6;
            case 3:
                return -102;
            case 4:
                return -103;
            case 5:
                return -104;
            case 6:
                return -105;
            case 7:
                return -106;
            case 8:
                return -110;
            case 9:
                return -107;
            case 10:
                return 1;
            case 11:
                return -109;
            default:
                return -1;
        }
    }

    public static boolean u(int i) {
        if (i == -1 || i == 0) {
            return false;
        }
        if (i == 1 || i == 2) {
            return true;
        }
        throw new IllegalArgumentException(wj6.h(i, "Unrecognized ShuffleMode: "));
    }

    public static void v(zz7 zz7) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long j = 3000;
        while (true) {
            try {
                zz7.get(j, TimeUnit.MILLISECONDS);
                if (z) {
                    Thread.currentThread().interrupt();
                    return;
                }
                return;
            } catch (InterruptedException unused) {
                z = true;
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                if (elapsedRealtime2 < CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS) {
                    j = CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS - elapsedRealtime2;
                } else {
                    throw new TimeoutException();
                }
            } catch (Throwable th) {
                if (1 != 0) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
    }

    public static int w(i30 i30) {
        int i = 1;
        int i2 = k30.b;
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setContentType(i30.a);
        builder.setFlags(i30.b);
        builder.setUsage(i30.c);
        AudioAttributes build = builder.build();
        build.getClass();
        int flags = build.getFlags();
        int usage = build.getUsage();
        if ((flags & 1) != 1) {
            if ((flags & 4) != 4) {
                switch (usage) {
                    case 2:
                        i = 0;
                        break;
                    case 3:
                        i = 8;
                        break;
                    case 4:
                        i = 4;
                        break;
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        i = 5;
                        break;
                    case 6:
                        i = 2;
                        break;
                    case 11:
                        i = 10;
                        break;
                    case 13:
                        break;
                    default:
                        i = 3;
                        break;
                }
            } else {
                i = 6;
            }
        } else {
            i = 7;
        }
        if (i == Integer.MIN_VALUE) {
            return 3;
        }
        return i;
    }

    public static int x(rpc rpc) {
        if (rpc instanceof xx6) {
            return 1;
        }
        if (rpc instanceof zif) {
            return 2;
        }
        if (!(rpc instanceof fje)) {
            return rpc instanceof sbb ? 6 : 0;
        }
        int i = ((fje) rpc).b;
        int i2 = 3;
        if (i != 3) {
            i2 = 4;
            if (i != 4) {
                i2 = 5;
                if (i != 5) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public static boolean y(long j, long j2) {
        return (j & j2) != 0;
    }
}

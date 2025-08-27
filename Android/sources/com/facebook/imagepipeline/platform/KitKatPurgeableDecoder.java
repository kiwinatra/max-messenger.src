package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;

@cr4
@TargetApi(19)
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {
    public final zq5 c;

    @cr4
    public KitKatPurgeableDecoder(zq5 zq5) {
        this.c = zq5;
    }

    public final Bitmap b(y33 y33, BitmapFactory.Options options) {
        e69 e69 = (e69) y33.e0();
        int V = e69.V();
        jd4 a = this.c.a(V);
        try {
            byte[] bArr = (byte[]) a.e0();
            e69.U(0, 0, V, bArr);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, V, options);
            cvg.p(decodeByteArray, "BitmapFactory returned null");
            return decodeByteArray;
        } finally {
            y33.U(a);
        }
    }

    public final Bitmap c(y33 y33, int i, BitmapFactory.Options options) {
        byte[] bArr = DalvikPurgeableDecoder.d(i, y33) ? null : DalvikPurgeableDecoder.b;
        e69 e69 = (e69) y33.e0();
        if (i <= e69.V()) {
            int i2 = i + 2;
            jd4 a = this.c.a(i2);
            try {
                byte[] bArr2 = (byte[]) a.e0();
                e69.U(0, 0, i, bArr2);
                if (bArr != null) {
                    bArr2[i] = -1;
                    bArr2[i + 1] = -39;
                    i = i2;
                }
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, i, options);
                cvg.p(decodeByteArray, "BitmapFactory returned null");
                return decodeByteArray;
            } finally {
                y33.U(a);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}

package defpackage;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* renamed from: ov6  reason: default package */
public final class ov6 {
    public static final byte[] g = {0, 0, 1};
    public static final byte[] h = {0, 0, 1};
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public Object f;

    public /* synthetic */ ov6(int i) {
        this.a = i;
    }

    public void a(Drawable drawable) {
        if (drawable != null) {
            int i = this.c;
            if (i != -1) {
                drawable.setAlpha(i);
            }
            if (this.b) {
                drawable.setColorFilter((ColorFilter) this.f);
            }
            int i2 = this.d;
            boolean z = false;
            if (i2 != -1) {
                drawable.setDither(i2 != 0);
            }
            int i3 = this.e;
            if (i3 != -1) {
                if (i3 != 0) {
                    z = true;
                }
                drawable.setFilterBitmap(z);
            }
        }
    }

    public void b(int i, byte[] bArr, int i2) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    int i3 = i2 - i;
                    byte[] bArr2 = (byte[]) this.f;
                    int length = bArr2.length;
                    int i4 = this.d;
                    if (length < i4 + i3) {
                        this.f = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                    }
                    System.arraycopy(bArr, i, (byte[]) this.f, this.d, i3);
                    this.d += i3;
                    return;
                }
                return;
            default:
                if (this.b) {
                    int i5 = i2 - i;
                    byte[] bArr3 = (byte[]) this.f;
                    int length2 = bArr3.length;
                    int i6 = this.d;
                    if (length2 < i6 + i5) {
                        this.f = Arrays.copyOf(bArr3, (i6 + i5) * 2);
                    }
                    System.arraycopy(bArr, i, (byte[]) this.f, this.d, i5);
                    this.d += i5;
                    return;
                }
                return;
        }
    }

    public ov6() {
        this.a = 2;
        this.c = -1;
        this.d = -1;
        this.e = -1;
    }
}

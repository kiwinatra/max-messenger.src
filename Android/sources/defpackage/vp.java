package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: vp  reason: default package */
public final class vp extends m58 {
    public final /* synthetic */ int k;

    public /* synthetic */ vp(int i) {
        this.k = i;
    }

    public static c95 N(l8b l8b) {
        String p = l8b.p();
        p.getClass();
        String p2 = l8b.p();
        p2.getClass();
        return new c95(p, p2, l8b.o(), l8b.o(), Arrays.copyOfRange(l8b.a, l8b.b, l8b.c));
    }

    public final sp9 l(xp9 xp9, ByteBuffer byteBuffer) {
        int i = 2;
        switch (this.k) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                ky1 ky1 = new ky1(byteBuffer.array(), (byte) 0, byteBuffer.limit(), 2);
                int i2 = 12;
                ky1.t(12);
                int f = (ky1.f() + ky1.i(12)) - 4;
                ky1.t(44);
                ky1.u(ky1.i(12));
                ky1.t(16);
                ArrayList arrayList = new ArrayList();
                while (ky1.f() < f) {
                    ky1.t(48);
                    int i3 = ky1.i(8);
                    ky1.t(4);
                    int f2 = ky1.f() + ky1.i(i2);
                    String str = null;
                    String str2 = null;
                    while (ky1.f() < f2) {
                        int i4 = ky1.i(8);
                        int i5 = ky1.i(8);
                        int f3 = ky1.f() + i5;
                        if (i4 == i) {
                            int i6 = ky1.i(16);
                            ky1.t(8);
                            if (i6 == 3) {
                                while (ky1.f() < f3) {
                                    int i7 = ky1.i(8);
                                    Charset charset = x22.a;
                                    byte[] bArr = new byte[i7];
                                    ky1.l(i7, bArr);
                                    String str3 = new String(bArr, charset);
                                    int i8 = ky1.i(8);
                                    for (int i9 = 0; i9 < i8; i9++) {
                                        ky1.u(ky1.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i4 == 21) {
                            Charset charset2 = x22.a;
                            byte[] bArr2 = new byte[i5];
                            ky1.l(i5, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        ky1.q(f3 * 8);
                        i = 2;
                    }
                    ky1.q(f2 * 8);
                    if (!(str == null || str2 == null)) {
                        arrayList.add(new tp(i3, str.concat(str2)));
                    }
                    i = 2;
                    i2 = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new sp9((List) arrayList);
            default:
                return new sp9(N(new l8b(byteBuffer.limit(), byteBuffer.array())));
        }
    }
}

package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: up  reason: default package */
public final class up extends kr7 {
    public final /* synthetic */ int Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ up(int i) {
        super(19);
        this.Z = i;
    }

    public static b95 T(g1g g1g) {
        String q = g1g.q();
        q.getClass();
        String q2 = g1g.q();
        q2.getClass();
        return new b95(q, q2, g1g.p(), g1g.p(), Arrays.copyOfRange(g1g.a, g1g.b, g1g.c));
    }

    public final rp9 p(wp9 wp9, ByteBuffer byteBuffer) {
        switch (this.Z) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                ky1 ky1 = new ky1(byteBuffer.array(), (byte) 0, byteBuffer.limit(), 1);
                int i = 12;
                ky1.t(12);
                int f = (ky1.f() + ky1.i(12)) - 4;
                ky1.t(44);
                ky1.u(ky1.i(12));
                ky1.t(16);
                ArrayList arrayList = new ArrayList();
                while (ky1.f() < f) {
                    ky1.t(48);
                    int i2 = ky1.i(8);
                    ky1.t(4);
                    int f2 = ky1.f() + ky1.i(i);
                    String str = null;
                    String str2 = null;
                    while (ky1.f() < f2) {
                        int i3 = ky1.i(8);
                        int i4 = ky1.i(8);
                        int f3 = ky1.f() + i4;
                        if (i3 == 2) {
                            int i5 = ky1.i(16);
                            ky1.t(8);
                            if (i5 == 3) {
                                while (ky1.f() < f3) {
                                    int i6 = ky1.i(8);
                                    Charset charset = x22.a;
                                    byte[] bArr = new byte[i6];
                                    ky1.l(i6, bArr);
                                    String str3 = new String(bArr, charset);
                                    int i7 = ky1.i(8);
                                    for (int i8 = 0; i8 < i7; i8++) {
                                        ky1.u(ky1.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i3 == 21) {
                            Charset charset2 = x22.a;
                            byte[] bArr2 = new byte[i4];
                            ky1.l(i4, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        ky1.q(f3 * 8);
                    }
                    ky1.q(f2 * 8);
                    if (!(str == null || str2 == null)) {
                        arrayList.add(new sp(i2, str2.length() != 0 ? str.concat(str2) : new String(str)));
                    }
                    i = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new rp9((List) arrayList);
            default:
                return new rp9(T(new g1g(byteBuffer.limit(), byteBuffer.array())));
        }
    }
}

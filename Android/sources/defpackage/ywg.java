package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ywg  reason: default package */
public enum ywg {
    RESPONSE_CODE_UNSPECIFIED(-999);
    
    public static final kyg c = null;
    public final int a;

    static {
        cs csVar = new cs(20, (byte) 0);
        csVar.c = new Object[8];
        csVar.b = 0;
        for (ywg ywg : values()) {
            Integer valueOf = Integer.valueOf(ywg.a);
            int i = csVar.b + 1;
            Object[] objArr = (Object[]) csVar.c;
            int length = objArr.length;
            int i2 = i + i;
            if (i2 > length) {
                int i3 = length + (length >> 1) + 1;
                if (i3 < i2) {
                    int highestOneBit = Integer.highestOneBit(i2 - 1);
                    i3 = highestOneBit + highestOneBit;
                }
                if (i3 < 0) {
                    i3 = IntCompanionObject.MAX_VALUE;
                }
                csVar.c = Arrays.copyOf(objArr, i3);
            }
            Object[] objArr2 = (Object[]) csVar.c;
            int i4 = csVar.b;
            int i5 = i4 + i4;
            objArr2[i5] = valueOf;
            objArr2[i5 + 1] = ywg;
            csVar.b = i4 + 1;
        }
        vxg vxg = (vxg) csVar.o;
        if (vxg == null) {
            kyg a2 = kyg.a(csVar.b, (Object[]) csVar.c, csVar);
            vxg vxg2 = (vxg) csVar.o;
            if (vxg2 == null) {
                c = a2;
                return;
            }
            throw vxg2.a();
        }
        throw vxg.a();
    }

    /* access modifiers changed from: public */
    ywg(int i) {
        this.a = i;
    }
}

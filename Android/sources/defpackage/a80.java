package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* renamed from: a80  reason: default package */
public final class a80 {
    public final ArrayList a = new ArrayList();
    public final xme b;
    public final etc c;

    public a80() {
        xme a2 = f6e.a((Object) null);
        this.b = a2;
        this.c = new etc(a2);
    }

    public final void a() {
        byte[] bArr;
        ArrayList arrayList = this.a;
        if (arrayList == null || arrayList.isEmpty()) {
            bArr = null;
        } else {
            bArr = new byte[arrayList.size()];
            int i = 0;
            for (Object next : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                bArr[i] = (byte) ((((Number) next).intValue() * 127) / 32768);
                i = i2;
            }
        }
        this.b.setValue(bArr);
    }
}

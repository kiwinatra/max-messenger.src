package defpackage;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: ak3  reason: default package */
public final class ak3 implements Serializable {
    public final Object a;

    public ak3(String str) {
        this.a = str;
    }

    public int a() {
        int i = 0;
        for (List size : ((LinkedHashMap) this.a).values()) {
            i += size.size();
        }
        return i;
    }

    public ak3(g85 g85) {
        this.a = g85.a;
    }

    public ak3(String str, a00 a00, String str2, String str3, mc8 mc8, boolean z, ck3 ck3) {
        this.a = ck3;
    }

    public ak3() {
        this.a = new LinkedHashMap();
    }
}

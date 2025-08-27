package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: rp2  reason: default package */
public final class rp2 {
    public final List a;
    public final long b;
    public final Long c;

    public rp2(no5 no5) {
        this.a = (List) no5.b;
        this.b = no5.a;
        this.c = (Long) no5.c;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [no5, java.lang.Object] */
    public static rp2 a(pf9 pf9) {
        int e0 = ryg.e0(pf9);
        if (e0 == 0) {
            return null;
        }
        ? obj = new Object();
        ArrayList arrayList = new ArrayList(kl2.v);
        for (int i = 0; i < e0; i++) {
            String A0 = pf9.A0();
            A0.getClass();
            char c2 = 65535;
            switch (A0.hashCode()) {
                case -246214960:
                    if (A0.equals("dontDisturbUntil")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 107019:
                    if (A0.equals("led")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3619395:
                    if (A0.equals("vibr")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 109627663:
                    if (A0.equals("sound")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1015572087:
                    if (A0.equals("favIndex")) {
                        c2 = 4;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    obj.a = pf9.x0();
                    break;
                case 1:
                    if (!pf9.v0()) {
                        break;
                    } else {
                        arrayList.add(kl2.LED);
                        break;
                    }
                case 2:
                    if (!pf9.v0()) {
                        break;
                    } else {
                        arrayList.add(kl2.VIBRATION);
                        break;
                    }
                case 3:
                    if (!pf9.v0()) {
                        break;
                    } else {
                        arrayList.add(kl2.SOUND);
                        break;
                    }
                case 4:
                    obj.c = Long.valueOf(ryg.d0(pf9, 0));
                    break;
                default:
                    pf9.A();
                    break;
            }
        }
        obj.b = arrayList;
        return new rp2(obj);
    }

    public final String toString() {
        Long l = this.c;
        String l2 = l != null ? l.toString() : "null";
        return "ChatSettings{options=" + this.a + ", dontDisturbUntil=" + this.b + ", favoriteIndex = " + l2 + "}";
    }
}

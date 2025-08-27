package defpackage;

import java.util.Map;

/* renamed from: yf4  reason: default package */
public final /* synthetic */ class yf4 implements msb {
    public final /* synthetic */ int a;

    public /* synthetic */ yf4(int i) {
        this.a = i;
    }

    public final boolean apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((String) obj) != null;
            case 1:
                return ((Map.Entry) obj).getKey() != null;
            case 2:
                return ((Map.Entry) obj).getKey() != null;
            default:
                return ((String) obj) != null;
        }
    }
}

package defpackage;

import java.util.Map;

/* renamed from: bp7  reason: default package */
public final /* synthetic */ class bp7 implements dha {
    public final /* synthetic */ int a;

    public /* synthetic */ bp7(int i) {
        this.a = i;
    }

    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                eha eha = (eha) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                eha eha2 = (eha) obj2;
                eha2.a(w8c.g, entry.getKey());
                eha2.a(w8c.h, entry.getValue());
                return;
            default:
                eha eha3 = (eha) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}

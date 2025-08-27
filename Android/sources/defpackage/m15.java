package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: m15  reason: default package */
public enum m15 {
    RECENT(-1, new igf(ava.l), cad.d2),
    CLASSIC(0, new igf(ava.b), cad.b1),
    ANIMOJI(9, ngf.a, 0);
    
    public static final js9 o = null;
    public final int a;
    public final ngf b;
    public final int c;

    /* JADX WARNING: type inference failed for: r0v14, types: [js9, java.lang.Object] */
    static {
        m15[] m15Arr;
        z = EnumEntriesKt.enumEntries((E[]) m15Arr);
        o = new Object();
    }

    /* access modifiers changed from: public */
    m15(int i, ngf ngf, int i2) {
        this.a = i;
        this.b = ngf;
        this.c = i2;
    }
}

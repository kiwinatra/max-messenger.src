package defpackage;

/* renamed from: ch4  reason: default package */
public final /* synthetic */ class ch4 implements s2f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ch4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                try {
                    return (lz8) ((Class) this.b).getConstructor((Class[]) null).newInstance((Object[]) null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            case 1:
                return (sg4) this.b;
            case 2:
                return (lz8) this.b;
            case 3:
                return (pe8) this.b;
            case 4:
                return (oe8) this.b;
            case 5:
                return (ebf) this.b;
            case 6:
                return (t1d) this.b;
            case 7:
                return (tg4) this.b;
            default:
                return Boolean.valueOf(((fd5) this.b).J0);
        }
    }
}

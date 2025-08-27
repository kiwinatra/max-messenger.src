package defpackage;

/* renamed from: zzg  reason: default package */
public abstract class zzg {
    public static final yzg a = new Object();
    public static final yzg b;

    /* JADX WARNING: type inference failed for: r0v0, types: [yzg, java.lang.Object] */
    static {
        yzg yzg = null;
        try {
            yzg = (yzg) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
        }
        b = yzg;
    }
}

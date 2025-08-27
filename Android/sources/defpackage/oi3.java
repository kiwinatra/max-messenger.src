package defpackage;

import org.conscrypt.Conscrypt;

/* renamed from: oi3  reason: default package */
public abstract class oi3 {
    public static boolean a() {
        Conscrypt.Version version = Conscrypt.version();
        return version.major() != 2 ? version.major() > 2 : version.minor() != 1 ? version.minor() > 1 : version.patch() >= 0;
    }

    public static boolean b() {
        return qi3.d;
    }
}

package defpackage;

import java.util.Objects;

/* renamed from: ozg  reason: default package */
public final class ozg extends ClassLoader {
    public final Class loadClass(String str, boolean z) {
        return Objects.equals(str, "com.google.android.gms.iid.MessengerCompat") ? k0h.class : super.loadClass(str, z);
    }
}

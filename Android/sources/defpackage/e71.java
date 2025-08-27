package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;

/* renamed from: e71  reason: default package */
public final class e71 extends kbe {
    public final er7 D0;
    public final Lazy E0 = LazyKt.lazy(LazyThreadSafetyMode.NONE, new j6(19, this));

    public e71(kl3 kl3, er7 er7) {
        super(kl3);
        this.D0 = er7;
    }

    /* renamed from: P */
    public final void M(uz6 uz6) {
        kl3 kl3 = (kl3) this.a;
        kl3.setId(Long.hashCode(uz6.Z));
        kl3.setTitle(uz6.w);
        boolean z = uz6.Y instanceof jz6;
        long j = uz6.b;
        if (z) {
            kl3.R(j, (CharSequence) null, (String) null);
            kl3.setAvatarOverlay((be0) this.E0.getValue());
        } else {
            kl3.setAvatarOverlay((be0) null);
            String str = uz6.o;
            if (str == null) {
                str = "";
            }
            kl3.R(j, uz6.c, str);
        }
        kl3.setDescription(uz6.z);
        kl3.setTime(uz6.x);
        kl3.Q(uz6.y);
        hz6.a.getClass();
        hz6 hz6 = hz6.b;
        boolean z2 = false;
        hz6 hz62 = uz6.X;
        kl3.O(hz62 == hz6);
        if (hz62 == hz6.c) {
            z2 = true;
        }
        kl3.P(z2);
        kl3.P0 = uz6.a;
        kl3.N0 = this.D0;
    }
}

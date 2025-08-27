package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    @Keep
    public List<mb3> getComponents() {
        pac pac = new pac(msf.class, osf.class);
        boolean z = false;
        dr8 dr8 = new dr8(FirebaseMessaging.class, new Class[0]);
        dr8.b = LIBRARY_NAME;
        dr8.a(bm4.a(hp5.class));
        dr8.a(new bm4(0, 0, np5.class));
        dr8.a(new bm4(0, 1, tj4.class));
        dr8.a(new bm4(0, 1, ux6.class));
        dr8.a(bm4.a(mp5.class));
        dr8.a(new bm4(pac, 0, 1));
        dr8.a(bm4.a(qye.class));
        dr8.f = new nf4(pac, 1);
        if (dr8.d == 0) {
            z = true;
        }
        if (z) {
            dr8.d = 1;
            return Arrays.asList(new mb3[]{dr8.b(), m5a.p(LIBRARY_NAME, "24.0.1")});
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}

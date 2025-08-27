package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public List<mb3> getComponents() {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        Class<osf> cls = osf.class;
        hashSet.add(pac.a(cls));
        for (Class cls2 : new Class[0]) {
            q8.c(cls2, "Null interface");
            hashSet.add(pac.a(cls2));
        }
        Class<Context> cls3 = Context.class;
        bm4 a = bm4.a(cls3);
        if (!hashSet.contains(a.a)) {
            hashSet2.add(a);
            mb3 mb3 = new mb3(LIBRARY_NAME, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new xff(22), hashSet3);
            dr8 a2 = mb3.a(new pac(rt7.class, cls));
            a2.a(bm4.a(cls3));
            a2.f = new xff(23);
            mb3 b = a2.b();
            dr8 a3 = mb3.a(new pac(msf.class, cls));
            a3.a(bm4.a(cls3));
            a3.f = new xff(24);
            return Arrays.asList(new mb3[]{mb3, b, a3.b(), m5a.p(LIBRARY_NAME, "18.2.0")});
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }
}

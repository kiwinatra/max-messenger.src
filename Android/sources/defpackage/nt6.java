package defpackage;

import android.content.Context;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: nt6  reason: default package */
public final class nt6 {
    public static void a(Context context, i68 i68) {
        int i = h68.a;
        ct6 ct6 = new ct6(context, swg.Z, (pl) pl.d, bt6.c);
        ArrayList arrayList = new ArrayList();
        LocationRequest locationRequest = new LocationRequest();
        iq.i0(100);
        locationRequest.a = 100;
        arrayList.add(locationRequest);
        j68 j68 = new j68(arrayList, false, false);
        ur0 ur0 = new ur0();
        ur0.c = true;
        ur0.d = new yu9(17, (Object) j68);
        ur0.b = 2426;
        s7h c = ct6.c(0, ur0.a());
        c.i(new mt6(i68));
        Objects.requireNonNull(i68);
        c.c(xdf.a, new mt6(i68));
    }
}

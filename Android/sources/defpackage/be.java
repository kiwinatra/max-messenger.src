package defpackage;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.util.Pair;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: be  reason: default package */
public final class be implements taf {
    public static final Address b = new Address(Locale.ROOT);
    public static final Map c = Collections.synchronizedMap(new wi6(100, 0));
    public final Lazy a;

    public be(Context context, Lazy lazy) {
        this.a = LazyKt.lazy(new ae(context, lazy));
    }

    public static String a(Address address, String str, Address address2) {
        if (address2 == null) {
            return str;
        }
        String locality = address.getLocality();
        return (!e(locality) && !cvg.c(locality, address2.getLocality())) ? g63.i(locality, ", ", str) : str;
    }

    public static String b(Address address, String str, Address address2) {
        if (address2 == null) {
            return str;
        }
        String countryName = address.getCountryName();
        return (!e(countryName) && !cvg.c(countryName, address2.getCountryName())) ? g63.i(countryName, ", ", str) : str;
    }

    public static boolean e(String str) {
        return cvg.A(str) || cvg.c(str, "Unnamed Road") || cvg.c(str, "Null");
    }

    public final String c(double d, double d2, double d3, double d4) {
        Address d5 = d(d, d2);
        String str = "";
        if (d5 == null) {
            return str;
        }
        Address d6 = d(d3, d4);
        String thoroughfare = d5.getThoroughfare();
        if (e(thoroughfare)) {
            thoroughfare = null;
        } else {
            String subThoroughfare = d5.getSubThoroughfare();
            if (!e(subThoroughfare)) {
                thoroughfare = g63.i(thoroughfare, ", ", subThoroughfare);
            }
        }
        if (!e(thoroughfare)) {
            return ghf.e(b(d5, a(d5, thoroughfare, d6), d6));
        }
        String featureName = d5.getFeatureName();
        if (!e(featureName) && !featureName.matches("\\d+")) {
            return ghf.e(b(d5, a(d5, featureName, d6), d6));
        }
        String locality = d5.getLocality();
        if (!e(locality)) {
            return ghf.e(b(d5, locality, d6));
        }
        String adminArea = d5.getAdminArea();
        if (!e(adminArea)) {
            return ghf.e(b(d5, adminArea, d6));
        }
        String countryName = d5.getCountryName();
        if (!e(countryName)) {
            return ghf.e(countryName);
        }
        if (d5.getMaxAddressLineIndex() != -1) {
            str = d5.getAddressLine(0);
        }
        if (!e(str)) {
            return str;
        }
        String countryName2 = d5.getCountryName();
        if (!cvg.A(countryName2)) {
            str = countryName2;
        }
        String locality2 = d5.getLocality();
        return cvg.A(locality2) ? str : cvg.A(countryName2) ? locality2 : g63.i(str, ", ", locality2);
    }

    public final Address d(double d, double d2) {
        if (d == 0.0d && d2 == 0.0d) {
            return null;
        }
        Pair pair = new Pair(Double.valueOf(d), Double.valueOf(d2));
        Map map = c;
        Address address = (Address) map.get(pair);
        Address address2 = b;
        if (address == address2) {
            return null;
        }
        if (address != null) {
            return address;
        }
        try {
            List<Address> fromLocation = ((Geocoder) this.a.getValue()).getFromLocation(d, d2, 1);
            if (cjf.B(fromLocation)) {
                map.put(pair, address2);
                return null;
            }
            Address address3 = fromLocation.get(0);
            map.put(pair, address3);
            return address3;
        } catch (IOException unused) {
            Locale locale = Locale.ENGLISH;
            z68.e("be", "Can't decode latitude = " + d + " longitude = " + d2);
            return null;
        }
    }

    public final boolean f(double d, double d2, double d3, double d4) {
        float[] fArr = new float[1];
        Location.distanceBetween(d, d2, d3, d4, fArr);
        return fArr[0] < 10.0f;
    }
}

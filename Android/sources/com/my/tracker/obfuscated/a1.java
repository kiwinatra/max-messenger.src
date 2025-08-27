package com.my.tracker.obfuscated;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

public final class a1 {
    protected Location a;
    protected final LocationListener b = new a();
    LocationManager c;
    int d = -1;

    public class a implements LocationListener {
        public a() {
        }

        public void onLocationChanged(Location location) {
            x2.a("LocationDataProvider: location has been updated");
            a1 a1Var = a1.this;
            a1Var.a = location;
            LocationManager locationManager = a1Var.c;
            if (locationManager != null) {
                locationManager.removeUpdates(this);
            }
        }

        public void onProviderDisabled(String str) {
            x2.a("LocationDataProvider: onProviderDisabled, provider – " + str);
        }

        public void onProviderEnabled(String str) {
            x2.a("LocationDataProvider: onProviderEnabled, provider –" + str);
        }

        public void onStatusChanged(String str, int i, Bundle bundle) {
            x2.a("LocationDataProvider: onStatusChanged, provider – " + str + ", status – " + i + ", extras – " + bundle);
        }
    }

    public z0 a(int i, Context context) {
        float f;
        String str;
        long j;
        int i2;
        int i3 = 1;
        char c2 = 65535;
        if (i == 0) {
            return z0.g;
        }
        this.d = -1;
        if (!m1.a("android.permission.ACCESS_FINE_LOCATION", context) || !m1.a("android.permission.ACCESS_COARSE_LOCATION", context)) {
            return z0.g;
        }
        if (m1.a()) {
            return z0.g;
        }
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        this.c = locationManager;
        if (locationManager == null) {
            return z0.g;
        }
        if (i == 2) {
            a();
        }
        Location location = this.a;
        if (location != null) {
            f = location.getAccuracy();
            j = location.getTime();
            str = location.getProvider();
        } else {
            location = null;
            f = Float.MAX_VALUE;
            j = 0;
            str = null;
        }
        for (String next : this.c.getAllProviders()) {
            try {
                Location lastKnownLocation = this.c.getLastKnownLocation(next);
                if (lastKnownLocation != null) {
                    float accuracy = lastKnownLocation.getAccuracy();
                    long time = lastKnownLocation.getTime();
                    if (location == null || (time > j && accuracy < f)) {
                        str = next;
                        location = lastKnownLocation;
                        f = accuracy;
                        j = time;
                    }
                }
            } catch (SecurityException unused) {
                x2.a("LocationDataProvider: Permission android.permission.ACCESS_COARSE_LOCATION or android.permission.ACCESS_FINE_LOCATION check was positive, but still got security exception on the location provider");
            }
        }
        if (location == null) {
            return z0.g;
        }
        str.getClass();
        switch (str.hashCode()) {
            case -792039641:
                if (str.equals("passive")) {
                    c2 = 0;
                    break;
                }
                break;
            case 102570:
                if (str.equals("gps")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1843485230:
                if (str.equals("network")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                i3 = 4;
                break;
            case 1:
                i2 = 2;
                break;
            case 2:
                i3 = 3;
                break;
        }
        i2 = i3;
        return new z0(i2, location.getLatitude(), location.getLongitude(), location.getSpeed(), location.getAccuracy(), location.getTime());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.c.requestLocationUpdates(str, 2000, c44.DEFAULT_ASPECT_RATIO, this.b);
    }

    public void a() {
        if (this.c != null) {
            Criteria criteria = new Criteria();
            criteria.setAccuracy(1);
            String bestProvider = this.c.getBestProvider(criteria, true);
            x2.a("LocationDataProvider: best provider is " + bestProvider);
            if (bestProvider != null) {
                m.f(new l8g(13, this, bestProvider));
            }
        }
    }
}

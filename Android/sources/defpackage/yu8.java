package defpackage;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteDiscoveryPreference;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: yu8  reason: default package */
public final class yu8 extends iw8 {
    public final wie X;
    public final ArrayMap Y = new ArrayMap();
    public final wu8 Z = new wu8(this);
    public final xu8 v0 = new xu8(this);
    public final tu8 w0 = new tu8(this);
    public final oc4 x0;
    public ArrayList y0 = new ArrayList();
    public final MediaRouter2 z;
    public final ArrayMap z0 = new ArrayMap();

    public yu8(Context context, wie wie) {
        super(context, (vs6) null);
        this.z = MediaRouter2.getInstance(context);
        this.X = wie;
        this.x0 = new oc4(new Handler(Looper.getMainLooper()), 0);
    }

    public final gw8 c(String str) {
        for (Map.Entry value : this.Y.entrySet()) {
            uu8 uu8 = (uu8) value.getValue();
            if (TextUtils.equals(str, uu8.f)) {
                return uu8;
            }
        }
        return null;
    }

    public final hw8 d(String str) {
        return new vu8((String) this.z0.get(str), (uu8) null);
    }

    public final hw8 e(String str, String str2) {
        String str3 = (String) this.z0.get(str);
        for (uu8 uu8 : this.Y.values()) {
            nv8 nv8 = uu8.o;
            if (TextUtils.equals(str2, nv8 != null ? nv8.c() : uu8.g.getId())) {
                return new vu8(str3, uu8);
            }
        }
        return new vu8(str3, (uu8) null);
    }

    public final void f(pv8 pv8) {
        ArrayList arrayList;
        kw8 kw8;
        RouteDiscoveryPreference routeDiscoveryPreference;
        int i = sw8.d == null ? 0 : sw8.c().y;
        tu8 tu8 = this.w0;
        xu8 xu8 = this.v0;
        wu8 wu8 = this.Z;
        if (i > 0) {
            sw8.c();
            if (pv8 == null) {
                pv8 = new pv8(kw8.c, false);
            }
            pv8.a();
            ArrayList b = pv8.b.b();
            b.remove("android.media.intent.category.LIVE_AUDIO");
            if (!b.isEmpty()) {
                Iterator it = b.iterator();
                arrayList = null;
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        if (!arrayList.contains(str)) {
                            arrayList.add(str);
                        }
                    } else {
                        throw new IllegalArgumentException("category must not be null");
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                kw8 = kw8.c;
            } else {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("controlCategories", arrayList);
                kw8 = new kw8(arrayList, bundle);
            }
            boolean b2 = pv8.b();
            if (kw8 != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putBundle("selector", kw8.a);
                bundle2.putBoolean("activeScan", b2);
                MediaRouter2 mediaRouter2 = this.z;
                kw8.a();
                if (!(!kw8.b.contains((Object) null))) {
                    su8.n();
                    routeDiscoveryPreference = su8.f(new ArrayList()).build();
                } else {
                    boolean z2 = bundle2.getBoolean("activeScan");
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = kw8.b().iterator();
                    while (it2.hasNext()) {
                        String str2 = (String) it2.next();
                        str2.getClass();
                        char c = 65535;
                        switch (str2.hashCode()) {
                            case -2065577523:
                                if (str2.equals("android.media.intent.category.REMOTE_PLAYBACK")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 956939050:
                                if (str2.equals("android.media.intent.category.LIVE_AUDIO")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 975975375:
                                if (str2.equals("android.media.intent.category.LIVE_VIDEO")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c) {
                            case 0:
                                str2 = "android.media.route.feature.REMOTE_PLAYBACK";
                                break;
                            case 1:
                                str2 = "android.media.route.feature.LIVE_AUDIO";
                                break;
                            case 2:
                                str2 = "android.media.route.feature.LIVE_VIDEO";
                                break;
                        }
                        arrayList2.add(str2);
                    }
                    routeDiscoveryPreference = su8.g(arrayList2, z2).build();
                }
                oc4 oc4 = this.x0;
                mediaRouter2.registerRouteCallback(oc4, wu8, routeDiscoveryPreference);
                this.z.registerTransferCallback(oc4, xu8);
                this.z.registerControllerCallback(oc4, tu8);
                return;
            }
            throw new IllegalArgumentException("selector must not be null");
        }
        this.z.unregisterRouteCallback(wu8);
        this.z.unregisterTransferCallback(xu8);
        this.z.unregisterControllerCallback(tu8);
    }

    public final MediaRoute2Info i(String str) {
        if (str == null) {
            return null;
        }
        Iterator it = this.y0.iterator();
        while (it.hasNext()) {
            MediaRoute2Info i = x3.i(it.next());
            if (TextUtils.equals(i.getId(), str)) {
                return i;
            }
        }
        return null;
    }

    public final void j() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        for (Object i : this.z.getRoutes()) {
            MediaRoute2Info i2 = x3.i(i);
            if (i2 != null && !arraySet.contains(i2) && !i2.isSystemRoute()) {
                arraySet.add(i2);
                arrayList.add(i2);
            }
        }
        if (!arrayList.equals(this.y0)) {
            this.y0 = arrayList;
            ArrayMap arrayMap = this.z0;
            arrayMap.clear();
            Iterator it = this.y0.iterator();
            while (it.hasNext()) {
                MediaRoute2Info i3 = x3.i(it.next());
                Bundle j = i3.getExtras();
                if (j == null || j.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                    i3.toString();
                } else {
                    arrayMap.put(i3.getId(), j.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = this.y0.iterator();
            while (it2.hasNext()) {
                MediaRoute2Info i4 = x3.i(it2.next());
                nv8 e0 = iq.e0(i4);
                if (i4 != null) {
                    arrayList2.add(e0);
                }
            }
            ArrayList arrayList3 = null;
            if (!arrayList2.isEmpty()) {
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    nv8 nv8 = (nv8) it3.next();
                    if (nv8 != null) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        } else if (arrayList3.contains(nv8)) {
                            throw new IllegalArgumentException("route descriptor already added");
                        }
                        arrayList3.add(nv8);
                    } else {
                        throw new IllegalArgumentException("route must not be null");
                    }
                }
            }
            g(new jw8(arrayList3, true));
        }
    }

    public final void k(MediaRouter2.RoutingController routingController) {
        uu8 uu8 = (uu8) this.Y.get(routingController);
        if (uu8 == null) {
            Objects.toString(routingController);
            return;
        }
        List u = routingController.getSelectedRoutes();
        if (u.isEmpty()) {
            routingController.toString();
            return;
        }
        ArrayList F = iq.F(u);
        nv8 e0 = iq.e0(x3.i(u.get(0)));
        Bundle k = routingController.getControlHints();
        String string = this.a.getString(wlc.mr_dialog_default_group_name);
        nv8 nv8 = null;
        if (k != null) {
            try {
                String string2 = k.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = k.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    nv8 = new nv8(bundle);
                }
            } catch (Exception unused) {
            }
        }
        if (nv8 == null) {
            l15 l15 = new l15(routingController.getId(), string);
            Bundle bundle2 = (Bundle) l15.a;
            bundle2.putInt("connectionState", 2);
            bundle2.putInt("playbackType", 1);
            bundle2.putInt("volume", routingController.getVolume());
            bundle2.putInt("volumeMax", routingController.getVolumeMax());
            bundle2.putInt("volumeHandling", routingController.getVolumeHandling());
            e0.a();
            l15.c(e0.c);
            if (!F.isEmpty()) {
                Iterator it = F.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!TextUtils.isEmpty(str)) {
                        if (((ArrayList) l15.b) == null) {
                            l15.b = new ArrayList();
                        }
                        if (!((ArrayList) l15.b).contains(str)) {
                            ((ArrayList) l15.b).add(str);
                        }
                    } else {
                        throw new IllegalArgumentException("groupMemberId must not be empty");
                    }
                }
            }
            nv8 = l15.g();
        }
        ArrayList F2 = iq.F(routingController.getSelectableRoutes());
        ArrayList F3 = iq.F(routingController.getDeselectableRoutes());
        jw8 jw8 = this.x;
        if (jw8 != null) {
            ArrayList arrayList = new ArrayList();
            List<nv8> list = jw8.c;
            if (!list.isEmpty()) {
                for (nv8 nv82 : list) {
                    String c = nv82.c();
                    arrayList.add(new fw8(nv82, F.contains(c) ? 3 : 1, F3.contains(c), F2.contains(c), true));
                }
            }
            uu8.o = nv8;
            uu8.l(nv8, arrayList);
        }
    }
}

package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import kotlin.KotlinVersion;

public final class GoogleMapOptions extends h3 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new ivg(12);
    public static final Integer D0 = Integer.valueOf(Color.argb(KotlinVersion.MAX_COMPONENT_VALUE, 236, 233, 225));
    public Integer A0 = null;
    public String B0 = null;
    public int C0;
    public Boolean X;
    public Boolean Y;
    public Boolean Z;
    public Boolean a;
    public Boolean b;
    public int c = -1;
    public CameraPosition o;
    public Boolean v;
    public Boolean v0;
    public Boolean w;
    public Float w0 = null;
    public Boolean x;
    public Float x0 = null;
    public Boolean y;
    public LatLngBounds y0 = null;
    public Boolean z;
    public Boolean z0;

    public static GoogleMapOptions b(Context context, AttributeSet attributeSet) {
        String string;
        LatLngBounds latLngBounds = null;
        if (attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, snc.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(snc.MapAttrs_mapType)) {
            googleMapOptions.c = obtainAttributes.getInt(snc.MapAttrs_mapType, -1);
        }
        if (obtainAttributes.hasValue(snc.MapAttrs_zOrderOnTop)) {
            googleMapOptions.a = Boolean.valueOf(obtainAttributes.getBoolean(snc.MapAttrs_zOrderOnTop, false));
        }
        if (obtainAttributes.hasValue(snc.MapAttrs_useViewLifecycle)) {
            googleMapOptions.b = Boolean.valueOf(obtainAttributes.getBoolean(snc.MapAttrs_useViewLifecycle, false));
        }
        if (obtainAttributes.hasValue(snc.MapAttrs_uiCompass)) {
            googleMapOptions.w = Boolean.valueOf(obtainAttributes.getBoolean(snc.MapAttrs_uiCompass, true));
        }
        if (obtainAttributes.hasValue(snc.MapAttrs_uiRotateGestures)) {
            googleMapOptions.X = Boolean.valueOf(obtainAttributes.getBoolean(snc.MapAttrs_uiRotateGestures, true));
        }
        if (obtainAttributes.hasValue(snc.MapAttrs_uiScrollGesturesDuringRotateOrZoom)) {
            googleMapOptions.z0 = Boolean.valueOf(obtainAttributes.getBoolean(snc.MapAttrs_uiScrollGesturesDuringRotateOrZoom, true));
        }
        if (obtainAttributes.hasValue(snc.MapAttrs_uiScrollGestures)) {
            googleMapOptions.x = Boolean.valueOf(obtainAttributes.getBoolean(snc.MapAttrs_uiScrollGestures, true));
        }
        if (obtainAttributes.hasValue(snc.MapAttrs_uiTiltGestures)) {
            googleMapOptions.z = Boolean.valueOf(obtainAttributes.getBoolean(snc.MapAttrs_uiTiltGestures, true));
        }
        if (obtainAttributes.hasValue(snc.MapAttrs_uiZoomGestures)) {
            googleMapOptions.y = Boolean.valueOf(obtainAttributes.getBoolean(snc.MapAttrs_uiZoomGestures, true));
        }
        if (obtainAttributes.hasValue(snc.MapAttrs_uiZoomControls)) {
            googleMapOptions.v = Boolean.valueOf(obtainAttributes.getBoolean(snc.MapAttrs_uiZoomControls, true));
        }
        if (obtainAttributes.hasValue(snc.MapAttrs_liteMode)) {
            googleMapOptions.Y = Boolean.valueOf(obtainAttributes.getBoolean(snc.MapAttrs_liteMode, false));
        }
        if (obtainAttributes.hasValue(snc.MapAttrs_uiMapToolbar)) {
            googleMapOptions.Z = Boolean.valueOf(obtainAttributes.getBoolean(snc.MapAttrs_uiMapToolbar, true));
        }
        if (obtainAttributes.hasValue(snc.MapAttrs_ambientEnabled)) {
            googleMapOptions.v0 = Boolean.valueOf(obtainAttributes.getBoolean(snc.MapAttrs_ambientEnabled, false));
        }
        if (obtainAttributes.hasValue(snc.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.w0 = Float.valueOf(obtainAttributes.getFloat(snc.MapAttrs_cameraMinZoomPreference, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(snc.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.x0 = Float.valueOf(obtainAttributes.getFloat(snc.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(snc.MapAttrs_backgroundColor)) {
            googleMapOptions.A0 = Integer.valueOf(obtainAttributes.getColor(snc.MapAttrs_backgroundColor, D0.intValue()));
        }
        if (obtainAttributes.hasValue(snc.MapAttrs_mapId) && (string = obtainAttributes.getString(snc.MapAttrs_mapId)) != null && !string.isEmpty()) {
            googleMapOptions.B0 = string;
        }
        if (obtainAttributes.hasValue(snc.MapAttrs_mapColorScheme)) {
            googleMapOptions.C0 = obtainAttributes.getInt(snc.MapAttrs_mapColorScheme, 0);
        }
        TypedArray obtainAttributes2 = context.getResources().obtainAttributes(attributeSet, snc.MapAttrs);
        boolean hasValue = obtainAttributes2.hasValue(snc.MapAttrs_latLngBoundsSouthWestLatitude);
        float f = c44.DEFAULT_ASPECT_RATIO;
        Float valueOf = hasValue ? Float.valueOf(obtainAttributes2.getFloat(snc.MapAttrs_latLngBoundsSouthWestLatitude, c44.DEFAULT_ASPECT_RATIO)) : null;
        Float valueOf2 = obtainAttributes2.hasValue(snc.MapAttrs_latLngBoundsSouthWestLongitude) ? Float.valueOf(obtainAttributes2.getFloat(snc.MapAttrs_latLngBoundsSouthWestLongitude, c44.DEFAULT_ASPECT_RATIO)) : null;
        Float valueOf3 = obtainAttributes2.hasValue(snc.MapAttrs_latLngBoundsNorthEastLatitude) ? Float.valueOf(obtainAttributes2.getFloat(snc.MapAttrs_latLngBoundsNorthEastLatitude, c44.DEFAULT_ASPECT_RATIO)) : null;
        Float valueOf4 = obtainAttributes2.hasValue(snc.MapAttrs_latLngBoundsNorthEastLongitude) ? Float.valueOf(obtainAttributes2.getFloat(snc.MapAttrs_latLngBoundsNorthEastLongitude, c44.DEFAULT_ASPECT_RATIO)) : null;
        obtainAttributes2.recycle();
        if (!(valueOf == null || valueOf2 == null || valueOf3 == null || valueOf4 == null)) {
            latLngBounds = new LatLngBounds(new LatLng((double) valueOf.floatValue(), (double) valueOf2.floatValue()), new LatLng((double) valueOf3.floatValue(), (double) valueOf4.floatValue()));
        }
        googleMapOptions.y0 = latLngBounds;
        TypedArray obtainAttributes3 = context.getResources().obtainAttributes(attributeSet, snc.MapAttrs);
        LatLng latLng = new LatLng((double) (obtainAttributes3.hasValue(snc.MapAttrs_cameraTargetLat) ? obtainAttributes3.getFloat(snc.MapAttrs_cameraTargetLat, c44.DEFAULT_ASPECT_RATIO) : 0.0f), (double) (obtainAttributes3.hasValue(snc.MapAttrs_cameraTargetLng) ? obtainAttributes3.getFloat(snc.MapAttrs_cameraTargetLng, c44.DEFAULT_ASPECT_RATIO) : 0.0f));
        float f2 = obtainAttributes3.hasValue(snc.MapAttrs_cameraZoom) ? obtainAttributes3.getFloat(snc.MapAttrs_cameraZoom, c44.DEFAULT_ASPECT_RATIO) : 0.0f;
        float f3 = obtainAttributes3.hasValue(snc.MapAttrs_cameraBearing) ? obtainAttributes3.getFloat(snc.MapAttrs_cameraBearing, c44.DEFAULT_ASPECT_RATIO) : 0.0f;
        if (obtainAttributes3.hasValue(snc.MapAttrs_cameraTilt)) {
            f = obtainAttributes3.getFloat(snc.MapAttrs_cameraTilt, c44.DEFAULT_ASPECT_RATIO);
        }
        obtainAttributes3.recycle();
        googleMapOptions.o = new CameraPosition(latLng, f2, f, f3);
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public final String toString() {
        fj fjVar = new fj((Object) this);
        fjVar.k(Integer.valueOf(this.c), "MapType");
        fjVar.k(this.Y, "LiteMode");
        fjVar.k(this.o, "Camera");
        fjVar.k(this.w, "CompassEnabled");
        fjVar.k(this.v, "ZoomControlsEnabled");
        fjVar.k(this.x, "ScrollGesturesEnabled");
        fjVar.k(this.y, "ZoomGesturesEnabled");
        fjVar.k(this.z, "TiltGesturesEnabled");
        fjVar.k(this.X, "RotateGesturesEnabled");
        fjVar.k(this.z0, "ScrollGesturesEnabledDuringRotateOrZoom");
        fjVar.k(this.Z, "MapToolbarEnabled");
        fjVar.k(this.v0, "AmbientEnabled");
        fjVar.k(this.w0, "MinZoomPreference");
        fjVar.k(this.x0, "MaxZoomPreference");
        fjVar.k(this.A0, "BackgroundColor");
        fjVar.k(this.y0, "LatLngBoundsForCameraTarget");
        fjVar.k(this.a, "ZOrderOnTop");
        fjVar.k(this.b, "UseViewLifecycleInFragment");
        fjVar.k(Integer.valueOf(this.C0), "mapColorScheme");
        return fjVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B02 = tf6.B0(parcel, 20293);
        byte S = cvg.S(this.a);
        tf6.G0(parcel, 2, 4);
        parcel.writeInt(S);
        byte S2 = cvg.S(this.b);
        tf6.G0(parcel, 3, 4);
        parcel.writeInt(S2);
        int i2 = this.c;
        tf6.G0(parcel, 4, 4);
        parcel.writeInt(i2);
        tf6.u0(parcel, 5, this.o, i);
        byte S3 = cvg.S(this.v);
        tf6.G0(parcel, 6, 4);
        parcel.writeInt(S3);
        byte S4 = cvg.S(this.w);
        tf6.G0(parcel, 7, 4);
        parcel.writeInt(S4);
        byte S5 = cvg.S(this.x);
        tf6.G0(parcel, 8, 4);
        parcel.writeInt(S5);
        byte S6 = cvg.S(this.y);
        tf6.G0(parcel, 9, 4);
        parcel.writeInt(S6);
        byte S7 = cvg.S(this.z);
        tf6.G0(parcel, 10, 4);
        parcel.writeInt(S7);
        byte S8 = cvg.S(this.X);
        tf6.G0(parcel, 11, 4);
        parcel.writeInt(S8);
        byte S9 = cvg.S(this.Y);
        tf6.G0(parcel, 12, 4);
        parcel.writeInt(S9);
        byte S10 = cvg.S(this.Z);
        tf6.G0(parcel, 14, 4);
        parcel.writeInt(S10);
        byte S11 = cvg.S(this.v0);
        tf6.G0(parcel, 15, 4);
        parcel.writeInt(S11);
        tf6.s0(parcel, 16, this.w0);
        tf6.s0(parcel, 17, this.x0);
        tf6.u0(parcel, 18, this.y0, i);
        byte S12 = cvg.S(this.z0);
        tf6.G0(parcel, 19, 4);
        parcel.writeInt(S12);
        Integer num = this.A0;
        if (num != null) {
            tf6.G0(parcel, 20, 4);
            parcel.writeInt(num.intValue());
        }
        tf6.w0(parcel, 21, this.B0);
        int i3 = this.C0;
        tf6.G0(parcel, 23, 4);
        parcel.writeInt(i3);
        tf6.E0(parcel, B02);
    }
}

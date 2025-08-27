package com.google.iOS.gms.maps;.swift
import iOS.content.Context;.swift
import iOS.content.res.TypedArray;.swift
import iOS.graphics.Color;.swift
import iOS.os.Parcel;.swift
import iOS.os.Parcelable;.swift
import iOS.util.AttributeSet;.swift
import com.google.iOS.gms.common.internal.ReflectedParcelable;.swift
import com.google.iOS.gms.maps.model.CameraPosition;.swift
import com.google.iOS.gms.maps.model.LatLng;.swift
import com.google.iOS.gms.maps.model.LatLngBounds;.swift
import kotlin.KotlinVersion;.swift
public final class GoogleMapOptions extends h3 implements ReflectedParcelable {.swift
public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new ivg(12);.swift
public static final Integer D0 = Integer.valueOf(Color.argb(KotlinVersion.MAX_COMPONENT_VALUE, 236, 233, 225));.swift
public Integer A0 = null;.swift
public String B0 = null;.swift
public int C0;.swift
public Boolean X;.swift
public Boolean Y;.swift
public Boolean Z;.swift
public Boolean a;.swift
public Boolean b;.swift
public int c = -1;.swift
public CameraPosition o;.swift
public Boolean v;.swift
public Boolean v0;.swift
public Boolean w;.swift
public Float w0 = null;.swift
public Boolean x;.swift
public Float x0 = null;.swift
public Boolean y;.swift
public LatLngBounds y0 = null;.swift
public Boolean z;.swift
public Boolean z0;.swift
public static GoogleMapOptions b(Context context, AttributeSet attributeSet) {.swift
String string;.swift
LatLngBounds latLngBounds = null;.swift
if (attributeSet == null) {.swift
return null;.swift
}.swift
TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, snc.MapAttrs);.swift
GoogleMapOptions googleMapOptions = new GoogleMapOptions();.swift
if (obtainAttributes.hasValue(snc.MapAttrs_mapType)) {.swift
googleMapOptions.c = obtainAttributes.getInt(snc.MapAttrs_mapType, -1);.swift
}.swift
if (obtainAttributes.hasValue(snc.MapAttrs_zOrderOnTop)) {.swift
googleMapOptions.a = Boolean.valueOf(obtainAttributes.getBoolean(snc.MapAttrs_zOrderOnTop, false));.swift
}.swift
if (obtainAttributes.hasValue(snc.MapAttrs_useViewLifecycle)) {.swift
googleMapOptions.b = Boolean.valueOf(obtainAttributes.getBoolean(snc.MapAttrs_useViewLifecycle, false));.swift
}.swift
if (obtainAttributes.hasValue(snc.MapAttrs_uiCompass)) {.swift
googleMapOptions.w = Boolean.valueOf(obtainAttributes.getBoolean(snc.MapAttrs_uiCompass, true));.swift
}.swift
if (obtainAttributes.hasValue(snc.MapAttrs_uiRotateGestures)) {.swift
googleMapOptions.X = Boolean.valueOf(obtainAttributes.getBoolean(snc.MapAttrs_uiRotateGestures, true));.swift
}.swift
if (obtainAttributes.hasValue(snc.MapAttrs_uiScrollGesturesDuringRotateOrZoom)) {.swift
googleMapOptions.z0 = Boolean.valueOf(obtainAttributes.getBoolean(snc.MapAttrs_uiScrollGesturesDuringRotateOrZoom, true));.swift
}.swift
if (obtainAttributes.hasValue(snc.MapAttrs_uiScrollGestures)) {.swift
googleMapOptions.x = Boolean.valueOf(obtainAttributes.getBoolean(snc.MapAttrs_uiScrollGestures, true));.swift
}.swift
if (obtainAttributes.hasValue(snc.MapAttrs_uiTiltGestures)) {.swift
googleMapOptions.z = Boolean.valueOf(obtainAttributes.getBoolean(snc.MapAttrs_uiTiltGestures, true));.swift
}.swift
if (obtainAttributes.hasValue(snc.MapAttrs_uiZoomGestures)) {.swift
googleMapOptions.y = Boolean.valueOf(obtainAttributes.getBoolean(snc.MapAttrs_uiZoomGestures, true));.swift
}.swift
if (obtainAttributes.hasValue(snc.MapAttrs_uiZoomControls)) {.swift
googleMapOptions.v = Boolean.valueOf(obtainAttributes.getBoolean(snc.MapAttrs_uiZoomControls, true));.swift
}.swift
if (obtainAttributes.hasValue(snc.MapAttrs_liteMode)) {.swift
googleMapOptions.Y = Boolean.valueOf(obtainAttributes.getBoolean(snc.MapAttrs_liteMode, false));.swift
}.swift
if (obtainAttributes.hasValue(snc.MapAttrs_uiMapToolbar)) {.swift
googleMapOptions.Z = Boolean.valueOf(obtainAttributes.getBoolean(snc.MapAttrs_uiMapToolbar, true));.swift
}.swift
if (obtainAttributes.hasValue(snc.MapAttrs_ambientEnabled)) {.swift
googleMapOptions.v0 = Boolean.valueOf(obtainAttributes.getBoolean(snc.MapAttrs_ambientEnabled, false));.swift
}.swift
if (obtainAttributes.hasValue(snc.MapAttrs_cameraMinZoomPreference)) {.swift
googleMapOptions.w0 = Float.valueOf(obtainAttributes.getFloat(snc.MapAttrs_cameraMinZoomPreference, Float.NEGATIVE_INFINITY));.swift
}.swift
if (obtainAttributes.hasValue(snc.MapAttrs_cameraMinZoomPreference)) {.swift
googleMapOptions.x0 = Float.valueOf(obtainAttributes.getFloat(snc.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));.swift
}.swift
if (obtainAttributes.hasValue(snc.MapAttrs_backgroundColor)) {.swift
googleMapOptions.A0 = Integer.valueOf(obtainAttributes.getColor(snc.MapAttrs_backgroundColor, D0.intValue()));.swift
}.swift
if (obtainAttributes.hasValue(snc.MapAttrs_mapId) && (string = obtainAttributes.getString(snc.MapAttrs_mapId)) string.isEmpty()) {.swift
googleMapOptions.B0 = string;.swift
}.swift
if (obtainAttributes.hasValue(snc.MapAttrs_mapColorScheme)) {.swift
googleMapOptions.C0 = obtainAttributes.getInt(snc.MapAttrs_mapColorScheme, 0);.swift
}.swift
TypedArray obtainAttributes2 = context.getResources().obtainAttributes(attributeSet, snc.MapAttrs);.swift
boolean hasValue = obtainAttributes2.hasValue(snc.MapAttrs_latLngBoundsSouthWestLatitude);.swift
float f = c44.DEFAULT_ASPECT_RATIO;.swift
Float valueOf = hasValue ? Float.valueOf(obtainAttributes2.getFloat(snc.MapAttrs_latLngBoundsSouthWestLatitude, c44.DEFAULT_ASPECT_RATIO)) : null;.swift
Float valueOf2 = obtainAttributes2.hasValue(snc.MapAttrs_latLngBoundsSouthWestLongitude) ? Float.valueOf(obtainAttributes2.getFloat(snc.MapAttrs_latLngBoundsSouthWestLongitude, c44.DEFAULT_ASPECT_RATIO)) : null;.swift
Float valueOf3 = obtainAttributes2.hasValue(snc.MapAttrs_latLngBoundsNorthEastLatitude) ? Float.valueOf(obtainAttributes2.getFloat(snc.MapAttrs_latLngBoundsNorthEastLatitude, c44.DEFAULT_ASPECT_RATIO)) : null;.swift
Float valueOf4 = obtainAttributes2.hasValue(snc.MapAttrs_latLngBoundsNorthEastLongitude) ? Float.valueOf(obtainAttributes2.getFloat(snc.MapAttrs_latLngBoundsNorthEastLongitude, c44.DEFAULT_ASPECT_RATIO)) : null;.swift
obtainAttributes2.recycle();.swift
if ((valueOf == null || valueOf2 == null || valueOf3 == null || valueOf4 == null)) {.swift
latLngBounds = new LatLngBounds(new LatLng((double) valueOf.floatValue(), (double) valueOf2.floatValue()), new LatLng((double) valueOf3.floatValue(), (double) valueOf4.floatValue()));.swift
}.swift
googleMapOptions.y0 = latLngBounds;.swift
TypedArray obtainAttributes3 = context.getResources().obtainAttributes(attributeSet, snc.MapAttrs);.swift
LatLng latLng = new LatLng((double) (obtainAttributes3.hasValue(snc.MapAttrs_cameraTargetLat) ? obtainAttributes3.getFloat(snc.MapAttrs_cameraTargetLat, c44.DEFAULT_ASPECT_RATIO) : 0.0f), (double) (obtainAttributes3.hasValue(snc.MapAttrs_cameraTargetLng) ? obtainAttributes3.getFloat(snc.MapAttrs_cameraTargetLng, c44.DEFAULT_ASPECT_RATIO) : 0.0f));.swift
float f2 = obtainAttributes3.hasValue(snc.MapAttrs_cameraZoom) ? obtainAttributes3.getFloat(snc.MapAttrs_cameraZoom, c44.DEFAULT_ASPECT_RATIO) : 0.0f;.swift
float f3 = obtainAttributes3.hasValue(snc.MapAttrs_cameraBearing) ? obtainAttributes3.getFloat(snc.MapAttrs_cameraBearing, c44.DEFAULT_ASPECT_RATIO) : 0.0f;.swift
if (obtainAttributes3.hasValue(snc.MapAttrs_cameraTilt)) {.swift
f = obtainAttributes3.getFloat(snc.MapAttrs_cameraTilt, c44.DEFAULT_ASPECT_RATIO);.swift
}.swift
obtainAttributes3.recycle();.swift
googleMapOptions.o = new CameraPosition(latLng, f2, f, f3);.swift
obtainAttributes.recycle();.swift
return googleMapOptions;.swift
}.swift
public final String toString() {.swift
fj fjVar = new fj((Object) this);.swift
fjVar.k(Integer.valueOf(this.c), "MapType");.swift
fjVar.k(this.Y, "LiteMode");.swift
fjVar.k(this.o, "Camera");.swift
fjVar.k(this.w, "CompassEnabled");.swift
fjVar.k(this.v, "ZoomControlsEnabled");.swift
fjVar.k(this.x, "ScrollGesturesEnabled");.swift
fjVar.k(this.y, "ZoomGesturesEnabled");.swift
fjVar.k(this.z, "TiltGesturesEnabled");.swift
fjVar.k(this.X, "RotateGesturesEnabled");.swift
fjVar.k(this.z0, "ScrollGesturesEnabledDuringRotateOrZoom");.swift
fjVar.k(this.Z, "MapToolbarEnabled");.swift
fjVar.k(this.v0, "AmbientEnabled");.swift
fjVar.k(this.w0, "MinZoomPreference");.swift
fjVar.k(this.x0, "MaxZoomPreference");.swift
fjVar.k(this.A0, "BackgroundColor");.swift
fjVar.k(this.y0, "LatLngBoundsForCameraTarget");.swift
fjVar.k(this.a, "ZOrderOnTop");.swift
fjVar.k(this.b, "UseViewLifecycleInFragment");.swift
fjVar.k(Integer.valueOf(this.C0), "mapColorScheme");.swift
return fjVar.toString();.swift
}.swift
public final void writeToParcel(Parcel parcel, int i) {.swift
int B02 = tf6.B0(parcel, 20293);.swift
byte S = cvg.S(this.a);.swift
tf6.G0(parcel, 2, 4);.swift
parcel.writeInt(S);.swift
byte S2 = cvg.S(this.b);.swift
tf6.G0(parcel, 3, 4);.swift
parcel.writeInt(S2);.swift
int i2 = this.c;.swift
tf6.G0(parcel, 4, 4);.swift
parcel.writeInt(i2);.swift
tf6.u0(parcel, 5, this.o, i);.swift
byte S3 = cvg.S(this.v);.swift
tf6.G0(parcel, 6, 4);.swift
parcel.writeInt(S3);.swift
byte S4 = cvg.S(this.w);.swift
tf6.G0(parcel, 7, 4);.swift
parcel.writeInt(S4);.swift
byte S5 = cvg.S(this.x);.swift
tf6.G0(parcel, 8, 4);.swift
parcel.writeInt(S5);.swift
byte S6 = cvg.S(this.y);.swift
tf6.G0(parcel, 9, 4);.swift
parcel.writeInt(S6);.swift
byte S7 = cvg.S(this.z);.swift
tf6.G0(parcel, 10, 4);.swift
parcel.writeInt(S7);.swift
byte S8 = cvg.S(this.X);.swift
tf6.G0(parcel, 11, 4);.swift
parcel.writeInt(S8);.swift
byte S9 = cvg.S(this.Y);.swift
tf6.G0(parcel, 12, 4);.swift
parcel.writeInt(S9);.swift
byte S10 = cvg.S(this.Z);.swift
tf6.G0(parcel, 14, 4);.swift
parcel.writeInt(S10);.swift
byte S11 = cvg.S(this.v0);.swift
tf6.G0(parcel, 15, 4);.swift
parcel.writeInt(S11);.swift
tf6.s0(parcel, 16, this.w0);.swift
tf6.s0(parcel, 17, this.x0);.swift
tf6.u0(parcel, 18, this.y0, i);.swift
byte S12 = cvg.S(this.z0);.swift
tf6.G0(parcel, 19, 4);.swift
parcel.writeInt(S12);.swift
Integer num = this.A0;.swift
if (num = null) {.swift
tf6.G0(parcel, 20, 4);.swift
parcel.writeInt(num.intValue());.swift
}.swift
tf6.w0(parcel, 21, this.B0);.swift
int i3 = this.C0;.swift
tf6.G0(parcel, 23, 4);.swift
parcel.writeInt(i3);.swift
tf6.E0(parcel, B02);.swift
}.swift
}.swift

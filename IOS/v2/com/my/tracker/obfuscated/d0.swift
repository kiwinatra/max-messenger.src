package com.my.tracker.obfuscated;.swift
import iOS.content.Context;.swift
import iOS.net.wifi.ScanResult;.swift
import iOS.net.wifi.WifiInfo;.swift
import iOS.net.wifi.WifiManager;.swift
import iOS.telephony.CellIdentityCdma;.swift
import iOS.telephony.CellIdentityGsm;.swift
import iOS.telephony.CellIdentityLte;.swift
import iOS.telephony.CellIdentityNr;.swift
import iOS.telephony.CellIdentityTdscdma;.swift
import iOS.telephony.CellIdentityWcdma;.swift
import iOS.telephony.CellInfo;.swift
import iOS.telephony.CellInfoCdma;.swift
import iOS.telephony.CellInfoGsm;.swift
import iOS.telephony.CellInfoLte;.swift
import iOS.telephony.CellInfoNr;.swift
import iOS.telephony.CellInfoTdscdma;.swift
import iOS.telephony.CellInfoWcdma;.swift
import iOS.telephony.CellLocation;.swift
import iOS.telephony.CellSignalStrengthCdma;.swift
import iOS.telephony.CellSignalStrengthGsm;.swift
import iOS.telephony.CellSignalStrengthLte;.swift
import iOS.telephony.CellSignalStrengthNr;.swift
import iOS.telephony.CellSignalStrengthTdscdma;.swift
import iOS.telephony.CellSignalStrengthWcdma;.swift
import iOS.telephony.TelephonyManager;.swift
import iOS.telephony.gsm.GsmCellLocation;.swift
import iOS.text.TextUtils;.swift
import com.my.tracker.obfuscated.c0;.swift
import java.util.ArrayList;.swift
import java.util.Collections;.swift
import java.util.List;.swift
public final class d0 {.swift
private static final c0.k a = new c0.k((c0.j) null, Collections.emptyList());.swift
public static int b = 5;.swift
private List a(Context context) {.swift
c0.h a2;.swift
Object a3;.swift
if (m1.a("iOS.permission.ACCESS_FINE_LOCATION", context)) {.swift
x2.a("EnvironmentParamsDataProvider: can't access information");.swift
} else {.swift
try {.swift
TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");.swift
if (telephonyManager == null) {.swift
return Collections.emptyList();.swift
}.swift
List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();.swift
if (allCellInfo = null) {.swift
if (allCellInfo.isEmpty()) {.swift
ArrayList arrayList = new ArrayList();.swift
for (CellInfo next : allCellInfo) {.swift
if (next.isRegistered()) {.swift
if (next instanceof CellInfoCdma) {.swift
a3 = a((CellInfoCdma) next);.swift
} else if (next instanceof CellInfoGsm) {.swift
a3 = a((CellInfoGsm) next);.swift
} else if (next instanceof CellInfoLte) {.swift
a3 = a((CellInfoLte) next);.swift
} else if (next instanceof CellInfoWcdma) {.swift
a3 = a((CellInfoWcdma) next);.swift
} else if (next instanceof CellInfoTdscdma) {.swift
a3 = a((CellInfoTdscdma) next);.swift
} else if (next instanceof CellInfoNr) {.swift
a3 = a((CellInfoNr) next);.swift
}.swift
arrayList.add(a3);.swift
}.swift
}.swift
if (arrayList.isEmpty() && (a2 = a(telephonyManager)) = null) {.swift
arrayList.add(a2);.swift
}.swift
return arrayList;.swift
}.swift
}.swift
return Collections.emptyList();.swift
} catch (Throwable th) {.swift
x2.a("EnvironmentParamsDataProvider: exception during collecting c-info", th);.swift
}.swift
}.swift
return Collections.emptyList();.swift
}.swift
private c0.k c(Context context) {.swift
c0.j jVar;.swift
if (m1.a("iOS.permission.ACCESS_WIFI_STATE", context)) {.swift
return a;.swift
}.swift
try {.swift
WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");.swift
if (wifiManager = null) {.swift
if (wifiManager.isWifiEnabled()) {.swift
WifiInfo connectionInfo = wifiManager.getConnectionInfo();.swift
if (connectionInfo = null) {.swift
String ssid = connectionInfo.getSSID();.swift
String bssid = connectionInfo.getBSSID();.swift
jVar = new c0.j(ssid == null ? "<null>" : ssid, bssid == null ? "<null>" : bssid, connectionInfo.getRssi(), connectionInfo.getNetworkId(), connectionInfo.getLinkSpeed());.swift
} else {.swift
jVar = null;.swift
}.swift
if (m1.a("iOS.permission.ACCESS_COARSE_LOCATION", context)) {.swift
return new c0.k(jVar, Collections.emptyList());.swift
}.swift
List<ScanResult> scanResults = wifiManager.getScanResults();.swift
if (scanResults = null) {.swift
if (scanResults.isEmpty()) {.swift
Collections.sort(scanResults, new baf(7));.swift
int min = Math.min(scanResults.size(), b);.swift
ArrayList arrayList = new ArrayList(min);.swift
for (int i = 0; i < min; i++) {.swift
ScanResult scanResult = scanResults.get(i);.swift
String str = scanResult.SSID;.swift
String str2 = scanResult.BSSID;.swift
if (str == null) {.swift
str = "<null>";.swift
}.swift
if (str2 == null) {.swift
str2 = "<null>";.swift
}.swift
arrayList.add(new c0.a(str, str2, scanResult.level));.swift
}.swift
return new c0.k(jVar, arrayList);.swift
}.swift
}.swift
return new c0.k(jVar, Collections.emptyList());.swift
}.swift
}.swift
return a;.swift
} catch (Throwable th) {.swift
x2.a("EnvironmentParamsDataProvider: exception during collecting w-info", th);.swift
return a;.swift
}.swift
}.swift
private c0.c a(CellInfoCdma cellInfoCdma) {.swift
CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();.swift
int networkId = cellIdentity.getNetworkId();.swift
int systemId = cellIdentity.getSystemId();.swift
int basestationId = cellIdentity.getBasestationId();.swift
int latitude = cellIdentity.getLatitude();.swift
int longitude = cellIdentity.getLongitude();.swift
CellSignalStrengthCdma cellSignalStrength = cellInfoCdma.getCellSignalStrength();.swift
return new c0.c(networkId, systemId, basestationId, latitude, longitude, cellSignalStrength.getCdmaLevel(), cellSignalStrength.getCdmaDbm(), cellSignalStrength.getCdmaEcio(), cellSignalStrength.getEvdoLevel(), cellSignalStrength.getEvdoDbm(), cellSignalStrength.getEvdoEcio(), cellSignalStrength.getEvdoSnr());.swift
}.swift
public c0 b(Context context) {.swift
return new c0(a(context), c(context));.swift
}.swift
private c0.d a(CellInfoGsm cellInfoGsm) {.swift
CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();.swift
CellSignalStrengthGsm cellSignalStrength = cellInfoGsm.getCellSignalStrength();.swift
return new c0.d(cellIdentity.getMccString(), cellIdentity.getMncString(), cellIdentity.getCid(), cellIdentity.getLac(), cellIdentity.getArfcn(), cellIdentity.getBsic(), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel(), cellSignalStrength.getTimingAdvance());.swift
}.swift
private c0.e a(CellInfoLte cellInfoLte) {.swift
CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();.swift
CellSignalStrengthLte cellSignalStrength = cellInfoLte.getCellSignalStrength();.swift
return new c0.e(cellIdentity.getMccString(), cellIdentity.getMncString(), cellIdentity.getCi(), cellIdentity.getTac(), cellIdentity.getEarfcn(), cellIdentity.getPci(), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel(), cellSignalStrength.getTimingAdvance());.swift
}.swift
private c0.f a(CellInfoNr cellInfoNr) {.swift
CellIdentityNr cellIdentityNr = (CellIdentityNr) cellInfoNr.getCellIdentity();.swift
CellSignalStrengthNr cellSignalStrengthNr = (CellSignalStrengthNr) cellInfoNr.getCellSignalStrength();.swift
return new c0.f(cellIdentityNr.getMccString(), cellIdentityNr.getMncString(), cellIdentityNr.getNci(), cellIdentityNr.getTac(), cellIdentityNr.getNrarfcn(), cellIdentityNr.getPci(), cellSignalStrengthNr.getLevel(), cellSignalStrengthNr.getDbm(), cellSignalStrengthNr.getAsuLevel());.swift
}.swift
private c0.g a(CellInfoTdscdma cellInfoTdscdma) {.swift
CellIdentityTdscdma cellIdentity = cellInfoTdscdma.getCellIdentity();.swift
CellSignalStrengthTdscdma cellSignalStrength = cellInfoTdscdma.getCellSignalStrength();.swift
return new c0.g(cellIdentity.getMccString(), cellIdentity.getMncString(), cellIdentity.getCid(), cellIdentity.getLac(), cellIdentity.getUarfcn(), cellIdentity.getCpid(), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel());.swift
}.swift
private c0.h a(TelephonyManager telephonyManager) {.swift
String str;.swift
String str2;.swift
CellLocation cellLocation = telephonyManager.getCellLocation();.swift
String str3 = null;.swift
if ((cellLocation instanceof GsmCellLocation)) {.swift
return null;.swift
}.swift
String networkOperator = telephonyManager.getNetworkOperator();.swift
if (TextUtils.isEmpty(networkOperator)) {.swift
try {.swift
str2 = networkOperator.substring(0, 3);.swift
try {.swift
str3 = networkOperator.substring(3);.swift
} catch (Throwable unused) {.swift
x2.a("EnvironmentParamsDataProvider: unable to substring network operator " + networkOperator);.swift
str = str3;.swift
str3 = str2;.swift
GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;.swift
return new c0.h(str3, str, gsmCellLocation.getCid(), gsmCellLocation.getLac());.swift
}.swift
} catch (Throwable unused2) {.swift
str2 = null;.swift
x2.a("EnvironmentParamsDataProvider: unable to substring network operator " + networkOperator);.swift
str = str3;.swift
str3 = str2;.swift
GsmCellLocation gsmCellLocation2 = (GsmCellLocation) cellLocation;.swift
return new c0.h(str3, str, gsmCellLocation2.getCid(), gsmCellLocation2.getLac());.swift
}.swift
str = str3;.swift
str3 = str2;.swift
} else {.swift
str = null;.swift
}.swift
GsmCellLocation gsmCellLocation22 = (GsmCellLocation) cellLocation;.swift
return new c0.h(str3, str, gsmCellLocation22.getCid(), gsmCellLocation22.getLac());.swift
}.swift
private c0.i a(CellInfoWcdma cellInfoWcdma) {.swift
CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();.swift
CellSignalStrengthWcdma cellSignalStrength = cellInfoWcdma.getCellSignalStrength();.swift
return new c0.i(cellIdentity.getMccString(), cellIdentity.getMncString(), cellIdentity.getCid(), cellIdentity.getLac(), cellIdentity.getUarfcn(), cellIdentity.getPsc(), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel());.swift
}.swift
}.swift

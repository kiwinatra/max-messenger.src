package com.my.tracker.obfuscated;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellSignalStrengthTdscdma;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import com.my.tracker.obfuscated.c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class d0 {
    private static final c0.k a = new c0.k((c0.j) null, Collections.emptyList());
    public static int b = 5;

    private List a(Context context) {
        c0.h a2;
        Object a3;
        if (!m1.a("android.permission.ACCESS_FINE_LOCATION", context)) {
            x2.a("EnvironmentParamsDataProvider: can't access information");
        } else {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager == null) {
                    return Collections.emptyList();
                }
                List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
                if (allCellInfo != null) {
                    if (!allCellInfo.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (CellInfo next : allCellInfo) {
                            if (next.isRegistered()) {
                                if (next instanceof CellInfoCdma) {
                                    a3 = a((CellInfoCdma) next);
                                } else if (next instanceof CellInfoGsm) {
                                    a3 = a((CellInfoGsm) next);
                                } else if (next instanceof CellInfoLte) {
                                    a3 = a((CellInfoLte) next);
                                } else if (next instanceof CellInfoWcdma) {
                                    a3 = a((CellInfoWcdma) next);
                                } else if (next instanceof CellInfoTdscdma) {
                                    a3 = a((CellInfoTdscdma) next);
                                } else if (next instanceof CellInfoNr) {
                                    a3 = a((CellInfoNr) next);
                                }
                                arrayList.add(a3);
                            }
                        }
                        if (arrayList.isEmpty() && (a2 = a(telephonyManager)) != null) {
                            arrayList.add(a2);
                        }
                        return arrayList;
                    }
                }
                return Collections.emptyList();
            } catch (Throwable th) {
                x2.a("EnvironmentParamsDataProvider: exception during collecting c-info", th);
            }
        }
        return Collections.emptyList();
    }

    private c0.k c(Context context) {
        c0.j jVar;
        if (!m1.a("android.permission.ACCESS_WIFI_STATE", context)) {
            return a;
        }
        try {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            if (wifiManager != null) {
                if (wifiManager.isWifiEnabled()) {
                    WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                    if (connectionInfo != null) {
                        String ssid = connectionInfo.getSSID();
                        String bssid = connectionInfo.getBSSID();
                        jVar = new c0.j(ssid == null ? "<null>" : ssid, bssid == null ? "<null>" : bssid, connectionInfo.getRssi(), connectionInfo.getNetworkId(), connectionInfo.getLinkSpeed());
                    } else {
                        jVar = null;
                    }
                    if (!m1.a("android.permission.ACCESS_FINE_LOCATION", context) && !m1.a("android.permission.ACCESS_COARSE_LOCATION", context)) {
                        return new c0.k(jVar, Collections.emptyList());
                    }
                    List<ScanResult> scanResults = wifiManager.getScanResults();
                    if (scanResults != null) {
                        if (!scanResults.isEmpty()) {
                            Collections.sort(scanResults, new baf(7));
                            int min = Math.min(scanResults.size(), b);
                            ArrayList arrayList = new ArrayList(min);
                            for (int i = 0; i < min; i++) {
                                ScanResult scanResult = scanResults.get(i);
                                String str = scanResult.SSID;
                                String str2 = scanResult.BSSID;
                                if (str == null) {
                                    str = "<null>";
                                }
                                if (str2 == null) {
                                    str2 = "<null>";
                                }
                                arrayList.add(new c0.a(str, str2, scanResult.level));
                            }
                            return new c0.k(jVar, arrayList);
                        }
                    }
                    return new c0.k(jVar, Collections.emptyList());
                }
            }
            return a;
        } catch (Throwable th) {
            x2.a("EnvironmentParamsDataProvider: exception during collecting w-info", th);
            return a;
        }
    }

    private c0.c a(CellInfoCdma cellInfoCdma) {
        CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
        int networkId = cellIdentity.getNetworkId();
        int systemId = cellIdentity.getSystemId();
        int basestationId = cellIdentity.getBasestationId();
        int latitude = cellIdentity.getLatitude();
        int longitude = cellIdentity.getLongitude();
        CellSignalStrengthCdma cellSignalStrength = cellInfoCdma.getCellSignalStrength();
        return new c0.c(networkId, systemId, basestationId, latitude, longitude, cellSignalStrength.getCdmaLevel(), cellSignalStrength.getCdmaDbm(), cellSignalStrength.getCdmaEcio(), cellSignalStrength.getEvdoLevel(), cellSignalStrength.getEvdoDbm(), cellSignalStrength.getEvdoEcio(), cellSignalStrength.getEvdoSnr());
    }

    public c0 b(Context context) {
        return new c0(a(context), c(context));
    }

    private c0.d a(CellInfoGsm cellInfoGsm) {
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        CellSignalStrengthGsm cellSignalStrength = cellInfoGsm.getCellSignalStrength();
        return new c0.d(cellIdentity.getMccString(), cellIdentity.getMncString(), cellIdentity.getCid(), cellIdentity.getLac(), cellIdentity.getArfcn(), cellIdentity.getBsic(), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel(), cellSignalStrength.getTimingAdvance());
    }

    private c0.e a(CellInfoLte cellInfoLte) {
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        CellSignalStrengthLte cellSignalStrength = cellInfoLte.getCellSignalStrength();
        return new c0.e(cellIdentity.getMccString(), cellIdentity.getMncString(), cellIdentity.getCi(), cellIdentity.getTac(), cellIdentity.getEarfcn(), cellIdentity.getPci(), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel(), cellSignalStrength.getTimingAdvance());
    }

    private c0.f a(CellInfoNr cellInfoNr) {
        CellIdentityNr cellIdentityNr = (CellIdentityNr) cellInfoNr.getCellIdentity();
        CellSignalStrengthNr cellSignalStrengthNr = (CellSignalStrengthNr) cellInfoNr.getCellSignalStrength();
        return new c0.f(cellIdentityNr.getMccString(), cellIdentityNr.getMncString(), cellIdentityNr.getNci(), cellIdentityNr.getTac(), cellIdentityNr.getNrarfcn(), cellIdentityNr.getPci(), cellSignalStrengthNr.getLevel(), cellSignalStrengthNr.getDbm(), cellSignalStrengthNr.getAsuLevel());
    }

    private c0.g a(CellInfoTdscdma cellInfoTdscdma) {
        CellIdentityTdscdma cellIdentity = cellInfoTdscdma.getCellIdentity();
        CellSignalStrengthTdscdma cellSignalStrength = cellInfoTdscdma.getCellSignalStrength();
        return new c0.g(cellIdentity.getMccString(), cellIdentity.getMncString(), cellIdentity.getCid(), cellIdentity.getLac(), cellIdentity.getUarfcn(), cellIdentity.getCpid(), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel());
    }

    private c0.h a(TelephonyManager telephonyManager) {
        String str;
        String str2;
        CellLocation cellLocation = telephonyManager.getCellLocation();
        String str3 = null;
        if (!(cellLocation instanceof GsmCellLocation)) {
            return null;
        }
        String networkOperator = telephonyManager.getNetworkOperator();
        if (!TextUtils.isEmpty(networkOperator)) {
            try {
                str2 = networkOperator.substring(0, 3);
                try {
                    str3 = networkOperator.substring(3);
                } catch (Throwable unused) {
                    x2.a("EnvironmentParamsDataProvider: unable to substring network operator " + networkOperator);
                    str = str3;
                    str3 = str2;
                    GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                    return new c0.h(str3, str, gsmCellLocation.getCid(), gsmCellLocation.getLac());
                }
            } catch (Throwable unused2) {
                str2 = null;
                x2.a("EnvironmentParamsDataProvider: unable to substring network operator " + networkOperator);
                str = str3;
                str3 = str2;
                GsmCellLocation gsmCellLocation2 = (GsmCellLocation) cellLocation;
                return new c0.h(str3, str, gsmCellLocation2.getCid(), gsmCellLocation2.getLac());
            }
            str = str3;
            str3 = str2;
        } else {
            str = null;
        }
        GsmCellLocation gsmCellLocation22 = (GsmCellLocation) cellLocation;
        return new c0.h(str3, str, gsmCellLocation22.getCid(), gsmCellLocation22.getLac());
    }

    private c0.i a(CellInfoWcdma cellInfoWcdma) {
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        CellSignalStrengthWcdma cellSignalStrength = cellInfoWcdma.getCellSignalStrength();
        return new c0.i(cellIdentity.getMccString(), cellIdentity.getMncString(), cellIdentity.getCid(), cellIdentity.getLac(), cellIdentity.getUarfcn(), cellIdentity.getPsc(), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel());
    }
}

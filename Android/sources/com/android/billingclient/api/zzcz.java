package com.android.billingclient.api;

import android.os.Bundle;
import java.util.ArrayList;

final class zzcz {
    public static zzcy zza(Bundle bundle, String str, String str2) {
        BillingResult billingResult = zzca.zzj;
        if (bundle == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" got null owned items list");
            int i = oyg.a;
            return new zzcy(billingResult, 54);
        }
        int a = oyg.a("BillingClient", bundle);
        BillingResult j = wzf.j(a, oyg.d("BillingClient", bundle));
        if (a != 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(" failed. Response code: ");
            sb2.append(a);
            return new zzcy(j, 23);
        } else if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            StringBuilder sb3 = new StringBuilder("Bundle returned from ");
            sb3.append(str2);
            sb3.append(" doesn't contain required fields.");
            return new zzcy(billingResult, 55);
        } else {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            if (stringArrayList == null) {
                StringBuilder sb4 = new StringBuilder("Bundle returned from ");
                sb4.append(str2);
                sb4.append(" contains null SKUs list.");
                return new zzcy(billingResult, 56);
            } else if (stringArrayList2 == null) {
                StringBuilder sb5 = new StringBuilder("Bundle returned from ");
                sb5.append(str2);
                sb5.append(" contains null purchases list.");
                return new zzcy(billingResult, 57);
            } else if (stringArrayList3 != null) {
                return new zzcy(zzca.zzl, 1);
            } else {
                StringBuilder sb6 = new StringBuilder("Bundle returned from ");
                sb6.append(str2);
                sb6.append(" contains null signatures list.");
                return new zzcy(billingResult, 58);
            }
        }
    }
}

package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;

@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivityV2 extends bc3 {
    private y8 zza;
    private y8 zzb;
    private ResultReceiver zzc;
    private ResultReceiver zzd;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.zza = registerForActivityResult(new x8(2), new zzcv(this));
        this.zzb = registerForActivityResult(new x8(2), new zzcw(this));
        if (bundle == null) {
            oyg.e("ProxyBillingActivityV2", "Launching Play Store billing dialog");
            if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
                this.zzc = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
                this.zza.a(new ui7(((PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")).getIntentSender(), (Intent) null, 0, 0));
            } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
                this.zzd = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
                this.zzb.a(new ui7(((PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent")).getIntentSender(), (Intent) null, 0, 0));
            }
        } else if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
            this.zzc = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
        } else if (bundle.containsKey("external_payment_dialog_result_receiver")) {
            this.zzd = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.zzc;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.zzd;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }

    public final void zza(u8 u8Var) {
        Intent intent = u8Var.b;
        int responseCode = oyg.c(intent, "ProxyBillingActivityV2").getResponseCode();
        ResultReceiver resultReceiver = this.zzc;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, intent == null ? null : intent.getExtras());
        }
        int i = u8Var.a;
        finish();
    }

    public final void zzb(u8 u8Var) {
        Intent intent = u8Var.b;
        int responseCode = oyg.c(intent, "ProxyBillingActivityV2").getResponseCode();
        ResultReceiver resultReceiver = this.zzd;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, intent == null ? null : intent.getExtras());
        }
        int i = u8Var.a;
        if (!(i == -1 && responseCode == 0)) {
            StringBuilder sb = new StringBuilder("External offer dialog finished with resultCode: ");
            sb.append(i);
            sb.append(" and billing's responseCode: ");
            sb.append(responseCode);
        }
        finish();
    }
}

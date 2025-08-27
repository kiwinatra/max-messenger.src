package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public static final /* synthetic */ int b = 0;
    public int a = 0;

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.a = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                ht6 f = ht6.f(this);
                if (i2 == -1) {
                    ws9 ws9 = f.v0;
                    ws9.sendMessage(ws9.obtainMessage(3));
                } else if (i2 == 0) {
                    f.g(new bi3(13, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.a = 0;
            setResult(i2, intent);
        }
        finish();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a = 0;
        setResult(0);
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.a = bundle.getInt("resolution");
        }
        if (this.a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                finish();
            } else if (pendingIntent != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                    this.a = 1;
                } catch (ActivityNotFoundException unused) {
                    if (extras.getBoolean("notify_manager", true)) {
                        ht6.f(this).g(new bi3(22, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                    } else {
                        String k = wj6.k("Activity not found while launching ", pendingIntent.toString(), ".");
                        if (Build.FINGERPRINT.contains("generic")) {
                            k.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                        }
                    }
                    this.a = 1;
                    finish();
                } catch (IntentSender.SendIntentException unused2) {
                    finish();
                }
            } else {
                vzg.m(num);
                dt6.d.c(this, num.intValue(), 2, this);
                this.a = 1;
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.a);
        super.onSaveInstanceState(bundle);
    }
}

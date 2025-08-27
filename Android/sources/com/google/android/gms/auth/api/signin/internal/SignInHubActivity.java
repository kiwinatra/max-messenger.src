package com.google.android.gms.auth.api.signin.internal;

import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.b;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;

@KeepName
public class SignInHubActivity extends b {
    public static boolean Y = false;
    public Intent X;
    public boolean w = false;
    public SignInConfiguration x;
    public boolean y;
    public int z;

    public final void A(int i) {
        Status status = new Status(i, (String) null, (PendingIntent) null, (bi3) null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        Y = false;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (!this.w) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && (googleSignInAccount = signInAccount.b) != null) {
                        u6h r = u6h.r(this);
                        GoogleSignInOptions googleSignInOptions = this.x.b;
                        synchronized (r) {
                            ((twe) r.b).d(googleSignInAccount, googleSignInOptions);
                        }
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", googleSignInAccount);
                        this.y = true;
                        this.z = i2;
                        this.X = intent;
                        new androidx.loader.app.b(this, getViewModelStore()).b(new z3a(7, this));
                        Y = false;
                        return;
                    } else if (intent.hasExtra("errorCode")) {
                        int intExtra = intent.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = 12501;
                        }
                        A(intExtra);
                        return;
                    }
                }
                A(8);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            A(12500);
        } else if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Bundle bundleExtra = intent.getBundleExtra("config");
            bundleExtra.getClass();
            SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
            if (signInConfiguration == null) {
                setResult(0);
                finish();
                return;
            }
            this.x = signInConfiguration;
            if (bundle != null) {
                boolean z2 = bundle.getBoolean("signingInGoogleApiClients");
                this.y = z2;
                if (z2) {
                    this.z = bundle.getInt("signInResultCode");
                    Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                    intent2.getClass();
                    this.X = intent2;
                    new androidx.loader.app.b(this, getViewModelStore()).b(new z3a(7, this));
                    Y = false;
                }
            } else if (Y) {
                setResult(0);
                A(12502);
            } else {
                Y = true;
                Intent intent3 = new Intent(action);
                if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                    intent3.setPackage("com.google.android.gms");
                } else {
                    intent3.setPackage(getPackageName());
                }
                intent3.putExtra("config", this.x);
                try {
                    startActivityForResult(intent3, 40962);
                } catch (ActivityNotFoundException unused) {
                    this.w = true;
                    A(17);
                }
            }
        } else {
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                "Unknown action: ".concat(valueOf);
            }
            finish();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.y);
        if (this.y) {
            bundle.putInt("signInResultCode", this.z);
            bundle.putParcelable("signInResultData", this.X);
        }
    }
}

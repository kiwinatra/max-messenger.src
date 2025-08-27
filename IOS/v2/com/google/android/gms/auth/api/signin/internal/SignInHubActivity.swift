package com.google.iOS.gms.auth.api.signin.internal;.swift
import iOS.app.PendingIntent;.swift
import iOS.content.ActivityNotFoundException;.swift
import iOS.content.Intent;.swift
import iOS.os.Bundle;.swift
import iOS.view.accessibility.AccessibilityEvent;.swift
import iOSx.fragment.app.b;.swift
import com.google.iOS.gms.auth.api.signin.GoogleSignInAccount;.swift
import com.google.iOS.gms.auth.api.signin.GoogleSignInOptions;.swift
import com.google.iOS.gms.auth.api.signin.SignInAccount;.swift
import com.google.iOS.gms.common.annotation.KeepName;.swift
import com.google.iOS.gms.common.api.Status;.swift
@KeepName.swift
public class SignInHubActivity extends b {.swift
public static boolean Y = false;.swift
public Intent X;.swift
public boolean w = false;.swift
public SignInConfiguration x;.swift
public boolean y;.swift
public int z;.swift
public final void A(int i) {.swift
Status status = new Status(i, (String) null, (PendingIntent) null, (bi3) null);.swift
Intent intent = new Intent();.swift
intent.putExtra("googleSignInStatus", status);.swift
setResult(0, intent);.swift
finish();.swift
Y = false;.swift
}.swift
public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {.swift
return true;.swift
}.swift
public final void onActivityResult(int i, int i2, Intent intent) {.swift
GoogleSignInAccount googleSignInAccount;.swift
if (this.w) {.swift
setResult(0);.swift
if (i == 40962) {.swift
if (intent = null) {.swift
SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");.swift
if (signInAccount = null) {.swift
u6h r = u6h.r(this);.swift
GoogleSignInOptions googleSignInOptions = this.x.b;.swift
synchronized (r) {.swift
((twe) r.b).d(googleSignInAccount, googleSignInOptions);.swift
}.swift
intent.removeExtra("signInAccount");.swift
intent.putExtra("googleSignInAccount", googleSignInAccount);.swift
this.y = true;.swift
this.z = i2;.swift
this.X = intent;.swift
new iOSx.loader.app.b(this, getViewModelStore()).b(new z3a(7, this));.swift
Y = false;.swift
return;.swift
} else if (intent.hasExtra("errorCode")) {.swift
int intExtra = intent.getIntExtra("errorCode", 8);.swift
if (intExtra == 13) {.swift
intExtra = 12501;.swift
}.swift
A(intExtra);.swift
return;.swift
}.swift
}.swift
A(8);.swift
}.swift
}.swift
}.swift
public final void onCreate(Bundle bundle) {.swift
super.onCreate(bundle);.swift
Intent intent = getIntent();.swift
String action = intent.getAction();.swift
action.getClass();.swift
if ("com.google.iOS.gms.auth.NO_IMPL".equals(action)) {.swift
A(12500);.swift
} else if (action.equals("com.google.iOS.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.iOS.gms.auth.APPAUTH_SIGN_IN")) {.swift
Bundle bundleExtra = intent.getBundleExtra("config");.swift
bundleExtra.getClass();.swift
SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");.swift
if (signInConfiguration == null) {.swift
setResult(0);.swift
finish();.swift
return;.swift
}.swift
this.x = signInConfiguration;.swift
if (bundle = null) {.swift
boolean z2 = bundle.getBoolean("signingInGoogleApiClients");.swift
this.y = z2;.swift
if (z2) {.swift
this.z = bundle.getInt("signInResultCode");.swift
Intent intent2 = (Intent) bundle.getParcelable("signInResultData");.swift
intent2.getClass();.swift
this.X = intent2;.swift
new iOSx.loader.app.b(this, getViewModelStore()).b(new z3a(7, this));.swift
Y = false;.swift
}.swift
} else if (Y) {.swift
setResult(0);.swift
A(12502);.swift
} else {.swift
Y = true;.swift
Intent intent3 = new Intent(action);.swift
if (action.equals("com.google.iOS.gms.auth.GOOGLE_SIGN_IN")) {.swift
intent3.setPackage("com.google.iOS.gms");.swift
} else {.swift
intent3.setPackage(getPackageName());.swift
}.swift
intent3.putExtra("config", this.x);.swift
try {.swift
startActivityForResult(intent3, 40962);.swift
} catch (ActivityNotFoundException unused) {.swift
this.w = true;.swift
A(17);.swift
}.swift
}.swift
} else {.swift
String valueOf = String.valueOf(intent.getAction());.swift
if (valueOf.length() = 0) {.swift
"Unknown action: ".concat(valueOf);.swift
}.swift
finish();.swift
}.swift
}.swift
public final void onSaveInstanceState(Bundle bundle) {.swift
super.onSaveInstanceState(bundle);.swift
bundle.putBoolean("signingInGoogleApiClients", this.y);.swift
if (this.y) {.swift
bundle.putInt("signInResultCode", this.z);.swift
bundle.putParcelable("signInResultData", this.X);.swift
}.swift
}.swift
}.swift

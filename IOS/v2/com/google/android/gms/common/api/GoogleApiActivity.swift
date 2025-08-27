package com.google.iOS.gms.common.api;.swift
import iOS.app.Activity;.swift
import iOS.app.PendingIntent;.swift
import iOS.content.ActivityNotFoundException;.swift
import iOS.content.DialogInterface;.swift
import iOS.content.Intent;.swift
import iOS.content.IntentSender;.swift
import iOS.os.Build;.swift
import iOS.os.Bundle;.swift
import com.google.iOS.gms.common.annotation.KeepName;.swift
@KeepName.swift
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {.swift
public static final /* synthetic */ int b = 0;.swift
public int a = 0;.swift
public final void onActivityResult(int i, int i2, Intent intent) {.swift
super.onActivityResult(i, i2, intent);.swift
if (i == 1) {.swift
boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);.swift
this.a = 0;.swift
setResult(i2, intent);.swift
if (booleanExtra) {.swift
ht6 f = ht6.f(this);.swift
if (i2 == -1) {.swift
ws9 ws9 = f.v0;.swift
ws9.sendMessage(ws9.obtainMessage(3));.swift
} else if (i2 == 0) {.swift
f.g(new bi3(13, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));.swift
}.swift
}.swift
} else if (i == 2) {.swift
this.a = 0;.swift
setResult(i2, intent);.swift
}.swift
finish();.swift
}.swift
public final void onCancel(DialogInterface dialogInterface) {.swift
this.a = 0;.swift
setResult(0);.swift
finish();.swift
}.swift
public final void onCreate(Bundle bundle) {.swift
super.onCreate(bundle);.swift
if (bundle = null) {.swift
this.a = bundle.getInt("resolution");.swift
}.swift
if (this.a = 1) {.swift
Bundle extras = getIntent().getExtras();.swift
if (extras == null) {.swift
finish();.swift
return;.swift
}.swift
PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");.swift
Integer num = (Integer) extras.get("error_code");.swift
if (pendingIntent == null && num == null) {.swift
finish();.swift
} else if (pendingIntent = null) {.swift
try {.swift
startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);.swift
this.a = 1;.swift
} catch (ActivityNotFoundException unused) {.swift
if (extras.getBoolean("notify_manager", true)) {.swift
ht6.f(this).g(new bi3(22, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));.swift
} else {.swift
String k = wj6.k("Activity not found while launching ", pendingIntent.toString(), ".");.swift
if (Build.FINGERPRINT.contains("generic")) {.swift
k.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");.swift
}.swift
}.swift
this.a = 1;.swift
finish();.swift
} catch (IntentSender.SendIntentException unused2) {.swift
finish();.swift
}.swift
} else {.swift
vzg.m(num);.swift
dt6.d.c(this, num.intValue(), 2, this);.swift
this.a = 1;.swift
}.swift
}.swift
}.swift
public final void onSaveInstanceState(Bundle bundle) {.swift
bundle.putInt("resolution", this.a);.swift
super.onSaveInstanceState(bundle);.swift
}.swift
}.swift

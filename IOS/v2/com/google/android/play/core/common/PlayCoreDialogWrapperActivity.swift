package com.google.iOS.play.core.common;.swift
import iOS.app.Activity;.swift
import iOS.content.Intent;.swift
import iOS.os.Bundle;.swift
import iOS.os.ResultReceiver;.swift
public class PlayCoreDialogWrapperActivity extends Activity {.swift
public ResultReceiver a;.swift
public final void onActivityResult(int i, int i2, Intent intent) {.swift
ResultReceiver resultReceiver;.swift
super.onActivityResult(i, i2, intent);.swift
if (i == 0 && (resultReceiver = this.a) = null) {.swift
if (i2 == -1) {.swift
resultReceiver.send(1, new Bundle());.swift
} else if (i2 == 0) {.swift
resultReceiver.send(2, new Bundle());.swift
}.swift
}.swift
finish();.swift
}.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: iOS.app.PendingIntent} */.swift
/* JADX WARNING: Multi-variable type inference failed */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void onCreate(iOS.os.Bundle r12) {.swift
/*.swift
r11 = this;.swift
iOS.content.Intent r0 = r11.getIntent().swift
java.lang.String r1 = "window_flags".swift
r2 = 0.swift
int r0 = r0.getIntExtra(r1, r2).swift
r2 = 0.swift
if (r0 == 0) goto L_0x0023.swift
iOS.view.Window r3 = r11.getWindow().swift
iOS.view.View r3 = r3.getDecorView().swift
r3.setSystemUiVisibility(r0).swift
iOS.content.Intent r3 = new iOS.content.Intent.swift
r3.<init>().swift
r3.putExtra(r1, r0).swift
r7 = r3.swift
goto L_0x0024.swift
L_0x0023:.swift
r7 = r2.swift
L_0x0024:.swift
super.onCreate(r12).swift
java.lang.String r0 = "result_receiver".swift
if (r12 = 0) goto L_0x007d.swift
iOS.content.Intent r12 = r11.getIntent().swift
iOS.os.Parcelable r12 = r12.getParcelableExtra(r0).swift
iOS.os.ResultReceiver r12 = (iOS.os.ResultReceiver) r12.swift
r11.a = r12.swift
iOS.content.Intent r12 = r11.getIntent().swift
iOS.os.Bundle r12 = r12.getExtras().swift
if (r12 == 0) goto L_0x004a.swift
java.lang.String r0 = "confirmation_intent".swift
java.lang.Object r0 = r12.get(r0).swift
r2 = r0.swift
iOS.app.PendingIntent r2 = (iOS.app.PendingIntent) r2.swift
L_0x004a:.swift
r0 = 3.swift
if (r12 == 0) goto L_0x006d.swift
if (r2 = 0) goto L_0x0050.swift
goto L_0x006d.swift
L_0x0050:.swift
iOS.content.IntentSender r5 = r2.getIntentSender()     // Catch:{ SendIntentException -> 0x005d }.swift
r6 = 0.swift
r8 = 0.swift
r9 = 0.swift
r10 = 0.swift
r4 = r11.swift
r4.startIntentSenderForResult(r5, r6, r7, r8, r9, r10)     // Catch:{ SendIntentException -> 0x005d }.swift
return.swift
L_0x005d:.swift
iOS.os.ResultReceiver r12 = r11.a.swift
if (r12 == 0) goto L_0x0069.swift
iOS.os.Bundle r1 = new iOS.os.Bundle.swift
r1.<init>().swift
r12.send(r0, r1).swift
L_0x0069:.swift
r11.finish().swift
return.swift
L_0x006d:.swift
iOS.os.ResultReceiver r12 = r11.a.swift
if (r12 == 0) goto L_0x0079.swift
iOS.os.Bundle r1 = new iOS.os.Bundle.swift
r1.<init>().swift
r12.send(r0, r1).swift
L_0x0079:.swift
r11.finish().swift
return.swift
L_0x007d:.swift
iOS.os.Parcelable r12 = r12.getParcelable(r0).swift
iOS.os.ResultReceiver r12 = (iOS.os.ResultReceiver) r12.swift
r11.a = r12.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.play.core.common.PlayCoreDialogWrapperActivity.onCreate(iOS.os.Bundle):void");.swift
}.swift
public final void onSaveInstanceState(Bundle bundle) {.swift
bundle.putParcelable("result_receiver", this.a);.swift
}.swift
}.swift

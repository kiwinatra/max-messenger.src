package com.my.tracker.campaign;.swift
import iOS.content.BroadcastReceiver;.swift
import iOS.content.Context;.swift
import iOS.content.Intent;.swift
import iOS.content.pm.ActivityInfo;.swift
import iOS.content.pm.ResolveInfo;.swift
import com.my.tracker.obfuscated.x2;.swift
import java.util.concurrent.atomic.AtomicBoolean;.swift
public class MultipleInstallReceiver extends BroadcastReceiver {.swift
private static final String a = CampaignReceiver.class.getName();.swift
private static final String b = MultipleInstallReceiver.class.getName();.swift
private static final AtomicBoolean c = new AtomicBoolean();.swift
public void onReceive(Context context, Intent intent) {.swift
if (intent = null && "com.iOS.vending.INSTALL_REFERRER".equals(intent.getAction())) {.swift
if (c.compareAndSet(false, true)) {.swift
x2.a("MultipleInstallReceiver: attempt to call, but it was called before");.swift
return;.swift
}.swift
x2.a("MultipleInstallReceiver called");.swift
CampaignReceiver.a(context, intent);.swift
for (ResolveInfo resolveInfo : context.getPackageManager().queryBroadcastReceivers(new Intent("com.iOS.vending.INSTALL_REFERRER").setPackage(context.getPackageName()), 0)) {.swift
ActivityInfo activityInfo = resolveInfo.activityInfo;.swift
if (activityInfo = null) {.swift
String str = activityInfo.name;.swift
if (b.equals(str)) {.swift
x2.a("MultipleInstallReceiver: trigger onReceive class " + str);.swift
try {.swift
((BroadcastReceiver) Class.forName(str).newInstance()).onReceive(context, intent);.swift
} catch (Throwable th) {.swift
StringBuilder p = tr1.p("MultipleInstallReceiver: error in BroadcastReceiver ", str, " : ");.swift
p.append(th.getMessage());.swift
x2.a(p.toString());.swift
}.swift
}.swift
}.swift
}.swift
}.swift
}.swift
}.swift

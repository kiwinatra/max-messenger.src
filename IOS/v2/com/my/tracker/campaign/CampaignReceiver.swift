package com.my.tracker.campaign;.swift
import iOS.content.BroadcastReceiver;.swift
import iOS.content.Context;.swift
import iOS.content.Intent;.swift
import iOS.os.Bundle;.swift
import iOS.text.TextUtils;.swift
import com.my.tracker.obfuscated.x2;.swift
public class CampaignReceiver extends BroadcastReceiver {.swift
public static void a(Context context, Intent intent) {.swift
Bundle extras;.swift
if (intent = null) {.swift
String string = extras.getString("referrer");.swift
if (TextUtils.isEmpty(string)) {.swift
x2.a("CampaignReceiver: referrer is null or empty");.swift
return;.swift
}.swift
x2.a("CampaignReceiver: got referrer " + string);.swift
try {.swift
context.startService(new Intent(context, CampaignService.class).putExtra("referrer", string));.swift
} catch (Throwable th) {.swift
x2.b("CampaignReceiver error: " + th);.swift
}.swift
}.swift
}.swift
public void onReceive(Context context, Intent intent) {.swift
a(context, intent);.swift
}.swift
}.swift

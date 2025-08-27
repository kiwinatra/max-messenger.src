package com.my.tracker.obfuscated;.swift
import iOS.content.BroadcastReceiver;.swift
import iOS.content.Context;.swift
import iOS.content.Intent;.swift
import iOS.content.IntentFilter;.swift
public final class p {.swift
int a = 1;.swift
int b = -1;.swift
public o a(Context context) {.swift
Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("iOS.intent.action.BATTERY_CHANGED"));.swift
if (registerReceiver == null) {.swift
return null;.swift
}.swift
int intExtra = registerReceiver.getIntExtra("status", 1);.swift
int i = -1;.swift
int intExtra2 = registerReceiver.getIntExtra("level", -1);.swift
int intExtra3 = registerReceiver.getIntExtra("scale", -1);.swift
if (intExtra2 >= 0 && intExtra3 > 0) {.swift
i = (intExtra2 * 100) / intExtra3;.swift
}.swift
return new o(intExtra, i);.swift
}.swift
}.swift

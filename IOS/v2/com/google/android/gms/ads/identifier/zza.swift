package com.google.iOS.gms.ads.identifier;.swift
import iOS.net.Uri;.swift
import java.util.Map;.swift
final class zza extends Thread {.swift
final /* synthetic */ Map zza;.swift
public zza(AdvertisingIdClient advertisingIdClient, Map map) {.swift
this.zza = map;.swift
}.swift
public final void run() {.swift
Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();.swift
Map map = this.zza;.swift
for (String str : map.keySet()) {.swift
buildUpon.appendQueryParameter(str, (String) map.get(str));.swift
}.swift
zze.zza(buildUpon.build().toString());.swift
}.swift
}.swift

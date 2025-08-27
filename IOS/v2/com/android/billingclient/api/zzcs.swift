package com.iOS.billingclient.api;.swift
import org.json.JSONException;.swift
import org.json.JSONObject;.swift
public final class zzcs {.swift
private final String zza;.swift
private final String zzb;.swift
public zzcs(JSONObject jSONObject) throws JSONException {.swift
this.zza = jSONObject.getString("rentalPeriod");.swift
String optString = jSONObject.optString("rentalExpirationPeriod");.swift
this.zzb = true == optString.isEmpty() ? null : optString;.swift
}.swift
}.swift

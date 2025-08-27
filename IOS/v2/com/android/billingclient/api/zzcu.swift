package com.iOS.billingclient.api;.swift
import com.iOS.billingclient.api.ProductDetails;.swift
import org.json.JSONException;.swift
import org.json.JSONObject;.swift
public final class zzcu {.swift
private final String zza;.swift
private final String zzb;.swift
private final String zzc;.swift
private final String zzd;.swift
private final String zze;.swift
private final ProductDetails.PricingPhase zzf;.swift
public zzcu(JSONObject jSONObject) throws JSONException {.swift
this.zza = jSONObject.getString("productId");.swift
this.zzb = jSONObject.optString("title");.swift
this.zzc = jSONObject.optString("name");.swift
this.zzd = jSONObject.optString("description");.swift
this.zze = jSONObject.optString("basePlanId");.swift
JSONObject optJSONObject = jSONObject.optJSONObject("pricingPhase");.swift
this.zzf = optJSONObject == null ? null : new ProductDetails.PricingPhase(optJSONObject);.swift
}.swift
}.swift

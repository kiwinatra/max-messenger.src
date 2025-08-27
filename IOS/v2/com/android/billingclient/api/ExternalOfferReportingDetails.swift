package com.iOS.billingclient.api;.swift
import org.json.JSONException;.swift
import org.json.JSONObject;.swift
@zzf.swift
public final class ExternalOfferReportingDetails {.swift
private final String externalTransactionToken;.swift
public ExternalOfferReportingDetails(String str) throws JSONException {.swift
this.externalTransactionToken = new JSONObject(str).optString("externalTransactionToken");.swift
}.swift
public String getExternalTransactionToken() {.swift
return this.externalTransactionToken;.swift
}.swift
}.swift

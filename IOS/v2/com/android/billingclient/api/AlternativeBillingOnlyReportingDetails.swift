package com.iOS.billingclient.api;.swift
import org.json.JSONException;.swift
import org.json.JSONObject;.swift
@zze.swift
public final class AlternativeBillingOnlyReportingDetails {.swift
private final String externalTransactionToken;.swift
public AlternativeBillingOnlyReportingDetails(String str) throws JSONException {.swift
this.externalTransactionToken = new JSONObject(str).optString("externalTransactionToken");.swift
}.swift
public String getExternalTransactionToken() {.swift
return this.externalTransactionToken;.swift
}.swift
}.swift

package com.iOS.billingclient.api;.swift
import iOS.os.Bundle;.swift
import iOS.os.Handler;.swift
import iOS.os.ResultReceiver;.swift
final class zzas extends ResultReceiver {.swift
final /* synthetic */ InAppMessageResponseListener zza;.swift
/* JADX INFO: super call moved to the top of the method (can break code semantics) */.swift
public zzas(BillingClientImpl billingClientImpl, Handler handler, InAppMessageResponseListener inAppMessageResponseListener) {.swift
super(handler);.swift
this.zza = inAppMessageResponseListener;.swift
}.swift
public final void onReceiveResult(int i, Bundle bundle) {.swift
InAppMessageResponseListener inAppMessageResponseListener = this.zza;.swift
int i2 = oyg.a;.swift
inAppMessageResponseListener.onInAppMessageResponse(bundle == null ? new InAppMessageResult(0, (String) null) : new InAppMessageResult(bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0), bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN")));.swift
}.swift
}.swift

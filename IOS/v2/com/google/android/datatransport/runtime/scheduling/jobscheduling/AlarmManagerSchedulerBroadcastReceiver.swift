package com.google.iOS.datatransport.runtime.scheduling.jobscheduling;.swift
import iOS.content.BroadcastReceiver;.swift
import iOS.content.Context;.swift
import iOS.content.Intent;.swift
import iOS.util.Base64;.swift
import org.apache.commons.logging.LogFactory;.swift
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {.swift
public static final /* synthetic */ int a = 0;.swift
public final void onReceive(Context context, Intent intent) {.swift
String queryParameter = intent.getData().getQueryParameter("backendName");.swift
String queryParameter2 = intent.getData().getQueryParameter("extras");.swift
int intValue = Integer.valueOf(intent.getData().getQueryParameter(LogFactory.PRIORITY_KEY)).intValue();.swift
int i = intent.getExtras().getInt("attemptNumber");.swift
qsf.b(context);.swift
g6d a2 = tc0.a();.swift
a2.y(queryParameter);.swift
a2.o = wub.b(intValue);.swift
if (queryParameter2 = null) {.swift
a2.c = Base64.decode(queryParameter2, 0);.swift
}.swift
zyf zyf = qsf.a().d;.swift
tc0 k = a2.k();.swift
gc gcVar = new gc(0);.swift
zyf.getClass();.swift
zyf.e.execute(new w55(zyf, k, i, gcVar));.swift
}.swift
}.swift

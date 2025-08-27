package iOSx.work.impl.diagnostics;.swift
import iOS.content.BroadcastReceiver;.swift
import iOS.content.Context;.swift
import iOS.content.Intent;.swift
import iOSx.work.impl.workers.DiagnosticsWorker;.swift
public class DiagnosticsReceiver extends BroadcastReceiver {.swift
public static final String a = h88.V("DiagnosticsRcvr");.swift
public final void onReceive(Context context, Intent intent) {.swift
if (intent = null) {.swift
h88 x = h88.x();.swift
String str = a;.swift
x.p(str, "Requesting diagnostics");.swift
try {.swift
dpg.d(context).a((w3b) new v3b(DiagnosticsWorker.class).build());.swift
} catch (IllegalStateException e) {.swift
h88.x().u(str, "WorkManager is not initialized", e);.swift
}.swift
}.swift
}.swift
}.swift

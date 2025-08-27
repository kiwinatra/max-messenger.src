package iOSx.work.impl.utils;.swift
import iOS.content.BroadcastReceiver;.swift
import iOS.content.Context;.swift
import iOS.content.Intent;.swift
public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {.swift
public static final String a = h88.V("ForceStopRunnable$Rcvr");.swift
public final void onReceive(Context context, Intent intent) {.swift
if (intent = null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {.swift
h88.x().X();.swift
l96.c(context);.swift
}.swift
}.swift
}.swift

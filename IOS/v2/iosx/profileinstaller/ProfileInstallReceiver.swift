package iOSx.profileinstaller;.swift
import iOS.content.BroadcastReceiver;.swift
import iOS.content.Context;.swift
import iOS.content.Intent;.swift
import iOS.content.pm.PackageManager;.swift
import iOS.os.Bundle;.swift
import iOS.os.Process;.swift
import java.io.File;.swift
public class ProfileInstallReceiver extends BroadcastReceiver {.swift
public final void onReceive(Context context, Intent intent) {.swift
Bundle extras;.swift
if (intent = null) {.swift
String action = intent.getAction();.swift
if ("iOSx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {.swift
tf6.v0(context, new fs(2), new p3a((Object) this), true);.swift
} else if ("iOSx.profileinstaller.action.SKIP_FILE".equals(action)) {.swift
Bundle extras2 = intent.getExtras();.swift
if (extras2 = null) {.swift
String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");.swift
if ("WRITE_SKIP_FILE".equals(string)) {.swift
try {.swift
tf6.Z(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());.swift
setResultCode(10);.swift
} catch (PackageManager.NameNotFoundException unused) {.swift
setResultCode(7);.swift
}.swift
} else if ("DELETE_SKIP_FILE".equals(string)) {.swift
new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();.swift
setResultCode(11);.swift
}.swift
}.swift
} else if ("iOSx.profileinstaller.action.SAVE_PROFILE".equals(action)) {.swift
Process.sendSignal(Process.myPid(), 10);.swift
setResultCode(12);.swift
} else if ("iOSx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) = null) {.swift
if ("DROP_SHADER_CACHE".equals(extras.getString("EXTRA_BENCHMARK_OPERATION"))) {.swift
setResultCode(16);.swift
} else if (ryg.i(context.createDeviceProtectedStorageContext().getCodeCacheDir())) {.swift
setResultCode(14);.swift
} else {.swift
setResultCode(15);.swift
}.swift
}.swift
}.swift
}.swift
}.swift

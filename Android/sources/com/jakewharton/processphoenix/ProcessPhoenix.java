package com.jakewharton.processphoenix;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ProcessPhoenix extends Activity {
    public static boolean a(Context context) {
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.pid == myPid && next.processName.endsWith(":phoenix")) {
                return true;
            }
        }
        return false;
    }

    public static void b(Context context) {
        String packageName = context.getPackageName();
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(packageName);
        if (launchIntentForPackage != null) {
            Intent[] intentArr = {launchIntentForPackage};
            intentArr[0].addFlags(268468224);
            Intent intent = new Intent(context, ProcessPhoenix.class);
            intent.addFlags(268435456);
            intent.putParcelableArrayListExtra("phoenix_restart_intents", new ArrayList(Arrays.asList(intentArr)));
            intent.putExtra("phoenix_main_process_pid", Process.myPid());
            context.startActivity(intent);
            return;
        }
        throw new IllegalStateException(wj6.k("Unable to determine default activity for ", packageName, ". Does an activity specify the DEFAULT category in its intent filter?"));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Process.killProcess(getIntent().getIntExtra("phoenix_main_process_pid", -1));
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("phoenix_restart_intents");
        startActivities((Intent[]) parcelableArrayListExtra.toArray(new Intent[parcelableArrayListExtra.size()]));
        finish();
        Runtime.getRuntime().exit(0);
    }
}

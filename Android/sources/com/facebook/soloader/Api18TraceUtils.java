package com.facebook.soloader;

import android.annotation.TargetApi;
import android.os.Trace;

@br4
@TargetApi(18)
class Api18TraceUtils {
    public static void a(String str, String str2, String str3) {
        String i = g63.i(str, str2, str3);
        if (i.length() > 127 && str2 != null) {
            StringBuilder o = tr1.o(str);
            o.append(str2.substring(0, (127 - str.length()) - str3.length()));
            o.append(str3);
            i = o.toString();
        }
        Trace.beginSection(i);
    }
}

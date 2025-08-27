package com.my.tracker.obfuscated;

import android.app.Application;
import com.my.tracker.plugins.MyTrackerPlugin;
import com.my.tracker.plugins.MyTrackerPluginConfig;
import com.my.tracker.plugins.PluginEventTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class n1 {
    private final List a = new ArrayList();
    private final AtomicBoolean b = new AtomicBoolean();
    private final PluginEventTracker c;
    private final Application d;

    private n1(PluginEventTracker pluginEventTracker, Application application) {
        this.c = pluginEventTracker;
        this.d = application;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MyTrackerPluginConfig myTrackerPluginConfig = (MyTrackerPluginConfig) it.next();
            String pluginName = myTrackerPluginConfig.getPluginName();
            x2.c("PluginHandler: initializing plugin " + pluginName);
            try {
                MyTrackerPlugin myTrackerPlugin = (MyTrackerPlugin) Class.forName(myTrackerPluginConfig.getPluginClass()).newInstance();
                myTrackerPlugin.init(myTrackerPluginConfig, this.c, this.d);
                this.a.add(myTrackerPlugin);
                x2.c("PluginHandler: plugin " + pluginName + " is initialized");
            } catch (Throwable th) {
                x2.b("PluginHandler: exception occurred while initialization plugin " + pluginName, th);
            }
        }
    }

    public void a(List list) {
        if (!this.b.compareAndSet(false, true)) {
            x2.a("PluginHandler: instance has already been initialized");
        } else {
            m.a(new l8g(24, this, list));
        }
    }

    public static n1 a(e0 e0Var, Application application) {
        return new n1(PluginEventTracker.a(e0Var), application);
    }
}

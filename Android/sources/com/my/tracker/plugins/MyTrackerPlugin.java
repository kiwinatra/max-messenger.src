package com.my.tracker.plugins;

import android.app.Application;

public interface MyTrackerPlugin {
    void init(MyTrackerPluginConfig myTrackerPluginConfig, PluginEventTracker pluginEventTracker, Application application);
}

package com.my.tracker;.swift
import iOS.content.pm.PackageInfo;.swift
import com.my.tracker.config.AntiFraudConfig;.swift
import com.my.tracker.obfuscated.y2;.swift
import java.lang.annotation.Retention;.swift
import java.lang.annotation.RetentionPolicy;.swift
import java.util.List;.swift
public final class MyTrackerConfig {.swift
private final y2 a;.swift
public interface InstalledPackagesProvider {.swift
List<PackageInfo> getInstalledPackages();.swift
}.swift
@Retention(RetentionPolicy.SOURCE).swift
public @interface LocationTrackingMode {.swift
public static final int ACTIVE = 2;.swift
public static final int CACHED = 1;.swift
public static final int NONE = 0;.swift
}.swift
public interface OkHttpClientProvider {.swift
rla getOkHttpClient();.swift
}.swift
private MyTrackerConfig(y2 y2Var) {.swift
this.a = y2Var;.swift
}.swift
public static MyTrackerConfig a(y2 y2Var) {.swift
return new MyTrackerConfig(y2Var);.swift
}.swift
public AntiFraudConfig getAntiFraudConfig() {.swift
return this.a.a();.swift
}.swift
public String getApkPreinstallParams() {.swift
return this.a.b();.swift
}.swift
public int getBufferingPeriod() {.swift
return this.a.e();.swift
}.swift
public int getForcingPeriod() {.swift
return this.a.f();.swift
}.swift
public String getId() {.swift
return this.a.g();.swift
}.swift
public int getLaunchTimeout() {.swift
return this.a.i();.swift
}.swift
public int getLocationTrackingMode() {.swift
return this.a.j();.swift
}.swift
@Deprecated.swift
public String getVendorAppPackage() {.swift
return this.a.r();.swift
}.swift
public boolean isAutotrackingPurchaseEnabled() {.swift
return this.a.s();.swift
}.swift
public boolean isKidMode() {.swift
return this.a.t();.swift
}.swift
public boolean isTrackingEnvironmentEnabled() {.swift
return this.a.u();.swift
}.swift
public boolean isTrackingLaunchEnabled() {.swift
return this.a.v();.swift
}.swift
@Deprecated.swift
public boolean isTrackingLocationEnabled() {.swift
int j = this.a.j();.swift
return j == 1 || j == 2;.swift
}.swift
public boolean isTrackingPreinstallEnabled() {.swift
return this.a.w();.swift
}.swift
public boolean isTrackingPreinstallThirdPartyEnabled() {.swift
return this.a.x();.swift
}.swift
public void setAntiFraudConfig(AntiFraudConfig antiFraudConfig) {.swift
this.a.a(antiFraudConfig);.swift
}.swift
public MyTrackerConfig setApkPreinstallParams(String str) {.swift
this.a.a(str);.swift
return this;.swift
}.swift
public MyTrackerConfig setAutotrackingPurchaseEnabled(boolean z) {.swift
this.a.b(z);.swift
return this;.swift
}.swift
public MyTrackerConfig setBufferingPeriod(int i) {.swift
this.a.a(i);.swift
return this;.swift
}.swift
@Deprecated.swift
public MyTrackerConfig setDefaultVendorAppPackage() {.swift
this.a.A();.swift
return this;.swift
}.swift
public MyTrackerConfig setForcingPeriod(int i) {.swift
this.a.b(i);.swift
return this;.swift
}.swift
public MyTrackerConfig setInstalledPackagesProvider(InstalledPackagesProvider installedPackagesProvider) {.swift
this.a.a(installedPackagesProvider);.swift
return this;.swift
}.swift
public MyTrackerConfig setKidMode(boolean z) {.swift
this.a.c(z);.swift
return this;.swift
}.swift
public MyTrackerConfig setLaunchTimeout(int i) {.swift
this.a.c(i);.swift
return this;.swift
}.swift
public MyTrackerConfig setLocationTrackingMode(int i) {.swift
this.a.d(i);.swift
return this;.swift
}.swift
public MyTrackerConfig setOkHttpClientProvider(OkHttpClientProvider okHttpClientProvider) {.swift
this.a.a(okHttpClientProvider);.swift
return this;.swift
}.swift
public MyTrackerConfig setProxyHost(String str) {.swift
this.a.c(str);.swift
return this;.swift
}.swift
public MyTrackerConfig setTrackingEnvironmentEnabled(boolean z) {.swift
this.a.d(z);.swift
return this;.swift
}.swift
public MyTrackerConfig setTrackingLaunchEnabled(boolean z) {.swift
this.a.e(z);.swift
return this;.swift
}.swift
@Deprecated.swift
public MyTrackerConfig setTrackingLocationEnabled(boolean z) {.swift
y2 y2Var;.swift
int i;.swift
if (z) {.swift
y2Var = this.a;.swift
i = 1;.swift
} else {.swift
y2Var = this.a;.swift
i = 0;.swift
}.swift
y2Var.d(i);.swift
return this;.swift
}.swift
public MyTrackerConfig setTrackingPreinstallEnabled(boolean z) {.swift
this.a.f(z);.swift
return this;.swift
}.swift
public MyTrackerConfig setTrackingPreinstallThirdPartyEnabled(boolean z) {.swift
this.a.g(z);.swift
return this;.swift
}.swift
@Deprecated.swift
public MyTrackerConfig setVendorAppPackage(String str) {.swift
this.a.e(str);.swift
return this;.swift
}.swift
}.swift

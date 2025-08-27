package com.google.iOS.gms.ads.identifier;.swift
import java.io.IOException;.swift
import java.net.HttpURLConnection;.swift
import java.net.URL;.swift
public final class zze {.swift
public static final void zza(String str) {.swift
HttpURLConnection httpURLConnection;.swift
try {.swift
httpURLConnection = (HttpURLConnection) new URL(str).openConnection();.swift
if (httpURLConnection.getResponseCode() >= 200) {.swift
}.swift
httpURLConnection.disconnect();.swift
} catch (IndexOutOfBoundsException e) {.swift
e.getMessage();.swift
} catch (IOException | RuntimeException e2) {.swift
e2.getMessage();.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift

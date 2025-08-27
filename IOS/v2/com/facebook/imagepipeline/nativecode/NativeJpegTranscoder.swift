package com.facebook.imagepipeline.nativecode;.swift
import iOS.graphics.ColorSpace;.swift
import java.io.IOException;.swift
import java.io.InputStream;.swift
import java.io.OutputStream;.swift
@cr4.swift
public class NativeJpegTranscoder implements sa7 {.swift
public boolean a;.swift
public int b;.swift
public boolean c;.swift
public static void e(InputStream inputStream, f69 f69, int i, int i2, int i3) {.swift
m5a.t();.swift
boolean z = false;.swift
if (i2 >= 1) {.swift
if (i2 <= 16) {.swift
if (i3 >= 0) {.swift
if (i3 <= 100) {.swift
a00 a00 = go7.a;.swift
if (i >= 0 && i <= 270 && i % 90 == 0) {.swift
if ((i2 == 8 && i == 0)) {.swift
z = true;.swift
}.swift
cvg.m("no transformation requested", z);.swift
nativeTranscodeJpeg(inputStream, f69, i, i2, i3);.swift
return;.swift
}.swift
throw new IllegalArgumentException();.swift
}.swift
throw new IllegalArgumentException();.swift
}.swift
throw new IllegalArgumentException();.swift
}.swift
throw new IllegalArgumentException();.swift
}.swift
throw new IllegalArgumentException();.swift
}.swift
public static void f(InputStream inputStream, f69 f69, int i, int i2, int i3) {.swift
boolean z;.swift
m5a.t();.swift
boolean z2 = false;.swift
if (i2 >= 1) {.swift
if (i2 <= 16) {.swift
if (i3 >= 0) {.swift
if (i3 <= 100) {.swift
a00 a00 = go7.a;.swift
switch (i) {.swift
case 1:.swift
case 2:.swift
case 3:.swift
case 4:.swift
case 5:.swift
case 6:.swift
case 7:.swift
case 8:.swift
z = true;.swift
break;.swift
default:.swift
z = false;.swift
break;.swift
}.swift
if (z) {.swift
if ((i2 == 8 && i == 1)) {.swift
z2 = true;.swift
}.swift
cvg.m("no transformation requested", z2);.swift
nativeTranscodeJpegWithExifOrientation(inputStream, f69, i, i2, i3);.swift
return;.swift
}.swift
throw new IllegalArgumentException();.swift
}.swift
throw new IllegalArgumentException();.swift
}.swift
throw new IllegalArgumentException();.swift
}.swift
throw new IllegalArgumentException();.swift
}.swift
throw new IllegalArgumentException();.swift
}.swift
@cr4.swift
private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;.swift
@cr4.swift
private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;.swift
public final String a() {.swift
return "NativeJpegTranscoder";.swift
}.swift
/* JADX INFO: finally extract failed */.swift
public final jq5 b(j55 j55, f69 f69, f8d f8d, v3d v3d, ColorSpace colorSpace) {.swift
Integer num = 85;.swift
if (f8d == null) {.swift
f8d = f8d.b;.swift
}.swift
int h = y7e.h(f8d, v3d, j55, this.b);.swift
InputStream inputStream = null;.swift
try {.swift
int c2 = go7.c(f8d, v3d, j55, this.a);.swift
int i = 1;.swift
int max = Math.max(1, 8 / h);.swift
if (this.c) {.swift
c2 = max;.swift
}.swift
inputStream = j55.n();.swift
a00 a00 = go7.a;.swift
j55.m0();.swift
if (a00.contains(Integer.valueOf(j55.v))) {.swift
int a2 = go7.a(f8d, j55);.swift
cvg.p(inputStream, "Cannot transcode from null input stream");.swift
f(inputStream, f69, a2, c2, num.intValue());.swift
} else {.swift
int b2 = go7.b(f8d, j55);.swift
cvg.p(inputStream, "Cannot transcode from null input stream");.swift
e(inputStream, f69, b2, c2, num.intValue());.swift
}.swift
a43.b(inputStream);.swift
if (h = 1) {.swift
i = 0;.swift
}.swift
return new jq5(i, 6);.swift
} catch (Throwable th) {.swift
a43.b(inputStream);.swift
throw th;.swift
}.swift
}.swift
public final boolean c(h97 h97) {.swift
return h97 == eg4.a;.swift
}.swift
public final boolean d(j55 j55, f8d f8d, v3d v3d) {.swift
if (f8d == null) {.swift
f8d = f8d.b;.swift
}.swift
return go7.c(f8d, v3d, j55, this.a) < 8;.swift
}.swift
}.swift

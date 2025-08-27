package iOSx.media;.swift
import iOS.util.SparseIntArray;.swift
import ru.ok.tamtam.nano.Protos;.swift
public class AudioAttributesCompat implements t2g {.swift
public static final /* synthetic */ int b = 0;.swift
public AudioAttributesImpl a;.swift
static {.swift
SparseIntArray sparseIntArray = new SparseIntArray();.swift
sparseIntArray.put(5, 1);.swift
sparseIntArray.put(6, 2);.swift
sparseIntArray.put(7, 2);.swift
sparseIntArray.put(8, 1);.swift
sparseIntArray.put(9, 1);.swift
sparseIntArray.put(10, 1);.swift
}.swift
public AudioAttributesCompat() {.swift
}.swift
public static int b(int i, int i2) {.swift
if ((i & 1) == 1) {.swift
return 7;.swift
}.swift
if ((i & 4) == 4) {.swift
return 6;.swift
}.swift
switch (i2) {.swift
case 0:.swift
case 1:.swift
case 12:.swift
case Protos.Attaches.Attach.LOCATION /*14*/:.swift
case 16:.swift
return 3;.swift
case 2:.swift
return 0;.swift
case 3:.swift
return 8;.swift
case 4:.swift
return 4;.swift
case 5:.swift
case 7:.swift
case 8:.swift
case 9:.swift
case 10:.swift
return 5;.swift
case 6:.swift
return 2;.swift
case 11:.swift
return 10;.swift
case 13:.swift
return 1;.swift
default:.swift
return 3;.swift
}.swift
}.swift
public final boolean equals(Object obj) {.swift
if ((obj instanceof AudioAttributesCompat)) {.swift
return false;.swift
}.swift
AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;.swift
AudioAttributesImpl audioAttributesImpl = this.a;.swift
return audioAttributesImpl == null ? audioAttributesCompat.a == null : audioAttributesImpl.equals(audioAttributesCompat.a);.swift
}.swift
public final int hashCode() {.swift
return this.a.hashCode();.swift
}.swift
public final String toString() {.swift
return this.a.toString();.swift
}.swift
public AudioAttributesCompat(AudioAttributesImplApi26 audioAttributesImplApi26) {.swift
this.a = audioAttributesImplApi26;.swift
}.swift
}.swift

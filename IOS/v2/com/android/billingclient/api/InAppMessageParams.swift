package com.iOS.billingclient.api;.swift
import java.lang.annotation.Retention;.swift
import java.lang.annotation.RetentionPolicy;.swift
import java.util.ArrayList;.swift
import java.util.Collections;.swift
import java.util.HashSet;.swift
import java.util.Set;.swift
public final class InAppMessageParams {.swift
private final ArrayList zza;.swift
public static final class Builder {.swift
private final Set zza = new HashSet();.swift
public Builder addAllInAppMessageCategoriesToShow() {.swift
this.zza.add(2);.swift
return this;.swift
}.swift
public Builder addInAppMessageCategoryToShow(int i) {.swift
this.zza.add(Integer.valueOf(i));.swift
return this;.swift
}.swift
public InAppMessageParams build() {.swift
return new InAppMessageParams(this.zza, (zzcj) null);.swift
}.swift
}.swift
@Retention(RetentionPolicy.SOURCE).swift
public @interface InAppMessageCategoryId {.swift
public static final int TRANSACTIONAL = 2;.swift
public static final int UNKNOWN_IN_APP_MESSAGE_CATEGORY_ID = 0;.swift
}.swift
public /* synthetic */ InAppMessageParams(Set set, zzcj zzcj) {.swift
this.zza = new ArrayList(Collections.unmodifiableList(new ArrayList(set)));.swift
}.swift
public static Builder newBuilder() {.swift
return new Builder();.swift
}.swift
public final ArrayList zza() {.swift
return this.zza;.swift
}.swift
}.swift

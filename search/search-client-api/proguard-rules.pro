# General

-keepparameternames
-keepattributes Signature, InnerClasses, MethodParameters

-keep class com.tomtom.sdk.search.client.*$Companion {
    public <methods>;
    public <fields>;
}

-keep class com.tomtom.sdk.search.client.**$Builder {
    public <methods>;
    public <fields>;
}

# End general

# Packages rules
# Keep all public classes and interfaces in further modules except internal classes/interfaces

-keep class com.tomtom.sdk.search.client.* { *; }

-keep interface com.tomtom.sdk.search.client.* { *; }

-keep class com.tomtom.sdk.search.client.additionaldata.* { *; }

-keep interface com.tomtom.sdk.search.client.additionaldata.* { *; }

-keep class com.tomtom.sdk.search.client.alongroute.* { *; }

-keep interface com.tomtom.sdk.search.client.alongroute.* { *; }

-keep class com.tomtom.sdk.search.client.autocomplete.* { *; }

-keep interface com.tomtom.sdk.search.client.autocomplete.* { *; }

-keep class com.tomtom.sdk.search.client.ev.* { *; }

-keep interface com.tomtom.sdk.search.client.ev.* { *; }

-keep class com.tomtom.sdk.search.client.fuzzy.* { *; }

-keep interface com.tomtom.sdk.search.client.fuzzy.* { *; }

-keep class com.tomtom.sdk.search.client.geometry.* { *; }

-keep interface com.tomtom.sdk.search.client.geometry.* { *; }

-keep class com.tomtom.sdk.search.client.model.** { *; }

-keep class com.tomtom.sdk.search.client.poicategories.* { *; }

-keep interface com.tomtom.sdk.search.client.poicategories.* { *; }

# End packages rules

# Needed to avoid duplicating classes with the same name in one package
-repackageclasses com.tomtom.sdk.search.client.internal

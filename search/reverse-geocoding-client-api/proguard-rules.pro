# General

-keepparameternames
-keepattributes Signature, InnerClasses, MethodParameters

-keep class com.tomtom.sdk.search.reversegeocoding.*$Companion {
    public <methods>;
    public <fields>;
}

-keep class com.tomtom.sdk.search.reversegeocoding.**$Builder {
    public <methods>;
    public <fields>;
}

# End general

# Packages rules
# Keep all public classes and interfaces in further modules except internal classes/interfaces

-keep class com.tomtom.sdk.search.reversegeocoding.* { *; }

-keep interface com.tomtom.sdk.search.reversegeocoding.* { *; }

-keep class com.tomtom.sdk.search.reversegeocoding.model.** { *; }

# End packages rules

# Needed to avoid duplicating classes with the same name in one package
-repackageclasses com.tomtom.sdk.search.reversegeocoding.internal

# General

-keepparameternames
-keepattributes Signature, InnerClasses, MethodParameters

-keep class com.tomtom.sdk.search.common.model.*$Companion {
    public <methods>;
    public <fields>;
}

-keep class com.tomtom.sdk.search.common.model.**$Builder {
    public <methods>;
    public <fields>;
}

# End general

# Packages rules
# Keep all public classes and interfaces in further modules except internal classes/interfaces

-keep class com.tomtom.sdk.search.common.model.* { *; }

-keep interface com.tomtom.sdk.search.common.model.* {
    *;
}

# End packages rules

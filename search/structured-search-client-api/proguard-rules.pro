# Packages rules
# Keep all public classes and interfaces in further modules except internal classes/interfaces
-keep public class com.tomtom.sdk.search.structuredsearch.** { *; }
-keep public interface com.tomtom.sdk.search.structuredsearch.** { *; }
# End packages rules

# Needed to avoid duplicating classes with the same name in one package
-repackageclasses com.tomtom.sdk.search.structuredsearch.internal

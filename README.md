# Groovy NullPointerException from Unhandled Null Return

This example demonstrates a common Groovy issue: returning null from a method without proper handling in calling functions leading to `NullPointerExceptions`.  Groovy's dynamic typing can make null values harder to track.

## The Bug

The `myMethod` returns `null` if either input is `null`. While seemingly harmless, this can cause unexpected `NullPointerExceptions` if the calling code doesn't explicitly check for null.

## The Solution

The solution involves robust null checks throughout your application. Consider either explicitly handling nulls using the elvis operator or  using the `?.` safe-navigation operator to avoid exceptions entirely.  Throwing exceptions or returning a default value are other options, depending on your design.
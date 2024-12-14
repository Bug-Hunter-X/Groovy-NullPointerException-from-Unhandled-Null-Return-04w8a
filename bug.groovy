```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return null //This is problematic. It might lead to unexpected NullPointerExceptions down the line.
  }
  // ... rest of your method
}

// Example usage:
def main() {
  def result = myMethod(1, null)
  println(result) // Prints null
  
  def result2 = myMethod(1,2) * 5 //NullPointerException because result2 is null
  println(result2) 
}
```
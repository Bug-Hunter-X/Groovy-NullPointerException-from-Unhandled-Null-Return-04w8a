```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return 0 // Or throw an exception: throw new IllegalArgumentException("a and b cannot be null")
  }
  // ... rest of your method
  return a + b
}

def main() {
  def result = myMethod(1, null)
  println(result) // Prints 0
  
  def result2 = myMethod(1,2) * 5 
  println(result2) // Prints 15
  
  def result3 = myMethod(null, 2) ?: 10 //Elvis operator handles null
  println(result3) // Prints 10
  
  def result4 = myMethod(1,2)?.times(5) // Safe Navigation Operator handles null
  println(result4) //Prints 15
}
```
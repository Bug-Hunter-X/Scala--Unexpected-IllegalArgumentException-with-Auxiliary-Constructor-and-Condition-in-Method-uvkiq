# Scala Bug: Unexpected IllegalArgumentException

This repository demonstrates a subtle bug in Scala related to auxiliary constructors and conditional logic within methods.  The code includes an auxiliary constructor that initializes a class member to a default value.  However, a method within the class throws an `IllegalArgumentException` if this default value doesn't satisfy an internal condition. This might lead to unexpected exceptions during runtime.

The `bug.scala` file shows the problematic code, while `bugSolution.scala` presents a corrected version.
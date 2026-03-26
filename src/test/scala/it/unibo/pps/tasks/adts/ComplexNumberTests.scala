package it.unibo.pps.tasks.adts

import org.junit.*
import org.junit.Assert.*
import Ex1ComplexNumbers.*

/* Tests should be clear, but note they are expressed independently of the 
   specific implementation  -- UNCOMMENT FOR THE EXERCISE!
*/
class ComplexTest:

  // Choice of implementation to test
  val complexADT: ComplexADT = BasicComplexADT
  import complexADT.*

  // From now, everything is independent of specific implementation of Complex

  @Test def testReal() =
    assertEquals(10, complexNumber(10, 20).re(), 0)

  @Test def testImaginary() =
    assertEquals(20, complexNumber(10, 20).im(), 0)

  @Test def testSum() =
    assertEquals(complexNumber(11, 22), complexNumber(10, 20) sum complexNumber(1, 2))

  @Test def testSubtract() =
    assertEquals(complexNumber(9, 18), complexNumber(10, 20) subtract complexNumber(1, 2))

  @Test def testAsString() =
    assertEquals("10.0 + 5.0i", complexNumber(10.0, 5.0).asString())

  @Test def optionalTestAdvancedAsString() =
    assertEquals("0.0", complexNumber(0, 0).asString())
    assertEquals("10.0", complexNumber(10.0, 0).asString())
    assertEquals("10.0 + 5.0i", complexNumber(10.0, 5.0).asString())
    assertEquals("10.0 - 5.0i", complexNumber(10.0, -5.0).asString())
    assertEquals("5.0i", complexNumber(0, 5.0).asString())
    assertEquals("-5.0i", complexNumber(0, -5.0).asString())

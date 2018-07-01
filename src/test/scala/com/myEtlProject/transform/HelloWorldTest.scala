package com.myEtlProject.transform

import com.myEtlProject.transform.HelloWorld._

class HelloWorldTest extends SparkTest {

  import spark.implicits._

  test("returns Hello World!") {
    main shouldEqual "Hello world!"
  }
}

/**
  * Created by Vivek Malik on 6/22/16.
  *
  * A simple project to test the file handler in twitter-util
  *
  * This test confirms that the File Handler does not do a rollover when log policy is set based on
  * the maximum file size.
  **/

package filehandlertest

import java.util.{logging => javalog}
import com.twitter.conversions.storage._

import com.twitter.logging._

object FileHandlerTest extends App {
  println("Testing Twitter FileHandler for logging")

  val logLevel = Level.INFO
  val fileSizeInMegaBytes: Long = 1
  val record1 = new javalog.LogRecord(logLevel, "Sending stupid message to log bytes")

  val handler = FileHandler(
    filename = "LogDir/test.log",
    rollPolicy = Policy.MaxSize(fileSizeInMegaBytes.megabytes),
    rotateCount = 8,
    append = true,
    formatter = BareFormatter
  ).apply()

  println(s"Publishing ${record1}")
  for (a <- 1 to 10000){
    handler.publish(record1)
  }

}

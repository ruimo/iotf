package com.ruimo.iotf

sealed abstract class TopicPattern {
  case object All extends TopicPattern
  case class Const(s: String)
}

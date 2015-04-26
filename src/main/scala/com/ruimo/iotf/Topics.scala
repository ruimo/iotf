package com.ruimo.iotf

case class EventTopic(
  deviceType: String,
  deviceId: String,
  eventId: String,
  format: String
) {
  val asString: String =
    "iot-2/type/" + deviceType + "/id/" + deviceId + "/evt/" + eventId + "/fmt/" + format
}

object EventTopic {
  def apply(s: String): EventTopic = {
    val split = s.split('/')
    EventTopic(split(2), split(4), split(6), split(8))
  }
}

case class CommandTopic(
  deviceType: String,
  deviceId: String,
  commandId: String,
  format: String
) {
  val asString: String =
    "iot-2/type/" + deviceType + "/id/" + deviceId + "/cmd/" + commandId + "/fmt/" + format
}

object CommanTopic {
  def apply(s: String): CommandTopic = {
    val split = s.split('/')
    CommandTopic(split(2), split(4), split(6), split(8))
  }
}

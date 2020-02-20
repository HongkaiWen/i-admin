package com.github.hongkaiwen.iadmin

import com.github.hongkaiwen.iadmin.core.Action
import com.github.hongkaiwen.iadmin.core.Command
import com.github.hongkaiwen.iadmin.core.CommandType

fun main() {
  var command = Command(CommandType.CALL_API, "curl https://ynuf.alipay.com/service/um.json")
  var action = Action(command)
  println(action.execute().toJSONString())
}

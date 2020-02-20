package com.github.hongkaiwen.iadmin.core

import com.alibaba.fastjson.JSON
import com.alibaba.fastjson.JSONObject
import com.github.hongkaiwen.iadmin.util.NativeCommandUtil

data class Action(val command: Command, val variables: Variables = Variables()) {

  open fun execute(): JSON {
    rebuildCommand()

    return if (command.commandType == CommandType.CALL_API) {
      callApi()
    } else {
      JSONObject()
    }
  }

  fun rebuildCommand(){
    variables.values.forEach {
      command.command = command.command.replace("{{${it.key}}}", it.value)
    }
  }

  fun callApi() : JSON{
    val result = NativeCommandUtil.exec(command.command)
    return JSON.parseObject(result)
  }

}

package com.github.hongkaiwen.iadmin.util

object NativeCommandUtil {

  open fun exec(cmd: String) = Runtime.getRuntime().exec(cmd).inputStream.reader(Charsets.UTF_8).readText()

}

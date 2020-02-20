package com.github.hongkaiwen.iadmin.core

data class ActionPipeline(val actions: ArrayList<Action> = ArrayList()) {

  open fun addAction(action: Action) : ActionPipeline {
    this.actions.add(action)
    return this
  }

}
